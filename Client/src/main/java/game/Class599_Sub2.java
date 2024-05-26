package game;

/* Class599_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class599_Sub2 extends Class599 implements Interface45 {
	int anInt9504;
	float aFloat9505;
	int anInt9506;
	float aFloat9507;

	public float method254(float f) {
		return f / (float) ((Class599_Sub2) this).anInt9506;
	}

	Class599_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(class106_sub3_sub2, 3553, Class171.aClass171_2071, Class88.aClass88_1218, i * i_0_, bool);
		if (!((Class106_Sub3_Sub2) ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856).aBool11111) {
			((Class599_Sub2) this).anInt9504 = HashTable.nextPowerOfTwo(i, 1104569563);
			((Class599_Sub2) this).anInt9506 = HashTable.nextPowerOfTwo(i_0_, 1714697191);
			((Class599_Sub2) this).aFloat9505 = (float) i / (float) ((Class599_Sub2) this).anInt9504;
			((Class599_Sub2) this).aFloat9507 = (float) i_0_ / (float) ((Class599_Sub2) this).anInt9506;
			if (i != ((Class599_Sub2) this).anInt9504 || i_0_ != ((Class599_Sub2) this).anInt9506) {
				is = (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1794(i, i_0_, ((Class599_Sub2) this).anInt9504, ((Class599_Sub2) this).anInt9506, is, i_1_, i_2_, -1681921830));
				i_1_ = 0;
				i_2_ = ((Class599_Sub2) this).anInt9504;
			}
		} else {
			((Class599_Sub2) this).anInt9504 = i;
			((Class599_Sub2) this).anInt9506 = i_0_;
			((Class599_Sub2) this).aFloat9505 = 1.0F;
			((Class599_Sub2) this).aFloat9507 = 1.0F;
		}
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(((Class599_Sub2) this).anInt7858, 0, 6408, ((Class599_Sub2) this).anInt9504, ((Class599_Sub2) this).anInt9506, 0, 32993, ((Class106_Sub3_Sub2) (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856)).anInt11105, is, i_1_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7053(((Class599_Sub2) this).anInt7858, i, i_0_, is);
	}

	Class599_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(class106_sub3_sub2, 3553, class171, Class88.aClass88_1218, i * i_3_, bool);
		if (!((Class106_Sub3_Sub2) ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856).aBool11111) {
			((Class599_Sub2) this).anInt9504 = HashTable.nextPowerOfTwo(i, 805113296);
			((Class599_Sub2) this).anInt9506 = HashTable.nextPowerOfTwo(i_3_, 1505602619);
			((Class599_Sub2) this).aFloat9505 = (float) i / (float) ((Class599_Sub2) this).anInt9504;
			((Class599_Sub2) this).aFloat9507 = (float) i_3_ / (float) ((Class599_Sub2) this).anInt9506;
			if (i != ((Class599_Sub2) this).anInt9504 || i_3_ != ((Class599_Sub2) this).anInt9506) {
				is = (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1796(i, i_3_, ((Class599_Sub2) this).anInt9504, ((Class599_Sub2) this).anInt9506, is, i_4_, i_5_, class171.anInt2074 * 1572594303, (byte) -47));
				i_4_ = 0;
				i_5_ = ((Class599_Sub2) this).anInt9504;
			}
		} else {
			((Class599_Sub2) this).anInt9504 = i;
			((Class599_Sub2) this).anInt9506 = i_3_;
			((Class599_Sub2) this).aFloat9505 = 1.0F;
			((Class599_Sub2) this).aFloat9507 = 1.0F;
		}
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_5_ != 0 || i_4_ != 0) {
			OpenGL.glPixelStorei(3314, i_5_);
			if (((Class599_Sub2) this).aClass171_7859 == Class171.aClass171_2063)
				OpenGL.glCompressedTexImage2Dub((((Class599_Sub2) this).anInt7858), 0, 33777, i, i_3_, 0, i * i_3_ / 2, is, i_4_);
			else if (((Class599_Sub2) this).aClass171_7859 == Class171.aClass171_2072)
				OpenGL.glCompressedTexImage2Dub((((Class599_Sub2) this).anInt7858), 0, 33779, i, i_3_, 0, i * i_3_, is, i_4_);
			else
				OpenGL.glTexImage2Dub(((Class599_Sub2) this).anInt7858, 0, Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853)), i, i_3_, 0, Class106_Sub3_Sub2.method10117(((Class599_Sub2) this).aClass171_7859), 5121, is, i_4_);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7056(((Class599_Sub2) this).anInt7858, i, i_3_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class599_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, int i, int i_6_, boolean bool, float[] fs, int i_7_, int i_8_) {
		super(class106_sub3_sub2, 3553, class171, Class88.aClass88_1213, i * i_6_, bool);
		if (!((Class106_Sub3_Sub2) ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856).aBool11111) {
			((Class599_Sub2) this).anInt9504 = HashTable.nextPowerOfTwo(i, 608875121);
			((Class599_Sub2) this).anInt9506 = HashTable.nextPowerOfTwo(i_6_, 480432256);
			((Class599_Sub2) this).aFloat9505 = (float) i / (float) ((Class599_Sub2) this).anInt9504;
			((Class599_Sub2) this).aFloat9507 = (float) i_6_ / (float) ((Class599_Sub2) this).anInt9506;
			if (i != ((Class599_Sub2) this).anInt9504 || i_6_ != ((Class599_Sub2) this).anInt9506) {
				fs = (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1795(i, i_6_, ((Class599_Sub2) this).anInt9504, ((Class599_Sub2) this).anInt9506, fs, i_7_, i_8_, class171.anInt2074 * 1572594303, 1393294723));
				i_7_ = 0;
				i_8_ = ((Class599_Sub2) this).anInt9504;
			}
		} else {
			((Class599_Sub2) this).anInt9504 = i;
			((Class599_Sub2) this).anInt9506 = i_6_;
			((Class599_Sub2) this).aFloat9505 = 1.0F;
			((Class599_Sub2) this).aFloat9507 = 1.0F;
		}
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		if (!bool || i_8_ != 0 || i_7_ != 0) {
			OpenGL.glPixelStorei(3314, i_8_);
			OpenGL.glTexImage2Df(((Class599_Sub2) this).anInt7858, 0, Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853)), i, i_6_, 0, Class106_Sub3_Sub2.method10117(((Class599_Sub2) this).aClass171_7859), 5126, fs, i_7_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method7050(((Class599_Sub2) this).anInt7858, i, i_6_, fs);
	}

	public int method251() {
		return ((Class599_Sub2) this).anInt9506;
	}

	public int method41() {
		return ((Class599_Sub2) this).anInt9506;
	}

	public float method226(float f) {
		return f / (float) ((Class599_Sub2) this).anInt9504;
	}

	public float method224(float f) {
		return f / (float) ((Class599_Sub2) this).anInt9506;
	}

	public float method235() {
		return ((Class599_Sub2) this).aFloat9505;
	}

	public float method257() {
		return ((Class599_Sub2) this).aFloat9507;
	}

	public void method246(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		Class104 class104 = ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1683(-679185902);
		if (class104 != null) {
			int i_14_ = class104.method1646() - (i_13_ + i_11_);
			int i_15_ = Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853));
			OpenGL.glCopyTexImage2D(((Class599_Sub2) this).anInt7858, 0, i_15_, i_12_, i_14_, i_10_, i_11_, 0);
		}
	}

	public void method253(boolean bool, boolean bool_16_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glTexParameteri(((Class599_Sub2) this).anInt7858, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class599_Sub2) this).anInt7858, 10243, bool_16_ ? 10497 : 33071);
	}

	public void method230(int i, int i_17_, int i_18_, int i_19_, int[] is, int i_20_, int i_21_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3314, i_21_);
		OpenGL.glTexSubImage2Di(((Class599_Sub2) this).anInt7858, 0, i, i_17_, i_18_, i_19_, 32993, ((Class106_Sub3_Sub2) (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856)).anInt11105, is, i_20_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method244(boolean bool, boolean bool_22_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glTexParameteri(((Class599_Sub2) this).anInt7858, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class599_Sub2) this).anInt7858, 10243, bool_22_ ? 10497 : 33071);
	}

	public void method232(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		method233(i, i_23_, i_24_, i_25_, is, null, i_26_);
	}

	public void method233(int i, int i_27_, int i_28_, int i_29_, int[] is, int[] is_30_, int i_31_) {
		int[] is_32_ = (is_30_ == null ? new int[(((Class599_Sub2) this).anInt9504 * ((Class599_Sub2) this).anInt9506)] : is_30_);
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glGetTexImagei(((Class599_Sub2) this).anInt7858, 0, 32993, 5121, is_32_, 0);
		for (int i_33_ = 0; i_33_ < i_29_; i_33_++)
			System.arraycopy(is_32_, i_33_ * ((Class599_Sub2) this).anInt9504, is, i_31_ + i_33_ * i_28_, i_28_);
	}

	public void method247(int i, int i_34_, int i_35_, int i_36_, int[] is, int i_37_) {
		method233(i, i_34_, i_35_, i_36_, is, null, i_37_);
	}

	public float method250() {
		return ((Class599_Sub2) this).aFloat9505;
	}

	public boolean method237() {
		return super.method237();
	}

	public int method236() {
		return ((Class599_Sub2) this).anInt9504;
	}

	public void method204() {
		super.method202();
	}

	public void method39() {
		super.method39();
	}

	public void method38() {
		super.method39();
	}

	public void method206() {
		super.method202();
	}

	public int method159() {
		return ((Class599_Sub2) this).anInt9504;
	}

	public boolean method238() {
		return super.method237();
	}

	public float method240(float f) {
		return f / (float) ((Class599_Sub2) this).anInt9504;
	}

	public boolean method231() {
		return true;
	}

	public boolean method242() {
		return true;
	}

	public void method203(Class367 class367) {
		super.method203(class367);
	}

	public Interface6 method260(int i) {
		return new Class606(this, i);
	}

	public void method245(int i, int i_38_, int i_39_, int i_40_, int[] is, int i_41_, int i_42_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3314, i_42_);
		OpenGL.glTexSubImage2Di(((Class599_Sub2) this).anInt7858, 0, i, i_38_, i_39_, i_40_, 32993, ((Class106_Sub3_Sub2) (((Class599_Sub2) this).aClass106_Sub3_Sub2_7856)).anInt11105, is, i_41_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method202() {
		super.method202();
	}

	public boolean method228() {
		return true;
	}

	public void method248(int i, int i_43_, int i_44_, int i_45_, int[] is, int i_46_) {
		method233(i, i_43_, i_44_, i_45_, is, null, i_46_);
	}

	public void method249(int i, int i_47_, int i_48_, int i_49_, int[] is, int[] is_50_, int i_51_) {
		int[] is_52_ = (is_50_ == null ? new int[(((Class599_Sub2) this).anInt9504 * ((Class599_Sub2) this).anInt9506)] : is_50_);
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glGetTexImagei(((Class599_Sub2) this).anInt7858, 0, 32993, 5121, is_52_, 0);
		for (int i_53_ = 0; i_53_ < i_49_; i_53_++)
			System.arraycopy(is_52_, i_53_ * ((Class599_Sub2) this).anInt9504, is, i_51_ + i_53_ * i_48_, i_48_);
	}

	public void method225(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_) {
		method233(i, i_54_, i_55_, i_56_, is, null, i_57_);
	}

	public float method239() {
		return ((Class599_Sub2) this).aFloat9505;
	}

	public void method255(int i, int i_58_, int i_59_, int i_60_, byte[] is, Class171 class171, int i_61_, int i_62_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_62_);
		OpenGL.glTexSubImage2Dub(((Class599_Sub2) this).anInt7858, 0, i, i_58_, i_59_, i_60_, Class106_Sub3_Sub2.method10117(class171), 5121, is, i_61_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method252() {
		return ((Class599_Sub2) this).aFloat9507;
	}

	public boolean method234() {
		return super.method237();
	}

	Class599_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Class171 class171, Class88 class88, int i, int i_63_) {
		super(class106_sub3_sub2, 3553, class171, class88, i * i_63_, false);
		if (!((Class106_Sub3_Sub2) ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856).aBool11111) {
			((Class599_Sub2) this).anInt9504 = HashTable.nextPowerOfTwo(i, 1653741104);
			((Class599_Sub2) this).anInt9506 = HashTable.nextPowerOfTwo(i_63_, 552510944);
			((Class599_Sub2) this).aFloat9505 = (float) i / (float) ((Class599_Sub2) this).anInt9504;
			((Class599_Sub2) this).aFloat9507 = (float) i_63_ / (float) ((Class599_Sub2) this).anInt9506;
		} else {
			((Class599_Sub2) this).anInt9504 = i;
			((Class599_Sub2) this).anInt9506 = i_63_;
			((Class599_Sub2) this).aFloat9505 = 1.0F;
			((Class599_Sub2) this).aFloat9507 = 1.0F;
		}
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glTexImage2Dub(((Class599_Sub2) this).anInt7858, 0, Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853)), i, i_63_, 0, Class106_Sub3_Sub2.method10117(((Class599_Sub2) this).aClass171_7859), Class106_Sub3_Sub2.method10122(((Class599_Sub2) this).aClass88_7853), null, 0);
	}

	public boolean method243() {
		return true;
	}

	public void method205() {
		super.method202();
	}

	public float method229() {
		return ((Class599_Sub2) this).aFloat9507;
	}

	public void method201(Class367 class367) {
		super.method203(class367);
	}

	public void method207(Class367 class367) {
		super.method203(class367);
	}

	public Interface6 method261(int i) {
		return new Class606(this, i);
	}

	public int method42() {
		return ((Class599_Sub2) this).anInt9504;
	}

	public void method227(int i, int i_64_, int i_65_, int i_66_, byte[] is, Class171 class171, int i_67_, int i_68_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_68_);
		OpenGL.glTexSubImage2Dub(((Class599_Sub2) this).anInt7858, 0, i, i_64_, i_65_, i_66_, Class106_Sub3_Sub2.method10117(class171), 5121, is, i_67_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method256(int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		Class104 class104 = ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1683(33714822);
		if (class104 != null) {
			int i_74_ = class104.method1646() - (i_73_ + i_71_);
			int i_75_ = Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853));
			OpenGL.glCopyTexImage2D(((Class599_Sub2) this).anInt7858, 0, i_75_, i_72_, i_74_, i_70_, i_71_, 0);
		}
	}

	public void method241(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method9659(this);
		Class104 class104 = ((Class599_Sub2) this).aClass106_Sub3_Sub2_7856.method1683(1599816009);
		if (class104 != null) {
			int i_81_ = class104.method1646() - (i_80_ + i_78_);
			int i_82_ = Class106_Sub3_Sub2.method10118((((Class599_Sub2) this).aClass171_7859), (((Class599_Sub2) this).aClass88_7853));
			OpenGL.glCopyTexImage2D(((Class599_Sub2) this).anInt7858, 0, i_82_, i_79_, i_81_, i_77_, i_78_, 0);
		}
	}
}
