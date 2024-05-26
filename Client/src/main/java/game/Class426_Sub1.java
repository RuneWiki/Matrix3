package game;

/* Class426_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class426_Sub1 extends Class426 {
	Class406 aClass406_9696;
	static final int anInt9697 = 1;
	static final int anInt9698 = 1;
	static final int anInt9699 = 2;
	static final int anInt9700 = 3;
	static final int anInt9701 = 4;
	static final int anInt9702 = 5;
	int[] anIntArray9703;
	int[][] anIntArrayArray9704;
	static final int anInt9705 = 0;
	static final int anInt9706 = 7;
	static final int anInt9707 = 6;
	static final int anInt9708 = 3;
	Class405[] aClass405Array9709 = new Class405[3];
	static final int anInt9710 = 2;
	static final int anInt9711 = 0;
	Class209 aClass209_9712;
	Class209 aClass209_9713;

	public void method5182(int i, int i_0_) {
		switch (i) {
			case 2:
				((Class426_Sub1) this).aClass209_9712.method3039(i_0_);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
			case 4:
				((Class426_Sub1) this).aClass209_9712.method3039(-1);
				((Class426_Sub1) this).aClass209_9713.method3039(i_0_);
				((Class426_Sub1) this).aClass209_9713.method3046();
				break;
			case 3:
				((Class426_Sub1) this).aClass209_9712.method3039(0xffffff | i_0_ & ~0xffffff);
				((Class426_Sub1) this).aClass209_9713.method3039(i_0_ & 0xffffff);
				break;
			case 1:
				((Class426_Sub1) this).aClass209_9712.method3039(-1);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
			case 0:
				((Class426_Sub1) this).aClass209_9712.method3039(i_0_);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
		}
	}

	boolean method9238(short i) throws Exception_Sub3 {
		((Class426_Sub1) this).aClass406_9696 = aClass106_Sub3_4999.method9619("Sprite");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class426_Sub1) this).aClass406_9696.method4885("WVPMatrix", -1968620460);
		Class572_Sub8_Sub1 class572_sub8_sub1_1_ = ((Class426_Sub1) this).aClass406_9696.method4885("SpriteSampler", -1980051316);
		Class572_Sub8_Sub1 class572_sub8_sub1_2_ = ((Class426_Sub1) this).aClass406_9696.method4885("MaskSampler", -1430400784);
		Class572_Sub8_Sub1 class572_sub8_sub1_3_ = ((Class426_Sub1) this).aClass406_9696.method4885("MulColour", -2099678784);
		Class572_Sub8_Sub1 class572_sub8_sub1_4_ = ((Class426_Sub1) this).aClass406_9696.method4885("AddColour", -1950816479);
		Class572_Sub8_Sub1 class572_sub8_sub1_5_ = ((Class426_Sub1) this).aClass406_9696.method4885("SpriteTexCoordMatrix", -1531784737);
		Class572_Sub8_Sub1 class572_sub8_sub1_6_ = ((Class426_Sub1) this).aClass406_9696.method4885("MaskTexCoordMatrix", -2037779934);
		((Class426_Sub1) this).aClass405Array9709[0] = ((Class426_Sub1) this).aClass406_9696.method4863("Normal", 299258852);
		((Class426_Sub1) this).aClass405Array9709[1] = ((Class426_Sub1) this).aClass406_9696.method4863("Masked", -1026189291);
		((Class426_Sub1) this).aClass405Array9709[2] = ((Class426_Sub1) this).aClass406_9696.method4863("AlphaTex", 32801379);
		for (int i_7_ = 0; i_7_ < 3; i_7_++) {
			int i_8_ = (((Class426_Sub1) this).aClass406_9696.method4866(((Class426_Sub1) this).aClass405Array9709[i_7_], (byte) -20));
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][0] = class572_sub8_sub1.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][1] = class572_sub8_sub1_1_.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][2] = class572_sub8_sub1_2_.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][5] = class572_sub8_sub1_3_.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][6] = class572_sub8_sub1_4_.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][3] = class572_sub8_sub1_5_.method10278(i_8_);
			((Class426_Sub1) this).anIntArrayArray9704[i_7_][4] = class572_sub8_sub1_6_.method10278(i_8_);
		}
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		return true;
	}

	public void method5184() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-699353310)]);
		method9239((byte) 1);
	}

	public void method5186() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[1]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(991070881)]);
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[2]), 1, anInterface43_5002, (short) -6845);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[4]), aClass250_5000, (byte) 123);
		method9239((byte) 1);
	}

	public void method5180() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-167973895)]);
		method9239((byte) 1);
	}

	public Class426_Sub1(Class106_Sub3 class106_sub3) throws Exception_Sub3 {
		super(class106_sub3);
		((Class426_Sub1) this).anIntArrayArray9704 = new int[3][7];
		((Class426_Sub1) this).aClass209_9712 = new Class209(1.0F, 1.0F, 1.0F, 1.0F);
		((Class426_Sub1) this).aClass209_9713 = new Class209(0.0F, 0.0F, 0.0F, 0.0F);
		method9238((short) 18893);
	}

	public void method5179(int i, int i_9_) {
		switch (i) {
			case 2:
				((Class426_Sub1) this).aClass209_9712.method3039(i_9_);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
			case 4:
				((Class426_Sub1) this).aClass209_9712.method3039(-1);
				((Class426_Sub1) this).aClass209_9713.method3039(i_9_);
				((Class426_Sub1) this).aClass209_9713.method3046();
				break;
			case 3:
				((Class426_Sub1) this).aClass209_9712.method3039(0xffffff | i_9_ & ~0xffffff);
				((Class426_Sub1) this).aClass209_9713.method3039(i_9_ & 0xffffff);
				break;
			case 1:
				((Class426_Sub1) this).aClass209_9712.method3039(-1);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
			case 0:
				((Class426_Sub1) this).aClass209_9712.method3039(i_9_);
				((Class426_Sub1) this).aClass209_9713.method3039(0);
				break;
		}
	}

	public void method5183() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(329166842)]);
		method9239((byte) 1);
	}

	public void method5181() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[1]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-283838576)]);
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[2]), 1, anInterface43_5002, (short) -26384);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[4]), aClass250_5000, (byte) 68);
		method9239((byte) 1);
	}

	public void method5185() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(457103309)]);
		method9239((byte) 1);
	}

	public void method5188() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-393678594)]);
		method9239((byte) 1);
	}

	public void method5187() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[1]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-1074627291)]);
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[2]), 1, anInterface43_5002, (short) -1403);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[4]), aClass250_5000, (byte) 89);
		method9239((byte) 1);
	}

	void method9239(byte i) {
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[1]), 0, anInterface43_4996, (short) -14235);
		aClass106_Sub3_4999.method9796(aClass250_4998);
		((Class426_Sub1) this).aClass406_9696.method4884((((Class426_Sub1) this).anIntArray9703[0]), aClass250_4998, 1446053099);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[3]), aClass250_4997, (byte) 110);
		((Class426_Sub1) this).aClass406_9696.method4881(((Class426_Sub1) this).anIntArray9703[5], ((Class426_Sub1) this).aClass209_9712.aFloat2436, ((Class426_Sub1) this).aClass209_9712.aFloat2434, ((Class426_Sub1) this).aClass209_9712.aFloat2433, ((Class426_Sub1) this).aClass209_9712.aFloat2435, -2140586311);
		((Class426_Sub1) this).aClass406_9696.method4881(((Class426_Sub1) this).anIntArray9703[6], ((Class426_Sub1) this).aClass209_9713.aFloat2436, ((Class426_Sub1) this).aClass209_9713.aFloat2434, ((Class426_Sub1) this).aClass209_9713.aFloat2433, ((Class426_Sub1) this).aClass209_9713.aFloat2435, -2139257022);
		aClass106_Sub3_4999.method9674(0, anInterface44_5001);
		aClass106_Sub3_4999.method9673(aClass362_5003);
		aClass106_Sub3_4999.method9660(Class379.aClass379_4589, anInt4995, 2);
	}

	public void method5189() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[1]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(-1312207652)]);
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[2]), 1, anInterface43_5002, (short) -31785);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[4]), aClass250_5000, (byte) 71);
		method9239((byte) 1);
	}

	public void method5190() {
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[1]);
		((Class426_Sub1) this).aClass406_9696.method4858();
		((Class426_Sub1) this).anIntArray9703 = (((Class426_Sub1) this).anIntArrayArray9704[((Class426_Sub1) this).aClass406_9696.method4880(88526017)]);
		((Class426_Sub1) this).aClass406_9696.method4864((((Class426_Sub1) this).anIntArray9703[2]), 1, anInterface43_5002, (short) -3073);
		((Class426_Sub1) this).aClass406_9696.method4910((((Class426_Sub1) this).anIntArray9703[4]), aClass250_5000, (byte) 83);
		method9239((byte) 1);
	}

	boolean method9240() throws Exception_Sub3 {
		((Class426_Sub1) this).aClass406_9696 = aClass106_Sub3_4999.method9619("Sprite");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class426_Sub1) this).aClass406_9696.method4885("WVPMatrix", -1247925733);
		Class572_Sub8_Sub1 class572_sub8_sub1_10_ = ((Class426_Sub1) this).aClass406_9696.method4885("SpriteSampler", -1371406767);
		Class572_Sub8_Sub1 class572_sub8_sub1_11_ = ((Class426_Sub1) this).aClass406_9696.method4885("MaskSampler", -792939424);
		Class572_Sub8_Sub1 class572_sub8_sub1_12_ = ((Class426_Sub1) this).aClass406_9696.method4885("MulColour", -1973093421);
		Class572_Sub8_Sub1 class572_sub8_sub1_13_ = ((Class426_Sub1) this).aClass406_9696.method4885("AddColour", -1942714503);
		Class572_Sub8_Sub1 class572_sub8_sub1_14_ = ((Class426_Sub1) this).aClass406_9696.method4885("SpriteTexCoordMatrix", -1745693031);
		Class572_Sub8_Sub1 class572_sub8_sub1_15_ = ((Class426_Sub1) this).aClass406_9696.method4885("MaskTexCoordMatrix", -1161696886);
		((Class426_Sub1) this).aClass405Array9709[0] = ((Class426_Sub1) this).aClass406_9696.method4863("Normal", -2077306546);
		((Class426_Sub1) this).aClass405Array9709[1] = ((Class426_Sub1) this).aClass406_9696.method4863("Masked", 399895396);
		((Class426_Sub1) this).aClass405Array9709[2] = ((Class426_Sub1) this).aClass406_9696.method4863("AlphaTex", -707354353);
		for (int i = 0; i < 3; i++) {
			int i_16_ = (((Class426_Sub1) this).aClass406_9696.method4866(((Class426_Sub1) this).aClass405Array9709[i], (byte) -108));
			((Class426_Sub1) this).anIntArrayArray9704[i][0] = class572_sub8_sub1.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][1] = class572_sub8_sub1_10_.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][2] = class572_sub8_sub1_11_.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][5] = class572_sub8_sub1_12_.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][6] = class572_sub8_sub1_13_.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][3] = class572_sub8_sub1_14_.method10278(i_16_);
			((Class426_Sub1) this).anIntArrayArray9704[i][4] = class572_sub8_sub1_15_.method10278(i_16_);
		}
		((Class426_Sub1) this).aClass406_9696.method4868(((Class426_Sub1) this).aClass405Array9709[0]);
		return true;
	}

	public static void method9241(int i, int i_17_) {
		if (i < 1)
			Class547_Sub1.anInt8993 = -1383841081 * Class547_Sub1.anInt8977;
		else
			Class547_Sub1.anInt8993 = i * -659860373;
	}
}
