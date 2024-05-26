package game;

/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class471 {
	public static Class471 aClass471_5280;
	static Class471 aClass471_5281;
	static Class471 aClass471_5282;
	public static Class471 aClass471_5283 = new Class471(1);
	static Class471 aClass471_5284;
	static Class471 aClass471_5285;
	static Class471 aClass471_5286;
	static Class471 aClass471_5287;
	static Class471 aClass471_5288;
	static Class471 aClass471_5289;
	public int anInt5290;

	Class471(int i) {
		anInt5290 = i * -2048821665;
	}

	static {
		aClass471_5281 = new Class471(2);
		aClass471_5282 = new Class471(3);
		aClass471_5280 = new Class471(4);
		aClass471_5284 = new Class471(5);
		aClass471_5289 = new Class471(6);
		aClass471_5286 = new Class471(7);
		aClass471_5287 = new Class471(8);
		aClass471_5288 = new Class471(9);
		aClass471_5285 = new Class471(10);
	}

	static final void method5562(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((Cs2Executor) class441).intLocals[(((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039])]);
	}

	static final void method5563(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_1_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		int i_2_ = i_1_;
		if (class73.anInt892 * -22820201 != 6 && class73.anInt892 * -22820201 != 2)
			throw new RuntimeException("");
		NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1063203465 * class73.anInt803, 658212070));
		if (class73.aClass399_908 == null)
			class73.aClass399_908 = new Class399(class410, -22820201 * class73.anInt892 == 6);
		class73.aClass399_908.aLong4723 = Class542.method6439(-1971267944) * -6756611017005174427L;
		if (class410.aByteArray4802 != null) {
			if (i_1_ < 0 || i_1_ >= class410.aByteArray4802.length)
				throw new RuntimeException("");
			i_2_ = class410.aByteArray4802[i_1_];
		}
		if (null == class410.aShortArray4798 || i_2_ < 0 || i_2_ >= class410.aShortArray4798.length)
			throw new RuntimeException("");
		class73.aClass399_908.aShortArray4721[i_2_] = (short) i_0_;
		Class555.method6575(class73, (short) 15759);
	}

	static final void method5564(byte i) {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub1_9201.method8101(-461104831) == 2) {
			byte[][][] is = client.aClass613_8605.method7346((byte) 85);
			byte i_3_ = (byte) (client.anInt8699 * 2074321681 - 4 & 0xff);
			int i_4_ = (2074321681 * client.anInt8699 % client.aClass613_8605.method7347(-88599220));
			for (int i_5_ = 0; i_5_ < 4; i_5_++) {
				for (int i_6_ = 0; i_6_ < client.aClass613_8605.method7278(277214477); i_6_++)
					is[i_5_][i_4_][i_6_] = i_3_;
			}
			if (Class274.anInt2911 * -374189215 != 3) {
				for (int i_7_ = 0; i_7_ < 2; i_7_++) {
					client.anIntArray8701[i_7_] = -1000000;
					client.anIntArray8716[i_7_] = 1000000;
					client.anIntArray8717[i_7_] = 0;
					client.anIntArray8719[i_7_] = 1000000;
					client.anIntArray8718[i_7_] = 0;
				}
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class274 class274 = client.aClass613_8605.method7287((byte) 26);
				Class523 class523 = client.aClass613_8605.method7285(2109178925);
				if (4 == Class18.anInt143 * 625220759 || 625220759 * Class18.anInt143 == 1 || -1 != Class566.anInt6375 * -774947377) {
					Class497 class497 = client.aClass613_8605.method7280((byte) -50);
					int i_8_;
					int i_9_;
					if (Class18.anInt143 * 625220759 == 1) {
						Class240 class240_10_ = Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040).method7745(-541402350);
						if (Float.isNaN(class240_10_.aFloat2653))
							return;
						i_8_ = ((int) class240_10_.aFloat2653 - (-2109597897 * class497.localX << 9));
						i_9_ = ((int) class240_10_.aFloat2657 - (417324155 * class497.localY << 9));
						if (i_8_ < 0 || i_9_ < 0 || (i_8_ >> 9 >= (class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215]).length) || i_9_ >> 9 >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_8_ >> 9]).length)
							return;
					} else if (4 == 625220759 * Class18.anInt143) {
						i_8_ = (int) class240.aFloat2653;
						i_9_ = (int) class240.aFloat2657;
					} else {
						i_8_ = Class566.anInt6375 * -774947377;
						i_9_ = -1040360777 * Class419.anInt4958;
					}
					if (((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_8_ >> 9][i_9_ >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 0, i_8_ >> 9, i_9_ >> 9, false, (short) 211);
					else {
						int i_11_;
						int i_12_;
						if (1 == 625220759 * Class18.anInt143) {
							Class240 class240_13_ = Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -6).method5159((byte) -72);
							i_11_ = (((int) class240_13_.aFloat2653 >> 9) - -2109597897 * class497.localX);
							i_12_ = (((int) class240_13_.aFloat2657 >> 9) - class497.localY * 417324155);
							if (i_11_ < 0 || i_12_ < 0 || i_11_ >= (class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)]).length || i_12_ >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_11_]).length)
								return;
						} else {
							i_11_ = 386814715 * Class36.anInt387 >> 9;
							i_12_ = Class49.anInt490 * -999214779 >> 9;
						}
						int i_14_ = i_8_ >> 9;
						int i_15_ = i_9_ >> 9;
						if (class274.method3682(i_11_, i_12_, (byte) 40)) {
							int i_16_ = Class314.method4072((386814715 * Class36.anInt387), (-999214779 * Class49.anInt490), 3, -1876977431);
							if (Class572_Sub13_Sub2.anInt11451 * -1094666305 >= i_16_)
								Class406.method4926(class523.aClass536ArrayArrayArray5882, 1, i_11_, i_12_, false, (short) 211);
						} else {
							while_48_: do {
								if (1406555935 * Class455.anInt5187 < 2560) {
									int i_17_;
									if (i_14_ > i_11_)
										i_17_ = i_14_ - i_11_;
									else
										i_17_ = i_11_ - i_14_;
									int i_18_;
									if (i_15_ > i_12_)
										i_18_ = i_15_ - i_12_;
									else
										i_18_ = i_12_ - i_15_;
									if (0 == i_17_ && i_18_ == 0 || (i_17_ <= -client.aClass613_8605.method7347(-406490525)) || i_17_ >= client.aClass613_8605.method7347(1876418362) || i_18_ <= -client.aClass613_8605.method7278(277214477) || (i_18_ >= client.aClass613_8605.method7278(277214477))) {
										if (1 != Class18.anInt143 * 625220759)
											Class640.method7592(new StringBuilder().append(i_11_).append(Class3.aString23).append(i_12_).append(" ").append(i_14_).append(Class3.aString23).append(i_15_).append(" ").append(class497.localX * -2109597897).append(Class3.aString23).append(class497.localY * 417324155).toString(), new RuntimeException(), 944602364);
										break;
									}
									if (i_17_ > i_18_) {
										int i_19_ = i_18_ * 65536 / i_17_;
										int i_20_ = 32768;
										while_47_: do {
											for (;;) {
												if (i_14_ == i_11_)
													break while_47_;
												if (i_11_ < i_14_)
													i_11_++;
												else if (i_11_ > i_14_)
													i_11_--;
												if (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_11_][i_12_]) & 0x4)) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, i_12_, false, (short) 211);
													break while_47_;
												}
												if ((i_12_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_11_]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_11_][1 + i_12_]) & 0x4))) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, 1 + i_12_, false, (short) 211);
													break while_47_;
												}
												if (i_12_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_11_][i_12_ - 1]) & 0x4) != 0) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, i_12_ - 1, false, (short) 211);
													break while_47_;
												}
												i_20_ += i_19_;
												if (i_20_ >= 65536) {
													i_20_ -= 65536;
													if (i_12_ < i_15_) {
														if ((++i_12_ + 1 < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_11_]).length) && (0 != ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_11_][(i_12_ + 1)]) & 0x4))) {
															Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, i_12_ + 1, false, (short) 211);
															break while_47_;
														}
													} else if (i_12_ > i_15_ && --i_12_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_11_][(i_12_ - 1)]) & 0x4) != 0)
														break;
												}
											}
											Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, i_12_ - 1, false, (short) 211);
										} while (false);
									} else {
										int i_21_ = i_17_ * 65536 / i_18_;
										int i_22_ = 32768;
										for (;;) {
											if (i_12_ == i_15_)
												break while_48_;
											if (i_12_ < i_15_)
												i_12_++;
											else if (i_12_ > i_15_)
												i_12_--;
											if (((class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)][i_11_][i_12_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_, i_12_, false, (short) 211);
												break while_48_;
											}
											if ((i_11_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][1 + i_11_][i_12_]) & 0x4))) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_ + 1, i_12_, false, (short) 211);
												break while_48_;
											}
											if (i_11_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * Class274.anInt2911)][i_11_ - 1][i_12_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_ - 1, i_12_, false, (short) 211);
												break while_48_;
											}
											i_22_ += i_21_;
											if (i_22_ >= 65536) {
												i_22_ -= 65536;
												if (i_11_ < i_14_) {
													i_11_++;
													if ((1 + i_11_ < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)]).length) && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_11_ + 1][i_12_]) & 0x4) != 0) {
														Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, 1 + i_11_, i_12_, false, (short) 211);
														break while_48_;
													}
												} else if (i_11_ > i_14_ && --i_11_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_11_ - 1][i_12_]) & 0x4) != 0)
													break;
											}
										}
										Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_11_ - 1, i_12_, false, (short) 211);
									}
								}
							} while (false);
						}
					}
				} else {
					int i_23_ = Class314.method4072(386814715 * Class36.anInt387, Class49.anInt490 * -999214779, -374189215 * Class274.anInt2911, -2081968478);
					if ((i_23_ - -1094666305 * Class572_Sub13_Sub2.anInt11451 < 3200) && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][386814715 * Class36.anInt387 >> 9][-999214779 * Class49.anInt490 >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, Class36.anInt387 * 386814715 >> 9, Class49.anInt490 * -999214779 >> 9, false, (short) 211);
				}
			}
		}
	}

	static final void method5565(Cs2Executor class441, byte i) {
		int i_24_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_24_, 32501458));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class631.anInt8178 * 1609770391;
	}
}
