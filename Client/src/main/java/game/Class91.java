package game;

/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class91 implements Interface17, Interface73 {
	public boolean[] aBoolArray1235;
	static File aFile1236;

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-65716301);
			if (i == 0)
				break;
			method1513(class572_sub15, i, 385890430);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(775027553);
			if (i == 0)
				break;
			method1513(class572_sub15, i, 385890430);
		}
	}

	void method1513(RSByteBuffer class572_sub15, int i, int i_0_) {
		if (i == 2) {
			aBoolArray1235 = new boolean[400];
			int i_1_ = class572_sub15.readUnsignedSmart(-743597123);
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
				aBoolArray1235[class572_sub15.readUnsignedSmart(989256580)] = true;
		} else if (3 == i) {
			class572_sub15.readUnsignedByte(1150999461);
			int i_3_ = class572_sub15.readUnsignedSmart(893728229);
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				class572_sub15.readUnsignedSmart(-2056671010);
				class572_sub15.readUnsignedByte(290401594);
			}
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(958022877);
			if (i == 0)
				break;
			method1513(class572_sub15, i, 385890430);
		}
	}

	public void method469(int i) {
		/* empty */
	}

	public void method468(int i, int i_5_) {
		/* empty */
	}

	void method1514(RSByteBuffer class572_sub15, int i) {
		if (i == 2) {
			aBoolArray1235 = new boolean[400];
			int i_6_ = class572_sub15.readUnsignedSmart(1630851766);
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				aBoolArray1235[class572_sub15.readUnsignedSmart(-34907148)] = true;
		} else if (3 == i) {
			class572_sub15.readUnsignedByte(1648046445);
			int i_8_ = class572_sub15.readUnsignedSmart(-959857047);
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				class572_sub15.readUnsignedSmart(-383709974);
				class572_sub15.readUnsignedByte(1481472996);
			}
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(172245202);
			if (i == 0)
				break;
			method1513(class572_sub15, i, 385890430);
		}
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_10_ = class572_sub15.readUnsignedByte(1166852962);
			if (i_10_ == 0)
				break;
			method1513(class572_sub15, i_10_, 385890430);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	void method1515(RSByteBuffer class572_sub15, int i) {
		if (i == 2) {
			aBoolArray1235 = new boolean[400];
			int i_11_ = class572_sub15.readUnsignedSmart(-1911039596);
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				aBoolArray1235[class572_sub15.readUnsignedSmart(-384389328)] = true;
		} else if (3 == i) {
			class572_sub15.readUnsignedByte(1765703618);
			int i_13_ = class572_sub15.readUnsignedSmart(-1607861732);
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				class572_sub15.readUnsignedSmart(-1144097907);
				class572_sub15.readUnsignedByte(426134027);
			}
		}
	}

	void method1516(RSByteBuffer class572_sub15, int i) {
		if (i == 2) {
			aBoolArray1235 = new boolean[400];
			int i_15_ = class572_sub15.readUnsignedSmart(-1991611069);
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				aBoolArray1235[class572_sub15.readUnsignedSmart(62019584)] = true;
		} else if (3 == i) {
			class572_sub15.readUnsignedByte(544003249);
			int i_17_ = class572_sub15.readUnsignedSmart(-46908819);
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				class572_sub15.readUnsignedSmart(1931351360);
				class572_sub15.readUnsignedByte(1656232586);
			}
		}
	}

	void method1517(RSByteBuffer class572_sub15, int i) {
		if (i == 2) {
			aBoolArray1235 = new boolean[400];
			int i_19_ = class572_sub15.readUnsignedSmart(-2035062035);
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
				aBoolArray1235[class572_sub15.readUnsignedSmart(-432060416)] = true;
		} else if (3 == i) {
			class572_sub15.readUnsignedByte(1838280541);
			int i_21_ = class572_sub15.readUnsignedSmart(1072293202);
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
				class572_sub15.readUnsignedSmart(-1544867022);
				class572_sub15.readUnsignedByte(2071100783);
			}
		}
	}

	Class91() {
		/* empty */
	}

	public void method104(byte i) {
		/* empty */
	}

	public static byte[][][] method1518(int i, int i_23_) {
		byte[][][] is = new byte[8][4][];
		int i_24_ = i;
		int i_25_ = i;
		byte[] is_26_ = new byte[i_24_ * i_25_];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
			for (int i_29_ = 0; i_29_ < i_24_; i_29_++) {
				if (i_29_ <= i_28_)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[0][0] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_30_ = i_25_ - 1; i_30_ >= 0; i_30_--) {
			for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
				if (i_31_ <= i_30_)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[0][1] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_32_ = 0; i_32_ < i_25_; i_32_++) {
			for (int i_33_ = 0; i_33_ < i_24_; i_33_++) {
				if (i_33_ >= i_32_)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[0][2] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_34_ = i_25_ - 1; i_34_ >= 0; i_34_--) {
			for (int i_35_ = 0; i_35_ < i_24_; i_35_++) {
				if (i_35_ >= i_34_)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[0][3] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_36_ = i_25_ - 1; i_36_ >= 0; i_36_--) {
			for (int i_37_ = 0; i_37_ < i_24_; i_37_++) {
				if (i_37_ <= i_36_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[1][0] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_38_ = 0; i_38_ < i_25_; i_38_++) {
			for (int i_39_ = 0; i_39_ < i_24_; i_39_++) {
				if (i_27_ < 0 || i_27_ >= is_26_.length)
					i_27_++;
				else {
					if (i_39_ >= i_38_ << 1)
						is_26_[i_27_] = (byte) -1;
					i_27_++;
				}
			}
		}
		is[1][1] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_40_ = 0; i_40_ < i_25_; i_40_++) {
			for (int i_41_ = i_24_ - 1; i_41_ >= 0; i_41_--) {
				if (i_41_ <= i_40_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[1][2] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_42_ = i_25_ - 1; i_42_ >= 0; i_42_--) {
			for (int i_43_ = i_24_ - 1; i_43_ >= 0; i_43_--) {
				if (i_43_ >= i_42_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[1][3] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_44_ = i_25_ - 1; i_44_ >= 0; i_44_--) {
			for (int i_45_ = i_24_ - 1; i_45_ >= 0; i_45_--) {
				if (i_45_ <= i_44_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[2][0] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_46_ = i_25_ - 1; i_46_ >= 0; i_46_--) {
			for (int i_47_ = 0; i_47_ < i_24_; i_47_++) {
				if (i_47_ >= i_46_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[2][1] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_48_ = 0; i_48_ < i_25_; i_48_++) {
			for (int i_49_ = 0; i_49_ < i_24_; i_49_++) {
				if (i_49_ <= i_48_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[2][2] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_50_ = 0; i_50_ < i_25_; i_50_++) {
			for (int i_51_ = i_24_ - 1; i_51_ >= 0; i_51_--) {
				if (i_51_ >= i_50_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[2][3] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_52_ = i_25_ - 1; i_52_ >= 0; i_52_--) {
			for (int i_53_ = 0; i_53_ < i_24_; i_53_++) {
				if (i_53_ >= i_52_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[3][0] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_54_ = 0; i_54_ < i_25_; i_54_++) {
			for (int i_55_ = 0; i_55_ < i_24_; i_55_++) {
				if (i_55_ <= i_54_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[3][1] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_56_ = 0; i_56_ < i_25_; i_56_++) {
			for (int i_57_ = i_24_ - 1; i_57_ >= 0; i_57_--) {
				if (i_57_ >= i_56_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[3][2] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_58_ = i_25_ - 1; i_58_ >= 0; i_58_--) {
			for (int i_59_ = i_24_ - 1; i_59_ >= 0; i_59_--) {
				if (i_59_ <= i_58_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[3][3] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_60_ = i_25_ - 1; i_60_ >= 0; i_60_--) {
			for (int i_61_ = i_24_ - 1; i_61_ >= 0; i_61_--) {
				if (i_61_ >= i_60_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[4][0] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_62_ = i_25_ - 1; i_62_ >= 0; i_62_--) {
			for (int i_63_ = 0; i_63_ < i_24_; i_63_++) {
				if (i_63_ <= i_62_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[4][1] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_64_ = 0; i_64_ < i_25_; i_64_++) {
			for (int i_65_ = 0; i_65_ < i_24_; i_65_++) {
				if (i_65_ >= i_64_ >> 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[4][2] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_66_ = 0; i_66_ < i_25_; i_66_++) {
			for (int i_67_ = i_24_ - 1; i_67_ >= 0; i_67_--) {
				if (i_67_ <= i_66_ << 1)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[4][3] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_68_ = 0; i_68_ < i_25_; i_68_++) {
			for (int i_69_ = 0; i_69_ < i_24_; i_69_++) {
				if (i_69_ <= i_24_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[5][0] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_70_ = 0; i_70_ < i_25_; i_70_++) {
			for (int i_71_ = 0; i_71_ < i_24_; i_71_++) {
				if (i_70_ <= i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[5][1] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_72_ = 0; i_72_ < i_25_; i_72_++) {
			for (int i_73_ = 0; i_73_ < i_24_; i_73_++) {
				if (i_73_ >= i_24_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[5][2] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_74_ = 0; i_74_ < i_25_; i_74_++) {
			for (int i_75_ = 0; i_75_ < i_24_; i_75_++) {
				if (i_74_ >= i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[5][3] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_76_ = 0; i_76_ < i_25_; i_76_++) {
			for (int i_77_ = 0; i_77_ < i_24_; i_77_++) {
				if (i_77_ <= i_76_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[6][0] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_78_ = i_25_ - 1; i_78_ >= 0; i_78_--) {
			for (int i_79_ = 0; i_79_ < i_24_; i_79_++) {
				if (i_79_ <= i_78_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[6][1] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_80_ = i_25_ - 1; i_80_ >= 0; i_80_--) {
			for (int i_81_ = i_24_ - 1; i_81_ >= 0; i_81_--) {
				if (i_81_ <= i_80_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[6][2] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_82_ = 0; i_82_ < i_25_; i_82_++) {
			for (int i_83_ = i_24_ - 1; i_83_ >= 0; i_83_--) {
				if (i_83_ <= i_82_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[6][3] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_84_ = 0; i_84_ < i_25_; i_84_++) {
			for (int i_85_ = 0; i_85_ < i_24_; i_85_++) {
				if (i_85_ >= i_84_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[7][0] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_86_ = i_25_ - 1; i_86_ >= 0; i_86_--) {
			for (int i_87_ = 0; i_87_ < i_24_; i_87_++) {
				if (i_87_ >= i_86_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[7][1] = is_26_;
		is_26_ = new byte[i_25_ * i_24_];
		i_27_ = 0;
		for (int i_88_ = i_25_ - 1; i_88_ >= 0; i_88_--) {
			for (int i_89_ = i_24_ - 1; i_89_ >= 0; i_89_--) {
				if (i_89_ >= i_88_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[7][2] = is_26_;
		is_26_ = new byte[i_24_ * i_25_];
		i_27_ = 0;
		for (int i_90_ = 0; i_90_ < i_25_; i_90_++) {
			for (int i_91_ = i_24_ - 1; i_91_ >= 0; i_91_--) {
				if (i_91_ >= i_90_ - i_25_ / 2)
					is_26_[i_27_] = (byte) -1;
				i_27_++;
			}
		}
		is[7][3] = is_26_;
		return is;
	}

	static final void method1519(Cs2Executor class441, byte i) {
		int i_92_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class282.method3819((char) i_92_, (byte) 0) ? 1 : 0;
	}

	static final void method1520(Cs2Executor class441, byte i) {
		int i_93_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (Class502.method6006(i_93_, 2056928871) / 60000L);
	}
}
