package game;

/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class533 {
	int[] anIntArray5938;
	boolean aBool5939;
	static final int anInt5940 = 10;
	static final float aFloat5941 = 3.0F;
	static final int anInt5942 = 100;
	int[] anIntArray5943;
	Class553 aClass553_5944;
	Class523 aClass523_5945;
	int anInt5946;
	int anInt5947;
	int[] anIntArray5948;
	int anInt5949;
	Class537[] aClass537Array5950;
	boolean aBool5951;
	Class537[] aClass537Array5952;
	int anInt5953;
	Class537[] aClass537Array5954;
	int anInt5955;
	Class537[] aClass537Array5956;
	int[] anIntArray5957;
	int[] anIntArray5958;
	int[][][] anIntArrayArrayArray5959;
	int[] anIntArray5960;
	int[] anIntArray5961;
	int anInt5962;
	boolean aBool5963;
	float[] aFloatArray5964;
	public boolean aBool5965 = true;
	int anInt5966;
	int anInt5967;
	static Class106 aClass106_5968;

	public void method6347() {
		method6350();
	}

	public void method6348(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_5_ = i_1_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_6_ = i_5_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_7_ = i_2_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_8_ = i_7_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_9_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_0_].method2713(i_1_, i_2_, 360256968);
				int i_10_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_0_].method2713(i_1_ + 1, i_2_ + 1, -345490817);
				((Class533) this).aClass537Array5954[((Class533) this).anInt5962++] = new Class537(((Class533) this).aClass523_5945, i, i_0_, i_5_, i_6_, i_6_, i_5_, i_9_, i_10_, i_10_ - i_3_, i_9_ - i_3_, i_7_, i_8_, i_8_, i_7_);
			} else {
				int i_11_ = ((i_1_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825)) + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529);
				int i_12_ = i_11_ - (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_13_ = i_2_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_14_ = i_13_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_15_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_0_].method2713(i_1_ + 1, i_2_, 122532156);
				int i_16_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_0_].method2713(i_1_, i_2_ + 1, -2049639483);
				((Class533) this).aClass537Array5954[((Class533) this).anInt5962++] = new Class537(((Class533) this).aClass523_5945, i, i_0_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, i_16_ - i_3_, i_15_ - i_3_, i_13_, i_14_, i_14_, i_13_);
			}
		} else {
			Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_0_][i_1_][i_2_]);
			if (class536 == null)
				((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_0_][i_1_][i_2_] = class536 = new Class536(i_0_);
			if (i == 1) {
				((Class536) class536).aShort5986 = (short) i_3_;
				((Class536) class536).aShort5995 = (short) i_4_;
			} else if (i == 2) {
				((Class536) class536).aShort5997 = (short) i_3_;
				((Class536) class536).aShort5996 = (short) i_4_;
			}
			if (((Class533) this).aBool5951)
				method6350();
		}
	}

	public void method6349(int i, int i_17_, int i_18_, int i_19_) {
		if (i == 8 || i == 16) {
			for (int i_20_ = 0; i_20_ < ((Class533) this).anInt5962; i_20_++) {
				Class537 class537 = ((Class533) this).aClass537Array5954[i_20_];
				if (((Class537) class537).aByte5999 == i && ((Class537) class537).aByte6005 == i_17_ && ((((Class537) class537).aShort6009 == i_18_ && ((Class537) class537).aShort6008 == i_19_) || (((Class537) class537).aShort6002 == i_18_ && ((Class537) class537).aShort6006 == i_19_))) {
					if (i_20_ != ((Class533) this).anInt5962)
						System.arraycopy(((Class533) this).aClass537Array5954, i_20_ + 1, ((Class533) this).aClass537Array5954, i_20_, ((((Class533) this).aClass537Array5954).length - (i_20_ + 1)));
					((Class533) this).anInt5962--;
					break;
				}
			}
		} else {
			Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_17_][i_18_][i_19_]);
			if (class536 != null) {
				if (i == 1)
					((Class536) class536).aShort5986 = (short) 0;
				else if (i == 2)
					((Class536) class536).aShort5997 = (short) 0;
			}
			method6350();
		}
	}

	void method6350() {
		for (int i = 0; i < ((Class533) this).anInt5966; i++)
			((Class533) this).aClass537Array5952[i] = null;
		((Class533) this).anInt5966 = 0;
		for (int i = 0; i < ((Class533) this).aClass523_5945.anInt5832 * 1103813715; i++) {
			for (int i_21_ = 0; (i_21_ < ((Class533) this).aClass523_5945.anInt5833 * -1396185127); i_21_++) {
				for (int i_22_ = 0; i_22_ < (((Class533) this).aClass523_5945.anInt5834 * -1519623925); i_22_++) {
					Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_22_][i_21_]);
					if (class536 != null) {
						if (((Class536) class536).aShort5986 > 0)
							((Class536) class536).aShort5986 *= -1;
						if (((Class536) class536).aShort5997 > 0)
							((Class536) class536).aShort5997 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class533) this).aClass523_5945.anInt5832 * 1103813715; i++) {
			for (int i_23_ = 0; (i_23_ < ((Class533) this).aClass523_5945.anInt5833 * -1396185127); i_23_++) {
				for (int i_24_ = 0; i_24_ < (((Class533) this).aClass523_5945.anInt5834 * -1519623925); i_24_++) {
					Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_24_][i_23_]);
					if (class536 != null) {
						boolean bool = ((((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[0][i_24_][i_23_]) != null && (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[0][i_24_][i_23_].aClass536_5987) != null);
						if (((Class536) class536).aShort5986 < 0) {
							int i_25_ = i_23_;
							int i_26_ = i_23_;
							int i_27_ = i;
							int i_28_ = i;
							Class536 class536_29_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_24_][i_25_ - 1]);
							int i_30_;
							for (i_30_ = (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_23_, -377172201)); (i_25_ > 0 && class536_29_ != null && ((Class536) class536_29_).aShort5986 < 0 && (((Class536) class536_29_).aShort5986 == ((Class536) class536).aShort5986) && (((Class536) class536_29_).aShort5995 == ((Class536) class536).aShort5995) && i_30_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_25_ - 1, 2130317364)) && (i_25_ - 1 <= 0 || (i_30_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_25_ - 2, 1571389698)))) && i_26_ - i_25_ <= 10); class536_29_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_24_][i_25_ - 1]))
								i_25_--;
							for (class536_29_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_24_][i_26_ + 1]); (i_26_ < (((Class533) this).aClass523_5945.anInt5834) * -1519623925 && class536_29_ != null && ((Class536) class536_29_).aShort5986 < 0 && (((Class536) class536_29_).aShort5986 == ((Class536) class536).aShort5986) && (((Class536) class536_29_).aShort5995 == ((Class536) class536).aShort5995) && i_30_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_26_ + 1, -163549852)) && (i_26_ + 1 >= ((((Class533) this).aClass523_5945.anInt5834) * -1519623925) || i_30_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_26_ + 2, -1866566247))) && i_26_ - i_25_ <= 10); class536_29_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_24_][i_26_ + 1]))
								i_26_++;
							int i_31_ = i_28_ - i_27_ + 1;
							int i_32_ = ((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_27_ + 1 : i_27_].method2713(i_24_, i_25_, 1747036194);
							int i_33_ = (i_32_ + ((Class536) class536).aShort5986 * i_31_);
							int i_34_ = (((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_27_ + 1 : i_27_].method2713(i_24_, i_26_ + 1, 2041559599));
							int i_35_ = (i_34_ + ((Class536) class536).aShort5986 * i_31_);
							int i_36_ = i_24_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_37_ = i_25_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_38_ = ((i_26_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825) + (((Class523) (((Class533) this).aClass523_5945)).anInt5824 * -1090619529));
							((Class533) this).aClass537Array5952[((Class533) this).anInt5966++] = (new Class537(((Class533) this).aClass523_5945, 1, i_28_, i_36_ + ((Class536) class536).aShort5995, i_36_ + ((Class536) class536).aShort5995, i_36_ + ((Class536) class536).aShort5995, i_36_ + ((Class536) class536).aShort5995, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_));
							for (int i_39_ = i_27_; i_39_ <= i_28_; i_39_++) {
								for (int i_40_ = i_25_; i_40_ <= i_26_; i_40_++)
									((Class536) (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_39_][i_24_][i_40_])).aShort5986 *= -1;
							}
						}
						if (((Class536) class536).aShort5997 < 0) {
							int i_41_ = i_24_;
							int i_42_ = i_24_;
							int i_43_ = i;
							int i_44_ = i;
							Class536 class536_45_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_41_ - 1][i_23_]);
							int i_46_;
							for (i_46_ = (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_24_, i_23_, -1436380479)); (i_41_ > 0 && class536_45_ != null && ((Class536) class536_45_).aShort5997 < 0 && (((Class536) class536_45_).aShort5997 == ((Class536) class536).aShort5997) && (((Class536) class536_45_).aShort5996 == ((Class536) class536).aShort5996) && i_46_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_41_ - 1, i_23_, 898419112)) && (i_41_ - 1 <= 0 || (i_46_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_41_ - 2, i_23_, -763924376)))) && i_42_ - i_41_ <= 10); class536_45_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_41_ - 1][i_23_]))
								i_41_--;
							for (class536_45_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_42_ + 1][i_23_]); (i_42_ < (((Class533) this).aClass523_5945.anInt5833) * -1396185127 && class536_45_ != null && ((Class536) class536_45_).aShort5997 < 0 && (((Class536) class536_45_).aShort5997 == ((Class536) class536).aShort5997) && (((Class536) class536_45_).aShort5996 == ((Class536) class536).aShort5996) && i_46_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_42_ + 1, i_23_, -291325885)) && (i_42_ + 1 >= ((((Class533) this).aClass523_5945.anInt5833) * -1396185127) || i_46_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_42_ + 2, i_23_, -1292497564))) && i_42_ - i_41_ <= 10); class536_45_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_42_ + 1][i_23_]))
								i_42_++;
							int i_47_ = i_44_ - i_43_ + 1;
							int i_48_ = ((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_43_ + 1 : i_43_].method2713(i_41_, i_23_, 591088750);
							int i_49_ = (i_48_ + ((Class536) class536).aShort5997 * i_47_);
							int i_50_ = (((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_43_ + 1 : i_43_].method2713(i_42_ + 1, i_23_, -454095755));
							int i_51_ = (i_50_ + ((Class536) class536).aShort5997 * i_47_);
							int i_52_ = i_41_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_53_ = ((i_42_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825) + (((Class523) (((Class533) this).aClass523_5945)).anInt5824 * -1090619529));
							int i_54_ = i_23_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							((Class533) this).aClass537Array5952[((Class533) this).anInt5966++] = (new Class537(((Class533) this).aClass523_5945, 2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + ((Class536) class536).aShort5996, i_54_ + ((Class536) class536).aShort5996, i_54_ + ((Class536) class536).aShort5996, i_54_ + ((Class536) class536).aShort5996));
							for (int i_55_ = i_43_; i_55_ <= i_44_; i_55_++) {
								for (int i_56_ = i_41_; i_56_ <= i_42_; i_56_++)
									((Class536) (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_55_][i_56_][i_23_])).aShort5997 *= -1;
							}
						}
					}
				}
			}
		}
		((Class533) this).aBool5951 = true;
	}

	void method6351() {
		for (int i = 0; i < ((Class533) this).anInt5966; i++)
			((Class533) this).aClass537Array5952[i] = null;
		((Class533) this).anInt5966 = 0;
		for (int i = 0; i < ((Class533) this).aClass523_5945.anInt5832 * 1103813715; i++) {
			for (int i_57_ = 0; (i_57_ < ((Class533) this).aClass523_5945.anInt5833 * -1396185127); i_57_++) {
				for (int i_58_ = 0; i_58_ < (((Class533) this).aClass523_5945.anInt5834 * -1519623925); i_58_++) {
					Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_58_][i_57_]);
					if (class536 != null) {
						if (((Class536) class536).aShort5986 > 0)
							((Class536) class536).aShort5986 *= -1;
						if (((Class536) class536).aShort5997 > 0)
							((Class536) class536).aShort5997 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class533) this).aClass523_5945.anInt5832 * 1103813715; i++) {
			for (int i_59_ = 0; (i_59_ < ((Class533) this).aClass523_5945.anInt5833 * -1396185127); i_59_++) {
				for (int i_60_ = 0; i_60_ < (((Class533) this).aClass523_5945.anInt5834 * -1519623925); i_60_++) {
					Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_60_][i_59_]);
					if (class536 != null) {
						boolean bool = ((((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[0][i_60_][i_59_]) != null && (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[0][i_60_][i_59_].aClass536_5987) != null);
						if (((Class536) class536).aShort5986 < 0) {
							int i_61_ = i_59_;
							int i_62_ = i_59_;
							int i_63_ = i;
							int i_64_ = i;
							Class536 class536_65_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_60_][i_61_ - 1]);
							int i_66_;
							for (i_66_ = (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_59_, 2135290035)); (i_61_ > 0 && class536_65_ != null && ((Class536) class536_65_).aShort5986 < 0 && (((Class536) class536_65_).aShort5986 == ((Class536) class536).aShort5986) && (((Class536) class536_65_).aShort5995 == ((Class536) class536).aShort5995) && i_66_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_61_ - 1, 1693515951)) && (i_61_ - 1 <= 0 || i_66_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_61_ - 2, -1042763318))) && i_62_ - i_61_ <= 10); class536_65_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_60_][i_61_ - 1]))
								i_61_--;
							for (class536_65_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_60_][i_62_ + 1]); (i_62_ < (((Class533) this).aClass523_5945.anInt5834) * -1519623925 && class536_65_ != null && ((Class536) class536_65_).aShort5986 < 0 && (((Class536) class536_65_).aShort5986 == ((Class536) class536).aShort5986) && (((Class536) class536_65_).aShort5995 == ((Class536) class536).aShort5995) && i_66_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_62_ + 1, -1205458537)) && (i_62_ + 1 >= ((((Class533) this).aClass523_5945.anInt5834) * -1519623925) || (i_66_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_62_ + 2, 326256550)))) && i_62_ - i_61_ <= 10); class536_65_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_60_][i_62_ + 1]))
								i_62_++;
							int i_67_ = i_64_ - i_63_ + 1;
							int i_68_ = ((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_63_ + 1 : i_63_].method2713(i_60_, i_61_, 1698375981);
							int i_69_ = (i_68_ + ((Class536) class536).aShort5986 * i_67_);
							int i_70_ = (((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_63_ + 1 : i_63_].method2713(i_60_, i_62_ + 1, 1340839034));
							int i_71_ = (i_70_ + ((Class536) class536).aShort5986 * i_67_);
							int i_72_ = i_60_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_73_ = i_61_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_74_ = ((i_62_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825) + (((Class523) (((Class533) this).aClass523_5945)).anInt5824 * -1090619529));
							((Class533) this).aClass537Array5952[((Class533) this).anInt5966++] = (new Class537(((Class533) this).aClass523_5945, 1, i_64_, i_72_ + ((Class536) class536).aShort5995, i_72_ + ((Class536) class536).aShort5995, i_72_ + ((Class536) class536).aShort5995, i_72_ + ((Class536) class536).aShort5995, i_68_, i_70_, i_71_, i_69_, i_73_, i_74_, i_74_, i_73_));
							for (int i_75_ = i_63_; i_75_ <= i_64_; i_75_++) {
								for (int i_76_ = i_61_; i_76_ <= i_62_; i_76_++)
									((Class536) (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_75_][i_60_][i_76_])).aShort5986 *= -1;
							}
						}
						if (((Class536) class536).aShort5997 < 0) {
							int i_77_ = i_60_;
							int i_78_ = i_60_;
							int i_79_ = i;
							int i_80_ = i;
							Class536 class536_81_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_77_ - 1][i_59_]);
							int i_82_;
							for (i_82_ = (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_60_, i_59_, -1639398808)); (i_77_ > 0 && class536_81_ != null && ((Class536) class536_81_).aShort5997 < 0 && (((Class536) class536_81_).aShort5997 == ((Class536) class536).aShort5997) && (((Class536) class536_81_).aShort5996 == ((Class536) class536).aShort5996) && i_82_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_77_ - 1, i_59_, -66570025)) && (i_77_ - 1 <= 0 || (i_82_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_77_ - 2, i_59_, -805343644)))) && i_78_ - i_77_ <= 10); class536_81_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_77_ - 1][i_59_]))
								i_77_--;
							for (class536_81_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_78_ + 1][i_59_]); (i_78_ < (((Class533) this).aClass523_5945.anInt5833) * -1396185127 && class536_81_ != null && ((Class536) class536_81_).aShort5997 < 0 && (((Class536) class536_81_).aShort5997 == ((Class536) class536).aShort5997) && (((Class536) class536_81_).aShort5996 == ((Class536) class536).aShort5996) && i_82_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_78_ + 1, i_59_, -473760650)) && (i_78_ + 1 >= ((((Class533) this).aClass523_5945.anInt5833) * -1396185127) || (i_82_ == (((Class533) this).aClass523_5945.aClass174Array5838[i].method2713(i_78_ + 2, i_59_, 420903348)))) && i_78_ - i_77_ <= 10); class536_81_ = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i][i_78_ + 1][i_59_]))
								i_78_++;
							int i_83_ = i_80_ - i_79_ + 1;
							int i_84_ = ((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_79_ + 1 : i_79_].method2713(i_77_, i_59_, -1408895979);
							int i_85_ = (i_84_ + ((Class536) class536).aShort5997 * i_83_);
							int i_86_ = (((Class533) this).aClass523_5945.aClass174Array5838[bool ? i_79_ + 1 : i_79_].method2713(i_78_ + 1, i_59_, -1370642773));
							int i_87_ = (i_86_ + ((Class536) class536).aShort5997 * i_83_);
							int i_88_ = i_77_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							int i_89_ = ((i_78_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825) + (((Class523) (((Class533) this).aClass523_5945)).anInt5824 * -1090619529));
							int i_90_ = i_59_ << (((Class533) this).aClass523_5945.anInt5858) * 406704825;
							((Class533) this).aClass537Array5952[((Class533) this).anInt5966++] = (new Class537(((Class533) this).aClass523_5945, 2, i_80_, i_88_, i_89_, i_89_, i_88_, i_84_, i_86_, i_87_, i_85_, i_90_ + ((Class536) class536).aShort5996, i_90_ + ((Class536) class536).aShort5996, i_90_ + ((Class536) class536).aShort5996, i_90_ + ((Class536) class536).aShort5996));
							for (int i_91_ = i_79_; i_91_ <= i_80_; i_91_++) {
								for (int i_92_ = i_77_; i_92_ <= i_78_; i_92_++)
									((Class536) (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_91_][i_92_][i_59_])).aShort5997 *= -1;
							}
						}
					}
				}
			}
		}
		((Class533) this).aBool5951 = true;
	}

	void method6352(Class106 class106, Class537 class537, int i) {
		aClass106_5968 = class106;
		if (((Class533) this).anIntArray5948 != null && ((Class537) class537).aByte6005 >= i) {
			for (int i_93_ = 0; i_93_ < ((Class533) this).anIntArray5948.length; i_93_++) {
				if (((Class533) this).anIntArray5948[i_93_] != -1000000 && ((((Class537) class537).anIntArray6011[0] <= ((Class533) this).anIntArray5948[i_93_]) || (((Class537) class537).anIntArray6011[1] <= ((Class533) this).anIntArray5948[i_93_]) || (((Class537) class537).anIntArray6011[2] <= ((Class533) this).anIntArray5948[i_93_]) || (((Class537) class537).anIntArray6011[3] <= ((Class533) this).anIntArray5948[i_93_])) && ((((Class537) class537).anIntArray6010[0] <= ((Class533) this).anIntArray5938[i_93_]) || (((Class537) class537).anIntArray6010[1] <= ((Class533) this).anIntArray5938[i_93_]) || (((Class537) class537).anIntArray6010[2] <= ((Class533) this).anIntArray5938[i_93_]) || (((Class537) class537).anIntArray6010[3] <= ((Class533) this).anIntArray5938[i_93_])) && ((((Class537) class537).anIntArray6010[0] >= ((Class533) this).anIntArray5958[i_93_]) || (((Class537) class537).anIntArray6010[1] >= ((Class533) this).anIntArray5958[i_93_]) || (((Class537) class537).anIntArray6010[2] >= ((Class533) this).anIntArray5958[i_93_]) || (((Class537) class537).anIntArray6010[3] >= ((Class533) this).anIntArray5958[i_93_])) && ((((Class537) class537).anIntArray6007[0] <= ((Class533) this).anIntArray5960[i_93_]) || (((Class537) class537).anIntArray6007[1] <= ((Class533) this).anIntArray5960[i_93_]) || (((Class537) class537).anIntArray6007[2] <= ((Class533) this).anIntArray5960[i_93_]) || (((Class537) class537).anIntArray6007[3] <= ((Class533) this).anIntArray5960[i_93_])) && ((((Class537) class537).anIntArray6007[0] >= ((Class533) this).anIntArray5961[i_93_]) || (((Class537) class537).anIntArray6007[1] >= ((Class533) this).anIntArray5961[i_93_]) || (((Class537) class537).anIntArray6007[2] >= ((Class533) this).anIntArray5961[i_93_]) || (((Class537) class537).anIntArray6007[3] >= ((Class533) this).anIntArray5961[i_93_])))
					return;
			}
		}
		if (((Class537) class537).aByte5999 == 1) {
			int i_94_ = (((Class537) class537).aShort6009 - (((Class523) ((Class533) this).aClass523_5945).anInt5859 * 308188993) + (((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129));
			if (i_94_ >= 0 && i_94_ <= ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129)) {
				int i_95_ = (((Class537) class537).aShort6008 - (((Class523) ((Class533) this).aClass523_5945).anInt5825) * -123518785 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_95_ < 0)
					i_95_ = 0;
				else if (i_95_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					return;
				int i_96_ = (((Class537) class537).aShort6006 - (((Class523) ((Class533) this).aClass523_5945).anInt5825) * -123518785 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_96_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129) + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					i_96_ = ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				else if (i_96_ < 0)
					return;
				boolean bool = false;
				while_77_: do {
					do {
						if (i_95_ > i_96_)
							break while_77_;
					} while (!((Class523) ((Class533) this).aClass523_5945).aBoolArrayArray5885[i_94_][i_95_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((Class523) (((Class533) this).aClass523_5945)).anInt5879 * 2055013047) - ((Class537) class537).anIntArray6010[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class533) this).anInt5946) && method6362(class537, 0) && method6362(class537, 1) && method6362(class537, 2) && method6362(class537, 3))
						((Class533) this).aClass537Array5956[((Class533) this).anInt5953++] = class537;
				}
			}
		} else if (((Class537) class537).aByte5999 == 2) {
			int i_97_ = (((Class537) class537).aShort6008 - (((Class523) ((Class533) this).aClass523_5945).anInt5825 * -123518785) + (((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129));
			if (i_97_ >= 0 && i_97_ <= ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129)) {
				int i_98_ = (((Class537) class537).aShort6009 - (((Class523) ((Class533) this).aClass523_5945).anInt5859) * 308188993 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_98_ < 0)
					i_98_ = 0;
				else if (i_98_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					return;
				int i_99_ = (((Class537) class537).aShort6002 - (((Class523) ((Class533) this).aClass523_5945).anInt5859) * 308188993 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_99_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129) + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					i_99_ = ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				else if (i_99_ < 0)
					return;
				boolean bool = false;
				while_78_: do {
					do {
						if (i_98_ > i_99_)
							break while_78_;
					} while (!((Class523) ((Class533) this).aClass523_5945).aBoolArrayArray5885[i_98_++][i_97_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((Class523) (((Class533) this).aClass523_5945)).anInt5862 * -1126109807) - ((Class537) class537).anIntArray6007[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class533) this).anInt5946) && method6362(class537, 0) && method6362(class537, 1) && method6362(class537, 2) && method6362(class537, 3))
						((Class533) this).aClass537Array5956[((Class533) this).anInt5953++] = class537;
				}
			}
		} else if (((Class537) class537).aByte5999 == 16 || ((Class537) class537).aByte5999 == 8) {
			int i_100_ = (((Class537) class537).aShort6009 - (((Class523) ((Class533) this).aClass523_5945).anInt5859 * 308188993) + (((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129));
			if (i_100_ >= 0 && i_100_ <= ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129)) {
				int i_101_ = (((Class537) class537).aShort6008 - (((Class523) ((Class533) this).aClass523_5945).anInt5825) * -123518785 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_101_ >= 0 && (i_101_ <= ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129)) && (((Class523) ((Class533) this).aClass523_5945).aBoolArrayArray5885[i_100_][i_101_])) {
					float f = (float) ((((Class523) (((Class533) this).aClass523_5945)).anInt5879 * 2055013047) - ((Class537) class537).anIntArray6010[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_102_ = (float) ((((Class523) (((Class533) this).aClass523_5945)).anInt5862 * -1126109807) - ((Class537) class537).anIntArray6007[0]);
					if (f_102_ < 0.0F)
						f_102_ *= -1.0F;
					if ((!(f < (float) ((Class533) this).anInt5946) || !(f_102_ < (float) ((Class533) this).anInt5946)) && method6362(class537, 0) && method6362(class537, 1) && method6362(class537, 2) && method6362(class537, 3))
						((Class533) this).aClass537Array5956[((Class533) this).anInt5953++] = class537;
				}
			}
		} else if (((Class537) class537).aByte5999 == 4) {
			float f = (float) (((Class537) class537).anIntArray6011[0] - (((Class523) ((Class533) this).aClass523_5945).anInt5863) * 580844205);
			if (!(f <= (float) ((Class533) this).anInt5947)) {
				int i_103_ = (((Class537) class537).aShort6008 - (((Class523) ((Class533) this).aClass523_5945).anInt5825) * -123518785 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_103_ < 0)
					i_103_ = 0;
				else if (i_103_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					return;
				int i_104_ = (((Class537) class537).aShort6006 - (((Class523) ((Class533) this).aClass523_5945).anInt5825) * -123518785 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_104_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129) + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					i_104_ = ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				else if (i_104_ < 0)
					return;
				int i_105_ = (((Class537) class537).aShort6009 - (((Class523) ((Class533) this).aClass523_5945).anInt5859) * 308188993 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_105_ < 0)
					i_105_ = 0;
				else if (i_105_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					return;
				int i_106_ = (((Class537) class537).aShort6002 - (((Class523) ((Class533) this).aClass523_5945).anInt5859) * 308188993 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				if (i_106_ > ((((Class523) ((Class533) this).aClass523_5945).anInt5865 * 131560129) + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129))
					i_106_ = ((((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129 + (((Class523) ((Class533) this).aClass523_5945).anInt5865) * 131560129);
				else if (i_106_ < 0)
					return;
				boolean bool = false;
				while_79_: for (int i_107_ = i_105_; i_107_ <= i_106_; i_107_++) {
					for (int i_108_ = i_103_; i_108_ <= i_104_; i_108_++) {
						if (((Class523) ((Class533) this).aClass523_5945).aBoolArrayArray5885[i_107_][i_108_]) {
							bool = true;
							break while_79_;
						}
					}
				}
				if (bool && method6362(class537, 0) && method6362(class537, 1) && method6362(class537, 2) && method6362(class537, 3))
					((Class533) this).aClass537Array5956[((Class533) this).anInt5953++] = class537;
			}
		}
	}

	void method6353(Class106 class106, int i) {
		aClass106_5968 = class106;
		if (!aBool5965 || !((Class533) this).aBool5939)
			((Class533) this).anInt5953 = 0;
		else {
			if (((Class533) this).aBool5963)
				((Class523) ((Class533) this).aClass523_5945).aClass260_5852.method3563((byte) -11);
			aClass106_5968.method1682(((Class533) this).anIntArray5957);
			if ((((Class533) this).anInt5955 != (int) ((float) ((Class533) this).anIntArray5957[0] / 3.0F)) || (((Class533) this).anInt5967 != (int) ((float) ((Class533) this).anIntArray5957[1] / 3.0F))) {
				((Class533) this).anInt5955 = (int) ((float) ((Class533) this).anIntArray5957[0] / 3.0F);
				((Class533) this).anInt5967 = (int) ((float) ((Class533) this).anIntArray5957[1] / 3.0F);
				((Class533) this).anIntArray5943 = new int[(((Class533) this).anInt5955 * ((Class533) this).anInt5967)];
			}
			((Class533) this).anInt5953 = 0;
			for (int i_109_ = 0; i_109_ < ((Class533) this).anInt5949; i_109_++)
				method6352(aClass106_5968, ((Class533) this).aClass537Array5950[i_109_], i);
			for (int i_110_ = 0; i_110_ < ((Class533) this).anInt5966; i_110_++)
				method6352(aClass106_5968, ((Class533) this).aClass537Array5952[i_110_], i);
			for (int i_111_ = 0; i_111_ < ((Class533) this).anInt5962; i_111_++)
				method6352(aClass106_5968, ((Class533) this).aClass537Array5954[i_111_], i);
			((Class553) ((Class533) this).aClass553_5944).anInt6314 = 0;
			if (((Class533) this).anInt5953 > 0) {
				int i_112_ = ((Class533) this).anIntArray5943.length;
				int i_113_ = i_112_ - i_112_ & 0x7;
				int i_114_ = 0;
				while (i_114_ < i_113_) {
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
				}
				while (i_114_ < i_112_)
					((Class533) this).anIntArray5943[i_114_++] = 2147483647;
				((Class553) ((Class533) this).aClass553_5944).anInt6313 = 1;
				for (int i_115_ = 0; i_115_ < ((Class533) this).anInt5953; i_115_++) {
					Class537 class537 = ((Class533) this).aClass537Array5956[i_115_];
					((Class533) this).aClass553_5944.method6553(((Class537) class537).aShortArray6014[0], ((Class537) class537).aShortArray6014[1], ((Class537) class537).aShortArray6014[3], ((Class537) class537).aShortArray6012[0], ((Class537) class537).aShortArray6012[1], ((Class537) class537).aShortArray6012[3], ((Class537) class537).aShortArray6015[0], ((Class537) class537).aShortArray6015[1], ((Class537) class537).aShortArray6015[3]);
					((Class533) this).aClass553_5944.method6553(((Class537) class537).aShortArray6014[1], ((Class537) class537).aShortArray6014[2], ((Class537) class537).aShortArray6014[3], ((Class537) class537).aShortArray6012[1], ((Class537) class537).aShortArray6012[2], ((Class537) class537).aShortArray6012[3], ((Class537) class537).aShortArray6015[1], ((Class537) class537).aShortArray6015[2], ((Class537) class537).aShortArray6015[3]);
				}
				((Class553) ((Class533) this).aClass553_5944).anInt6313 = 2;
			}
			if (((Class533) this).aBool5963)
				((Class523) ((Class533) this).aClass523_5945).aClass260_5852.method3563((byte) 87);
		}
	}

	public void method6354(int i, int i_116_, int i_117_, int i_118_) {
		if (i == 8 || i == 16) {
			for (int i_119_ = 0; i_119_ < ((Class533) this).anInt5962; i_119_++) {
				Class537 class537 = ((Class533) this).aClass537Array5954[i_119_];
				if (((Class537) class537).aByte5999 == i && ((Class537) class537).aByte6005 == i_116_ && ((((Class537) class537).aShort6009 == i_117_ && ((Class537) class537).aShort6008 == i_118_) || (((Class537) class537).aShort6002 == i_117_ && ((Class537) class537).aShort6006 == i_118_))) {
					if (i_119_ != ((Class533) this).anInt5962)
						System.arraycopy(((Class533) this).aClass537Array5954, i_119_ + 1, ((Class533) this).aClass537Array5954, i_119_, ((((Class533) this).aClass537Array5954).length - (i_119_ + 1)));
					((Class533) this).anInt5962--;
					break;
				}
			}
		} else {
			Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_116_][i_117_][i_118_]);
			if (class536 != null) {
				if (i == 1)
					((Class536) class536).aShort5986 = (short) 0;
				else if (i == 2)
					((Class536) class536).aShort5997 = (short) 0;
			}
			method6350();
		}
	}

	boolean method6355(int i, int i_120_, int i_121_, int i_122_) {
		if (!aBool5965 || !((Class533) this).aBool5939)
			return false;
		if (((Class553) ((Class533) this).aClass553_5944).anInt6314 < 100)
			return false;
		if (!method6368(i, i_120_, i_121_))
			return false;
		int i_123_ = i_120_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		int i_124_ = i_121_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		if (method6365(i_123_, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_120_, i_121_, 346010668), i_124_, (((Class523) ((Class533) this).aClass523_5945).anInt5824 * -1090619529), i_122_, (((Class523) ((Class533) this).aClass523_5945).anInt5824 * -1090619529)))
			return true;
		return false;
	}

	boolean method6356(int i, int i_125_, int i_126_, int i_127_, int i_128_, Class535 class535) {
		if (!aBool5965 || !((Class533) this).aBool5939)
			return false;
		if (((Class553) ((Class533) this).aClass553_5944).anInt6314 < 100)
			return false;
		if (i_125_ < 0 || i_127_ < 0 || i_126_ >= ((Class533) this).anIntArrayArrayArray5959[i].length || i_128_ >= (((Class533) this).anIntArrayArrayArray5959[i][i_125_]).length)
			return false;
		if (i_125_ == i_126_ && i_127_ == i_128_) {
			if (!method6368(i, i_125_, i_127_))
				return false;
			if (method6357(class535))
				return true;
			return false;
		}
		for (int i_129_ = i_125_; i_129_ <= i_126_; i_129_++) {
			for (int i_130_ = i_127_; i_130_ <= i_128_; i_130_++) {
				if ((((Class533) this).anIntArrayArrayArray5959[i][i_129_][i_130_]) == -((((Class523) ((Class533) this).aClass523_5945).anInt5864) * 2942875))
					return false;
			}
		}
		if (!method6357(class535))
			return false;
		return true;
	}

	final boolean method6357(Class535 class535) {
		if (class535 == null)
			return false;
		return method6365(((Class535) class535).anInt5980, ((Class535) class535).anInt5982, ((Class535) class535).anInt5984, (((Class535) class535).anInt5979 - ((Class535) class535).anInt5980), (((Class535) class535).anInt5976 - ((Class535) class535).anInt5982), (((Class535) class535).anInt5985 - ((Class535) class535).anInt5984));
	}

	public void method6358(int i, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_) {
		((Class533) this).aClass537Array5950[((Class533) this).anInt5949++] = new Class537(((Class533) this).aClass523_5945, i, i_131_, i_132_, i_133_, i_133_, i_132_, i_136_, i_137_, i_137_, i_136_, i_134_, i_134_, i_135_, i_135_);
	}

	public void method6359(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_143_ = i_139_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_144_ = i_143_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_145_ = i_140_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_146_ = i_145_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_147_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_138_].method2713(i_139_, i_140_, 9207353);
				int i_148_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_138_].method2713(i_139_ + 1, i_140_ + 1, 1002328796);
				((Class533) this).aClass537Array5954[((Class533) this).anInt5962++] = new Class537(((Class533) this).aClass523_5945, i, i_138_, i_143_, i_144_, i_144_, i_143_, i_147_, i_148_, i_148_ - i_141_, i_147_ - i_141_, i_145_, i_146_, i_146_, i_145_);
			} else {
				int i_149_ = ((i_139_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825)) + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529);
				int i_150_ = i_149_ - (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_151_ = i_140_ << (((Class533) this).aClass523_5945.anInt5858 * 406704825);
				int i_152_ = i_151_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529;
				int i_153_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_138_].method2713(i_139_ + 1, i_140_, 134747877);
				int i_154_ = ((Class533) this).aClass523_5945.aClass174Array5838[i_138_].method2713(i_139_, i_140_ + 1, 1588886339);
				((Class533) this).aClass537Array5954[((Class533) this).anInt5962++] = new Class537(((Class533) this).aClass523_5945, i, i_138_, i_149_, i_150_, i_150_, i_149_, i_153_, i_154_, i_154_ - i_141_, i_153_ - i_141_, i_151_, i_152_, i_152_, i_151_);
			}
		} else {
			Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_138_][i_139_][i_140_]);
			if (class536 == null)
				((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_138_][i_139_][i_140_] = class536 = new Class536(i_138_);
			if (i == 1) {
				((Class536) class536).aShort5986 = (short) i_141_;
				((Class536) class536).aShort5995 = (short) i_142_;
			} else if (i == 2) {
				((Class536) class536).aShort5997 = (short) i_141_;
				((Class536) class536).aShort5996 = (short) i_142_;
			}
			if (((Class533) this).aBool5951)
				method6350();
		}
	}

	public void method6360(int i, int i_155_, int i_156_, int i_157_) {
		if (i == 8 || i == 16) {
			for (int i_158_ = 0; i_158_ < ((Class533) this).anInt5962; i_158_++) {
				Class537 class537 = ((Class533) this).aClass537Array5954[i_158_];
				if (((Class537) class537).aByte5999 == i && ((Class537) class537).aByte6005 == i_155_ && ((((Class537) class537).aShort6009 == i_156_ && ((Class537) class537).aShort6008 == i_157_) || (((Class537) class537).aShort6002 == i_156_ && ((Class537) class537).aShort6006 == i_157_))) {
					if (i_158_ != ((Class533) this).anInt5962)
						System.arraycopy(((Class533) this).aClass537Array5954, i_158_ + 1, ((Class533) this).aClass537Array5954, i_158_, ((((Class533) this).aClass537Array5954).length - (i_158_ + 1)));
					((Class533) this).anInt5962--;
					break;
				}
			}
		} else {
			Class536 class536 = (((Class533) this).aClass523_5945.aClass536ArrayArrayArray5882[i_155_][i_156_][i_157_]);
			if (class536 != null) {
				if (i == 1)
					((Class536) class536).aShort5986 = (short) 0;
				else if (i == 2)
					((Class536) class536).aShort5997 = (short) 0;
			}
			method6350();
		}
	}

	public void method6361() {
		method6350();
	}

	boolean method6362(Class537 class537, int i) {
		if (!method6364(((Class537) class537).anIntArray6010[i], ((Class537) class537).anIntArray6011[i], ((Class537) class537).anIntArray6007[i]))
			return false;
		((Class537) class537).aShortArray6012[i] = (short) (int) ((Class533) this).aFloatArray5964[0];
		((Class537) class537).aShortArray6014[i] = (short) (int) ((Class533) this).aFloatArray5964[1];
		((Class537) class537).aShortArray6015[i] = (short) (int) ((Class533) this).aFloatArray5964[2];
		return true;
	}

	Class533(Class523 class523) {
		((Class533) this).aBool5939 = true;
		((Class533) this).aBool5951 = false;
		((Class533) this).anInt5953 = 0;
		((Class533) this).aFloatArray5964 = new float[3];
		((Class533) this).anIntArray5957 = new int[2];
		((Class533) this).anInt5955 = -1;
		((Class533) this).anInt5967 = -1;
		((Class533) this).aBool5963 = true;
		((Class533) this).anInt5946 = ((Class523) class523).anInt5824 * -1090619529;
		((Class533) this).anInt5947 = ((Class523) class523).anInt5824 * -1090619529;
		((Class533) this).aClass523_5945 = class523;
		((Class533) this).aClass537Array5950 = new Class537[533];
		((Class533) this).anInt5949 = 0;
		((Class533) this).aClass537Array5952 = new Class537[2032];
		((Class533) this).anInt5966 = 0;
		((Class533) this).aClass537Array5954 = new Class537[1015];
		((Class533) this).anInt5962 = 0;
		((Class533) this).aClass537Array5956 = new Class537[1049];
		((Class533) this).anInt5953 = 0;
		((Class533) this).anIntArrayArrayArray5959 = (new int[((Class533) this).aClass523_5945.anInt5832 * 1103813715][((Class533) this).aClass523_5945.anInt5833 * -1396185127 + 1][((Class533) this).aClass523_5945.anInt5834 * -1519623925 + 1]);
		((Class533) this).aBool5951 = false;
		aBool5965 = true;
		if (aBool5965)
			((Class533) this).aClass553_5944 = new Class553(this);
	}

	boolean method6363(Class456_Sub1_Sub4 class456_sub1_sub4, int i, int i_159_, int i_160_) {
		if (!aBool5965 || !((Class533) this).aBool5939)
			return false;
		if (((Class553) ((Class533) this).aClass553_5944).anInt6314 < 100)
			return false;
		if (!method6368(i, i_159_, i_160_))
			return false;
		int i_161_ = i_159_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		int i_162_ = i_160_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		int i_163_ = (((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_159_, i_160_, 91595482) - 1);
		int i_164_ = i_163_ + class456_sub1_sub4.method8310((byte) -21);
		if (class456_sub1_sub4.aShort11519 == 1) {
			if (!method6367(i_161_, i_163_, i_162_, i_161_, i_164_, i_162_, i_161_, i_164_, (i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529)))
				return false;
			if (!method6367(i_161_, i_163_, i_162_, i_161_, i_164_, (i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529), i_161_, i_163_, (i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529)))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 2) {
			if (!method6367(i_161_, i_163_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_164_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_161_, i_164_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529))
				return false;
			if (!method6367(i_161_, i_163_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_163_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_164_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 4) {
			if (!method6367(i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_163_, i_162_, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_164_, i_162_, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_164_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529))
				return false;
			if (!method6367(i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_163_, i_162_, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_164_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529, i_163_, i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 8) {
			if (!method6367(i_161_, i_163_, i_162_, (i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529), i_164_, i_162_, i_161_, i_164_, i_162_))
				return false;
			if (!method6367(i_161_, i_163_, i_162_, (i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529), i_163_, i_162_, (i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529), i_164_, i_162_))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 16) {
			if (!method6365(i_161_, i_163_, (i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013), (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013, i_164_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 32) {
			if (!method6365((i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013), i_163_, (i_162_ + (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013), (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013, i_164_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 64) {
			if (!method6365((i_161_ + (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013), i_163_, i_162_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013, i_164_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013))
				return false;
			return true;
		}
		if (class456_sub1_sub4.aShort11519 == 128) {
			if (!method6365(i_161_, i_163_, i_162_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013, i_164_, (((Class523) ((Class533) this).aClass523_5945).anInt5867) * -174465013))
				return false;
			return true;
		}
		return true;
	}

	final boolean method6364(int i, int i_165_, int i_166_) {
		aClass106_5968.method2035((float) i, (float) i_165_, (float) i_166_, ((Class533) this).aFloatArray5964);
		if (((Class533) this).aFloatArray5964[2] < 50.0F)
			return false;
		((Class533) this).aFloatArray5964[0] /= 3.0F;
		((Class533) this).aFloatArray5964[1] /= 3.0F;
		return true;
	}

	final boolean method6365(int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		int i_172_ = i + i_169_;
		int i_173_ = i_167_ + i_170_;
		int i_174_ = i_168_ + i_171_;
		if (!method6367(i, i_173_, i_168_, i_172_, i_173_, i_174_, i, i_173_, i_174_))
			return false;
		if (!method6367(i, i_173_, i_168_, i_172_, i_173_, i_168_, i_172_, i_173_, i_174_))
			return false;
		if (i < (((Class523) ((Class533) this).aClass523_5945).anInt5879 * 2055013047)) {
			if (!method6367(i, i_167_, i_174_, i, i_173_, i_168_, i, i_173_, i_174_))
				return false;
			if (!method6367(i, i_167_, i_174_, i, i_167_, i_168_, i, i_173_, i_168_))
				return false;
		} else {
			if (!method6367(i_172_, i_167_, i_174_, i_172_, i_173_, i_168_, i_172_, i_173_, i_174_))
				return false;
			if (!method6367(i_172_, i_167_, i_174_, i_172_, i_167_, i_168_, i_172_, i_173_, i_168_))
				return false;
		}
		if (i_168_ < (((Class523) ((Class533) this).aClass523_5945).anInt5862 * -1126109807)) {
			if (!method6367(i, i_167_, i_168_, i_172_, i_173_, i_168_, i, i_173_, i_168_))
				return false;
			if (!method6367(i, i_167_, i_168_, i_172_, i_167_, i_168_, i_172_, i_173_, i_168_))
				return false;
		} else {
			if (!method6367(i, i_167_, i_174_, i_172_, i_173_, i_174_, i, i_173_, i_174_))
				return false;
			if (!method6367(i, i_167_, i_174_, i_172_, i_167_, i_174_, i_172_, i_173_, i_174_))
				return false;
		}
		return true;
	}

	boolean method6366(int i, int i_175_, int i_176_) {
		if (!aBool5965 || !((Class533) this).aBool5939)
			return false;
		if (((Class553) ((Class533) this).aClass553_5944).anInt6314 < 100)
			return false;
		int i_177_ = ((Class533) this).anIntArrayArrayArray5959[i][i_175_][i_176_];
		if (i_177_ == -(((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875))
			return false;
		if (i_177_ == (((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875))
			return true;
		if (((Class533) this).aClass523_5945.aClass174Array5875 == ((Class533) this).aClass523_5945.aClass174Array5840)
			return false;
		int i_178_ = i_175_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		int i_179_ = i_176_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		if (method6367(i_178_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_, i_176_, 95237176), i_179_ + 1, i_178_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_ + 1, i_176_ + 1, 797222072), i_179_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, i_178_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_, i_176_ + 1, 2093998340), i_179_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1) && (method6367(i_178_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_, i_176_, -1253004120), i_179_ + 1, i_178_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_ + 1, i_176_, -1053267190), i_179_ + 1, i_178_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_175_ + 1, i_176_ + 1, 1252889092), i_179_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1))) {
			((Class533) this).anIntArrayArrayArray5959[i][i_175_][i_176_] = (((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875);
			return true;
		}
		((Class533) this).anIntArrayArrayArray5959[i][i_175_][i_176_] = -(((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875);
		return false;
	}

	final boolean method6367(int i, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_) {
		if (!method6364(i, i_180_, i_181_))
			return false;
		i = (int) ((Class533) this).aFloatArray5964[0];
		i_180_ = (int) ((Class533) this).aFloatArray5964[1];
		i_181_ = (int) ((Class533) this).aFloatArray5964[2];
		if (!method6364(i_182_, i_183_, i_184_))
			return false;
		i_182_ = (int) ((Class533) this).aFloatArray5964[0];
		i_183_ = (int) ((Class533) this).aFloatArray5964[1];
		i_184_ = (int) ((Class533) this).aFloatArray5964[2];
		if (!method6364(i_185_, i_186_, i_187_))
			return false;
		i_185_ = (int) ((Class533) this).aFloatArray5964[0];
		i_186_ = (int) ((Class533) this).aFloatArray5964[1];
		i_187_ = (int) ((Class533) this).aFloatArray5964[2];
		return ((Class533) this).aClass553_5944.method6553(i_180_, i_183_, i_186_, i, i_182_, i_185_, i_181_, i_184_, i_187_);
	}

	boolean method6368(int i, int i_188_, int i_189_) {
		if (!aBool5965 || !((Class533) this).aBool5939)
			return false;
		if (((Class553) ((Class533) this).aClass553_5944).anInt6314 < 100)
			return false;
		int i_190_ = ((Class533) this).anIntArrayArrayArray5959[i][i_188_][i_189_];
		if (i_190_ == -(((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875))
			return false;
		if (i_190_ == (((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875))
			return true;
		if (((Class533) this).aClass523_5945.aClass174Array5875 == ((Class533) this).aClass523_5945.aClass174Array5840)
			return false;
		int i_191_ = i_188_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		int i_192_ = i_189_ << ((Class533) this).aClass523_5945.anInt5858 * 406704825;
		if (method6367(i_191_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_, i_189_, 910349457), i_192_ + 1, i_191_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_ + 1, i_189_ + 1, 72136994), i_192_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, i_191_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_, i_189_ + 1, 73632230), i_192_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1) && (method6367(i_191_ + 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_, i_189_, 938127111), i_192_ + 1, i_191_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_ + 1, i_189_, -1606266819), i_192_ + 1, i_191_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1, ((Class533) this).aClass523_5945.aClass174Array5875[i].method2713(i_188_ + 1, i_189_ + 1, -201415133), i_192_ + (((Class523) ((Class533) this).aClass523_5945).anInt5824) * -1090619529 - 1))) {
			((Class533) this).anIntArrayArrayArray5959[i][i_188_][i_189_] = (((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875);
			return true;
		}
		((Class533) this).anIntArrayArrayArray5959[i][i_188_][i_189_] = -(((Class523) ((Class533) this).aClass523_5945).anInt5864 * 2942875);
		return false;
	}
}
