package game;

/* Class639_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class639_Sub21 extends Class639 {
	public Class639_Sub21(Class437 class437, Class435 class435, Class248 class248, Class248 class248_0_) {
		super(class437, class435, class248, JS5ConfigGroup.aClass220_2544, 64, new Class565_Sub1(class248_0_));
	}

	public void method7571(int i) {
		super.method7571(1925060818);
		((Class565) anInterface72_8286).method6686(358817658);
	}

	public void method7573(int i) {
		super.method7573(-1200471377);
		((Class565) anInterface72_8286).method6688((short) 915);
	}

	public void method7576() {
		super.method7573(-878156860);
		((Class565) anInterface72_8286).method6688((short) 915);
	}

	public void method7575() {
		super.method7571(2137576002);
		((Class565) anInterface72_8286).method6686(358817658);
	}

	public void method7570() {
		super.method7571(1936334252);
		((Class565) anInterface72_8286).method6686(358817658);
	}

	public void method7577() {
		super.method7571(1892457808);
		((Class565) anInterface72_8286).method6686(358817658);
	}

	public void method7572(int i, short i_1_) {
		super.method7572(i, (short) 873);
		((Class565) anInterface72_8286).method6687(i, 650934869);
	}

	public void method7578() {
		super.method7573(-1091116277);
		((Class565) anInterface72_8286).method6688((short) 915);
	}

	public void method7580(int i) {
		super.method7572(i, (short) 16049);
		((Class565) anInterface72_8286).method6687(i, 1967510665);
	}

	static final void method9012(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub6_9222.method8158(-2131489504) ? 1 : 0;
	}

	static void method9013(int i, int i_2_) {
		Class192.anInt2298 = 0;
		int i_3_ = client.aClass613_8605.method7347(-1323762267);
		int i_4_ = client.aClass613_8605.method7278(277214477);
		Class274 class274 = client.aClass613_8605.method7287((byte) 60);
		Class523 class523 = client.aClass613_8605.method7285(1518025251);
		Class639_Sub16 class639_sub16 = client.aClass613_8605.method7288(-101415980);
		int i_5_ = i;
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null) {
			int i_6_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) >> 3);
			int i_7_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) >> 3);
			if (i_6_ >= 0 && i_6_ < Class406.aBoolArrayArray4764.length && i_7_ >= 0 && i_7_ < Class406.aBoolArrayArray4764[i_6_].length && Class406.aBoolArrayArray4764[i_6_][i_7_])
				i_5_ = 0;
		}
		for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
				for (int i_10_ = i_5_; i_10_ <= i + 1 && i_10_ <= 3; i_10_++) {
					if ((i_10_ < i || class274.method3683(i, i_10_, i_8_, i_9_, (byte) 40)) && !(Class279.method3759((Interface65) class523.method6254(i_10_, i_8_, i_9_, 1560131677), class639_sub16, i_8_, i_9_, (short) -24155)) && !(Class279.method3759(((Interface65) class523.method6246(i_10_, i_8_, i_9_, client.anInterface62_8873, (byte) 10)), class639_sub16, i_8_, i_9_, (short) -9811)) && !(Class279.method3759((Interface65) class523.method6277(i_10_, i_8_, i_9_, -1731943541), class639_sub16, i_8_, i_9_, (short) -22061)) && !(Class279.method3759((Interface65) class523.method6251(i_10_, i_8_, i_9_, -2104323556), class639_sub16, i_8_, i_9_, (short) -3322))) {
						/* empty */
					}
				}
			}
		}
	}
}
