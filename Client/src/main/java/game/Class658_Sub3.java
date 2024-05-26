package game;

/* Class658_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658_Sub3 extends Class658 {
	Class240 aClass240_9561;
	Class240 aClass240_9562 = new Class240();
	Class240 aClass240_9563 = new Class240(Float.NaN, Float.NaN, Float.NaN);
	boolean aBool9564;
	Interface48 anInterface48_9565;
	Class240 aClass240_9566;

	public Class240 method7752() {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9561);
		Class240 class240_0_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_0_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-330925447));
		class240.method3305(class240_0_);
		class240_0_.method3261();
		return class240;
	}

	public void method7739(Class403 class403, Class261 class261, int i, int i_1_, float f, byte i_2_) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass411_8421.method4968(-744958494));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_1_;
		class240.aFloat2656 *= -1.0F;
		Class240 class240_3_ = method7736(-1407008600);
		class240_3_.aFloat2653 -= (float) i;
		class240_3_.aFloat2657 -= (float) i_1_;
		class240_3_.aFloat2656 *= -1.0F;
		class261.method3570((double) class240.aFloat2653, (double) class240.aFloat2656, (double) class240.aFloat2657, (double) class240_3_.aFloat2653, (double) class240_3_.aFloat2656, (double) class240_3_.aFloat2657, 0.0F, 1.0F, 0.0F);
		class240.method3261();
		class240_3_.method3261();
	}

	public void method8977(int i) {
		if (((Class658_Sub3) this).anInterface48_9565 != null)
			((Class658_Sub3) this).anInterface48_9565 = (((Class658_Sub3) this).aClass411_8421.method4992((byte) 85).method268(((Class658_Sub3) this).anInterface48_9565.method281(2142610479), ((Class658_Sub3) this).anInterface48_9565.method113((byte) 0), 1565244322));
	}

	public void method7734(float f, int i) {
		if (((Class658_Sub3) this).anInterface48_9565 != null) {
			((Class658_Sub3) this).aClass240_9561.method3269(((Class658_Sub3) this).anInterface48_9565.method273((byte) -5).method8572(460557131));
			((Class658_Sub3) this).aClass411_8421.method4970(false, f, ((Class658_Sub3) this).aClass240_9563, ((Class658_Sub3) this).aClass411_8421.method5002((byte) 9), ((Class658_Sub3) this).aClass240_9561, ((Class658_Sub3) this).aClass240_9566, 1210240699);
		}
	}

	public Class240 method7749() {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9561);
		Class240 class240_4_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_4_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-1014778644));
		class240.method3305(class240_4_);
		class240_4_.method3261();
		return class240;
	}

	public Class240 method7740() {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9563);
		Class240 class240_5_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_5_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-670338930));
		class240.method3305(class240_5_);
		class240_5_.method3261();
		return class240;
	}

	public Class240 method7753() {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9563);
		Class240 class240_6_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_6_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-141322418));
		class240.method3305(class240_6_);
		class240_6_.method3261();
		return class240;
	}

	public Class240 method7745(int i) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9561);
		Class240 class240_7_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_7_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-1564750942));
		class240.method3305(class240_7_);
		class240_7_.method3261();
		return class240;
	}

	public Class240 method8978(int i) {
		return ((Class658_Sub3) this).aClass240_9563;
	}

	public void method7737(RSByteBuffer class572_sub15, int i) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(570708989), (byte) 67);
		int i_8_ = class572_sub15.readUnsignedShort(647518597);
		((Class658_Sub3) this).anInterface48_9565 = ((Class658_Sub3) this).aClass411_8421.method4992((byte) 113).method268(class401, i_8_, 1565244322);
		((Class658_Sub3) this).aClass240_9562.method3308(class572_sub15);
		if (class572_sub15.readUnsignedByte(231441907) == 1)
			((Class658_Sub3) this).aBool9564 = true;
		else
			((Class658_Sub3) this).aBool9564 = false;
	}

	public boolean method7735(byte i) {
		return !Float.isNaN(((Class658_Sub3) this).aClass240_9563.aFloat2653);
	}

	public void method7741(float f) {
		if (((Class658_Sub3) this).anInterface48_9565 != null) {
			((Class658_Sub3) this).aClass240_9561.method3269(((Class658_Sub3) this).anInterface48_9565.method273((byte) -111).method8572(532800964));
			((Class658_Sub3) this).aClass411_8421.method4970(false, f, ((Class658_Sub3) this).aClass240_9563, ((Class658_Sub3) this).aClass411_8421.method5002((byte) 9), ((Class658_Sub3) this).aClass240_9561, ((Class658_Sub3) this).aClass240_9566, 1210240699);
		}
	}

	public void method7738(float f) {
		if (((Class658_Sub3) this).anInterface48_9565 != null) {
			((Class658_Sub3) this).aClass240_9561.method3269(((Class658_Sub3) this).anInterface48_9565.method273((byte) -84).method8572(2110798006));
			((Class658_Sub3) this).aClass411_8421.method4970(false, f, ((Class658_Sub3) this).aClass240_9563, ((Class658_Sub3) this).aClass411_8421.method5002((byte) 9), ((Class658_Sub3) this).aClass240_9561, ((Class658_Sub3) this).aClass240_9566, 1210240699);
		}
	}

	public boolean method7743() {
		return !Float.isNaN(((Class658_Sub3) this).aClass240_9563.aFloat2653);
	}

	public boolean method7744() {
		return !Float.isNaN(((Class658_Sub3) this).aClass240_9563.aFloat2653);
	}

	public void method8979(Interface48 interface48, Class240 class240, boolean bool, int i) {
		((Class658_Sub3) this).anInterface48_9565 = interface48;
		((Class658_Sub3) this).aClass240_9562.method3269(class240);
		((Class658_Sub3) this).aBool9564 = bool;
		interface48.method273((byte) -2);
	}

	public void method7746(Class403 class403, Class261 class261, int i, int i_9_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass411_8421.method4968(-802124625));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_9_;
		class240.aFloat2656 *= -1.0F;
		Class240 class240_10_ = method7736(-1411775851);
		class240_10_.aFloat2653 -= (float) i;
		class240_10_.aFloat2657 -= (float) i_9_;
		class240_10_.aFloat2656 *= -1.0F;
		class261.method3570((double) class240.aFloat2653, (double) class240.aFloat2656, (double) class240.aFloat2657, (double) class240_10_.aFloat2653, (double) class240_10_.aFloat2656, (double) class240_10_.aFloat2657, 0.0F, 1.0F, 0.0F);
		class240.method3261();
		class240_10_.method3261();
	}

	public void method7748(Class403 class403, Class261 class261, int i, int i_11_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass411_8421.method4968(1450910754));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_11_;
		class240.aFloat2656 *= -1.0F;
		Class240 class240_12_ = method7736(-1475740138);
		class240_12_.aFloat2653 -= (float) i;
		class240_12_.aFloat2657 -= (float) i_11_;
		class240_12_.aFloat2656 *= -1.0F;
		class261.method3570((double) class240.aFloat2653, (double) class240.aFloat2656, (double) class240.aFloat2657, (double) class240_12_.aFloat2653, (double) class240_12_.aFloat2656, (double) class240_12_.aFloat2657, 0.0F, 1.0F, 0.0F);
		class240.method3261();
		class240_12_.method3261();
	}

	public void method7747(Class403 class403, Class261 class261, int i, int i_13_, float f) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass411_8421.method4968(-1035929998));
		class240.aFloat2653 -= (float) i;
		class240.aFloat2657 -= (float) i_13_;
		class240.aFloat2656 *= -1.0F;
		Class240 class240_14_ = method7736(-1259578393);
		class240_14_.aFloat2653 -= (float) i;
		class240_14_.aFloat2657 -= (float) i_13_;
		class240_14_.aFloat2656 *= -1.0F;
		class261.method3570((double) class240.aFloat2653, (double) class240.aFloat2656, (double) class240.aFloat2657, (double) class240_14_.aFloat2653, (double) class240_14_.aFloat2656, (double) class240_14_.aFloat2657, 0.0F, 1.0F, 0.0F);
		class240.method3261();
		class240_14_.method3261();
	}

	public void method7751(RSByteBuffer class572_sub15) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(246753261), (byte) 85);
		int i = class572_sub15.readUnsignedShort(647518597);
		((Class658_Sub3) this).anInterface48_9565 = ((Class658_Sub3) this).aClass411_8421.method4992((byte) 17).method268(class401, i, 1565244322);
		((Class658_Sub3) this).aClass240_9562.method3308(class572_sub15);
		if (class572_sub15.readUnsignedByte(396837346) == 1)
			((Class658_Sub3) this).aBool9564 = true;
		else
			((Class658_Sub3) this).aBool9564 = false;
	}

	public Class240 method7736(int i) {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9563);
		Class240 class240_15_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_15_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-937701871));
		class240.method3305(class240_15_);
		class240_15_.method3261();
		return class240;
	}

	public void method7750(RSByteBuffer class572_sub15) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(766988850), (byte) 18);
		int i = class572_sub15.readUnsignedShort(647518597);
		((Class658_Sub3) this).anInterface48_9565 = ((Class658_Sub3) this).aClass411_8421.method4992((byte) 116).method268(class401, i, 1565244322);
		((Class658_Sub3) this).aClass240_9562.method3308(class572_sub15);
		if (class572_sub15.readUnsignedByte(449235884) == 1)
			((Class658_Sub3) this).aBool9564 = true;
		else
			((Class658_Sub3) this).aBool9564 = false;
	}

	public Class658_Sub3(Class411 class411) {
		super(class411);
		((Class658_Sub3) this).aClass240_9561 = new Class240(Float.NaN, Float.NaN, Float.NaN);
		((Class658_Sub3) this).aClass240_9566 = new Class240();
	}

	public void method7733(float f) {
		if (((Class658_Sub3) this).anInterface48_9565 != null) {
			((Class658_Sub3) this).aClass240_9561.method3269(((Class658_Sub3) this).anInterface48_9565.method273((byte) -92).method8572(-1707147959));
			((Class658_Sub3) this).aClass411_8421.method4970(false, f, ((Class658_Sub3) this).aClass240_9563, ((Class658_Sub3) this).aClass411_8421.method5002((byte) 9), ((Class658_Sub3) this).aClass240_9561, ((Class658_Sub3) this).aClass240_9566, 1210240699);
		}
	}

	public boolean method7742() {
		return !Float.isNaN(((Class658_Sub3) this).aClass240_9563.aFloat2653);
	}

	public Class240 method7754() {
		Class240 class240 = Class240.method3276(((Class658_Sub3) this).aClass240_9563);
		Class240 class240_16_ = Class240.method3276(((Class658_Sub3) this).aClass240_9562);
		if (((Class658_Sub3) this).aBool9564)
			class240_16_.method3288(((Class658_Sub3) this).anInterface48_9565.method274(-220117837));
		class240.method3305(class240_16_);
		class240_16_.method3261();
		return class240;
	}

	public void method8980() {
		if (((Class658_Sub3) this).anInterface48_9565 != null)
			((Class658_Sub3) this).anInterface48_9565 = (((Class658_Sub3) this).aClass411_8421.method4992((byte) 93).method268(((Class658_Sub3) this).anInterface48_9565.method281(2142610479), ((Class658_Sub3) this).anInterface48_9565.method113((byte) 0), 1565244322));
	}
}
