package game;

/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class159 {
	public int[] anIntArray1770;
	public float[] aFloatArray1771;
	static final int anInt1772 = 1;
	public int anInt1773 = 12;
	public int[] anIntArray1774;
	public int anInt1775;
	public short[] faceTextures;
	public int[] anIntArray1777;
	public int anInt1778;
	byte aByte1779;
	public int[] anIntArray1780;
	public short[] aShortArray1781;
	public int[] anIntArray1782;
	public Class107[] aClass107Array1783;
	public float[] aFloatArray1784;
	public byte[] uvCoordVertexA;
	public short[] aShortArray1786;
	public short[] aShortArray1787;
	public int[] anIntArray1788;
	public short[] aShortArray1789;
	public byte[] uvCoordVertexB;
	public int anInt1791 = 0;
	public byte[] aByteArray1792;
	public int[] anIntArray1793;
	public byte[] faceAlpha;
	public short[] faceTextureIndexes;
	public short[] faceColours;
	public int[] anIntArray1797;
	public byte[] uvCoordVertexC;
	public byte[] aByteArray1799;
	public short[] aShortArray1800;
	public static final short aShort1801 = -1;
	public static final short aShort1802 = 32766;
	int anInt1803;
	public byte[] aByteArray1804;
	public short[] aShortArray1805;
	public short[] aShortArray1806;
	public short[] aShortArray1807;
	public int[] anIntArray1808;
	static final int anInt1809 = 26;
	public int[] anIntArray1810;
	static final int anInt1811 = 3;
	public int[] anIntArray1812;
	public int[] anIntArray1813;
	byte[] aByteArray1814;
	public byte[] aByteArray1815;
	public Class84[] aClass84Array1816;
	public Class175[] aClass175Array1817;
	int anInt1818;

	public byte method2552(short i, short i_0_, short i_1_, short i_2_, short i_3_, short i_4_, byte i_5_, byte i_6_, byte i_7_) {
		if (((Class159) this).anInt1803 >= 255)
			throw new IllegalStateException();
		aByteArray1804[((Class159) this).anInt1803] = (byte) 3;
		aShortArray1805[((Class159) this).anInt1803] = i;
		aShortArray1806[((Class159) this).anInt1803] = i_0_;
		aShortArray1807[((Class159) this).anInt1803] = i_1_;
		anIntArray1788[((Class159) this).anInt1803] = i_2_;
		anIntArray1770[((Class159) this).anInt1803] = i_3_;
		anIntArray1810[((Class159) this).anInt1803] = i_4_;
		((Class159) this).aByteArray1814[((Class159) this).anInt1803] = i_5_;
		aByteArray1815[((Class159) this).anInt1803] = i_6_;
		anIntArray1793[((Class159) this).anInt1803] = i_7_;
		return (byte) ((Class159) this).anInt1803++;
	}

	public Class159(byte[] is) {
		anInt1775 = 0;
		anInt1778 = 0;
		((Class159) this).aByte1779 = (byte) 0;
		((Class159) this).anInt1803 = 0;
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_8_ = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_9_ = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_10_ = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_11_ = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_12_ = new RSByteBuffer(is);
		RSByteBuffer class572_sub15_13_ = new RSByteBuffer(is);
		int i = class572_sub15.readUnsignedByte(1361089325);
		if (i != 1)
			System.out.println(new StringBuilder().append("").append(i).toString());
		else {
			class572_sub15.readUnsignedByte(768503588);
			anInt1773 = class572_sub15.readUnsignedByte(178188476);
			class572_sub15.o = (is.length - 26) * 310393755;
			anInt1791 = class572_sub15.readUnsignedShort(647518597);
			anInt1778 = class572_sub15.readUnsignedShort(647518597);
			((Class159) this).anInt1803 = class572_sub15.readUnsignedShort(647518597);
			int i_14_ = class572_sub15.readUnsignedByte(572136351);
			boolean bool = (i_14_ & 0x1) == 1;
			boolean bool_15_ = (i_14_ & 0x2) == 2;
			boolean bool_16_ = (i_14_ & 0x4) == 4;
			boolean bool_17_ = (i_14_ & 0x10) == 16;
			boolean bool_18_ = (i_14_ & 0x20) == 32;
			boolean bool_19_ = (i_14_ & 0x40) == 64;
			boolean bool_20_ = (i_14_ & 0x80) == 128;
			int i_21_ = class572_sub15.readUnsignedByte(881444697);
			int i_22_ = class572_sub15.readUnsignedByte(1974972039);
			int i_23_ = class572_sub15.readUnsignedByte(1769602785);
			int i_24_ = class572_sub15.readUnsignedByte(1890801354);
			int i_25_ = class572_sub15.readUnsignedByte(393093811);
			int i_26_ = class572_sub15.readUnsignedShort(647518597);
			int i_27_ = class572_sub15.readUnsignedShort(647518597);
			int i_28_ = class572_sub15.readUnsignedShort(647518597);
			int i_29_ = class572_sub15.readUnsignedShort(647518597);
			int i_30_ = class572_sub15.readUnsignedShort(647518597);
			int i_31_ = class572_sub15.readUnsignedShort(647518597);
			int i_32_ = class572_sub15.readUnsignedShort(647518597);
			if (!bool_17_) {
				if (i_25_ == 1)
					i_31_ = anInt1791;
				else
					i_31_ = 0;
			}
			if (!bool_18_) {
				if (i_23_ == 1)
					i_32_ = anInt1778;
				else
					i_32_ = 0;
			}
			int i_33_ = 0;
			int i_34_ = 0;
			int i_35_ = 0;
			if (((Class159) this).anInt1803 > 0) {
				aByteArray1804 = new byte[((Class159) this).anInt1803];
				class572_sub15.o = 931181265;
				for (int i_36_ = 0; i_36_ < ((Class159) this).anInt1803; i_36_++) {
					byte i_37_ = (aByteArray1804[i_36_] = class572_sub15.readByte(576000703));
					if (i_37_ == 0)
						i_33_++;
					if (i_37_ >= 1 && i_37_ <= 3)
						i_34_++;
					if (i_37_ == 2)
						i_35_++;
				}
			}
			int i_38_ = 3 + ((Class159) this).anInt1803;
			int i_39_ = i_38_;
			i_38_ += anInt1791;
			int i_40_ = i_38_;
			if (bool)
				i_38_ += anInt1778;
			int i_41_ = i_38_;
			i_38_ += anInt1778;
			int i_42_ = i_38_;
			if (i_21_ == 255)
				i_38_ += anInt1778;
			int i_43_ = i_38_;
			i_38_ += i_32_;
			int i_44_ = i_38_;
			i_38_ += i_31_;
			int i_45_ = i_38_;
			if (i_22_ == 1)
				i_38_ += anInt1778;
			int i_46_ = i_38_;
			i_38_ += i_29_;
			int i_47_ = i_38_;
			if (i_24_ == 1)
				i_38_ += anInt1778 * 2;
			int i_48_ = i_38_;
			i_38_ += i_30_;
			int i_49_ = i_38_;
			i_38_ += anInt1778 * 2;
			int i_50_ = i_38_;
			i_38_ += i_26_;
			int i_51_ = i_38_;
			i_38_ += i_27_;
			int i_52_ = i_38_;
			i_38_ += i_28_;
			int i_53_ = i_38_;
			i_38_ += i_33_ * 6;
			int i_54_ = i_38_;
			i_38_ += i_34_ * 6;
			int i_55_ = 6;
			if (anInt1773 == 14)
				i_55_ = 7;
			else if (anInt1773 >= 15)
				i_55_ = 9;
			int i_56_ = i_38_;
			i_38_ += i_34_ * i_55_;
			int i_57_ = i_38_;
			i_38_ += i_34_;
			int i_58_ = i_38_;
			i_38_ += i_34_;
			int i_59_ = i_38_;
			i_38_ += i_34_ + i_35_ * 2;
			int i_60_ = i_38_;
			int i_61_ = is.length;
			int i_62_ = is.length;
			int i_63_ = is.length;
			int i_64_ = is.length;
			if (bool_20_) {
				RSByteBuffer class572_sub15_65_ = new RSByteBuffer(is);
				class572_sub15_65_.o = (is.length - 26) * 310393755;
				class572_sub15_65_.o -= (is[class572_sub15_65_.o * -1585139053 - 1] * 310393755);
				((Class159) this).anInt1818 = class572_sub15_65_.readUnsignedShort(647518597);
				int i_66_ = class572_sub15_65_.readUnsignedShort(647518597);
				int i_67_ = class572_sub15_65_.readUnsignedShort(647518597);
				i_61_ = i_60_ + i_66_;
				i_62_ = i_61_ + i_67_;
				i_63_ = i_62_ + anInt1791;
				i_64_ = i_63_ + ((Class159) this).anInt1818 * 2;
			}
			anIntArray1782 = new int[anInt1791];
			anIntArray1777 = new int[anInt1791];
			anIntArray1797 = new int[anInt1791];
			aShortArray1786 = new short[anInt1778];
			aShortArray1787 = new short[anInt1778];
			aShortArray1789 = new short[anInt1778];
			if (i_25_ == 1)
				anIntArray1813 = new int[anInt1791];
			if (bool)
				aByteArray1792 = new byte[anInt1778];
			if (i_21_ == 255)
				aByteArray1799 = new byte[anInt1778];
			else
				((Class159) this).aByte1779 = (byte) i_21_;
			if (i_22_ == 1)
				faceAlpha = new byte[anInt1778];
			if (i_23_ == 1)
				anIntArray1780 = new int[anInt1778];
			if (i_24_ == 1)
				faceTextures = new short[anInt1778];
			if (i_24_ == 1 && (((Class159) this).anInt1803 > 0 || ((Class159) this).anInt1818 > 0))
				faceTextureIndexes = new short[anInt1778];
			faceColours = new short[anInt1778];
			if (((Class159) this).anInt1803 > 0) {
				aShortArray1805 = new short[((Class159) this).anInt1803];
				aShortArray1806 = new short[((Class159) this).anInt1803];
				aShortArray1807 = new short[((Class159) this).anInt1803];
				if (i_34_ > 0) {
					anIntArray1788 = new int[i_34_];
					anIntArray1770 = new int[i_34_];
					anIntArray1810 = new int[i_34_];
					((Class159) this).aByteArray1814 = new byte[i_34_];
					aByteArray1815 = new byte[i_34_];
					anIntArray1793 = new int[i_34_];
				}
				if (i_35_ > 0) {
					anIntArray1812 = new int[i_35_];
					anIntArray1808 = new int[i_35_];
				}
			}
			class572_sub15.o = i_39_ * 310393755;
			class572_sub15_8_.o = i_50_ * 310393755;
			class572_sub15_9_.o = i_51_ * 310393755;
			class572_sub15_10_.o = i_52_ * 310393755;
			class572_sub15_11_.o = i_44_ * 310393755;
			int i_68_ = 0;
			int i_69_ = 0;
			int i_70_ = 0;
			for (int i_71_ = 0; i_71_ < anInt1791; i_71_++) {
				int i_72_ = class572_sub15.readUnsignedByte(960306565);
				int i_73_ = 0;
				if ((i_72_ & 0x1) != 0)
					i_73_ = class572_sub15_8_.readSmart(16777215);
				int i_74_ = 0;
				if ((i_72_ & 0x2) != 0)
					i_74_ = class572_sub15_9_.readSmart(16777215);
				int i_75_ = 0;
				if ((i_72_ & 0x4) != 0)
					i_75_ = class572_sub15_10_.readSmart(16777215);
				anIntArray1782[i_71_] = i_68_ + i_73_;
				anIntArray1777[i_71_] = i_69_ + i_74_;
				anIntArray1797[i_71_] = i_70_ + i_75_;
				i_68_ = anIntArray1782[i_71_];
				i_69_ = anIntArray1777[i_71_];
				i_70_ = anIntArray1797[i_71_];
				if (i_25_ == 1) {
					if (bool_17_)
						anIntArray1813[i_71_] = class572_sub15_11_.readSmart((byte) 90);
					else {
						anIntArray1813[i_71_] = class572_sub15_11_.readUnsignedByte(602582294);
						if (anIntArray1813[i_71_] == 255)
							anIntArray1813[i_71_] = -1;
					}
				}
			}
			if (((Class159) this).anInt1818 > 0) {
				class572_sub15.o = i_62_ * 310393755;
				class572_sub15_8_.o = i_63_ * 310393755;
				class572_sub15_9_.o = i_64_ * 310393755;
				anIntArray1774 = new int[anInt1791];
				int i_76_ = 0;
				int i_77_ = 0;
				for (/**/; i_76_ < anInt1791; i_76_++) {
					anIntArray1774[i_76_] = i_77_;
					i_77_ += class572_sub15.readUnsignedByte(2071297684);
				}
				uvCoordVertexA = new byte[anInt1778];
				uvCoordVertexB = new byte[anInt1778];
				uvCoordVertexC = new byte[anInt1778];
				aFloatArray1771 = new float[((Class159) this).anInt1818];
				aFloatArray1784 = new float[((Class159) this).anInt1818];
				for (i_76_ = 0; i_76_ < ((Class159) this).anInt1818; i_76_++) {
					aFloatArray1771[i_76_] = ((float) class572_sub15_8_.readShort(-710976385) / 4096.0F);
					aFloatArray1784[i_76_] = ((float) class572_sub15_9_.readShort(-710976385) / 4096.0F);
				}
			}
			class572_sub15.o = i_49_ * 310393755;
			class572_sub15_8_.o = i_40_ * 310393755;
			class572_sub15_9_.o = i_42_ * 310393755;
			class572_sub15_10_.o = i_45_ * 310393755;
			class572_sub15_11_.o = i_43_ * 310393755;
			class572_sub15_12_.o = i_47_ * 310393755;
			class572_sub15_13_.o = i_48_ * 310393755;
			for (int i_78_ = 0; i_78_ < anInt1778; i_78_++) {
				faceColours[i_78_] = (short) class572_sub15.readUnsignedShort(647518597);
				if (bool)
					aByteArray1792[i_78_] = class572_sub15_8_.readByte(784438132);
				if (i_21_ == 255)
					aByteArray1799[i_78_] = class572_sub15_9_.readByte(1856532784);
				if (i_22_ == 1)
					faceAlpha[i_78_] = class572_sub15_10_.readByte(441826899);
				if (i_23_ == 1) {
					if (bool_18_)
						anIntArray1780[i_78_] = class572_sub15_11_.readSmart((byte) 20);
					else {
						anIntArray1780[i_78_] = class572_sub15_11_.readUnsignedByte(1098490292);
						if (anIntArray1780[i_78_] == 255)
							anIntArray1780[i_78_] = -1;
					}
				}
				if (i_24_ == 1)
					faceTextures[i_78_] = (short) (class572_sub15_12_.readUnsignedShort(647518597) - 1);
				if (faceTextureIndexes != null) {
					if (faceTextures[i_78_] != -1) {
						if (anInt1773 >= 16)
							faceTextureIndexes[i_78_] = (short) (class572_sub15_13_.readUnsignedSmart(83992) - 1);
						else
							faceTextureIndexes[i_78_] = (short) (class572_sub15_13_.readUnsignedByte(1954178286) - 1);
					} else
						faceTextureIndexes[i_78_] = (short) -1;
				}
			}
			anInt1775 = -1;
			class572_sub15.o = i_46_ * 310393755;
			class572_sub15_8_.o = i_41_ * 310393755;
			class572_sub15_9_.o = i_61_ * 310393755;
			method2558(class572_sub15, class572_sub15_8_, class572_sub15_9_);
			class572_sub15.o = i_53_ * 310393755;
			class572_sub15_8_.o = i_54_ * 310393755;
			class572_sub15_9_.o = i_56_ * 310393755;
			class572_sub15_10_.o = i_57_ * 310393755;
			class572_sub15_11_.o = i_58_ * 310393755;
			class572_sub15_12_.o = i_59_ * 310393755;
			method2555(class572_sub15, class572_sub15_8_, class572_sub15_9_, class572_sub15_10_, class572_sub15_11_, class572_sub15_12_);
			class572_sub15.o = i_60_ * 310393755;
			if (bool_15_) {
				int i_79_ = class572_sub15.readUnsignedByte(1923127737);
				if (i_79_ > 0) {
					aClass84Array1816 = new Class84[i_79_];
					for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
						int i_81_ = class572_sub15.readUnsignedShort(647518597);
						int i_82_ = class572_sub15.readUnsignedShort(647518597);
						byte i_83_;
						if (i_21_ == 255)
							i_83_ = aByteArray1799[i_82_];
						else
							i_83_ = (byte) i_21_;
						aClass84Array1816[i_80_] = new Class84(i_81_, i_82_, aShortArray1786[i_82_], aShortArray1787[i_82_], aShortArray1789[i_82_], i_83_);
					}
				}
				int i_84_ = class572_sub15.readUnsignedByte(1243344209);
				if (i_84_ > 0) {
					aClass175Array1817 = new Class175[i_84_];
					for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
						int i_86_ = class572_sub15.readUnsignedShort(647518597);
						int i_87_ = class572_sub15.readUnsignedShort(647518597);
						aClass175Array1817[i_85_] = new Class175(i_86_, i_87_);
					}
				}
			}
			if (bool_16_) {
				int i_88_ = class572_sub15.readUnsignedByte(1336971359);
				if (i_88_ > 0) {
					aClass107Array1783 = new Class107[i_88_];
					for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
						int i_90_ = class572_sub15.readUnsignedShort(647518597);
						int i_91_ = class572_sub15.readUnsignedShort(647518597);
						int i_92_;
						if (bool_19_)
							i_92_ = class572_sub15.readSmart((byte) 9);
						else {
							i_92_ = class572_sub15.readUnsignedByte(1613790047);
							if (i_92_ == 255)
								i_92_ = -1;
						}
						byte i_93_ = class572_sub15.readByte(166320120);
						aClass107Array1783[i_89_] = new Class107(i_90_, i_91_, i_92_, i_93_);
					}
				}
			}
		}
	}

	public Class159(int i, int i_94_, int i_95_) {
		anInt1775 = 0;
		anInt1778 = 0;
		((Class159) this).aByte1779 = (byte) 0;
		((Class159) this).anInt1803 = 0;
		anIntArray1782 = new int[i];
		anIntArray1777 = new int[i];
		anIntArray1797 = new int[i];
		anIntArray1813 = new int[i];
		aShortArray1786 = new short[i_94_];
		aShortArray1787 = new short[i_94_];
		aShortArray1789 = new short[i_94_];
		aByteArray1792 = new byte[i_94_];
		aByteArray1799 = new byte[i_94_];
		faceAlpha = new byte[i_94_];
		faceTextureIndexes = new short[i_94_];
		faceColours = new short[i_94_];
		faceTextures = new short[i_94_];
		anIntArray1780 = new int[i_94_];
		if (i_95_ > 0) {
			aByteArray1804 = new byte[i_95_];
			aShortArray1805 = new short[i_95_];
			aShortArray1806 = new short[i_95_];
			aShortArray1807 = new short[i_95_];
			anIntArray1788 = new int[i_95_];
			anIntArray1770 = new int[i_95_];
			anIntArray1810 = new int[i_95_];
			((Class159) this).aByteArray1814 = new byte[i_95_];
			aByteArray1815 = new byte[i_95_];
			anIntArray1793 = new int[i_95_];
			anIntArray1812 = new int[i_95_];
			anIntArray1808 = new int[i_95_];
		}
	}

	public int[][] method2553() {
		int[] is = new int[256];
		int i = 0;
		for (int i_96_ = 0; i_96_ < anInt1778; i_96_++) {
			int i_97_ = anIntArray1780[i_96_];
			if (i_97_ >= 0) {
				is[i_97_]++;
				if (i_97_ > i)
					i = i_97_;
			}
		}
		int[][] is_98_ = new int[i + 1][];
		for (int i_99_ = 0; i_99_ <= i; i_99_++) {
			is_98_[i_99_] = new int[is[i_99_]];
			is[i_99_] = 0;
		}
		for (int i_100_ = 0; i_100_ < anInt1778; i_100_++) {
			int i_101_ = anIntArray1780[i_100_];
			if (i_101_ >= 0)
				is_98_[i_101_][is[i_101_]++] = i_100_;
		}
		return is_98_;
	}

	public void method2554(float f) {
		for (int i = 0; i < anInt1791; i++) {
			anIntArray1782[i] *= f;
			anIntArray1777[i] *= f;
			anIntArray1797[i] *= f;
		}
		if (((Class159) this).anInt1803 > 0 && anIntArray1788 != null) {
			for (int i = 0; i < anIntArray1788.length; i++) {
				anIntArray1788[i] *= f;
				anIntArray1770[i] *= f;
				if (aByteArray1804[i] != 1)
					anIntArray1810[i] *= f;
			}
		}
	}

	void method2555(RSByteBuffer class572_sub15, RSByteBuffer class572_sub15_102_, RSByteBuffer class572_sub15_103_, RSByteBuffer class572_sub15_104_, RSByteBuffer class572_sub15_105_, RSByteBuffer class572_sub15_106_) {
		for (int i = 0; i < ((Class159) this).anInt1803; i++) {
			int i_107_ = aByteArray1804[i] & 0xff;
			if (i_107_ == 0) {
				aShortArray1805[i] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray1806[i] = (short) class572_sub15.readUnsignedShort(647518597);
				aShortArray1807[i] = (short) class572_sub15.readUnsignedShort(647518597);
			}
			if (i_107_ == 1) {
				aShortArray1805[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1806[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1807[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				if (anInt1773 < 15) {
					anIntArray1788[i] = class572_sub15_103_.readUnsignedShort(647518597);
					if (anInt1773 < 14)
						anIntArray1770[i] = class572_sub15_103_.readUnsignedShort(647518597);
					else
						anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.readUnsignedShort(647518597);
				} else {
					anIntArray1788[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.read24BitInt(1140925462);
				}
				((Class159) this).aByteArray1814[i] = class572_sub15_104_.readByte(556509045);
				aByteArray1815[i] = class572_sub15_105_.readByte(99073642);
				anIntArray1793[i] = class572_sub15_106_.readByte(987902497);
			}
			if (i_107_ == 2) {
				aShortArray1805[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1806[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1807[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				if (anInt1773 < 15) {
					anIntArray1788[i] = class572_sub15_103_.readUnsignedShort(647518597);
					if (anInt1773 < 14)
						anIntArray1770[i] = class572_sub15_103_.readUnsignedShort(647518597);
					else
						anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.readUnsignedShort(647518597);
				} else {
					anIntArray1788[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.read24BitInt(1140925462);
				}
				((Class159) this).aByteArray1814[i] = class572_sub15_104_.readByte(1775191667);
				aByteArray1815[i] = class572_sub15_105_.readByte(389193520);
				anIntArray1793[i] = class572_sub15_106_.readByte(664186776);
				anIntArray1812[i] = class572_sub15_106_.readByte(385563856);
				anIntArray1808[i] = class572_sub15_106_.readByte(2000788787);
			}
			if (i_107_ == 3) {
				aShortArray1805[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1806[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				aShortArray1807[i] = (short) class572_sub15_102_.readUnsignedShort(647518597);
				if (anInt1773 < 15) {
					anIntArray1788[i] = class572_sub15_103_.readUnsignedShort(647518597);
					if (anInt1773 < 14)
						anIntArray1770[i] = class572_sub15_103_.readUnsignedShort(647518597);
					else
						anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.readUnsignedShort(647518597);
				} else {
					anIntArray1788[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1770[i] = class572_sub15_103_.read24BitInt(1140925462);
					anIntArray1810[i] = class572_sub15_103_.read24BitInt(1140925462);
				}
				((Class159) this).aByteArray1814[i] = class572_sub15_104_.readByte(547126451);
				aByteArray1815[i] = class572_sub15_105_.readByte(1582129811);
				anIntArray1793[i] = class572_sub15_106_.readByte(169052727);
			}
		}
	}

	public int method2556(int i, int i_108_, int i_109_) {
		for (int i_110_ = 0; i_110_ < anInt1791; i_110_++) {
			if (anIntArray1782[i_110_] == i && anIntArray1777[i_110_] == i_108_ && anIntArray1797[i_110_] == i_109_)
				return i_110_;
		}
		anIntArray1782[anInt1791] = i;
		anIntArray1777[anInt1791] = i_108_;
		anIntArray1797[anInt1791] = i_109_;
		anInt1775 = anInt1791 + 1;
		return anInt1791++;
	}

	public int method2557(int i, int i_111_, int i_112_, byte i_113_, byte i_114_, short i_115_, byte i_116_, short i_117_) {
		aShortArray1786[anInt1778] = (short) i;
		aShortArray1787[anInt1778] = (short) i_111_;
		aShortArray1789[anInt1778] = (short) i_112_;
		aByteArray1792[anInt1778] = i_113_;
		faceTextureIndexes[anInt1778] = (short) i_114_;
		faceColours[anInt1778] = i_115_;
		faceAlpha[anInt1778] = i_116_;
		faceTextures[anInt1778] = i_117_;
		return anInt1778++;
	}

	void method2558(RSByteBuffer class572_sub15, RSByteBuffer class572_sub15_118_, RSByteBuffer class572_sub15_119_) {
		short i = 0;
		short i_120_ = 0;
		short i_121_ = 0;
		int i_122_ = 0;
		for (int i_123_ = 0; i_123_ < anInt1778; i_123_++) {
			int i_124_ = class572_sub15_118_.readUnsignedByte(1462187862);
			int i_125_ = i_124_ & 0x7;
			if (i_125_ == 1) {
				aShortArray1786[i_123_] = i = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i;
				aShortArray1787[i_123_] = i_120_ = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i_120_;
				aShortArray1789[i_123_] = i_121_ = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i_121_;
				if (i > anInt1775)
					anInt1775 = i;
				if (i_120_ > anInt1775)
					anInt1775 = i_120_;
				if (i_121_ > anInt1775)
					anInt1775 = i_121_;
			}
			if (i_125_ == 2) {
				i_120_ = i_121_;
				i_121_ = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i_121_;
				aShortArray1786[i_123_] = i;
				aShortArray1787[i_123_] = i_120_;
				aShortArray1789[i_123_] = i_121_;
				if (i_121_ > anInt1775)
					anInt1775 = i_121_;
			}
			if (i_125_ == 3) {
				i = i_121_;
				i_121_ = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i_121_;
				aShortArray1786[i_123_] = i;
				aShortArray1787[i_123_] = i_120_;
				aShortArray1789[i_123_] = i_121_;
				if (i_121_ > anInt1775)
					anInt1775 = i_121_;
			}
			if (i_125_ == 4) {
				short i_126_ = i;
				i = i_120_;
				i_120_ = i_126_;
				i_121_ = (short) (class572_sub15.readSmart(16777215) + i_122_);
				i_122_ = i_121_;
				aShortArray1786[i_123_] = i;
				aShortArray1787[i_123_] = i_120_;
				aShortArray1789[i_123_] = i_121_;
				if (i_121_ > anInt1775)
					anInt1775 = i_121_;
			}
			if (((Class159) this).anInt1818 > 0 && (i_124_ & 0x8) != 0) {
				uvCoordVertexA[i_123_] = (byte) class572_sub15_119_.readUnsignedByte(1615425009);
				uvCoordVertexB[i_123_] = (byte) class572_sub15_119_.readUnsignedByte(1480897227);
				uvCoordVertexC[i_123_] = (byte) class572_sub15_119_.readUnsignedByte(58088994);
			}
		}
		anInt1775++;
	}

	public int[][] method2559(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_127_ = bool ? anInt1791 : anInt1775;
		for (int i_128_ = 0; i_128_ < i_127_; i_128_++) {
			int i_129_ = anIntArray1813[i_128_];
			if (i_129_ >= 0) {
				is[i_129_]++;
				if (i_129_ > i)
					i = i_129_;
			}
		}
		int[][] is_130_ = new int[i + 1][];
		for (int i_131_ = 0; i_131_ <= i; i_131_++) {
			is_130_[i_131_] = new int[is[i_131_]];
			is[i_131_] = 0;
		}
		for (int i_132_ = 0; i_132_ < i_127_; i_132_++) {
			int i_133_ = anIntArray1813[i_132_];
			if (i_133_ >= 0)
				is_130_[i_133_][is[i_133_]++] = i_132_;
		}
		return is_130_;
	}

	public int method2560(int i, int i_134_, int i_135_) {
		for (int i_136_ = 0; i_136_ < anInt1791; i_136_++) {
			if (anIntArray1782[i_136_] == i && anIntArray1777[i_136_] == i_134_ && anIntArray1797[i_136_] == i_135_)
				return i_136_;
		}
		anIntArray1782[anInt1791] = i;
		anIntArray1777[anInt1791] = i_134_;
		anIntArray1797[anInt1791] = i_135_;
		anInt1775 = anInt1791 + 1;
		return anInt1791++;
	}

	public int[][] method2561() {
		int[] is = new int[256];
		int i = 0;
		for (int i_137_ = 0; i_137_ < aClass107Array1783.length; i_137_++) {
			int i_138_ = (((Class107) aClass107Array1783[i_137_]).anInt1421 * -1332589219);
			if (i_138_ >= 0) {
				is[i_138_]++;
				if (i_138_ > i)
					i = i_138_;
			}
		}
		int[][] is_139_ = new int[i + 1][];
		for (int i_140_ = 0; i_140_ <= i; i_140_++) {
			is_139_[i_140_] = new int[is[i_140_]];
			is[i_140_] = 0;
		}
		for (int i_141_ = 0; i_141_ < aClass107Array1783.length; i_141_++) {
			int i_142_ = (((Class107) aClass107Array1783[i_141_]).anInt1421 * -1332589219);
			if (i_142_ >= 0)
				is_139_[i_142_][is[i_142_]++] = i_141_;
		}
		return is_139_;
	}

	public void method2562(short i, short i_143_) {
		for (int i_144_ = 0; i_144_ < anInt1778; i_144_++) {
			if (faceColours[i_144_] == i)
				faceColours[i_144_] = i_143_;
		}
	}

	public void method2563(short i, short i_145_) {
		if (faceTextures != null) {
			for (int i_146_ = 0; i_146_ < anInt1778; i_146_++) {
				if (faceTextures[i_146_] == i)
					faceTextures[i_146_] = i_145_;
			}
		}
	}

	public void method2564(int i, int i_147_, int i_148_) {
		for (int i_149_ = 0; i_149_ < anInt1791; i_149_++) {
			anIntArray1782[i_149_] += i;
			anIntArray1777[i_149_] += i_147_;
			anIntArray1797[i_149_] += i_148_;
		}
	}

	public void method2565(int i, int i_150_, int i_151_) {
		if (i_151_ != 0) {
			int i_152_ = Class325.anIntArray4103[i_151_];
			int i_153_ = Class325.anIntArray4105[i_151_];
			for (int i_154_ = 0; i_154_ < anInt1791; i_154_++) {
				int i_155_ = ((anIntArray1777[i_154_] * i_152_ + anIntArray1782[i_154_] * i_153_) >> 14);
				anIntArray1777[i_154_] = (anIntArray1777[i_154_] * i_153_ - anIntArray1782[i_154_] * i_152_) >> 14;
				anIntArray1782[i_154_] = i_155_;
			}
		}
		if (i != 0) {
			int i_156_ = Class325.anIntArray4103[i];
			int i_157_ = Class325.anIntArray4105[i];
			for (int i_158_ = 0; i_158_ < anInt1791; i_158_++) {
				int i_159_ = ((anIntArray1777[i_158_] * i_157_ - anIntArray1797[i_158_] * i_156_) >> 14);
				anIntArray1797[i_158_] = (anIntArray1777[i_158_] * i_156_ + anIntArray1797[i_158_] * i_157_) >> 14;
				anIntArray1777[i_158_] = i_159_;
			}
		}
		if (i_150_ != 0) {
			int i_160_ = Class325.anIntArray4103[i_150_];
			int i_161_ = Class325.anIntArray4105[i_150_];
			for (int i_162_ = 0; i_162_ < anInt1791; i_162_++) {
				int i_163_ = ((anIntArray1797[i_162_] * i_160_ + anIntArray1782[i_162_] * i_161_) >> 14);
				anIntArray1797[i_162_] = (anIntArray1797[i_162_] * i_161_ - anIntArray1782[i_162_] * i_160_) >> 14;
				anIntArray1782[i_162_] = i_163_;
			}
		}
	}

	final int method2566(Class159 class159_164_, int i, short i_165_) {
		int i_166_ = class159_164_.anIntArray1782[i];
		int i_167_ = class159_164_.anIntArray1777[i];
		int i_168_ = class159_164_.anIntArray1797[i];
		for (int i_169_ = 0; i_169_ < anInt1791; i_169_++) {
			if (i_166_ == anIntArray1782[i_169_] && i_167_ == anIntArray1777[i_169_] && i_168_ == anIntArray1797[i_169_]) {
				aShortArray1781[i_169_] |= i_165_;
				return i_169_;
			}
		}
		anIntArray1782[anInt1791] = i_166_;
		anIntArray1777[anInt1791] = i_167_;
		anIntArray1797[anInt1791] = i_168_;
		aShortArray1781[anInt1791] = i_165_;
		anIntArray1813[anInt1791] = (class159_164_.anIntArray1813 != null ? class159_164_.anIntArray1813[i] : -1);
		return anInt1791++;
	}

	public void method2567(int i) {
		for (int i_170_ = 0; i_170_ < anInt1791; i_170_++) {
			anIntArray1782[i_170_] <<= i;
			anIntArray1777[i_170_] <<= i;
			anIntArray1797[i_170_] <<= i;
		}
		if (((Class159) this).anInt1803 > 0 && anIntArray1788 != null) {
			for (int i_171_ = 0; i_171_ < anIntArray1788.length; i_171_++) {
				anIntArray1788[i_171_] <<= i;
				anIntArray1770[i_171_] <<= i;
				if (aByteArray1804[i_171_] != 1)
					anIntArray1810[i_171_] <<= i;
			}
		}
	}

	public Class159(Class159[] class159s, int i) {
		anInt1775 = 0;
		anInt1778 = 0;
		((Class159) this).aByte1779 = (byte) 0;
		((Class159) this).anInt1803 = 0;
		anInt1791 = 0;
		anInt1778 = 0;
		((Class159) this).anInt1803 = 0;
		((Class159) this).anInt1818 = 0;
		int i_172_ = 0;
		int i_173_ = 0;
		int i_174_ = 0;
		boolean bool = false;
		boolean bool_175_ = false;
		boolean bool_176_ = false;
		boolean bool_177_ = false;
		boolean bool_178_ = false;
		boolean bool_179_ = false;
		((Class159) this).aByte1779 = (byte) -1;
		for (int i_180_ = 0; i_180_ < i; i_180_++) {
			Class159 class159_181_ = class159s[i_180_];
			if (class159_181_ != null) {
				anInt1791 += class159_181_.anInt1791;
				anInt1778 += class159_181_.anInt1778;
				((Class159) this).anInt1803 += ((Class159) class159_181_).anInt1803;
				((Class159) this).anInt1818 += ((Class159) class159_181_).anInt1818;
				if (class159_181_.aClass84Array1816 != null)
					i_172_ += class159_181_.aClass84Array1816.length;
				if (class159_181_.aClass175Array1817 != null)
					i_173_ += class159_181_.aClass175Array1817.length;
				if (class159_181_.aClass107Array1783 != null)
					i_174_ += class159_181_.aClass107Array1783.length;
				bool = bool | class159_181_.aByteArray1792 != null;
				if (class159_181_.aByteArray1799 != null)
					bool_175_ = true;
				else {
					if (((Class159) this).aByte1779 == -1)
						((Class159) this).aByte1779 = ((Class159) class159_181_).aByte1779;
					if (((Class159) this).aByte1779 != ((Class159) class159_181_).aByte1779)
						bool_175_ = true;
				}
				bool_176_ = bool_176_ | class159_181_.faceAlpha != null;
				bool_177_ = bool_177_ | class159_181_.faceTextureIndexes != null;
				bool_178_ = bool_178_ | class159_181_.faceTextures != null;
				bool_179_ = bool_179_ | class159_181_.anIntArray1780 != null;
			}
		}
		anIntArray1782 = new int[anInt1791];
		anIntArray1777 = new int[anInt1791];
		anIntArray1797 = new int[anInt1791];
		anIntArray1813 = new int[anInt1791];
		aShortArray1781 = new short[anInt1791];
		aShortArray1786 = new short[anInt1778];
		aShortArray1787 = new short[anInt1778];
		aShortArray1789 = new short[anInt1778];
		if (bool)
			aByteArray1792 = new byte[anInt1778];
		if (bool_175_)
			aByteArray1799 = new byte[anInt1778];
		if (bool_176_)
			faceAlpha = new byte[anInt1778];
		if (bool_177_)
			faceTextureIndexes = new short[anInt1778];
		faceColours = new short[anInt1778];
		if (bool_178_)
			faceTextures = new short[anInt1778];
		if (bool_179_)
			anIntArray1780 = new int[anInt1778];
		aShortArray1800 = new short[anInt1778];
		if (((Class159) this).anInt1803 > 0) {
			aByteArray1804 = new byte[((Class159) this).anInt1803];
			aShortArray1805 = new short[((Class159) this).anInt1803];
			aShortArray1806 = new short[((Class159) this).anInt1803];
			aShortArray1807 = new short[((Class159) this).anInt1803];
			anIntArray1788 = new int[((Class159) this).anInt1803];
			anIntArray1770 = new int[((Class159) this).anInt1803];
			anIntArray1810 = new int[((Class159) this).anInt1803];
			((Class159) this).aByteArray1814 = new byte[((Class159) this).anInt1803];
			aByteArray1815 = new byte[((Class159) this).anInt1803];
			anIntArray1793 = new int[((Class159) this).anInt1803];
			anIntArray1812 = new int[((Class159) this).anInt1803];
			anIntArray1808 = new int[((Class159) this).anInt1803];
		}
		if (i_174_ > 0)
			aClass107Array1783 = new Class107[i_174_];
		if (i_172_ > 0)
			aClass84Array1816 = new Class84[i_172_];
		if (i_173_ > 0)
			aClass175Array1817 = new Class175[i_173_];
		if (((Class159) this).anInt1818 > 0) {
			aFloatArray1771 = new float[((Class159) this).anInt1818];
			aFloatArray1784 = new float[((Class159) this).anInt1818];
			anIntArray1774 = new int[anInt1791];
			uvCoordVertexA = new byte[anInt1778];
			uvCoordVertexB = new byte[anInt1778];
			uvCoordVertexC = new byte[anInt1778];
		}
		int[] is = new int[anInt1791];
		int[] is_182_ = new int[((Class159) this).anInt1818];
		int[] is_183_ = new int[anInt1791];
		int[] is_184_ = new int[anInt1791];
		int[] is_185_ = new int[3];
		anInt1791 = 0;
		anInt1778 = 0;
		((Class159) this).anInt1803 = 0;
		((Class159) this).anInt1818 = 0;
		i_172_ = 0;
		i_173_ = 0;
		i_174_ = 0;
		for (int i_186_ = 0; i_186_ < i; i_186_++) {
			short i_187_ = (short) (1 << i_186_);
			Class159 class159_188_ = class159s[i_186_];
			int i_189_ = anInt1778;
			if (class159_188_ != null) {
				boolean[] bools = new boolean[class159_188_.anInt1791];
				if (class159_188_.aClass107Array1783 != null) {
					for (int i_190_ = 0; i_190_ < class159_188_.aClass107Array1783.length; i_190_++) {
						Class107 class107 = class159_188_.aClass107Array1783[i_190_];
						aClass107Array1783[i_174_++] = class107.method2057((class107.anInt1423 * 49736077) + anInt1778, (byte) -43);
					}
				}
				for (int i_191_ = 0; i_191_ < class159_188_.anInt1778; i_191_++) {
					is_185_[0] = class159_188_.aShortArray1786[i_191_];
					is_185_[1] = class159_188_.aShortArray1787[i_191_];
					is_185_[2] = class159_188_.aShortArray1789[i_191_];
					for (int i_192_ = 0; i_192_ < 3; i_192_++) {
						int i_193_ = is_185_[i_192_];
						int i_194_ = class159_188_.anIntArray1782[i_193_];
						int i_195_ = class159_188_.anIntArray1777[i_193_];
						int i_196_ = class159_188_.anIntArray1797[i_193_];
						int i_197_;
						for (i_197_ = 0; i_197_ < anInt1791; i_197_++) {
							if (i_194_ == anIntArray1782[i_197_] && i_195_ == anIntArray1777[i_197_] && i_196_ == anIntArray1797[i_197_]) {
								aShortArray1781[i_197_] |= i_187_;
								is_183_[i_193_] = i_197_;
								break;
							}
						}
						if (((Class159) class159_188_).anInt1818 > 0 && !bools[i_193_]) {
							int i_198_ = ((i_193_ < class159_188_.anInt1791 - 1 ? class159_188_.anIntArray1774[i_193_ + 1] : ((Class159) class159_188_).anInt1818) - class159_188_.anIntArray1774[i_193_]);
							for (int i_199_ = 0; i_199_ < i_198_; i_199_++) {
								aFloatArray1771[((Class159) this).anInt1818] = (class159_188_.aFloatArray1771[(class159_188_.anIntArray1774[i_193_] + i_199_)]);
								aFloatArray1784[((Class159) this).anInt1818] = (class159_188_.aFloatArray1784[(class159_188_.anIntArray1774[i_193_] + i_199_)]);
								is_182_[((Class159) this).anInt1818] = i_197_ << 16 | is[i_197_] + i_199_;
								((Class159) this).anInt1818++;
							}
							is_184_[i_193_] = is[i_197_];
							is[i_197_] += i_198_;
							bools[i_193_] = true;
						}
						if (i_197_ >= anInt1791) {
							anIntArray1782[anInt1791] = i_194_;
							anIntArray1777[anInt1791] = i_195_;
							anIntArray1797[anInt1791] = i_196_;
							aShortArray1781[anInt1791] = i_187_;
							anIntArray1813[anInt1791] = (class159_188_.anIntArray1813 != null ? class159_188_.anIntArray1813[i_193_] : -1);
							is_183_[i_193_] = anInt1791;
							anInt1791++;
						}
					}
				}
				for (int i_200_ = 0; i_200_ < class159_188_.anInt1778; i_200_++) {
					if (bool && class159_188_.aByteArray1792 != null)
						aByteArray1792[anInt1778] = class159_188_.aByteArray1792[i_200_];
					if (bool_175_) {
						if (class159_188_.aByteArray1799 != null)
							aByteArray1799[anInt1778] = class159_188_.aByteArray1799[i_200_];
						else
							aByteArray1799[anInt1778] = ((Class159) class159_188_).aByte1779;
					}
					if (bool_176_ && class159_188_.faceAlpha != null)
						faceAlpha[anInt1778] = class159_188_.faceAlpha[i_200_];
					if (bool_178_) {
						if (class159_188_.faceTextures != null)
							faceTextures[anInt1778] = class159_188_.faceTextures[i_200_];
						else
							faceTextures[anInt1778] = (short) -1;
					}
					if (bool_179_) {
						if (class159_188_.anIntArray1780 != null)
							anIntArray1780[anInt1778] = class159_188_.anIntArray1780[i_200_];
						else
							anIntArray1780[anInt1778] = -1;
					}
					if (((Class159) class159_188_).anInt1818 > 0) {
						uvCoordVertexA[anInt1778] = (byte) (class159_188_.uvCoordVertexA[i_200_] + is_184_[(class159_188_.aShortArray1786[i_200_])]);
						uvCoordVertexB[anInt1778] = (byte) (class159_188_.uvCoordVertexB[i_200_] + is_184_[(class159_188_.aShortArray1787[i_200_])]);
						uvCoordVertexC[anInt1778] = (byte) (class159_188_.uvCoordVertexC[i_200_] + is_184_[(class159_188_.aShortArray1789[i_200_])]);
					}
					aShortArray1786[anInt1778] = (short) (is_183_[class159_188_.aShortArray1786[i_200_]]);
					aShortArray1787[anInt1778] = (short) (is_183_[class159_188_.aShortArray1787[i_200_]]);
					aShortArray1789[anInt1778] = (short) (is_183_[class159_188_.aShortArray1789[i_200_]]);
					aShortArray1800[anInt1778] = i_187_;
					faceColours[anInt1778] = class159_188_.faceColours[i_200_];
					anInt1778++;
				}
				if (class159_188_.aClass84Array1816 != null) {
					for (int i_201_ = 0; i_201_ < class159_188_.aClass84Array1816.length; i_201_++) {
						int i_202_ = is_183_[(class159_188_.aClass84Array1816[i_201_].anInt1085) * 1899228195];
						int i_203_ = is_183_[(class159_188_.aClass84Array1816[i_201_].anInt1083) * 2051859203];
						int i_204_ = is_183_[(class159_188_.aClass84Array1816[i_201_].anInt1095) * -791263011];
						aClass84Array1816[i_172_] = (class159_188_.aClass84Array1816[i_201_].method1267((class159_188_.aClass84Array1816[i_201_].anInt1084) * 1190917997 + i_189_, i_202_, i_203_, i_204_, (byte) 0));
						i_172_++;
					}
				}
				if (class159_188_.aClass175Array1817 != null) {
					for (int i_205_ = 0; i_205_ < class159_188_.aClass175Array1817.length; i_205_++) {
						int i_206_ = is_183_[(class159_188_.aClass175Array1817[i_205_].anInt2092) * -219631249];
						aClass175Array1817[i_173_] = class159_188_.aClass175Array1817[i_205_].method2751(i_206_, (short) -9821);
						i_173_++;
					}
				}
			}
		}
		anInt1775 = anInt1791;
		if (((Class159) this).anInt1818 > 0) {
			Class12.method566(is_182_, aFloatArray1771, aFloatArray1784, -1008021147);
			int i_207_ = 0;
			int i_208_ = 0;
			for (/**/; i_207_ < anInt1791; i_207_++) {
				anIntArray1774[i_207_] = i_208_;
				i_208_ += is[i_207_];
			}
		}
		int i_209_ = 0;
		int i_210_ = 0;
		for (/**/; i_209_ < i; i_209_++) {
			short i_211_ = (short) (1 << i_209_);
			Class159 class159_212_ = class159s[i_209_];
			if (class159_212_ != null) {
				if (bool_177_) {
					int i_213_ = 0;
					while (i_213_ < class159_212_.anInt1778) {
						faceTextureIndexes[i_210_] = (class159_212_.faceTextureIndexes != null ? class159_212_.faceTextureIndexes[i_213_] : (short) -1);
						if (faceTextureIndexes[i_210_] > -1 && faceTextureIndexes[i_210_] < 32766)
							faceTextureIndexes[i_210_] = (short) (faceTextureIndexes[i_210_] + ((Class159) this).anInt1803);
						i_213_++;
						i_210_++;
					}
				}
				for (int i_214_ = 0; i_214_ < ((Class159) class159_212_).anInt1803; i_214_++) {
					byte i_215_ = (aByteArray1804[((Class159) this).anInt1803] = class159_212_.aByteArray1804[i_214_]);
					if (i_215_ == 0) {
						aShortArray1805[((Class159) this).anInt1803] = (short) method2566(class159_212_, (class159_212_.aShortArray1805[i_214_]), i_211_);
						aShortArray1806[((Class159) this).anInt1803] = (short) method2566(class159_212_, (class159_212_.aShortArray1806[i_214_]), i_211_);
						aShortArray1807[((Class159) this).anInt1803] = (short) method2566(class159_212_, (class159_212_.aShortArray1807[i_214_]), i_211_);
					} else if (i_215_ >= 1 && i_215_ <= 3) {
						aShortArray1805[((Class159) this).anInt1803] = class159_212_.aShortArray1805[i_214_];
						aShortArray1806[((Class159) this).anInt1803] = class159_212_.aShortArray1806[i_214_];
						aShortArray1807[((Class159) this).anInt1803] = class159_212_.aShortArray1807[i_214_];
						anIntArray1788[((Class159) this).anInt1803] = class159_212_.anIntArray1788[i_214_];
						anIntArray1770[((Class159) this).anInt1803] = class159_212_.anIntArray1770[i_214_];
						anIntArray1810[((Class159) this).anInt1803] = class159_212_.anIntArray1810[i_214_];
						((Class159) this).aByteArray1814[(((Class159) this).anInt1803)] = (((Class159) class159_212_).aByteArray1814[i_214_]);
						aByteArray1815[((Class159) this).anInt1803] = class159_212_.aByteArray1815[i_214_];
						anIntArray1793[((Class159) this).anInt1803] = class159_212_.anIntArray1793[i_214_];
					} else if (i_215_ == 2) {
						anIntArray1812[((Class159) this).anInt1803] = class159_212_.anIntArray1812[i_214_];
						anIntArray1808[((Class159) this).anInt1803] = class159_212_.anIntArray1808[i_214_];
					}
					((Class159) this).anInt1803++;
				}
			}
		}
	}

	public byte method2568(short i, short i_216_, short i_217_) {
		if (((Class159) this).anInt1803 >= 255)
			throw new IllegalStateException();
		aByteArray1804[((Class159) this).anInt1803] = (byte) 0;
		aShortArray1805[((Class159) this).anInt1803] = i;
		aShortArray1806[((Class159) this).anInt1803] = i_216_;
		aShortArray1807[((Class159) this).anInt1803] = i_217_;
		return (byte) ((Class159) this).anInt1803++;
	}

	public static Class159 method2569(Class248 class248, int i, int i_218_) {
		byte[] is = class248.getFile(i, i_218_, 1825775062);
		if (is == null)
			return null;
		return new Class159(is);
	}

	public void method2570(int i) {
		for (int i_219_ = 0; i_219_ < anInt1791; i_219_++) {
			anIntArray1782[i_219_] <<= i;
			anIntArray1777[i_219_] <<= i;
			anIntArray1797[i_219_] <<= i;
		}
		if (((Class159) this).anInt1803 > 0 && anIntArray1788 != null) {
			for (int i_220_ = 0; i_220_ < anIntArray1788.length; i_220_++) {
				anIntArray1788[i_220_] <<= i;
				anIntArray1770[i_220_] <<= i;
				if (aByteArray1804[i_220_] != 1)
					anIntArray1810[i_220_] <<= i;
			}
		}
	}
}
