package game;

/* Class87_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub2 extends Class87 {
	int anInt9977;
	int anInt9978;
	int anInt9979;
	int anInt9980;
	int anInt9981;
	int anInt9982;
	int[] anIntArray9983;
	boolean aBool9984 = false;

	public boolean method1284() {
		return false;
	}

	public int method1329() {
		return ((Class87_Sub2) this).anInt9982;
	}

	public boolean method1322() {
		return ((Class87_Sub2) this).aBool9984;
	}

	public int method1336() {
		return ((Class87_Sub2) this).anInt9978;
	}

	public int method1330() {
		return ((Class87_Sub2) this).anInt9978;
	}

	public int method1283() {
		return (((Class87_Sub2) this).anInt9982 + ((Class87_Sub2) this).anInt9977 + ((Class87_Sub2) this).anInt9981);
	}

	public void method1291(int i, int i_0_, int i_1_) {
		for (int i_2_ = 1; i_2_ < ((Class87_Sub2) this).anIntArray9983.length; i_2_++) {
			int i_3_ = ((Class87_Sub2) this).anIntArray9983[i_2_] >> 16 & 0xff;
			i_3_ += i;
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ > 255)
				i_3_ = 255;
			int i_4_ = ((Class87_Sub2) this).anIntArray9983[i_2_] >> 8 & 0xff;
			i_4_ += i_0_;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 255)
				i_4_ = 255;
			int i_5_ = ((Class87_Sub2) this).anIntArray9983[i_2_] >> 0 & 0xff;
			i_5_ += i_1_;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 255)
				i_5_ = 255;
			((Class87_Sub2) this).anIntArray9983[i_2_] = (((Class87_Sub2) this).anIntArray9983[i_2_] & ~0xffffff | i_3_ << 16 | i_4_ << 8 | i_5_);
		}
	}

	public int method1310() {
		return (((Class87_Sub2) this).anInt9982 + ((Class87_Sub2) this).anInt9977 + ((Class87_Sub2) this).anInt9981);
	}

	public int method1317() {
		return ((Class87_Sub2) this).anInt9981;
	}

	public int method1288() {
		return ((Class87_Sub2) this).anInt9979;
	}

	public int method1289() {
		return ((Class87_Sub2) this).anInt9980;
	}

	public void method1290() {
		((Class87_Sub2) this).anInt9980 = 0;
		((Class87_Sub2) this).anInt9979 = 0;
		((Class87_Sub2) this).anInt9981 = 0;
		((Class87_Sub2) this).anInt9977 = 0;
	}

	public void method1293(int i) {
		int i_6_ = method1283();
		int i_7_ = method1305();
		if (((Class87_Sub2) this).anInt9982 != i_6_ || ((Class87_Sub2) this).anInt9978 != i_7_) {
			int i_8_ = i;
			if (i_8_ > ((Class87_Sub2) this).anInt9977)
				i_8_ = ((Class87_Sub2) this).anInt9977;
			int i_9_ = i;
			if ((i_9_ + ((Class87_Sub2) this).anInt9977 + ((Class87_Sub2) this).anInt9982) > i_6_)
				i_9_ = (i_6_ - ((Class87_Sub2) this).anInt9977 - ((Class87_Sub2) this).anInt9982);
			int i_10_ = i;
			if (i_10_ > ((Class87_Sub2) this).anInt9979)
				i_10_ = ((Class87_Sub2) this).anInt9979;
			int i_11_ = i;
			if ((i_11_ + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9978) > i_7_)
				i_11_ = (i_7_ - ((Class87_Sub2) this).anInt9979 - ((Class87_Sub2) this).anInt9978);
			int i_12_ = ((Class87_Sub2) this).anInt9982 + i_8_ + i_9_;
			int i_13_ = ((Class87_Sub2) this).anInt9978 + i_10_ + i_11_;
			int[] is = new int[i_12_ * i_13_];
			((Class87_Sub2) this).aBool9984 = false;
			for (int i_14_ = 0; i_14_ < ((Class87_Sub2) this).anInt9978; i_14_++) {
				int i_15_ = i_14_ * ((Class87_Sub2) this).anInt9982;
				int i_16_ = (i_14_ + i_10_) * i_12_ + i_8_;
				for (int i_17_ = 0; i_17_ < ((Class87_Sub2) this).anInt9982; i_17_++) {
					if ((((Class87_Sub2) this).anIntArray9983[i_15_] & ~0xffffff) != -16777216)
						((Class87_Sub2) this).aBool9984 = true;
					is[i_16_++] = ((Class87_Sub2) this).anIntArray9983[i_15_++];
				}
			}
			((Class87_Sub2) this).anInt9977 -= i_8_;
			((Class87_Sub2) this).anInt9979 -= i_10_;
			((Class87_Sub2) this).anInt9981 -= i_9_;
			((Class87_Sub2) this).anInt9980 -= i_11_;
			((Class87_Sub2) this).anInt9982 = i_12_;
			((Class87_Sub2) this).anInt9978 = i_13_;
			((Class87_Sub2) this).anIntArray9983 = is;
		}
	}

	public void method1294(int i) {
		int i_18_ = 0;
		((Class87_Sub2) this).aBool9984 = false;
		int[] is = new int[(((Class87_Sub2) this).anInt9982 * ((Class87_Sub2) this).anInt9978)];
		for (int i_19_ = 0; i_19_ < ((Class87_Sub2) this).anInt9978; i_19_++) {
			for (int i_20_ = 0; i_20_ < ((Class87_Sub2) this).anInt9982; i_20_++) {
				int i_21_ = ((Class87_Sub2) this).anIntArray9983[i_18_];
				if ((i_21_ & ~0xffffff) == 0) {
					if (i_20_ > 0 && (((Class87_Sub2) this).anIntArray9983[i_18_ - 1] & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_19_ > 0 && ((((Class87_Sub2) this).anIntArray9983[i_18_ - ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_20_ < ((Class87_Sub2) this).anInt9982 - 1 && ((((Class87_Sub2) this).anIntArray9983[i_18_ + 1]) & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_19_ < ((Class87_Sub2) this).anInt9978 - 1 && ((((Class87_Sub2) this).anIntArray9983[i_18_ + ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
						i_21_ = i;
				}
				if ((i_21_ & ~0xffffff) != -16777216)
					((Class87_Sub2) this).aBool9984 = true;
				is[i_18_++] = i_21_;
			}
		}
		((Class87_Sub2) this).anIntArray9983 = is;
	}

	public void method1295(int i) {
		for (int i_22_ = ((Class87_Sub2) this).anInt9978 - 1; i_22_ > 0; i_22_--) {
			int i_23_ = i_22_ * ((Class87_Sub2) this).anInt9982;
			for (int i_24_ = ((Class87_Sub2) this).anInt9982 - 1; i_24_ > 0; i_24_--) {
				if ((((Class87_Sub2) this).anIntArray9983[i_24_ + i_23_] & ~0xffffff) == 0 && ((((Class87_Sub2) this).anIntArray9983[i_24_ + i_23_ - 1 - ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
					((Class87_Sub2) this).anIntArray9983[i_24_ + i_23_] = i;
			}
		}
	}

	public void method1296() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = ((Class87_Sub2) this).anInt9978 - 1; i >= 0; i--) {
			int i_25_ = i * ((Class87_Sub2) this).anInt9982;
			for (int i_26_ = (i + 1) * ((Class87_Sub2) this).anInt9982; i_25_ < i_26_; i_25_++) {
				i_26_--;
				int i_27_ = is[i_25_];
				is[i_25_] = is[i_26_];
				is[i_26_] = i_27_;
			}
		}
		int i = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i;
	}

	public void method1314() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = (((Class87_Sub2) this).anInt9978 >> 1) - 1; i >= 0; i--) {
			int i_28_ = i * ((Class87_Sub2) this).anInt9982;
			int i_29_ = ((((Class87_Sub2) this).anInt9978 - i - 1) * ((Class87_Sub2) this).anInt9982);
			for (int i_30_ = -((Class87_Sub2) this).anInt9982; i_30_ < 0; i_30_++) {
				int i_31_ = is[i_28_];
				is[i_28_] = is[i_29_];
				is[i_29_] = i_31_;
				i_28_++;
				i_29_++;
			}
		}
		int i = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = i;
	}

	public void method1299() {
		int[] is = new int[(((Class87_Sub2) this).anInt9982 * ((Class87_Sub2) this).anInt9978)];
		int i = 0;
		for (int i_32_ = 0; i_32_ < ((Class87_Sub2) this).anInt9982; i_32_++) {
			for (int i_33_ = ((Class87_Sub2) this).anInt9978 - 1; i_33_ >= 0; i_33_--)
				is[i++] = (((Class87_Sub2) this).anIntArray9983[i_32_ + i_33_ * ((Class87_Sub2) this).anInt9982]);
		}
		((Class87_Sub2) this).anIntArray9983 = is;
		int i_34_ = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i_34_;
		i_34_ = ((Class87_Sub2) this).anInt9978;
		((Class87_Sub2) this).anInt9978 = ((Class87_Sub2) this).anInt9982;
		((Class87_Sub2) this).anInt9982 = i_34_;
	}

	public int[] method1285(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_35_ = 0; i_35_ < ((Class87_Sub2) this).anInt9978; i_35_++) {
				int i_36_ = i_35_ * ((Class87_Sub2) this).anInt9982;
				int i_37_ = (((Class87_Sub2) this).anInt9977 + (i_35_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_38_ = 0; i_38_ < ((Class87_Sub2) this).anInt9982; i_38_++) {
					is[i_37_++] = ((Class87_Sub2) this).anIntArray9983[i_36_];
					i_36_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public void method1300(int i, int i_39_, int i_40_) {
		for (int i_41_ = 1; i_41_ < ((Class87_Sub2) this).anIntArray9983.length; i_41_++) {
			int i_42_ = ((Class87_Sub2) this).anIntArray9983[i_41_] >> 16 & 0xff;
			i_42_ += i;
			if (i_42_ < 0)
				i_42_ = 0;
			else if (i_42_ > 255)
				i_42_ = 255;
			int i_43_ = ((Class87_Sub2) this).anIntArray9983[i_41_] >> 8 & 0xff;
			i_43_ += i_39_;
			if (i_43_ < 0)
				i_43_ = 0;
			else if (i_43_ > 255)
				i_43_ = 255;
			int i_44_ = ((Class87_Sub2) this).anIntArray9983[i_41_] >> 0 & 0xff;
			i_44_ += i_40_;
			if (i_44_ < 0)
				i_44_ = 0;
			else if (i_44_ > 255)
				i_44_ = 255;
			((Class87_Sub2) this).anIntArray9983[i_41_] = (((Class87_Sub2) this).anIntArray9983[i_41_] & ~0xffffff | i_42_ << 16 | i_43_ << 8 | i_44_);
		}
	}

	public int method1301(int i, int i_45_) {
		return (((Class87_Sub2) this).anIntArray9983[i + i_45_ * ((Class87_Sub2) this).anInt9982]);
	}

	public void method1323() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = ((Class87_Sub2) this).anInt9978 - 1; i >= 0; i--) {
			int i_46_ = i * ((Class87_Sub2) this).anInt9982;
			for (int i_47_ = (i + 1) * ((Class87_Sub2) this).anInt9982; i_46_ < i_47_; i_46_++) {
				i_47_--;
				int i_48_ = is[i_46_];
				is[i_46_] = is[i_47_];
				is[i_47_] = i_48_;
			}
		}
		int i = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i;
	}

	public boolean method1325() {
		return false;
	}

	public boolean method1304() {
		return false;
	}

	public void method1281() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = (((Class87_Sub2) this).anInt9978 >> 1) - 1; i >= 0; i--) {
			int i_49_ = i * ((Class87_Sub2) this).anInt9982;
			int i_50_ = ((((Class87_Sub2) this).anInt9978 - i - 1) * ((Class87_Sub2) this).anInt9982);
			for (int i_51_ = -((Class87_Sub2) this).anInt9982; i_51_ < 0; i_51_++) {
				int i_52_ = is[i_49_];
				is[i_49_] = is[i_50_];
				is[i_50_] = i_52_;
				i_49_++;
				i_50_++;
			}
		}
		int i = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = i;
	}

	public void method1297(int i) {
		int i_53_ = method1283();
		int i_54_ = method1305();
		if (((Class87_Sub2) this).anInt9982 != i_53_ || ((Class87_Sub2) this).anInt9978 != i_54_) {
			int i_55_ = i;
			if (i_55_ > ((Class87_Sub2) this).anInt9977)
				i_55_ = ((Class87_Sub2) this).anInt9977;
			int i_56_ = i;
			if ((i_56_ + ((Class87_Sub2) this).anInt9977 + ((Class87_Sub2) this).anInt9982) > i_53_)
				i_56_ = (i_53_ - ((Class87_Sub2) this).anInt9977 - ((Class87_Sub2) this).anInt9982);
			int i_57_ = i;
			if (i_57_ > ((Class87_Sub2) this).anInt9979)
				i_57_ = ((Class87_Sub2) this).anInt9979;
			int i_58_ = i;
			if ((i_58_ + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9978) > i_54_)
				i_58_ = (i_54_ - ((Class87_Sub2) this).anInt9979 - ((Class87_Sub2) this).anInt9978);
			int i_59_ = ((Class87_Sub2) this).anInt9982 + i_55_ + i_56_;
			int i_60_ = ((Class87_Sub2) this).anInt9978 + i_57_ + i_58_;
			int[] is = new int[i_59_ * i_60_];
			((Class87_Sub2) this).aBool9984 = false;
			for (int i_61_ = 0; i_61_ < ((Class87_Sub2) this).anInt9978; i_61_++) {
				int i_62_ = i_61_ * ((Class87_Sub2) this).anInt9982;
				int i_63_ = (i_61_ + i_57_) * i_59_ + i_55_;
				for (int i_64_ = 0; i_64_ < ((Class87_Sub2) this).anInt9982; i_64_++) {
					if ((((Class87_Sub2) this).anIntArray9983[i_62_] & ~0xffffff) != -16777216)
						((Class87_Sub2) this).aBool9984 = true;
					is[i_63_++] = ((Class87_Sub2) this).anIntArray9983[i_62_++];
				}
			}
			((Class87_Sub2) this).anInt9977 -= i_55_;
			((Class87_Sub2) this).anInt9979 -= i_57_;
			((Class87_Sub2) this).anInt9981 -= i_56_;
			((Class87_Sub2) this).anInt9980 -= i_58_;
			((Class87_Sub2) this).anInt9982 = i_59_;
			((Class87_Sub2) this).anInt9978 = i_60_;
			((Class87_Sub2) this).anIntArray9983 = is;
		}
	}

	public boolean method1307() {
		return ((Class87_Sub2) this).aBool9984;
	}

	public boolean method1308() {
		return ((Class87_Sub2) this).aBool9984;
	}

	public int method1309() {
		return ((Class87_Sub2) this).anInt9982;
	}

	public int method1305() {
		return (((Class87_Sub2) this).anInt9978 + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9980);
	}

	public int method1311() {
		return (((Class87_Sub2) this).anInt9978 + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9980);
	}

	public int method1312() {
		return (((Class87_Sub2) this).anInt9978 + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9980);
	}

	public int method1313() {
		return (((Class87_Sub2) this).anInt9978 + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9980);
	}

	public boolean method1302() {
		return false;
	}

	public int method1315() {
		return ((Class87_Sub2) this).anInt9977;
	}

	public void method1338() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = (((Class87_Sub2) this).anInt9978 >> 1) - 1; i >= 0; i--) {
			int i_65_ = i * ((Class87_Sub2) this).anInt9982;
			int i_66_ = ((((Class87_Sub2) this).anInt9978 - i - 1) * ((Class87_Sub2) this).anInt9982);
			for (int i_67_ = -((Class87_Sub2) this).anInt9982; i_67_ < 0; i_67_++) {
				int i_68_ = is[i_65_];
				is[i_65_] = is[i_66_];
				is[i_66_] = i_68_;
				i_65_++;
				i_66_++;
			}
		}
		int i = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = i;
	}

	public int[] method1321(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_69_ = 0; i_69_ < ((Class87_Sub2) this).anInt9978; i_69_++) {
				int i_70_ = i_69_ * ((Class87_Sub2) this).anInt9982;
				int i_71_ = (((Class87_Sub2) this).anInt9977 + (i_69_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_72_ = 0; i_72_ < ((Class87_Sub2) this).anInt9982; i_72_++) {
					is[i_71_++] = ((Class87_Sub2) this).anIntArray9983[i_70_];
					i_70_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public int method1318() {
		return ((Class87_Sub2) this).anInt9979;
	}

	public int method1319() {
		return ((Class87_Sub2) this).anInt9980;
	}

	public void method1320() {
		((Class87_Sub2) this).anInt9980 = 0;
		((Class87_Sub2) this).anInt9979 = 0;
		((Class87_Sub2) this).anInt9981 = 0;
		((Class87_Sub2) this).anInt9977 = 0;
	}

	public void method1306(int i) {
		int i_73_ = method1283();
		int i_74_ = method1305();
		if (((Class87_Sub2) this).anInt9982 != i_73_ || ((Class87_Sub2) this).anInt9978 != i_74_) {
			int i_75_ = i;
			if (i_75_ > ((Class87_Sub2) this).anInt9977)
				i_75_ = ((Class87_Sub2) this).anInt9977;
			int i_76_ = i;
			if ((i_76_ + ((Class87_Sub2) this).anInt9977 + ((Class87_Sub2) this).anInt9982) > i_73_)
				i_76_ = (i_73_ - ((Class87_Sub2) this).anInt9977 - ((Class87_Sub2) this).anInt9982);
			int i_77_ = i;
			if (i_77_ > ((Class87_Sub2) this).anInt9979)
				i_77_ = ((Class87_Sub2) this).anInt9979;
			int i_78_ = i;
			if ((i_78_ + ((Class87_Sub2) this).anInt9979 + ((Class87_Sub2) this).anInt9978) > i_74_)
				i_78_ = (i_74_ - ((Class87_Sub2) this).anInt9979 - ((Class87_Sub2) this).anInt9978);
			int i_79_ = ((Class87_Sub2) this).anInt9982 + i_75_ + i_76_;
			int i_80_ = ((Class87_Sub2) this).anInt9978 + i_77_ + i_78_;
			int[] is = new int[i_79_ * i_80_];
			((Class87_Sub2) this).aBool9984 = false;
			for (int i_81_ = 0; i_81_ < ((Class87_Sub2) this).anInt9978; i_81_++) {
				int i_82_ = i_81_ * ((Class87_Sub2) this).anInt9982;
				int i_83_ = (i_81_ + i_77_) * i_79_ + i_75_;
				for (int i_84_ = 0; i_84_ < ((Class87_Sub2) this).anInt9982; i_84_++) {
					if ((((Class87_Sub2) this).anIntArray9983[i_82_] & ~0xffffff) != -16777216)
						((Class87_Sub2) this).aBool9984 = true;
					is[i_83_++] = ((Class87_Sub2) this).anIntArray9983[i_82_++];
				}
			}
			((Class87_Sub2) this).anInt9977 -= i_75_;
			((Class87_Sub2) this).anInt9979 -= i_77_;
			((Class87_Sub2) this).anInt9981 -= i_76_;
			((Class87_Sub2) this).anInt9980 -= i_78_;
			((Class87_Sub2) this).anInt9982 = i_79_;
			((Class87_Sub2) this).anInt9978 = i_80_;
			((Class87_Sub2) this).anIntArray9983 = is;
		}
	}

	public void method1337() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = (((Class87_Sub2) this).anInt9978 >> 1) - 1; i >= 0; i--) {
			int i_85_ = i * ((Class87_Sub2) this).anInt9982;
			int i_86_ = ((((Class87_Sub2) this).anInt9978 - i - 1) * ((Class87_Sub2) this).anInt9982);
			for (int i_87_ = -((Class87_Sub2) this).anInt9982; i_87_ < 0; i_87_++) {
				int i_88_ = is[i_85_];
				is[i_85_] = is[i_86_];
				is[i_86_] = i_88_;
				i_85_++;
				i_86_++;
			}
		}
		int i = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = i;
	}

	public void method1303(int i) {
		int i_89_ = 0;
		((Class87_Sub2) this).aBool9984 = false;
		int[] is = new int[(((Class87_Sub2) this).anInt9982 * ((Class87_Sub2) this).anInt9978)];
		for (int i_90_ = 0; i_90_ < ((Class87_Sub2) this).anInt9978; i_90_++) {
			for (int i_91_ = 0; i_91_ < ((Class87_Sub2) this).anInt9982; i_91_++) {
				int i_92_ = ((Class87_Sub2) this).anIntArray9983[i_89_];
				if ((i_92_ & ~0xffffff) == 0) {
					if (i_91_ > 0 && (((Class87_Sub2) this).anIntArray9983[i_89_ - 1] & ~0xffffff) != 0)
						i_92_ = i;
					else if (i_90_ > 0 && ((((Class87_Sub2) this).anIntArray9983[i_89_ - ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
						i_92_ = i;
					else if (i_91_ < ((Class87_Sub2) this).anInt9982 - 1 && ((((Class87_Sub2) this).anIntArray9983[i_89_ + 1]) & ~0xffffff) != 0)
						i_92_ = i;
					else if (i_90_ < ((Class87_Sub2) this).anInt9978 - 1 && ((((Class87_Sub2) this).anIntArray9983[i_89_ + ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
						i_92_ = i;
				}
				if ((i_92_ & ~0xffffff) != -16777216)
					((Class87_Sub2) this).aBool9984 = true;
				is[i_89_++] = i_92_;
			}
		}
		((Class87_Sub2) this).anIntArray9983 = is;
	}

	public void method1324(int i) {
		for (int i_93_ = ((Class87_Sub2) this).anInt9978 - 1; i_93_ > 0; i_93_--) {
			int i_94_ = i_93_ * ((Class87_Sub2) this).anInt9982;
			for (int i_95_ = ((Class87_Sub2) this).anInt9982 - 1; i_95_ > 0; i_95_--) {
				if ((((Class87_Sub2) this).anIntArray9983[i_95_ + i_94_] & ~0xffffff) == 0 && ((((Class87_Sub2) this).anIntArray9983[i_95_ + i_94_ - 1 - ((Class87_Sub2) this).anInt9982]) & ~0xffffff) != 0)
					((Class87_Sub2) this).anIntArray9983[i_95_ + i_94_] = i;
			}
		}
	}

	public int method1287() {
		return ((Class87_Sub2) this).anInt9979;
	}

	public void method1326() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = ((Class87_Sub2) this).anInt9978 - 1; i >= 0; i--) {
			int i_96_ = i * ((Class87_Sub2) this).anInt9982;
			for (int i_97_ = (i + 1) * ((Class87_Sub2) this).anInt9982; i_96_ < i_97_; i_96_++) {
				i_97_--;
				int i_98_ = is[i_96_];
				is[i_96_] = is[i_97_];
				is[i_97_] = i_98_;
			}
		}
		int i = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i;
	}

	public void method1327() {
		int[] is = ((Class87_Sub2) this).anIntArray9983;
		for (int i = ((Class87_Sub2) this).anInt9978 - 1; i >= 0; i--) {
			int i_99_ = i * ((Class87_Sub2) this).anInt9982;
			for (int i_100_ = (i + 1) * ((Class87_Sub2) this).anInt9982; i_99_ < i_100_; i_99_++) {
				i_100_--;
				int i_101_ = is[i_99_];
				is[i_99_] = is[i_100_];
				is[i_100_] = i_101_;
			}
		}
		int i = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i;
	}

	public int method1335(int i, int i_102_) {
		return (((Class87_Sub2) this).anIntArray9983[i + i_102_ * ((Class87_Sub2) this).anInt9982]);
	}

	public void method1339() {
		int[] is = new int[(((Class87_Sub2) this).anInt9982 * ((Class87_Sub2) this).anInt9978)];
		int i = 0;
		for (int i_103_ = 0; i_103_ < ((Class87_Sub2) this).anInt9982; i_103_++) {
			for (int i_104_ = ((Class87_Sub2) this).anInt9978 - 1; i_104_ >= 0; i_104_--)
				is[i++] = (((Class87_Sub2) this).anIntArray9983[i_103_ + i_104_ * ((Class87_Sub2) this).anInt9982]);
		}
		((Class87_Sub2) this).anIntArray9983 = is;
		int i_105_ = ((Class87_Sub2) this).anInt9979;
		((Class87_Sub2) this).anInt9979 = ((Class87_Sub2) this).anInt9977;
		((Class87_Sub2) this).anInt9977 = ((Class87_Sub2) this).anInt9980;
		((Class87_Sub2) this).anInt9980 = ((Class87_Sub2) this).anInt9981;
		((Class87_Sub2) this).anInt9981 = i_105_;
		i_105_ = ((Class87_Sub2) this).anInt9978;
		((Class87_Sub2) this).anInt9978 = ((Class87_Sub2) this).anInt9982;
		((Class87_Sub2) this).anInt9982 = i_105_;
	}

	public int[] method1333(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_106_ = 0; i_106_ < ((Class87_Sub2) this).anInt9978; i_106_++) {
				int i_107_ = i_106_ * ((Class87_Sub2) this).anInt9982;
				int i_108_ = (((Class87_Sub2) this).anInt9977 + (i_106_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_109_ = 0; i_109_ < ((Class87_Sub2) this).anInt9982; i_109_++) {
					is[i_108_++] = ((Class87_Sub2) this).anIntArray9983[i_107_];
					i_107_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public int[] method1331(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_110_ = 0; i_110_ < ((Class87_Sub2) this).anInt9978; i_110_++) {
				int i_111_ = i_110_ * ((Class87_Sub2) this).anInt9982;
				int i_112_ = (((Class87_Sub2) this).anInt9977 + (i_110_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_113_ = 0; i_113_ < ((Class87_Sub2) this).anInt9982; i_113_++) {
					is[i_112_++] = ((Class87_Sub2) this).anIntArray9983[i_111_];
					i_111_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public int[] method1332(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_114_ = 0; i_114_ < ((Class87_Sub2) this).anInt9978; i_114_++) {
				int i_115_ = i_114_ * ((Class87_Sub2) this).anInt9982;
				int i_116_ = (((Class87_Sub2) this).anInt9977 + (i_114_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_117_ = 0; i_117_ < ((Class87_Sub2) this).anInt9982; i_117_++) {
					is[i_116_++] = ((Class87_Sub2) this).anIntArray9983[i_115_];
					i_115_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public int method1316() {
		return ((Class87_Sub2) this).anInt9981;
	}

	public int method1334(int i, int i_118_) {
		return (((Class87_Sub2) this).anIntArray9983[i + i_118_ * ((Class87_Sub2) this).anInt9982]);
	}

	public int[] method1328(boolean bool) {
		if (bool && (method1283() != ((Class87_Sub2) this).anInt9982 || method1305() != ((Class87_Sub2) this).anInt9978)) {
			int i = method1283();
			int[] is = new int[i * method1305()];
			for (int i_119_ = 0; i_119_ < ((Class87_Sub2) this).anInt9978; i_119_++) {
				int i_120_ = i_119_ * ((Class87_Sub2) this).anInt9982;
				int i_121_ = (((Class87_Sub2) this).anInt9977 + (i_119_ + ((Class87_Sub2) this).anInt9979) * i);
				for (int i_122_ = 0; i_122_ < ((Class87_Sub2) this).anInt9982; i_122_++) {
					is[i_121_++] = ((Class87_Sub2) this).anIntArray9983[i_120_];
					i_120_++;
				}
			}
			return is;
		}
		return ((Class87_Sub2) this).anIntArray9983;
	}

	public int method1286() {
		return ((Class87_Sub2) this).anInt9977;
	}

	public boolean method1282() {
		return false;
	}

	public int method1298() {
		return ((Class87_Sub2) this).anInt9977;
	}

	Class87_Sub2(int i, int i_123_, int[] is) {
		((Class87_Sub2) this).anInt9982 = i;
		((Class87_Sub2) this).anInt9978 = i_123_;
		((Class87_Sub2) this).anIntArray9983 = is;
		for (int i_124_ = 0; i_124_ < ((Class87_Sub2) this).anIntArray9983.length; i_124_++) {
			if ((((Class87_Sub2) this).anIntArray9983[i_124_] & ~0xffffff) != -16777216) {
				((Class87_Sub2) this).aBool9984 = true;
				break;
			}
		}
	}

	public boolean method1292() {
		return ((Class87_Sub2) this).aBool9984;
	}
}
