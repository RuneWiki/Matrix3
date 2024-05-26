package game;

/* Class665_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub24 extends Class665 {
	public static final int anInt9604 = 0;
	public static final int anInt9605 = 1;
	public static final int anInt9606 = 2;

	public int method9070(byte i) {
		return volume * -767431539;
	}

	public void method9071() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-1359171376) == 0)
			volume = 0;
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -67) * 2081142341;
	}

	public Class665_Sub24(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	public Class665_Sub24(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	public boolean method9072(byte i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(1440847247) == 0)
			return false;
		return true;
	}

	public int method7863(int i, int i_0_) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-1172811611) == 0)
			return 3;
		return 1;
	}

	void setVolume(int i, byte i_1_) {
		volume = 2081142341 * i;
	}

	public void method9073() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-1265104143) == 0)
			volume = 0;
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -66) * 2081142341;
	}

	int method7858(byte i) {
		return 2;
	}

	public int method7862(int i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(1063550238) == 0)
			return 3;
		return 1;
	}

	public void method9074(int i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-1240541366) == 0)
			volume = 0;
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -22) * 2081142341;
	}

	public int method7864(int i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-583359626) == 0)
			return 3;
		return 1;
	}

	public int method7857(int i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-677351389) == 0)
			return 3;
		return 1;
	}

	void method7865(int i) {
		volume = 2081142341 * i;
	}

	void method7855(int i) {
		volume = 2081142341 * i;
	}

	int method7861() {
		return 2;
	}

	public int method7856(int i) {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(-968021946) == 0)
			return 3;
		return 1;
	}

	public void method9075() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(884112976) == 0)
			volume = 0;
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -67) * 2081142341;
	}

	public void method9076() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(1136367181) == 0)
			volume = 0;
		if (-767431539 * volume < 0 || -767431539 * volume > 2)
			volume = method7858((byte) -45) * 2081142341;
	}

	public boolean method9077() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(1687654920) == 0)
			return false;
		return true;
	}

	public boolean method9078() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(712612313) == 0)
			return false;
		return true;
	}

	public boolean method9079() {
		if (aClass572_Sub24_8494.aClass665_Sub12_9230.method8213(1117743763) == 0)
			return false;
		return true;
	}

	public int method9080() {
		return volume * -767431539;
	}

	public int method9081() {
		return volume * -767431539;
	}

	static final void method9082(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 2864);
		if (null == class73.aString847)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class73.aString847;
	}

	public static void method9083(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_3_ >= 0 && i_4_ >= 0 && i_3_ < client.aClass613_8605.method7347(152595922) - 1 && i_4_ < client.aClass613_8605.method7278(277214477) - 1) {
			if (client.aClass613_8605.method7285(2028754603) != null) {
				if (i_5_ == 0) {
					Interface65 interface65 = ((Interface65) client.aClass613_8605.method7285(1826344215).method6277(i, i_3_, i_4_, -1696760018));
					Interface65 interface65_11_ = ((Interface65) client.aClass613_8605.method7285(2012409935).method6250(i, i_3_, i_4_, 98241298));
					if (interface65 != null && i_6_ != 2) {
						if (interface65 instanceof Class456_Sub1_Sub4_Sub2)
							((Class456_Sub1_Sub4_Sub2) interface65).aClass588_11571.method6967(i_8_, i_9_, (byte) 8);
						else
							Class151.method2505(i, i_5_, i_3_, i_4_, interface65.method136(-1506782190), i_7_, i_6_, i_8_, i_9_, (byte) 113);
					}
					if (interface65_11_ != null) {
						if (interface65_11_ instanceof Class456_Sub1_Sub4_Sub2)
							((Class456_Sub1_Sub4_Sub2) interface65_11_).aClass588_11571.method6967(i_8_, i_9_, (byte) 8);
						else
							Class151.method2505(i, i_5_, i_3_, i_4_, interface65_11_.method136(-1954688351), i_7_, i_6_, i_8_, i_9_, (byte) 98);
					}
				} else if (1 == i_5_) {
					Interface65 interface65 = ((Interface65) client.aClass613_8605.method7285(1334493777).method6251(i, i_3_, i_4_, -1889288135));
					if (null != interface65) {
						if (interface65 instanceof Class456_Sub1_Sub3_Sub2)
							((Class456_Sub1_Sub3_Sub2) interface65).aClass588_11588.method6967(i_8_, i_9_, (byte) 8);
						else {
							int i_12_ = interface65.method136(-1450098526);
							if (4 == i_6_ || 5 == i_6_)
								Class151.method2505(i, i_5_, i_3_, i_4_, i_12_, i_7_, 4, i_8_, i_9_, (byte) 104);
							else if (i_6_ == 6)
								Class151.method2505(i, i_5_, i_3_, i_4_, i_12_, i_7_ + 4, 4, i_8_, i_9_, (byte) 79);
							else if (i_6_ == 7)
								Class151.method2505(i, i_5_, i_3_, i_4_, i_12_, 4 + (i_7_ + 2 & 0x3), 4, i_8_, i_9_, (byte) 122);
							else if (i_6_ == 8) {
								Class151.method2505(i, i_5_, i_3_, i_4_, i_12_, i_7_ + 4, 4, i_8_, i_9_, (byte) 76);
								Class151.method2505(i, i_5_, i_3_, i_4_, i_12_, (2 + i_7_ & 0x3) + 4, 4, i_8_, i_9_, (byte) 52);
							}
						}
					}
				} else if (2 == i_5_) {
					Interface65 interface65 = ((Interface65) (client.aClass613_8605.method7285(1087022406).method6246(i, i_3_, i_4_, client.anInterface62_8873, (byte) -8)));
					if (null != interface65) {
						if (i_6_ == 11)
							i_6_ = 10;
						if (interface65 instanceof Class456_Sub1_Sub2_Sub2)
							((Class456_Sub1_Sub2_Sub2) interface65).aClass588_11602.method6967(i_8_, i_9_, (byte) 8);
						else
							Class151.method2505(i, i_5_, i_3_, i_4_, interface65.method136(-1983593691), i_7_, i_6_, i_8_, i_9_, (byte) 12);
					}
				} else if (3 == i_5_) {
					Interface65 interface65 = ((Interface65) client.aClass613_8605.method7285(1173823588).method6254(i, i_3_, i_4_, 196360118));
					if (null != interface65) {
						if (interface65 instanceof Class456_Sub1_Sub1_Sub1)
							((Class456_Sub1_Sub1_Sub1) interface65).aClass588_11554.method6967(i_8_, i_9_, (byte) 8);
						else
							Class151.method2505(i, i_5_, i_3_, i_4_, interface65.method136(-1727422288), i_7_, i_6_, i_8_, i_9_, (byte) 109);
					}
				}
			}
		}
	}
}
