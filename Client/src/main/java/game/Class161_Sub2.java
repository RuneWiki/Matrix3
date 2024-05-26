package game;

/* Class161_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class161_Sub2 extends Class161 {
	int anInt10907;
	Class106_Sub1 aClass106_Sub1_10908;
	Class155_Sub4_Sub1 aClass155_Sub4_Sub1_10909;
	int anInt10910 = 0;
	boolean aBool10911 = false;
	int anInt10912 = 0;
	int anInt10913 = 0;
	int anInt10914 = 0;
	Class155_Sub4_Sub1 aClass155_Sub4_Sub1_10915;

	public void method2586(int i, int i_0_, int i_1_, int i_2_) {
		((Class161_Sub2) this).anInt10913 = i;
		((Class161_Sub2) this).anInt10912 = i_0_;
		((Class161_Sub2) this).anInt10907 = i_1_;
		((Class161_Sub2) this).anInt10914 = i_2_;
		((Class161_Sub2) this).aBool10911 = (((Class161_Sub2) this).anInt10913 != 0 || ((Class161_Sub2) this).anInt10912 != 0 || ((Class161_Sub2) this).anInt10907 != 0 || ((Class161_Sub2) this).anInt10914 != 0);
	}

	void method2608(float f, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i, int i_8_, int i_9_, int i_10_) {
		if (((Class161_Sub2) this).aBool10911) {
			float f_11_ = (float) method45();
			float f_12_ = (float) method2589();
			float f_13_ = (f_4_ - f) / f_11_;
			float f_14_ = (f_5_ - f_3_) / f_11_;
			float f_15_ = (f_6_ - f) / f_12_;
			float f_16_ = (f_7_ - f_3_) / f_12_;
			float f_17_ = f_15_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_18_ = f_16_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_19_ = f_13_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_20_ = f_14_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_21_ = -f_13_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_22_ = -f_14_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_23_ = -f_15_ * (float) ((Class161_Sub2) this).anInt10914;
			float f_24_ = -f_16_ * (float) ((Class161_Sub2) this).anInt10914;
			f = f + f_19_ + f_17_;
			f_3_ = f_3_ + f_20_ + f_18_;
			f_4_ = f_4_ + f_21_ + f_17_;
			f_5_ = f_5_ + f_22_ + f_18_;
			f_6_ = f_6_ + f_19_ + f_23_;
			f_7_ = f_7_ + f_20_ + f_24_;
		}
		float f_25_ = f_6_ + (f_4_ - f);
		float f_26_ = f_5_ + (f_7_ - f_3_);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_10_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_9_);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i);
		OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_, (byte) (i_8_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231));
		OpenGL.glVertex2f(f, f_3_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_6_, f_7_);
		OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234), 0.0F);
		OpenGL.glVertex2f(f_25_, f_26_);
		OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234), (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231));
		OpenGL.glVertex2f(f_4_, f_5_);
		OpenGL.glEnd();
	}

	Class161_Sub2(Class106_Sub1 class106_sub1, int i, int i_27_, int[] is, int i_28_, int i_29_) {
		((Class161_Sub2) this).anInt10907 = 0;
		((Class161_Sub2) this).aClass106_Sub1_10908 = class106_sub1;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915 = Class155_Sub4_Sub1.method10177(class106_sub1, i, i_27_, false, is, i_29_, i_28_);
	}

	public void method2628(int i, int i_30_, int i_31_, int i_32_) {
		((Class161_Sub2) this).anInt10913 = i;
		((Class161_Sub2) this).anInt10912 = i_30_;
		((Class161_Sub2) this).anInt10907 = i_31_;
		((Class161_Sub2) this).anInt10914 = i_32_;
		((Class161_Sub2) this).aBool10911 = (((Class161_Sub2) this).anInt10913 != 0 || ((Class161_Sub2) this).anInt10912 != 0 || ((Class161_Sub2) this).anInt10907 != 0 || ((Class161_Sub2) this).anInt10914 != 0);
	}

	public void method2649(int[] is) {
		is[0] = ((Class161_Sub2) this).anInt10913;
		is[1] = ((Class161_Sub2) this).anInt10912;
		is[2] = ((Class161_Sub2) this).anInt10907;
		is[3] = ((Class161_Sub2) this).anInt10914;
	}

	public int method2587() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
	}

	public int method45() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236 + ((Class161_Sub2) this).anInt10913 + ((Class161_Sub2) this).anInt10907);
	}

	public int method2634() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
	}

	public int method2589() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232 + ((Class161_Sub2) this).anInt10912 + ((Class161_Sub2) this).anInt10914);
	}

	public Interface6 method2590() {
		return ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9201(0);
	}

	public void method2607(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		method10046(i, i_33_, i_34_, i_35_, i_36_, i_37_, false);
	}

	public void method2596(int i, int i_38_, Class167 class167, int i_39_, int i_40_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(class155_sub4_sub1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(7681, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(1);
		i += ((Class161_Sub2) this).anInt10913;
		i_38_ += ((Class161_Sub2) this).anInt10912;
		int i_41_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
		int i_42_ = i_38_ + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_43_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_44_ = (float) (i - i_39_) * f;
		float f_45_ = (float) (i_41_ - i_39_) * f;
		float f_46_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_38_ - i_40_) * f_43_);
		float f_47_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_42_ - i_40_) * f_43_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_44_, f_46_);
		OpenGL.glVertex2i(i, i_38_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_44_, f_47_);
		OpenGL.glVertex2i(i, i_38_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_45_, f_47_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_38_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_45_, f_46_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_38_);
		OpenGL.glEnd();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 5890, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
	}

	public int method2647() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
	}

	public void method2591(int i, int i_48_, int i_49_, int i_50_, int[] is, int i_51_, int i_52_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9197(i, i_48_, i_49_, i_50_, is, i_51_, i_52_, true);
	}

	public void method2592(int i, int i_53_, int i_54_, int i_55_, int[] is, int[] is_56_, int i_57_, int i_58_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9198(i, i_53_, i_54_, i_55_, is, is_56_, i_57_);
	}

	void method10043(int i) {
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(((Class161_Sub2) this).aClass106_Sub1_10908.method9379(i), 7681);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34167, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9424(0, 34168, 770);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10909);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(34479, 7681);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34166, 768);
		if (((Class161_Sub2) this).anInt10910 == 0)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 1)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 2)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 3)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method10044() {
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(8448, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9424(0, 5890, 770);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
	}

	public void method2627(int i, int i_59_, int i_60_, int i_61_, int[] is, int i_62_, int i_63_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9197(i, i_59_, i_60_, i_61_, is, i_62_, i_63_, true);
	}

	public void method2585(int[] is) {
		is[0] = ((Class161_Sub2) this).anInt10913;
		is[1] = ((Class161_Sub2) this).anInt10912;
		is[2] = ((Class161_Sub2) this).anInt10907;
		is[3] = ((Class161_Sub2) this).anInt10914;
	}

	void method2599(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_70_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_69_);
		OpenGL.glColor4ub((byte) (i_68_ >> 16), (byte) (i_68_ >> 8), (byte) i_68_, (byte) (i_68_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_65_ / (float) method45();
			float f_71_ = (float) i_66_ / (float) method2589();
			float f_72_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_73_ = ((float) i_64_ + (float) ((Class161_Sub2) this).anInt10912 * f_71_);
			float f_74_ = f_72_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_75_ = f_73_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_71_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_67_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_72_, f_73_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_72_, f_75_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_74_, f_75_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_74_, f_73_);
				OpenGL.glEnd();
			} else {
				method10043(i_67_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_72_, f_73_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_72_, f_75_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_74_, f_75_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_74_, f_73_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_67_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_64_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_64_ + i_66_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_65_, i_64_ + i_66_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_65_, i_64_);
			OpenGL.glEnd();
		} else {
			method10043(i_67_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_64_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_64_ + i_66_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_65_, i_64_ + i_66_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_65_, i_64_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public void method2630(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		int i_82_ = i + i_77_;
		int i_83_ = i_76_ + i_78_;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_81_);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_79_);
		OpenGL.glColor4ub((byte) (i_80_ >> 16), (byte) (i_80_ >> 8), (byte) i_80_, (byte) (i_80_ >> 24));
		if (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aBool11235 && !((Class161_Sub2) this).aBool10911 && i_78_ >= (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232) && i_77_ >= (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236)) {
			float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231) * (float) i_78_ / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
			float f_84_ = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) i_77_ / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_76_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_83_);
			OpenGL.glTexCoord2f(f_84_, 0.0F);
			OpenGL.glVertex2i(i_82_, i_83_);
			OpenGL.glTexCoord2f(f_84_, f);
			OpenGL.glVertex2i(i_82_, i_76_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class161_Sub2) this).anInt10913, (float) ((Class161_Sub2) this).anInt10912, 0.0F);
			int i_85_ = method45();
			int i_86_ = method2589();
			int i_87_ = i_76_ + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
			OpenGL.glBegin(7);
			int i_88_ = i_76_;
			for (/**/; i_87_ <= i_83_; i_87_ += i_86_) {
				int i_89_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
				int i_90_ = i;
				while (i_89_ <= i_82_) {
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_90_, i_88_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_90_, i_87_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
					OpenGL.glVertex2i(i_89_, i_87_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_89_, i_88_);
					i_89_ += i_85_;
					i_90_ += i_85_;
				}
				if (i_90_ < i_82_) {
					float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) (i_82_ - i_90_) / (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236));
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_90_, i_88_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_90_, i_87_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_82_, i_87_);
					OpenGL.glTexCoord2f(f, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_82_, i_88_);
				}
				i_88_ += i_86_;
			}
			if (i_88_ < i_83_) {
				float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231) * (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232 - (i_83_ - i_88_)) / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
				int i_91_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
				int i_92_ = i;
				while (i_91_ <= i_82_) {
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_92_, i_88_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_92_, i_83_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), f);
					OpenGL.glVertex2i(i_91_, i_83_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_91_, i_88_);
					i_91_ += i_85_;
					i_92_ += i_85_;
				}
				if (i_92_ < i_82_) {
					float f_93_ = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) (i_82_ - i_92_) / (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236));
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_92_, i_88_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_92_, i_83_);
					OpenGL.glTexCoord2f(f_93_, f);
					OpenGL.glVertex2i(i_82_, i_83_);
					OpenGL.glTexCoord2f(f_93_, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_82_, i_88_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method2640(float f, float f_94_, float f_95_, float f_96_, float f_97_, float f_98_, int i, Class167 class167, int i_99_, int i_100_) {
		Class155_Sub4_Sub1 class155_sub4_sub1 = (((Class167_Sub2) (Class167_Sub2) class167).aClass155_Sub4_Sub1_10916);
		if (((Class161_Sub2) this).aBool10911) {
			float f_101_ = (float) method45();
			float f_102_ = (float) method2589();
			float f_103_ = (f_95_ - f) / f_101_;
			float f_104_ = (f_96_ - f_94_) / f_101_;
			float f_105_ = (f_97_ - f) / f_102_;
			float f_106_ = (f_98_ - f_94_) / f_102_;
			float f_107_ = f_105_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_108_ = f_106_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_109_ = f_103_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_110_ = f_104_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_111_ = -f_103_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_112_ = -f_104_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_113_ = -f_105_ * (float) ((Class161_Sub2) this).anInt10914;
			float f_114_ = -f_106_ * (float) ((Class161_Sub2) this).anInt10914;
			f = f + f_109_ + f_107_;
			f_94_ = f_94_ + f_110_ + f_108_;
			f_95_ = f_95_ + f_111_ + f_107_;
			f_96_ = f_96_ + f_112_ + f_108_;
			f_97_ = f_97_ + f_109_ + f_113_;
			f_98_ = f_98_ + f_110_ + f_114_;
		}
		float f_115_ = f_97_ + (f_95_ - f);
		float f_116_ = f_96_ + (f_98_ - f_94_);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(class155_sub4_sub1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(7681, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(1);
		float f_117_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_118_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_117_ * (f - (float) i_99_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_118_ * (f_94_ - (float) i_100_)));
		OpenGL.glVertex2f(f, f_94_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_117_ * (f_97_ - (float) i_99_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_118_ * (f_98_ - (float) i_100_)));
		OpenGL.glVertex2f(f_97_, f_98_);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_117_ * (f_115_ - (float) i_99_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_118_ * (f_116_ - (float) i_100_)));
		OpenGL.glVertex2f(f_115_, f_116_);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_117_ * (f_95_ - (float) i_99_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_118_ * (f_96_ - (float) i_100_)));
		OpenGL.glVertex2f(f_95_, f_96_);
		OpenGL.glEnd();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 5890, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
	}

	void method2610(float f, float f_119_, float f_120_, float f_121_, float f_122_, float f_123_, int i, Class167 class167, int i_124_, int i_125_) {
		Class155_Sub4_Sub1 class155_sub4_sub1 = (((Class167_Sub2) (Class167_Sub2) class167).aClass155_Sub4_Sub1_10916);
		if (((Class161_Sub2) this).aBool10911) {
			float f_126_ = (float) method45();
			float f_127_ = (float) method2589();
			float f_128_ = (f_120_ - f) / f_126_;
			float f_129_ = (f_121_ - f_119_) / f_126_;
			float f_130_ = (f_122_ - f) / f_127_;
			float f_131_ = (f_123_ - f_119_) / f_127_;
			float f_132_ = f_130_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_133_ = f_131_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_134_ = f_128_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_135_ = f_129_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_136_ = -f_128_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_137_ = -f_129_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_138_ = -f_130_ * (float) ((Class161_Sub2) this).anInt10914;
			float f_139_ = -f_131_ * (float) ((Class161_Sub2) this).anInt10914;
			f = f + f_134_ + f_132_;
			f_119_ = f_119_ + f_135_ + f_133_;
			f_120_ = f_120_ + f_136_ + f_132_;
			f_121_ = f_121_ + f_137_ + f_133_;
			f_122_ = f_122_ + f_134_ + f_138_;
			f_123_ = f_123_ + f_135_ + f_139_;
		}
		float f_140_ = f_122_ + (f_120_ - f);
		float f_141_ = f_121_ + (f_123_ - f_119_);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(class155_sub4_sub1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(7681, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(1);
		float f_142_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_143_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_142_ * (f - (float) i_124_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_143_ * (f_119_ - (float) i_125_)));
		OpenGL.glVertex2f(f, f_119_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_122_ - (float) i_124_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_143_ * (f_123_ - (float) i_125_)));
		OpenGL.glVertex2f(f_122_, f_123_);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_140_ - (float) i_124_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_143_ * (f_141_ - (float) i_125_)));
		OpenGL.glVertex2f(f_140_, f_141_);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_142_ * (f_120_ - (float) i_124_), ((((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231) - f_143_ * (f_121_ - (float) i_125_)));
		OpenGL.glVertex2f(f_120_, f_121_);
		OpenGL.glEnd();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 5890, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
	}

	public void method2611(int i, int i_144_, int i_145_, int i_146_, int[] is, int[] is_147_, int i_148_, int i_149_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9198(i, i_144_, i_145_, i_146_, is, is_147_, i_148_);
	}

	public void method2612(int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		method10046(i, i_150_, i_151_, i_152_, i_153_, i_154_, false);
	}

	public void method2613(int i, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_) {
		method10046(i, i_155_, i_156_, i_157_, i_158_, i_159_, false);
	}

	public void method2601(int i, int i_160_, int i_161_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 = (Class155_Sub4_Sub1.method10179(((Class161_Sub2) this).aClass106_Sub1_10908, i, i_160_, ((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236, (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232)));
		((Class161_Sub2) this).anInt10910 = i_161_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method2625(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_168_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_167_);
		OpenGL.glColor4ub((byte) (i_166_ >> 16), (byte) (i_166_ >> 8), (byte) i_166_, (byte) (i_166_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_163_ / (float) method45();
			float f_169_ = (float) i_164_ / (float) method2589();
			float f_170_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_171_ = ((float) i_162_ + (float) ((Class161_Sub2) this).anInt10912 * f_169_);
			float f_172_ = f_170_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_173_ = f_171_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_169_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_165_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_170_, f_171_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_170_, f_173_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_172_, f_173_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_172_, f_171_);
				OpenGL.glEnd();
			} else {
				method10043(i_165_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_170_, f_171_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_170_, f_173_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_172_, f_173_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_172_, f_171_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_165_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_162_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_162_ + i_164_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_163_, i_162_ + i_164_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_163_, i_162_);
			OpenGL.glEnd();
		} else {
			method10043(i_165_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_162_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_162_ + i_164_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_163_, i_162_ + i_164_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_163_, i_162_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public Interface6 method2616() {
		return ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9201(0);
	}

	public int method2632() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
	}

	void method2606(float f, float f_174_, float f_175_, float f_176_, float f_177_, float f_178_, int i, int i_179_, int i_180_, int i_181_) {
		if (((Class161_Sub2) this).aBool10911) {
			float f_182_ = (float) method45();
			float f_183_ = (float) method2589();
			float f_184_ = (f_175_ - f) / f_182_;
			float f_185_ = (f_176_ - f_174_) / f_182_;
			float f_186_ = (f_177_ - f) / f_183_;
			float f_187_ = (f_178_ - f_174_) / f_183_;
			float f_188_ = f_186_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_189_ = f_187_ * (float) ((Class161_Sub2) this).anInt10912;
			float f_190_ = f_184_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_191_ = f_185_ * (float) ((Class161_Sub2) this).anInt10913;
			float f_192_ = -f_184_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_193_ = -f_185_ * (float) ((Class161_Sub2) this).anInt10907;
			float f_194_ = -f_186_ * (float) ((Class161_Sub2) this).anInt10914;
			float f_195_ = -f_187_ * (float) ((Class161_Sub2) this).anInt10914;
			f = f + f_190_ + f_188_;
			f_174_ = f_174_ + f_191_ + f_189_;
			f_175_ = f_175_ + f_192_ + f_188_;
			f_176_ = f_176_ + f_193_ + f_189_;
			f_177_ = f_177_ + f_190_ + f_194_;
			f_178_ = f_178_ + f_191_ + f_195_;
		}
		float f_196_ = f_177_ + (f_175_ - f);
		float f_197_ = f_176_ + (f_178_ - f_174_);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_181_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_180_);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i);
		OpenGL.glColor4ub((byte) (i_179_ >> 16), (byte) (i_179_ >> 8), (byte) i_179_, (byte) (i_179_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231));
		OpenGL.glVertex2f(f, f_174_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_177_, f_178_);
		OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234), 0.0F);
		OpenGL.glVertex2f(f_196_, f_197_);
		OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234), (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231));
		OpenGL.glVertex2f(f_175_, f_176_);
		OpenGL.glEnd();
	}

	public void method2615(int i, int i_198_, int i_199_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 = (Class155_Sub4_Sub1.method10179(((Class161_Sub2) this).aClass106_Sub1_10908, i, i_198_, ((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236, (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232)));
		((Class161_Sub2) this).anInt10910 = i_199_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method2618(int i, int i_200_, int i_201_, int i_202_, int i_203_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_203_);
		OpenGL.glColor4ub((byte) (i_202_ >> 16), (byte) (i_202_ >> 8), (byte) i_202_, (byte) (i_202_ >> 24));
		i += ((Class161_Sub2) this).anInt10913;
		i_200_ += ((Class161_Sub2) this).anInt10912;
		if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_201_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_200_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_200_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_200_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_200_);
			OpenGL.glEnd();
		} else {
			method10043(i_201_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_200_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_200_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_200_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_200_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public void method2644(int i, int i_204_, int i_205_, int i_206_, int i_207_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_207_);
		OpenGL.glColor4ub((byte) (i_206_ >> 16), (byte) (i_206_ >> 8), (byte) i_206_, (byte) (i_206_ >> 24));
		i += ((Class161_Sub2) this).anInt10913;
		i_204_ += ((Class161_Sub2) this).anInt10912;
		if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_205_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_204_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_204_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_204_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_204_);
			OpenGL.glEnd();
		} else {
			method10043(i_205_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_204_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_204_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_204_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_204_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public void method2620(int i, int i_208_, Class167 class167, int i_209_, int i_210_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(class155_sub4_sub1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(7681, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(1);
		i += ((Class161_Sub2) this).anInt10913;
		i_208_ += ((Class161_Sub2) this).anInt10912;
		int i_211_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
		int i_212_ = i_208_ + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_213_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_214_ = (float) (i - i_209_) * f;
		float f_215_ = (float) (i_211_ - i_209_) * f;
		float f_216_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_208_ - i_210_) * f_213_);
		float f_217_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_212_ - i_210_) * f_213_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_214_, f_216_);
		OpenGL.glVertex2i(i, i_208_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_214_, f_217_);
		OpenGL.glVertex2i(i, i_208_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_215_, f_217_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_208_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_215_, f_216_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_208_);
		OpenGL.glEnd();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 5890, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
	}

	public void method2626(int i, int i_218_, Class167 class167, int i_219_, int i_220_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(class155_sub4_sub1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(7681, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(1);
		i += ((Class161_Sub2) this).anInt10913;
		i_218_ += ((Class161_Sub2) this).anInt10912;
		int i_221_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
		int i_222_ = i_218_ + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_223_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_224_ = (float) (i - i_219_) * f;
		float f_225_ = (float) (i_221_ - i_219_) * f;
		float f_226_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_218_ - i_220_) * f_223_);
		float f_227_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 - (float) (i_222_ - i_220_) * f_223_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_224_, f_226_);
		OpenGL.glVertex2i(i, i_218_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_224_, f_227_);
		OpenGL.glVertex2i(i, i_218_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_225_, f_227_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_218_ + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
		OpenGL.glMultiTexCoord2f(33984, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
		OpenGL.glMultiTexCoord2f(33985, f_225_, f_226_);
		OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_218_);
		OpenGL.glEnd();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(0, 5890, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
	}

	void method10045() {
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(8448, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9424(0, 5890, 770);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
	}

	void method2623(int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_234_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_233_);
		OpenGL.glColor4ub((byte) (i_232_ >> 16), (byte) (i_232_ >> 8), (byte) i_232_, (byte) (i_232_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_229_ / (float) method45();
			float f_235_ = (float) i_230_ / (float) method2589();
			float f_236_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_237_ = ((float) i_228_ + (float) ((Class161_Sub2) this).anInt10912 * f_235_);
			float f_238_ = f_236_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_239_ = f_237_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_235_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_231_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_236_, f_237_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_236_, f_239_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_238_, f_239_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_238_, f_237_);
				OpenGL.glEnd();
			} else {
				method10043(i_231_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_236_, f_237_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_236_, f_239_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_238_, f_239_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_238_, f_237_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_231_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_228_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_228_ + i_230_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_229_, i_228_ + i_230_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_229_, i_228_);
			OpenGL.glEnd();
		} else {
			method10043(i_231_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_228_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_228_ + i_230_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_229_, i_228_ + i_230_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_229_, i_228_);
			OpenGL.glEnd();
			method10044();
		}
	}

	void method2624(int i, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_246_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_245_);
		OpenGL.glColor4ub((byte) (i_244_ >> 16), (byte) (i_244_ >> 8), (byte) i_244_, (byte) (i_244_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_241_ / (float) method45();
			float f_247_ = (float) i_242_ / (float) method2589();
			float f_248_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_249_ = ((float) i_240_ + (float) ((Class161_Sub2) this).anInt10912 * f_247_);
			float f_250_ = f_248_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_251_ = f_249_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_247_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_243_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_248_, f_249_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_248_, f_251_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_250_, f_251_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_250_, f_249_);
				OpenGL.glEnd();
			} else {
				method10043(i_243_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_248_, f_249_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_248_, f_251_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_250_, f_251_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_250_, f_249_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_243_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_240_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_240_ + i_242_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_241_, i_240_ + i_242_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_241_, i_240_);
			OpenGL.glEnd();
		} else {
			method10043(i_243_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_240_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_240_ + i_242_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_241_, i_240_ + i_242_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_241_, i_240_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public void method2619(int i, int i_252_, int i_253_, int i_254_, int i_255_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_255_);
		OpenGL.glColor4ub((byte) (i_254_ >> 16), (byte) (i_254_ >> 8), (byte) i_254_, (byte) (i_254_ >> 24));
		i += ((Class161_Sub2) this).anInt10913;
		i_252_ += ((Class161_Sub2) this).anInt10912;
		if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_253_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_252_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_252_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_252_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_252_);
			OpenGL.glEnd();
		} else {
			method10043(i_253_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_252_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_252_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_252_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_252_);
			OpenGL.glEnd();
			method10044();
		}
	}

	void method2593(int i, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_262_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_261_);
		OpenGL.glColor4ub((byte) (i_260_ >> 16), (byte) (i_260_ >> 8), (byte) i_260_, (byte) (i_260_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_257_ / (float) method45();
			float f_263_ = (float) i_258_ / (float) method2589();
			float f_264_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_265_ = ((float) i_256_ + (float) ((Class161_Sub2) this).anInt10912 * f_263_);
			float f_266_ = f_264_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_267_ = f_265_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_263_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_259_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_264_, f_265_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_264_, f_267_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_266_, f_267_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_266_, f_265_);
				OpenGL.glEnd();
			} else {
				method10043(i_259_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_264_, f_265_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_264_, f_267_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_266_, f_267_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_266_, f_265_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_259_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_256_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_256_ + i_258_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_257_, i_256_ + i_258_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_257_, i_256_);
			OpenGL.glEnd();
		} else {
			method10043(i_259_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_256_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_256_ + i_258_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_257_, i_256_ + i_258_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_257_, i_256_);
			OpenGL.glEnd();
			method10044();
		}
	}

	void method10046(int i, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_, boolean bool) {
		if ((((Class106_Sub1) ((Class161_Sub2) this).aClass106_Sub1_10908).aBool10077) && !bool) {
			int[] is = ((Class161_Sub2) this).aClass106_Sub1_10908.method1696(i_271_, i_272_, i_269_, i_270_);
			if (is != null) {
				for (int i_273_ = 0; i_273_ < is.length; i_273_++)
					is[i_273_] |= ~0xffffff;
				method2591(i, i_268_, i_269_, i_270_, is, 0, i_269_);
			}
		} else
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9199(i, i_268_, i_269_, i_270_, i_271_, i_272_);
	}

	public int method2633() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
	}

	public void method2646(int i, int i_274_, int i_275_, int i_276_, int i_277_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_277_);
		OpenGL.glColor4ub((byte) (i_276_ >> 16), (byte) (i_276_ >> 8), (byte) i_276_, (byte) (i_276_ >> 24));
		i += ((Class161_Sub2) this).anInt10913;
		i_274_ += ((Class161_Sub2) this).anInt10912;
		if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_275_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_274_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_274_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_274_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_274_);
			OpenGL.glEnd();
		} else {
			method10043(i_275_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_274_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_274_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_274_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_274_);
			OpenGL.glEnd();
			method10044();
		}
	}

	public void method2629(int[] is) {
		is[0] = ((Class161_Sub2) this).anInt10913;
		is[1] = ((Class161_Sub2) this).anInt10912;
		is[2] = ((Class161_Sub2) this).anInt10907;
		is[3] = ((Class161_Sub2) this).anInt10914;
	}

	public void method2648(int[] is) {
		is[0] = ((Class161_Sub2) this).anInt10913;
		is[1] = ((Class161_Sub2) this).anInt10912;
		is[2] = ((Class161_Sub2) this).anInt10907;
		is[3] = ((Class161_Sub2) this).anInt10914;
	}

	public int method2602() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
	}

	void method2622(int i, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517((i_284_ & 0x1) != 0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_283_);
		OpenGL.glColor4ub((byte) (i_282_ >> 16), (byte) (i_282_ >> 8), (byte) i_282_, (byte) (i_282_ >> 24));
		if (((Class161_Sub2) this).aBool10911) {
			float f = (float) i_279_ / (float) method45();
			float f_285_ = (float) i_280_ / (float) method2589();
			float f_286_ = (float) i + (float) ((Class161_Sub2) this).anInt10913 * f;
			float f_287_ = ((float) i_278_ + (float) ((Class161_Sub2) this).anInt10912 * f_285_);
			float f_288_ = f_286_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236) * f;
			float f_289_ = f_287_ + (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232) * f_285_;
			if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
				((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
				((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_281_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_286_, f_287_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_286_, f_289_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_288_, f_289_);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_288_, f_287_);
				OpenGL.glEnd();
			} else {
				method10043(i_281_);
				((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_286_, f_287_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_286_, f_289_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
				OpenGL.glVertex2f(f_288_, f_289_);
				OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
				OpenGL.glVertex2f(f_288_, f_287_);
				OpenGL.glEnd();
				method10044();
			}
		} else if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_281_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_278_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_278_ + i_280_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_279_, i_278_ + i_280_);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_279_, i_278_);
			OpenGL.glEnd();
		} else {
			method10043(i_281_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_278_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_278_ + i_280_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + i_279_, i_278_ + i_280_);
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + i_279_, i_278_);
			OpenGL.glEnd();
			method10044();
		}
	}

	Class161_Sub2(Class106_Sub1 class106_sub1, int i, int i_290_, boolean bool) {
		((Class161_Sub2) this).anInt10907 = 0;
		((Class161_Sub2) this).aClass106_Sub1_10908 = class106_sub1;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915 = Class155_Sub4_Sub1.method10180(class106_sub1, (bool ? Class171.aClass171_2071 : Class171.aClass171_2068), Class88.aClass88_1218, i, i_290_);
	}

	public void method2617(int i, int i_291_, int i_292_, int i_293_, int i_294_) {
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_294_);
		OpenGL.glColor4ub((byte) (i_293_ >> 16), (byte) (i_293_ >> 8), (byte) i_293_, (byte) (i_293_ >> 24));
		i += ((Class161_Sub2) this).anInt10913;
		i_291_ += ((Class161_Sub2) this).anInt10912;
		if (((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 == null) {
			((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
			((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_292_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_291_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_291_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_291_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_291_);
			OpenGL.glEnd();
		} else {
			method10043(i_292_);
			((Class161_Sub2) this).aClass155_Sub4_Sub1_10909.method2517(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(0.0F, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i, i_291_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_291_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, 0.0F);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_291_ + (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232));
			OpenGL.glMultiTexCoord2f(33985, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
			OpenGL.glTexCoord2f(((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234, ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231);
			OpenGL.glVertex2i(i + ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236, i_291_);
			OpenGL.glEnd();
			method10044();
		}
	}

	Class161_Sub2(Class106_Sub1 class106_sub1, int i, int i_295_, int i_296_, int i_297_) {
		((Class161_Sub2) this).anInt10907 = 0;
		((Class161_Sub2) this).aClass106_Sub1_10908 = class106_sub1;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915 = Class155_Sub4_Sub1.method10179(class106_sub1, i, i_295_, i_296_, i_297_);
	}

	public Interface6 method2642() {
		return ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method9201(0);
	}

	public int method2636() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
	}

	public int method2645() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232 + ((Class161_Sub2) this).anInt10912 + ((Class161_Sub2) this).anInt10914);
	}

	public int method2637() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232 + ((Class161_Sub2) this).anInt10912 + ((Class161_Sub2) this).anInt10914);
	}

	public void method2638(int i, int i_298_, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_) {
		int i_304_ = i + i_299_;
		int i_305_ = i_298_ + i_300_;
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10915.method2517(false);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9419();
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9456(i_303_);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9454(i_301_);
		OpenGL.glColor4ub((byte) (i_302_ >> 16), (byte) (i_302_ >> 8), (byte) i_302_, (byte) (i_302_ >> 24));
		if (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aBool11235 && !((Class161_Sub2) this).aBool10911 && i_300_ >= (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232) && i_299_ >= (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236)) {
			float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231) * (float) i_300_ / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
			float f_306_ = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) i_299_ / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_298_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_305_);
			OpenGL.glTexCoord2f(f_306_, 0.0F);
			OpenGL.glVertex2i(i_304_, i_305_);
			OpenGL.glTexCoord2f(f_306_, f);
			OpenGL.glVertex2i(i_304_, i_298_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class161_Sub2) this).anInt10913, (float) ((Class161_Sub2) this).anInt10912, 0.0F);
			int i_307_ = method45();
			int i_308_ = method2589();
			int i_309_ = i_298_ + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
			OpenGL.glBegin(7);
			int i_310_ = i_298_;
			for (/**/; i_309_ <= i_305_; i_309_ += i_308_) {
				int i_311_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
				int i_312_ = i;
				while (i_311_ <= i_304_) {
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_312_, i_310_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_312_, i_309_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), 0.0F);
					OpenGL.glVertex2i(i_311_, i_309_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_311_, i_310_);
					i_311_ += i_307_;
					i_312_ += i_307_;
				}
				if (i_312_ < i_304_) {
					float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) (i_304_ - i_312_) / (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236));
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_312_, i_310_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_312_, i_309_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_304_, i_309_);
					OpenGL.glTexCoord2f(f, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_304_, i_310_);
				}
				i_310_ += i_308_;
			}
			if (i_310_ < i_305_) {
				float f = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11231) * (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232 - (i_305_ - i_310_)) / (float) ((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11232);
				int i_313_ = i + (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236);
				int i_314_ = i;
				while (i_313_ <= i_304_) {
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_314_, i_310_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_314_, i_305_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), f);
					OpenGL.glVertex2i(i_313_, i_305_);
					OpenGL.glTexCoord2f((((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11234), (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_313_, i_310_);
					i_313_ += i_307_;
					i_314_ += i_307_;
				}
				if (i_314_ < i_304_) {
					float f_315_ = ((((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).aFloat11234) * (float) (i_304_ - i_314_) / (float) (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).anInt11236));
					OpenGL.glTexCoord2f(0.0F, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_314_, i_310_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_314_, i_305_);
					OpenGL.glTexCoord2f(f_315_, f);
					OpenGL.glVertex2i(i_304_, i_305_);
					OpenGL.glTexCoord2f(f_315_, (((Class155_Sub4_Sub1) (((Class161_Sub2) this).aClass155_Sub4_Sub1_10915)).aFloat11231));
					OpenGL.glVertex2i(i_304_, i_310_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public int method146() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236 + ((Class161_Sub2) this).anInt10913 + ((Class161_Sub2) this).anInt10907);
	}

	public int method148() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236 + ((Class161_Sub2) this).anInt10913 + ((Class161_Sub2) this).anInt10907);
	}

	void method10047(int i) {
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10915);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(((Class161_Sub2) this).aClass106_Sub1_10908.method9379(i), 7681);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34167, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9424(0, 34168, 770);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(((Class161_Sub2) this).aClass155_Sub4_Sub1_10909);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(34479, 7681);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34166, 768);
		if (((Class161_Sub2) this).anInt10910 == 0)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 1)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 2)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class161_Sub2) this).anInt10910 == 3)
			((Class161_Sub2) this).aClass106_Sub1_10908.method9426(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public int method2635() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
	}

	void method10048() {
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(1);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9422(null);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9434(8448, 8448);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9424(0, 5890, 770);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9421(0);
		((Class161_Sub2) this).aClass106_Sub1_10908.method9423(1, 34168, 768);
	}

	public int method2588() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232);
	}

	public int method147() {
		return (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236 + ((Class161_Sub2) this).anInt10913 + ((Class161_Sub2) this).anInt10907);
	}

	public void method2594(int i, int i_316_, int i_317_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class161_Sub2) this).aClass155_Sub4_Sub1_10909 = (Class155_Sub4_Sub1.method10179(((Class161_Sub2) this).aClass106_Sub1_10908, i, i_316_, ((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11236, (((Class155_Sub4_Sub1) ((Class161_Sub2) this).aClass155_Sub4_Sub1_10915).anInt11232)));
		((Class161_Sub2) this).anInt10910 = i_317_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}
}
