package game;

/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class254 {
	int[] anIntArray2736;
	int anInt2737;
	byte[] aByteArray2738;
	int anInt2739;
	int anInt2740;
	int[] anIntArray2741;
	int[] anIntArray2742;
	Class392 aClass392_2743;
	int anInt2744;
	int[] anIntArray2745;
	int[][] anIntArrayArray2746;
	byte[][] aByteArrayArray2747;
	int[] anIntArray2748;
	int[] anIntArray2749;
	int[] anIntArray2750;
	int[][] anIntArrayArray2751;
	int[] anIntArray2752;
	int[] anIntArray2753;
	Class392[] aClass392Array2754;
	static final int anInt2755 = 7;

	Class254(byte[] is, int i, byte[] is_0_) {
		((Class254) this).anInt2737 = Class100.method1594(is, is.length, -551122960) * -990287873;
		if (i != ((Class254) this).anInt2737 * -1060726785)
			throw new RuntimeException();
		if (is_0_ != null) {
			if (64 != is_0_.length)
				throw new RuntimeException();
			((Class254) this).aByteArray2738 = Entity.method10573(is, 0, is.length, 2144129954);
			for (int i_1_ = 0; i_1_ < 64; i_1_++) {
				if (is_0_[i_1_] != ((Class254) this).aByteArray2738[i_1_])
					throw new RuntimeException();
			}
		}
		method3519(is, 849721017);
	}

	void method3518(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(Class284.method3846(is, -391919469));
		int i = class572_sub15.readUnsignedByte(1693002997);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			((Class254) this).anInt2739 = class572_sub15.readInt(1688758527) * 325153545;
		else
			((Class254) this).anInt2739 = 0;
		int i_2_ = class572_sub15.readUnsignedByte(200298971);
		boolean bool = (i_2_ & 0x1) != 0;
		boolean bool_3_ = (i_2_ & 0x2) != 0;
		boolean bool_4_ = 0 != (i_2_ & 0x4);
		boolean bool_5_ = (i_2_ & 0x8) != 0;
		if (i >= 7)
			((Class254) this).anInt2740 = class572_sub15.method8486((byte) 16) * -32969413;
		else
			((Class254) this).anInt2740 = class572_sub15.readUnsignedShort(647518597) * -32969413;
		int i_6_ = 0;
		int i_7_ = -1;
		((Class254) this).anIntArray2741 = new int[((Class254) this).anInt2740 * 617309171];
		if (i >= 7) {
			for (int i_8_ = 0; i_8_ < 617309171 * ((Class254) this).anInt2740; i_8_++) {
				((Class254) this).anIntArray2741[i_8_] = i_6_ += class572_sub15.method8486((byte) 16);
				if (((Class254) this).anIntArray2741[i_8_] > i_7_)
					i_7_ = ((Class254) this).anIntArray2741[i_8_];
			}
		} else {
			for (int i_9_ = 0; i_9_ < 617309171 * ((Class254) this).anInt2740; i_9_++) {
				((Class254) this).anIntArray2741[i_9_] = i_6_ += class572_sub15.readUnsignedShort(647518597);
				if (((Class254) this).anIntArray2741[i_9_] > i_7_)
					i_7_ = ((Class254) this).anIntArray2741[i_9_];
			}
		}
		((Class254) this).anInt2744 = (i_7_ + 1) * -1081738973;
		((Class254) this).anIntArray2745 = new int[((Class254) this).anInt2744 * 1312554635];
		if (bool_5_)
			((Class254) this).anIntArray2753 = new int[((Class254) this).anInt2744 * 1312554635];
		if (bool_3_)
			((Class254) this).aByteArrayArray2747 = new byte[1312554635 * ((Class254) this).anInt2744][];
		((Class254) this).anIntArray2748 = new int[((Class254) this).anInt2744 * 1312554635];
		((Class254) this).anIntArray2742 = new int[1312554635 * ((Class254) this).anInt2744];
		((Class254) this).anIntArrayArray2751 = new int[1312554635 * ((Class254) this).anInt2744][];
		((Class254) this).anIntArray2752 = new int[1312554635 * ((Class254) this).anInt2744];
		if (bool) {
			((Class254) this).anIntArray2736 = new int[1312554635 * ((Class254) this).anInt2744];
			for (int i_10_ = 0; i_10_ < ((Class254) this).anInt2744 * 1312554635; i_10_++)
				((Class254) this).anIntArray2736[i_10_] = -1;
			for (int i_11_ = 0; i_11_ < 617309171 * ((Class254) this).anInt2740; i_11_++)
				((Class254) this).anIntArray2736[(((Class254) this).anIntArray2741[i_11_])] = class572_sub15.readInt(-98649909);
			((Class254) this).aClass392_2743 = new Class392(((Class254) this).anIntArray2736);
		}
		for (int i_12_ = 0; i_12_ < 617309171 * ((Class254) this).anInt2740; i_12_++)
			((Class254) this).anIntArray2745[(((Class254) this).anIntArray2741[i_12_])] = class572_sub15.readInt(-898934168);
		if (bool_5_) {
			for (int i_13_ = 0; i_13_ < ((Class254) this).anInt2740 * 617309171; i_13_++)
				((Class254) this).anIntArray2753[i_13_] = class572_sub15.readInt(190384046);
		}
		if (bool_3_) {
			for (int i_14_ = 0; i_14_ < ((Class254) this).anInt2740 * 617309171; i_14_++) {
				byte[] is_15_ = new byte[64];
				class572_sub15.readBytes(is_15_, 0, 64, 1940984918);
				((Class254) this).aByteArrayArray2747[(((Class254) this).anIntArray2741[i_14_])] = is_15_;
			}
		}
		if (bool_4_) {
			((Class254) this).anIntArray2749 = new int[1312554635 * ((Class254) this).anInt2744];
			((Class254) this).anIntArray2750 = new int[1312554635 * ((Class254) this).anInt2744];
			for (int i_16_ = 0; i_16_ < 617309171 * ((Class254) this).anInt2740; i_16_++) {
				((Class254) this).anIntArray2749[(((Class254) this).anIntArray2741[i_16_])] = class572_sub15.readInt(642545023);
				((Class254) this).anIntArray2750[(((Class254) this).anIntArray2741[i_16_])] = class572_sub15.readInt(84124547);
			}
		}
		for (int i_17_ = 0; i_17_ < 617309171 * ((Class254) this).anInt2740; i_17_++)
			((Class254) this).anIntArray2748[(((Class254) this).anIntArray2741[i_17_])] = class572_sub15.readInt(1888306428);
		if (i >= 7) {
			for (int i_18_ = 0; i_18_ < 617309171 * ((Class254) this).anInt2740; i_18_++)
				((Class254) this).anIntArray2742[(((Class254) this).anIntArray2741[i_18_])] = class572_sub15.method8486((byte) 16);
			for (int i_19_ = 0; i_19_ < ((Class254) this).anInt2740 * 617309171; i_19_++) {
				int i_20_ = ((Class254) this).anIntArray2741[i_19_];
				int i_21_ = ((Class254) this).anIntArray2742[i_20_];
				i_6_ = 0;
				int i_22_ = -1;
				((Class254) this).anIntArrayArray2751[i_20_] = new int[i_21_];
				for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
					int i_24_ = (((Class254) this).anIntArrayArray2751[i_20_][i_23_] = i_6_ += class572_sub15.method8486((byte) 16));
					if (i_24_ > i_22_)
						i_22_ = i_24_;
				}
				((Class254) this).anIntArray2752[i_20_] = 1 + i_22_;
				if (i_21_ == i_22_ + 1)
					((Class254) this).anIntArrayArray2751[i_20_] = null;
			}
		} else {
			for (int i_25_ = 0; i_25_ < ((Class254) this).anInt2740 * 617309171; i_25_++)
				((Class254) this).anIntArray2742[(((Class254) this).anIntArray2741[i_25_])] = class572_sub15.readUnsignedShort(647518597);
			for (int i_26_ = 0; i_26_ < ((Class254) this).anInt2740 * 617309171; i_26_++) {
				int i_27_ = ((Class254) this).anIntArray2741[i_26_];
				int i_28_ = ((Class254) this).anIntArray2742[i_27_];
				i_6_ = 0;
				int i_29_ = -1;
				((Class254) this).anIntArrayArray2751[i_27_] = new int[i_28_];
				for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
					int i_31_ = (((Class254) this).anIntArrayArray2751[i_27_][i_30_] = i_6_ += class572_sub15.readUnsignedShort(647518597));
					if (i_31_ > i_29_)
						i_29_ = i_31_;
				}
				((Class254) this).anIntArray2752[i_27_] = 1 + i_29_;
				if (1 + i_29_ == i_28_)
					((Class254) this).anIntArrayArray2751[i_27_] = null;
			}
		}
		if (bool) {
			((Class254) this).anIntArrayArray2746 = new int[i_7_ + 1][];
			((Class254) this).aClass392Array2754 = new Class392[1 + i_7_];
			for (int i_32_ = 0; i_32_ < ((Class254) this).anInt2740 * 617309171; i_32_++) {
				int i_33_ = ((Class254) this).anIntArray2741[i_32_];
				int i_34_ = ((Class254) this).anIntArray2742[i_33_];
				((Class254) this).anIntArrayArray2746[i_33_] = new int[((Class254) this).anIntArray2752[i_33_]];
				for (int i_35_ = 0; i_35_ < ((Class254) this).anIntArray2752[i_33_]; i_35_++)
					((Class254) this).anIntArrayArray2746[i_33_][i_35_] = -1;
				for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
					int i_37_;
					if (null != ((Class254) this).anIntArrayArray2751[i_33_])
						i_37_ = (((Class254) this).anIntArrayArray2751[i_33_][i_36_]);
					else
						i_37_ = i_36_;
					((Class254) this).anIntArrayArray2746[i_33_][i_37_] = class572_sub15.readInt(304302482);
				}
				((Class254) this).aClass392Array2754[i_33_] = new Class392(((Class254) this).anIntArrayArray2746[i_33_]);
			}
		}
	}

	void method3519(byte[] is, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(Class284.method3846(is, -2054106626));
		int i_38_ = class572_sub15.readUnsignedByte(2050191093);
		if (i_38_ < 5 || i_38_ > 7)
			throw new RuntimeException();
		if (i_38_ >= 6)
			((Class254) this).anInt2739 = class572_sub15.readInt(-177288495) * 325153545;
		else
			((Class254) this).anInt2739 = 0;
		int i_39_ = class572_sub15.readUnsignedByte(59761641);
		boolean bool = (i_39_ & 0x1) != 0;
		boolean bool_40_ = (i_39_ & 0x2) != 0;
		boolean bool_41_ = 0 != (i_39_ & 0x4);
		boolean bool_42_ = (i_39_ & 0x8) != 0;
		if (i_38_ >= 7)
			((Class254) this).anInt2740 = class572_sub15.method8486((byte) 16) * -32969413;
		else
			((Class254) this).anInt2740 = class572_sub15.readUnsignedShort(647518597) * -32969413;
		int i_43_ = 0;
		int i_44_ = -1;
		((Class254) this).anIntArray2741 = new int[((Class254) this).anInt2740 * 617309171];
		if (i_38_ >= 7) {
			for (int i_45_ = 0; i_45_ < 617309171 * ((Class254) this).anInt2740; i_45_++) {
				((Class254) this).anIntArray2741[i_45_] = i_43_ += class572_sub15.method8486((byte) 16);
				if (((Class254) this).anIntArray2741[i_45_] > i_44_)
					i_44_ = ((Class254) this).anIntArray2741[i_45_];
			}
		} else {
			for (int i_46_ = 0; i_46_ < 617309171 * ((Class254) this).anInt2740; i_46_++) {
				((Class254) this).anIntArray2741[i_46_] = i_43_ += class572_sub15.readUnsignedShort(647518597);
				if (((Class254) this).anIntArray2741[i_46_] > i_44_)
					i_44_ = ((Class254) this).anIntArray2741[i_46_];
			}
		}
		((Class254) this).anInt2744 = (i_44_ + 1) * -1081738973;
		((Class254) this).anIntArray2745 = new int[((Class254) this).anInt2744 * 1312554635];
		if (bool_42_)
			((Class254) this).anIntArray2753 = new int[((Class254) this).anInt2744 * 1312554635];
		if (bool_40_)
			((Class254) this).aByteArrayArray2747 = new byte[1312554635 * ((Class254) this).anInt2744][];
		((Class254) this).anIntArray2748 = new int[((Class254) this).anInt2744 * 1312554635];
		((Class254) this).anIntArray2742 = new int[1312554635 * ((Class254) this).anInt2744];
		((Class254) this).anIntArrayArray2751 = new int[1312554635 * ((Class254) this).anInt2744][];
		((Class254) this).anIntArray2752 = new int[1312554635 * ((Class254) this).anInt2744];
		if (bool) {
			((Class254) this).anIntArray2736 = new int[1312554635 * ((Class254) this).anInt2744];
			for (int i_47_ = 0; i_47_ < ((Class254) this).anInt2744 * 1312554635; i_47_++)
				((Class254) this).anIntArray2736[i_47_] = -1;
			for (int i_48_ = 0; i_48_ < 617309171 * ((Class254) this).anInt2740; i_48_++)
				((Class254) this).anIntArray2736[(((Class254) this).anIntArray2741[i_48_])] = class572_sub15.readInt(-159141866);
			((Class254) this).aClass392_2743 = new Class392(((Class254) this).anIntArray2736);
		}
		for (int i_49_ = 0; i_49_ < 617309171 * ((Class254) this).anInt2740; i_49_++)
			((Class254) this).anIntArray2745[(((Class254) this).anIntArray2741[i_49_])] = class572_sub15.readInt(-84134542);
		if (bool_42_) {
			for (int i_50_ = 0; i_50_ < ((Class254) this).anInt2740 * 617309171; i_50_++)
				((Class254) this).anIntArray2753[i_50_] = class572_sub15.readInt(-713892762);
		}
		if (bool_40_) {
			for (int i_51_ = 0; i_51_ < ((Class254) this).anInt2740 * 617309171; i_51_++) {
				byte[] is_52_ = new byte[64];
				class572_sub15.readBytes(is_52_, 0, 64, 1693580049);
				((Class254) this).aByteArrayArray2747[(((Class254) this).anIntArray2741[i_51_])] = is_52_;
			}
		}
		if (bool_41_) {
			((Class254) this).anIntArray2749 = new int[1312554635 * ((Class254) this).anInt2744];
			((Class254) this).anIntArray2750 = new int[1312554635 * ((Class254) this).anInt2744];
			for (int i_53_ = 0; i_53_ < 617309171 * ((Class254) this).anInt2740; i_53_++) {
				((Class254) this).anIntArray2749[(((Class254) this).anIntArray2741[i_53_])] = class572_sub15.readInt(1915733095);
				((Class254) this).anIntArray2750[(((Class254) this).anIntArray2741[i_53_])] = class572_sub15.readInt(-279976659);
			}
		}
		for (int i_54_ = 0; i_54_ < 617309171 * ((Class254) this).anInt2740; i_54_++)
			((Class254) this).anIntArray2748[(((Class254) this).anIntArray2741[i_54_])] = class572_sub15.readInt(-779862837);
		if (i_38_ >= 7) {
			for (int i_55_ = 0; i_55_ < 617309171 * ((Class254) this).anInt2740; i_55_++)
				((Class254) this).anIntArray2742[(((Class254) this).anIntArray2741[i_55_])] = class572_sub15.method8486((byte) 16);
			for (int i_56_ = 0; i_56_ < ((Class254) this).anInt2740 * 617309171; i_56_++) {
				int i_57_ = ((Class254) this).anIntArray2741[i_56_];
				int i_58_ = ((Class254) this).anIntArray2742[i_57_];
				i_43_ = 0;
				int i_59_ = -1;
				((Class254) this).anIntArrayArray2751[i_57_] = new int[i_58_];
				for (int i_60_ = 0; i_60_ < i_58_; i_60_++) {
					int i_61_ = (((Class254) this).anIntArrayArray2751[i_57_][i_60_] = i_43_ += class572_sub15.method8486((byte) 16));
					if (i_61_ > i_59_)
						i_59_ = i_61_;
				}
				((Class254) this).anIntArray2752[i_57_] = 1 + i_59_;
				if (i_58_ == i_59_ + 1)
					((Class254) this).anIntArrayArray2751[i_57_] = null;
			}
		} else {
			for (int i_62_ = 0; i_62_ < ((Class254) this).anInt2740 * 617309171; i_62_++)
				((Class254) this).anIntArray2742[(((Class254) this).anIntArray2741[i_62_])] = class572_sub15.readUnsignedShort(647518597);
			for (int i_63_ = 0; i_63_ < ((Class254) this).anInt2740 * 617309171; i_63_++) {
				int i_64_ = ((Class254) this).anIntArray2741[i_63_];
				int i_65_ = ((Class254) this).anIntArray2742[i_64_];
				i_43_ = 0;
				int i_66_ = -1;
				((Class254) this).anIntArrayArray2751[i_64_] = new int[i_65_];
				for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
					int i_68_ = (((Class254) this).anIntArrayArray2751[i_64_][i_67_] = i_43_ += class572_sub15.readUnsignedShort(647518597));
					if (i_68_ > i_66_)
						i_66_ = i_68_;
				}
				((Class254) this).anIntArray2752[i_64_] = 1 + i_66_;
				if (1 + i_66_ == i_65_)
					((Class254) this).anIntArrayArray2751[i_64_] = null;
			}
		}
		if (bool) {
			((Class254) this).anIntArrayArray2746 = new int[i_44_ + 1][];
			((Class254) this).aClass392Array2754 = new Class392[1 + i_44_];
			for (int i_69_ = 0; i_69_ < ((Class254) this).anInt2740 * 617309171; i_69_++) {
				int i_70_ = ((Class254) this).anIntArray2741[i_69_];
				int i_71_ = ((Class254) this).anIntArray2742[i_70_];
				((Class254) this).anIntArrayArray2746[i_70_] = new int[((Class254) this).anIntArray2752[i_70_]];
				for (int i_72_ = 0; i_72_ < ((Class254) this).anIntArray2752[i_70_]; i_72_++)
					((Class254) this).anIntArrayArray2746[i_70_][i_72_] = -1;
				for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
					int i_74_;
					if (null != ((Class254) this).anIntArrayArray2751[i_70_])
						i_74_ = (((Class254) this).anIntArrayArray2751[i_70_][i_73_]);
					else
						i_74_ = i_73_;
					((Class254) this).anIntArrayArray2746[i_70_][i_74_] = class572_sub15.readInt(-63626239);
				}
				((Class254) this).aClass392Array2754[i_70_] = new Class392(((Class254) this).anIntArrayArray2746[i_70_]);
			}
		}
	}

	static char method3520(char c, int i) {
		if ('\u00c6' == c)
			return 'E';
		if (c == '\u00e6')
			return 'e';
		if (c == '\u00df')
			return 's';
		if ('\u0152' == c)
			return 'E';
		if ('\u0153' == c)
			return 'e';
		return '\0';
	}

	static final void method3521(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (9220716807180722213L * Class341.aLong4351 / 60000L);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) ((9220716807180722213L * Class341.aLong4351 - Class69.method1067(-1761469876) - Class133_Sub6.aLong9845 * 4469556796047147925L) / 60000L);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class633.aBool8209 ? 1 : 0;
	}
}
