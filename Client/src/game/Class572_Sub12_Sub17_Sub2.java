package game;

/* Class572_Sub12_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub17_Sub2 extends Class572_Sub12_Sub17 {
	Class393 aClass393_11723;
	float aFloat11724;
	float aFloat11725;
	float aFloat11726;

	public void method10448(Class403 class403, Class261 class261, Class250 class250, byte i) {
		float f = (float) Math.sin((double) ((Class572_Sub12_Sub17_Sub2) this).aFloat11726);
		float f_0_ = f * ((Class572_Sub12_Sub17_Sub2) this).aFloat11724;
		if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4669) {
			Class403 class403_1_;
			(class403_1_ = class403).anInt4748 = ((int) ((float) (class403_1_.anInt4748 * 2095151347) + f_0_) * -1776656325);
			class261.method3580(f_0_, 0.0F, 0.0F);
		} else if (Class393.aClass393_4665 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723) {
			Class403 class403_2_;
			(class403_2_ = class403).anInt4747 = 962175953 * (int) ((float) (-1940941519 * class403_2_.anInt4747) + f_0_);
			class261.method3580(0.0F, f_0_, 0.0F);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4667) {
			Class403 class403_3_;
			(class403_3_ = class403).anInt4749 = ((int) ((float) (class403_3_.anInt4749 * -101352869) + f_0_) * 243738067);
			class261.method3580(0.0F, 0.0F, f_0_);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4668)
			class261.method3576(1.0F, 0.0F, 0.0F, f_0_);
		else if (Class393.aClass393_4666 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723)
			class261.method3576(0.0F, 1.0F, 0.0F, f_0_);
		else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4670)
			class261.method3576(0.0F, 0.0F, 1.0F, f_0_);
	}

	Class572_Sub12_Sub17_Sub2(int i, RSByteBuffer class572_sub15) {
		super(i);
		((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 = Class6.method491(class572_sub15.readUnsignedByte(2033278525), 1436583165);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11724 = class572_sub15.method8448((byte) 2);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11725 = class572_sub15.method8448((byte) 2);
	}

	public Class572_Sub12_Sub17_Sub2(int i, Class393 class393, float f, float f_4_) {
		super(i);
		((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 = class393;
		((Class572_Sub12_Sub17_Sub2) this).aFloat11724 = f;
		((Class572_Sub12_Sub17_Sub2) this).aFloat11725 = f_4_;
	}

	public void method10447(float f, int i) {
		((Class572_Sub12_Sub17_Sub2) this).aFloat11726 += ((Class572_Sub12_Sub17_Sub2) this).aFloat11725 * f;
	}

	public void method10449(RSByteBuffer class572_sub15, byte i) {
		((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 = Class6.method491(class572_sub15.readUnsignedByte(1621220486), 1829735241);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11724 = class572_sub15.method8448((byte) 2);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11725 = class572_sub15.method8448((byte) 2);
	}

	public void method10450(float f) {
		((Class572_Sub12_Sub17_Sub2) this).aFloat11726 += ((Class572_Sub12_Sub17_Sub2) this).aFloat11725 * f;
	}

	public void method10451(float f) {
		((Class572_Sub12_Sub17_Sub2) this).aFloat11726 += ((Class572_Sub12_Sub17_Sub2) this).aFloat11725 * f;
	}

	public void method10452(float f) {
		((Class572_Sub12_Sub17_Sub2) this).aFloat11726 += ((Class572_Sub12_Sub17_Sub2) this).aFloat11725 * f;
	}

	public void method10453(Class403 class403, Class261 class261, Class250 class250) {
		float f = (float) Math.sin((double) ((Class572_Sub12_Sub17_Sub2) this).aFloat11726);
		float f_5_ = f * ((Class572_Sub12_Sub17_Sub2) this).aFloat11724;
		if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4669) {
			Class403 class403_6_;
			(class403_6_ = class403).anInt4748 = ((int) ((float) (class403_6_.anInt4748 * 2095151347) + f_5_) * -1776656325);
			class261.method3580(f_5_, 0.0F, 0.0F);
		} else if (Class393.aClass393_4665 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723) {
			Class403 class403_7_;
			(class403_7_ = class403).anInt4747 = 962175953 * (int) ((float) (-1940941519 * class403_7_.anInt4747) + f_5_);
			class261.method3580(0.0F, f_5_, 0.0F);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4667) {
			Class403 class403_8_;
			(class403_8_ = class403).anInt4749 = ((int) ((float) (class403_8_.anInt4749 * -101352869) + f_5_) * 243738067);
			class261.method3580(0.0F, 0.0F, f_5_);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4668)
			class261.method3576(1.0F, 0.0F, 0.0F, f_5_);
		else if (Class393.aClass393_4666 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723)
			class261.method3576(0.0F, 1.0F, 0.0F, f_5_);
		else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4670)
			class261.method3576(0.0F, 0.0F, 1.0F, f_5_);
	}

	public void method10454(Class403 class403, Class261 class261, Class250 class250) {
		float f = (float) Math.sin((double) ((Class572_Sub12_Sub17_Sub2) this).aFloat11726);
		float f_9_ = f * ((Class572_Sub12_Sub17_Sub2) this).aFloat11724;
		if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4669) {
			Class403 class403_10_;
			(class403_10_ = class403).anInt4748 = ((int) ((float) (class403_10_.anInt4748 * 2095151347) + f_9_) * -1776656325);
			class261.method3580(f_9_, 0.0F, 0.0F);
		} else if (Class393.aClass393_4665 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723) {
			Class403 class403_11_;
			(class403_11_ = class403).anInt4747 = 962175953 * (int) ((float) (-1940941519 * class403_11_.anInt4747) + f_9_);
			class261.method3580(0.0F, f_9_, 0.0F);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4667) {
			Class403 class403_12_;
			(class403_12_ = class403).anInt4749 = ((int) ((float) (class403_12_.anInt4749 * -101352869) + f_9_) * 243738067);
			class261.method3580(0.0F, 0.0F, f_9_);
		} else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4668)
			class261.method3576(1.0F, 0.0F, 0.0F, f_9_);
		else if (Class393.aClass393_4666 == ((Class572_Sub12_Sub17_Sub2) this).aClass393_11723)
			class261.method3576(0.0F, 1.0F, 0.0F, f_9_);
		else if (((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 == Class393.aClass393_4670)
			class261.method3576(0.0F, 0.0F, 1.0F, f_9_);
	}

	public void method10455(RSByteBuffer class572_sub15) {
		((Class572_Sub12_Sub17_Sub2) this).aClass393_11723 = Class6.method491(class572_sub15.readUnsignedByte(2112093204), 347865952);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11724 = class572_sub15.method8448((byte) 2);
		((Class572_Sub12_Sub17_Sub2) this).aFloat11725 = class572_sub15.method8448((byte) 2);
	}
}
