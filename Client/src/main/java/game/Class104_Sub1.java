package game;

/* Class104_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class104_Sub1 extends Class104 {
	protected static final int anInt10636 = 4;

	public abstract void method9906(Interface11 interface11);

	public abstract boolean method9907();

	public abstract void method9908(int i, Interface6 interface6);

	public abstract boolean method9909();

	public abstract void method9910(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_);

	public abstract void method9911(int i, Interface6 interface6);

	public abstract void method9912(int i, Interface6 interface6);

	public abstract void method9913(Interface11 interface11);

	public abstract boolean method9914();

	public abstract void method9915(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, boolean bool_11_);

	Class104_Sub1() {
		/* empty */
	}

	public abstract void method9916(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_);

	public static void method9917(String string, String string_18_, String string_19_, boolean bool, byte i) {
		if (string.length() <= 320 && Class320.method4100(-544366613)) {
			client.aClass195_8632.method2943(-1617137265);
			Class474.method5625(1451481208);
			Class13.aString70 = string;
			Class13.aString103 = string_18_;
			Class13.aString99 = string_19_;
			Class13.aBool75 = bool;
			Class463.method5478(15, 519930768);
		}
	}

	public static final Class572_Sub29 method9918(int i, Class572_Sub29 class572_sub29, int[] is, boolean bool, byte i_20_) {
		Class572_Sub29 class572_sub29_21_ = (Class572_Sub29) client.aClass676_8760.get((long) i);
		if (null != class572_sub29_21_)
			Class96.method1554(class572_sub29_21_, (class572_sub29_21_.anInt9301 * 493419501 != 493419501 * class572_sub29.anInt9301), bool, -1318406469);
		client.aClass676_8760.put(class572_sub29, (long) i);
		Class83.method1264(493419501 * class572_sub29.anInt9301, is, -216744022);
		InterfaceDefinitions class73 = Class512.method6083(i, (short) 3843);
		if (null != class73)
			Class555.method6575(class73, (short) 32324);
		if (client.aClass73_8762 != null) {
			Class555.method6575(client.aClass73_8762, (short) 30798);
			client.aClass73_8762 = null;
		}
		if (class73 != null)
			Class496.method5923((Class534.aClass83Array5975[class73.selfId * -1718435171 >>> 16]), class73, !bool, (byte) -29);
		if (!bool)
			Class627.method7475(493419501 * class572_sub29.anInt9301, is, 37407838);
		if (!bool && -507155049 * client.anInt8790 != -1)
			Class498.method5945(-507155049 * client.anInt8790, 1, 1567884437);
		return class572_sub29;
	}

	static final void method9919(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.anInt8680 * 1878285591;
	}

	static void method9920(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		boolean bool = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) != 0);
		boolean bool_22_ = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) != 0);
		Class639_Sub18.method8989(bool, bool_22_, (byte) 3);
	}

	static void method9921(Class572_Sub15_Sub2 class572_sub15_sub2, int i, int i_23_) {
		Class497 class497 = client.aClass613_8605.method7280((byte) -127);
		boolean bool = class572_sub15_sub2.readBits(1, -1809904620) == 1;
		if (bool)
			Class184.anIntArray2156[(Class184.anInt2164 += 1500331991) * -1531501593 - 1] = i;
		int i_24_ = class572_sub15_sub2.readBits(2, -1809904620);
		Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
		if (i_24_ == 0) {
			if (!bool) {
				if (i == client.anInt8728 * -1921142451)
					throw new RuntimeException();
				Class6 class6 = Class184.aClass6Array2166[i] = new Class6();
				Class404.method4797(1835728792);
				((Class6) class6).anInt33 = ((((class497.localY * 417324155 + class456_sub1_sub2_sub3_sub2.screenY[0]) >> 6) + (((class497.localX * -2109597897 + class456_sub1_sub2_sub3_sub2.screenX[0]) >> 6 << 14) + (class456_sub1_sub2_sub3_sub2.aByte9009 << 28))) * -634631159);
				if (class456_sub1_sub2_sub3_sub2.anInt11827 * -1319740849 != -1)
					((Class6) class6).anInt34 = class456_sub1_sub2_sub3_sub2.anInt11827 * -220884303;
				else
					((Class6) class6).anInt34 = class456_sub1_sub2_sub3_sub2.aClass15_11655.method645(170173124) * 785580799;
				((Class6) class6).anInt36 = class456_sub1_sub2_sub3_sub2.anInt11619 * -2000117711;
				((Class6) class6).aClass47_35 = class456_sub1_sub2_sub3_sub2.aClass47_11837;
				((Class6) class6).aBool32 = class456_sub1_sub2_sub3_sub2.isClanMember;
				if (-288578911 * class456_sub1_sub2_sub3_sub2.anInt11834 > 0)
					Class214.method3074(class456_sub1_sub2_sub3_sub2, -314895778);
				client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i] = null;
				if (class572_sub15_sub2.readBits(1, -1809904620) != 0)
					Class402.method4781(class572_sub15_sub2, i, (byte) -16);
			}
		} else if (i_24_ == 1) {
			int i_25_ = class572_sub15_sub2.readBits(3, -1809904620);
			int i_26_ = class572_sub15_sub2.readBits(1, -1809904620);
			int i_27_ = class456_sub1_sub2_sub3_sub2.screenX[0];
			int i_28_ = class456_sub1_sub2_sub3_sub2.screenY[0];
			if (i_26_ == 1) {
				int i_29_ = class572_sub15_sub2.readBits(2, -1809904620);
				switch (i_29_) {
					case 2:
						class456_sub1_sub2_sub3_sub2.method10705(1 + i_27_, i_28_, (Class184.aByteArray2159[i]), -2062833885);
						break;
					case 1:
						class456_sub1_sub2_sub3_sub2.method10705(i_27_ - 1, i_28_, (Class184.aByteArray2159[i]), -2062833885);
						break;
					case 3:
						class456_sub1_sub2_sub3_sub2.method10705(i_27_, i_28_ - 1, (Class184.aByteArray2159[i]), -2062833885);
						break;
					case 0:
						class456_sub1_sub2_sub3_sub2.method10705(i_27_, i_28_ + 1, (Class184.aByteArray2159[i]), -2062833885);
						break;
				}
			}
			if (0 == i_25_) {
				i_27_--;
				i_28_--;
			} else if (1 == i_25_)
				i_28_--;
			else if (2 == i_25_) {
				i_27_++;
				i_28_--;
			} else if (i_25_ == 3)
				i_27_--;
			else if (i_25_ == 4)
				i_27_++;
			else if (i_25_ == 5) {
				i_27_--;
				i_28_++;
			} else if (i_25_ == 6)
				i_28_++;
			else if (7 == i_25_) {
				i_27_++;
				i_28_++;
			}
			class456_sub1_sub2_sub3_sub2.method10705(i_27_, i_28_, (Class184.aByteArray2159[i]), -2062833885);
		} else if (i_24_ == 2) {
			int i_30_ = class572_sub15_sub2.readBits(4, -1809904620);
			int i_31_ = class456_sub1_sub2_sub3_sub2.screenX[0];
			int i_32_ = class456_sub1_sub2_sub3_sub2.screenY[0];
			if (0 == i_30_) {
				i_31_ -= 2;
				i_32_ -= 2;
			} else if (i_30_ == 1) {
				i_31_--;
				i_32_ -= 2;
			} else if (i_30_ == 2)
				i_32_ -= 2;
			else if (i_30_ == 3) {
				i_31_++;
				i_32_ -= 2;
			} else if (i_30_ == 4) {
				i_31_ += 2;
				i_32_ -= 2;
			} else if (i_30_ == 5) {
				i_31_ -= 2;
				i_32_--;
			} else if (i_30_ == 6) {
				i_31_ += 2;
				i_32_--;
			} else if (7 == i_30_)
				i_31_ -= 2;
			else if (i_30_ == 8)
				i_31_ += 2;
			else if (i_30_ == 9) {
				i_31_ -= 2;
				i_32_++;
			} else if (10 == i_30_) {
				i_31_ += 2;
				i_32_++;
			} else if (11 == i_30_) {
				i_31_ -= 2;
				i_32_ += 2;
			} else if (i_30_ == 12) {
				i_31_--;
				i_32_ += 2;
			} else if (i_30_ == 13)
				i_32_ += 2;
			else if (14 == i_30_) {
				i_31_++;
				i_32_ += 2;
			} else if (i_30_ == 15) {
				i_31_ += 2;
				i_32_ += 2;
			}
			class456_sub1_sub2_sub3_sub2.method10705(i_31_, i_32_, (Class184.aByteArray2159[i]), -2062833885);
		} else {
			int i_33_ = class572_sub15_sub2.readBits(1, -1809904620);
			if (0 == i_33_) {
				int i_34_ = class572_sub15_sub2.readBits(15, -1809904620);
				int i_35_ = i_34_ >> 12 & 0x7;
				int i_36_ = (byte) (i_34_ >> 10) & 0x3;
				int i_37_ = i_34_ >> 5 & 0x1f;
				if (i_37_ > 15)
					i_37_ -= 32;
				int i_38_ = i_34_ & 0x1f;
				if (i_38_ > 15)
					i_38_ -= 32;
				int i_39_ = i_37_ + class456_sub1_sub2_sub3_sub2.screenX[0];
				int i_40_ = i_38_ + class456_sub1_sub2_sub3_sub2.screenY[0];
				if (i_35_ == -939460949 * Class453.aClass453_5180.anInt5181)
					class456_sub1_sub2_sub3_sub2.method10699(i_39_, i_40_, (byte) 122);
				else {
					Class184.aByteArray2159[i] = (byte) (i_35_ - 1);
					class456_sub1_sub2_sub3_sub2.method10705(i_39_, i_40_, (Class184.aByteArray2159[i]), -2062833885);
				}
				class456_sub1_sub2_sub3_sub2.aByte9009 = class456_sub1_sub2_sub3_sub2.aByte9008 = (byte) (class456_sub1_sub2_sub3_sub2.aByte9009 + i_36_ & 0x3);
				if (client.aClass613_8605.method7287((byte) 58).method3689(i_39_, i_40_, -1917308182))
					class456_sub1_sub2_sub3_sub2.aByte9008++;
				if (-1921142451 * client.anInt8728 == i && (class456_sub1_sub2_sub3_sub2.aByte9009 != -374189215 * Class274.anInt2911))
					Class274.anInt2911 = 1607700641 * class456_sub1_sub2_sub3_sub2.aByte9009;
			} else {
				int i_41_ = class572_sub15_sub2.readBits(3, -1809904620);
				int i_42_ = class572_sub15_sub2.readBits(30, -1809904620);
				int i_43_ = i_42_ >> 28 & 0x3;
				int i_44_ = i_42_ >> 14 & 0x3fff;
				int i_45_ = i_42_ & 0x3fff;
				int i_46_ = (((class456_sub1_sub2_sub3_sub2.screenX[0] + class497.localX * -2109597897 + i_44_) & 0x3fff) - -2109597897 * class497.localX);
				int i_47_ = (i_45_ + (class456_sub1_sub2_sub3_sub2.screenY[0] + 417324155 * class497.localY) & 0x3fff) - class497.localY * 417324155;
				if (-939460949 * Class453.aClass453_5180.anInt5181 == i_41_)
					class456_sub1_sub2_sub3_sub2.method10699(i_46_, i_47_, (byte) 78);
				else {
					Class184.aByteArray2159[i] = (byte) (i_41_ - 1);
					class456_sub1_sub2_sub3_sub2.method10705(i_46_, i_47_, (Class184.aByteArray2159[i]), -2062833885);
				}
				class456_sub1_sub2_sub3_sub2.aByte9009 = class456_sub1_sub2_sub3_sub2.aByte9008 = (byte) (i_43_ + class456_sub1_sub2_sub3_sub2.aByte9009 & 0x3);
				if (client.aClass613_8605.method7287((byte) 16).method3689(i_46_, i_47_, -1953308196))
					class456_sub1_sub2_sub3_sub2.aByte9008++;
				if (-1921142451 * client.anInt8728 == i)
					Class274.anInt2911 = class456_sub1_sub2_sub3_sub2.aByte9009 * 1607700641;
			}
		}
	}

	static final void method9922(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1422155373;
		Class320[] class320s = Class133_Sub20.method9537(272383510);
		Class300[] class300s = Class480.method5718(400203975);
		Class348.method4345(class320s[(((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr])], class300s[(((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr])], (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]), (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]), (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 4]), (((Cs2Executor) class441).intStack[5 + 1369304407 * ((Cs2Executor) class441).intStackPtr]), (((Cs2Executor) class441).intStack[6 + ((Cs2Executor) class441).intStackPtr * 1369304407]), (((Cs2Executor) class441).intStack[7 + ((Cs2Executor) class441).intStackPtr * 1369304407]), (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 8]), (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 9]), (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 10]), (short) 17839);
	}
}
