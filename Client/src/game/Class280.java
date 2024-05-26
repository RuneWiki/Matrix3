package game;

/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class280 {
	static int[][] anIntArrayArray3127;
	Class639_Sub6 aClass639_Sub6_3128;
	int[] anIntArray3129;
	static int[] anIntArray3130;
	static final int anInt3131 = 512;
	public int anInt3132 = 0;
	static final int anInt3133 = 64;
	public boolean aBool3134;
	public boolean aBool3135;
	public boolean aBool3136;
	protected int anInt3137;
	int[] anIntArray3138;
	boolean aBool3139;
	public boolean aBool3140;
	public int[][][] anIntArrayArrayArray3141;
	public byte[][][] aByteArrayArrayArray3142;
	static boolean[][] aBoolArrayArray3143;
	protected boolean aBool3144;
	byte[][][] aByteArrayArrayArray3145;
	static final int anInt3146 = 1;
	short[][][] aShortArrayArrayArray3147;
	protected byte[][][] aByteArrayArrayArray3148;
	short[][][] aShortArrayArrayArray3149;
	int[] anIntArray3150;
	int[] anIntArray3151;
	int[] anIntArray3152;
	static int[][] anIntArrayArray3153;
	static final int anInt3154 = 0;
	static boolean[][] aBoolArrayArray3155;
	protected Class523 aClass523_3156;
	static final int anInt3157 = 3;
	static final int anInt3158 = 1;
	protected int anInt3159;
	static final int anInt3160 = 4;
	static final int anInt3161 = 8;
	static final int anInt3162 = 16;
	static final int anInt3163 = 32;
	static int[][] anIntArrayArray3164;
	static final int anInt3165 = 128;
	static final int anInt3166 = 256;
	Class639_Sub2 aClass639_Sub2_3167;
	static int[] anIntArray3168 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int[] anIntArray3169;
	int anInt3170;
	static int[] anIntArray3171;
	static final int anInt3172 = 0;
	static int[] anIntArray3173;
	static int[] anIntArray3174;
	static int[][] anIntArrayArray3175;
	static boolean[][] aBoolArrayArray3176;
	protected Class274 aClass274_3177;
	static final int anInt3178 = 2;
	int anInt3179;
	static int[][] anIntArrayArray3180;
	static boolean[][] aBoolArrayArray3181;
	int[] anIntArray3182;
	static int[][] anIntArrayArray3183;
	static int[][] anIntArrayArray3184;
	static int[][] anIntArrayArray3185;
	public int anInt3186;
	int anInt3187;
	static int[][] anIntArrayArray3188;
	byte[][][] aByteArrayArrayArray3189;
	static int[][] anIntArrayArray3190;
	static final int anInt3191 = 2;
	int[] anIntArray3192;
	int[] anIntArray3193;
	int[] anIntArray3194;
	int[] anIntArray3195;
	static int[] anIntArray3196 = { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	int[] anIntArray3197;
	int anInt3198;
	int anInt3199;
	int anInt3200;
	static int[] anIntArray3201;
	int anInt3202;
	boolean aBool3203;
	int[] anIntArray3204;
	boolean aBool3205;
	static int[][] anIntArrayArray3206;
	public boolean aBool3207 = false;
	boolean aBool3208;
	int anInt3209;
	int anInt3210;
	int[] anIntArray3211;
	int[] anIntArray3212;
	int[] anIntArray3213;
	int[] anIntArray3214;

	public void method3767(int i) {
		((Class280) this).anIntArray3213 = null;
		((Class280) this).anIntArray3150 = null;
		((Class280) this).anIntArray3151 = null;
		((Class280) this).anIntArray3152 = null;
		((Class280) this).anIntArray3204 = null;
		aBool3144 = false;
	}

	public final void method3768(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		for (int i_4_ = 0; i_4_ < 1097116465 * anInt3186; i_4_++)
			method3769(i_4_, i, i_0_, i_1_, i_2_, (byte) 30);
	}

	public final void method3769(int i, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_) {
		for (int i_10_ = i_6_; i_10_ < i_8_ + i_6_; i_10_++) {
			for (int i_11_ = i_5_; i_11_ < i_5_ + i_7_; i_11_++) {
				if (i_11_ >= 0 && i_11_ < -113535507 * anInt3137 && i_10_ >= 0 && i_10_ < anInt3159 * -686830021)
					anIntArrayArrayArray3141[i][i_11_][i_10_] = i > 0 ? (anIntArrayArrayArray3141[i - 1][i_11_][i_10_]) - 960 : 0;
			}
		}
		if (i_5_ > 0 && i_5_ < anInt3137 * -113535507) {
			for (int i_12_ = 1 + i_6_; i_12_ < i_8_ + i_6_; i_12_++) {
				if (i_12_ >= 0 && i_12_ < -686830021 * anInt3159)
					anIntArrayArrayArray3141[i][i_5_][i_12_] = anIntArrayArrayArray3141[i][i_5_ - 1][i_12_];
			}
		}
		if (i_6_ > 0 && i_6_ < -686830021 * anInt3159) {
			for (int i_13_ = i_5_ + 1; i_13_ < i_7_ + i_5_; i_13_++) {
				if (i_13_ >= 0 && i_13_ < -113535507 * anInt3137)
					anIntArrayArrayArray3141[i][i_13_][i_6_] = anIntArrayArrayArray3141[i][i_13_][i_6_ - 1];
			}
		}
		if (i_5_ >= 0 && i_6_ >= 0 && i_5_ < -113535507 * anInt3137 && i_6_ < anInt3159 * -686830021) {
			if (0 == i) {
				if (i_5_ > 0 && 0 != anIntArrayArrayArray3141[i][i_5_ - 1][i_6_])
					anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_ - 1][i_6_];
				else if (i_6_ > 0 && anIntArrayArrayArray3141[i][i_5_][i_6_ - 1] != 0)
					anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_][i_6_ - 1];
				else if (i_5_ > 0 && i_6_ > 0 && 0 != (anIntArrayArrayArray3141[i][i_5_ - 1][i_6_ - 1]))
					anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_ - 1][i_6_ - 1];
			} else if (i_5_ > 0 && (anIntArrayArrayArray3141[i][i_5_ - 1][i_6_] != anIntArrayArrayArray3141[i - 1][i_5_ - 1][i_6_]))
				anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_ - 1][i_6_];
			else if (i_6_ > 0 && (anIntArrayArrayArray3141[i - 1][i_5_][i_6_ - 1] != anIntArrayArrayArray3141[i][i_5_][i_6_ - 1]))
				anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_][i_6_ - 1];
			else if (i_5_ > 0 && i_6_ > 0 && (anIntArrayArrayArray3141[i][i_5_ - 1][i_6_ - 1] != (anIntArrayArrayArray3141[i - 1][i_5_ - 1][i_6_ - 1])))
				anIntArrayArrayArray3141[i][i_5_][i_6_] = anIntArrayArrayArray3141[i][i_5_ - 1][i_6_ - 1];
		}
	}

	public final void method3770(RSByteBuffer class572_sub15, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		int i_21_ = (i_17_ & 0x7) * 8;
		int i_22_ = 8 * (i_18_ & 0x7);
		int i_23_ = (i_17_ & ~0x7) << 3;
		int i_24_ = (i_18_ & ~0x7) << 3;
		int i_25_ = 0;
		int i_26_ = 0;
		if (1 == i_19_)
			i_26_ = 1;
		else if (2 == i_19_) {
			i_25_ = 1;
			i_26_ = 1;
		} else if (i_19_ == 3)
			i_25_ = 1;
		for (int i_27_ = 0; i_27_ < 1097116465 * anInt3186; i_27_++) {
			for (int i_28_ = 0; i_28_ < 64; i_28_++) {
				for (int i_29_ = 0; i_29_ < 64; i_29_++) {
					if (i_16_ == i_27_ && i_28_ >= i_21_ && i_28_ <= 8 + i_21_ && i_29_ >= i_22_ && i_29_ <= i_22_ + 8) {
						int i_30_;
						int i_31_;
						if (i_21_ + 8 == i_28_ || i_22_ + 8 == i_29_) {
							if (i_19_ == 0) {
								i_30_ = i_14_ + (i_28_ - i_21_);
								i_31_ = i_29_ - i_22_ + i_15_;
							} else if (i_19_ == 1) {
								i_30_ = i_29_ - i_22_ + i_14_;
								i_31_ = i_15_ + 8 - (i_28_ - i_21_);
							} else if (i_19_ == 2) {
								i_30_ = i_14_ + 8 - (i_28_ - i_21_);
								i_31_ = 8 + i_15_ - (i_29_ - i_22_);
							} else {
								i_30_ = i_14_ + 8 - (i_29_ - i_22_);
								i_31_ = i_28_ - i_21_ + i_15_;
							}
							method3771(class572_sub15, i, i_30_, i_31_, 0, 0, i_23_ + i_28_, i_29_ + i_24_, 0, true, 2113826504);
						} else {
							i_30_ = i_14_ + Class185.method2836(i_28_ & 0x7, i_29_ & 0x7, i_19_, -441240859);
							i_31_ = i_15_ + Class481.method5735(i_28_ & 0x7, i_29_ & 0x7, i_19_, 1620765926);
							method3771(class572_sub15, i, i_30_, i_31_, i_25_, i_26_, i_28_ + i_23_, i_29_ + i_24_, i_19_, false, 2058921227);
						}
						if (63 == i_28_ || 63 == i_29_) {
							int i_32_ = 1;
							if (63 == i_28_ && i_29_ == 63)
								i_32_ = 3;
							for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
								int i_34_ = i_28_;
								int i_35_ = i_29_;
								if (i_33_ == 0) {
									i_34_ = i_28_ == 63 ? 64 : i_28_;
									i_35_ = 63 == i_29_ ? 64 : i_29_;
								} else if (i_33_ == 1)
									i_34_ = 64;
								else if (i_33_ == 2)
									i_35_ = 64;
								int i_36_;
								int i_37_;
								if (0 == i_19_) {
									i_36_ = i_34_ - i_21_ + i_14_;
									i_37_ = i_15_ + (i_35_ - i_22_);
								} else if (i_19_ == 1) {
									i_36_ = i_35_ - i_22_ + i_14_;
									i_37_ = 8 + i_15_ - (i_34_ - i_21_);
								} else if (i_19_ == 2) {
									i_36_ = 8 + i_14_ - (i_34_ - i_21_);
									i_37_ = i_15_ + 8 - (i_35_ - i_22_);
								} else {
									i_36_ = 8 + i_14_ - (i_35_ - i_22_);
									i_37_ = i_34_ - i_21_ + i_15_;
								}
								if (i_36_ >= 0 && i_36_ < -113535507 * anInt3137 && i_37_ >= 0 && i_37_ < -686830021 * anInt3159)
									anIntArrayArrayArray3141[i][i_36_][i_37_] = (anIntArrayArrayArray3141[i][i_25_ + i_30_][i_26_ + i_31_]);
							}
						}
					} else
						method3771(class572_sub15, 0, -1, -1, 0, 0, 0, 0, 0, false, 1968363425);
				}
			}
		}
	}

	final void method3771(RSByteBuffer class572_sub15, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, boolean bool, int i_45_) {
		if (i_44_ == 1)
			i_41_ = 1;
		else if (2 == i_44_) {
			i_40_ = 1;
			i_41_ = 1;
		} else if (3 == i_44_)
			i_40_ = 1;
		if (i_38_ >= 0 && i_38_ < -113535507 * anInt3137 && i_39_ >= 0 && i_39_ < -686830021 * anInt3159) {
			if (!aBool3140 && !bool)
				aClass274_3177.aByteArrayArrayArray2909[i][i_38_][i_39_] = (byte) 0;
			int i_46_ = class572_sub15.readUnsignedByte(1649553387);
			if (0 != (i_46_ & 0x1)) {
				if (bool) {
					class572_sub15.readUnsignedByte(-53370359);
					class572_sub15.readUnsignedSmart(1448865774);
				} else {
					int i_47_ = class572_sub15.readUnsignedByte(851312228);
					((Class280) this).aShortArrayArrayArray3147[i][i_38_][i_39_] = (short) class572_sub15.readUnsignedSmart(-426826964);
					((Class280) this).aByteArrayArrayArray3189[i][i_38_][i_39_] = (byte) (i_47_ >> 2);
					((Class280) this).aByteArrayArrayArray3145[i][i_38_][i_39_] = (byte) (i_47_ + i_44_ & 0x3);
				}
			}
			if ((i_46_ & 0x2) != 0) {
				if (!aBool3140 && !bool)
					aClass274_3177.aByteArrayArrayArray2909[i][i_38_][i_39_] = class572_sub15.readByte(1655068425);
				else
					class572_sub15.o += 310393755;
			}
			if ((i_46_ & 0x4) != 0) {
				if (bool)
					class572_sub15.readUnsignedSmart(-893967600);
				else
					((Class280) this).aShortArrayArrayArray3149[i][i_38_][i_39_] = (short) class572_sub15.readUnsignedSmart(419450523);
			}
			if (0 != (i_46_ & 0x8)) {
				int i_48_ = class572_sub15.readUnsignedByte(246453893);
				if (!aBool3140) {
					if (i_48_ == 1)
						i_48_ = 0;
					if (i == 0)
						anIntArrayArrayArray3141[0][i_40_ + i_38_][(i_39_ + i_41_)] = 8 * -i_48_ << 2;
					else
						anIntArrayArrayArray3141[i][i_40_ + i_38_][(i_41_ + i_39_)] = (anIntArrayArrayArray3141[i - 1][i_40_ + i_38_][i_41_ + i_39_]) - (i_48_ * 8 << 2);
				} else
					anIntArrayArrayArray3141[0][i_38_ + i_40_][i_39_ + i_41_] = 8 * i_48_ << 2;
			} else if (aBool3140)
				anIntArrayArrayArray3141[0][i_38_ + i_40_][i_41_ + i_39_] = 0;
			else if (i == 0)
				anIntArrayArrayArray3141[0][i_40_ + i_38_][i_41_ + i_39_] = -Class264.method3619(i_42_ + 932731, 556238 + i_43_, 239665303) * 8 << 2;
			else
				anIntArrayArrayArray3141[i][i_38_ + i_40_][i_41_ + i_39_] = (anIntArrayArrayArray3141[i - 1][i_38_ + i_40_][i_41_ + i_39_]) - 960;
		} else {
			int i_49_ = class572_sub15.readUnsignedByte(1030112315);
			if (0 != (i_49_ & 0x1)) {
				class572_sub15.readUnsignedByte(392935814);
				class572_sub15.readUnsignedSmart(-1075383324);
			}
			if (0 != (i_49_ & 0x2))
				class572_sub15.o += 310393755;
			if ((i_49_ & 0x4) != 0)
				class572_sub15.readUnsignedSmart(-2003241998);
			if (0 != (i_49_ & 0x8))
				class572_sub15.readUnsignedByte(417503722);
		}
	}

	public final void method3772(int i, int[][] is, int i_50_) {
		int[][] is_51_ = anIntArrayArrayArray3141[i];
		for (int i_52_ = 0; i_52_ < 1 + anInt3137 * -113535507; i_52_++) {
			for (int i_53_ = 0; i_53_ < -686830021 * anInt3159 + 1; i_53_++)
				is_51_[i_52_][i_53_] += is[i_52_][i_53_];
		}
	}

	public final void method3773(RSByteBuffer class572_sub15, int i, int i_54_, int i_55_, int i_56_, int i_57_) {
		int i_58_ = i + i_55_;
		int i_59_ = i_56_ + i_54_;
		for (int i_60_ = 0; i_60_ < 1097116465 * anInt3186; i_60_++) {
			for (int i_61_ = 0; i_61_ < 64; i_61_++) {
				for (int i_62_ = 0; i_62_ < 64; i_62_++)
					method3771(class572_sub15, i_60_, i + i_61_, i_54_ + i_62_, 0, 0, i_58_ + i_61_, i_62_ + i_59_, 0, false, 1926752255);
			}
		}
	}

	public final void method3774(Class106 class106, Class174 class174, Class174 class174_63_, byte i) {
		int[][] is = new int[anInt3137 * -113535507][anInt3159 * -686830021];
		if (null == ((Class280) this).anIntArray3213 || (-686830021 * anInt3159 != ((Class280) this).anIntArray3213.length)) {
			((Class280) this).anIntArray3213 = new int[-686830021 * anInt3159];
			((Class280) this).anIntArray3150 = new int[anInt3159 * -686830021];
			((Class280) this).anIntArray3151 = new int[-686830021 * anInt3159];
			((Class280) this).anIntArray3152 = new int[anInt3159 * -686830021];
			((Class280) this).anIntArray3204 = new int[anInt3159 * -686830021];
		}
		for (int i_64_ = 0; i_64_ < 1097116465 * anInt3186; i_64_++) {
			for (int i_65_ = 0; i_65_ < -686830021 * anInt3159; i_65_++) {
				((Class280) this).anIntArray3213[i_65_] = 0;
				((Class280) this).anIntArray3150[i_65_] = 0;
				((Class280) this).anIntArray3151[i_65_] = 0;
				((Class280) this).anIntArray3152[i_65_] = 0;
				((Class280) this).anIntArray3204[i_65_] = 0;
			}
			for (int i_66_ = -5; i_66_ < anInt3137 * -113535507; i_66_++) {
				for (int i_67_ = 0; i_67_ < anInt3159 * -686830021; i_67_++) {
					int i_68_ = i_66_ + 5;
					if (i_68_ < anInt3137 * -113535507) {
						int i_69_ = ((((Class280) this).aShortArrayArrayArray3149[i_64_][i_68_][i_67_]) & 0x7fff);
						if (i_69_ > 0) {
							Class670 class670 = ((Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_69_ - 1, 2079068386));
							((Class280) this).anIntArray3213[i_67_] += class670.anInt8528 * 269102535;
							((Class280) this).anIntArray3150[i_67_] += 285293977 * class670.anInt8521;
							((Class280) this).anIntArray3151[i_67_] += 1437308965 * class670.anInt8527;
							((Class280) this).anIntArray3152[i_67_] += class670.anInt8529 * 1906066391;
							((Class280) this).anIntArray3204[i_67_]++;
						}
					}
					int i_70_ = i_66_ - 5;
					if (i_70_ >= 0) {
						int i_71_ = ((((Class280) this).aShortArrayArrayArray3149[i_64_][i_70_][i_67_]) & 0x7fff);
						if (i_71_ > 0) {
							Class670 class670 = ((Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_71_ - 1, -1005390307));
							((Class280) this).anIntArray3213[i_67_] -= class670.anInt8528 * 269102535;
							((Class280) this).anIntArray3150[i_67_] -= 285293977 * class670.anInt8521;
							((Class280) this).anIntArray3151[i_67_] -= class670.anInt8527 * 1437308965;
							((Class280) this).anIntArray3152[i_67_] -= class670.anInt8529 * 1906066391;
							((Class280) this).anIntArray3204[i_67_]--;
						}
					}
				}
				if (i_66_ >= 0) {
					int i_72_ = 0;
					int i_73_ = 0;
					int i_74_ = 0;
					int i_75_ = 0;
					int i_76_ = 0;
					for (int i_77_ = -5; i_77_ < -686830021 * anInt3159; i_77_++) {
						int i_78_ = 5 + i_77_;
						if (i_78_ < -686830021 * anInt3159) {
							i_72_ += ((Class280) this).anIntArray3213[i_78_];
							i_73_ += ((Class280) this).anIntArray3150[i_78_];
							i_74_ += ((Class280) this).anIntArray3151[i_78_];
							i_75_ += ((Class280) this).anIntArray3152[i_78_];
							i_76_ += ((Class280) this).anIntArray3204[i_78_];
						}
						int i_79_ = i_77_ - 5;
						if (i_79_ >= 0) {
							i_72_ -= ((Class280) this).anIntArray3213[i_79_];
							i_73_ -= ((Class280) this).anIntArray3150[i_79_];
							i_74_ -= ((Class280) this).anIntArray3151[i_79_];
							i_75_ -= ((Class280) this).anIntArray3152[i_79_];
							i_76_ -= ((Class280) this).anIntArray3204[i_79_];
						}
						if (i_77_ >= 0 && i_75_ > 0 && i_76_ > 0)
							is[i_66_][i_77_] = Class103.method1643(256 * i_72_ / i_75_, i_73_ / i_76_, i_74_ / i_76_, -1335479835);
					}
				}
			}
			if (aBool3135)
				method3791(class106, aClass523_3156.aClass174Array5875[i_64_], i_64_, is, i_64_ == 0 ? class174 : null, 0 == i_64_ ? class174_63_ : null, (byte) 7);
			else
				method3775(class106, aClass523_3156.aClass174Array5875[i_64_], i_64_, is, i_64_ == 0 ? class174 : null, i_64_ == 0 ? class174_63_ : null, (byte) -7);
			((Class280) this).aShortArrayArrayArray3149[i_64_] = null;
			((Class280) this).aShortArrayArrayArray3147[i_64_] = null;
			((Class280) this).aByteArrayArrayArray3189[i_64_] = null;
			((Class280) this).aByteArrayArrayArray3145[i_64_] = null;
		}
		if (!aBool3140) {
			if (0 != anInt3132 * -1027287557)
				aClass523_3156.method6289(-578080632);
			if (aBool3134)
				aClass523_3156.method6241(504994428);
		}
		for (int i_80_ = 0; i_80_ < 1097116465 * anInt3186; i_80_++)
			aClass523_3156.aClass174Array5875[i_80_].method2719();
	}

	void method3775(Class106 class106, Class174 class174, int i, int[][] is, Class174 class174_81_, Class174 class174_82_, byte i_83_) {
		for (int i_84_ = 0; i_84_ < -113535507 * anInt3137; i_84_++) {
			for (int i_85_ = 0; i_85_ < anInt3159 * -686830021; i_85_++) {
				byte i_86_ = (((Class280) this).aByteArrayArrayArray3189[i][i_84_][i_85_]);
				byte i_87_ = (((Class280) this).aByteArrayArrayArray3145[i][i_84_][i_85_]);
				int i_88_ = ((((Class280) this).aShortArrayArrayArray3147[i][i_84_][i_85_]) & 0x7fff);
				int i_89_ = ((((Class280) this).aShortArrayArrayArray3149[i][i_84_][i_85_]) & 0x7fff);
				Class468 class468 = (Class468) (0 != i_88_ ? ((Class280) this).aClass639_Sub2_3167.getDefinition(i_88_ - 1, 1644286925) : null);
				Class670 class670 = (Class670) (0 != i_89_ ? ((Class280) this).aClass639_Sub6_3128.getDefinition(i_89_ - 1, 1256870767) : null);
				if (0 == i_86_ && class468 == null)
					i_86_ = (byte) 12;
				Class468 class468_90_ = class468;
				if (null != class468 && class468.anInt5260 * -1320134675 == -1 && class468.anInt5271 * 1981966121 == -1) {
					class468_90_ = class468;
					class468 = null;
				}
				if (null != class468 || class670 != null) {
					((Class280) this).anInt3209 = anIntArray3196[i_86_] * 1565579407;
					((Class280) this).anInt3210 = anIntArray3168[i_86_] * -788319659;
					int i_91_ = ((class468 != null ? ((Class280) this).anInt3210 * -1397736707 : 0) + (class670 != null ? 622151279 * ((Class280) this).anInt3209 : 0));
					int i_92_ = 0;
					((Class280) this).anInt3199 = 0;
					((Class280) this).anInt3202 = (class468 != null ? class468.anInt5261 * -1569651533 : -1) * 265208285;
					int i_93_ = (null != class670 ? 1278559991 * class670.anInt8522 : -1);
					int[] is_94_ = new int[i_91_];
					int[] is_95_ = new int[i_91_];
					int[] is_96_ = new int[i_91_];
					int[] is_97_ = new int[i_91_];
					int[] is_98_ = new int[i_91_];
					int[] is_99_ = new int[i_91_];
					int[] is_100_ = ((class468 != null && class468.anInt5271 * 1981966121 != -1) ? new int[i_91_] : null);
					if (null != class468) {
						for (int i_101_ = 0; (i_101_ < ((Class280) this).anInt3210 * -1397736707); i_101_++) {
							is_94_[i_92_] = (anIntArrayArray3175[i_86_][((Class280) this).anInt3199 * 1474895333]);
							is_95_[i_92_] = (anIntArrayArray3164[i_86_][1474895333 * ((Class280) this).anInt3199]);
							is_96_[i_92_] = (anIntArrayArray3180[i_86_][((Class280) this).anInt3199 * 1474895333]);
							is_98_[i_92_] = -1072193931 * ((Class280) this).anInt3202;
							is_99_[i_92_] = class468.anInt5264 * 479085371;
							is_97_[i_92_] = -1320134675 * class468.anInt5260;
							if (is_100_ != null)
								is_100_[i_92_] = 1981966121 * class468.anInt5271;
							i_92_++;
							((Class280) this).anInt3199 += 260364269;
						}
						if (!aBool3140 && 0 == i)
							aClass523_3156.method6252(i_84_, i_85_, 319151443 * class468.anInt5268, -1333669784 * class468.anInt5269, class468.anInt5270 * 1080476215, class468.anInt5266 * -1960700273, -1902006849 * class468.anInt5259, -2014481689 * class468.anInt5273, 1870326975);
					} else
						((Class280) this).anInt3199 += ((Class280) this).anInt3210 * 505747257;
					if (class670 != null) {
						for (int i_102_ = 0; i_102_ < 622151279 * ((Class280) this).anInt3209; i_102_++) {
							is_94_[i_92_] = (anIntArrayArray3175[i_86_][1474895333 * ((Class280) this).anInt3199]);
							is_95_[i_92_] = (anIntArrayArray3164[i_86_][1474895333 * ((Class280) this).anInt3199]);
							is_96_[i_92_] = (anIntArrayArray3180[i_86_][1474895333 * ((Class280) this).anInt3199]);
							is_98_[i_92_] = i_93_;
							is_99_[i_92_] = class670.anInt8525 * 868664291;
							is_97_[i_92_] = is[i_84_][i_85_];
							if (null != is_100_)
								is_100_[i_92_] = is_97_[i_92_];
							i_92_++;
							((Class280) this).anInt3199 += 260364269;
						}
					}
					int i_103_ = anIntArray3174.length;
					int[] is_104_ = new int[i_103_];
					int[] is_105_ = new int[i_103_];
					int[] is_106_ = class174_82_ != null ? new int[i_103_] : null;
					int[] is_107_ = (class174_82_ != null || class174_81_ != null ? new int[i_103_] : null);
					for (int i_108_ = 0; i_108_ < i_103_; i_108_++) {
						int i_109_ = anIntArray3174[i_108_];
						int i_110_ = anIntArray3201[i_108_];
						if (0 == i_87_) {
							is_104_[i_108_] = i_109_;
							is_105_[i_108_] = i_110_;
						} else if (1 == i_87_) {
							int i_111_ = i_109_;
							is_104_[i_108_] = i_110_;
							is_105_[i_108_] = 512 - i_111_;
						} else if (i_87_ == 2) {
							is_104_[i_108_] = 512 - i_109_;
							is_105_[i_108_] = 512 - i_110_;
						} else if (3 == i_87_) {
							int i_112_ = i_109_;
							is_104_[i_108_] = 512 - i_110_;
							is_105_[i_108_] = i_112_;
						}
						if (null != is_106_ && aBoolArrayArray3176[i_86_][i_108_]) {
							int i_113_ = is_104_[i_108_] + (i_84_ << 9);
							int i_114_ = (i_85_ << 9) + is_105_[i_108_];
							is_106_[i_108_] = (class174_82_.method2726(i_113_, i_114_, 358769667) - class174.method2726(i_113_, i_114_, 358769667));
						}
						if (null != is_107_) {
							if (null != class174_82_ && !aBoolArrayArray3176[i_86_][i_108_]) {
								int i_115_ = is_104_[i_108_] + (i_84_ << 9);
								int i_116_ = is_105_[i_108_] + (i_85_ << 9);
								is_107_[i_108_] = (class174.method2726(i_115_, i_116_, 358769667) - class174_82_.method2726(i_115_, i_116_, 358769667));
							} else if (class174_81_ != null && !(aBoolArrayArray3143[i_86_][i_108_])) {
								int i_117_ = (i_84_ << 9) + is_104_[i_108_];
								int i_118_ = is_105_[i_108_] + (i_85_ << 9);
								is_107_[i_108_] = (class174_81_.method2726(i_117_, i_118_, 358769667) - class174.method2726(i_117_, i_118_, 358769667));
							}
						}
					}
					int i_119_ = class174.method2713(i_84_, i_85_, 1376485350);
					int i_120_ = class174.method2713(1 + i_84_, i_85_, 1983111503);
					int i_121_ = class174.method2713(i_84_ + 1, i_85_ + 1, 726269539);
					int i_122_ = class174.method2713(i_84_, i_85_ + 1, 386912330);
					boolean bool = aClass274_3177.method3689(i_84_, i_85_, -2027865469);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_123_ = true;
						if (null != class670 && !class670.aBool8526)
							bool_123_ = false;
						else if (i_89_ == 0 && i_86_ != 0)
							bool_123_ = false;
						else if (i_88_ > 0 && null != class468_90_ && !class468_90_.aBool5262)
							bool_123_ = false;
						if (bool_123_ && i_120_ == i_119_ && i_121_ == i_119_ && i_119_ == i_122_)
							aByteArrayArrayArray3148[i][i_84_][i_85_] |= 0x4;
					}
					Class86 class86 = new Class86();
					if (aBool3140) {
						class86.anInt1193 = (aClass523_3156.method6231(i_84_, i_85_, 1492828946) * 1368828903);
						class86.anInt1190 = (aClass523_3156.method6230(i_84_, i_85_, -981999643) * 1765263439);
						class86.anInt1191 = aClass523_3156.method6283(i_84_, i_85_, 693922277) * 628738217;
						class86.anInt1189 = (aClass523_3156.method6233(i_84_, i_85_, -1042067865) * -233369847);
						class86.anInt1194 = (aClass523_3156.method6234(i_84_, i_85_, (byte) 16) * -223776263);
						class86.anInt1195 = (aClass523_3156.method6235(i_84_, i_85_, (byte) 32) * -963547665);
					}
					class174.method2712(i_84_, i_85_, is_104_, is_106_, is_105_, is_107_, is_94_, is_95_, is_96_, is_97_, is_100_, is_98_, is_99_, class86, false);
					aClass523_3156.method6228(i, i_84_, i_85_, (byte) 3);
				}
			}
		}
	}

	int method3776(int i, int i_124_, int i_125_, int i_126_, int i_127_, Class174 class174, short[][] is, int i_128_) {
		if ((1173206349 * ((Class280) this).anInt3198 == 0 || 12 == 1173206349 * ((Class280) this).anInt3198) && i_124_ > 0 && i_125_ > 0 && i_124_ < -113535507 * anInt3137 && i_125_ < anInt3159 * -686830021) {
			int i_129_ = 0;
			int i_130_ = 0;
			int i_131_ = 0;
			int i_132_ = 0;
			i_129_ = i_129_ + (i == is[i_124_ - 1][i_125_ - 1] ? 1 : -1);
			i_130_ = i_130_ + (is[i_126_][i_125_ - 1] == i ? 1 : -1);
			i_131_ = i_131_ + (is[i_126_][i_127_] == i ? 1 : -1);
			i_132_ = i_132_ + (is[i_124_ - 1][i_127_] == i ? 1 : -1);
			if (i == is[i_124_][i_125_ - 1]) {
				i_129_++;
				i_130_++;
			} else {
				i_129_--;
				i_130_--;
			}
			if (i == is[i_126_][i_125_]) {
				i_130_++;
				i_131_++;
			} else {
				i_130_--;
				i_131_--;
			}
			if (is[i_124_][i_127_] == i) {
				i_131_++;
				i_132_++;
			} else {
				i_131_--;
				i_132_--;
			}
			if (i == is[i_124_ - 1][i_125_]) {
				i_132_++;
				i_129_++;
			} else {
				i_132_--;
				i_129_--;
			}
			int i_133_ = i_129_ - i_131_;
			if (i_133_ < 0)
				i_133_ = -i_133_;
			int i_134_ = i_130_ - i_132_;
			if (i_134_ < 0)
				i_134_ = -i_134_;
			if (i_133_ == i_134_) {
				i_133_ = (class174.method2713(i_124_, i_125_, -1817920877) - class174.method2713(i_126_, i_127_, -376510383));
				if (i_133_ < 0)
					i_133_ = -i_133_;
				i_134_ = (class174.method2713(i_126_, i_125_, 1877318098) - class174.method2713(i_124_, i_127_, -1595676930));
				if (i_134_ < 0)
					i_134_ = -i_134_;
			}
			return i_133_ < i_134_ ? 1 : 0;
		}
		return 1474895333 * ((Class280) this).anInt3199;
	}

	void method3777(Class106 class106, Class468 class468, Class670 class670, int i, int i_135_, byte[][] is, byte[][] is_136_, short[][] is_137_, boolean[] bools, int i_138_) {
		boolean[] bools_139_ = (class468 != null && class468.aBool5267 ? aBoolArrayArray3155[((Class280) this).anInt3198 * 1173206349] : (aBoolArrayArray3181[((Class280) this).anInt3198 * 1173206349]));
		method3781(class106, class468, class670, i, i_135_, anInt3137 * -113535507, -686830021 * anInt3159, is_137_, is, is_136_, bools, (byte) 57);
		((Class280) this).aBool3208 = null != class468 && (1981966121 * class468.anInt5271 != -1320134675 * class468.anInt5260);
		if (!((Class280) this).aBool3208) {
			for (int i_140_ = 0; i_140_ < 8; i_140_++) {
				if (((Class280) this).anIntArray3129[i_140_] >= 0 && (((Class280) this).anIntArray3193[i_140_] != ((Class280) this).anIntArray3192[i_140_])) {
					((Class280) this).aBool3208 = true;
					break;
				}
			}
		}
		if (!bools_139_[1 + 1474895333 * ((Class280) this).anInt3199 & 0x3]) {
			boolean[] bools_141_ = bools;
			int i_142_ = 1;
			bools_141_[i_142_] = (bools_141_[i_142_] | 0 == (((Class280) this).anIntArray3197[2] & ((Class280) this).anIntArray3197[4]));
		}
		if (!bools_139_[3 + ((Class280) this).anInt3199 * 1474895333 & 0x3]) {
			boolean[] bools_143_ = bools;
			int i_144_ = 3;
			bools_143_[i_144_] = bools_143_[i_144_] | ((((Class280) this).anIntArray3197[6] & ((Class280) this).anIntArray3197[0]) == 0);
		}
		if (!bools_139_[0 + ((Class280) this).anInt3199 * 1474895333 & 0x3]) {
			boolean[] bools_145_ = bools;
			int i_146_ = 0;
			bools_145_[i_146_] = bools_145_[i_146_] | ((((Class280) this).anIntArray3197[0] & ((Class280) this).anIntArray3197[2]) == 0);
		}
		if (!bools_139_[2 + 1474895333 * ((Class280) this).anInt3199 & 0x3]) {
			boolean[] bools_147_ = bools;
			int i_148_ = 2;
			bools_147_[i_148_] = bools_147_[i_148_] | ((((Class280) this).anIntArray3197[4] & ((Class280) this).anIntArray3197[6]) == 0);
		}
		if (!((Class280) this).aBool3139 && (0 == 1173206349 * ((Class280) this).anInt3198 || 12 == 1173206349 * ((Class280) this).anInt3198)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_149_ = bools;
				bools[3] = false;
				bools_149_[0] = false;
				((Class280) this).anInt3198 = (-1169126523 * (0 == 1173206349 * ((Class280) this).anInt3198 ? 13 : 14));
				((Class280) this).anInt3199 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_150_ = bools;
				bools[1] = false;
				bools_150_[0] = false;
				((Class280) this).anInt3198 = (-1169126523 * (((Class280) this).anInt3198 * 1173206349 == 0 ? 13 : 14));
				((Class280) this).anInt3199 = 781092807;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_151_ = bools;
				bools[2] = false;
				bools_151_[1] = false;
				((Class280) this).anInt3198 = (((Class280) this).anInt3198 * 1173206349 == 0 ? 13 : 14) * -1169126523;
				((Class280) this).anInt3199 = 520728538;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_152_ = bools;
				bools[3] = false;
				bools_152_[2] = false;
				((Class280) this).anInt3198 = (-1169126523 * (0 == ((Class280) this).anInt3198 * 1173206349 ? 13 : 14));
				((Class280) this).anInt3199 = 260364269;
			}
		}
	}

	void method3778(Class106 class106, int i, int i_153_, int i_154_, Class468 class468, boolean[] bools, int[] is, int[] is_155_, int[] is_156_, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_, Class174 class174, Class174 class174_162_, Class174 class174_163_, byte i_164_) {
		((Class280) this).anInt3179 = -1617473897;
		((Class280) this).anInt3202 = -265208285;
		((Class280) this).anInt3170 = 500943616;
		if (null != class468) {
			((Class280) this).anInt3179 = -553194187 * class468.anInt5260;
			((Class280) this).anInt3202 = class468.anInt5261 * -1255800441;
			((Class280) this).anInt3170 = class468.anInt5264 * -16660279;
			int i_165_ = Class572_Sub33.method8709(class106, class468, (byte) -38);
			for (int i_166_ = 0; i_166_ < -1397736707 * ((Class280) this).anInt3210; i_166_++) {
				boolean bool = false;
				int i_167_;
				if (bools[0 - 1474895333 * ((Class280) this).anInt3199 & 0x3] && (((Class280) this).anInt3200 * 1973091801 == ((Class280) this).anIntArray3214[0])) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[1] = 1;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 1;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_167_ = 6;
				} else if (bools[(2 - 1474895333 * ((Class280) this).anInt3199 & 0x3)] && (((Class280) this).anIntArray3214[2] == ((Class280) this).anInt3200 * 1973091801)) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[1] = 5;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[3] = 5;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_167_ = 6;
				} else if (bools[(1 - ((Class280) this).anInt3199 * 1474895333 & 0x3)] && (1973091801 * ((Class280) this).anInt3200 == ((Class280) this).anIntArray3214[1])) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[1] = 3;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 3;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					i_167_ = 6;
				} else if (bools[(3 - 1474895333 * ((Class280) this).anInt3199 & 0x3)] && (((Class280) this).anIntArray3214[3] == 1973091801 * ((Class280) this).anInt3200)) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[1] = 7;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 7;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_167_ = 6;
				} else {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[1] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_167_ = 3;
				}
				for (int i_168_ = 0; i_168_ < i_167_; i_168_++) {
					int i_169_ = ((Class280) this).anIntArray3182[i_168_];
					int i_170_ = (i_169_ - -1345176630 * ((Class280) this).anInt3199 & 0x7);
					int i_171_ = anIntArray3174[i_169_];
					int i_172_ = anIntArray3201[i_169_];
					int i_173_;
					int i_174_;
					if (1 == ((Class280) this).anInt3199 * 1474895333) {
						i_173_ = i_172_;
						i_174_ = 512 - i_171_;
					} else if (2 == ((Class280) this).anInt3199 * 1474895333) {
						i_173_ = 512 - i_171_;
						i_174_ = 512 - i_172_;
					} else if (((Class280) this).anInt3199 * 1474895333 == 3) {
						i_173_ = 512 - i_172_;
						i_174_ = i_171_;
					} else {
						i_173_ = i_171_;
						i_174_ = i_172_;
					}
					is_155_[((Class280) this).anInt3187 * -344239637] = i_173_;
					is_156_[-344239637 * ((Class280) this).anInt3187] = i_174_;
					if (is_160_ != null && (aBoolArrayArray3176[((Class280) this).anInt3198 * 1173206349][i_169_])) {
						int i_175_ = (i_153_ << 9) + i_173_;
						int i_176_ = (i_154_ << 9) + i_174_;
						is_160_[-344239637 * ((Class280) this).anInt3187] = (class174_162_.method2726(i_175_, i_176_, 358769667) - class174.method2726(i_175_, i_176_, 358769667));
					}
					if (is_161_ != null) {
						if (null != class174_162_ && !(aBoolArrayArray3176[1173206349 * ((Class280) this).anInt3198][i_169_])) {
							int i_177_ = (i_153_ << 9) + i_173_;
							int i_178_ = i_174_ + (i_154_ << 9);
							is_161_[((Class280) this).anInt3187 * -344239637] = (class174.method2726(i_177_, i_178_, 358769667) - class174_162_.method2726(i_177_, i_178_, 358769667));
						} else if (class174_163_ != null && !(aBoolArrayArray3143[(((Class280) this).anInt3198 * 1173206349)][i_169_])) {
							int i_179_ = (i_153_ << 9) + i_173_;
							int i_180_ = (i_154_ << 9) + i_174_;
							is_161_[-344239637 * ((Class280) this).anInt3187] = (class174_163_.method2726(i_179_, i_180_, 358769667) - class174.method2726(i_179_, i_180_, 358769667));
						}
					}
					if (i_169_ < 8 && (((Class280) this).anIntArray3129[i_170_] > 850131603 * class468.anInt5265)) {
						if (null != is)
							is[((Class280) this).anInt3187 * -344239637] = ((Class280) this).anIntArray3193[i_170_];
						is_159_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anIntArray3195[i_170_];
						is_158_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anIntArray3194[i_170_];
						is_157_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anIntArray3192[i_170_];
					} else {
						if (is != null)
							is[((Class280) this).anInt3187 * -344239637] = i_165_;
						is_158_[((Class280) this).anInt3187 * -344239637] = class468.anInt5261 * -1569651533;
						is_159_[-344239637 * ((Class280) this).anInt3187] = 479085371 * class468.anInt5264;
						is_157_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anInt3179 * -1551700263;
					}
					((Class280) this).anInt3187 += -124694845;
				}
				((Class280) this).anInt3200 += 1496691305;
			}
			if (!aBool3140 && i == 0)
				aClass523_3156.method6252(i_153_, i_154_, class468.anInt5268 * 319151443, class468.anInt5269 * -1333669784, 1080476215 * class468.anInt5270, class468.anInt5266 * -1960700273, -1902006849 * class468.anInt5259, class468.anInt5273 * -2014481689, 2068899989);
			if (1173206349 * ((Class280) this).anInt3198 != 12 && -1320134675 * class468.anInt5260 != -1 && class468.aBool5272)
				((Class280) this).aBool3205 = true;
		} else if (((Class280) this).aBool3203)
			((Class280) this).anInt3200 += 1496691305 * (anIntArray3168[1173206349 * ((Class280) this).anInt3198]);
		else if (((Class280) this).aBool3139)
			((Class280) this).anInt3200 += 1496691305 * (anIntArray3130[((Class280) this).anInt3198 * 1173206349]);
		else
			((Class280) this).anInt3200 += (anIntArray3169[1173206349 * ((Class280) this).anInt3198] * 1496691305);
	}

	void method3779(Class106 class106, int i, int i_181_, int i_182_, int i_183_, int i_184_, Class670 class670, int i_185_, int i_186_, int i_187_, int i_188_, boolean[] bools, int[] is, int[] is_189_, int[] is_190_, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, int[] is_195_, int[][] is_196_, Class174 class174, Class174 class174_197_, Class174 class174_198_, int i_199_) {
		if (class670 != null) {
			if (i_186_ == 0)
				i_186_ = i_185_;
			if (i_187_ == 0)
				i_187_ = i_185_;
			if (i_188_ == 0)
				i_188_ = i_185_;
			Class670 class670_200_ = ((Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_185_ - 1, -64941920));
			Class670 class670_201_ = (Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_186_ - 1, -1228732538);
			Class670 class670_202_ = (Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_187_ - 1, -448288303);
			Class670 class670_203_ = (Class670) ((Class280) this).aClass639_Sub6_3128.getDefinition(i_188_ - 1, 1648040177);
			for (int i_204_ = 0; i_204_ < 622151279 * ((Class280) this).anInt3209; i_204_++) {
				boolean bool = false;
				int i_205_;
				if (bools[0 - 1474895333 * ((Class280) this).anInt3199 & 0x3] && (1973091801 * ((Class280) this).anInt3200 == ((Class280) this).anIntArray3214[0])) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[1] = 1;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[3] = 1;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_205_ = 6;
				} else if (bools[(2 - ((Class280) this).anInt3199 * 1474895333 & 0x3)] && (((Class280) this).anIntArray3214[2] == ((Class280) this).anInt3200 * 1973091801)) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[1] = 5;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 5;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					i_205_ = 6;
				} else if (bools[(1 - 1474895333 * ((Class280) this).anInt3199 & 0x3)] && (((Class280) this).anIntArray3214[1] == ((Class280) this).anInt3200 * 1973091801)) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[1] = 3;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 3;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					i_205_ = 6;
				} else if (bools[(3 - 1474895333 * ((Class280) this).anInt3199 & 0x3)] && (((Class280) this).anIntArray3214[3] == ((Class280) this).anInt3200 * 1973091801)) {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[1] = 7;
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[3] = 7;
					((Class280) this).anIntArray3182[4] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[5] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					i_205_ = 6;
				} else {
					((Class280) this).anIntArray3182[0] = (((Class280) this).anIntArray3211[1973091801 * ((Class280) this).anInt3200]);
					((Class280) this).anIntArray3182[1] = (((Class280) this).anIntArray3212[((Class280) this).anInt3200 * 1973091801]);
					((Class280) this).anIntArray3182[2] = (((Class280) this).anIntArray3138[1973091801 * ((Class280) this).anInt3200]);
					i_205_ = 3;
				}
				for (int i_206_ = 0; i_206_ < i_205_; i_206_++) {
					int i_207_ = ((Class280) this).anIntArray3182[i_206_];
					int i_208_ = (i_207_ - ((Class280) this).anInt3199 * -1345176630 & 0x7);
					int i_209_ = anIntArray3174[i_207_];
					int i_210_ = anIntArray3201[i_207_];
					int i_211_;
					int i_212_;
					if (1 == 1474895333 * ((Class280) this).anInt3199) {
						i_211_ = i_210_;
						i_212_ = 512 - i_209_;
					} else if (1474895333 * ((Class280) this).anInt3199 == 2) {
						i_211_ = 512 - i_209_;
						i_212_ = 512 - i_210_;
					} else if (((Class280) this).anInt3199 * 1474895333 == 3) {
						i_211_ = 512 - i_210_;
						i_212_ = i_209_;
					} else {
						i_211_ = i_209_;
						i_212_ = i_210_;
					}
					is_189_[-344239637 * ((Class280) this).anInt3187] = i_211_;
					is_190_[((Class280) this).anInt3187 * -344239637] = i_212_;
					if (null != is_194_ && (aBoolArrayArray3176[((Class280) this).anInt3198 * 1173206349][i_207_])) {
						int i_213_ = i_211_ + (i_181_ << 9);
						int i_214_ = i_212_ + (i_182_ << 9);
						is_194_[((Class280) this).anInt3187 * -344239637] = (class174_197_.method2726(i_213_, i_214_, 358769667) - class174.method2726(i_213_, i_214_, 358769667));
					}
					if (null != is_195_) {
						if (null != class174_197_ && !(aBoolArrayArray3176[1173206349 * ((Class280) this).anInt3198][i_207_])) {
							int i_215_ = i_211_ + (i_181_ << 9);
							int i_216_ = i_212_ + (i_182_ << 9);
							is_195_[-344239637 * ((Class280) this).anInt3187] = (class174.method2726(i_215_, i_216_, 358769667) - class174_197_.method2726(i_215_, i_216_, 358769667));
						} else if (null != class174_198_ && !(aBoolArrayArray3143[(((Class280) this).anInt3198 * 1173206349)][i_207_])) {
							int i_217_ = i_211_ + (i_181_ << 9);
							int i_218_ = i_212_ + (i_182_ << 9);
							is_195_[-344239637 * ((Class280) this).anInt3187] = (class174_198_.method2726(i_217_, i_218_, 358769667) - class174.method2726(i_217_, i_218_, 358769667));
						}
					}
					if (i_207_ < 8 && ((Class280) this).anIntArray3129[i_208_] >= 0) {
						if (is != null)
							is[((Class280) this).anInt3187 * -344239637] = ((Class280) this).anIntArray3193[i_208_];
						is_193_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anIntArray3195[i_208_];
						is_192_[((Class280) this).anInt3187 * -344239637] = ((Class280) this).anIntArray3194[i_208_];
						is_191_[((Class280) this).anInt3187 * -344239637] = ((Class280) this).anIntArray3192[i_208_];
					} else {
						if (((Class280) this).aBool3139 && (aBoolArrayArray3176[((Class280) this).anInt3198 * 1173206349][i_207_])) {
							is_192_[-344239637 * ((Class280) this).anInt3187] = ((Class280) this).anInt3202 * -1072193931;
							is_193_[((Class280) this).anInt3187 * -344239637] = -27987485 * ((Class280) this).anInt3170;
							is_191_[((Class280) this).anInt3187 * -344239637] = ((Class280) this).anInt3179 * -1551700263;
						} else if (i_211_ == 0 && i_212_ == 0) {
							is_191_[((Class280) this).anInt3187 * -344239637] = is_196_[i_181_][i_182_];
							is_192_[((Class280) this).anInt3187 * -344239637] = class670_200_.anInt8522 * 1278559991;
							is_193_[-344239637 * ((Class280) this).anInt3187] = class670_200_.anInt8525 * 868664291;
						} else if (0 == i_211_ && 512 == i_212_) {
							is_191_[((Class280) this).anInt3187 * -344239637] = is_196_[i_181_][i_184_];
							is_192_[((Class280) this).anInt3187 * -344239637] = 1278559991 * class670_201_.anInt8522;
							is_193_[-344239637 * ((Class280) this).anInt3187] = 868664291 * class670_201_.anInt8525;
						} else if (i_211_ == 512 && i_212_ == 512) {
							is_191_[-344239637 * ((Class280) this).anInt3187] = is_196_[i_183_][i_184_];
							is_192_[-344239637 * ((Class280) this).anInt3187] = 1278559991 * class670_202_.anInt8522;
							is_193_[-344239637 * ((Class280) this).anInt3187] = 868664291 * class670_202_.anInt8525;
						} else if (512 == i_211_ && i_212_ == 0) {
							is_191_[((Class280) this).anInt3187 * -344239637] = is_196_[i_183_][i_182_];
							is_192_[-344239637 * ((Class280) this).anInt3187] = class670_203_.anInt8522 * 1278559991;
							is_193_[((Class280) this).anInt3187 * -344239637] = class670_203_.anInt8525 * 868664291;
						} else {
							if (i_211_ < 256) {
								if (i_212_ < 256) {
									is_192_[(-344239637 * ((Class280) this).anInt3187)] = class670_200_.anInt8522 * 1278559991;
									is_193_[(-344239637 * ((Class280) this).anInt3187)] = class670_200_.anInt8525 * 868664291;
								} else {
									is_192_[(-344239637 * ((Class280) this).anInt3187)] = 1278559991 * class670_201_.anInt8522;
									is_193_[(((Class280) this).anInt3187 * -344239637)] = 868664291 * class670_201_.anInt8525;
								}
							} else if (i_212_ < 256) {
								is_192_[(-344239637 * ((Class280) this).anInt3187)] = class670_203_.anInt8522 * 1278559991;
								is_193_[(-344239637 * ((Class280) this).anInt3187)] = class670_203_.anInt8525 * 868664291;
							} else {
								is_192_[(((Class280) this).anInt3187 * -344239637)] = 1278559991 * class670_202_.anInt8522;
								is_193_[(((Class280) this).anInt3187 * -344239637)] = 868664291 * class670_202_.anInt8525;
							}
							int i_219_ = Class479.method5674(is_196_[i_181_][i_182_], is_196_[i_183_][i_182_], i_211_ << 7 >> 9, 970526121);
							int i_220_ = Class479.method5674(is_196_[i_181_][i_184_], is_196_[i_183_][i_184_], i_211_ << 7 >> 9, 1411118465);
							is_191_[-344239637 * ((Class280) this).anInt3187] = Class479.method5674(i_219_, i_220_, i_212_ << 7 >> 9, 1595826559);
						}
						if (is != null)
							is[-344239637 * ((Class280) this).anInt3187] = (is_191_[-344239637 * ((Class280) this).anInt3187]);
					}
					((Class280) this).anInt3187 += -124694845;
				}
				((Class280) this).anInt3200 += 1496691305;
			}
			if (0 != 1173206349 * ((Class280) this).anInt3198 && class670.aBool8524)
				((Class280) this).aBool3205 = true;
		}
	}

	void method3780(Class174 class174, Class670 class670, Class468 class468, int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, byte i_227_) {
		int i_228_ = class174.method2713(i_221_, i_222_, -714971250);
		int i_229_ = class174.method2713(i_223_, i_222_, -1182832833);
		int i_230_ = class174.method2713(i_223_, i_224_, -1839855347);
		int i_231_ = class174.method2713(i_221_, i_224_, -1884536408);
		boolean bool = aClass274_3177.method3689(i_221_, i_222_, -2044190627);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_232_ = true;
			if (null != class670 && !class670.aBool8526)
				bool_232_ = false;
			else if (0 == i_225_ && 0 != ((Class280) this).anInt3198 * 1173206349)
				bool_232_ = false;
			else if (i_226_ > 0 && null != class468 && !class468.aBool5262)
				bool_232_ = false;
			if (bool_232_ && i_228_ == i_229_ && i_228_ == i_230_ && i_231_ == i_228_)
				aByteArrayArrayArray3148[i][i_221_][i_222_] |= 0x4;
		}
	}

	final void method3781(Class106 class106, Class468 class468, Class670 class670, int i, int i_233_, int i_234_, int i_235_, short[][] is, byte[][] is_236_, byte[][] is_237_, boolean[] bools, byte i_238_) {
		boolean[] bools_239_ = (null != class468 && class468.aBool5267 ? aBoolArrayArray3155[((Class280) this).anInt3198 * 1173206349] : (aBoolArrayArray3181[1173206349 * ((Class280) this).anInt3198]));
		if (i_233_ > 0) {
			if (i > 0) {
				int i_240_ = is[i - 1][i_233_ - 1] & 0x7fff;
				if (i_240_ > 0) {
					Class468 class468_241_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_240_ - 1, -1070380996);
					if (-1320134675 * class468_241_.anInt5260 != -1 && class468_241_.aBool5267) {
						byte i_242_ = is_236_[i - 1][i_233_ - 1];
						int i_243_ = is_237_[i - 1][i_233_ - 1] * 2 + 4 & 0x7;
						int i_244_ = Class572_Sub33.method8709(class106, class468_241_, (byte) -96);
						if (aBoolArrayArray3176[i_242_][i_243_]) {
							((Class280) this).anIntArray3192[0] = -1320134675 * class468_241_.anInt5260;
							((Class280) this).anIntArray3193[0] = i_244_;
							((Class280) this).anIntArray3194[0] = class468_241_.anInt5261 * -1569651533;
							((Class280) this).anIntArray3195[0] = class468_241_.anInt5264 * 479085371;
							((Class280) this).anIntArray3129[0] = 850131603 * class468_241_.anInt5265;
							((Class280) this).anIntArray3197[0] = 256;
						}
					}
				}
			}
			if (i < i_234_ - 1) {
				int i_245_ = is[1 + i][i_233_ - 1] & 0x7fff;
				if (i_245_ > 0) {
					Class468 class468_246_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_245_ - 1, 1427503956);
					if (-1 != class468_246_.anInt5260 * -1320134675 && class468_246_.aBool5267) {
						byte i_247_ = is_236_[i + 1][i_233_ - 1];
						int i_248_ = 6 + 2 * is_237_[i + 1][i_233_ - 1] & 0x7;
						int i_249_ = Class572_Sub33.method8709(class106, class468_246_, (byte) -65);
						if (aBoolArrayArray3176[i_247_][i_248_]) {
							((Class280) this).anIntArray3192[2] = -1320134675 * class468_246_.anInt5260;
							((Class280) this).anIntArray3193[2] = i_249_;
							((Class280) this).anIntArray3194[2] = class468_246_.anInt5261 * -1569651533;
							((Class280) this).anIntArray3195[2] = 479085371 * class468_246_.anInt5264;
							((Class280) this).anIntArray3129[2] = class468_246_.anInt5265 * 850131603;
							((Class280) this).anIntArray3197[2] = 512;
						}
					}
				}
			}
		}
		if (i_233_ < i_235_ - 1) {
			if (i > 0) {
				int i_250_ = is[i - 1][1 + i_233_] & 0x7fff;
				if (i_250_ > 0) {
					Class468 class468_251_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_250_ - 1, -2102485978);
					if (class468_251_.anInt5260 * -1320134675 != -1 && class468_251_.aBool5267) {
						byte i_252_ = is_236_[i - 1][1 + i_233_];
						int i_253_ = 2 + is_237_[i - 1][1 + i_233_] * 2 & 0x7;
						int i_254_ = Class572_Sub33.method8709(class106, class468_251_, (byte) -62);
						if (aBoolArrayArray3176[i_252_][i_253_]) {
							((Class280) this).anIntArray3192[6] = -1320134675 * class468_251_.anInt5260;
							((Class280) this).anIntArray3193[6] = i_254_;
							((Class280) this).anIntArray3194[6] = class468_251_.anInt5261 * -1569651533;
							((Class280) this).anIntArray3195[6] = 479085371 * class468_251_.anInt5264;
							((Class280) this).anIntArray3129[6] = 850131603 * class468_251_.anInt5265;
							((Class280) this).anIntArray3197[6] = 64;
						}
					}
				}
			}
			if (i < i_234_ - 1) {
				int i_255_ = is[1 + i][i_233_ + 1] & 0x7fff;
				if (i_255_ > 0) {
					Class468 class468_256_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_255_ - 1, -454124030);
					if (-1 != class468_256_.anInt5260 * -1320134675 && class468_256_.aBool5267) {
						byte i_257_ = is_236_[1 + i][1 + i_233_];
						int i_258_ = 0 + 2 * is_237_[1 + i][1 + i_233_] & 0x7;
						int i_259_ = Class572_Sub33.method8709(class106, class468_256_, (byte) -120);
						if (aBoolArrayArray3176[i_257_][i_258_]) {
							((Class280) this).anIntArray3192[4] = class468_256_.anInt5260 * -1320134675;
							((Class280) this).anIntArray3193[4] = i_259_;
							((Class280) this).anIntArray3194[4] = -1569651533 * class468_256_.anInt5261;
							((Class280) this).anIntArray3195[4] = class468_256_.anInt5264 * 479085371;
							((Class280) this).anIntArray3129[4] = 850131603 * class468_256_.anInt5265;
							((Class280) this).anIntArray3197[4] = 128;
						}
					}
				}
			}
		}
		if (i_233_ > 0) {
			int i_260_ = is[i][i_233_ - 1] & 0x7fff;
			if (i_260_ > 0) {
				Class468 class468_261_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_260_ - 1, -1708839813);
				if (class468_261_.anInt5260 * -1320134675 != -1) {
					byte i_262_ = is_236_[i][i_233_ - 1];
					int i_263_ = is_237_[i][i_233_ - 1];
					if (class468_261_.aBool5267) {
						int i_264_ = 2;
						int i_265_ = i_263_ * 2 + 4;
						int i_266_ = Class572_Sub33.method8709(class106, class468_261_, (byte) -4);
						for (int i_267_ = 0; i_267_ < 3; i_267_++) {
							i_265_ &= 0x7;
							i_264_ &= 0x7;
							if (aBoolArrayArray3176[i_262_][i_265_] && (((Class280) this).anIntArray3129[i_264_] <= 850131603 * class468_261_.anInt5265)) {
								((Class280) this).anIntArray3192[i_264_] = -1320134675 * class468_261_.anInt5260;
								((Class280) this).anIntArray3193[i_264_] = i_266_;
								((Class280) this).anIntArray3194[i_264_] = class468_261_.anInt5261 * -1569651533;
								((Class280) this).anIntArray3195[i_264_] = class468_261_.anInt5264 * 479085371;
								if (class468_261_.anInt5265 * 850131603 == (((Class280) this).anIntArray3129[i_264_]))
									((Class280) this).anIntArray3197[i_264_] |= 0x20;
								else
									((Class280) this).anIntArray3197[i_264_] = 32;
								((Class280) this).anIntArray3129[i_264_] = class468_261_.anInt5265 * 850131603;
							}
							i_265_++;
							i_264_--;
						}
						if (!bools_239_[(((Class280) this).anInt3199 * 1474895333 + 0 & 0x3)])
							bools[0] = (aBoolArrayArray3155[i_262_][i_263_ + 2 & 0x3]);
					} else if (!bools_239_[(0 + 1474895333 * ((Class280) this).anInt3199 & 0x3)])
						bools[0] = aBoolArrayArray3181[i_262_][2 + i_263_ & 0x3];
				}
			}
		}
		if (i_233_ < i_235_ - 1) {
			int i_268_ = is[i][i_233_ + 1] & 0x7fff;
			if (i_268_ > 0) {
				Class468 class468_269_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_268_ - 1, 337286565);
				if (-1320134675 * class468_269_.anInt5260 != -1) {
					byte i_270_ = is_236_[i][1 + i_233_];
					int i_271_ = is_237_[i][i_233_ + 1];
					if (class468_269_.aBool5267) {
						int i_272_ = 4;
						int i_273_ = 2 + i_271_ * 2;
						int i_274_ = Class572_Sub33.method8709(class106, class468_269_, (byte) -44);
						for (int i_275_ = 0; i_275_ < 3; i_275_++) {
							i_273_ &= 0x7;
							i_272_ &= 0x7;
							if (aBoolArrayArray3176[i_270_][i_273_] && (((Class280) this).anIntArray3129[i_272_] <= 850131603 * class468_269_.anInt5265)) {
								((Class280) this).anIntArray3192[i_272_] = class468_269_.anInt5260 * -1320134675;
								((Class280) this).anIntArray3193[i_272_] = i_274_;
								((Class280) this).anIntArray3194[i_272_] = -1569651533 * class468_269_.anInt5261;
								((Class280) this).anIntArray3195[i_272_] = class468_269_.anInt5264 * 479085371;
								if (850131603 * class468_269_.anInt5265 == (((Class280) this).anIntArray3129[i_272_]))
									((Class280) this).anIntArray3197[i_272_] |= 0x10;
								else
									((Class280) this).anIntArray3197[i_272_] = 16;
								((Class280) this).anIntArray3129[i_272_] = 850131603 * class468_269_.anInt5265;
							}
							i_273_--;
							i_272_++;
						}
						if (!bools_239_[(1474895333 * ((Class280) this).anInt3199 + 2 & 0x3)])
							bools[2] = (aBoolArrayArray3155[i_270_][i_271_ + 0 & 0x3]);
					} else if (!bools_239_[(((Class280) this).anInt3199 * 1474895333 + 2 & 0x3)])
						bools[2] = aBoolArrayArray3181[i_270_][0 + i_271_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_276_ = is[i - 1][i_233_] & 0x7fff;
			if (i_276_ > 0) {
				Class468 class468_277_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_276_ - 1, -1989838752);
				if (class468_277_.anInt5260 * -1320134675 != -1) {
					byte i_278_ = is_236_[i - 1][i_233_];
					int i_279_ = is_237_[i - 1][i_233_];
					if (class468_277_.aBool5267) {
						int i_280_ = 6;
						int i_281_ = 2 * i_279_ + 4;
						int i_282_ = Class572_Sub33.method8709(class106, class468_277_, (byte) -7);
						for (int i_283_ = 0; i_283_ < 3; i_283_++) {
							i_281_ &= 0x7;
							i_280_ &= 0x7;
							if (aBoolArrayArray3176[i_278_][i_281_] && (((Class280) this).anIntArray3129[i_280_] <= class468_277_.anInt5265 * 850131603)) {
								((Class280) this).anIntArray3192[i_280_] = class468_277_.anInt5260 * -1320134675;
								((Class280) this).anIntArray3193[i_280_] = i_282_;
								((Class280) this).anIntArray3194[i_280_] = class468_277_.anInt5261 * -1569651533;
								((Class280) this).anIntArray3195[i_280_] = class468_277_.anInt5264 * 479085371;
								if (((Class280) this).anIntArray3129[i_280_] == 850131603 * class468_277_.anInt5265)
									((Class280) this).anIntArray3197[i_280_] |= 0x8;
								else
									((Class280) this).anIntArray3197[i_280_] = 8;
								((Class280) this).anIntArray3129[i_280_] = 850131603 * class468_277_.anInt5265;
							}
							i_281_--;
							i_280_++;
						}
						if (!bools_239_[3 + 1474895333 * (((Class280) this).anInt3199) & 0x3])
							bools[3] = (aBoolArrayArray3155[i_278_][i_279_ + 1 & 0x3]);
					} else if (!bools_239_[(((Class280) this).anInt3199 * 1474895333 + 3 & 0x3)])
						bools[3] = aBoolArrayArray3181[i_278_][1 + i_279_ & 0x3];
				}
			}
		}
		if (i < i_234_ - 1) {
			int i_284_ = is[i + 1][i_233_] & 0x7fff;
			if (i_284_ > 0) {
				Class468 class468_285_ = (Class468) ((Class280) this).aClass639_Sub2_3167.getDefinition(i_284_ - 1, -1315340222);
				if (-1 != -1320134675 * class468_285_.anInt5260) {
					byte i_286_ = is_236_[i + 1][i_233_];
					int i_287_ = is_237_[i + 1][i_233_];
					if (class468_285_.aBool5267) {
						int i_288_ = 4;
						int i_289_ = 2 * i_287_ + 6;
						int i_290_ = Class572_Sub33.method8709(class106, class468_285_, (byte) -89);
						for (int i_291_ = 0; i_291_ < 3; i_291_++) {
							i_289_ &= 0x7;
							i_288_ &= 0x7;
							if (aBoolArrayArray3176[i_286_][i_289_] && (((Class280) this).anIntArray3129[i_288_] <= class468_285_.anInt5265 * 850131603)) {
								((Class280) this).anIntArray3192[i_288_] = class468_285_.anInt5260 * -1320134675;
								((Class280) this).anIntArray3193[i_288_] = i_290_;
								((Class280) this).anIntArray3194[i_288_] = class468_285_.anInt5261 * -1569651533;
								((Class280) this).anIntArray3195[i_288_] = 479085371 * class468_285_.anInt5264;
								if (850131603 * class468_285_.anInt5265 == (((Class280) this).anIntArray3129[i_288_]))
									((Class280) this).anIntArray3197[i_288_] |= 0x4;
								else
									((Class280) this).anIntArray3197[i_288_] = 4;
								((Class280) this).anIntArray3129[i_288_] = 850131603 * class468_285_.anInt5265;
							}
							i_289_++;
							i_288_--;
						}
						if (!bools_239_[1 + 1474895333 * (((Class280) this).anInt3199) & 0x3])
							bools[1] = (aBoolArrayArray3155[i_286_][3 + i_287_ & 0x3]);
					} else if (!bools_239_[(((Class280) this).anInt3199 * 1474895333 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3181[i_286_][i_287_ + 3 & 0x3];
				}
			}
		}
		if (class468 != null && class468.aBool5267) {
			int i_292_ = Class572_Sub33.method8709(class106, class468, (byte) -92);
			for (int i_293_ = 0; i_293_ < 8; i_293_++) {
				int i_294_ = i_293_ - ((Class280) this).anInt3199 * -1345176630 & 0x7;
				if ((aBoolArrayArray3176[1173206349 * ((Class280) this).anInt3198][i_293_]) && (((Class280) this).anIntArray3129[i_294_] <= class468.anInt5265 * 850131603)) {
					((Class280) this).anIntArray3192[i_294_] = -1320134675 * class468.anInt5260;
					((Class280) this).anIntArray3193[i_294_] = i_292_;
					((Class280) this).anIntArray3194[i_294_] = -1569651533 * class468.anInt5261;
					((Class280) this).anIntArray3195[i_294_] = 479085371 * class468.anInt5264;
					if (((Class280) this).anIntArray3129[i_294_] == 850131603 * class468.anInt5265)
						((Class280) this).anIntArray3197[i_294_] |= 0x2;
					else
						((Class280) this).anIntArray3197[i_294_] = 2;
					((Class280) this).anIntArray3129[i_294_] = 850131603 * class468.anInt5265;
				}
			}
		}
	}

	static {
		anIntArray3169 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3171 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray3130 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3173 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray3174 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray3201 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray3176 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true },
			{ true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false },
			{ false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
			{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true },
			{ true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false },
			{ true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false },
			{ true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
			{ true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray3143 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false },
			{ false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
			{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false },
			{ false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true },
			{ false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
			{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
			{ true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true },
			{ false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray3175 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 },
			{ 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray3164 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 },
			{ 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray3180 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 },
			{ 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray3181 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false },
			{ false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false },
			{ false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray3153 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 },
			{ 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray3183 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 },
			{ 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray3184 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 },
			{ 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray3185 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 },
			{ 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray3155 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false },
			{ false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false },
			{ false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray3206 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 },
			{ -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray3188 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 },
			{ 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray3127 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
			{ 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray3190 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
			{ 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	public void method3782() {
		aBool3144 = true;
	}

	public void method3783() {
		aBool3144 = true;
	}

	public void method3784() {
		((Class280) this).anIntArray3213 = null;
		((Class280) this).anIntArray3150 = null;
		((Class280) this).anIntArray3151 = null;
		((Class280) this).anIntArray3152 = null;
		((Class280) this).anIntArray3204 = null;
		aBool3144 = false;
	}

	void method3785(Class468 class468, Class670 class670, int i) {
		if (((Class280) this).aBool3203) {
			((Class280) this).anIntArray3211 = (anIntArrayArray3175[1173206349 * ((Class280) this).anInt3198]);
			((Class280) this).anIntArray3212 = (anIntArrayArray3164[1173206349 * ((Class280) this).anInt3198]);
			((Class280) this).anIntArray3138 = (anIntArrayArray3180[((Class280) this).anInt3198 * 1173206349]);
			((Class280) this).anInt3210 = (null != class468 ? anIntArray3168[((Class280) this).anInt3198 * 1173206349] : 0) * -788319659;
			((Class280) this).anInt3209 = 1565579407 * (class670 != null ? (anIntArray3196[1173206349 * ((Class280) this).anInt3198]) : 0);
		} else if (((Class280) this).aBool3139) {
			((Class280) this).anIntArray3211 = (anIntArrayArray3188[1173206349 * ((Class280) this).anInt3198]);
			((Class280) this).anIntArray3212 = (anIntArrayArray3127[((Class280) this).anInt3198 * 1173206349]);
			((Class280) this).anIntArray3138 = (anIntArrayArray3190[1173206349 * ((Class280) this).anInt3198]);
			((Class280) this).anInt3210 = (class468 != null ? anIntArray3130[1173206349 * ((Class280) this).anInt3198] : 0) * -788319659;
			((Class280) this).anInt3209 = (null != class670 ? anIntArray3173[1173206349 * ((Class280) this).anInt3198] : 0) * 1565579407;
			((Class280) this).anIntArray3214 = (anIntArrayArray3206[1173206349 * ((Class280) this).anInt3198]);
		} else {
			((Class280) this).anIntArray3211 = (anIntArrayArray3183[((Class280) this).anInt3198 * 1173206349]);
			((Class280) this).anIntArray3212 = (anIntArrayArray3184[1173206349 * ((Class280) this).anInt3198]);
			((Class280) this).anIntArray3138 = (anIntArrayArray3185[((Class280) this).anInt3198 * 1173206349]);
			((Class280) this).anInt3210 = (null != class468 ? anIntArray3169[((Class280) this).anInt3198 * 1173206349] : 0) * -788319659;
			((Class280) this).anInt3209 = (null != class670 ? anIntArray3171[((Class280) this).anInt3198 * 1173206349] : 0) * 1565579407;
			((Class280) this).anIntArray3214 = (anIntArrayArray3153[1173206349 * ((Class280) this).anInt3198]);
		}
	}

	static final int method3786(int i, int i_295_) {
		int i_296_ = (Class34.method778(i + 45365, 91923 + i_295_, 4, (byte) 0) - 128 + ((Class34.method778(10294 + i, 37821 + i_295_, 2, (byte) 0) - 128) >> 1) + (Class34.method778(i, i_295_, 1, (byte) 0) - 128 >> 2));
		i_296_ = 35 + (int) ((double) i_296_ * 0.3);
		if (i_296_ < 10)
			i_296_ = 10;
		else if (i_296_ > 60)
			i_296_ = 60;
		return i_296_;
	}

	public final void method3787(int i, int i_297_, int i_298_, int i_299_) {
		for (int i_300_ = 0; i_300_ < 1097116465 * anInt3186; i_300_++)
			method3769(i_300_, i, i_297_, i_298_, i_299_, (byte) 86);
	}

	public void method3788(byte i) {
		aBool3144 = true;
	}

	static final int method3789(int i, int i_301_) {
		int i_302_ = (Class34.method778(i + 45365, 91923 + i_301_, 4, (byte) 0) - 128 + ((Class34.method778(10294 + i, 37821 + i_301_, 2, (byte) 0) - 128) >> 1) + (Class34.method778(i, i_301_, 1, (byte) 0) - 128 >> 2));
		i_302_ = 35 + (int) ((double) i_302_ * 0.3);
		if (i_302_ < 10)
			i_302_ = 10;
		else if (i_302_ > 60)
			i_302_ = 60;
		return i_302_;
	}

	public void method3790(Class106 class106, int[][][] is, int i) {
		for (int i_303_ = 0; i_303_ < anInt3186 * 1097116465; i_303_++) {
			int i_304_ = 0;
			int i_305_ = 0;
			if (!aBool3140) {
				if (aBool3207)
					i_305_ |= 0x8;
				if (aBool3134)
					i_304_ |= 0x2;
				if (anInt3132 * -1027287557 != 0) {
					i_304_ |= 0x1;
					i_305_ |= 0x10;
				}
			}
			if (aBool3134)
				i_305_ |= 0x7;
			if (!aBool3136)
				i_305_ |= 0x20;
			int[][] is_306_ = (is != null && i_303_ < is.length ? is[i_303_] : anIntArrayArrayArray3141[i_303_]);
			aClass523_3156.method6229(i_303_, class106.method1909(anInt3137 * -113535507, -686830021 * anInt3159, anIntArrayArrayArray3141[i_303_], is_306_, 512, i_304_, i_305_), -1485830645);
		}
	}

	Class280(Class523 class523, int i, int i_307_, int i_308_, boolean bool, Class639_Sub2 class639_sub2, Class639_Sub6 class639_sub6, Class274 class274) {
		aBool3134 = false;
		aBool3135 = false;
		aBool3136 = false;
		((Class280) this).anIntArray3182 = new int[6];
		((Class280) this).anIntArray3192 = new int[13];
		((Class280) this).anIntArray3193 = new int[13];
		((Class280) this).anIntArray3194 = new int[13];
		((Class280) this).anIntArray3195 = new int[13];
		((Class280) this).anIntArray3129 = new int[13];
		((Class280) this).anIntArray3197 = new int[13];
		((Class280) this).anInt3200 = 0;
		((Class280) this).anInt3187 = 0;
		((Class280) this).anIntArray3214 = null;
		aClass523_3156 = class523;
		anInt3186 = i * -1193620015;
		anInt3137 = i_307_ * 1917980645;
		anInt3159 = -938222861 * i_308_;
		aBool3140 = bool;
		((Class280) this).aClass639_Sub2_3167 = class639_sub2;
		((Class280) this).aClass639_Sub6_3128 = class639_sub6;
		aClass274_3177 = class274;
		((Class280) this).aShortArrayArrayArray3149 = (new short[anInt3186 * 1097116465][anInt3137 * -113535507][anInt3159 * -686830021]);
		((Class280) this).aShortArrayArrayArray3147 = (new short[1097116465 * anInt3186][-113535507 * anInt3137][-686830021 * anInt3159]);
		((Class280) this).aByteArrayArrayArray3189 = (new byte[1097116465 * anInt3186][anInt3137 * -113535507][anInt3159 * -686830021]);
		((Class280) this).aByteArrayArrayArray3145 = (new byte[1097116465 * anInt3186][anInt3137 * -113535507][-686830021 * anInt3159]);
		anIntArrayArrayArray3141 = (new int[1097116465 * anInt3186][1 + -113535507 * anInt3137][-686830021 * anInt3159 + 1]);
		aByteArrayArrayArray3148 = (new byte[1097116465 * anInt3186][anInt3137 * -113535507 + 1][1 + -686830021 * anInt3159]);
	}

	void method3791(Class106 class106, Class174 class174, int i, int[][] is, Class174 class174_309_, Class174 class174_310_, byte i_311_) {
		byte[][] is_312_ = ((Class280) this).aByteArrayArrayArray3189[i];
		byte[][] is_313_ = ((Class280) this).aByteArrayArrayArray3145[i];
		short[][] is_314_ = ((Class280) this).aShortArrayArrayArray3149[i];
		short[][] is_315_ = ((Class280) this).aShortArrayArrayArray3147[i];
		boolean[] bools = new boolean[4];
		for (int i_316_ = 0; i_316_ < -113535507 * anInt3137; i_316_++) {
			int i_317_ = i_316_ < anInt3137 * -113535507 - 1 ? 1 + i_316_ : i_316_;
			for (int i_318_ = 0; i_318_ < anInt3159 * -686830021; i_318_++) {
				int i_319_ = (i_318_ < -686830021 * anInt3159 - 1 ? 1 + i_318_ : i_318_);
				((Class280) this).anInt3198 = -1169126523 * is_312_[i_316_][i_318_];
				((Class280) this).anInt3199 = is_313_[i_316_][i_318_] * 260364269;
				int i_320_ = is_315_[i_316_][i_318_] & 0x7fff;
				int i_321_ = is_314_[i_316_][i_318_] & 0x7fff;
				if (0 != i_320_ || i_321_ != 0) {
					Class468 class468 = (Class468) (0 != i_320_ ? ((Class280) this).aClass639_Sub2_3167.getDefinition(i_320_ - 1, 2076408448) : null);
					Class670 class670 = (Class670) (i_321_ != 0 ? ((Class280) this).aClass639_Sub6_3128.getDefinition(i_321_ - 1, -1912260100) : null);
					if (0 == 1173206349 * ((Class280) this).anInt3198 && class468 == null)
						((Class280) this).anInt3198 = -1144616388;
					((Class280) this).aBool3205 = false;
					((Class280) this).aBool3139 = false;
					boolean[] bools_322_ = bools;
					boolean[] bools_323_ = bools;
					boolean[] bools_324_ = bools;
					bools[3] = false;
					bools_324_[2] = false;
					bools_323_[1] = false;
					bools_322_[0] = false;
					Class468 class468_325_ = class468;
					if (class468 != null) {
						if (class468.anInt5260 * -1320134675 == -1 && class468.anInt5271 * 1981966121 == -1) {
							class468_325_ = class468;
							class468 = null;
						} else if (class670 != null && 0 != (1173206349 * ((Class280) this).anInt3198))
							((Class280) this).aBool3139 = class468.aBool5267;
					}
					((Class280) this).anInt3199 = method3776(i_321_, i_316_, i_318_, i_317_, i_319_, class174, is_314_, 458522274) * 260364269;
					for (int i_326_ = 0; i_326_ < 13; i_326_++) {
						((Class280) this).anIntArray3129[i_326_] = -1;
						((Class280) this).anIntArray3197[i_326_] = 1;
					}
					method3777(class106, class468, class670, i_316_, i_318_, is_312_, is_313_, is_315_, bools, -359189014);
					((Class280) this).aBool3203 = (!((Class280) this).aBool3139 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method3785(class468, class670, -846952200);
					int i_327_ = (((Class280) this).anInt3210 * -1397736707 + 622151279 * ((Class280) this).anInt3209);
					if (i_327_ <= 0)
						aClass523_3156.method6228(i, i_316_, i_318_, (byte) 3);
					else {
						if (bools[0])
							i_327_++;
						if (bools[2])
							i_327_++;
						if (bools[1])
							i_327_++;
						if (bools[3])
							i_327_++;
						((Class280) this).anInt3200 = 0;
						((Class280) this).anInt3187 = 0;
						int i_328_ = 3 * i_327_;
						int[] is_329_ = (((Class280) this).aBool3208 ? new int[i_328_] : null);
						int[] is_330_ = new int[i_328_];
						int[] is_331_ = new int[i_328_];
						int[] is_332_ = new int[i_328_];
						int[] is_333_ = new int[i_328_];
						int[] is_334_ = new int[i_328_];
						int[] is_335_ = class174_310_ != null ? new int[i_328_] : null;
						int[] is_336_ = (null != class174_310_ || null != class174_309_ ? new int[i_328_] : null);
						method3778(class106, i, i_316_, i_318_, class468, bools, is_329_, is_330_, is_331_, is_332_, is_333_, is_334_, is_335_, is_336_, class174, class174_310_, class174_309_, (byte) 14);
						int i_337_ = is_314_[i_316_][i_319_] & 0x7fff;
						int i_338_ = is_314_[i_317_][i_319_] & 0x7fff;
						int i_339_ = is_314_[i_317_][i_318_] & 0x7fff;
						method3779(class106, i, i_316_, i_318_, i_317_, i_319_, class670, i_321_, i_337_, i_338_, i_339_, bools, is_329_, is_330_, is_331_, is_332_, is_333_, is_334_, is_335_, is_336_, is, class174, class174_310_, class174_309_, -1388602136);
						method3780(class174, class670, class468_325_, i, i_316_, i_318_, i_317_, i_319_, i_321_, i_320_, (byte) 2);
						Class86 class86 = new Class86();
						if (aBool3140) {
							class86.anInt1193 = (aClass523_3156.method6231(i_316_, i_318_, 319475706) * 1368828903);
							class86.anInt1190 = (aClass523_3156.method6230(i_316_, i_318_, -981999643) * 1765263439);
							class86.anInt1191 = (aClass523_3156.method6283(i_316_, i_318_, 1983708130) * 628738217);
							class86.anInt1189 = (aClass523_3156.method6233(i_316_, i_318_, -1042067865) * -233369847);
							class86.anInt1194 = (aClass523_3156.method6234(i_316_, i_318_, (byte) 16) * -223776263);
							class86.anInt1195 = (aClass523_3156.method6235(i_316_, i_318_, (byte) 42) * -963547665);
						}
						class174.method2728(i_316_, i_318_, is_330_, is_335_, is_331_, is_336_, is_332_, is_329_, is_333_, is_334_, class86, ((Class280) this).aBool3205);
						aClass523_3156.method6228(i, i_316_, i_318_, (byte) 3);
					}
				}
			}
		}
	}

	static int method3792(int i, byte i_340_) {
		if (9 == i || i == 10)
			return 1;
		if (i == 11)
			return 8;
		return i;
	}

	public static void method3793(Class268 class268, String string, int i, Throwable throwable, int i_341_) {
		Class587.method6962(new Class532(class268, string, i, throwable), (byte) 0);
	}

	static void method3794(int i) {
		if (-586790413 * Class185.anInt2172 < 0) {
			Class185.anInt2172 = 0;
			Class547_Sub1.anInt8982 = 1904285671;
			Class547_Sub1.anInt8983 = 1743033659;
		}
		if (-586790413 * Class185.anInt2172 > Class547_Sub1.anInt6145) {
			Class185.anInt2172 = 106919739 * Class547_Sub1.anInt6145;
			Class547_Sub1.anInt8982 = 1904285671;
			Class547_Sub1.anInt8983 = 1743033659;
		}
		if (Class386.anInt4642 * 1172032773 < 0) {
			Class386.anInt4642 = 0;
			Class547_Sub1.anInt8982 = 1904285671;
			Class547_Sub1.anInt8983 = 1743033659;
		}
		if (Class386.anInt4642 * 1172032773 > Class547_Sub1.anInt6151) {
			Class386.anInt4642 = 1527379917 * Class547_Sub1.anInt6151;
			Class547_Sub1.anInt8982 = 1904285671;
			Class547_Sub1.anInt8983 = 1743033659;
		}
	}

	static void method3795(byte i) {
		GameTask.aClass676_11431.method7964((byte) 86);
		GameTask.aClass664_11430.method7841((short) -23475);
		GameTask.aClass664_11429.method7841((short) 220);
	}
}
