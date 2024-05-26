package game;

/* Class89_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

import sun.misc.Unsafe;

public class AbstractModel extends Model {
	int anInt10790;
	static final int anInt10791 = 7;
	int[][] anIntArrayArray10792;
	short[] aShortArray10793;
	int anInt10794;
	short aShort10795;
	short aShort10796;
	int anInt10797 = 0;
	int[] anIntArray10798;
	int[] vertexX;
	int[] vertexY;
	int anInt10801;
	int anInt10802;
	boolean aBool10803;
	int uniqueVertices;
	short[] aShortArray10805;
	short[] aShortArray10806;
	short[] aShortArray10807;
	int maxVertexUsed = 0;
	short[] aShortArray10809;
	short[] aShortArray10810;
	float[] aFloatArray10811;
	float[] aFloatArray10812;
	Class356 aClass356_10813;
	int anInt10814;
	int anInt10815;
	int anInt10816;
	byte[] alpha;
	short[] aShortArray10818;
	short[] aShortArray10819;
	int[][] anIntArrayArray10820;
	short[] aShortArray10821;
	static Class350 aClass350_10822;
	Class377 aClass377_10823;
	Class357 aClass357_10824;
	Class106_Sub3 aClass106_Sub3_10825;
	Class356 aClass356_10826;
	Class356 aClass356_10827;
	Class356 aClass356_10828;
	int anInt10829;
	boolean aBool10830;
	short[] aShortArray10831;
	boolean aBool10832;
	int anInt10833;
	int anInt10834;
	boolean aBool10835;
	int anInt10836;
	int anInt10837;
	byte[] aByteArray10838;
	short[] aShortArray10839;
	int anInt10840;
	Class84[] aClass84Array10841;
	boolean aBool10842;
	int anInt10843;
	int[] anIntArray10844;
	int[] anIntArray10845;
	int[] anIntArray10846;
	int[] sharedFaces;
	boolean aBool10848;
	static final int anInt10849 = 4;
	Class175[] aClass175Array10850;
	int anInt10851;
	Class365[] aClass365Array10852;
	short[] aShortArray10853;
	int[][] anIntArrayArray10854;
	long[] aLongArray10855;
	float[] aFloatArray10856;
	int[] shadowX;
	int[] shadowY;
	int[] anIntArray10859;
	int[] anIntArray10860;
	short[] aShortArray10861;
	int anInt10862;
	int anInt10863;
	Class355[] aClass355Array10864;
	boolean aBool10865;
	int[] vertexZ;

	public void method1345(Class261 class261, int i, boolean bool) {
		if (((AbstractModel) this).aShortArray10810 != null) {
			Class261 class261_0_ = class261;
			if (bool) {
				class261_0_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass261_10443);
				class261_0_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_1_ = 0; i_1_ < ((AbstractModel) this).maxVertexUsed; i_1_++) {
				if ((i & ((AbstractModel) this).aShortArray10810[i_1_]) != 0) {
					class261_0_.method3582((float) ((AbstractModel) this).vertexX[i_1_], (float) ((AbstractModel) this).vertexY[i_1_], (float) ((AbstractModel) this).vertexZ[i_1_], fs);
					((AbstractModel) this).vertexX[i_1_] = (int) fs[0];
					((AbstractModel) this).vertexY[i_1_] = (int) fs[1];
					((AbstractModel) this).vertexZ[i_1_] = (int) fs[2];
				}
			}
		}
	}

	AbstractModel(Class106_Sub3 class106_sub3, Class159 class159, int i, int i_2_, int i_3_, int i_4_) {
		this(class106_sub3, i, i_4_, true, false);
		MapSize mapSize = class106_sub3.aClass94_1396;
		Interface35 interface35 = class106_sub3.anInterface35_1397;
		int[] is = new int[class159.anInt1778];
		((AbstractModel) this).sharedFaces = new int[class159.anInt1775 + 1];
		for (int i_5_ = 0; i_5_ < class159.anInt1778; i_5_++) {
			if (class159.aByteArray1792 == null || class159.aByteArray1792[i_5_] != 2) {
				if (class159.faceTextures != null && class159.faceTextures[i_5_] != -1) {
					MaterialInformation class101 = mapSize.getTexture((class159.faceTextures[i_5_] & 0xffff), -263309505);
					if (((((AbstractModel) this).anInt10836 & 0x40) == 0 || !class101.aBool1350) && class101.aBool1363)
						continue;
				}
				is[((AbstractModel) this).anInt10833++] = i_5_;
				((AbstractModel) this).sharedFaces[(class159.aShortArray1786[i_5_])]++;
				((AbstractModel) this).sharedFaces[(class159.aShortArray1787[i_5_])]++;
				((AbstractModel) this).sharedFaces[(class159.aShortArray1789[i_5_])]++;
			}
		}
		((AbstractModel) this).anInt10815 = ((AbstractModel) this).anInt10833;
		long[] ls = new long[((AbstractModel) this).anInt10833];
		boolean bool = (((AbstractModel) this).anInt10829 & 0x100) != 0;
		for (int i_6_ = 0; i_6_ < ((AbstractModel) this).anInt10833; i_6_++) {
			int i_7_ = is[i_6_];
			MaterialInformation class101 = null;
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			if (class159.aClass107Array1783 != null) {
				boolean bool_12_ = false;
				for (int i_13_ = 0; i_13_ < class159.aClass107Array1783.length; i_13_++) {
					Class107 class107 = class159.aClass107Array1783[i_13_];
					if (i_7_ == class107.anInt1423 * 49736077) {
						Class314 class314 = interface35.method208((class107.anInt1422 * 1294185611), (byte) -58);
						if (class314.aBool3813)
							bool_12_ = true;
						if (class314.anInt3806 * 1060190383 != -1) {
							MaterialInformation class101_14_ = mapSize.getTexture((class314.anInt3806 * 1060190383), 1069443376);
							if (class101_14_.aClass511_1342 == Class511.aClass511_5697)
								((AbstractModel) this).aBool10803 = true;
						}
					}
				}
				if (bool_12_) {
					ls[i_6_] = 9223372036854775807L;
					((AbstractModel) this).anInt10815--;
					continue;
				}
			}
			if (class159.aClass84Array1816 != null) {
				boolean bool_15_ = false;
				for (int i_16_ = 0; i_16_ < class159.aClass84Array1816.length; i_16_++) {
					Class84 class84 = class159.aClass84Array1816[i_16_];
					if (i_7_ == class84.anInt1084 * 1190917997) {
						Class308 class308 = (((AbstractModel) this).aClass106_Sub3_10825.anInterface36_1398.method211(class84.anInt1091 * -811893277, (byte) -39));
						if (class308.aBool3604)
							bool_15_ = true;
					}
				}
				if (bool_15_) {
					ls[i_6_] = 9223372036854775807L;
					((AbstractModel) this).anInt10815--;
					continue;
				}
			}
			int i_17_ = -1;
			if (class159.faceTextures != null) {
				i_17_ = class159.faceTextures[i_7_];
				if (i_17_ != -1) {
					class101 = mapSize.getTexture(i_17_ & 0xffff, 997011285);
					if ((((AbstractModel) this).anInt10836 & 0x40) == 0 || !class101.aBool1350) {
						i_10_ = class101.effectId;
						i_11_ = class101.effectParam1;
					} else {
						i_17_ = -1;
						class101 = null;
					}
				}
			}
			boolean bool_18_ = ((class159.faceAlpha != null && class159.faceAlpha[i_7_] != 0) || (class101 != null && class101.aClass511_1342 != Class511.aClass511_5695));
			if ((bool || bool_18_) && class159.aByteArray1799 != null)
				i_8_ += class159.aByteArray1799[i_7_] << 17;
			if (bool_18_)
				i_8_ += 65536;
			i_8_ += (i_10_ & 0xff) << 8;
			i_8_ += i_11_ & 0xff;
			i_9_ += (i_17_ & 0xffff) << 16;
			i_9_ += i_6_ & 0xffff;
			ls[i_6_] = ((long) i_8_ << 32) + (long) i_9_;
			((AbstractModel) this).aBool10803 |= bool_18_;
			AbstractModel class89_sub3_19_ = this;
			((AbstractModel) class89_sub3_19_).aBool10832 = (((AbstractModel) class89_sub3_19_).aBool10832 | (class101 != null && (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)));
		}
		Class435.method5258(ls, is, (byte) 116);
		((AbstractModel) this).anInt10797 = class159.anInt1791;
		((AbstractModel) this).maxVertexUsed = class159.anInt1775;
		((AbstractModel) this).vertexX = class159.anIntArray1782;
		((AbstractModel) this).vertexY = class159.anIntArray1777;
		((AbstractModel) this).vertexZ = class159.anIntArray1797;
		((AbstractModel) this).aShortArray10810 = class159.aShortArray1781;
		Class372[] class372s = new Class372[((AbstractModel) this).maxVertexUsed];
		((AbstractModel) this).aClass84Array10841 = class159.aClass84Array1816;
		((AbstractModel) this).aClass175Array10850 = class159.aClass175Array1817;
		//if (maxVertexUsed == 930)
		//	System.out.println("Some int value: " + anInt10833);
		if (class159.aClass107Array1783 != null) {
			((AbstractModel) this).anInt10851 = class159.aClass107Array1783.length;
			((AbstractModel) this).aClass365Array10852 = new Class365[((AbstractModel) this).anInt10851];
			((AbstractModel) this).aClass355Array10864 = new Class355[((AbstractModel) this).anInt10851];
			for (int i_20_ = 0; i_20_ < ((AbstractModel) this).anInt10851; i_20_++) {
				Class107 class107 = class159.aClass107Array1783[i_20_];
				Class314 class314 = interface35.method208(class107.anInt1422 * 1294185611, (byte) -23);
				int i_21_ = -1;
				for (int i_22_ = 0; i_22_ < ((AbstractModel) this).anInt10833; i_22_++) {
					if (is[i_22_] == class107.anInt1423 * 49736077) {
						i_21_ = i_22_;
						break;
					}
				}
				if (i_21_ == -1)
					throw new RuntimeException();
				int i_23_ = ((Class460.anIntArray5213[(class159.faceColours[class107.anInt1423 * 49736077]) & 0xffff]) & 0xffffff);
				i_23_ = i_23_ | 255 - (class159.faceAlpha != null ? (class159.faceAlpha[class107.anInt1423 * 49736077]) : 0) << 24;
				((AbstractModel) this).aClass365Array10852[i_20_] = new Class365(i_21_, (class159.aShortArray1786[class107.anInt1423 * 49736077]), (class159.aShortArray1787[class107.anInt1423 * 49736077]), (class159.aShortArray1789[class107.anInt1423 * 49736077]), class314.anInt3808 * -735149301, class314.anInt3809 * -1899796151, class314.anInt3806 * 1060190383, class314.anInt3807 * -1191268737, class314.anInt3810 * 1499091165, class314.aBool3813, class314.aBool3812, class107.anInt1424 * 736551085);
				((AbstractModel) this).aClass355Array10864[i_20_] = new Class355(i_23_);
			}
		}
		int i_24_ = ((AbstractModel) this).anInt10833 * 3;
		((AbstractModel) this).aShortArray10831 = new short[i_24_];
		((AbstractModel) this).aShortArray10806 = new short[i_24_];
		((AbstractModel) this).aShortArray10807 = new short[i_24_];
		((AbstractModel) this).aShortArray10805 = new short[i_24_];
		((AbstractModel) this).aShortArray10809 = new short[i_24_];
		((AbstractModel) this).aByteArray10838 = new byte[i_24_];
		((AbstractModel) this).aFloatArray10811 = new float[i_24_];
		((AbstractModel) this).aFloatArray10812 = new float[i_24_];
		((AbstractModel) this).aShortArray10793 = new short[((AbstractModel) this).anInt10833];
		((AbstractModel) this).alpha = new byte[((AbstractModel) this).anInt10833];
		((AbstractModel) this).aShortArray10818 = new short[((AbstractModel) this).anInt10833];
		((AbstractModel) this).aShortArray10819 = new short[((AbstractModel) this).anInt10833];
		((AbstractModel) this).aShortArray10861 = new short[((AbstractModel) this).anInt10833];
		((AbstractModel) this).aShortArray10821 = new short[((AbstractModel) this).anInt10833];
		if (class159.aShortArray1800 != null)
			((AbstractModel) this).aShortArray10839 = new short[((AbstractModel) this).anInt10833];
		((AbstractModel) this).aShort10795 = (short) i_2_;
		((AbstractModel) this).aShort10796 = (short) i_3_;
		((AbstractModel) this).aShortArray10853 = new short[i_24_];
		((AbstractModel) this).aLongArray10855 = new long[i_24_];
		int i_25_ = 0;
		for (int i_26_ = 0; i_26_ < class159.anInt1775; i_26_++) {
			int i_27_ = ((AbstractModel) this).sharedFaces[i_26_];
			((AbstractModel) this).sharedFaces[i_26_] = i_25_;
			i_25_ += i_27_;
			class372s[i_26_] = new Class372();
		}
		((AbstractModel) this).sharedFaces[class159.anInt1775] = i_25_;
		Class95 class95 = method1403(class159, is, ((AbstractModel) this).anInt10833);
		Class358[] class358s = new Class358[class159.anInt1778];
		for (int i_28_ = 0; i_28_ < class159.anInt1778; i_28_++) {
			short i_29_ = class159.aShortArray1786[i_28_];
			short i_30_ = class159.aShortArray1787[i_28_];
			short i_31_ = class159.aShortArray1789[i_28_];
			int i_32_ = (((AbstractModel) this).vertexX[i_30_] - ((AbstractModel) this).vertexX[i_29_]);
			int i_33_ = (((AbstractModel) this).vertexY[i_30_] - ((AbstractModel) this).vertexY[i_29_]);
			int i_34_ = (((AbstractModel) this).vertexZ[i_30_] - ((AbstractModel) this).vertexZ[i_29_]);
			int i_35_ = (((AbstractModel) this).vertexX[i_31_] - ((AbstractModel) this).vertexX[i_29_]);
			int i_36_ = (((AbstractModel) this).vertexY[i_31_] - ((AbstractModel) this).vertexY[i_29_]);
			int i_37_ = (((AbstractModel) this).vertexZ[i_31_] - ((AbstractModel) this).vertexZ[i_29_]);
			int i_38_ = i_33_ * i_37_ - i_36_ * i_34_;
			int i_39_ = i_34_ * i_35_ - i_37_ * i_32_;
			int i_40_;
			for (i_40_ = i_32_ * i_36_ - i_35_ * i_33_; (i_38_ > 8192 || i_39_ > 8192 || i_40_ > 8192 || i_38_ < -8192 || i_39_ < -8192 || i_40_ < -8192); i_40_ >>= 1) {
				i_38_ >>= 1;
				i_39_ >>= 1;
			}
			int i_41_ = (int) Math.sqrt((double) (i_38_ * i_38_ + i_39_ * i_39_ + i_40_ * i_40_));
			if (i_41_ <= 0)
				i_41_ = 1;
			i_38_ = i_38_ * 256 / i_41_;
			i_39_ = i_39_ * 256 / i_41_;
			i_40_ = i_40_ * 256 / i_41_;
			byte i_42_ = (class159.aByteArray1792 == null ? (byte) 0 : class159.aByteArray1792[i_28_]);
			if (i_42_ == 0) {
				Class372 class372 = class372s[i_29_];
				((Class372) class372).anInt4537 += i_38_;
				((Class372) class372).anInt4538 += i_39_;
				((Class372) class372).anInt4539 += i_40_;
				((Class372) class372).anInt4540++;
				class372 = class372s[i_30_];
				((Class372) class372).anInt4537 += i_38_;
				((Class372) class372).anInt4538 += i_39_;
				((Class372) class372).anInt4539 += i_40_;
				((Class372) class372).anInt4540++;
				class372 = class372s[i_31_];
				((Class372) class372).anInt4537 += i_38_;
				((Class372) class372).anInt4538 += i_39_;
				((Class372) class372).anInt4539 += i_40_;
				((Class372) class372).anInt4540++;
			} else if (i_42_ == 1) {
				Class358 class358 = class358s[i_28_] = new Class358();
				((Class358) class358).anInt4421 = i_38_;
				((Class358) class358).anInt4420 = i_39_;
				((Class358) class358).anInt4419 = i_40_;
			}
		}
		for (int i_43_ = 0; i_43_ < ((AbstractModel) this).anInt10833; i_43_++) {
			int i_44_ = is[i_43_];
			int i_45_ = class159.faceColours[i_44_] & 0xffff;
			int i_46_ = (class159.faceAlpha != null ? class159.faceAlpha[i_44_] & 0xff : 0);
			short i_47_ = (class159.faceTextures == null ? (short) -1 : class159.faceTextures[i_44_]);
			if (i_47_ != -1 && (((AbstractModel) this).anInt10836 & 0x40) != 0 && mapSize.getTexture(i_47_, 606055055).aBool1350)
				i_47_ = (short) -1;
			float f = 0.0F;
			float f_48_ = 0.0F;
			float f_49_ = 0.0F;
			float f_50_ = 0.0F;
			float f_51_ = 0.0F;
			float f_52_ = 0.0F;
			long l;
			long l_53_;
			long l_54_;
			if (i_47_ != -1) {
				int i_55_ = (class159.faceTextureIndexes != null ? class159.faceTextureIndexes[i_44_] : -1);
				if (i_55_ == 32766) {
					int i_56_ = class159.uvCoordVertexA[i_44_] & 0xff;
					int i_57_ = class159.uvCoordVertexB[i_44_] & 0xff;
					int i_58_ = class159.uvCoordVertexC[i_44_] & 0xff;
					i_56_ += (class159.anIntArray1774[class159.aShortArray1786[i_44_]]);
					l_54_ = (long) i_56_;
					i_57_ += (class159.anIntArray1774[class159.aShortArray1787[i_44_]]);
					l_53_ = (long) i_56_;
					i_58_ += (class159.anIntArray1774[class159.aShortArray1789[i_44_]]);
					l = (long) i_56_;
					f = class159.aFloatArray1771[i_56_];
					f_48_ = class159.aFloatArray1784[i_56_];
					f_49_ = class159.aFloatArray1771[i_57_];
					f_50_ = class159.aFloatArray1784[i_57_];
					f_51_ = class159.aFloatArray1771[i_58_];
					f_52_ = class159.aFloatArray1784[i_58_];
				} else if (i_55_ == -1) {
					f = 0.0F;
					f_48_ = 1.0F;
					l_54_ = 65535L;
					f_49_ = 1.0F;
					f_50_ = 1.0F;
					l_53_ = 131071L;
					f_51_ = 0.0F;
					f_52_ = 0.0F;
					l = 196607L;
				} else {
					i_55_ &= 0xffff;
					int i_59_ = 0;
					int i_60_ = 0;
					int i_61_ = 0;
					byte i_62_ = class159.aByteArray1804[i_55_];
					if (i_62_ == 0) {
						short i_63_ = class159.aShortArray1786[i_44_];
						short i_64_ = class159.aShortArray1787[i_44_];
						short i_65_ = class159.aShortArray1789[i_44_];
						short i_66_ = class159.aShortArray1805[i_55_];
						short i_67_ = class159.aShortArray1806[i_55_];
						short i_68_ = class159.aShortArray1807[i_55_];
						float f_69_ = (float) class159.anIntArray1782[i_66_];
						float f_70_ = (float) class159.anIntArray1777[i_66_];
						float f_71_ = (float) class159.anIntArray1797[i_66_];
						float f_72_ = (float) class159.anIntArray1782[i_67_] - f_69_;
						float f_73_ = (float) class159.anIntArray1777[i_67_] - f_70_;
						float f_74_ = (float) class159.anIntArray1797[i_67_] - f_71_;
						float f_75_ = (float) class159.anIntArray1782[i_68_] - f_69_;
						float f_76_ = (float) class159.anIntArray1777[i_68_] - f_70_;
						float f_77_ = (float) class159.anIntArray1797[i_68_] - f_71_;
						float f_78_ = (float) class159.anIntArray1782[i_63_] - f_69_;
						float f_79_ = (float) class159.anIntArray1777[i_63_] - f_70_;
						float f_80_ = (float) class159.anIntArray1797[i_63_] - f_71_;
						float f_81_ = (float) class159.anIntArray1782[i_64_] - f_69_;
						float f_82_ = (float) class159.anIntArray1777[i_64_] - f_70_;
						float f_83_ = (float) class159.anIntArray1797[i_64_] - f_71_;
						float f_84_ = (float) class159.anIntArray1782[i_65_] - f_69_;
						float f_85_ = (float) class159.anIntArray1777[i_65_] - f_70_;
						float f_86_ = (float) class159.anIntArray1797[i_65_] - f_71_;
						float f_87_ = f_73_ * f_77_ - f_74_ * f_76_;
						float f_88_ = f_74_ * f_75_ - f_72_ * f_77_;
						float f_89_ = f_72_ * f_76_ - f_73_ * f_75_;
						float f_90_ = f_76_ * f_89_ - f_77_ * f_88_;
						float f_91_ = f_77_ * f_87_ - f_75_ * f_89_;
						float f_92_ = f_75_ * f_88_ - f_76_ * f_87_;
						float f_93_ = 1.0F / (f_90_ * f_72_ + f_91_ * f_73_ + f_92_ * f_74_);
						f = ((f_90_ * f_78_ + f_91_ * f_79_ + f_92_ * f_80_) * f_93_);
						f_49_ = (f_90_ * f_81_ + f_91_ * f_82_ + f_92_ * f_83_) * f_93_;
						f_51_ = (f_90_ * f_84_ + f_91_ * f_85_ + f_92_ * f_86_) * f_93_;
						f_90_ = f_73_ * f_89_ - f_74_ * f_88_;
						f_91_ = f_74_ * f_87_ - f_72_ * f_89_;
						f_92_ = f_72_ * f_88_ - f_73_ * f_87_;
						f_93_ = 1.0F / (f_90_ * f_75_ + f_91_ * f_76_ + f_92_ * f_77_);
						f_48_ = (f_90_ * f_78_ + f_91_ * f_79_ + f_92_ * f_80_) * f_93_;
						f_50_ = (f_90_ * f_81_ + f_91_ * f_82_ + f_92_ * f_83_) * f_93_;
						f_52_ = (f_90_ * f_84_ + f_91_ * f_85_ + f_92_ * f_86_) * f_93_;
					} else {
						short i_94_ = class159.aShortArray1786[i_44_];
						short i_95_ = class159.aShortArray1787[i_44_];
						short i_96_ = class159.aShortArray1789[i_44_];
						int i_97_ = class95.anIntArray1253[i_55_];
						int i_98_ = class95.anIntArray1251[i_55_];
						int i_99_ = class95.anIntArray1252[i_55_];
						float[] fs = class95.aFloatArrayArray1250[i_55_];
						byte i_100_ = class159.aByteArray1815[i_55_];
						float f_101_ = (float) class159.anIntArray1793[i_55_] / 256.0F;
						if (i_62_ == 1) {
							float f_102_ = ((float) class159.anIntArray1810[i_55_] / 1024.0F);
							method1346(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_97_, i_98_, i_99_, fs, f_102_, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f = ((AbstractModel) this).aFloatArray10856[0];
							f_48_ = ((AbstractModel) this).aFloatArray10856[1];
							method1346(class159.anIntArray1782[i_95_], class159.anIntArray1777[i_95_], class159.anIntArray1797[i_95_], i_97_, i_98_, i_99_, fs, f_102_, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f_49_ = ((AbstractModel) this).aFloatArray10856[0];
							f_50_ = ((AbstractModel) this).aFloatArray10856[1];
							method1346(class159.anIntArray1782[i_96_], class159.anIntArray1777[i_96_], class159.anIntArray1797[i_96_], i_97_, i_98_, i_99_, fs, f_102_, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f_51_ = ((AbstractModel) this).aFloatArray10856[0];
							f_52_ = ((AbstractModel) this).aFloatArray10856[1];
							float f_103_ = f_102_ / 2.0F;
							if ((i_100_ & 0x1) == 0) {
								if (f_49_ - f > f_103_) {
									f_49_ -= f_102_;
									i_60_ = 1;
								} else if (f - f_49_ > f_103_) {
									f_49_ += f_102_;
									i_60_ = 2;
								}
								if (f_51_ - f > f_103_) {
									f_51_ -= f_102_;
									i_61_ = 1;
								} else if (f - f_51_ > f_103_) {
									f_51_ += f_102_;
									i_61_ = 2;
								}
							} else {
								if (f_50_ - f_48_ > f_103_) {
									f_50_ -= f_102_;
									i_60_ = 1;
								} else if (f_48_ - f_50_ > f_103_) {
									f_50_ += f_102_;
									i_60_ = 2;
								}
								if (f_52_ - f_48_ > f_103_) {
									f_52_ -= f_102_;
									i_61_ = 1;
								} else if (f_48_ - f_52_ > f_103_) {
									f_52_ += f_102_;
									i_61_ = 2;
								}
							}
						} else if (i_62_ == 2) {
							float f_104_ = ((float) class159.anIntArray1812[i_55_] / 256.0F);
							float f_105_ = ((float) class159.anIntArray1808[i_55_] / 256.0F);
							int i_106_ = (class159.anIntArray1782[i_95_] - class159.anIntArray1782[i_94_]);
							int i_107_ = (class159.anIntArray1777[i_95_] - class159.anIntArray1777[i_94_]);
							int i_108_ = (class159.anIntArray1797[i_95_] - class159.anIntArray1797[i_94_]);
							int i_109_ = (class159.anIntArray1782[i_96_] - class159.anIntArray1782[i_94_]);
							int i_110_ = (class159.anIntArray1777[i_96_] - class159.anIntArray1777[i_94_]);
							int i_111_ = (class159.anIntArray1797[i_96_] - class159.anIntArray1797[i_94_]);
							int i_112_ = i_107_ * i_111_ - i_110_ * i_108_;
							int i_113_ = i_108_ * i_109_ - i_111_ * i_106_;
							int i_114_ = i_106_ * i_110_ - i_109_ * i_107_;
							float f_115_ = (64.0F / (float) class159.anIntArray1788[i_55_]);
							float f_116_ = (64.0F / (float) class159.anIntArray1770[i_55_]);
							float f_117_ = (64.0F / (float) class159.anIntArray1810[i_55_]);
							float f_118_ = (((float) i_112_ * fs[0] + (float) i_113_ * fs[1] + (float) i_114_ * fs[2]) / f_115_);
							float f_119_ = (((float) i_112_ * fs[3] + (float) i_113_ * fs[4] + (float) i_114_ * fs[5]) / f_116_);
							float f_120_ = (((float) i_112_ * fs[6] + (float) i_113_ * fs[7] + (float) i_114_ * fs[8]) / f_117_);
							i_59_ = method1347(f_118_, f_119_, f_120_);
							method1361(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_97_, i_98_, i_99_, i_59_, fs, i_100_, f_101_, f_104_, f_105_, ((AbstractModel) this).aFloatArray10856);
							f = ((AbstractModel) this).aFloatArray10856[0];
							f_48_ = ((AbstractModel) this).aFloatArray10856[1];
							method1361(class159.anIntArray1782[i_95_], class159.anIntArray1777[i_95_], class159.anIntArray1797[i_95_], i_97_, i_98_, i_99_, i_59_, fs, i_100_, f_101_, f_104_, f_105_, ((AbstractModel) this).aFloatArray10856);
							f_49_ = ((AbstractModel) this).aFloatArray10856[0];
							f_50_ = ((AbstractModel) this).aFloatArray10856[1];
							method1361(class159.anIntArray1782[i_96_], class159.anIntArray1777[i_96_], class159.anIntArray1797[i_96_], i_97_, i_98_, i_99_, i_59_, fs, i_100_, f_101_, f_104_, f_105_, ((AbstractModel) this).aFloatArray10856);
							f_51_ = ((AbstractModel) this).aFloatArray10856[0];
							f_52_ = ((AbstractModel) this).aFloatArray10856[1];
						} else if (i_62_ == 3) {
							method1479(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_97_, i_98_, i_99_, fs, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f = ((AbstractModel) this).aFloatArray10856[0];
							f_48_ = ((AbstractModel) this).aFloatArray10856[1];
							method1479(class159.anIntArray1782[i_95_], class159.anIntArray1777[i_95_], class159.anIntArray1797[i_95_], i_97_, i_98_, i_99_, fs, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f_49_ = ((AbstractModel) this).aFloatArray10856[0];
							f_50_ = ((AbstractModel) this).aFloatArray10856[1];
							method1479(class159.anIntArray1782[i_96_], class159.anIntArray1777[i_96_], class159.anIntArray1797[i_96_], i_97_, i_98_, i_99_, fs, i_100_, f_101_, ((AbstractModel) this).aFloatArray10856);
							f_51_ = ((AbstractModel) this).aFloatArray10856[0];
							f_52_ = ((AbstractModel) this).aFloatArray10856[1];
							if ((i_100_ & 0x1) == 0) {
								if (f_49_ - f > 0.5F) {
									f_49_--;
									i_60_ = 1;
								} else if (f - f_49_ > 0.5F) {
									f_49_++;
									i_60_ = 2;
								}
								if (f_51_ - f > 0.5F) {
									f_51_--;
									i_61_ = 1;
								} else if (f - f_51_ > 0.5F) {
									f_51_++;
									i_61_ = 2;
								}
							} else {
								if (f_50_ - f_48_ > 0.5F) {
									f_50_--;
									i_60_ = 1;
								} else if (f_48_ - f_50_ > 0.5F) {
									f_50_++;
									i_60_ = 2;
								}
								if (f_52_ - f_48_ > 0.5F) {
									f_52_--;
									i_61_ = 1;
								} else if (f_48_ - f_52_ > 0.5F) {
									f_52_++;
									i_61_ = 2;
								}
							}
						}
					}
					l_54_ = (long) (i_59_ << 16 | i_55_);
					l_53_ = (long) (i_60_ << 19) | l_54_;
					l = (long) (i_61_ << 19) | l_54_;
				}
			} else {
				l = 0L;
				l_53_ = 0L;
				l_54_ = 0L;
			}
			byte i_121_ = (class159.aByteArray1792 != null ? class159.aByteArray1792[i_44_] : (byte) 0);
			if (i_121_ == 0) {
				long l_122_ = (long) ((i_45_ << 8) + i_46_);
				short i_123_ = class159.aShortArray1786[i_44_];
				short i_124_ = class159.aShortArray1787[i_44_];
				short i_125_ = class159.aShortArray1789[i_44_];
				Class372 class372 = class372s[i_123_];
				((AbstractModel) this).aShortArray10818[i_43_] = method10008(class159, i_123_, i_43_, l_122_ | l_54_ << 24, ((Class372) class372).anInt4537, ((Class372) class372).anInt4538, ((Class372) class372).anInt4539, ((Class372) class372).anInt4540, f, f_48_);
				class372 = class372s[i_124_];
				((AbstractModel) this).aShortArray10819[i_43_] = method10008(class159, i_124_, i_43_, l_122_ | l_53_ << 24, ((Class372) class372).anInt4537, ((Class372) class372).anInt4538, ((Class372) class372).anInt4539, ((Class372) class372).anInt4540, f_49_, f_50_);
				class372 = class372s[i_125_];
				((AbstractModel) this).aShortArray10861[i_43_] = method10008(class159, i_125_, i_43_, l_122_ | l << 24, ((Class372) class372).anInt4537, ((Class372) class372).anInt4538, ((Class372) class372).anInt4539, ((Class372) class372).anInt4540, f_51_, f_52_);
			} else if (i_121_ == 1) {
				Class358 class358 = class358s[i_44_];
				long l_126_ = (((long) (((Class358) class358).anInt4421 & ~0x7fffffff) << 9) + ((long) (((Class358) class358).anInt4420 + 256) << 32) + ((long) (((Class358) class358).anInt4419 + 256) << 24) + (long) (i_45_ << 8) + (long) i_46_);
				((AbstractModel) this).aShortArray10818[i_43_] = method10008(class159, class159.aShortArray1786[i_44_], i_43_, l_126_ | l_54_ << 41, ((Class358) class358).anInt4421, ((Class358) class358).anInt4420, ((Class358) class358).anInt4419, 0, f, f_48_);
				((AbstractModel) this).aShortArray10819[i_43_] = method10008(class159, class159.aShortArray1787[i_44_], i_43_, l_126_ | l_54_ << 41, ((Class358) class358).anInt4421, ((Class358) class358).anInt4420, ((Class358) class358).anInt4419, 0, f_49_, f_50_);
				((AbstractModel) this).aShortArray10861[i_43_] = method10008(class159, class159.aShortArray1789[i_44_], i_43_, l_126_ | l_54_ << 41, ((Class358) class358).anInt4421, ((Class358) class358).anInt4420, ((Class358) class358).anInt4419, 0, f_51_, f_52_);
			}
			if (class159.faceAlpha != null)
				((AbstractModel) this).alpha[i_43_] = class159.faceAlpha[i_44_];
			if (class159.aShortArray1800 != null)
				((AbstractModel) this).aShortArray10839[i_43_] = class159.aShortArray1800[i_44_];
			((AbstractModel) this).aShortArray10793[i_43_] = class159.faceColours[i_44_];
			((AbstractModel) this).aShortArray10821[i_43_] = i_47_;
		}
		if (((AbstractModel) this).anInt10815 > 0) {
			int i_127_ = 1;
			short i_128_ = ((AbstractModel) this).aShortArray10821[0];
			for (int i_129_ = 0; i_129_ < ((AbstractModel) this).anInt10815; i_129_++) {
				short i_130_ = ((AbstractModel) this).aShortArray10821[i_129_];
				if (i_130_ != i_128_) {
					i_127_++;
					i_128_ = i_130_;
				}
			}
			((AbstractModel) this).anIntArray10845 = new int[i_127_];
			((AbstractModel) this).anIntArray10846 = new int[i_127_];
			((AbstractModel) this).anIntArray10844 = new int[i_127_ + 1];
			((AbstractModel) this).anIntArray10844[0] = 0;
			int i_131_ = ((AbstractModel) this).uniqueVertices;
			int i_132_ = 0;
			i_127_ = 0;
			i_128_ = ((AbstractModel) this).aShortArray10821[0];
			for (int i_133_ = 0; i_133_ < ((AbstractModel) this).anInt10815; i_133_++) {
				short i_134_ = ((AbstractModel) this).aShortArray10821[i_133_];
				if (i_134_ != i_128_) {
					((AbstractModel) this).anIntArray10845[i_127_] = i_131_;
					((AbstractModel) this).anIntArray10846[i_127_] = i_132_ - i_131_ + 1;
					((AbstractModel) this).anIntArray10844[++i_127_] = i_133_;
					i_131_ = ((AbstractModel) this).uniqueVertices;
					i_132_ = 0;
					i_128_ = i_134_;
				}
				int i_135_ = ((AbstractModel) this).aShortArray10818[i_133_] & 0xffff;
				if (i_135_ < i_131_)
					i_131_ = i_135_;
				if (i_135_ > i_132_)
					i_132_ = i_135_;
				i_135_ = ((AbstractModel) this).aShortArray10819[i_133_] & 0xffff;
				if (i_135_ < i_131_)
					i_131_ = i_135_;
				if (i_135_ > i_132_)
					i_132_ = i_135_;
				i_135_ = ((AbstractModel) this).aShortArray10861[i_133_] & 0xffff;
				if (i_135_ < i_131_)
					i_131_ = i_135_;
				if (i_135_ > i_132_)
					i_132_ = i_135_;
			}
			((AbstractModel) this).anIntArray10845[i_127_] = i_131_;
			((AbstractModel) this).anIntArray10846[i_127_] = i_132_ - i_131_ + 1;
			((AbstractModel) this).anIntArray10844[++i_127_] = ((AbstractModel) this).anInt10815;
		}
		((AbstractModel) this).aLongArray10855 = null;
		((AbstractModel) this).aShortArray10831 = method10010(((AbstractModel) this).aShortArray10831, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aShortArray10806 = method10010(((AbstractModel) this).aShortArray10806, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aShortArray10807 = method10010(((AbstractModel) this).aShortArray10807, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aShortArray10805 = method10010(((AbstractModel) this).aShortArray10805, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aShortArray10809 = method10010(((AbstractModel) this).aShortArray10809, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aByteArray10838 = method10009(((AbstractModel) this).aByteArray10838, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aFloatArray10811 = method10011(((AbstractModel) this).aFloatArray10811, ((AbstractModel) this).uniqueVertices);
		((AbstractModel) this).aFloatArray10812 = method10011(((AbstractModel) this).aFloatArray10812, ((AbstractModel) this).uniqueVertices);
		if (class159.anIntArray1813 != null && Class368.method4526(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).anIntArrayArray10792 = class159.method2559(false);
		if (class159.aClass107Array1783 != null && Class368.method4527(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).anIntArrayArray10854 = class159.method2561();
		if (class159.anIntArray1780 != null && Class368.method4529(i, ((AbstractModel) this).anInt10836)) {
			int i_136_ = 0;
			int[] is_137_ = new int[256];
			for (int i_138_ = 0; i_138_ < ((AbstractModel) this).anInt10833; i_138_++) {
				int i_139_ = class159.anIntArray1780[is[i_138_]];
				if (i_139_ >= 0) {
					is_137_[i_139_]++;
					if (i_139_ > i_136_)
						i_136_ = i_139_;
				}
			}
			((AbstractModel) this).anIntArrayArray10820 = new int[i_136_ + 1][];
			for (int i_140_ = 0; i_140_ <= i_136_; i_140_++) {
				((AbstractModel) this).anIntArrayArray10820[i_140_] = new int[is_137_[i_140_]];
				is_137_[i_140_] = 0;
			}
			for (int i_141_ = 0; i_141_ < ((AbstractModel) this).anInt10833; i_141_++) {
				int i_142_ = class159.anIntArray1780[is[i_141_]];
				if (i_142_ >= 0)
					((AbstractModel) this).anIntArrayArray10820[i_142_][is_137_[i_142_]++] = i_141_;
			}
		}
	}

	short method10008(Class159 class159, int i, int i_143_, long l, int i_144_, int i_145_, int i_146_, int i_147_, float f, float f_148_) {
		int i_149_ = ((AbstractModel) this).sharedFaces[i];
		int i_150_ = ((AbstractModel) this).sharedFaces[i + 1];
		int i_151_ = 0;
		for (int i_152_ = i_149_; i_152_ < i_150_; i_152_++) {
			if (((AbstractModel) this).aShortArray10853[i_152_] == 0) {
				i_151_ = i_152_;
				break;
			}
			int i_153_ = ((((AbstractModel) this).aShortArray10853[i_152_] & 0xffff) - 1);
			if (((AbstractModel) this).aLongArray10855[i_152_] == l)
				return (short) i_153_;
		}
		((AbstractModel) this).aShortArray10853[i_151_] = (short) (((AbstractModel) this).uniqueVertices + 1);
		((AbstractModel) this).aLongArray10855[i_151_] = l;
		((AbstractModel) this).aShortArray10806[(((AbstractModel) this).uniqueVertices)] = (short) i_143_;
		((AbstractModel) this).aShortArray10831[(((AbstractModel) this).uniqueVertices)] = (short) i;
		((AbstractModel) this).aShortArray10807[(((AbstractModel) this).uniqueVertices)] = (short) i_144_;
		((AbstractModel) this).aShortArray10805[(((AbstractModel) this).uniqueVertices)] = (short) i_145_;
		((AbstractModel) this).aShortArray10809[(((AbstractModel) this).uniqueVertices)] = (short) i_146_;
		((AbstractModel) this).aByteArray10838[((AbstractModel) this).uniqueVertices] = (byte) i_147_;
		((AbstractModel) this).aFloatArray10811[(((AbstractModel) this).uniqueVertices)] = f;
		((AbstractModel) this).aFloatArray10812[(((AbstractModel) this).uniqueVertices)] = f_148_;
		return (short) ((AbstractModel) this).uniqueVertices++;
	}

	static byte[] method10009(byte[] is, int i) {
		byte[] is_154_ = new byte[i];
		System.arraycopy(is, 0, is_154_, 0, i);
		return is_154_;
	}

	static short[] method10010(short[] is, int i) {
		short[] is_155_ = new short[i];
		System.arraycopy(is, 0, is_155_, 0, i);
		return is_155_;
	}

	static float[] method10011(float[] fs, int i) {
		float[] fs_156_ = new float[i];
		System.arraycopy(fs, 0, fs_156_, 0, i);
		return fs_156_;
	}

	public int method1353() {
		return ((AbstractModel) this).anInt10829;
	}

	public int method1454() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10802;
	}

	void method10012() {
		if (((AbstractModel) this).aBool10830) {
			((AbstractModel) this).aBool10830 = false;
			if (((AbstractModel) this).aClass84Array10841 == null && ((AbstractModel) this).aClass175Array10850 == null && ((AbstractModel) this).aClass365Array10852 == null && !Class368.method4535(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				boolean bool = false;
				boolean bool_157_ = false;
				boolean bool_158_ = false;
				if (((AbstractModel) this).vertexX != null && !Class368.method4518(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexY != null && !Class368.method4536(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_157_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexZ != null && !Class368.method4520(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_158_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (bool)
					((AbstractModel) this).vertexX = null;
				if (bool_157_)
					((AbstractModel) this).vertexY = null;
				if (bool_158_)
					((AbstractModel) this).vertexZ = null;
			}
			if (((AbstractModel) this).aShortArray10853 != null && ((AbstractModel) this).vertexX == null && ((AbstractModel) this).vertexY == null && ((AbstractModel) this).vertexZ == null) {
				((AbstractModel) this).aShortArray10853 = null;
				((AbstractModel) this).sharedFaces = null;
			}
			while_58_: do {
				if (((AbstractModel) this).aByteArray10838 != null && !Class368.method4521(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					do {
						if ((((AbstractModel) this).anInt10836 & 0x37) != 0) {
							if (((AbstractModel) this).aClass356_10827 != null && !((AbstractModel) this).aClass356_10827.method4424())
								break;
						} else if ((((AbstractModel) this).aClass356_10826 != null) && !((AbstractModel) this).aClass356_10826.method4424())
							break;
						((AbstractModel) this).aShortArray10809 = null;
						((AbstractModel) this).aShortArray10805 = null;
						((AbstractModel) this).aShortArray10807 = null;
						((AbstractModel) this).aByteArray10838 = null;
						break while_58_;
					} while (false);
					((AbstractModel) this).aBool10830 = true;
				}
			} while (false);
			if (((AbstractModel) this).aShortArray10793 != null && !Class368.method4579(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10793 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).alpha != null && !Class368.method4523(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).alpha = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aFloatArray10811 != null && !Class368.method4524(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10828 == null || ((AbstractModel) this).aClass356_10828.method4424()) {
					((AbstractModel) this).aFloatArray10812 = null;
					((AbstractModel) this).aFloatArray10811 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10821 != null && !Class368.method4496(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10821 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10818 != null && !Class368.method4528(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if ((((AbstractModel) this).aClass357_10824 == null || ((AbstractModel) this).aClass357_10824.method4431()) && (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())) {
					((AbstractModel) this).aShortArray10861 = null;
					((AbstractModel) this).aShortArray10819 = null;
					((AbstractModel) this).aShortArray10818 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10831 != null) {
				if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424())
					((AbstractModel) this).aShortArray10831 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10806 != null) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10806 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).anIntArrayArray10820 != null && !Class368.method4529(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10820 = null;
				((AbstractModel) this).aShortArray10839 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10792 != null && !Class368.method4526(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10792 = null;
				((AbstractModel) this).aShortArray10810 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10854 != null && !Class368.method4527(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
				((AbstractModel) this).anIntArrayArray10854 = null;
			if (((AbstractModel) this).anIntArray10844 != null && (((AbstractModel) this).anInt10829 & 0x800) == 0 && (((AbstractModel) this).anInt10829 & 0x40000) == 0) {
				((AbstractModel) this).anIntArray10844 = null;
				((AbstractModel) this).anIntArray10846 = null;
				((AbstractModel) this).anIntArray10845 = null;
			}
		}
	}

	public Model method1351(byte i, int i_159_, boolean bool) {
		boolean bool_160_ = false;
		AbstractModel class89_sub3_161_;
		AbstractModel class89_sub3_162_;
		if (i > 0 && i <= 8) {
			class89_sub3_162_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass89_Sub3Array10538[i - 1]);
			class89_sub3_161_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass89_Sub3Array10537[i - 1]);
			bool_160_ = true;
		} else
			class89_sub3_161_ = class89_sub3_162_ = new AbstractModel(((AbstractModel) this).aClass106_Sub3_10825, 0, 0, true, false);
		return method10013(class89_sub3_161_, class89_sub3_162_, i_159_, bool_160_, bool);
	}

	Model method10013(AbstractModel class89_sub3_163_, AbstractModel class89_sub3_164_, int i, boolean bool, boolean bool_165_) {
		((AbstractModel) class89_sub3_163_).anInt10829 = i;
		((AbstractModel) class89_sub3_163_).anInt10836 = ((AbstractModel) this).anInt10836;
		((AbstractModel) class89_sub3_163_).aShort10795 = ((AbstractModel) this).aShort10795;
		((AbstractModel) class89_sub3_163_).aShort10796 = ((AbstractModel) this).aShort10796;
		((AbstractModel) class89_sub3_163_).anInt10797 = ((AbstractModel) this).anInt10797;
		((AbstractModel) class89_sub3_163_).maxVertexUsed = ((AbstractModel) this).maxVertexUsed;
		((AbstractModel) class89_sub3_163_).uniqueVertices = ((AbstractModel) this).uniqueVertices;
		((AbstractModel) class89_sub3_163_).anInt10833 = ((AbstractModel) this).anInt10833;
		((AbstractModel) class89_sub3_163_).anInt10815 = ((AbstractModel) this).anInt10815;
		((AbstractModel) class89_sub3_163_).anInt10851 = ((AbstractModel) this).anInt10851;
		if ((i & 0x100) != 0)
			((AbstractModel) class89_sub3_163_).aBool10803 = true;
		else
			((AbstractModel) class89_sub3_163_).aBool10803 = ((AbstractModel) this).aBool10803;
		((AbstractModel) class89_sub3_163_).aBool10832 = ((AbstractModel) this).aBool10832;
		boolean bool_166_ = Class368.method4562(i, ((AbstractModel) this).anInt10836);
		boolean bool_167_ = Class368.method4563(i, ((AbstractModel) this).anInt10836);
		boolean bool_168_ = Class368.method4499(i, ((AbstractModel) this).anInt10836);
		boolean bool_169_ = bool_166_ | bool_167_ | bool_168_;
		if (bool_169_) {
			if (bool_166_) {
				if (((AbstractModel) class89_sub3_164_).vertexX == null || ((((AbstractModel) class89_sub3_164_).vertexX).length < ((AbstractModel) this).anInt10797))
					((AbstractModel) class89_sub3_163_).vertexX = ((AbstractModel) class89_sub3_164_).vertexX = new int[((AbstractModel) this).anInt10797];
				else
					((AbstractModel) class89_sub3_163_).vertexX = ((AbstractModel) class89_sub3_164_).vertexX;
			} else
				((AbstractModel) class89_sub3_163_).vertexX = ((AbstractModel) this).vertexX;
			if (bool_167_) {
				if (((AbstractModel) class89_sub3_164_).vertexY == null || ((((AbstractModel) class89_sub3_164_).vertexY).length < ((AbstractModel) this).anInt10797))
					((AbstractModel) class89_sub3_163_).vertexY = ((AbstractModel) class89_sub3_164_).vertexY = new int[((AbstractModel) this).anInt10797];
				else
					((AbstractModel) class89_sub3_163_).vertexY = ((AbstractModel) class89_sub3_164_).vertexY;
			} else
				((AbstractModel) class89_sub3_163_).vertexY = ((AbstractModel) this).vertexY;
			if (bool_168_) {
				if (((AbstractModel) class89_sub3_164_).vertexZ == null || ((((AbstractModel) class89_sub3_164_).vertexZ).length < ((AbstractModel) this).anInt10797))
					((AbstractModel) class89_sub3_163_).vertexZ = ((AbstractModel) class89_sub3_164_).vertexZ = new int[((AbstractModel) this).anInt10797];
				else
					((AbstractModel) class89_sub3_163_).vertexZ = ((AbstractModel) class89_sub3_164_).vertexZ;
			} else
				((AbstractModel) class89_sub3_163_).vertexZ = ((AbstractModel) this).vertexZ;
			for (int i_170_ = 0; i_170_ < ((AbstractModel) this).anInt10797; i_170_++) {
				if (bool_166_)
					((AbstractModel) class89_sub3_163_).vertexX[i_170_] = ((AbstractModel) this).vertexX[i_170_];
				if (bool_167_)
					((AbstractModel) class89_sub3_163_).vertexY[i_170_] = ((AbstractModel) this).vertexY[i_170_];
				if (bool_168_)
					((AbstractModel) class89_sub3_163_).vertexZ[i_170_] = ((AbstractModel) this).vertexZ[i_170_];
			}
		} else {
			((AbstractModel) class89_sub3_163_).vertexX = ((AbstractModel) this).vertexX;
			((AbstractModel) class89_sub3_163_).vertexY = ((AbstractModel) this).vertexY;
			((AbstractModel) class89_sub3_163_).vertexZ = ((AbstractModel) this).vertexZ;
		}
		if (Class368.method4513(i, ((AbstractModel) this).anInt10836)) {
			((AbstractModel) class89_sub3_163_).aClass356_10813 = ((AbstractModel) class89_sub3_164_).aClass356_10813;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10813).anInterface44_4412 = (((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4412);
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10813).aBool4413 = ((Class356) ((AbstractModel) this).aClass356_10813).aBool4413;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10813).aBool4414 = true;
		} else if (Class368.method4570(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) class89_sub3_163_).aClass356_10813 = ((AbstractModel) this).aClass356_10813;
		else
			((AbstractModel) class89_sub3_163_).aClass356_10813 = null;
		if (Class368.method4501(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aShortArray10793 == null || (((AbstractModel) class89_sub3_164_).aShortArray10793.length < ((AbstractModel) this).anInt10833))
				((AbstractModel) class89_sub3_163_).aShortArray10793 = ((AbstractModel) class89_sub3_164_).aShortArray10793 = new short[((AbstractModel) this).anInt10833];
			else
				((AbstractModel) class89_sub3_163_).aShortArray10793 = ((AbstractModel) class89_sub3_164_).aShortArray10793;
			for (int i_171_ = 0; i_171_ < ((AbstractModel) this).anInt10833; i_171_++)
				((AbstractModel) class89_sub3_163_).aShortArray10793[i_171_] = ((AbstractModel) this).aShortArray10793[i_171_];
		} else
			((AbstractModel) class89_sub3_163_).aShortArray10793 = ((AbstractModel) this).aShortArray10793;
		if (Class368.method4561(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).alpha == null || (((AbstractModel) class89_sub3_164_).alpha.length < ((AbstractModel) this).anInt10833))
				((AbstractModel) class89_sub3_163_).alpha = ((AbstractModel) class89_sub3_164_).alpha = new byte[((AbstractModel) this).anInt10833];
			else
				((AbstractModel) class89_sub3_163_).alpha = ((AbstractModel) class89_sub3_164_).alpha;
			for (int i_172_ = 0; i_172_ < ((AbstractModel) this).anInt10833; i_172_++)
				((AbstractModel) class89_sub3_163_).alpha[i_172_] = ((AbstractModel) this).alpha[i_172_];
		} else
			((AbstractModel) class89_sub3_163_).alpha = ((AbstractModel) this).alpha;

		if (Class368.method4515(i, ((AbstractModel) this).anInt10836)) {
			((AbstractModel) class89_sub3_163_).aClass356_10826 = ((AbstractModel) class89_sub3_164_).aClass356_10826;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10826).anInterface44_4412 = (((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4412);
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10826).aBool4413 = ((Class356) ((AbstractModel) this).aClass356_10826).aBool4413;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10826).aBool4414 = true;
		} else if (Class368.method4510(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) class89_sub3_163_).aClass356_10826 = ((AbstractModel) this).aClass356_10826;
		else
			((AbstractModel) class89_sub3_163_).aClass356_10826 = null;
		if (Class368.method4519(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aShortArray10807 == null || (((AbstractModel) class89_sub3_164_).aShortArray10807.length < ((AbstractModel) this).uniqueVertices)) {
				int i_173_ = ((AbstractModel) this).uniqueVertices;
				((AbstractModel) class89_sub3_163_).aShortArray10807 = ((AbstractModel) class89_sub3_164_).aShortArray10807 = new short[i_173_];
				((AbstractModel) class89_sub3_163_).aShortArray10805 = ((AbstractModel) class89_sub3_164_).aShortArray10805 = new short[i_173_];
				((AbstractModel) class89_sub3_163_).aShortArray10809 = ((AbstractModel) class89_sub3_164_).aShortArray10809 = new short[i_173_];
			} else {
				((AbstractModel) class89_sub3_163_).aShortArray10807 = ((AbstractModel) class89_sub3_164_).aShortArray10807;
				((AbstractModel) class89_sub3_163_).aShortArray10805 = ((AbstractModel) class89_sub3_164_).aShortArray10805;
				((AbstractModel) class89_sub3_163_).aShortArray10809 = ((AbstractModel) class89_sub3_164_).aShortArray10809;
			}
			if (((AbstractModel) this).aClass377_10823 != null) {
				if (((AbstractModel) class89_sub3_164_).aClass377_10823 == null)
					((AbstractModel) class89_sub3_164_).aClass377_10823 = new Class377();
				Class377 class377 = (((AbstractModel) class89_sub3_163_).aClass377_10823 = ((AbstractModel) class89_sub3_164_).aClass377_10823);
				if (((Class377) class377).aShortArray4573 == null || (((Class377) class377).aShortArray4573.length < ((AbstractModel) this).uniqueVertices)) {
					int i_174_ = ((AbstractModel) this).uniqueVertices;
					((Class377) class377).aShortArray4573 = new short[i_174_];
					((Class377) class377).aShortArray4570 = new short[i_174_];
					((Class377) class377).aShortArray4572 = new short[i_174_];
					((Class377) class377).aByteArray4571 = new byte[i_174_];
				}
				for (int i_175_ = 0; i_175_ < ((AbstractModel) this).uniqueVertices; i_175_++) {
					((AbstractModel) class89_sub3_163_).aShortArray10807[i_175_] = ((AbstractModel) this).aShortArray10807[i_175_];
					((AbstractModel) class89_sub3_163_).aShortArray10805[i_175_] = ((AbstractModel) this).aShortArray10805[i_175_];
					((AbstractModel) class89_sub3_163_).aShortArray10809[i_175_] = ((AbstractModel) this).aShortArray10809[i_175_];
					((Class377) class377).aShortArray4573[i_175_] = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573[i_175_]);
					((Class377) class377).aShortArray4570[i_175_] = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570[i_175_]);
					((Class377) class377).aShortArray4572[i_175_] = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572[i_175_]);
					((Class377) class377).aByteArray4571[i_175_] = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571[i_175_]);
				}
			} else {
				((AbstractModel) class89_sub3_163_).aClass377_10823 = null;
				for (int i_176_ = 0; i_176_ < ((AbstractModel) this).uniqueVertices; i_176_++) {
					((AbstractModel) class89_sub3_163_).aShortArray10807[i_176_] = ((AbstractModel) this).aShortArray10807[i_176_];
					((AbstractModel) class89_sub3_163_).aShortArray10805[i_176_] = ((AbstractModel) this).aShortArray10805[i_176_];
					((AbstractModel) class89_sub3_163_).aShortArray10809[i_176_] = ((AbstractModel) this).aShortArray10809[i_176_];
				}
			}
			((AbstractModel) class89_sub3_163_).aByteArray10838 = ((AbstractModel) this).aByteArray10838;
		} else {
			((AbstractModel) class89_sub3_163_).aClass377_10823 = ((AbstractModel) this).aClass377_10823;
			((AbstractModel) class89_sub3_163_).aShortArray10807 = ((AbstractModel) this).aShortArray10807;
			((AbstractModel) class89_sub3_163_).aShortArray10805 = ((AbstractModel) this).aShortArray10805;
			((AbstractModel) class89_sub3_163_).aShortArray10809 = ((AbstractModel) this).aShortArray10809;
			((AbstractModel) class89_sub3_163_).aByteArray10838 = ((AbstractModel) this).aByteArray10838;
		}
		if (Class368.method4514(i, ((AbstractModel) this).anInt10836)) {
			((AbstractModel) class89_sub3_163_).aClass356_10827 = ((AbstractModel) class89_sub3_164_).aClass356_10827;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10827).anInterface44_4412 = (((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4412);
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10827).aBool4413 = ((Class356) ((AbstractModel) this).aClass356_10827).aBool4413;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10827).aBool4414 = true;
		} else if (Class368.method4509(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) class89_sub3_163_).aClass356_10827 = ((AbstractModel) this).aClass356_10827;
		else
			((AbstractModel) class89_sub3_163_).aClass356_10827 = null;
		if (Class368.method4503(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aFloatArray10811 == null || (((AbstractModel) class89_sub3_164_).aFloatArray10811.length < ((AbstractModel) this).anInt10833)) {
				int i_177_ = ((AbstractModel) this).uniqueVertices;
				((AbstractModel) class89_sub3_163_).aFloatArray10811 = ((AbstractModel) class89_sub3_164_).aFloatArray10811 = new float[i_177_];
				((AbstractModel) class89_sub3_163_).aFloatArray10812 = ((AbstractModel) class89_sub3_164_).aFloatArray10812 = new float[i_177_];
			} else {
				((AbstractModel) class89_sub3_163_).aFloatArray10811 = ((AbstractModel) class89_sub3_164_).aFloatArray10811;
				((AbstractModel) class89_sub3_163_).aFloatArray10812 = ((AbstractModel) class89_sub3_164_).aFloatArray10812;
			}
			for (int i_178_ = 0; i_178_ < ((AbstractModel) this).uniqueVertices; i_178_++) {
				((AbstractModel) class89_sub3_163_).aFloatArray10811[i_178_] = ((AbstractModel) this).aFloatArray10811[i_178_];
				((AbstractModel) class89_sub3_163_).aFloatArray10812[i_178_] = ((AbstractModel) this).aFloatArray10812[i_178_];
			}
		} else {
			((AbstractModel) class89_sub3_163_).aFloatArray10811 = ((AbstractModel) this).aFloatArray10811;
			((AbstractModel) class89_sub3_163_).aFloatArray10812 = ((AbstractModel) this).aFloatArray10812;
		}
		if (Class368.method4516(i, ((AbstractModel) this).anInt10836)) {
			((AbstractModel) class89_sub3_163_).aClass356_10828 = ((AbstractModel) class89_sub3_164_).aClass356_10828;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10828).anInterface44_4412 = (((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4412);
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10828).aBool4413 = ((Class356) ((AbstractModel) this).aClass356_10828).aBool4413;
			((Class356) ((AbstractModel) class89_sub3_163_).aClass356_10828).aBool4414 = true;
		} else if (Class368.method4498(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) class89_sub3_163_).aClass356_10828 = ((AbstractModel) this).aClass356_10828;
		else
			((AbstractModel) class89_sub3_163_).aClass356_10828 = null;
		if (Class368.method4596(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aShortArray10818 == null || (((AbstractModel) class89_sub3_164_).aShortArray10818.length < ((AbstractModel) this).anInt10833)) {
				int i_179_ = ((AbstractModel) this).anInt10833;
				((AbstractModel) class89_sub3_163_).aShortArray10818 = ((AbstractModel) class89_sub3_164_).aShortArray10818 = new short[i_179_];
				((AbstractModel) class89_sub3_163_).aShortArray10819 = ((AbstractModel) class89_sub3_164_).aShortArray10819 = new short[i_179_];
				((AbstractModel) class89_sub3_163_).aShortArray10861 = ((AbstractModel) class89_sub3_164_).aShortArray10861 = new short[i_179_];
			} else {
				((AbstractModel) class89_sub3_163_).aShortArray10818 = ((AbstractModel) class89_sub3_164_).aShortArray10818;
				((AbstractModel) class89_sub3_163_).aShortArray10819 = ((AbstractModel) class89_sub3_164_).aShortArray10819;
				((AbstractModel) class89_sub3_163_).aShortArray10861 = ((AbstractModel) class89_sub3_164_).aShortArray10861;
			}
			for (int i_180_ = 0; i_180_ < ((AbstractModel) this).anInt10833; i_180_++) {
				((AbstractModel) class89_sub3_163_).aShortArray10818[i_180_] = ((AbstractModel) this).aShortArray10818[i_180_];
				((AbstractModel) class89_sub3_163_).aShortArray10819[i_180_] = ((AbstractModel) this).aShortArray10819[i_180_];
				((AbstractModel) class89_sub3_163_).aShortArray10861[i_180_] = ((AbstractModel) this).aShortArray10861[i_180_];
			}
		} else {
			((AbstractModel) class89_sub3_163_).aShortArray10818 = ((AbstractModel) this).aShortArray10818;
			((AbstractModel) class89_sub3_163_).aShortArray10819 = ((AbstractModel) this).aShortArray10819;
			((AbstractModel) class89_sub3_163_).aShortArray10861 = ((AbstractModel) this).aShortArray10861;
		}
		if (Class368.method4517(i, ((AbstractModel) this).anInt10836)) {
			((AbstractModel) class89_sub3_163_).aClass357_10824 = ((AbstractModel) class89_sub3_164_).aClass357_10824;
			((Class357) ((AbstractModel) class89_sub3_163_).aClass357_10824).anInterface46_4415 = (((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4415);
			((Class357) ((AbstractModel) class89_sub3_163_).aClass357_10824).aBool4416 = ((Class357) ((AbstractModel) this).aClass357_10824).aBool4416;
			((Class357) ((AbstractModel) class89_sub3_163_).aClass357_10824).aBool4417 = true;
		} else if (Class368.method4500(i, ((AbstractModel) this).anInt10836))
			((AbstractModel) class89_sub3_163_).aClass357_10824 = ((AbstractModel) this).aClass357_10824;
		else
			((AbstractModel) class89_sub3_163_).aClass357_10824 = null;
		if (Class368.method4505(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aShortArray10821 == null || (((AbstractModel) class89_sub3_164_).aShortArray10821.length < ((AbstractModel) this).anInt10833)) {
				int i_181_ = ((AbstractModel) this).anInt10833;
				((AbstractModel) class89_sub3_163_).aShortArray10821 = ((AbstractModel) class89_sub3_164_).aShortArray10821 = new short[i_181_];
			} else
				((AbstractModel) class89_sub3_163_).aShortArray10821 = ((AbstractModel) class89_sub3_164_).aShortArray10821;
			for (int i_182_ = 0; i_182_ < ((AbstractModel) this).anInt10833; i_182_++)
				((AbstractModel) class89_sub3_163_).aShortArray10821[i_182_] = ((AbstractModel) this).aShortArray10821[i_182_];
		} else
			((AbstractModel) class89_sub3_163_).aShortArray10821 = ((AbstractModel) this).aShortArray10821;
		if (Class368.method4537(i, ((AbstractModel) this).anInt10836)) {
			if (((AbstractModel) class89_sub3_164_).aClass355Array10864 == null || ((((AbstractModel) class89_sub3_164_).aClass355Array10864).length < ((AbstractModel) this).anInt10851)) {
				int i_183_ = ((AbstractModel) this).anInt10851;
				((AbstractModel) class89_sub3_163_).aClass355Array10864 = ((AbstractModel) class89_sub3_164_).aClass355Array10864 = new Class355[i_183_];
				for (int i_184_ = 0; i_184_ < ((AbstractModel) this).anInt10851; i_184_++)
					((AbstractModel) class89_sub3_163_).aClass355Array10864[i_184_] = ((AbstractModel) this).aClass355Array10864[i_184_].method4423();
			} else {
				((AbstractModel) class89_sub3_163_).aClass355Array10864 = ((AbstractModel) class89_sub3_164_).aClass355Array10864;
				for (int i_185_ = 0; i_185_ < ((AbstractModel) this).anInt10851; i_185_++)
					((AbstractModel) class89_sub3_163_).aClass355Array10864[i_185_].method4422(((AbstractModel) this).aClass355Array10864[i_185_]);
			}
		} else
			((AbstractModel) class89_sub3_163_).aClass355Array10864 = ((AbstractModel) this).aClass355Array10864;
		((AbstractModel) class89_sub3_163_).aClass365Array10852 = ((AbstractModel) this).aClass365Array10852;
		if (((AbstractModel) this).aBool10835) {
			((AbstractModel) class89_sub3_163_).anInt10802 = ((AbstractModel) this).anInt10802;
			((AbstractModel) class89_sub3_163_).anInt10834 = ((AbstractModel) this).anInt10834;
			((AbstractModel) class89_sub3_163_).anInt10843 = ((AbstractModel) this).anInt10843;
			((AbstractModel) class89_sub3_163_).anInt10790 = ((AbstractModel) this).anInt10790;
			((AbstractModel) class89_sub3_163_).anInt10816 = ((AbstractModel) this).anInt10816;
			((AbstractModel) class89_sub3_163_).anInt10837 = ((AbstractModel) this).anInt10837;
			((AbstractModel) class89_sub3_163_).anInt10840 = ((AbstractModel) this).anInt10840;
			((AbstractModel) class89_sub3_163_).anInt10801 = ((AbstractModel) this).anInt10801;
			((AbstractModel) class89_sub3_163_).aBool10835 = true;
		} else
			((AbstractModel) class89_sub3_163_).aBool10835 = false;
		if (((AbstractModel) this).aBool10842) {
			((AbstractModel) class89_sub3_163_).anInt10814 = ((AbstractModel) this).anInt10814;
			((AbstractModel) class89_sub3_163_).aBool10842 = true;
		} else
			((AbstractModel) class89_sub3_163_).aBool10842 = false;
		((AbstractModel) class89_sub3_163_).anIntArrayArray10792 = ((AbstractModel) this).anIntArrayArray10792;
		((AbstractModel) class89_sub3_163_).anIntArrayArray10820 = ((AbstractModel) this).anIntArrayArray10820;
		((AbstractModel) class89_sub3_163_).anIntArrayArray10854 = ((AbstractModel) this).anIntArrayArray10854;
		((AbstractModel) class89_sub3_163_).aShortArray10853 = ((AbstractModel) this).aShortArray10853;
		((AbstractModel) class89_sub3_163_).sharedFaces = ((AbstractModel) this).sharedFaces;
		((AbstractModel) class89_sub3_163_).aShortArray10831 = ((AbstractModel) this).aShortArray10831;
		((AbstractModel) class89_sub3_163_).aShortArray10806 = ((AbstractModel) this).aShortArray10806;
		((AbstractModel) class89_sub3_163_).aShortArray10810 = ((AbstractModel) this).aShortArray10810;
		((AbstractModel) class89_sub3_163_).aShortArray10839 = ((AbstractModel) this).aShortArray10839;
		((AbstractModel) class89_sub3_163_).anIntArray10844 = ((AbstractModel) this).anIntArray10844;
		((AbstractModel) class89_sub3_163_).anIntArray10846 = ((AbstractModel) this).anIntArray10846;
		((AbstractModel) class89_sub3_163_).anIntArray10845 = ((AbstractModel) this).anIntArray10845;
		((AbstractModel) class89_sub3_163_).aClass84Array10841 = ((AbstractModel) this).aClass84Array10841;
		((AbstractModel) class89_sub3_163_).aClass175Array10850 = ((AbstractModel) this).aClass175Array10850;
		return class89_sub3_163_;
	}

	void method1505() {
		/* empty */
	}

	public void method1414(int i) {
		int i_186_ = Class325.anIntArray4103[i];
		int i_187_ = Class325.anIntArray4105[i];
		for (int i_188_ = 0; i_188_ < ((AbstractModel) this).maxVertexUsed; i_188_++) {
			int i_189_ = ((((AbstractModel) this).vertexZ[i_188_] * i_186_ + ((AbstractModel) this).vertexX[i_188_] * i_187_) >> 14);
			((AbstractModel) this).vertexZ[i_188_] = ((((AbstractModel) this).vertexZ[i_188_] * i_187_ - ((AbstractModel) this).vertexX[i_188_] * i_186_) >> 14);
			((AbstractModel) this).vertexX[i_188_] = i_189_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	void method10014() {
		if (((AbstractModel) this).aClass356_10826 != null)
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4413 = false;
	}

	public Class84[] method1425() {
		return ((AbstractModel) this).aClass84Array10841;
	}

	void method10015() {
		if (((AbstractModel) this).aClass357_10824 != null)
			((Class357) ((AbstractModel) this).aClass357_10824).aBool4416 = false;
	}

	public int method1382() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10816;
	}

	void method1432(int i, int[] is, int i_190_, int i_191_, int i_192_, boolean bool, int i_193_, int[] is_194_) {
	}

	public void method1368(int i) {
		int i_364_ = Class325.anIntArray4103[i];
		int i_365_ = Class325.anIntArray4105[i];
		for (int i_366_ = 0; i_366_ < ((AbstractModel) this).maxVertexUsed; i_366_++) {
			int i_367_ = ((((AbstractModel) this).vertexY[i_366_] * i_365_ - ((AbstractModel) this).vertexZ[i_366_] * i_364_) >> 14);
			((AbstractModel) this).vertexZ[i_366_] = ((((AbstractModel) this).vertexY[i_366_] * i_364_ + ((AbstractModel) this).vertexZ[i_366_] * i_365_) >> 14);
			((AbstractModel) this).vertexY[i_366_] = i_367_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1500(int i) {
		int i_368_ = Class325.anIntArray4103[i];
		int i_369_ = Class325.anIntArray4105[i];
		for (int i_370_ = 0; i_370_ < ((AbstractModel) this).maxVertexUsed; i_370_++) {
			int i_371_ = ((((AbstractModel) this).vertexY[i_370_] * i_368_ + ((AbstractModel) this).vertexX[i_370_] * i_369_) >> 14);
			((AbstractModel) this).vertexY[i_370_] = ((((AbstractModel) this).vertexY[i_370_] * i_369_ - ((AbstractModel) this).vertexX[i_370_] * i_368_) >> 14);
			((AbstractModel) this).vertexX[i_370_] = i_371_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1358(int i, int i_372_, int i_373_) {
		for (int i_374_ = 0; i_374_ < ((AbstractModel) this).maxVertexUsed; i_374_++) {
			if (i != 0)
				((AbstractModel) this).vertexX[i_374_] += i;
			if (i_372_ != 0)
				((AbstractModel) this).vertexY[i_374_] += i_372_;
			if (i_373_ != 0)
				((AbstractModel) this).vertexZ[i_374_] += i_373_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1393(short i, short i_375_) {
		for (int i_376_ = 0; i_376_ < ((AbstractModel) this).anInt10833; i_376_++) {
			if (((AbstractModel) this).aShortArray10793[i_376_] == i)
				((AbstractModel) this).aShortArray10793[i_376_] = i_375_;
		}
		if (((AbstractModel) this).aClass365Array10852 != null) {
			for (int i_377_ = 0; i_377_ < ((AbstractModel) this).anInt10851; i_377_++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_377_];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_377_];
				((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
			}
		}
		method10014();
	}

	public void method1464(int i, int i_378_, int i_379_) {
		for (int i_380_ = 0; i_380_ < ((AbstractModel) this).maxVertexUsed; i_380_++) {
			if (i != 128)
				((AbstractModel) this).vertexX[i_380_] = ((AbstractModel) this).vertexX[i_380_] * i >> 7;
			if (i_378_ != 128)
				((AbstractModel) this).vertexY[i_380_] = (((AbstractModel) this).vertexY[i_380_] * i_378_ >> 7);
			if (i_379_ != 128)
				((AbstractModel) this).vertexZ[i_380_] = (((AbstractModel) this).vertexZ[i_380_] * i_379_ >> 7);
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public int method1508() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10801;
	}

	void method10016() {
		int i = 32767;
		int i_381_ = 32767;
		int i_382_ = 32767;
		int i_383_ = -32768;
		int i_384_ = -32768;
		int i_385_ = -32768;
		int i_386_ = 0;
		int i_387_ = 0;
		for (int i_388_ = 0; i_388_ < ((AbstractModel) this).maxVertexUsed; i_388_++) {
			int i_389_ = ((AbstractModel) this).vertexX[i_388_];
			int i_390_ = ((AbstractModel) this).vertexY[i_388_];
			int i_391_ = ((AbstractModel) this).vertexZ[i_388_];
			if (i_389_ < i)
				i = i_389_;
			if (i_389_ > i_383_)
				i_383_ = i_389_;
			if (i_390_ < i_381_)
				i_381_ = i_390_;
			if (i_390_ > i_384_)
				i_384_ = i_390_;
			if (i_391_ < i_382_)
				i_382_ = i_391_;
			if (i_391_ > i_385_)
				i_385_ = i_391_;
			int i_392_ = i_389_ * i_389_ + i_391_ * i_391_;
			if (i_392_ > i_386_)
				i_386_ = i_392_;
			i_392_ = i_389_ * i_389_ + i_391_ * i_391_ + i_390_ * i_390_;
			if (i_392_ > i_387_)
				i_387_ = i_392_;
		}
		((AbstractModel) this).anInt10843 = i;
		((AbstractModel) this).anInt10790 = i_383_;
		((AbstractModel) this).anInt10816 = i_381_;
		((AbstractModel) this).anInt10837 = i_384_;
		((AbstractModel) this).anInt10840 = i_382_;
		((AbstractModel) this).anInt10801 = i_385_;
		((AbstractModel) this).anInt10834 = (int) (Math.sqrt((double) i_386_) + 0.99);
		((AbstractModel) this).anInt10802 = (int) (Math.sqrt((double) i_387_) + 0.99);
		((AbstractModel) this).aBool10835 = true;
	}

	public void method1483() {
		if (!((AbstractModel) this).aBool10842) {
			if (!((AbstractModel) this).aBool10835)
				method10016();
			((AbstractModel) this).anInt10814 = ((AbstractModel) this).anInt10816;
			((AbstractModel) this).aBool10842 = true;
		}
	}

	public void method1360(Model model, int i, int i_393_, int i_394_, boolean bool) {
		AbstractModel class89_sub3_395_ = (AbstractModel) model;
		if (((AbstractModel) this).anInt10833 != 0 && ((AbstractModel) class89_sub3_395_).anInt10833 != 0) {
			int i_396_ = ((AbstractModel) class89_sub3_395_).maxVertexUsed;
			int[] is = ((AbstractModel) class89_sub3_395_).vertexX;
			int[] is_397_ = ((AbstractModel) class89_sub3_395_).vertexY;
			int[] is_398_ = ((AbstractModel) class89_sub3_395_).vertexZ;
			short[] is_399_ = ((AbstractModel) class89_sub3_395_).aShortArray10807;
			short[] is_400_ = ((AbstractModel) class89_sub3_395_).aShortArray10805;
			short[] is_401_ = ((AbstractModel) class89_sub3_395_).aShortArray10809;
			byte[] is_402_ = ((AbstractModel) class89_sub3_395_).aByteArray10838;
			short[] is_403_;
			short[] is_404_;
			short[] is_405_;
			byte[] is_406_;
			if (((AbstractModel) this).aClass377_10823 != null) {
				is_403_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
				is_404_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
				is_405_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
				is_406_ = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			} else {
				is_403_ = null;
				is_404_ = null;
				is_405_ = null;
				is_406_ = null;
			}
			short[] is_407_;
			short[] is_408_;
			short[] is_409_;
			byte[] is_410_;
			if (((AbstractModel) class89_sub3_395_).aClass377_10823 != null) {
				is_407_ = ((Class377) (((AbstractModel) class89_sub3_395_).aClass377_10823)).aShortArray4573;
				is_408_ = ((Class377) (((AbstractModel) class89_sub3_395_).aClass377_10823)).aShortArray4570;
				is_409_ = ((Class377) (((AbstractModel) class89_sub3_395_).aClass377_10823)).aShortArray4572;
				is_410_ = ((Class377) (((AbstractModel) class89_sub3_395_).aClass377_10823)).aByteArray4571;
			} else {
				is_407_ = null;
				is_408_ = null;
				is_409_ = null;
				is_410_ = null;
			}
			int[] is_411_ = ((AbstractModel) class89_sub3_395_).sharedFaces;
			short[] is_412_ = ((AbstractModel) class89_sub3_395_).aShortArray10853;
			if (!((AbstractModel) class89_sub3_395_).aBool10835)
				class89_sub3_395_.method10016();
			int i_413_ = ((AbstractModel) class89_sub3_395_).anInt10816;
			int i_414_ = ((AbstractModel) class89_sub3_395_).anInt10837;
			int i_415_ = ((AbstractModel) class89_sub3_395_).anInt10843;
			int i_416_ = ((AbstractModel) class89_sub3_395_).anInt10790;
			int i_417_ = ((AbstractModel) class89_sub3_395_).anInt10840;
			int i_418_ = ((AbstractModel) class89_sub3_395_).anInt10801;
			for (int i_419_ = 0; i_419_ < ((AbstractModel) this).maxVertexUsed; i_419_++) {
				int i_420_ = ((AbstractModel) this).vertexY[i_419_] - i_393_;
				if (i_420_ >= i_413_ && i_420_ <= i_414_) {
					int i_421_ = ((AbstractModel) this).vertexX[i_419_] - i;
					if (i_421_ >= i_415_ && i_421_ <= i_416_) {
						int i_422_ = (((AbstractModel) this).vertexZ[i_419_] - i_394_);
						if (i_422_ >= i_417_ && i_422_ <= i_418_) {
							int i_423_ = -1;
							int i_424_ = (((AbstractModel) this).sharedFaces[i_419_]);
							int i_425_ = (((AbstractModel) this).sharedFaces[i_419_ + 1]);
							for (int i_426_ = i_424_; (i_426_ < i_425_ && (((AbstractModel) this).aShortArray10853[i_426_]) != 0); i_426_++) {
								i_423_ = ((((AbstractModel) this).aShortArray10853[i_426_]) & 0xffff) - 1;
								if ((((AbstractModel) this).aByteArray10838[i_423_]) != 0)
									break;
							}
							if (i_423_ != -1) {
								for (int i_427_ = 0; i_427_ < i_396_; i_427_++) {
									if (i_421_ == is[i_427_] && i_422_ == is_398_[i_427_] && i_420_ == is_397_[i_427_]) {
										int i_428_ = -1;
										i_424_ = is_411_[i_427_];
										i_425_ = is_411_[i_427_ + 1];
										for (int i_429_ = i_424_; (i_429_ < i_425_ && is_412_[i_429_] != 0); i_429_++) {
											i_428_ = is_412_[i_429_] - 1 & 0xffff;
											if (is_402_[i_428_] != 0)
												break;
										}
										if (i_428_ != -1) {
											if (is_403_ == null) {
												((AbstractModel) this).aClass377_10823 = new Class377();
												is_403_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4573 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10807), -1582549652));
												is_404_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4570 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10805), -1740928978));
												is_405_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4572 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10809), -637463490));
												is_406_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aByteArray4571 = (Class359.method4442((((AbstractModel) this).aByteArray10838), -2126707571));
											}
											if (is_407_ == null) {
												Class377 class377 = (((AbstractModel) class89_sub3_395_).aClass377_10823 = new Class377());
												is_407_ = ((Class377) class377).aShortArray4573 = (Class572_Sub3_Sub3.method10283(is_399_, -468161832));
												is_408_ = ((Class377) class377).aShortArray4570 = (Class572_Sub3_Sub3.method10283(is_400_, -1381093199));
												is_409_ = ((Class377) class377).aShortArray4572 = (Class572_Sub3_Sub3.method10283(is_401_, -1908541859));
												is_410_ = ((Class377) class377).aByteArray4571 = (Class359.method4442(is_402_, -2121441791));
											}
											short i_430_ = (((AbstractModel) this).aShortArray10807[i_423_]);
											short i_431_ = (((AbstractModel) this).aShortArray10805[i_423_]);
											short i_432_ = (((AbstractModel) this).aShortArray10809[i_423_]);
											byte i_433_ = (((AbstractModel) this).aByteArray10838[i_423_]);
											i_424_ = is_411_[i_427_];
											i_425_ = is_411_[i_427_ + 1];
											for (int i_434_ = i_424_; i_434_ < i_425_; i_434_++) {
												int i_435_ = is_412_[i_434_] - 1;
												if (i_435_ == -1)
													break;
												if (is_410_[i_435_] != 0) {
													is_407_[i_435_] += i_430_;
													is_408_[i_435_] += i_431_;
													is_409_[i_435_] += i_432_;
													is_410_[i_435_] += i_433_;
												}
											}
											i_430_ = is_399_[i_428_];
											i_431_ = is_400_[i_428_];
											i_432_ = is_401_[i_428_];
											i_433_ = is_402_[i_428_];
											i_424_ = (((AbstractModel) this).sharedFaces[i_419_]);
											i_425_ = (((AbstractModel) this).sharedFaces[i_419_ + 1]);
											for (int i_436_ = i_424_; (i_436_ < i_425_ && (((AbstractModel) this).aShortArray10853[i_436_]) != 0); i_436_++) {
												int i_437_ = (((((AbstractModel) this).aShortArray10853[i_436_]) & 0xffff) - 1);
												if (is_406_[i_437_] != 0) {
													is_403_[i_437_] += i_430_;
													is_404_[i_437_] += i_431_;
													is_405_[i_437_] += i_432_;
													is_406_[i_437_] += i_433_;
												}
											}
											class89_sub3_395_.method10017();
											method10017();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method1463(int i, int i_438_, Class174 class174, Class174 class174_439_, int i_440_, int i_441_, int i_442_) {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		int i_443_ = i_440_ + ((AbstractModel) this).anInt10843;
		int i_444_ = i_440_ + ((AbstractModel) this).anInt10790;
		int i_445_ = i_442_ + ((AbstractModel) this).anInt10840;
		int i_446_ = i_442_ + ((AbstractModel) this).anInt10801;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_443_ >= 0 && ((i_444_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2086 * -1715487093) && i_445_ >= 0 && ((i_446_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2089 * 792439321))) {
			if (i == 4 || i == 5) {
				if (class174_439_ == null || (i_443_ < 0 || ((i_444_ + class174_439_.anInt2087 * 2129890771 >> class174_439_.anInt2088 * 212267571) >= class174_439_.anInt2086 * -1715487093) || i_445_ < 0 || ((i_446_ + class174_439_.anInt2087 * 2129890771 >> class174_439_.anInt2088 * 212267571) >= class174_439_.anInt2089 * 792439321)))
					return;
			} else {
				i_443_ >>= class174.anInt2088 * 212267571;
				i_444_ = (i_444_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				i_445_ >>= class174.anInt2088 * 212267571;
				i_446_ = (i_446_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				if (class174.method2713(i_443_, i_445_, 1019685295) == i_441_ && (class174.method2713(i_444_, i_445_, -216635591) == i_441_) && (class174.method2713(i_443_, i_446_, -732707055) == i_441_) && (class174.method2713(i_444_, i_446_, 185173292) == i_441_))
					return;
			}
			if (i == 1) {
				for (int i_447_ = 0; i_447_ < ((AbstractModel) this).maxVertexUsed; i_447_++)
					((AbstractModel) this).vertexY[i_447_] = (((AbstractModel) this).vertexY[i_447_] + class174.method2718(((((AbstractModel) this).vertexX[i_447_]) + i_440_), ((((AbstractModel) this).vertexZ[i_447_]) + i_442_), -2051751105) - i_441_);
			} else if (i == 2) {
				int i_448_ = ((AbstractModel) this).anInt10816;
				if (i_448_ == 0)
					return;
				for (int i_449_ = 0; i_449_ < ((AbstractModel) this).maxVertexUsed; i_449_++) {
					int i_450_ = (((AbstractModel) this).vertexY[i_449_] << 16) / i_448_;
					if (i_450_ < i_438_)
						((AbstractModel) this).vertexY[i_449_] = (((AbstractModel) this).vertexY[i_449_] + (class174.method2718((((AbstractModel) this).vertexX[i_449_]) + i_440_, (((AbstractModel) this).vertexZ[i_449_]) + i_442_, -1716541912) - i_441_) * (i_438_ - i_450_) / i_438_);
				}
			} else if (i == 3) {
				int i_451_ = (i_438_ & 0xff) * 4;
				int i_452_ = (i_438_ >> 8 & 0xff) * 4;
				int i_453_ = (i_438_ >> 16 & 0xff) << 6;
				int i_454_ = (i_438_ >> 24 & 0xff) << 6;
				if (i_440_ - (i_451_ >> 1) < 0 || ((i_440_ + (i_451_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2086 * -1715487093 << class174.anInt2088 * 212267571)) || i_442_ - (i_452_ >> 1) < 0 || ((i_442_ + (i_452_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2089 * 792439321 << class174.anInt2088 * 212267571)))
					return;
				method1362(class174, i_440_, i_441_, i_442_, i_451_, i_452_, i_453_, i_454_);
			} else if (i == 4) {
				int i_455_ = (((AbstractModel) this).anInt10837 - ((AbstractModel) this).anInt10816);
				for (int i_456_ = 0; i_456_ < ((AbstractModel) this).maxVertexUsed; i_456_++)
					((AbstractModel) this).vertexY[i_456_] = (((AbstractModel) this).vertexY[i_456_] + (class174_439_.method2718((((AbstractModel) this).vertexX[i_456_]) + i_440_, (((AbstractModel) this).vertexZ[i_456_]) + i_442_, -1751266008) - i_441_) + i_455_);
			} else if (i == 5) {
				int i_457_ = (((AbstractModel) this).anInt10837 - ((AbstractModel) this).anInt10816);
				for (int i_458_ = 0; i_458_ < ((AbstractModel) this).maxVertexUsed; i_458_++) {
					int i_459_ = (((AbstractModel) this).vertexX[i_458_] + i_440_);
					int i_460_ = (((AbstractModel) this).vertexZ[i_458_] + i_442_);
					int i_461_ = class174.method2718(i_459_, i_460_, -672028429);
					int i_462_ = class174_439_.method2718(i_459_, i_460_, -498300775);
					int i_463_ = i_461_ - i_462_ - i_438_;
					((AbstractModel) this).vertexY[i_458_] = ((((AbstractModel) this).vertexY[i_458_] << 8) / i_457_ * i_463_ >> 8) - (i_441_ - i_461_);
				}
			}
			method10026();
			((AbstractModel) this).aBool10835 = false;
		}
	}

	public int method1380() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10843;
	}

	public int method1381() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10790;
	}

	void method1423() {
		/* empty */
	}

	public int method1356() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10837;
	}

	public int method1384() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10840;
	}

	public boolean method1486() {
		return ((AbstractModel) this).aBool10803;
	}

	public int method1386() {
		if (!((AbstractModel) this).aBool10842)
			method1483();
		return ((AbstractModel) this).anInt10814;
	}

	public void method1402(Model model, int i, int i_464_, int i_465_, boolean bool) {
		AbstractModel class89_sub3_466_ = (AbstractModel) model;
		if (((AbstractModel) this).anInt10833 != 0 && ((AbstractModel) class89_sub3_466_).anInt10833 != 0) {
			int i_467_ = ((AbstractModel) class89_sub3_466_).maxVertexUsed;
			int[] is = ((AbstractModel) class89_sub3_466_).vertexX;
			int[] is_468_ = ((AbstractModel) class89_sub3_466_).vertexY;
			int[] is_469_ = ((AbstractModel) class89_sub3_466_).vertexZ;
			short[] is_470_ = ((AbstractModel) class89_sub3_466_).aShortArray10807;
			short[] is_471_ = ((AbstractModel) class89_sub3_466_).aShortArray10805;
			short[] is_472_ = ((AbstractModel) class89_sub3_466_).aShortArray10809;
			byte[] is_473_ = ((AbstractModel) class89_sub3_466_).aByteArray10838;
			short[] is_474_;
			short[] is_475_;
			short[] is_476_;
			byte[] is_477_;
			if (((AbstractModel) this).aClass377_10823 != null) {
				is_474_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
				is_475_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
				is_476_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
				is_477_ = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			} else {
				is_474_ = null;
				is_475_ = null;
				is_476_ = null;
				is_477_ = null;
			}
			short[] is_478_;
			short[] is_479_;
			short[] is_480_;
			byte[] is_481_;
			if (((AbstractModel) class89_sub3_466_).aClass377_10823 != null) {
				is_478_ = ((Class377) (((AbstractModel) class89_sub3_466_).aClass377_10823)).aShortArray4573;
				is_479_ = ((Class377) (((AbstractModel) class89_sub3_466_).aClass377_10823)).aShortArray4570;
				is_480_ = ((Class377) (((AbstractModel) class89_sub3_466_).aClass377_10823)).aShortArray4572;
				is_481_ = ((Class377) (((AbstractModel) class89_sub3_466_).aClass377_10823)).aByteArray4571;
			} else {
				is_478_ = null;
				is_479_ = null;
				is_480_ = null;
				is_481_ = null;
			}
			int[] is_482_ = ((AbstractModel) class89_sub3_466_).sharedFaces;
			short[] is_483_ = ((AbstractModel) class89_sub3_466_).aShortArray10853;
			if (!((AbstractModel) class89_sub3_466_).aBool10835)
				class89_sub3_466_.method10016();
			int i_484_ = ((AbstractModel) class89_sub3_466_).anInt10816;
			int i_485_ = ((AbstractModel) class89_sub3_466_).anInt10837;
			int i_486_ = ((AbstractModel) class89_sub3_466_).anInt10843;
			int i_487_ = ((AbstractModel) class89_sub3_466_).anInt10790;
			int i_488_ = ((AbstractModel) class89_sub3_466_).anInt10840;
			int i_489_ = ((AbstractModel) class89_sub3_466_).anInt10801;
			for (int i_490_ = 0; i_490_ < ((AbstractModel) this).maxVertexUsed; i_490_++) {
				int i_491_ = ((AbstractModel) this).vertexY[i_490_] - i_464_;
				if (i_491_ >= i_484_ && i_491_ <= i_485_) {
					int i_492_ = ((AbstractModel) this).vertexX[i_490_] - i;
					if (i_492_ >= i_486_ && i_492_ <= i_487_) {
						int i_493_ = (((AbstractModel) this).vertexZ[i_490_] - i_465_);
						if (i_493_ >= i_488_ && i_493_ <= i_489_) {
							int i_494_ = -1;
							int i_495_ = (((AbstractModel) this).sharedFaces[i_490_]);
							int i_496_ = (((AbstractModel) this).sharedFaces[i_490_ + 1]);
							for (int i_497_ = i_495_; (i_497_ < i_496_ && (((AbstractModel) this).aShortArray10853[i_497_]) != 0); i_497_++) {
								i_494_ = ((((AbstractModel) this).aShortArray10853[i_497_]) & 0xffff) - 1;
								if ((((AbstractModel) this).aByteArray10838[i_494_]) != 0)
									break;
							}
							if (i_494_ != -1) {
								for (int i_498_ = 0; i_498_ < i_467_; i_498_++) {
									if (i_492_ == is[i_498_] && i_493_ == is_469_[i_498_] && i_491_ == is_468_[i_498_]) {
										int i_499_ = -1;
										i_495_ = is_482_[i_498_];
										i_496_ = is_482_[i_498_ + 1];
										for (int i_500_ = i_495_; (i_500_ < i_496_ && is_483_[i_500_] != 0); i_500_++) {
											i_499_ = is_483_[i_500_] - 1 & 0xffff;
											if (is_473_[i_499_] != 0)
												break;
										}
										if (i_499_ != -1) {
											if (is_474_ == null) {
												((AbstractModel) this).aClass377_10823 = new Class377();
												is_474_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4573 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10807), -497099665));
												is_475_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4570 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10805), -1746306830));
												is_476_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4572 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10809), -1284396399));
												is_477_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aByteArray4571 = (Class359.method4442((((AbstractModel) this).aByteArray10838), -2120803444));
											}
											if (is_478_ == null) {
												Class377 class377 = (((AbstractModel) class89_sub3_466_).aClass377_10823 = new Class377());
												is_478_ = ((Class377) class377).aShortArray4573 = (Class572_Sub3_Sub3.method10283(is_470_, -761338029));
												is_479_ = ((Class377) class377).aShortArray4570 = (Class572_Sub3_Sub3.method10283(is_471_, -616767350));
												is_480_ = ((Class377) class377).aShortArray4572 = (Class572_Sub3_Sub3.method10283(is_472_, -1655834634));
												is_481_ = ((Class377) class377).aByteArray4571 = (Class359.method4442(is_473_, -2118072607));
											}
											short i_501_ = (((AbstractModel) this).aShortArray10807[i_494_]);
											short i_502_ = (((AbstractModel) this).aShortArray10805[i_494_]);
											short i_503_ = (((AbstractModel) this).aShortArray10809[i_494_]);
											byte i_504_ = (((AbstractModel) this).aByteArray10838[i_494_]);
											i_495_ = is_482_[i_498_];
											i_496_ = is_482_[i_498_ + 1];
											for (int i_505_ = i_495_; i_505_ < i_496_; i_505_++) {
												int i_506_ = is_483_[i_505_] - 1;
												if (i_506_ == -1)
													break;
												if (is_481_[i_506_] != 0) {
													is_478_[i_506_] += i_501_;
													is_479_[i_506_] += i_502_;
													is_480_[i_506_] += i_503_;
													is_481_[i_506_] += i_504_;
												}
											}
											i_501_ = is_470_[i_499_];
											i_502_ = is_471_[i_499_];
											i_503_ = is_472_[i_499_];
											i_504_ = is_473_[i_499_];
											i_495_ = (((AbstractModel) this).sharedFaces[i_490_]);
											i_496_ = (((AbstractModel) this).sharedFaces[i_490_ + 1]);
											for (int i_507_ = i_495_; (i_507_ < i_496_ && (((AbstractModel) this).aShortArray10853[i_507_]) != 0); i_507_++) {
												int i_508_ = (((((AbstractModel) this).aShortArray10853[i_507_]) & 0xffff) - 1);
												if (is_477_[i_508_] != 0) {
													is_474_[i_508_] += i_501_;
													is_475_[i_508_] += i_502_;
													is_476_[i_508_] += i_503_;
													is_477_[i_508_] += i_504_;
												}
											}
											class89_sub3_466_.method10017();
											method10017();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method1385(int i) {
		((AbstractModel) this).aShort10795 = (short) i;
		method10014();
	}

	public void method1502(int i) {
		((AbstractModel) this).aShort10796 = (short) i;
		method10026();
		method10017();
	}

	public void method1472(short i, short i_509_) {
		for (int i_510_ = 0; i_510_ < ((AbstractModel) this).anInt10833; i_510_++) {
			if (((AbstractModel) this).aShortArray10793[i_510_] == i)
				((AbstractModel) this).aShortArray10793[i_510_] = i_509_;
		}
		if (((AbstractModel) this).aClass365Array10852 != null) {
			for (int i_511_ = 0; i_511_ < ((AbstractModel) this).anInt10851; i_511_++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_511_];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_511_];
				((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
			}
		}
		method10014();
	}

	public int method1452() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10834;
	}

	void method1405(int i, int[] is, int i_512_, int i_513_, int i_514_, int i_515_, boolean bool) {
	}

	public void method1467(byte i, byte[] is) {
		if (is == null) {
			for (int i_607_ = 0; i_607_ < ((AbstractModel) this).anInt10833; i_607_++)
				((AbstractModel) this).alpha[i_607_] = i;
		} else {
			for (int i_608_ = 0; i_608_ < ((AbstractModel) this).anInt10833; i_608_++) {
				int i_609_ = 255 - ((255 - (is[i_608_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((AbstractModel) this).alpha[i_608_] = (byte) i_609_;
			}
		}
		method10014();
	}

	public void method1494(short i, short i_610_) {
		MapSize mapSize = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396;
		for (int i_611_ = 0; i_611_ < ((AbstractModel) this).anInt10833; i_611_++) {
			if (((AbstractModel) this).aShortArray10821[i_611_] == i)
				((AbstractModel) this).aShortArray10821[i_611_] = i_610_;
		}
		byte i_612_ = 0;
		byte i_613_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, -661285946);
			i_612_ = class101.aByte1366;
			i_613_ = class101.aByte1368;
		}
		byte i_614_ = 0;
		byte i_615_ = 0;
		if (i_610_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_610_ & 0xffff, 525615789);
			i_614_ = class101.aByte1366;
			i_615_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((AbstractModel) this).aBool10832 = true;
		}
		if (i_612_ != i_614_ | i_613_ != i_615_) {
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_616_ = 0; i_616_ < ((AbstractModel) this).anInt10851; i_616_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_616_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_616_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		}
	}

	public void method1450(int i) {
		if (((AbstractModel) this).aClass356_10813 != null)
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4414 = Class368.method4513(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10828 != null)
			((Class356) ((AbstractModel) this).aClass356_10828).aBool4414 = Class368.method4516(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10826 != null)
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4414 = Class368.method4515(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10827 != null)
			((Class356) ((AbstractModel) this).aClass356_10827).aBool4414 = Class368.method4514(i, ((AbstractModel) this).anInt10836);
		((AbstractModel) this).anInt10829 = i;
		if (((AbstractModel) this).aClass377_10823 != null && (((AbstractModel) this).anInt10829 & 0x10000) == 0) {
			((AbstractModel) this).aShortArray10807 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
			((AbstractModel) this).aShortArray10805 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
			((AbstractModel) this).aShortArray10809 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
			((AbstractModel) this).aByteArray10838 = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			((AbstractModel) this).aClass377_10823 = null;
		}
		((AbstractModel) this).aBool10830 = true;
		method10012();
	}

	public byte[] method1471() {
		return ((AbstractModel) this).alpha;
	}

	public void method1503() {
		if (((AbstractModel) this).uniqueVertices > 0 && ((AbstractModel) this).anInt10815 > 0) {
			method10027();
			method10029();
			method10012();
		}
	}

	public boolean method1399() {
		return ((AbstractModel) this).aBool10832;
	}

	public boolean method1400() {
		return ((AbstractModel) this).aBool10803;
	}

	void method1363() {
		/* empty */
	}

	boolean method1369() {
		if (((AbstractModel) this).anIntArrayArray10792 == null)
			return false;
		for (int i = 0; i < ((AbstractModel) this).anInt10797; i++) {
			((AbstractModel) this).vertexX[i] <<= 4;
			((AbstractModel) this).vertexY[i] <<= 4;
			((AbstractModel) this).vertexZ[i] <<= 4;
		}
		((AbstractModel) this).anInt10862 = 0;
		((AbstractModel) this).anInt10863 = 0;
		((AbstractModel) this).anInt10794 = 0;
		return true;
	}

	public void method1421(int i, int i_617_, int i_618_) {
		for (int i_619_ = 0; i_619_ < ((AbstractModel) this).maxVertexUsed; i_619_++) {
			if (i != 128)
				((AbstractModel) this).vertexX[i_619_] = ((AbstractModel) this).vertexX[i_619_] * i >> 7;
			if (i_617_ != 128)
				((AbstractModel) this).vertexY[i_619_] = (((AbstractModel) this).vertexY[i_619_] * i_617_ >> 7);
			if (i_618_ != 128)
				((AbstractModel) this).vertexZ[i_619_] = (((AbstractModel) this).vertexZ[i_619_] * i_618_ >> 7);
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	void method1430(int i, int i_620_, int i_621_, int i_622_) {
		if (i == 0) {
			int i_623_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_624_ = 0; i_624_ < ((AbstractModel) this).maxVertexUsed; i_624_++) {
				((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_624_];
				((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_624_];
				((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_624_];
				i_623_++;
			}
			if (i_623_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_623_ + i_620_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_623_ + i_621_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_623_ + i_622_;
			} else {
				((AbstractModel) this).anInt10862 = i_620_;
				((AbstractModel) this).anInt10863 = i_621_;
				((AbstractModel) this).anInt10794 = i_622_;
			}
		} else if (i == 1) {
			for (int i_625_ = 0; i_625_ < ((AbstractModel) this).maxVertexUsed; i_625_++) {
				((AbstractModel) this).vertexX[i_625_] += i_620_;
				((AbstractModel) this).vertexY[i_625_] += i_621_;
				((AbstractModel) this).vertexZ[i_625_] += i_622_;
			}
		} else if (i == 2) {
			for (int i_626_ = 0; i_626_ < ((AbstractModel) this).maxVertexUsed; i_626_++) {
				((AbstractModel) this).vertexX[i_626_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_626_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_626_] -= ((AbstractModel) this).anInt10794;
				if (i_622_ != 0) {
					int i_627_ = Class325.anIntArray4103[i_622_];
					int i_628_ = Class325.anIntArray4105[i_622_];
					int i_629_ = (((((AbstractModel) this).vertexY[i_626_] * i_627_) + (((AbstractModel) this).vertexX[i_626_] * i_628_) + 16383) >> 14);
					((AbstractModel) this).vertexY[i_626_] = ((((AbstractModel) this).vertexY[i_626_] * i_628_) - (((AbstractModel) this).vertexX[i_626_] * i_627_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_626_] = i_629_;
				}
				if (i_620_ != 0) {
					int i_630_ = Class325.anIntArray4103[i_620_];
					int i_631_ = Class325.anIntArray4105[i_620_];
					int i_632_ = (((((AbstractModel) this).vertexY[i_626_] * i_631_) - (((AbstractModel) this).vertexZ[i_626_] * i_630_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_626_] = ((((AbstractModel) this).vertexY[i_626_] * i_630_) + (((AbstractModel) this).vertexZ[i_626_] * i_631_) + 16383) >> 14;
					((AbstractModel) this).vertexY[i_626_] = i_632_;
				}
				if (i_621_ != 0) {
					int i_633_ = Class325.anIntArray4103[i_621_];
					int i_634_ = Class325.anIntArray4105[i_621_];
					int i_635_ = (((((AbstractModel) this).vertexZ[i_626_] * i_633_) + (((AbstractModel) this).vertexX[i_626_] * i_634_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_626_] = ((((AbstractModel) this).vertexZ[i_626_] * i_634_) - (((AbstractModel) this).vertexX[i_626_] * i_633_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_626_] = i_635_;
				}
				((AbstractModel) this).vertexX[i_626_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_626_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_626_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 3) {
			for (int i_636_ = 0; i_636_ < ((AbstractModel) this).maxVertexUsed; i_636_++) {
				((AbstractModel) this).vertexX[i_636_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_636_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_636_] -= ((AbstractModel) this).anInt10794;
				((AbstractModel) this).vertexX[i_636_] = (((AbstractModel) this).vertexX[i_636_] * i_620_ / 128);
				((AbstractModel) this).vertexY[i_636_] = (((AbstractModel) this).vertexY[i_636_] * i_621_ / 128);
				((AbstractModel) this).vertexZ[i_636_] = (((AbstractModel) this).vertexZ[i_636_] * i_622_ / 128);
				((AbstractModel) this).vertexX[i_636_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_636_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_636_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 5) {
			for (int i_637_ = 0; i_637_ < ((AbstractModel) this).anInt10833; i_637_++) {
				int i_638_ = ((((AbstractModel) this).alpha[i_637_] & 0xff) + i_620_ * 8);
				if (i_638_ < 0)
					i_638_ = 0;
				else if (i_638_ > 255)
					i_638_ = 255;
				((AbstractModel) this).alpha[i_637_] = (byte) i_638_;
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_639_ = 0; i_639_ < ((AbstractModel) this).anInt10851; i_639_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_639_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_639_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
				}
			}
			method10014();
		} else if (i == 7) {
			for (int i_640_ = 0; i_640_ < ((AbstractModel) this).anInt10833; i_640_++) {
				int i_641_ = ((AbstractModel) this).aShortArray10793[i_640_] & 0xffff;
				int i_642_ = i_641_ >> 10 & 0x3f;
				int i_643_ = i_641_ >> 7 & 0x7;
				int i_644_ = i_641_ & 0x7f;
				i_642_ = i_642_ + i_620_ & 0x3f;
				i_643_ += i_621_ / 4;
				if (i_643_ < 0)
					i_643_ = 0;
				else if (i_643_ > 7)
					i_643_ = 7;
				i_644_ += i_622_;
				if (i_644_ < 0)
					i_644_ = 0;
				else if (i_644_ > 127)
					i_644_ = 127;
				((AbstractModel) this).aShortArray10793[i_640_] = (short) (i_642_ << 10 | i_643_ << 7 | i_644_);
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_645_ = 0; i_645_ < ((AbstractModel) this).anInt10851; i_645_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_645_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_645_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		} else if (i == 8) {
			for (int i_646_ = 0; i_646_ < ((AbstractModel) this).anInt10851; i_646_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_646_];
				((Class355) class355).anInt4408 += i_620_;
				((Class355) class355).anInt4407 += i_621_;
			}
		} else if (i == 10) {
			for (int i_647_ = 0; i_647_ < ((AbstractModel) this).anInt10851; i_647_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_647_];
				((Class355) class355).anInt4405 = ((Class355) class355).anInt4405 * i_620_ >> 7;
				((Class355) class355).anInt4409 = ((Class355) class355).anInt4409 * i_621_ >> 7;
			}
		} else if (i == 9) {
			for (int i_648_ = 0; i_648_ < ((AbstractModel) this).anInt10851; i_648_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_648_];
				((Class355) class355).anInt4410 = ((Class355) class355).anInt4410 + i_620_ & 0x3fff;
			}
		}
	}

	void method1370(int i, int[] is, int i_649_, int i_650_, int i_651_, int i_652_, boolean bool) {
		//if (maxVertexUsed == 930)
		//	System.out.println(i +", "+Arrays.toString(is)+", "+i_649_+", "+i_650_+", "+i_651_+", "+i_652_+", "+bool);
		int i_653_ = is.length;
		if (i == 0) {
			i_649_ <<= 4;
			i_650_ <<= 4;
			i_651_ <<= 4;
			int i_654_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_655_ = 0; i_655_ < i_653_; i_655_++) {
				int i_656_ = is[i_655_];
				if (i_656_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_657_ = ((AbstractModel) this).anIntArrayArray10792[i_656_];
					for (int i_658_ = 0; i_658_ < is_657_.length; i_658_++) {
						int i_659_ = is_657_[i_658_];
						((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_659_];
						((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_659_];
						((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_659_];
						i_654_++;
					}
				}
			}
			if (i_654_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_654_ + i_649_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_654_ + i_650_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_654_ + i_651_;
			} else {
				((AbstractModel) this).anInt10862 = i_649_;
				((AbstractModel) this).anInt10863 = i_650_;
				((AbstractModel) this).anInt10794 = i_651_;
			}
		} else if (i == 1) {
			i_649_ <<= 4;
			i_650_ <<= 4;
			i_651_ <<= 4;
			for (int i_660_ = 0; i_660_ < i_653_; i_660_++) {
				int i_661_ = is[i_660_];
				if (i_661_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_662_ = ((AbstractModel) this).anIntArrayArray10792[i_661_];
					for (int i_663_ = 0; i_663_ < is_662_.length; i_663_++) {
						int i_664_ = is_662_[i_663_];
						((AbstractModel) this).vertexX[i_664_] += i_649_;
						((AbstractModel) this).vertexY[i_664_] += i_650_;
						((AbstractModel) this).vertexZ[i_664_] += i_651_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_665_ = 0; i_665_ < i_653_; i_665_++) {
				int i_666_ = is[i_665_];
				if (i_666_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_667_ = ((AbstractModel) this).anIntArrayArray10792[i_666_];
					if ((i_652_ & 0x1) == 0) {
						for (int i_668_ = 0; i_668_ < is_667_.length; i_668_++) {
							int i_669_ = is_667_[i_668_];
							((AbstractModel) this).vertexX[i_669_] -= ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_669_] -= ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_669_] -= ((AbstractModel) this).anInt10794;
							if (i_651_ != 0) {
								int i_670_ = Class325.anIntArray4103[i_651_];
								int i_671_ = Class325.anIntArray4105[i_651_];
								int i_672_ = (((((AbstractModel) this).vertexY[i_669_]) * i_670_ + (((AbstractModel) this).vertexX[i_669_]) * i_671_ + 16383) >> 14);
								((AbstractModel) this).vertexY[i_669_] = ((((AbstractModel) this).vertexY[i_669_]) * i_671_ - (((AbstractModel) this).vertexX[i_669_]) * i_670_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_669_] = i_672_;
							}
							if (i_649_ != 0) {
								int i_673_ = Class325.anIntArray4103[i_649_];
								int i_674_ = Class325.anIntArray4105[i_649_];
								int i_675_ = (((((AbstractModel) this).vertexY[i_669_]) * i_674_ - (((AbstractModel) this).vertexZ[i_669_]) * i_673_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_669_] = ((((AbstractModel) this).vertexY[i_669_]) * i_673_ + (((AbstractModel) this).vertexZ[i_669_]) * i_674_ + 16383) >> 14;
								((AbstractModel) this).vertexY[i_669_] = i_675_;
							}
							if (i_650_ != 0) {
								int i_676_ = Class325.anIntArray4103[i_650_];
								int i_677_ = Class325.anIntArray4105[i_650_];
								int i_678_ = (((((AbstractModel) this).vertexZ[i_669_]) * i_676_ + (((AbstractModel) this).vertexX[i_669_]) * i_677_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_669_] = ((((AbstractModel) this).vertexZ[i_669_]) * i_677_ - (((AbstractModel) this).vertexX[i_669_]) * i_676_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_669_] = i_678_;
							}
							((AbstractModel) this).vertexX[i_669_] += ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_669_] += ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_669_] += ((AbstractModel) this).anInt10794;
						}
					} else {
						for (int i_679_ = 0; i_679_ < is_667_.length; i_679_++) {
							int i_680_ = is_667_[i_679_];
							((AbstractModel) this).vertexX[i_680_] -= ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_680_] -= ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_680_] -= ((AbstractModel) this).anInt10794;
							if (i_649_ != 0) {
								int i_681_ = Class325.anIntArray4103[i_649_];
								int i_682_ = Class325.anIntArray4105[i_649_];
								int i_683_ = (((((AbstractModel) this).vertexY[i_680_]) * i_682_ - (((AbstractModel) this).vertexZ[i_680_]) * i_681_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_680_] = ((((AbstractModel) this).vertexY[i_680_]) * i_681_ + (((AbstractModel) this).vertexZ[i_680_]) * i_682_ + 16383) >> 14;
								((AbstractModel) this).vertexY[i_680_] = i_683_;
							}
							if (i_651_ != 0) {
								int i_684_ = Class325.anIntArray4103[i_651_];
								int i_685_ = Class325.anIntArray4105[i_651_];
								int i_686_ = (((((AbstractModel) this).vertexY[i_680_]) * i_684_ + (((AbstractModel) this).vertexX[i_680_]) * i_685_ + 16383) >> 14);
								((AbstractModel) this).vertexY[i_680_] = ((((AbstractModel) this).vertexY[i_680_]) * i_685_ - (((AbstractModel) this).vertexX[i_680_]) * i_684_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_680_] = i_686_;
							}
							if (i_650_ != 0) {
								int i_687_ = Class325.anIntArray4103[i_650_];
								int i_688_ = Class325.anIntArray4105[i_650_];
								int i_689_ = (((((AbstractModel) this).vertexZ[i_680_]) * i_687_ + (((AbstractModel) this).vertexX[i_680_]) * i_688_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_680_] = ((((AbstractModel) this).vertexZ[i_680_]) * i_688_ - (((AbstractModel) this).vertexX[i_680_]) * i_687_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_680_] = i_689_;
							}
							((AbstractModel) this).vertexX[i_680_] += ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_680_] += ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_680_] += ((AbstractModel) this).anInt10794;
						}
					}
				}
			}
			if (bool) {
				for (int i_690_ = 0; i_690_ < i_653_; i_690_++) {
					int i_691_ = is[i_690_];
					if (i_691_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_692_ = (((AbstractModel) this).anIntArrayArray10792[i_691_]);
						for (int i_693_ = 0; i_693_ < is_692_.length; i_693_++) {
							int i_694_ = is_692_[i_693_];
							int i_695_ = (((AbstractModel) this).sharedFaces[i_694_]);
							int i_696_ = (((AbstractModel) this).sharedFaces[i_694_ + 1]);
							for (int i_697_ = i_695_; (i_697_ < i_696_ && (((AbstractModel) this).aShortArray10853[i_697_]) != 0); i_697_++) {
								int i_698_ = (((((AbstractModel) this).aShortArray10853[i_697_]) & 0xffff) - 1);
								if (i_651_ != 0) {
									int i_699_ = Class325.anIntArray4103[i_651_];
									int i_700_ = Class325.anIntArray4105[i_651_];
									int i_701_ = ((((AbstractModel) this).aShortArray10805[i_698_]) * i_699_ + ((((AbstractModel) this).aShortArray10807[i_698_]) * i_700_) + 16383) >> 14;
									((AbstractModel) this).aShortArray10805[i_698_] = (short) (((((AbstractModel) this).aShortArray10805[i_698_]) * i_700_ - (((AbstractModel) this).aShortArray10807[i_698_]) * i_699_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10807[i_698_] = (short) i_701_;
								}
								if (i_649_ != 0) {
									int i_702_ = Class325.anIntArray4103[i_649_];
									int i_703_ = Class325.anIntArray4105[i_649_];
									int i_704_ = ((((AbstractModel) this).aShortArray10805[i_698_]) * i_703_ - ((((AbstractModel) this).aShortArray10809[i_698_]) * i_702_) + 16383) >> 14;
									((AbstractModel) this).aShortArray10809[i_698_] = (short) (((((AbstractModel) this).aShortArray10805[i_698_]) * i_702_ + (((AbstractModel) this).aShortArray10809[i_698_]) * i_703_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10805[i_698_] = (short) i_704_;
								}
								if (i_650_ != 0) {
									int i_705_ = Class325.anIntArray4103[i_650_];
									int i_706_ = Class325.anIntArray4105[i_650_];
									int i_707_ = ((((AbstractModel) this).aShortArray10809[i_698_]) * i_705_ + ((((AbstractModel) this).aShortArray10807[i_698_]) * i_706_) + 16383) >> 14;
									((AbstractModel) this).aShortArray10809[i_698_] = (short) (((((AbstractModel) this).aShortArray10809[i_698_]) * i_706_ - (((AbstractModel) this).aShortArray10807[i_698_]) * i_705_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10807[i_698_] = (short) i_707_;
								}
							}
						}
					}
				}
				method10017();
			}
		} else if (i == 3) {
			for (int i_708_ = 0; i_708_ < i_653_; i_708_++) {
				int i_709_ = is[i_708_];
				if (i_709_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_710_ = ((AbstractModel) this).anIntArrayArray10792[i_709_];
					for (int i_711_ = 0; i_711_ < is_710_.length; i_711_++) {
						int i_712_ = is_710_[i_711_];
						((AbstractModel) this).vertexX[i_712_] -= ((AbstractModel) this).anInt10862;
						((AbstractModel) this).vertexY[i_712_] -= ((AbstractModel) this).anInt10863;
						((AbstractModel) this).vertexZ[i_712_] -= ((AbstractModel) this).anInt10794;
						((AbstractModel) this).vertexX[i_712_] = (((AbstractModel) this).vertexX[i_712_] * i_649_) >> 7;
						((AbstractModel) this).vertexY[i_712_] = (((AbstractModel) this).vertexY[i_712_] * i_650_) >> 7;
						((AbstractModel) this).vertexZ[i_712_] = (((AbstractModel) this).vertexZ[i_712_] * i_651_) >> 7;
						((AbstractModel) this).vertexX[i_712_] += ((AbstractModel) this).anInt10862;
						((AbstractModel) this).vertexY[i_712_] += ((AbstractModel) this).anInt10863;
						((AbstractModel) this).vertexZ[i_712_] += ((AbstractModel) this).anInt10794;
					}
				}
			}
		} else if (i == 5) {
			//if (maxVertexUsed == 930)
				//System.out.println("method 4738: ALPHA PRE-LOAD: " + Arrays.toString(alpha));
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_713_ = false;
				for (int i_714_ = 0; i_714_ < i_653_; i_714_++) {
					int i_715_ = is[i_714_];
					//if (maxVertexUsed == 930)
						//System.out.println(Arrays.toString(anIntArrayArray10820[i_714_]));
					if (i_715_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_716_ = (((AbstractModel) this).anIntArrayArray10820[i_715_]);
						for (int i_717_ = 0; i_717_ < is_716_.length; i_717_++) {
							int i_718_ = is_716_[i_717_];
							int i_719_ = (((((AbstractModel) this).alpha[i_718_]) & 0xff) + i_649_ * 8);
							if (i_719_ < 0)
								i_719_ = 0;
							else if (i_719_ > 255)
								i_719_ = 255;
							((AbstractModel) this).alpha[i_718_] = (byte) i_719_;
						}
						bool_713_ = bool_713_ | is_716_.length > 0;
					}
				}
					//if (maxVertexUsed == 930)
					//	System.out.println("method 4738: ALPHA POST-LOAD: " + Arrays.toString(alpha));
				if (bool_713_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_720_ = 0; i_720_ < ((AbstractModel) this).anInt10851; i_720_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_720_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_720_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
						}
					}
					method10014();
				}
			}
		} else if (i == 7) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_721_ = false;
				for (int i_722_ = 0; i_722_ < i_653_; i_722_++) {
					int i_723_ = is[i_722_];
					if (i_723_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_724_ = (((AbstractModel) this).anIntArrayArray10820[i_723_]);
						for (int i_725_ = 0; i_725_ < is_724_.length; i_725_++) {
							int i_726_ = is_724_[i_725_];
							int i_727_ = ((((AbstractModel) this).aShortArray10793[i_726_]) & 0xffff);
							int i_728_ = i_727_ >> 10 & 0x3f;
							int i_729_ = i_727_ >> 7 & 0x7;
							int i_730_ = i_727_ & 0x7f;
							i_728_ = i_728_ + i_649_ & 0x3f;
							i_729_ += i_650_ / 4;
							if (i_729_ < 0)
								i_729_ = 0;
							else if (i_729_ > 7)
								i_729_ = 7;
							i_730_ += i_651_;
							if (i_730_ < 0)
								i_730_ = 0;
							else if (i_730_ > 127)
								i_730_ = 127;
							((AbstractModel) this).aShortArray10793[i_726_] = (short) (i_728_ << 10 | i_729_ << 7 | i_730_);
						}
						bool_721_ = bool_721_ | is_724_.length > 0;
					}
				}
				if (bool_721_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_731_ = 0; i_731_ < ((AbstractModel) this).anInt10851; i_731_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_731_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_731_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | (Class460.anIntArray5213[((((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff)]) & 0xffffff);
						}
					}
					method10014();
				}
			}
		} else if (i == 8) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_732_ = 0; i_732_ < i_653_; i_732_++) {
					int i_733_ = is[i_732_];
					if (i_733_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_734_ = (((AbstractModel) this).anIntArrayArray10854[i_733_]);
						for (int i_735_ = 0; i_735_ < is_734_.length; i_735_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_734_[i_735_]]);
							((Class355) class355).anInt4408 += i_649_;
							((Class355) class355).anInt4407 += i_650_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_736_ = 0; i_736_ < i_653_; i_736_++) {
					int i_737_ = is[i_736_];
					if (i_737_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_738_ = (((AbstractModel) this).anIntArrayArray10854[i_737_]);
						for (int i_739_ = 0; i_739_ < is_738_.length; i_739_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_738_[i_739_]]);
							((Class355) class355).anInt4405 = (((Class355) class355).anInt4405 * i_649_ >> 7);
							((Class355) class355).anInt4409 = (((Class355) class355).anInt4409 * i_650_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_740_ = 0; i_740_ < i_653_; i_740_++) {
					int i_741_ = is[i_740_];
					if (i_741_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_742_ = (((AbstractModel) this).anIntArrayArray10854[i_741_]);
						for (int i_743_ = 0; i_743_ < is_742_.length; i_743_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_742_[i_743_]]);
							((Class355) class355).anInt4410 = (((Class355) class355).anInt4410 + i_649_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method1373() {
		for (int i = 0; i < ((AbstractModel) this).anInt10797; i++) {
			((AbstractModel) this).vertexX[i] = ((AbstractModel) this).vertexX[i] + 7 >> 4;
			((AbstractModel) this).vertexY[i] = ((AbstractModel) this).vertexY[i] + 7 >> 4;
			((AbstractModel) this).vertexZ[i] = ((AbstractModel) this).vertexZ[i] + 7 >> 4;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public Class84[] method1466() {
		return ((AbstractModel) this).aClass84Array10841;
	}

	public void method1446(Class261 class261) {
		Class250 class250 = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
		class250.method3446(class261);
		if (((AbstractModel) this).aClass84Array10841 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass84Array10841.length; i++) {
				Class84 class84 = ((AbstractModel) this).aClass84Array10841[i];
				Class84 class84_744_ = class84;
				if (class84.aClass84_1092 != null)
					class84_744_ = class84.aClass84_1092;
				class84_744_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_744_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_744_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_744_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_744_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_744_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_744_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_744_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_744_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((AbstractModel) this).aClass175Array10850 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass175Array10850.length; i++) {
				Class175 class175 = ((AbstractModel) this).aClass175Array10850[i];
				Class175 class175_745_ = class175;
				if (class175.aClass175_2091 != null)
					class175_745_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_745_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_745_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_745_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	public Class84[] method1394() {
		return ((AbstractModel) this).aClass84Array10841;
	}

	public void method1426(Class261 class261) {
		Class250 class250 = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
		class250.method3446(class261);
		if (((AbstractModel) this).aClass84Array10841 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass84Array10841.length; i++) {
				Class84 class84 = ((AbstractModel) this).aClass84Array10841[i];
				Class84 class84_746_ = class84;
				if (class84.aClass84_1092 != null)
					class84_746_ = class84.aClass84_1092;
				class84_746_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_746_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_746_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_746_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_746_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_746_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_746_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_746_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_746_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((AbstractModel) this).aClass175Array10850 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass175Array10850.length; i++) {
				Class175 class175 = ((AbstractModel) this).aClass175Array10850[i];
				Class175 class175_747_ = class175;
				if (class175.aClass175_2091 != null)
					class175_747_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_747_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_747_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_747_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	void method10017() {
		if ((((AbstractModel) this).anInt10836 & 0x37) != 0) {
			if (((AbstractModel) this).aClass356_10827 != null)
				((Class356) ((AbstractModel) this).aClass356_10827).aBool4413 = false;
		} else if (((AbstractModel) this).aClass356_10826 != null)
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4413 = false;
	}

	boolean method10018(int i, int i_748_, int i_749_, int i_750_, Class261 class261, boolean bool, int i_751_) {
		Class250 class250 = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10495);
		boolean bool_752_ = false;
		float f = 3.4028235E38F;
		float f_753_ = -3.4028235E38F;
		float f_754_ = 3.4028235E38F;
		float f_755_ = -3.4028235E38F;
		if (!((AbstractModel) this).aBool10835)
			method10016();
		int i_756_ = ((((AbstractModel) this).anInt10790 - ((AbstractModel) this).anInt10843) >> 1);
		int i_757_ = ((((AbstractModel) this).anInt10837 - ((AbstractModel) this).anInt10816) >> 1);
		int i_758_ = ((((AbstractModel) this).anInt10801 - ((AbstractModel) this).anInt10840) >> 1);
		int i_759_ = ((AbstractModel) this).anInt10843 + i_756_;
		int i_760_ = ((AbstractModel) this).anInt10816 + i_757_;
		int i_761_ = ((AbstractModel) this).anInt10840 + i_758_;
		int i_762_ = i_759_ - (i_756_ << i_751_);
		int i_763_ = i_760_ - (i_757_ << i_751_);
		int i_764_ = i_761_ - (i_758_ << i_751_);
		int i_765_ = i_759_ + (i_756_ << i_751_);
		int i_766_ = i_760_ + (i_757_ << i_751_);
		int i_767_ = i_761_ + (i_758_ << i_751_);
		((AbstractModel) this).anIntArray10859[0] = i_762_;
		((AbstractModel) this).anIntArray10860[0] = i_763_;
		((AbstractModel) this).anIntArray10798[0] = i_764_;
		((AbstractModel) this).anIntArray10859[1] = i_765_;
		((AbstractModel) this).anIntArray10860[1] = i_763_;
		((AbstractModel) this).anIntArray10798[1] = i_764_;
		((AbstractModel) this).anIntArray10859[2] = i_762_;
		((AbstractModel) this).anIntArray10860[2] = i_766_;
		((AbstractModel) this).anIntArray10798[2] = i_764_;
		((AbstractModel) this).anIntArray10859[3] = i_765_;
		((AbstractModel) this).anIntArray10860[3] = i_766_;
		((AbstractModel) this).anIntArray10798[3] = i_764_;
		((AbstractModel) this).anIntArray10859[4] = i_762_;
		((AbstractModel) this).anIntArray10860[4] = i_763_;
		((AbstractModel) this).anIntArray10798[4] = i_767_;
		((AbstractModel) this).anIntArray10859[5] = i_765_;
		((AbstractModel) this).anIntArray10860[5] = i_763_;
		((AbstractModel) this).anIntArray10798[5] = i_767_;
		((AbstractModel) this).anIntArray10859[6] = i_762_;
		((AbstractModel) this).anIntArray10860[6] = i_766_;
		((AbstractModel) this).anIntArray10798[6] = i_767_;
		((AbstractModel) this).anIntArray10859[7] = i_765_;
		((AbstractModel) this).anIntArray10860[7] = i_766_;
		((AbstractModel) this).anIntArray10798[7] = i_767_;
		for (int i_768_ = 0; i_768_ < 8; i_768_++) {
			float f_769_ = (float) ((AbstractModel) this).anIntArray10859[i_768_];
			float f_770_ = (float) ((AbstractModel) this).anIntArray10860[i_768_];
			float f_771_ = (float) ((AbstractModel) this).anIntArray10798[i_768_];
			float f_772_ = (class250.aFloatArray2728[2] * f_769_ + class250.aFloatArray2728[6] * f_770_ + class250.aFloatArray2728[10] * f_771_ + class250.aFloatArray2728[14]);
			float f_773_ = (class250.aFloatArray2728[3] * f_769_ + class250.aFloatArray2728[7] * f_770_ + class250.aFloatArray2728[11] * f_771_ + class250.aFloatArray2728[15]);
			if (f_772_ >= -f_773_) {
				float f_774_ = (class250.aFloatArray2728[0] * f_769_ + class250.aFloatArray2728[4] * f_770_ + class250.aFloatArray2728[8] * f_771_ + class250.aFloatArray2728[12]);
				float f_775_ = (class250.aFloatArray2728[1] * f_769_ + class250.aFloatArray2728[5] * f_770_ + class250.aFloatArray2728[9] * f_771_ + class250.aFloatArray2728[13]);
				float f_776_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_774_ / f_773_));
				float f_777_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_775_ / f_773_));
				if (f_776_ < f)
					f = f_776_;
				if (f_776_ > f_753_)
					f_753_ = f_776_;
				if (f_777_ < f_754_)
					f_754_ = f_777_;
				if (f_777_ > f_755_)
					f_755_ = f_777_;
				bool_752_ = true;
			}
		}
		int i_778_ = i + i_749_;
		int i_779_ = i_748_ + i_750_;
		if (bool_752_ && (float) i_778_ > f && (float) i < f_753_ && (float) i_779_ > f_754_ && (float) i_748_ < f_755_) {
			if (bool)
				return true;
			if (((AbstractModel) this).shadowX.length < ((AbstractModel) this).uniqueVertices) {
				((AbstractModel) this).shadowX = new int[((AbstractModel) this).uniqueVertices];
				((AbstractModel) this).shadowY = new int[((AbstractModel) this).uniqueVertices];
			}
			for (int i_780_ = 0; i_780_ < ((AbstractModel) this).maxVertexUsed; i_780_++) {
				float f_781_ = (float) ((AbstractModel) this).vertexX[i_780_];
				float f_782_ = (float) ((AbstractModel) this).vertexY[i_780_];
				float f_783_ = (float) ((AbstractModel) this).vertexZ[i_780_];
				float f_784_ = (class250.aFloatArray2728[2] * f_781_ + class250.aFloatArray2728[6] * f_782_ + class250.aFloatArray2728[10] * f_783_ + class250.aFloatArray2728[14]);
				float f_785_ = (class250.aFloatArray2728[3] * f_781_ + class250.aFloatArray2728[7] * f_782_ + class250.aFloatArray2728[11] * f_783_ + class250.aFloatArray2728[15]);
				if (f_784_ >= -f_785_) {
					float f_786_ = (class250.aFloatArray2728[0] * f_781_ + class250.aFloatArray2728[4] * f_782_ + class250.aFloatArray2728[8] * f_783_ + class250.aFloatArray2728[12]);
					float f_787_ = (class250.aFloatArray2728[1] * f_781_ + class250.aFloatArray2728[5] * f_782_ + class250.aFloatArray2728[9] * f_783_ + class250.aFloatArray2728[13]);
					int i_788_ = ((AbstractModel) this).sharedFaces[i_780_];
					int i_789_ = ((AbstractModel) this).sharedFaces[i_780_ + 1];
					for (int i_790_ = i_788_; (i_790_ < i_789_ && (((AbstractModel) this).aShortArray10853[i_790_] != 0)); i_790_++) {
						int i_791_ = ((((AbstractModel) this).aShortArray10853[i_790_] & 0xffff) - 1);
						((AbstractModel) this).shadowX[i_791_] = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_786_ / f_785_));
						((AbstractModel) this).shadowY[i_791_] = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_787_ / f_785_));
					}
				} else {
					int i_792_ = ((AbstractModel) this).sharedFaces[i_780_];
					int i_793_ = ((AbstractModel) this).sharedFaces[i_780_ + 1];
					for (int i_794_ = i_792_; (i_794_ < i_793_ && (((AbstractModel) this).aShortArray10853[i_794_] != 0)); i_794_++) {
						int i_795_ = ((((AbstractModel) this).aShortArray10853[i_794_] & 0xffff) - 1);
						((AbstractModel) this).shadowX[i_795_] = -999999;
					}
				}
			}
			for (int i_796_ = 0; i_796_ < ((AbstractModel) this).anInt10833; i_796_++) {
				if ((((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10818[i_796_] & 0xffff)]) != -999999 && (((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10819[i_796_] & 0xffff)]) != -999999 && (((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10861[i_796_] & 0xffff)]) != -999999 && method10019(i, i_748_, i_778_, i_779_, (((AbstractModel) this).shadowY[(((AbstractModel) this).aShortArray10818[i_796_]) & 0xffff]), (((AbstractModel) this).shadowY[(((AbstractModel) this).aShortArray10819[i_796_]) & 0xffff]), (((AbstractModel) this).shadowY[(((AbstractModel) this).aShortArray10861[i_796_]) & 0xffff]), (((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10818[i_796_]) & 0xffff]), (((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10819[i_796_]) & 0xffff]), (((AbstractModel) this).shadowX[(((AbstractModel) this).aShortArray10861[i_796_]) & 0xffff])))
					return true;
			}
		}
		return false;
	}

	boolean method10019(int i, int i_797_, int i_798_, int i_799_, int i_800_, int i_801_, int i_802_, int i_803_, int i_804_, int i_805_) {
		if (i_799_ < i_800_ && i_799_ < i_801_ && i_799_ < i_802_)
			return false;
		if (i_797_ > i_800_ && i_797_ > i_801_ && i_797_ > i_802_)
			return false;
		if (i_798_ < i_803_ && i_798_ < i_804_ && i_798_ < i_805_)
			return false;
		if (i > i_803_ && i > i_804_ && i > i_805_)
			return false;
		return true;
	}

	public Class572_Sub12_Sub18 method1398(Class572_Sub12_Sub18 class572_sub12_sub18) {
		if (((AbstractModel) this).uniqueVertices == 0)
			return null;
		if (!((AbstractModel) this).aBool10835)
			method10016();
		int i;
		int i_806_;
		if ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionX) > 0) {
			i = ((((AbstractModel) this).anInt10843 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_806_ = ((((AbstractModel) this).anInt10790 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		} else {
			i = ((((AbstractModel) this).anInt10843 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_806_ = ((((AbstractModel) this).anInt10790 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		}
		int i_807_;
		int i_808_;
		if ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionY) > 0) {
			i_807_ = ((((AbstractModel) this).anInt10840 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_808_ = ((((AbstractModel) this).anInt10801 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		} else {
			i_807_ = ((((AbstractModel) this).anInt10840 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_808_ = ((((AbstractModel) this).anInt10801 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		}
		int i_809_ = i_806_ - i + 1;
		int i_810_ = i_808_ - i_807_ + 1;
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_811_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_809_, i_810_)) {
			class572_sub12_sub18_sub2_811_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_811_.method10652();
		} else
			class572_sub12_sub18_sub2_811_ = new NativeShadow((((AbstractModel) this).aClass106_Sub3_10825), i_809_, i_810_);
		class572_sub12_sub18_sub2_811_.method10650(i, i_807_, i_806_, i_808_);
		fillShadow(class572_sub12_sub18_sub2_811_);
		return class572_sub12_sub18_sub2_811_;
	}

	void fillShadow(NativeShadow shadow) {
		if (((AbstractModel) this).shadowX.length < ((AbstractModel) this).uniqueVertices) {
			((AbstractModel) this).shadowX = new int[((AbstractModel) this).uniqueVertices];
			((AbstractModel) this).shadowY = new int[((AbstractModel) this).uniqueVertices];
		}
		//System.out.println(uniqueVertices +", "+maxVertexUsed + ", "+ alpha.length+", "+ Arrays.toString(alpha));
		for (int i = 0; i < ((AbstractModel) this).maxVertexUsed; i++) {
			int i_812_ = (((((AbstractModel) this).vertexX[i] - ((((AbstractModel) this).vertexY[i] * (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionX)) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale) - (((NativeShadow) shadow).x));
			int i_813_ = (((((AbstractModel) this).vertexZ[i] - ((((AbstractModel) this).vertexY[i] * (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionY)) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale) - (((NativeShadow) shadow).y));
			int i_814_ = ((AbstractModel) this).sharedFaces[i];
			int i_815_ = ((AbstractModel) this).sharedFaces[i + 1];
			for (int i_816_ = i_814_; (i_816_ < i_815_ && ((AbstractModel) this).aShortArray10853[i_816_] != 0); i_816_++) {
				int i_817_ = ((((AbstractModel) this).aShortArray10853[i_816_] & 0xffff) - 1);
				((AbstractModel) this).shadowX[i_817_] = i_812_;
				((AbstractModel) this).shadowY[i_817_] = i_813_;
			}
		}
		if (maxVertexUsed == 930)
			System.out.println(Arrays.toString(alpha));
		for (int i = 0; i < ((AbstractModel) this).anInt10815; i++) {
			if (((AbstractModel) this).alpha == null || ((AbstractModel) this).alpha[i] <= 128) {
				int i_818_ = ((AbstractModel) this).aShortArray10818[i] & 0xffff;
				int i_819_ = ((AbstractModel) this).aShortArray10819[i] & 0xffff;
				int i_820_ = ((AbstractModel) this).aShortArray10861[i] & 0xffff;
				int i_821_ = ((AbstractModel) this).shadowX[i_818_];
				int i_822_ = ((AbstractModel) this).shadowX[i_819_];
				int i_823_ = ((AbstractModel) this).shadowX[i_820_];
				int i_824_ = ((AbstractModel) this).shadowY[i_818_];
				int i_825_ = ((AbstractModel) this).shadowY[i_819_];
				int i_826_ = ((AbstractModel) this).shadowY[i_820_];
				if (((i_821_ - i_822_) * (i_825_ - i_826_) - (i_825_ - i_824_) * (i_823_ - i_822_)) > 0)
					shadow.fill(i_824_, i_825_, i_826_, i_821_, i_822_, i_823_);
			}
		}
	}

	public void method1375(Class261 class261, Class90 class90, int i) {
		if (aClass350_10822 != null)
			aClass350_10822.method4371();
		if (class90 != null)
			class90.aBool1232 = false;
		if (((AbstractModel) this).uniqueVertices != 0) {
			Class250 class250 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10409);
			Class250 class250_827_ = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
			Class250 class250_828_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400);
			class250_827_.method3446(class261);
			class250_828_.method3442(class250_827_);
			class250_828_.method3445(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10495);
			if (!((AbstractModel) this).aBool10835)
				method10016();
			float[] fs = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArray10402);
			class250_827_.method3449(0.0F, (float) ((AbstractModel) this).anInt10816, 0.0F, fs);
			float f = fs[0];
			float f_829_ = fs[1];
			float f_830_ = fs[2];
			class250_827_.method3449(0.0F, (float) ((AbstractModel) this).anInt10837, 0.0F, fs);
			float f_831_ = fs[0];
			float f_832_ = fs[1];
			float f_833_ = fs[2];
			for (int i_834_ = 0; i_834_ < 6; i_834_++) {
				float[] fs_835_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArrayArray10405[i_834_]);
				float f_836_ = (fs_835_[0] * f + fs_835_[1] * f_829_ + fs_835_[2] * f_830_ + fs_835_[3] + (float) ((AbstractModel) this).anInt10834);
				float f_837_ = (fs_835_[0] * f_831_ + fs_835_[1] * f_832_ + fs_835_[2] * f_833_ + fs_835_[3] + (float) ((AbstractModel) this).anInt10834);
				if (f_836_ < 0.0F && f_837_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_838_ = true;
				int i_839_ = ((((AbstractModel) this).anInt10843 + ((AbstractModel) this).anInt10790) >> 1);
				int i_840_ = ((((AbstractModel) this).anInt10840 + ((AbstractModel) this).anInt10801) >> 1);
				int i_841_ = i_839_;
				int i_842_ = ((AbstractModel) this).anInt10816;
				int i_843_ = i_840_;
				float f_844_ = (class250_828_.aFloatArray2728[0] * (float) i_841_ + class250_828_.aFloatArray2728[4] * (float) i_842_ + class250_828_.aFloatArray2728[8] * (float) i_843_ + class250_828_.aFloatArray2728[12]);
				float f_845_ = (class250_828_.aFloatArray2728[1] * (float) i_841_ + class250_828_.aFloatArray2728[5] * (float) i_842_ + class250_828_.aFloatArray2728[9] * (float) i_843_ + class250_828_.aFloatArray2728[13]);
				float f_846_ = (class250_828_.aFloatArray2728[2] * (float) i_841_ + class250_828_.aFloatArray2728[6] * (float) i_842_ + class250_828_.aFloatArray2728[10] * (float) i_843_ + class250_828_.aFloatArray2728[14]);
				float f_847_ = (class250_828_.aFloatArray2728[3] * (float) i_841_ + class250_828_.aFloatArray2728[7] * (float) i_842_ + class250_828_.aFloatArray2728[11] * (float) i_843_ + class250_828_.aFloatArray2728[15]);
				if (f_846_ >= -f_847_) {
					class90.anInt1230 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_844_ / f_847_);
					class90.anInt1231 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_845_ / f_847_);
				} else
					bool = true;
				i_841_ = i_839_;
				i_842_ = ((AbstractModel) this).anInt10837;
				i_843_ = i_840_;
				float f_848_ = (class250_828_.aFloatArray2728[0] * (float) i_841_ + class250_828_.aFloatArray2728[4] * (float) i_842_ + class250_828_.aFloatArray2728[8] * (float) i_843_ + class250_828_.aFloatArray2728[12]);
				float f_849_ = (class250_828_.aFloatArray2728[1] * (float) i_841_ + class250_828_.aFloatArray2728[5] * (float) i_842_ + class250_828_.aFloatArray2728[9] * (float) i_843_ + class250_828_.aFloatArray2728[13]);
				float f_850_ = (class250_828_.aFloatArray2728[2] * (float) i_841_ + class250_828_.aFloatArray2728[6] * (float) i_842_ + class250_828_.aFloatArray2728[10] * (float) i_843_ + class250_828_.aFloatArray2728[14]);
				float f_851_ = (class250_828_.aFloatArray2728[3] * (float) i_841_ + class250_828_.aFloatArray2728[7] * (float) i_842_ + class250_828_.aFloatArray2728[11] * (float) i_843_ + class250_828_.aFloatArray2728[15]);
				if (f_850_ >= -f_851_) {
					class90.anInt1234 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_848_ / f_851_);
					class90.anInt1233 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_849_ / f_851_);
				} else
					bool = true;
				if (bool) {
					if (f_846_ < -f_847_ && f_850_ < -f_851_)
						bool_838_ = false;
					else if (f_846_ < -f_847_) {
						float f_852_ = (f_846_ + f_847_) / (f_850_ + f_851_) - 1.0F;
						float f_853_ = f_844_ + f_852_ * (f_848_ - f_844_);
						float f_854_ = f_845_ + f_852_ * (f_849_ - f_845_);
						float f_855_ = f_847_ + f_852_ * (f_851_ - f_847_);
						class90.anInt1230 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_853_ / f_855_));
						class90.anInt1231 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_854_ / f_855_));
					} else if (f_850_ < -f_851_) {
						float f_856_ = (f_850_ + f_851_) / (f_846_ + f_847_) - 1.0F;
						float f_857_ = f_848_ + f_856_ * (f_844_ - f_848_);
						float f_858_ = f_849_ + f_856_ * (f_845_ - f_849_);
						float f_859_ = f_851_ + f_856_ * (f_847_ - f_851_);
						class90.anInt1234 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_857_ / f_859_));
						class90.anInt1233 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_858_ / f_859_));
					}
				}
				if (bool_838_) {
					if (f_846_ / f_847_ > f_850_ / f_851_) {
						float f_860_ = (f_844_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_861_ = (f_847_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1230 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_860_ / f_861_));
					} else {
						float f_862_ = (f_848_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_863_ = (f_851_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1234 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_862_ / f_863_));
					}
					class90.aBool1232 = true;
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9686(i);
			method10021(class261);
			((AbstractModel) this).aClass106_Sub3_10825.method9686(0);
			class250_827_.method3446(class261);
			class250_827_.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
			method10025(class250_827_);
		}
	}

	void method10021(Class261 class261) {
		if (((AbstractModel) this).anInt10815 != 0 && (method10027() && method10029())) {
			if (aClass350_10822 == null) {
				/* empty */
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9685();
			((AbstractModel) this).aClass106_Sub3_10825.method9816();
			Class340 class340 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass340_10480);
			((AbstractModel) this).aClass106_Sub3_10825.method9674(0, (((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4412));
			((AbstractModel) this).aClass106_Sub3_10825.method9674(1, (((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4412));
			((AbstractModel) this).aClass106_Sub3_10825.method9674(2, (((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4412));
			((AbstractModel) this).aClass106_Sub3_10825.method9693(((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4415);
			((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3446(class261);
			class340.method4279(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399);
			class340.aClass250_4332.method3444();
			if (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aBool10494) {
				Class86 class86 = ((AbstractModel) this).aClass106_Sub3_10825.method9658();
				class340.aClass209_4336.method3040(0.0F, 1.0F, 0.0F, (float) -(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).anInt10507));
				class340.aClass209_4336.method3043(3.0F / (float) (class86.anInt1190 * -1018540369));
				class340.aClass240_4337.method3268(((float) (class86.anInt1193 * 526464983 >> 16 & 0xff) / 255.0F), ((float) (class86.anInt1193 * 526464983 >> 8 & 0xff) / 255.0F), ((float) (class86.anInt1193 * 526464983 >> 0 & 0xff) / 255.0F));
			} else {
				class340.aClass209_4336.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4337.method3268(0.0F, 0.0F, 0.0F);
			}
			if (((AbstractModel) this).aClass106_Sub3_10825.anInt10448 > 0) {
				class340.aClass209_4338.method3040(0.0F, 0.0F, 1.0F, -(((AbstractModel) this).aClass106_Sub3_10825.aFloat10503));
				class340.aClass240_4339.method3268((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 16 & 0xff) / 255.0F, (float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 8 & 0xff) / 255.0F, (float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 0 & 0xff) / 255.0F);
				((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3446(class261);
				((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3485();
				class340.aClass209_4336.method3045(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399);
				((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3446(class261);
				((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
				((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399.method3485();
				class340.aClass209_4338.method3045(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399);
				class340.aClass209_4338.method3043(1.0F / ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10504) - (((AbstractModel) this).aClass106_Sub3_10825.aFloat10503)));
			} else {
				class340.aClass209_4338.method3040(0.0F, 0.0F, 0.0F, 0.0F);
				class340.aClass240_4339.method3268(0.0F, 0.0F, 0.0F);
			}
			if ((((AbstractModel) this).anInt10836 & 0x37) == 0) {
				((AbstractModel) this).aClass106_Sub3_10825.method9673(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass362_10532);
				if (((AbstractModel) this).aClass106_Sub3_10825.aBool10488)
					((AbstractModel) this).aClass106_Sub3_10825.method9596(false);
				for (int i = 0; i < ((AbstractModel) this).anIntArray10845.length; i++) {
					int i_864_ = ((AbstractModel) this).anIntArray10844[i];
					int i_865_ = ((AbstractModel) this).anIntArray10844[i + 1];
					int i_866_ = ((AbstractModel) this).aShortArray10821[i_864_];
					boolean bool = false;
					byte i_867_ = 0;
					if (i_866_ != -1) {
						MaterialInformation class101 = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(i_866_ & 0xffff, -102374189);
						class340.anInterface43_4342 = ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4444(class101);
						bool = !Class649.method7677(class101.effectId, 961667671);
						class340.aClass250_4332.aFloatArray2728[12] = ((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10512) % 128000) / 1000.0F * (float) class101.textureSpeedU / 64.0F % 1.0F);
						class340.aClass250_4332.aFloatArray2728[13] = ((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10512) % 128000) / 1000.0F * (float) class101.textureSpeedV / 64.0F % 1.0F);
						if (class101.aClass511_1342 == Class511.aClass511_5696)
							i_867_ = class101.aByte1343;
					} else {
						class340.anInterface43_4342 = (((AbstractModel) this).aClass106_Sub3_10825.anInterface43_10474);
						float[] fs = class340.aClass250_4332.aFloatArray2728;
						class340.aClass250_4332.aFloatArray2728[13] = 0.0F;
						fs[12] = 0.0F;
					}
					((AbstractModel) this).aClass106_Sub3_10825.method9662(i_867_);
					class340.anInt4330 = ((AbstractModel) this).anIntArray10845[i];
					class340.anInt4346 = ((AbstractModel) this).anIntArray10846[i];
					class340.anInt4347 = i_864_ * 3;
					class340.anInt4348 = i_865_ - i_864_;
					class340.method4263(bool);
				}
			} else {
				((AbstractModel) this).aClass106_Sub3_10825.method9674(3, (((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4412));
				((AbstractModel) this).aClass106_Sub3_10825.method9673(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass362_10533);
				Class261 class261_868_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass261_10443);
				class261_868_.method3568(class261);
				class261_868_.method3600();
				int i = 0;
				if (((AbstractModel) this).aClass106_Sub3_10825.aBool10488)
					((AbstractModel) this).aClass106_Sub3_10825.method9596(true);
				else {
					class340.aClass240_4340.method3268((((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[0]), (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[1]), (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[2]));
					class340.aClass240_4340.method3290(class261_868_);
					class340.aClass240_4341.method3268(((((AbstractModel) this).aClass106_Sub3_10825.aFloat10455) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10451)), ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10455) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10439)), ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10455) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10453)));
					class340.aClass240_4334.method3268((-(((AbstractModel) this).aClass106_Sub3_10825.aFloat10456) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10451)), (-(((AbstractModel) this).aClass106_Sub3_10825.aFloat10456) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10439)), (-(((AbstractModel) this).aClass106_Sub3_10825.aFloat10456) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10453)));
					class340.aClass240_4326.method3268(((((AbstractModel) this).aClass106_Sub3_10825.aFloat10458) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10451)), ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10458) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10439)), ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10458) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10453)));
					if (((AbstractModel) this).aClass106_Sub3_10825.anInt10388 > 0) {
						i = (((AbstractModel) this).aClass106_Sub3_10825.anInt10388);
						Class240 class240 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass240_10401);
						for (int i_869_ = 0; i_869_ < i; i_869_++) {
							Class572_Sub36 class572_sub36 = (((AbstractModel) this).aClass106_Sub3_10825.aClass572_Sub36Array10457[i_869_]);
							int i_870_ = class572_sub36.method8723(-1288611141);
							class240.method3269(class572_sub36.aClass240_9357);
							class240.method3289(class261_868_);
							class340.aFloatArray4329[i_869_ * 4 + 0] = class240.aFloat2653;
							class340.aFloatArray4329[i_869_ * 4 + 1] = class240.aFloat2656;
							class340.aFloatArray4329[i_869_ * 4 + 2] = class240.aFloat2657;
							class340.aFloatArray4329[i_869_ * 4 + 3] = (1.0F / (float) (class572_sub36.method8752((byte) 75) * class572_sub36.method8752((byte) 61)));
							float f = (class572_sub36.method8724((byte) 81) / 255.0F);
							class340.aFloatArray4328[i_869_ * 4 + 0] = (float) (i_870_ >> 16 & 0xff) * f;
							class340.aFloatArray4328[i_869_ * 4 + 1] = (float) (i_870_ >> 8 & 0xff) * f;
							class340.aFloatArray4328[i_869_ * 4 + 2] = (float) (i_870_ & 0xff) * f;
							class340.aFloatArray4328[i_869_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_871_ = 0; i_871_ < ((AbstractModel) this).anIntArray10845.length; i_871_++) {
					int i_872_ = ((AbstractModel) this).anIntArray10844[i_871_];
					int i_873_ = ((AbstractModel) this).anIntArray10844[i_871_ + 1];
					int i_874_ = ((AbstractModel) this).aShortArray10821[i_872_];
					byte i_875_ = 11;
					MaterialInformation class101 = null;
					byte i_876_ = 0;
					if (i_874_ != -1) {
						class101 = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(i_874_ & 0xffff, -480026221);
						class340.anInterface43_4342 = ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4444(class101);
						i_875_ = class101.effectId;
						class340.method4261(class101.effectParam1);
						class340.aClass250_4332.aFloatArray2728[12] = ((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10512) % 128000) / 1000.0F * (float) class101.textureSpeedU / 64.0F % 1.0F);
						class340.aClass250_4332.aFloatArray2728[13] = ((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10512) % 128000) / 1000.0F * (float) class101.textureSpeedV / 64.0F % 1.0F);
						if (class101.aClass511_1342 == Class511.aClass511_5696)
							i_876_ = class101.aByte1343;
					} else {
						class340.anInterface43_4342 = (((AbstractModel) this).aClass106_Sub3_10825.anInterface43_10474);
						float[] fs = class340.aClass250_4332.aFloatArray2728;
						class340.aClass250_4332.aFloatArray2728[13] = 0.0F;
						fs[12] = 0.0F;
					}
					((AbstractModel) this).aClass106_Sub3_10825.method9662(i_876_);
					class340.anInt4330 = ((AbstractModel) this).anIntArray10845[i_871_];
					class340.anInt4346 = ((AbstractModel) this).anIntArray10846[i_871_];
					class340.anInt4347 = i_872_ * 3;
					class340.anInt4348 = i_873_ - i_872_;
					switch (i_875_) {
						default:
							class340.method4264(i);
							break;
						case 7:
							class340.aClass240_4344.method3268((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[14]));
							class340.aClass240_4344.method3289(class261_868_);
							class340.aClass250_4333.method3446(class261);
							class340.anInterface33_4331 = ((AbstractModel) this).aClass106_Sub3_10825.method9600();
							class340.method4272(i);
							break;
						case 6:
							class340.method4263(!Class649.method7677(i_875_, 1273310618));
							break;
						case 1:
							class340.aClass240_4344.method3268((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[12]), (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[13]), (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10393.aFloatArray2728[14]));
							class340.aClass240_4344.method3289(class261_868_);
							class340.method4265(i);
							break;
						case 5:
							if (!((AbstractModel) this).aClass106_Sub3_10825.aBool10488) {
								Class349_Sub1_Sub2 class349_sub1_sub2 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass349_Sub1_Sub2_10517);
								class349_sub1_sub2.method10170(class101.effectParam1, (class101.anInt1361 * -1441531203), -1835695769);
								class349_sub1_sub2.aClass250_11213.method3446(class261);
								class349_sub1_sub2.aClass250_11218.method3446(class261);
								class349_sub1_sub2.aClass250_11218.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10414);
								class349_sub1_sub2.anInt11226 = (((AbstractModel) this).anIntArray10845[i_871_]) * -526425343;
								class349_sub1_sub2.anInt11227 = (((AbstractModel) this).anIntArray10846[i_871_]) * 1643581311;
								class349_sub1_sub2.anInt11228 = i_872_ * 1952471113;
								class349_sub1_sub2.anInt11229 = (i_873_ - i_872_) * -358345541;
								class349_sub1_sub2.method10169(-1599710629);
							} else
								class340.method4264(i);
					}
				}
			}
			method10012();
		}
	}

	public boolean method1478() {
		if (((AbstractModel) this).aShortArray10821 == null)
			return true;
		for (int i = 0; i < ((AbstractModel) this).aShortArray10821.length; i++) {
			if (((AbstractModel) this).aShortArray10821[i] != -1 && !(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4448((((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(((AbstractModel) this).aShortArray10821[i], 1481415892)), -1)))
				return false;
		}
		return true;
	}

	public int method1451() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10834;
	}

	public void method1357(int i) {
		int i_877_ = Class325.anIntArray4103[i];
		int i_878_ = Class325.anIntArray4105[i];
		for (int i_879_ = 0; i_879_ < ((AbstractModel) this).maxVertexUsed; i_879_++) {
			int i_880_ = ((((AbstractModel) this).vertexY[i_879_] * i_878_ - ((AbstractModel) this).vertexZ[i_879_] * i_877_) >> 14);
			((AbstractModel) this).vertexZ[i_879_] = ((((AbstractModel) this).vertexY[i_879_] * i_877_ + ((AbstractModel) this).vertexZ[i_879_] * i_878_) >> 14);
			((AbstractModel) this).vertexY[i_879_] = i_880_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public int method1460() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10840;
	}

	int method10022(int i, short i_881_, int i_882_) {
		int i_883_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).anIntArray10466[method10023(i, i_882_)]);
		if (i_881_ != -1) {
			MaterialInformation class101 = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(i_881_ & 0xffff, 2031126548);
			int i_884_ = class101.aByte1366 & 0xff;
			if (i_884_ != 0) {
				int i_885_ = 131586 * i_882_;
				if (i_882_ < 0)
					i_885_ = 0;
				else if (i_882_ > 127)
					i_885_ = 16777215;
				else
					i_885_ = 131586 * i_882_;
				if (i_884_ == 256)
					i_883_ = i_885_;
				else {
					int i_886_ = i_884_;
					int i_887_ = 256 - i_884_;
					i_883_ = ((((i_885_ & 0xff00ff) * i_886_ + (i_883_ & 0xff00ff) * i_887_) & ~0xff00ff) + (((i_885_ & 0xff00) * i_886_ + (i_883_ & 0xff00) * i_887_) & 0xff0000)) >> 8;
				}
			}
			int i_888_ = class101.aByte1368 & 0xff;
			if (i_888_ != 0) {
				i_888_ += 256;
				int i_889_ = ((i_883_ & 0xff0000) >> 16) * i_888_;
				if (i_889_ > 65535)
					i_889_ = 65535;
				int i_890_ = ((i_883_ & 0xff00) >> 8) * i_888_;
				if (i_890_ > 65535)
					i_890_ = 65535;
				int i_891_ = (i_883_ & 0xff) * i_888_;
				if (i_891_ > 65535)
					i_891_ = 65535;
				i_883_ = (i_889_ << 8 & 0xff0000) + (i_890_ & 0xff00) + (i_891_ >> 8);
			}
		}
		return i_883_ & 0xffffff;
	}

	void method1371(int i, int[] is, int i_892_, int i_893_, int i_894_, boolean bool, int i_895_, int[] is_896_) {
		int i_897_ = is.length;
		if (i == 0) {
			i_892_ <<= 4;
			i_893_ <<= 4;
			i_894_ <<= 4;
			int i_898_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_899_ = 0; i_899_ < i_897_; i_899_++) {
				int i_900_ = is[i_899_];
				if (i_900_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_901_ = ((AbstractModel) this).anIntArrayArray10792[i_900_];
					for (int i_902_ = 0; i_902_ < is_901_.length; i_902_++) {
						int i_903_ = is_901_[i_902_];
						if (((AbstractModel) this).aShortArray10810 == null || (i_895_ & (((AbstractModel) this).aShortArray10810[i_903_])) != 0) {
							((AbstractModel) this).anInt10862 += (((AbstractModel) this).vertexX[i_903_]);
							((AbstractModel) this).anInt10863 += (((AbstractModel) this).vertexY[i_903_]);
							((AbstractModel) this).anInt10794 += (((AbstractModel) this).vertexZ[i_903_]);
							i_898_++;
						}
					}
				}
			}
			if (i_898_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_898_ + i_892_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_898_ + i_893_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_898_ + i_894_;
				((AbstractModel) this).aBool10865 = true;
			} else {
				((AbstractModel) this).anInt10862 = i_892_;
				((AbstractModel) this).anInt10863 = i_893_;
				((AbstractModel) this).anInt10794 = i_894_;
			}
		} else if (i == 1) {
			if (is_896_ != null) {
				int i_904_ = ((is_896_[0] * i_892_ + is_896_[1] * i_893_ + is_896_[2] * i_894_ + 8192) >> 14);
				int i_905_ = ((is_896_[3] * i_892_ + is_896_[4] * i_893_ + is_896_[5] * i_894_ + 8192) >> 14);
				int i_906_ = ((is_896_[6] * i_892_ + is_896_[7] * i_893_ + is_896_[8] * i_894_ + 8192) >> 14);
				i_892_ = i_904_;
				i_893_ = i_905_;
				i_894_ = i_906_;
			}
			i_892_ <<= 4;
			i_893_ <<= 4;
			i_894_ <<= 4;
			for (int i_907_ = 0; i_907_ < i_897_; i_907_++) {
				int i_908_ = is[i_907_];
				if (i_908_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_909_ = ((AbstractModel) this).anIntArrayArray10792[i_908_];
					for (int i_910_ = 0; i_910_ < is_909_.length; i_910_++) {
						int i_911_ = is_909_[i_910_];
						if (((AbstractModel) this).aShortArray10810 == null || (i_895_ & (((AbstractModel) this).aShortArray10810[i_911_])) != 0) {
							((AbstractModel) this).vertexX[i_911_] += i_892_;
							((AbstractModel) this).vertexY[i_911_] += i_893_;
							((AbstractModel) this).vertexZ[i_911_] += i_894_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_896_ != null) {
				int i_912_ = is_896_[9] << 4;
				int i_913_ = is_896_[10] << 4;
				int i_914_ = is_896_[11] << 4;
				int i_915_ = is_896_[12] << 4;
				int i_916_ = is_896_[13] << 4;
				int i_917_ = is_896_[14] << 4;
				if (((AbstractModel) this).aBool10865) {
					int i_918_ = ((is_896_[0] * ((AbstractModel) this).anInt10862 + is_896_[3] * ((AbstractModel) this).anInt10863 + is_896_[6] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_919_ = ((is_896_[1] * ((AbstractModel) this).anInt10862 + is_896_[4] * ((AbstractModel) this).anInt10863 + is_896_[7] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_920_ = ((is_896_[2] * ((AbstractModel) this).anInt10862 + is_896_[5] * ((AbstractModel) this).anInt10863 + is_896_[8] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					i_918_ += i_915_;
					i_919_ += i_916_;
					i_920_ += i_917_;
					((AbstractModel) this).anInt10862 = i_918_;
					((AbstractModel) this).anInt10863 = i_919_;
					((AbstractModel) this).anInt10794 = i_920_;
					((AbstractModel) this).aBool10865 = false;
				}
				int[] is_921_ = new int[9];
				int i_922_ = Class325.anIntArray4105[i_892_];
				int i_923_ = Class325.anIntArray4103[i_892_];
				int i_924_ = Class325.anIntArray4105[i_893_];
				int i_925_ = Class325.anIntArray4103[i_893_];
				int i_926_ = Class325.anIntArray4105[i_894_];
				int i_927_ = Class325.anIntArray4103[i_894_];
				int i_928_ = i_923_ * i_926_ + 8192 >> 14;
				int i_929_ = i_923_ * i_927_ + 8192 >> 14;
				is_921_[0] = i_924_ * i_926_ + i_925_ * i_929_ + 8192 >> 14;
				is_921_[1] = -i_924_ * i_927_ + i_925_ * i_928_ + 8192 >> 14;
				is_921_[2] = i_925_ * i_922_ + 8192 >> 14;
				is_921_[3] = i_922_ * i_927_ + 8192 >> 14;
				is_921_[4] = i_922_ * i_926_ + 8192 >> 14;
				is_921_[5] = -i_923_;
				is_921_[6] = -i_925_ * i_926_ + i_924_ * i_929_ + 8192 >> 14;
				is_921_[7] = i_925_ * i_927_ + i_924_ * i_928_ + 8192 >> 14;
				is_921_[8] = i_924_ * i_922_ + 8192 >> 14;
				int i_930_ = ((is_921_[0] * -((AbstractModel) this).anInt10862 + is_921_[1] * -((AbstractModel) this).anInt10863 + is_921_[2] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_931_ = ((is_921_[3] * -((AbstractModel) this).anInt10862 + is_921_[4] * -((AbstractModel) this).anInt10863 + is_921_[5] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_932_ = ((is_921_[6] * -((AbstractModel) this).anInt10862 + is_921_[7] * -((AbstractModel) this).anInt10863 + is_921_[8] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_933_ = i_930_ + ((AbstractModel) this).anInt10862;
				int i_934_ = i_931_ + ((AbstractModel) this).anInt10863;
				int i_935_ = i_932_ + ((AbstractModel) this).anInt10794;
				int[] is_936_ = new int[9];
				for (int i_937_ = 0; i_937_ < 3; i_937_++) {
					for (int i_938_ = 0; i_938_ < 3; i_938_++) {
						int i_939_ = 0;
						for (int i_940_ = 0; i_940_ < 3; i_940_++)
							i_939_ += (is_921_[i_937_ * 3 + i_940_] * is_896_[i_938_ * 3 + i_940_]);
						is_936_[i_937_ * 3 + i_938_] = i_939_ + 8192 >> 14;
					}
				}
				int i_941_ = ((is_921_[0] * i_915_ + is_921_[1] * i_916_ + is_921_[2] * i_917_ + 8192) >> 14);
				int i_942_ = ((is_921_[3] * i_915_ + is_921_[4] * i_916_ + is_921_[5] * i_917_ + 8192) >> 14);
				int i_943_ = ((is_921_[6] * i_915_ + is_921_[7] * i_916_ + is_921_[8] * i_917_ + 8192) >> 14);
				i_941_ += i_933_;
				i_942_ += i_934_;
				i_943_ += i_935_;
				int[] is_944_ = new int[9];
				for (int i_945_ = 0; i_945_ < 3; i_945_++) {
					for (int i_946_ = 0; i_946_ < 3; i_946_++) {
						int i_947_ = 0;
						for (int i_948_ = 0; i_948_ < 3; i_948_++)
							i_947_ += (is_896_[i_945_ * 3 + i_948_] * is_936_[i_946_ + i_948_ * 3]);
						is_944_[i_945_ * 3 + i_946_] = i_947_ + 8192 >> 14;
					}
				}
				int i_949_ = ((is_896_[0] * i_941_ + is_896_[1] * i_942_ + is_896_[2] * i_943_ + 8192) >> 14);
				int i_950_ = ((is_896_[3] * i_941_ + is_896_[4] * i_942_ + is_896_[5] * i_943_ + 8192) >> 14);
				int i_951_ = ((is_896_[6] * i_941_ + is_896_[7] * i_942_ + is_896_[8] * i_943_ + 8192) >> 14);
				i_949_ += i_912_;
				i_950_ += i_913_;
				i_951_ += i_914_;
				for (int i_952_ = 0; i_952_ < i_897_; i_952_++) {
					int i_953_ = is[i_952_];
					if (i_953_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_954_ = (((AbstractModel) this).anIntArrayArray10792[i_953_]);
						for (int i_955_ = 0; i_955_ < is_954_.length; i_955_++) {
							int i_956_ = is_954_[i_955_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_895_ & (((AbstractModel) this).aShortArray10810[i_956_])) != 0)) {
								int i_957_ = ((is_944_[0] * (((AbstractModel) this).vertexX[i_956_]) + is_944_[1] * (((AbstractModel) this).vertexY[i_956_]) + is_944_[2] * (((AbstractModel) this).vertexZ[i_956_]) + 8192) >> 14);
								int i_958_ = ((is_944_[3] * (((AbstractModel) this).vertexX[i_956_]) + is_944_[4] * (((AbstractModel) this).vertexY[i_956_]) + is_944_[5] * (((AbstractModel) this).vertexZ[i_956_]) + 8192) >> 14);
								int i_959_ = ((is_944_[6] * (((AbstractModel) this).vertexX[i_956_]) + is_944_[7] * (((AbstractModel) this).vertexY[i_956_]) + is_944_[8] * (((AbstractModel) this).vertexZ[i_956_]) + 8192) >> 14);
								i_957_ += i_949_;
								i_958_ += i_950_;
								i_959_ += i_951_;
								((AbstractModel) this).vertexX[i_956_] = i_957_;
								((AbstractModel) this).vertexY[i_956_] = i_958_;
								((AbstractModel) this).vertexZ[i_956_] = i_959_;
							}
						}
					}
				}
			} else {
				for (int i_960_ = 0; i_960_ < i_897_; i_960_++) {
					int i_961_ = is[i_960_];
					if (i_961_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_962_ = (((AbstractModel) this).anIntArrayArray10792[i_961_]);
						for (int i_963_ = 0; i_963_ < is_962_.length; i_963_++) {
							int i_964_ = is_962_[i_963_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_895_ & (((AbstractModel) this).aShortArray10810[i_964_])) != 0)) {
								((AbstractModel) this).vertexX[i_964_] -= ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_964_] -= ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_964_] -= ((AbstractModel) this).anInt10794;
								if (i_894_ != 0) {
									int i_965_ = Class325.anIntArray4103[i_894_];
									int i_966_ = Class325.anIntArray4105[i_894_];
									int i_967_ = (((((AbstractModel) this).vertexY[i_964_]) * i_965_ + ((((AbstractModel) this).vertexX[i_964_]) * i_966_) + 16383) >> 14);
									((AbstractModel) this).vertexY[i_964_] = ((((AbstractModel) this).vertexY[i_964_]) * i_966_ - ((((AbstractModel) this).vertexX[i_964_]) * i_965_) + 16383) >> 14;
									((AbstractModel) this).vertexX[i_964_] = i_967_;
								}
								if (i_892_ != 0) {
									int i_968_ = Class325.anIntArray4103[i_892_];
									int i_969_ = Class325.anIntArray4105[i_892_];
									int i_970_ = (((((AbstractModel) this).vertexY[i_964_]) * i_969_ - ((((AbstractModel) this).vertexZ[i_964_]) * i_968_) + 16383) >> 14);
									((AbstractModel) this).vertexZ[i_964_] = ((((AbstractModel) this).vertexY[i_964_]) * i_968_ + ((((AbstractModel) this).vertexZ[i_964_]) * i_969_) + 16383) >> 14;
									((AbstractModel) this).vertexY[i_964_] = i_970_;
								}
								if (i_893_ != 0) {
									int i_971_ = Class325.anIntArray4103[i_893_];
									int i_972_ = Class325.anIntArray4105[i_893_];
									int i_973_ = (((((AbstractModel) this).vertexZ[i_964_]) * i_971_ + ((((AbstractModel) this).vertexX[i_964_]) * i_972_) + 16383) >> 14);
									((AbstractModel) this).vertexZ[i_964_] = ((((AbstractModel) this).vertexZ[i_964_]) * i_972_ - ((((AbstractModel) this).vertexX[i_964_]) * i_971_) + 16383) >> 14;
									((AbstractModel) this).vertexX[i_964_] = i_973_;
								}
								((AbstractModel) this).vertexX[i_964_] += ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_964_] += ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_964_] += ((AbstractModel) this).anInt10794;
							}
						}
					}
				}
				if (bool) {
					for (int i_974_ = 0; i_974_ < i_897_; i_974_++) {
						int i_975_ = is[i_974_];
						if (i_975_ < (((AbstractModel) this).anIntArrayArray10792).length) {
							int[] is_976_ = (((AbstractModel) this).anIntArrayArray10792[i_975_]);
							for (int i_977_ = 0; i_977_ < is_976_.length; i_977_++) {
								int i_978_ = is_976_[i_977_];
								if ((((AbstractModel) this).aShortArray10810 == null) || ((i_895_ & (((AbstractModel) this).aShortArray10810[i_978_])) != 0)) {
									int i_979_ = (((AbstractModel) this).sharedFaces[i_978_]);
									int i_980_ = (((AbstractModel) this).sharedFaces[i_978_ + 1]);
									for (int i_981_ = i_979_; (i_981_ < i_980_ && (((AbstractModel) this).aShortArray10853[i_981_]) != 0); i_981_++) {
										int i_982_ = (((((AbstractModel) this).aShortArray10853[i_981_]) & 0xffff) - 1);
										if (i_894_ != 0) {
											int i_983_ = (Class325.anIntArray4103[i_894_]);
											int i_984_ = (Class325.anIntArray4105[i_894_]);
											int i_985_ = (((((AbstractModel) this).aShortArray10805[i_982_]) * i_983_ + (((AbstractModel) this).aShortArray10807[i_982_]) * i_984_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10805[i_982_] = (short) (((((AbstractModel) this).aShortArray10805[i_982_]) * i_984_ - ((((AbstractModel) this).aShortArray10807[i_982_]) * i_983_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10807[i_982_] = (short) i_985_;
										}
										if (i_892_ != 0) {
											int i_986_ = (Class325.anIntArray4103[i_892_]);
											int i_987_ = (Class325.anIntArray4105[i_892_]);
											int i_988_ = (((((AbstractModel) this).aShortArray10805[i_982_]) * i_987_ - (((AbstractModel) this).aShortArray10809[i_982_]) * i_986_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10809[i_982_] = (short) (((((AbstractModel) this).aShortArray10805[i_982_]) * i_986_ + ((((AbstractModel) this).aShortArray10809[i_982_]) * i_987_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10805[i_982_] = (short) i_988_;
										}
										if (i_893_ != 0) {
											int i_989_ = (Class325.anIntArray4103[i_893_]);
											int i_990_ = (Class325.anIntArray4105[i_893_]);
											int i_991_ = (((((AbstractModel) this).aShortArray10809[i_982_]) * i_989_ + (((AbstractModel) this).aShortArray10807[i_982_]) * i_990_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10809[i_982_] = (short) (((((AbstractModel) this).aShortArray10809[i_982_]) * i_990_ - ((((AbstractModel) this).aShortArray10807[i_982_]) * i_989_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10807[i_982_] = (short) i_991_;
										}
									}
								}
							}
						}
					}
					method10017();
				}
			}
		} else if (i == 3) {
			if (is_896_ != null) {
				int i_992_ = is_896_[9] << 4;
				int i_993_ = is_896_[10] << 4;
				int i_994_ = is_896_[11] << 4;
				int i_995_ = is_896_[12] << 4;
				int i_996_ = is_896_[13] << 4;
				int i_997_ = is_896_[14] << 4;
				if (((AbstractModel) this).aBool10865) {
					int i_998_ = ((is_896_[0] * ((AbstractModel) this).anInt10862 + is_896_[3] * ((AbstractModel) this).anInt10863 + is_896_[6] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_999_ = ((is_896_[1] * ((AbstractModel) this).anInt10862 + is_896_[4] * ((AbstractModel) this).anInt10863 + is_896_[7] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_1000_ = ((is_896_[2] * ((AbstractModel) this).anInt10862 + is_896_[5] * ((AbstractModel) this).anInt10863 + is_896_[8] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					i_998_ += i_995_;
					i_999_ += i_996_;
					i_1000_ += i_997_;
					((AbstractModel) this).anInt10862 = i_998_;
					((AbstractModel) this).anInt10863 = i_999_;
					((AbstractModel) this).anInt10794 = i_1000_;
					((AbstractModel) this).aBool10865 = false;
				}
				int i_1001_ = i_892_ << 15 >> 7;
				int i_1002_ = i_893_ << 15 >> 7;
				int i_1003_ = i_894_ << 15 >> 7;
				int i_1004_ = i_1001_ * -((AbstractModel) this).anInt10862 + 8192 >> 14;
				int i_1005_ = i_1002_ * -((AbstractModel) this).anInt10863 + 8192 >> 14;
				int i_1006_ = i_1003_ * -((AbstractModel) this).anInt10794 + 8192 >> 14;
				int i_1007_ = i_1004_ + ((AbstractModel) this).anInt10862;
				int i_1008_ = i_1005_ + ((AbstractModel) this).anInt10863;
				int i_1009_ = i_1006_ + ((AbstractModel) this).anInt10794;
				int[] is_1010_ = new int[9];
				is_1010_[0] = i_1001_ * is_896_[0] + 8192 >> 14;
				is_1010_[1] = i_1001_ * is_896_[3] + 8192 >> 14;
				is_1010_[2] = i_1001_ * is_896_[6] + 8192 >> 14;
				is_1010_[3] = i_1002_ * is_896_[1] + 8192 >> 14;
				is_1010_[4] = i_1002_ * is_896_[4] + 8192 >> 14;
				is_1010_[5] = i_1002_ * is_896_[7] + 8192 >> 14;
				is_1010_[6] = i_1003_ * is_896_[2] + 8192 >> 14;
				is_1010_[7] = i_1003_ * is_896_[5] + 8192 >> 14;
				is_1010_[8] = i_1003_ * is_896_[8] + 8192 >> 14;
				int i_1011_ = i_1001_ * i_995_ + 8192 >> 14;
				int i_1012_ = i_1002_ * i_996_ + 8192 >> 14;
				int i_1013_ = i_1003_ * i_997_ + 8192 >> 14;
				i_1011_ += i_1007_;
				i_1012_ += i_1008_;
				i_1013_ += i_1009_;
				int[] is_1014_ = new int[9];
				for (int i_1015_ = 0; i_1015_ < 3; i_1015_++) {
					for (int i_1016_ = 0; i_1016_ < 3; i_1016_++) {
						int i_1017_ = 0;
						for (int i_1018_ = 0; i_1018_ < 3; i_1018_++)
							i_1017_ += (is_896_[i_1015_ * 3 + i_1018_] * is_1010_[i_1016_ + i_1018_ * 3]);
						is_1014_[i_1015_ * 3 + i_1016_] = i_1017_ + 8192 >> 14;
					}
				}
				int i_1019_ = ((is_896_[0] * i_1011_ + is_896_[1] * i_1012_ + is_896_[2] * i_1013_ + 8192) >> 14);
				int i_1020_ = ((is_896_[3] * i_1011_ + is_896_[4] * i_1012_ + is_896_[5] * i_1013_ + 8192) >> 14);
				int i_1021_ = ((is_896_[6] * i_1011_ + is_896_[7] * i_1012_ + is_896_[8] * i_1013_ + 8192) >> 14);
				i_1019_ += i_992_;
				i_1020_ += i_993_;
				i_1021_ += i_994_;
				for (int i_1022_ = 0; i_1022_ < i_897_; i_1022_++) {
					int i_1023_ = is[i_1022_];
					if (i_1023_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1024_ = (((AbstractModel) this).anIntArrayArray10792[i_1023_]);
						for (int i_1025_ = 0; i_1025_ < is_1024_.length; i_1025_++) {
							int i_1026_ = is_1024_[i_1025_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_895_ & (((AbstractModel) this).aShortArray10810[i_1026_])) != 0)) {
								int i_1027_ = ((is_1014_[0] * (((AbstractModel) this).vertexX[i_1026_]) + is_1014_[1] * (((AbstractModel) this).vertexY[i_1026_]) + is_1014_[2] * (((AbstractModel) this).vertexZ[i_1026_]) + 8192) >> 14);
								int i_1028_ = ((is_1014_[3] * (((AbstractModel) this).vertexX[i_1026_]) + is_1014_[4] * (((AbstractModel) this).vertexY[i_1026_]) + is_1014_[5] * (((AbstractModel) this).vertexZ[i_1026_]) + 8192) >> 14);
								int i_1029_ = ((is_1014_[6] * (((AbstractModel) this).vertexX[i_1026_]) + is_1014_[7] * (((AbstractModel) this).vertexY[i_1026_]) + is_1014_[8] * (((AbstractModel) this).vertexZ[i_1026_]) + 8192) >> 14);
								i_1027_ += i_1019_;
								i_1028_ += i_1020_;
								i_1029_ += i_1021_;
								((AbstractModel) this).vertexX[i_1026_] = i_1027_;
								((AbstractModel) this).vertexY[i_1026_] = i_1028_;
								((AbstractModel) this).vertexZ[i_1026_] = i_1029_;
							}
						}
					}
				}
			} else {
				for (int i_1030_ = 0; i_1030_ < i_897_; i_1030_++) {
					int i_1031_ = is[i_1030_];
					if (i_1031_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1032_ = (((AbstractModel) this).anIntArrayArray10792[i_1031_]);
						for (int i_1033_ = 0; i_1033_ < is_1032_.length; i_1033_++) {
							int i_1034_ = is_1032_[i_1033_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_895_ & (((AbstractModel) this).aShortArray10810[i_1034_])) != 0)) {
								((AbstractModel) this).vertexX[i_1034_] -= ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1034_] -= ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1034_] -= ((AbstractModel) this).anInt10794;
								((AbstractModel) this).vertexX[i_1034_] = (((AbstractModel) this).vertexX[i_1034_]) * i_892_ >> 7;
								((AbstractModel) this).vertexY[i_1034_] = (((AbstractModel) this).vertexY[i_1034_]) * i_893_ >> 7;
								((AbstractModel) this).vertexZ[i_1034_] = (((AbstractModel) this).vertexZ[i_1034_]) * i_894_ >> 7;
								((AbstractModel) this).vertexX[i_1034_] += ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1034_] += ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1034_] += ((AbstractModel) this).anInt10794;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1035_ = false;
				for (int i_1036_ = 0; i_1036_ < i_897_; i_1036_++) {
					int i_1037_ = is[i_1036_];
					if (i_1037_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1038_ = (((AbstractModel) this).anIntArrayArray10820[i_1037_]);
						for (int i_1039_ = 0; i_1039_ < is_1038_.length; i_1039_++) {
							int i_1040_ = is_1038_[i_1039_];
							if (((AbstractModel) this).aShortArray10839 == null || ((i_895_ & (((AbstractModel) this).aShortArray10839[i_1040_])) != 0)) {
								int i_1041_ = (((((AbstractModel) this).alpha[i_1040_]) & 0xff) + i_892_ * 8);
								if (i_1041_ < 0)
									i_1041_ = 0;
								else if (i_1041_ > 255)
									i_1041_ = 255;
								((AbstractModel) this).alpha[i_1040_] = (byte) i_1041_;
							}
						}
						bool_1035_ = bool_1035_ | is_1038_.length > 0;
					}
				}
				if (bool_1035_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1042_ = 0; i_1042_ < ((AbstractModel) this).anInt10851; i_1042_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1042_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1042_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
						}
					}
					method10014();
				}
			}
		} else if (i == 7) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1043_ = false;
				for (int i_1044_ = 0; i_1044_ < i_897_; i_1044_++) {
					int i_1045_ = is[i_1044_];
					if (i_1045_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1046_ = (((AbstractModel) this).anIntArrayArray10820[i_1045_]);
						for (int i_1047_ = 0; i_1047_ < is_1046_.length; i_1047_++) {
							int i_1048_ = is_1046_[i_1047_];
							if (((AbstractModel) this).aShortArray10839 == null || ((i_895_ & (((AbstractModel) this).aShortArray10839[i_1048_])) != 0)) {
								int i_1049_ = ((((AbstractModel) this).aShortArray10793[i_1048_]) & 0xffff);
								int i_1050_ = i_1049_ >> 10 & 0x3f;
								int i_1051_ = i_1049_ >> 7 & 0x7;
								int i_1052_ = i_1049_ & 0x7f;
								i_1050_ = i_1050_ + i_892_ & 0x3f;
								i_1051_ += i_893_ / 4;
								if (i_1051_ < 0)
									i_1051_ = 0;
								else if (i_1051_ > 7)
									i_1051_ = 7;
								i_1052_ += i_894_;
								if (i_1052_ < 0)
									i_1052_ = 0;
								else if (i_1052_ > 127)
									i_1052_ = 127;
								((AbstractModel) this).aShortArray10793[i_1048_] = (short) (i_1050_ << 10 | i_1051_ << 7 | i_1052_);
							}
						}
						bool_1043_ = bool_1043_ | is_1046_.length > 0;
					}
				}
				if (bool_1043_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1053_ = 0; i_1053_ < ((AbstractModel) this).anInt10851; i_1053_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1053_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1053_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | (Class460.anIntArray5213[((((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff)]) & 0xffffff);
						}
					}
					method10014();
				}
			}
		} else if (i == 8) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1054_ = 0; i_1054_ < i_897_; i_1054_++) {
					int i_1055_ = is[i_1054_];
					if (i_1055_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1056_ = (((AbstractModel) this).anIntArrayArray10854[i_1055_]);
						for (int i_1057_ = 0; i_1057_ < is_1056_.length; i_1057_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1056_[i_1057_]]);
							((Class355) class355).anInt4408 += i_892_;
							((Class355) class355).anInt4407 += i_893_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1058_ = 0; i_1058_ < i_897_; i_1058_++) {
					int i_1059_ = is[i_1058_];
					if (i_1059_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1060_ = (((AbstractModel) this).anIntArrayArray10854[i_1059_]);
						for (int i_1061_ = 0; i_1061_ < is_1060_.length; i_1061_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1060_[i_1061_]]);
							((Class355) class355).anInt4405 = (((Class355) class355).anInt4405 * i_892_ >> 7);
							((Class355) class355).anInt4409 = (((Class355) class355).anInt4409 * i_893_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1062_ = 0; i_1062_ < i_897_; i_1062_++) {
					int i_1063_ = is[i_1062_];
					if (i_1063_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1064_ = (((AbstractModel) this).anIntArrayArray10854[i_1063_]);
						for (int i_1065_ = 0; i_1065_ < is_1064_.length; i_1065_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1064_[i_1065_]]);
							((Class355) class355).anInt4410 = (((Class355) class355).anInt4410 + i_892_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method1404(Model model, int i, int i_1066_, int i_1067_, boolean bool) {
		AbstractModel class89_sub3_1068_ = (AbstractModel) model;
		if (((AbstractModel) this).anInt10833 != 0 && ((AbstractModel) class89_sub3_1068_).anInt10833 != 0) {
			int i_1069_ = ((AbstractModel) class89_sub3_1068_).maxVertexUsed;
			int[] is = ((AbstractModel) class89_sub3_1068_).vertexX;
			int[] is_1070_ = ((AbstractModel) class89_sub3_1068_).vertexY;
			int[] is_1071_ = ((AbstractModel) class89_sub3_1068_).vertexZ;
			short[] is_1072_ = ((AbstractModel) class89_sub3_1068_).aShortArray10807;
			short[] is_1073_ = ((AbstractModel) class89_sub3_1068_).aShortArray10805;
			short[] is_1074_ = ((AbstractModel) class89_sub3_1068_).aShortArray10809;
			byte[] is_1075_ = ((AbstractModel) class89_sub3_1068_).aByteArray10838;
			short[] is_1076_;
			short[] is_1077_;
			short[] is_1078_;
			byte[] is_1079_;
			if (((AbstractModel) this).aClass377_10823 != null) {
				is_1076_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
				is_1077_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
				is_1078_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
				is_1079_ = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			} else {
				is_1076_ = null;
				is_1077_ = null;
				is_1078_ = null;
				is_1079_ = null;
			}
			short[] is_1080_;
			short[] is_1081_;
			short[] is_1082_;
			byte[] is_1083_;
			if (((AbstractModel) class89_sub3_1068_).aClass377_10823 != null) {
				is_1080_ = ((Class377) (((AbstractModel) class89_sub3_1068_).aClass377_10823)).aShortArray4573;
				is_1081_ = ((Class377) (((AbstractModel) class89_sub3_1068_).aClass377_10823)).aShortArray4570;
				is_1082_ = ((Class377) (((AbstractModel) class89_sub3_1068_).aClass377_10823)).aShortArray4572;
				is_1083_ = ((Class377) (((AbstractModel) class89_sub3_1068_).aClass377_10823)).aByteArray4571;
			} else {
				is_1080_ = null;
				is_1081_ = null;
				is_1082_ = null;
				is_1083_ = null;
			}
			int[] is_1084_ = ((AbstractModel) class89_sub3_1068_).sharedFaces;
			short[] is_1085_ = ((AbstractModel) class89_sub3_1068_).aShortArray10853;
			if (!((AbstractModel) class89_sub3_1068_).aBool10835)
				class89_sub3_1068_.method10016();
			int i_1086_ = ((AbstractModel) class89_sub3_1068_).anInt10816;
			int i_1087_ = ((AbstractModel) class89_sub3_1068_).anInt10837;
			int i_1088_ = ((AbstractModel) class89_sub3_1068_).anInt10843;
			int i_1089_ = ((AbstractModel) class89_sub3_1068_).anInt10790;
			int i_1090_ = ((AbstractModel) class89_sub3_1068_).anInt10840;
			int i_1091_ = ((AbstractModel) class89_sub3_1068_).anInt10801;
			for (int i_1092_ = 0; i_1092_ < ((AbstractModel) this).maxVertexUsed; i_1092_++) {
				int i_1093_ = ((AbstractModel) this).vertexY[i_1092_] - i_1066_;
				if (i_1093_ >= i_1086_ && i_1093_ <= i_1087_) {
					int i_1094_ = ((AbstractModel) this).vertexX[i_1092_] - i;
					if (i_1094_ >= i_1088_ && i_1094_ <= i_1089_) {
						int i_1095_ = (((AbstractModel) this).vertexZ[i_1092_] - i_1067_);
						if (i_1095_ >= i_1090_ && i_1095_ <= i_1091_) {
							int i_1096_ = -1;
							int i_1097_ = (((AbstractModel) this).sharedFaces[i_1092_]);
							int i_1098_ = (((AbstractModel) this).sharedFaces[i_1092_ + 1]);
							for (int i_1099_ = i_1097_; (i_1099_ < i_1098_ && (((AbstractModel) this).aShortArray10853[i_1099_]) != 0); i_1099_++) {
								i_1096_ = ((((AbstractModel) this).aShortArray10853[i_1099_]) & 0xffff) - 1;
								if ((((AbstractModel) this).aByteArray10838[i_1096_]) != 0)
									break;
							}
							if (i_1096_ != -1) {
								for (int i_1100_ = 0; i_1100_ < i_1069_; i_1100_++) {
									if (i_1094_ == is[i_1100_] && i_1095_ == is_1071_[i_1100_] && i_1093_ == is_1070_[i_1100_]) {
										int i_1101_ = -1;
										i_1097_ = is_1084_[i_1100_];
										i_1098_ = is_1084_[i_1100_ + 1];
										for (int i_1102_ = i_1097_; (i_1102_ < i_1098_ && is_1085_[i_1102_] != 0); i_1102_++) {
											i_1101_ = (is_1085_[i_1102_] - 1 & 0xffff);
											if (is_1075_[i_1101_] != 0)
												break;
										}
										if (i_1101_ != -1) {
											if (is_1076_ == null) {
												((AbstractModel) this).aClass377_10823 = new Class377();
												is_1076_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4573 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10807), -1660536571));
												is_1077_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4570 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10805), -1737295223));
												is_1078_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4572 = (Class572_Sub3_Sub3.method10283((((AbstractModel) this).aShortArray10809), -870843077));
												is_1079_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aByteArray4571 = (Class359.method4442((((AbstractModel) this).aByteArray10838), -2129338997));
											}
											if (is_1080_ == null) {
												Class377 class377 = (((AbstractModel) class89_sub3_1068_).aClass377_10823 = new Class377());
												is_1080_ = ((Class377) class377).aShortArray4573 = (Class572_Sub3_Sub3.method10283(is_1072_, -1659137179));
												is_1081_ = ((Class377) class377).aShortArray4570 = (Class572_Sub3_Sub3.method10283(is_1073_, -1109034693));
												is_1082_ = ((Class377) class377).aShortArray4572 = (Class572_Sub3_Sub3.method10283(is_1074_, -858951115));
												is_1083_ = ((Class377) class377).aByteArray4571 = (Class359.method4442(is_1075_, -2120383746));
											}
											short i_1103_ = (((AbstractModel) this).aShortArray10807[i_1096_]);
											short i_1104_ = (((AbstractModel) this).aShortArray10805[i_1096_]);
											short i_1105_ = (((AbstractModel) this).aShortArray10809[i_1096_]);
											byte i_1106_ = (((AbstractModel) this).aByteArray10838[i_1096_]);
											i_1097_ = is_1084_[i_1100_];
											i_1098_ = is_1084_[i_1100_ + 1];
											for (int i_1107_ = i_1097_; i_1107_ < i_1098_; i_1107_++) {
												int i_1108_ = is_1085_[i_1107_] - 1;
												if (i_1108_ == -1)
													break;
												if (is_1083_[i_1108_] != 0) {
													is_1080_[i_1108_] += i_1103_;
													is_1081_[i_1108_] += i_1104_;
													is_1082_[i_1108_] += i_1105_;
													is_1083_[i_1108_] += i_1106_;
												}
											}
											i_1103_ = is_1072_[i_1101_];
											i_1104_ = is_1073_[i_1101_];
											i_1105_ = is_1074_[i_1101_];
											i_1106_ = is_1075_[i_1101_];
											i_1097_ = (((AbstractModel) this).sharedFaces[i_1092_]);
											i_1098_ = (((AbstractModel) this).sharedFaces[i_1092_ + 1]);
											for (int i_1109_ = i_1097_; (i_1109_ < i_1098_ && (((AbstractModel) this).aShortArray10853[i_1109_]) != 0); i_1109_++) {
												int i_1110_ = (((((AbstractModel) this).aShortArray10853[i_1109_]) & 0xffff) - 1);
												if (is_1079_[i_1110_] != 0) {
													is_1076_[i_1110_] += i_1103_;
													is_1077_[i_1110_] += i_1104_;
													is_1078_[i_1110_] += i_1105_;
													is_1079_[i_1110_] += i_1106_;
												}
											}
											class89_sub3_1068_.method10017();
											method10017();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Model method1488(byte i, int i_1111_, boolean bool) {
		boolean bool_1112_ = false;
		AbstractModel class89_sub3_1113_;
		AbstractModel class89_sub3_1114_;
		if (i > 0 && i <= 8) {
			class89_sub3_1114_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass89_Sub3Array10538[i - 1]);
			class89_sub3_1113_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass89_Sub3Array10537[i - 1]);
			bool_1112_ = true;
		} else
			class89_sub3_1113_ = class89_sub3_1114_ = new AbstractModel(((AbstractModel) this).aClass106_Sub3_10825, 0, 0, true, false);
		return method10013(class89_sub3_1113_, class89_sub3_1114_, i_1111_, bool_1112_, bool);
	}

	public int method1406() {
		return ((AbstractModel) this).anInt10829;
	}

	public int method1407() {
		return ((AbstractModel) this).anInt10829;
	}

	public int method1408() {
		return ((AbstractModel) this).anInt10829;
	}

	public void method1410(int i) {
		if (((AbstractModel) this).aClass356_10813 != null)
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4414 = Class368.method4513(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10828 != null)
			((Class356) ((AbstractModel) this).aClass356_10828).aBool4414 = Class368.method4516(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10826 != null)
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4414 = Class368.method4515(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10827 != null)
			((Class356) ((AbstractModel) this).aClass356_10827).aBool4414 = Class368.method4514(i, ((AbstractModel) this).anInt10836);
		((AbstractModel) this).anInt10829 = i;
		if (((AbstractModel) this).aClass377_10823 != null && (((AbstractModel) this).anInt10829 & 0x10000) == 0) {
			((AbstractModel) this).aShortArray10807 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
			((AbstractModel) this).aShortArray10805 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
			((AbstractModel) this).aShortArray10809 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
			((AbstractModel) this).aByteArray10838 = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			((AbstractModel) this).aClass377_10823 = null;
		}
		((AbstractModel) this).aBool10830 = true;
		method10012();
	}

	public void method1411() {
		if (((AbstractModel) this).uniqueVertices > 0 && ((AbstractModel) this).anInt10815 > 0) {
			method10027();
			method10029();
			method10012();
		}
	}

	public void method1424() {
		if (((AbstractModel) this).uniqueVertices > 0 && ((AbstractModel) this).anInt10815 > 0) {
			method10027();
			method10029();
			method10012();
		}
	}

	public void method1506() {
		if (((AbstractModel) this).uniqueVertices > 0 && ((AbstractModel) this).anInt10815 > 0) {
			method10027();
			method10029();
			method10012();
		}
	}

	int method10023(int i, int i_1115_) {
		i_1115_ = i_1115_ * (i & 0x7f) >> 7;
		if (i_1115_ < 2)
			i_1115_ = 2;
		else if (i_1115_ > 126)
			i_1115_ = 126;
		return (i & 0xff80) + i_1115_;
	}

	public void method1415(int i) {
		int i_1116_ = Class325.anIntArray4103[i];
		int i_1117_ = Class325.anIntArray4105[i];
		for (int i_1118_ = 0; i_1118_ < ((AbstractModel) this).maxVertexUsed; i_1118_++) {
			int i_1119_ = ((((AbstractModel) this).vertexZ[i_1118_] * i_1116_ + ((AbstractModel) this).vertexX[i_1118_] * i_1117_) >> 14);
			((AbstractModel) this).vertexZ[i_1118_] = ((((AbstractModel) this).vertexZ[i_1118_] * i_1117_ - ((AbstractModel) this).vertexX[i_1118_] * i_1116_) >> 14);
			((AbstractModel) this).vertexX[i_1118_] = i_1119_;
		}
		for (int i_1120_ = 0; i_1120_ < ((AbstractModel) this).uniqueVertices; i_1120_++) {
			int i_1121_ = ((((AbstractModel) this).aShortArray10809[i_1120_] * i_1116_ + (((AbstractModel) this).aShortArray10807[i_1120_] * i_1117_)) >> 14);
			((AbstractModel) this).aShortArray10809[i_1120_] = (short) (((((AbstractModel) this).aShortArray10809[i_1120_] * i_1117_) - (((AbstractModel) this).aShortArray10807[i_1120_] * i_1116_)) >> 14);
			((AbstractModel) this).aShortArray10807[i_1120_] = (short) i_1121_;
		}
		method10026();
		method10017();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1387(int i) {
		int i_1122_ = Class325.anIntArray4103[i];
		int i_1123_ = Class325.anIntArray4105[i];
		for (int i_1124_ = 0; i_1124_ < ((AbstractModel) this).maxVertexUsed; i_1124_++) {
			int i_1125_ = ((((AbstractModel) this).vertexY[i_1124_] * i_1122_ + ((AbstractModel) this).vertexX[i_1124_] * i_1123_) >> 14);
			((AbstractModel) this).vertexY[i_1124_] = ((((AbstractModel) this).vertexY[i_1124_] * i_1123_ - ((AbstractModel) this).vertexX[i_1124_] * i_1122_) >> 14);
			((AbstractModel) this).vertexX[i_1124_] = i_1125_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1417(int i) {
		int i_1126_ = Class325.anIntArray4103[i];
		int i_1127_ = Class325.anIntArray4105[i];
		for (int i_1128_ = 0; i_1128_ < ((AbstractModel) this).maxVertexUsed; i_1128_++) {
			int i_1129_ = ((((AbstractModel) this).vertexY[i_1128_] * i_1126_ + ((AbstractModel) this).vertexX[i_1128_] * i_1127_) >> 14);
			((AbstractModel) this).vertexY[i_1128_] = ((((AbstractModel) this).vertexY[i_1128_] * i_1127_ - ((AbstractModel) this).vertexX[i_1128_] * i_1126_) >> 14);
			((AbstractModel) this).vertexX[i_1128_] = i_1129_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	void method1395() {
		/* empty */
	}

	public void method1419(int i, int i_1130_, int i_1131_) {
		for (int i_1132_ = 0; i_1132_ < ((AbstractModel) this).maxVertexUsed; i_1132_++) {
			if (i != 0)
				((AbstractModel) this).vertexX[i_1132_] += i;
			if (i_1130_ != 0)
				((AbstractModel) this).vertexY[i_1132_] += i_1130_;
			if (i_1131_ != 0)
				((AbstractModel) this).vertexZ[i_1132_] += i_1131_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public Class175[] method1507() {
		return ((AbstractModel) this).aClass175Array10850;
	}

	public void method1383(int i, int i_1133_, Class174 class174, Class174 class174_1134_, int i_1135_, int i_1136_, int i_1137_) {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		int i_1138_ = i_1135_ + ((AbstractModel) this).anInt10843;
		int i_1139_ = i_1135_ + ((AbstractModel) this).anInt10790;
		int i_1140_ = i_1137_ + ((AbstractModel) this).anInt10840;
		int i_1141_ = i_1137_ + ((AbstractModel) this).anInt10801;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1138_ >= 0 && ((i_1139_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2086 * -1715487093) && i_1140_ >= 0 && ((i_1141_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2089 * 792439321))) {
			if (i == 4 || i == 5) {
				if (class174_1134_ == null || (i_1138_ < 0 || ((i_1139_ + class174_1134_.anInt2087 * 2129890771 >> class174_1134_.anInt2088 * 212267571) >= class174_1134_.anInt2086 * -1715487093) || i_1140_ < 0 || ((i_1141_ + class174_1134_.anInt2087 * 2129890771 >> class174_1134_.anInt2088 * 212267571) >= class174_1134_.anInt2089 * 792439321)))
					return;
			} else {
				i_1138_ >>= class174.anInt2088 * 212267571;
				i_1139_ = (i_1139_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				i_1140_ >>= class174.anInt2088 * 212267571;
				i_1141_ = (i_1141_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				if (class174.method2713(i_1138_, i_1140_, 336623342) == i_1136_ && (class174.method2713(i_1139_, i_1140_, -537205973) == i_1136_) && (class174.method2713(i_1138_, i_1141_, 1803996173) == i_1136_) && (class174.method2713(i_1139_, i_1141_, -1072595433) == i_1136_))
					return;
			}
			if (i == 1) {
				for (int i_1142_ = 0; i_1142_ < ((AbstractModel) this).maxVertexUsed; i_1142_++)
					((AbstractModel) this).vertexY[i_1142_] = (((AbstractModel) this).vertexY[i_1142_] + class174.method2718(((((AbstractModel) this).vertexX[i_1142_]) + i_1135_), ((((AbstractModel) this).vertexZ[i_1142_]) + i_1137_), -1556354757) - i_1136_);
			} else if (i == 2) {
				int i_1143_ = ((AbstractModel) this).anInt10816;
				if (i_1143_ == 0)
					return;
				for (int i_1144_ = 0; i_1144_ < ((AbstractModel) this).maxVertexUsed; i_1144_++) {
					int i_1145_ = ((((AbstractModel) this).vertexY[i_1144_] << 16) / i_1143_);
					if (i_1145_ < i_1133_)
						((AbstractModel) this).vertexY[i_1144_] = (((AbstractModel) this).vertexY[i_1144_] + (class174.method2718((((AbstractModel) this).vertexX[i_1144_]) + i_1135_, (((AbstractModel) this).vertexZ[i_1144_]) + i_1137_, -2057145098) - i_1136_) * (i_1133_ - i_1145_) / i_1133_);
				}
			} else if (i == 3) {
				int i_1146_ = (i_1133_ & 0xff) * 4;
				int i_1147_ = (i_1133_ >> 8 & 0xff) * 4;
				int i_1148_ = (i_1133_ >> 16 & 0xff) << 6;
				int i_1149_ = (i_1133_ >> 24 & 0xff) << 6;
				if (i_1135_ - (i_1146_ >> 1) < 0 || ((i_1135_ + (i_1146_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2086 * -1715487093 << class174.anInt2088 * 212267571)) || i_1137_ - (i_1147_ >> 1) < 0 || ((i_1137_ + (i_1147_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2089 * 792439321 << class174.anInt2088 * 212267571)))
					return;
				method1362(class174, i_1135_, i_1136_, i_1137_, i_1146_, i_1147_, i_1148_, i_1149_);
			} else if (i == 4) {
				int i_1150_ = (((AbstractModel) this).anInt10837 - ((AbstractModel) this).anInt10816);
				for (int i_1151_ = 0; i_1151_ < ((AbstractModel) this).maxVertexUsed; i_1151_++)
					((AbstractModel) this).vertexY[i_1151_] = (((AbstractModel) this).vertexY[i_1151_] + (class174_1134_.method2718((((AbstractModel) this).vertexX[i_1151_]) + i_1135_, (((AbstractModel) this).vertexZ[i_1151_]) + i_1137_, -693383122) - i_1136_) + i_1150_);
			} else if (i == 5) {
				int i_1152_ = (((AbstractModel) this).anInt10837 - ((AbstractModel) this).anInt10816);
				for (int i_1153_ = 0; i_1153_ < ((AbstractModel) this).maxVertexUsed; i_1153_++) {
					int i_1154_ = (((AbstractModel) this).vertexX[i_1153_] + i_1135_);
					int i_1155_ = (((AbstractModel) this).vertexZ[i_1153_] + i_1137_);
					int i_1156_ = class174.method2718(i_1154_, i_1155_, -1579843495);
					int i_1157_ = class174_1134_.method2718(i_1154_, i_1155_, -1471313135);
					int i_1158_ = i_1156_ - i_1157_ - i_1133_;
					((AbstractModel) this).vertexY[i_1153_] = ((((AbstractModel) this).vertexY[i_1153_] << 8) / i_1152_ * i_1158_ >> 8) - (i_1136_ - i_1156_);
				}
			}
			method10026();
			((AbstractModel) this).aBool10835 = false;
		}
	}

	void method10024() {
		if (((AbstractModel) this).aClass356_10813 != null)
			((AbstractModel) this).aClass356_10813.method4425();
		if (((AbstractModel) this).aClass356_10828 != null)
			((AbstractModel) this).aClass356_10828.method4425();
		if (((AbstractModel) this).aClass356_10826 != null)
			((AbstractModel) this).aClass356_10826.method4425();
		if (((AbstractModel) this).aClass356_10827 != null)
			((AbstractModel) this).aClass356_10827.method4425();
		if (((AbstractModel) this).aClass357_10824 != null)
			((AbstractModel) this).aClass357_10824.method4437();
	}

	public void method1501(Class261 class261) {
		Class250 class250 = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
		class250.method3446(class261);
		if (((AbstractModel) this).aClass84Array10841 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass84Array10841.length; i++) {
				Class84 class84 = ((AbstractModel) this).aClass84Array10841[i];
				Class84 class84_1159_ = class84;
				if (class84.aClass84_1092 != null)
					class84_1159_ = class84.aClass84_1092;
				class84_1159_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_1159_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_1159_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_1159_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_1159_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_1159_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_1159_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_1159_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_1159_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((AbstractModel) this).aClass175Array10850 != null) {
			for (int i = 0; i < ((AbstractModel) this).aClass175Array10850.length; i++) {
				Class175 class175 = ((AbstractModel) this).aClass175Array10850[i];
				Class175 class175_1160_ = class175;
				if (class175.aClass175_2091 != null)
					class175_1160_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_1160_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_1160_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_1160_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((AbstractModel) this).vertexX[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((AbstractModel) this).vertexY[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((AbstractModel) this).vertexZ[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	void method1449() {
		/* empty */
	}

	boolean method1352() {
		if (((AbstractModel) this).anIntArrayArray10792 == null)
			return false;
		for (int i = 0; i < ((AbstractModel) this).anInt10797; i++) {
			((AbstractModel) this).vertexX[i] <<= 4;
			((AbstractModel) this).vertexY[i] <<= 4;
			((AbstractModel) this).vertexZ[i] <<= 4;
		}
		((AbstractModel) this).anInt10862 = 0;
		((AbstractModel) this).anInt10863 = 0;
		((AbstractModel) this).anInt10794 = 0;
		return true;
	}

	void method1427() {
		for (int i = 0; i < ((AbstractModel) this).anInt10797; i++) {
			((AbstractModel) this).vertexX[i] = ((AbstractModel) this).vertexX[i] + 7 >> 4;
			((AbstractModel) this).vertexY[i] = ((AbstractModel) this).vertexY[i] + 7 >> 4;
			((AbstractModel) this).vertexZ[i] = ((AbstractModel) this).vertexZ[i] + 7 >> 4;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	void method1428() {
		for (int i = 0; i < ((AbstractModel) this).anInt10797; i++) {
			((AbstractModel) this).vertexX[i] = ((AbstractModel) this).vertexX[i] + 7 >> 4;
			((AbstractModel) this).vertexY[i] = ((AbstractModel) this).vertexY[i] + 7 >> 4;
			((AbstractModel) this).vertexZ[i] = ((AbstractModel) this).vertexZ[i] + 7 >> 4;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	void method1429(int i, int[] is, int i_1161_, int i_1162_, int i_1163_, int i_1164_, boolean bool) {
		int i_1165_ = is.length;
		if (i == 0) {
			i_1161_ <<= 4;
			i_1162_ <<= 4;
			i_1163_ <<= 4;
			int i_1166_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_1167_ = 0; i_1167_ < i_1165_; i_1167_++) {
				int i_1168_ = is[i_1167_];
				if (i_1168_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1169_ = ((AbstractModel) this).anIntArrayArray10792[i_1168_];
					for (int i_1170_ = 0; i_1170_ < is_1169_.length; i_1170_++) {
						int i_1171_ = is_1169_[i_1170_];
						((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_1171_];
						((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_1171_];
						((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_1171_];
						i_1166_++;
					}
				}
			}
			if (i_1166_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_1166_ + i_1161_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_1166_ + i_1162_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_1166_ + i_1163_;
			} else {
				((AbstractModel) this).anInt10862 = i_1161_;
				((AbstractModel) this).anInt10863 = i_1162_;
				((AbstractModel) this).anInt10794 = i_1163_;
			}
		} else if (i == 1) {
			i_1161_ <<= 4;
			i_1162_ <<= 4;
			i_1163_ <<= 4;
			for (int i_1172_ = 0; i_1172_ < i_1165_; i_1172_++) {
				int i_1173_ = is[i_1172_];
				if (i_1173_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1174_ = ((AbstractModel) this).anIntArrayArray10792[i_1173_];
					for (int i_1175_ = 0; i_1175_ < is_1174_.length; i_1175_++) {
						int i_1176_ = is_1174_[i_1175_];
						((AbstractModel) this).vertexX[i_1176_] += i_1161_;
						((AbstractModel) this).vertexY[i_1176_] += i_1162_;
						((AbstractModel) this).vertexZ[i_1176_] += i_1163_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1177_ = 0; i_1177_ < i_1165_; i_1177_++) {
				int i_1178_ = is[i_1177_];
				if (i_1178_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1179_ = ((AbstractModel) this).anIntArrayArray10792[i_1178_];
					if ((i_1164_ & 0x1) == 0) {
						for (int i_1180_ = 0; i_1180_ < is_1179_.length; i_1180_++) {
							int i_1181_ = is_1179_[i_1180_];
							((AbstractModel) this).vertexX[i_1181_] -= ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_1181_] -= ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_1181_] -= ((AbstractModel) this).anInt10794;
							if (i_1163_ != 0) {
								int i_1182_ = Class325.anIntArray4103[i_1163_];
								int i_1183_ = Class325.anIntArray4105[i_1163_];
								int i_1184_ = (((((AbstractModel) this).vertexY[i_1181_]) * i_1182_ + (((AbstractModel) this).vertexX[i_1181_]) * i_1183_ + 16383) >> 14);
								((AbstractModel) this).vertexY[i_1181_] = ((((AbstractModel) this).vertexY[i_1181_]) * i_1183_ - (((AbstractModel) this).vertexX[i_1181_]) * i_1182_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_1181_] = i_1184_;
							}
							if (i_1161_ != 0) {
								int i_1185_ = Class325.anIntArray4103[i_1161_];
								int i_1186_ = Class325.anIntArray4105[i_1161_];
								int i_1187_ = (((((AbstractModel) this).vertexY[i_1181_]) * i_1186_ - (((AbstractModel) this).vertexZ[i_1181_]) * i_1185_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_1181_] = ((((AbstractModel) this).vertexY[i_1181_]) * i_1185_ + (((AbstractModel) this).vertexZ[i_1181_]) * i_1186_ + 16383) >> 14;
								((AbstractModel) this).vertexY[i_1181_] = i_1187_;
							}
							if (i_1162_ != 0) {
								int i_1188_ = Class325.anIntArray4103[i_1162_];
								int i_1189_ = Class325.anIntArray4105[i_1162_];
								int i_1190_ = (((((AbstractModel) this).vertexZ[i_1181_]) * i_1188_ + (((AbstractModel) this).vertexX[i_1181_]) * i_1189_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_1181_] = ((((AbstractModel) this).vertexZ[i_1181_]) * i_1189_ - (((AbstractModel) this).vertexX[i_1181_]) * i_1188_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_1181_] = i_1190_;
							}
							((AbstractModel) this).vertexX[i_1181_] += ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_1181_] += ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_1181_] += ((AbstractModel) this).anInt10794;
						}
					} else {
						for (int i_1191_ = 0; i_1191_ < is_1179_.length; i_1191_++) {
							int i_1192_ = is_1179_[i_1191_];
							((AbstractModel) this).vertexX[i_1192_] -= ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_1192_] -= ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_1192_] -= ((AbstractModel) this).anInt10794;
							if (i_1161_ != 0) {
								int i_1193_ = Class325.anIntArray4103[i_1161_];
								int i_1194_ = Class325.anIntArray4105[i_1161_];
								int i_1195_ = (((((AbstractModel) this).vertexY[i_1192_]) * i_1194_ - (((AbstractModel) this).vertexZ[i_1192_]) * i_1193_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_1192_] = ((((AbstractModel) this).vertexY[i_1192_]) * i_1193_ + (((AbstractModel) this).vertexZ[i_1192_]) * i_1194_ + 16383) >> 14;
								((AbstractModel) this).vertexY[i_1192_] = i_1195_;
							}
							if (i_1163_ != 0) {
								int i_1196_ = Class325.anIntArray4103[i_1163_];
								int i_1197_ = Class325.anIntArray4105[i_1163_];
								int i_1198_ = (((((AbstractModel) this).vertexY[i_1192_]) * i_1196_ + (((AbstractModel) this).vertexX[i_1192_]) * i_1197_ + 16383) >> 14);
								((AbstractModel) this).vertexY[i_1192_] = ((((AbstractModel) this).vertexY[i_1192_]) * i_1197_ - (((AbstractModel) this).vertexX[i_1192_]) * i_1196_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_1192_] = i_1198_;
							}
							if (i_1162_ != 0) {
								int i_1199_ = Class325.anIntArray4103[i_1162_];
								int i_1200_ = Class325.anIntArray4105[i_1162_];
								int i_1201_ = (((((AbstractModel) this).vertexZ[i_1192_]) * i_1199_ + (((AbstractModel) this).vertexX[i_1192_]) * i_1200_ + 16383) >> 14);
								((AbstractModel) this).vertexZ[i_1192_] = ((((AbstractModel) this).vertexZ[i_1192_]) * i_1200_ - (((AbstractModel) this).vertexX[i_1192_]) * i_1199_ + 16383) >> 14;
								((AbstractModel) this).vertexX[i_1192_] = i_1201_;
							}
							((AbstractModel) this).vertexX[i_1192_] += ((AbstractModel) this).anInt10862;
							((AbstractModel) this).vertexY[i_1192_] += ((AbstractModel) this).anInt10863;
							((AbstractModel) this).vertexZ[i_1192_] += ((AbstractModel) this).anInt10794;
						}
					}
				}
			}
			if (bool) {
				for (int i_1202_ = 0; i_1202_ < i_1165_; i_1202_++) {
					int i_1203_ = is[i_1202_];
					if (i_1203_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1204_ = (((AbstractModel) this).anIntArrayArray10792[i_1203_]);
						for (int i_1205_ = 0; i_1205_ < is_1204_.length; i_1205_++) {
							int i_1206_ = is_1204_[i_1205_];
							int i_1207_ = (((AbstractModel) this).sharedFaces[i_1206_]);
							int i_1208_ = (((AbstractModel) this).sharedFaces[i_1206_ + 1]);
							for (int i_1209_ = i_1207_; (i_1209_ < i_1208_ && (((AbstractModel) this).aShortArray10853[i_1209_]) != 0); i_1209_++) {
								int i_1210_ = (((((AbstractModel) this).aShortArray10853[i_1209_]) & 0xffff) - 1);
								if (i_1163_ != 0) {
									int i_1211_ = Class325.anIntArray4103[i_1163_];
									int i_1212_ = Class325.anIntArray4105[i_1163_];
									int i_1213_ = (((((AbstractModel) this).aShortArray10805[i_1210_]) * i_1211_ + (((AbstractModel) this).aShortArray10807[i_1210_]) * i_1212_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10805[i_1210_] = (short) (((((AbstractModel) this).aShortArray10805[i_1210_]) * i_1212_ - (((AbstractModel) this).aShortArray10807[i_1210_]) * i_1211_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10807[i_1210_] = (short) i_1213_;
								}
								if (i_1161_ != 0) {
									int i_1214_ = Class325.anIntArray4103[i_1161_];
									int i_1215_ = Class325.anIntArray4105[i_1161_];
									int i_1216_ = (((((AbstractModel) this).aShortArray10805[i_1210_]) * i_1215_ - (((AbstractModel) this).aShortArray10809[i_1210_]) * i_1214_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10809[i_1210_] = (short) (((((AbstractModel) this).aShortArray10805[i_1210_]) * i_1214_ + (((AbstractModel) this).aShortArray10809[i_1210_]) * i_1215_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10805[i_1210_] = (short) i_1216_;
								}
								if (i_1162_ != 0) {
									int i_1217_ = Class325.anIntArray4103[i_1162_];
									int i_1218_ = Class325.anIntArray4105[i_1162_];
									int i_1219_ = (((((AbstractModel) this).aShortArray10809[i_1210_]) * i_1217_ + (((AbstractModel) this).aShortArray10807[i_1210_]) * i_1218_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10809[i_1210_] = (short) (((((AbstractModel) this).aShortArray10809[i_1210_]) * i_1218_ - (((AbstractModel) this).aShortArray10807[i_1210_]) * i_1217_ + 16383) >> 14);
									((AbstractModel) this).aShortArray10807[i_1210_] = (short) i_1219_;
								}
							}
						}
					}
				}
				method10017();
			}
		} else if (i == 3) {
			for (int i_1220_ = 0; i_1220_ < i_1165_; i_1220_++) {
				int i_1221_ = is[i_1220_];
				if (i_1221_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1222_ = ((AbstractModel) this).anIntArrayArray10792[i_1221_];
					for (int i_1223_ = 0; i_1223_ < is_1222_.length; i_1223_++) {
						int i_1224_ = is_1222_[i_1223_];
						((AbstractModel) this).vertexX[i_1224_] -= ((AbstractModel) this).anInt10862;
						((AbstractModel) this).vertexY[i_1224_] -= ((AbstractModel) this).anInt10863;
						((AbstractModel) this).vertexZ[i_1224_] -= ((AbstractModel) this).anInt10794;
						((AbstractModel) this).vertexX[i_1224_] = (((AbstractModel) this).vertexX[i_1224_] * i_1161_) >> 7;
						((AbstractModel) this).vertexY[i_1224_] = (((AbstractModel) this).vertexY[i_1224_] * i_1162_) >> 7;
						((AbstractModel) this).vertexZ[i_1224_] = (((AbstractModel) this).vertexZ[i_1224_] * i_1163_) >> 7;
						((AbstractModel) this).vertexX[i_1224_] += ((AbstractModel) this).anInt10862;
						((AbstractModel) this).vertexY[i_1224_] += ((AbstractModel) this).anInt10863;
						((AbstractModel) this).vertexZ[i_1224_] += ((AbstractModel) this).anInt10794;
					}
				}
			}
		} else if (i == 5) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1225_ = false;
				for (int i_1226_ = 0; i_1226_ < i_1165_; i_1226_++) {
					int i_1227_ = is[i_1226_];
					if (i_1227_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1228_ = (((AbstractModel) this).anIntArrayArray10820[i_1227_]);
						for (int i_1229_ = 0; i_1229_ < is_1228_.length; i_1229_++) {
							int i_1230_ = is_1228_[i_1229_];
							int i_1231_ = (((((AbstractModel) this).alpha[i_1230_]) & 0xff) + i_1161_ * 8);
							if (i_1231_ < 0)
								i_1231_ = 0;
							else if (i_1231_ > 255)
								i_1231_ = 255;
							((AbstractModel) this).alpha[i_1230_] = (byte) i_1231_;
						}
						bool_1225_ = bool_1225_ | is_1228_.length > 0;
					}
				}
				if (bool_1225_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1232_ = 0; i_1232_ < ((AbstractModel) this).anInt10851; i_1232_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1232_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1232_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
						}
					}
					method10014();
				}
			}
		} else if (i == 7) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1233_ = false;
				for (int i_1234_ = 0; i_1234_ < i_1165_; i_1234_++) {
					int i_1235_ = is[i_1234_];
					if (i_1235_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1236_ = (((AbstractModel) this).anIntArrayArray10820[i_1235_]);
						for (int i_1237_ = 0; i_1237_ < is_1236_.length; i_1237_++) {
							int i_1238_ = is_1236_[i_1237_];
							int i_1239_ = ((((AbstractModel) this).aShortArray10793[i_1238_]) & 0xffff);
							int i_1240_ = i_1239_ >> 10 & 0x3f;
							int i_1241_ = i_1239_ >> 7 & 0x7;
							int i_1242_ = i_1239_ & 0x7f;
							i_1240_ = i_1240_ + i_1161_ & 0x3f;
							i_1241_ += i_1162_ / 4;
							if (i_1241_ < 0)
								i_1241_ = 0;
							else if (i_1241_ > 7)
								i_1241_ = 7;
							i_1242_ += i_1163_;
							if (i_1242_ < 0)
								i_1242_ = 0;
							else if (i_1242_ > 127)
								i_1242_ = 127;
							((AbstractModel) this).aShortArray10793[i_1238_] = (short) (i_1240_ << 10 | i_1241_ << 7 | i_1242_);
						}
						bool_1233_ = bool_1233_ | is_1236_.length > 0;
					}
				}
				if (bool_1233_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1243_ = 0; i_1243_ < ((AbstractModel) this).anInt10851; i_1243_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1243_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1243_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | (Class460.anIntArray5213[((((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff)]) & 0xffffff);
						}
					}
					method10014();
				}
			}
		} else if (i == 8) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1244_ = 0; i_1244_ < i_1165_; i_1244_++) {
					int i_1245_ = is[i_1244_];
					if (i_1245_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1246_ = (((AbstractModel) this).anIntArrayArray10854[i_1245_]);
						for (int i_1247_ = 0; i_1247_ < is_1246_.length; i_1247_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1246_[i_1247_]]);
							((Class355) class355).anInt4408 += i_1161_;
							((Class355) class355).anInt4407 += i_1162_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1248_ = 0; i_1248_ < i_1165_; i_1248_++) {
					int i_1249_ = is[i_1248_];
					if (i_1249_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1250_ = (((AbstractModel) this).anIntArrayArray10854[i_1249_]);
						for (int i_1251_ = 0; i_1251_ < is_1250_.length; i_1251_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1250_[i_1251_]]);
							((Class355) class355).anInt4405 = (((Class355) class355).anInt4405 * i_1161_ >> 7);
							((Class355) class355).anInt4409 = (((Class355) class355).anInt4409 * i_1162_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1252_ = 0; i_1252_ < i_1165_; i_1252_++) {
					int i_1253_ = is[i_1252_];
					if (i_1253_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1254_ = (((AbstractModel) this).anIntArrayArray10854[i_1253_]);
						for (int i_1255_ = 0; i_1255_ < is_1254_.length; i_1255_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1254_[i_1255_]]);
							((Class355) class355).anInt4410 = (((Class355) class355).anInt4410 + i_1161_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public int method1459() {
		return ((AbstractModel) this).aShort10795;
	}

	void method10025(Class250 class250) {
		if (((AbstractModel) this).aClass365Array10852 != null) {
			((AbstractModel) this).aClass106_Sub3_10825.method1763(!((AbstractModel) this).aBool10803);
			Class261 class261 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass261_10443);
			Class342 class342 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass342_10509);
			boolean bool = ((AbstractModel) this).aClass106_Sub3_10825.anInt10448 > 0;
			if (bool)
				class342.aClass240_4357.method3268((float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 16 & 0xff) / 255.0F, (float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 8 & 0xff) / 255.0F, (float) ((((AbstractModel) this).aClass106_Sub3_10825.anInt10500) >> 0 & 0xff) / 255.0F);
			else
				class342.aClass240_4357.method3268(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < ((AbstractModel) this).anInt10851; i++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i];
				if (!((Class365) class365).aBool4483 || !((AbstractModel) this).aClass106_Sub3_10825.method1786()) {
					float f = ((float) ((((AbstractModel) this).vertexX[((Class365) class365).anInt4491]) + (((AbstractModel) this).vertexX[((Class365) class365).anInt4484]) + (((AbstractModel) this).vertexX[((Class365) class365).anInt4485])) * 0.3333333F);
					float f_1256_ = ((float) ((((AbstractModel) this).vertexY[((Class365) class365).anInt4491]) + (((AbstractModel) this).vertexY[((Class365) class365).anInt4484]) + (((AbstractModel) this).vertexY[((Class365) class365).anInt4485])) * 0.3333333F);
					float f_1257_ = ((float) ((((AbstractModel) this).vertexZ[((Class365) class365).anInt4491]) + (((AbstractModel) this).vertexZ[((Class365) class365).anInt4484]) + (((AbstractModel) this).vertexZ[((Class365) class365).anInt4485])) * 0.3333333F);
					float f_1258_ = (class250.aFloatArray2728[0] * f + class250.aFloatArray2728[4] * f_1256_ + class250.aFloatArray2728[8] * f_1257_ + class250.aFloatArray2728[12]);
					float f_1259_ = (class250.aFloatArray2728[1] * f + class250.aFloatArray2728[5] * f_1256_ + class250.aFloatArray2728[9] * f_1257_ + class250.aFloatArray2728[13]);
					float f_1260_ = (class250.aFloatArray2728[2] * f + class250.aFloatArray2728[6] * f_1256_ + class250.aFloatArray2728[10] * f_1257_ + class250.aFloatArray2728[14]);
					float f_1261_ = ((float) (1.0 / Math.sqrt((double) (f_1258_ * f_1258_ + f_1259_ * f_1259_ + (f_1260_ * f_1260_)))) * (float) ((Class365) class365).anInt4490);
					class261.method3589(((Class355) class355).anInt4410, (((Class355) class355).anInt4405 * ((Class365) class365).aShort4487) >> 7, (((Class355) class355).anInt4409 * ((Class365) class365).aShort4486) >> 7, (f_1258_ + (float) ((Class355) class355).anInt4408 - f_1258_ * f_1261_), (f_1259_ + (float) ((Class355) class355).anInt4407 - f_1259_ * f_1261_), f_1260_ - f_1260_ * f_1261_);
					class261.method3584(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass261_10430);
					((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400.method3446(class261);
					class342.method4289(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10400);
					class342.aClass250_4354.method3444();
					class342.anInt4355 = ((Class355) class355).anInt4406;
					if (bool)
						class342.aFloat4358 = 1.0F - (((((AbstractModel) this).aClass106_Sub3_10825.aFloat10504) - f_1260_) / ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10504) - (((AbstractModel) this).aClass106_Sub3_10825.aFloat10503)));
					class342.anInterface43_4352 = null;
					if (((Class365) class365).aShort4489 != -1)
						class342.anInterface43_4352 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4444(((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(((Class365) class365).aShort4489 & 0xffff, 1387877708)));
					class342.method4288(bool);
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method1763(true);
		}
	}

	void method1436(int i, int[] is, int i_1262_, int i_1263_, int i_1264_, boolean bool, int i_1265_, int[] is_1266_) {
		int i_1267_ = is.length;
		if (i == 0) {
			i_1262_ <<= 4;
			i_1263_ <<= 4;
			i_1264_ <<= 4;
			int i_1268_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_1269_ = 0; i_1269_ < i_1267_; i_1269_++) {
				int i_1270_ = is[i_1269_];
				if (i_1270_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1271_ = ((AbstractModel) this).anIntArrayArray10792[i_1270_];
					for (int i_1272_ = 0; i_1272_ < is_1271_.length; i_1272_++) {
						int i_1273_ = is_1271_[i_1272_];
						if (((AbstractModel) this).aShortArray10810 == null || (i_1265_ & (((AbstractModel) this).aShortArray10810[i_1273_])) != 0) {
							((AbstractModel) this).anInt10862 += (((AbstractModel) this).vertexX[i_1273_]);
							((AbstractModel) this).anInt10863 += (((AbstractModel) this).vertexY[i_1273_]);
							((AbstractModel) this).anInt10794 += (((AbstractModel) this).vertexZ[i_1273_]);
							i_1268_++;
						}
					}
				}
			}
			if (i_1268_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_1268_ + i_1262_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_1268_ + i_1263_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_1268_ + i_1264_;
				((AbstractModel) this).aBool10865 = true;
			} else {
				((AbstractModel) this).anInt10862 = i_1262_;
				((AbstractModel) this).anInt10863 = i_1263_;
				((AbstractModel) this).anInt10794 = i_1264_;
			}
		} else if (i == 1) {
			if (is_1266_ != null) {
				int i_1274_ = ((is_1266_[0] * i_1262_ + is_1266_[1] * i_1263_ + is_1266_[2] * i_1264_ + 8192) >> 14);
				int i_1275_ = ((is_1266_[3] * i_1262_ + is_1266_[4] * i_1263_ + is_1266_[5] * i_1264_ + 8192) >> 14);
				int i_1276_ = ((is_1266_[6] * i_1262_ + is_1266_[7] * i_1263_ + is_1266_[8] * i_1264_ + 8192) >> 14);
				i_1262_ = i_1274_;
				i_1263_ = i_1275_;
				i_1264_ = i_1276_;
			}
			i_1262_ <<= 4;
			i_1263_ <<= 4;
			i_1264_ <<= 4;
			for (int i_1277_ = 0; i_1277_ < i_1267_; i_1277_++) {
				int i_1278_ = is[i_1277_];
				if (i_1278_ < ((AbstractModel) this).anIntArrayArray10792.length) {
					int[] is_1279_ = ((AbstractModel) this).anIntArrayArray10792[i_1278_];
					for (int i_1280_ = 0; i_1280_ < is_1279_.length; i_1280_++) {
						int i_1281_ = is_1279_[i_1280_];
						if (((AbstractModel) this).aShortArray10810 == null || (i_1265_ & (((AbstractModel) this).aShortArray10810[i_1281_])) != 0) {
							((AbstractModel) this).vertexX[i_1281_] += i_1262_;
							((AbstractModel) this).vertexY[i_1281_] += i_1263_;
							((AbstractModel) this).vertexZ[i_1281_] += i_1264_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1266_ != null) {
				int i_1282_ = is_1266_[9] << 4;
				int i_1283_ = is_1266_[10] << 4;
				int i_1284_ = is_1266_[11] << 4;
				int i_1285_ = is_1266_[12] << 4;
				int i_1286_ = is_1266_[13] << 4;
				int i_1287_ = is_1266_[14] << 4;
				if (((AbstractModel) this).aBool10865) {
					int i_1288_ = ((is_1266_[0] * ((AbstractModel) this).anInt10862 + is_1266_[3] * ((AbstractModel) this).anInt10863 + is_1266_[6] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_1289_ = ((is_1266_[1] * ((AbstractModel) this).anInt10862 + is_1266_[4] * ((AbstractModel) this).anInt10863 + is_1266_[7] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_1290_ = ((is_1266_[2] * ((AbstractModel) this).anInt10862 + is_1266_[5] * ((AbstractModel) this).anInt10863 + is_1266_[8] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					i_1288_ += i_1285_;
					i_1289_ += i_1286_;
					i_1290_ += i_1287_;
					((AbstractModel) this).anInt10862 = i_1288_;
					((AbstractModel) this).anInt10863 = i_1289_;
					((AbstractModel) this).anInt10794 = i_1290_;
					((AbstractModel) this).aBool10865 = false;
				}
				int[] is_1291_ = new int[9];
				int i_1292_ = Class325.anIntArray4105[i_1262_];
				int i_1293_ = Class325.anIntArray4103[i_1262_];
				int i_1294_ = Class325.anIntArray4105[i_1263_];
				int i_1295_ = Class325.anIntArray4103[i_1263_];
				int i_1296_ = Class325.anIntArray4105[i_1264_];
				int i_1297_ = Class325.anIntArray4103[i_1264_];
				int i_1298_ = i_1293_ * i_1296_ + 8192 >> 14;
				int i_1299_ = i_1293_ * i_1297_ + 8192 >> 14;
				is_1291_[0] = i_1294_ * i_1296_ + i_1295_ * i_1299_ + 8192 >> 14;
				is_1291_[1] = -i_1294_ * i_1297_ + i_1295_ * i_1298_ + 8192 >> 14;
				is_1291_[2] = i_1295_ * i_1292_ + 8192 >> 14;
				is_1291_[3] = i_1292_ * i_1297_ + 8192 >> 14;
				is_1291_[4] = i_1292_ * i_1296_ + 8192 >> 14;
				is_1291_[5] = -i_1293_;
				is_1291_[6] = -i_1295_ * i_1296_ + i_1294_ * i_1299_ + 8192 >> 14;
				is_1291_[7] = i_1295_ * i_1297_ + i_1294_ * i_1298_ + 8192 >> 14;
				is_1291_[8] = i_1294_ * i_1292_ + 8192 >> 14;
				int i_1300_ = ((is_1291_[0] * -((AbstractModel) this).anInt10862 + is_1291_[1] * -((AbstractModel) this).anInt10863 + is_1291_[2] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_1301_ = ((is_1291_[3] * -((AbstractModel) this).anInt10862 + is_1291_[4] * -((AbstractModel) this).anInt10863 + is_1291_[5] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_1302_ = ((is_1291_[6] * -((AbstractModel) this).anInt10862 + is_1291_[7] * -((AbstractModel) this).anInt10863 + is_1291_[8] * -((AbstractModel) this).anInt10794 + 8192) >> 14);
				int i_1303_ = i_1300_ + ((AbstractModel) this).anInt10862;
				int i_1304_ = i_1301_ + ((AbstractModel) this).anInt10863;
				int i_1305_ = i_1302_ + ((AbstractModel) this).anInt10794;
				int[] is_1306_ = new int[9];
				for (int i_1307_ = 0; i_1307_ < 3; i_1307_++) {
					for (int i_1308_ = 0; i_1308_ < 3; i_1308_++) {
						int i_1309_ = 0;
						for (int i_1310_ = 0; i_1310_ < 3; i_1310_++)
							i_1309_ += (is_1291_[i_1307_ * 3 + i_1310_] * is_1266_[i_1308_ * 3 + i_1310_]);
						is_1306_[i_1307_ * 3 + i_1308_] = i_1309_ + 8192 >> 14;
					}
				}
				int i_1311_ = ((is_1291_[0] * i_1285_ + is_1291_[1] * i_1286_ + is_1291_[2] * i_1287_ + 8192) >> 14);
				int i_1312_ = ((is_1291_[3] * i_1285_ + is_1291_[4] * i_1286_ + is_1291_[5] * i_1287_ + 8192) >> 14);
				int i_1313_ = ((is_1291_[6] * i_1285_ + is_1291_[7] * i_1286_ + is_1291_[8] * i_1287_ + 8192) >> 14);
				i_1311_ += i_1303_;
				i_1312_ += i_1304_;
				i_1313_ += i_1305_;
				int[] is_1314_ = new int[9];
				for (int i_1315_ = 0; i_1315_ < 3; i_1315_++) {
					for (int i_1316_ = 0; i_1316_ < 3; i_1316_++) {
						int i_1317_ = 0;
						for (int i_1318_ = 0; i_1318_ < 3; i_1318_++)
							i_1317_ += (is_1266_[i_1315_ * 3 + i_1318_] * is_1306_[i_1316_ + i_1318_ * 3]);
						is_1314_[i_1315_ * 3 + i_1316_] = i_1317_ + 8192 >> 14;
					}
				}
				int i_1319_ = ((is_1266_[0] * i_1311_ + is_1266_[1] * i_1312_ + is_1266_[2] * i_1313_ + 8192) >> 14);
				int i_1320_ = ((is_1266_[3] * i_1311_ + is_1266_[4] * i_1312_ + is_1266_[5] * i_1313_ + 8192) >> 14);
				int i_1321_ = ((is_1266_[6] * i_1311_ + is_1266_[7] * i_1312_ + is_1266_[8] * i_1313_ + 8192) >> 14);
				i_1319_ += i_1282_;
				i_1320_ += i_1283_;
				i_1321_ += i_1284_;
				for (int i_1322_ = 0; i_1322_ < i_1267_; i_1322_++) {
					int i_1323_ = is[i_1322_];
					if (i_1323_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1324_ = (((AbstractModel) this).anIntArrayArray10792[i_1323_]);
						for (int i_1325_ = 0; i_1325_ < is_1324_.length; i_1325_++) {
							int i_1326_ = is_1324_[i_1325_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10810[i_1326_])) != 0)) {
								int i_1327_ = ((is_1314_[0] * (((AbstractModel) this).vertexX[i_1326_]) + is_1314_[1] * (((AbstractModel) this).vertexY[i_1326_]) + is_1314_[2] * (((AbstractModel) this).vertexZ[i_1326_]) + 8192) >> 14);
								int i_1328_ = ((is_1314_[3] * (((AbstractModel) this).vertexX[i_1326_]) + is_1314_[4] * (((AbstractModel) this).vertexY[i_1326_]) + is_1314_[5] * (((AbstractModel) this).vertexZ[i_1326_]) + 8192) >> 14);
								int i_1329_ = ((is_1314_[6] * (((AbstractModel) this).vertexX[i_1326_]) + is_1314_[7] * (((AbstractModel) this).vertexY[i_1326_]) + is_1314_[8] * (((AbstractModel) this).vertexZ[i_1326_]) + 8192) >> 14);
								i_1327_ += i_1319_;
								i_1328_ += i_1320_;
								i_1329_ += i_1321_;
								((AbstractModel) this).vertexX[i_1326_] = i_1327_;
								((AbstractModel) this).vertexY[i_1326_] = i_1328_;
								((AbstractModel) this).vertexZ[i_1326_] = i_1329_;
							}
						}
					}
				}
			} else {
				for (int i_1330_ = 0; i_1330_ < i_1267_; i_1330_++) {
					int i_1331_ = is[i_1330_];
					if (i_1331_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1332_ = (((AbstractModel) this).anIntArrayArray10792[i_1331_]);
						for (int i_1333_ = 0; i_1333_ < is_1332_.length; i_1333_++) {
							int i_1334_ = is_1332_[i_1333_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10810[i_1334_])) != 0)) {
								((AbstractModel) this).vertexX[i_1334_] -= ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1334_] -= ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1334_] -= ((AbstractModel) this).anInt10794;
								if (i_1264_ != 0) {
									int i_1335_ = Class325.anIntArray4103[i_1264_];
									int i_1336_ = Class325.anIntArray4105[i_1264_];
									int i_1337_ = (((((AbstractModel) this).vertexY[i_1334_]) * i_1335_ + (((AbstractModel) this).vertexX[i_1334_]) * i_1336_ + 16383) >> 14);
									((AbstractModel) this).vertexY[i_1334_] = (((((AbstractModel) this).vertexY[i_1334_]) * i_1336_) - ((((AbstractModel) this).vertexX[i_1334_]) * i_1335_) + 16383) >> 14;
									((AbstractModel) this).vertexX[i_1334_] = i_1337_;
								}
								if (i_1262_ != 0) {
									int i_1338_ = Class325.anIntArray4103[i_1262_];
									int i_1339_ = Class325.anIntArray4105[i_1262_];
									int i_1340_ = (((((AbstractModel) this).vertexY[i_1334_]) * i_1339_ - (((AbstractModel) this).vertexZ[i_1334_]) * i_1338_ + 16383) >> 14);
									((AbstractModel) this).vertexZ[i_1334_] = (((((AbstractModel) this).vertexY[i_1334_]) * i_1338_) + ((((AbstractModel) this).vertexZ[i_1334_]) * i_1339_) + 16383) >> 14;
									((AbstractModel) this).vertexY[i_1334_] = i_1340_;
								}
								if (i_1263_ != 0) {
									int i_1341_ = Class325.anIntArray4103[i_1263_];
									int i_1342_ = Class325.anIntArray4105[i_1263_];
									int i_1343_ = (((((AbstractModel) this).vertexZ[i_1334_]) * i_1341_ + (((AbstractModel) this).vertexX[i_1334_]) * i_1342_ + 16383) >> 14);
									((AbstractModel) this).vertexZ[i_1334_] = (((((AbstractModel) this).vertexZ[i_1334_]) * i_1342_) - ((((AbstractModel) this).vertexX[i_1334_]) * i_1341_) + 16383) >> 14;
									((AbstractModel) this).vertexX[i_1334_] = i_1343_;
								}
								((AbstractModel) this).vertexX[i_1334_] += ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1334_] += ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1334_] += ((AbstractModel) this).anInt10794;
							}
						}
					}
				}
				if (bool) {
					for (int i_1344_ = 0; i_1344_ < i_1267_; i_1344_++) {
						int i_1345_ = is[i_1344_];
						if (i_1345_ < (((AbstractModel) this).anIntArrayArray10792).length) {
							int[] is_1346_ = (((AbstractModel) this).anIntArrayArray10792[i_1345_]);
							for (int i_1347_ = 0; i_1347_ < is_1346_.length; i_1347_++) {
								int i_1348_ = is_1346_[i_1347_];
								if ((((AbstractModel) this).aShortArray10810 == null) || (i_1265_ & (((AbstractModel) this).aShortArray10810[i_1348_])) != 0) {
									int i_1349_ = (((AbstractModel) this).sharedFaces[i_1348_]);
									int i_1350_ = (((AbstractModel) this).sharedFaces[i_1348_ + 1]);
									for (int i_1351_ = i_1349_; (i_1351_ < i_1350_ && ((((AbstractModel) this).aShortArray10853[i_1351_]) != 0)); i_1351_++) {
										int i_1352_ = (((((AbstractModel) this).aShortArray10853[i_1351_]) & 0xffff) - 1);
										if (i_1264_ != 0) {
											int i_1353_ = (Class325.anIntArray4103[i_1264_]);
											int i_1354_ = (Class325.anIntArray4105[i_1264_]);
											int i_1355_ = (((((AbstractModel) this).aShortArray10805[i_1352_]) * i_1353_ + (((AbstractModel) this).aShortArray10807[i_1352_]) * i_1354_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10805[i_1352_] = (short) ((((((AbstractModel) this).aShortArray10805[i_1352_]) * i_1354_) - ((((AbstractModel) this).aShortArray10807[i_1352_]) * i_1353_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10807[i_1352_] = (short) i_1355_;
										}
										if (i_1262_ != 0) {
											int i_1356_ = (Class325.anIntArray4103[i_1262_]);
											int i_1357_ = (Class325.anIntArray4105[i_1262_]);
											int i_1358_ = (((((AbstractModel) this).aShortArray10805[i_1352_]) * i_1357_ - (((AbstractModel) this).aShortArray10809[i_1352_]) * i_1356_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10809[i_1352_] = (short) ((((((AbstractModel) this).aShortArray10805[i_1352_]) * i_1356_) + ((((AbstractModel) this).aShortArray10809[i_1352_]) * i_1357_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10805[i_1352_] = (short) i_1358_;
										}
										if (i_1263_ != 0) {
											int i_1359_ = (Class325.anIntArray4103[i_1263_]);
											int i_1360_ = (Class325.anIntArray4105[i_1263_]);
											int i_1361_ = (((((AbstractModel) this).aShortArray10809[i_1352_]) * i_1359_ + (((AbstractModel) this).aShortArray10807[i_1352_]) * i_1360_ + 16383) >> 14);
											((AbstractModel) this).aShortArray10809[i_1352_] = (short) ((((((AbstractModel) this).aShortArray10809[i_1352_]) * i_1360_) - ((((AbstractModel) this).aShortArray10807[i_1352_]) * i_1359_) + 16383) >> 14);
											((AbstractModel) this).aShortArray10807[i_1352_] = (short) i_1361_;
										}
									}
								}
							}
						}
					}
					method10017();
				}
			}
		} else if (i == 3) {
			if (is_1266_ != null) {
				int i_1362_ = is_1266_[9] << 4;
				int i_1363_ = is_1266_[10] << 4;
				int i_1364_ = is_1266_[11] << 4;
				int i_1365_ = is_1266_[12] << 4;
				int i_1366_ = is_1266_[13] << 4;
				int i_1367_ = is_1266_[14] << 4;
				if (((AbstractModel) this).aBool10865) {
					int i_1368_ = ((is_1266_[0] * ((AbstractModel) this).anInt10862 + is_1266_[3] * ((AbstractModel) this).anInt10863 + is_1266_[6] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_1369_ = ((is_1266_[1] * ((AbstractModel) this).anInt10862 + is_1266_[4] * ((AbstractModel) this).anInt10863 + is_1266_[7] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					int i_1370_ = ((is_1266_[2] * ((AbstractModel) this).anInt10862 + is_1266_[5] * ((AbstractModel) this).anInt10863 + is_1266_[8] * ((AbstractModel) this).anInt10794 + 8192) >> 14);
					i_1368_ += i_1365_;
					i_1369_ += i_1366_;
					i_1370_ += i_1367_;
					((AbstractModel) this).anInt10862 = i_1368_;
					((AbstractModel) this).anInt10863 = i_1369_;
					((AbstractModel) this).anInt10794 = i_1370_;
					((AbstractModel) this).aBool10865 = false;
				}
				int i_1371_ = i_1262_ << 15 >> 7;
				int i_1372_ = i_1263_ << 15 >> 7;
				int i_1373_ = i_1264_ << 15 >> 7;
				int i_1374_ = i_1371_ * -((AbstractModel) this).anInt10862 + 8192 >> 14;
				int i_1375_ = i_1372_ * -((AbstractModel) this).anInt10863 + 8192 >> 14;
				int i_1376_ = i_1373_ * -((AbstractModel) this).anInt10794 + 8192 >> 14;
				int i_1377_ = i_1374_ + ((AbstractModel) this).anInt10862;
				int i_1378_ = i_1375_ + ((AbstractModel) this).anInt10863;
				int i_1379_ = i_1376_ + ((AbstractModel) this).anInt10794;
				int[] is_1380_ = new int[9];
				is_1380_[0] = i_1371_ * is_1266_[0] + 8192 >> 14;
				is_1380_[1] = i_1371_ * is_1266_[3] + 8192 >> 14;
				is_1380_[2] = i_1371_ * is_1266_[6] + 8192 >> 14;
				is_1380_[3] = i_1372_ * is_1266_[1] + 8192 >> 14;
				is_1380_[4] = i_1372_ * is_1266_[4] + 8192 >> 14;
				is_1380_[5] = i_1372_ * is_1266_[7] + 8192 >> 14;
				is_1380_[6] = i_1373_ * is_1266_[2] + 8192 >> 14;
				is_1380_[7] = i_1373_ * is_1266_[5] + 8192 >> 14;
				is_1380_[8] = i_1373_ * is_1266_[8] + 8192 >> 14;
				int i_1381_ = i_1371_ * i_1365_ + 8192 >> 14;
				int i_1382_ = i_1372_ * i_1366_ + 8192 >> 14;
				int i_1383_ = i_1373_ * i_1367_ + 8192 >> 14;
				i_1381_ += i_1377_;
				i_1382_ += i_1378_;
				i_1383_ += i_1379_;
				int[] is_1384_ = new int[9];
				for (int i_1385_ = 0; i_1385_ < 3; i_1385_++) {
					for (int i_1386_ = 0; i_1386_ < 3; i_1386_++) {
						int i_1387_ = 0;
						for (int i_1388_ = 0; i_1388_ < 3; i_1388_++)
							i_1387_ += (is_1266_[i_1385_ * 3 + i_1388_] * is_1380_[i_1386_ + i_1388_ * 3]);
						is_1384_[i_1385_ * 3 + i_1386_] = i_1387_ + 8192 >> 14;
					}
				}
				int i_1389_ = ((is_1266_[0] * i_1381_ + is_1266_[1] * i_1382_ + is_1266_[2] * i_1383_ + 8192) >> 14);
				int i_1390_ = ((is_1266_[3] * i_1381_ + is_1266_[4] * i_1382_ + is_1266_[5] * i_1383_ + 8192) >> 14);
				int i_1391_ = ((is_1266_[6] * i_1381_ + is_1266_[7] * i_1382_ + is_1266_[8] * i_1383_ + 8192) >> 14);
				i_1389_ += i_1362_;
				i_1390_ += i_1363_;
				i_1391_ += i_1364_;
				for (int i_1392_ = 0; i_1392_ < i_1267_; i_1392_++) {
					int i_1393_ = is[i_1392_];
					if (i_1393_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1394_ = (((AbstractModel) this).anIntArrayArray10792[i_1393_]);
						for (int i_1395_ = 0; i_1395_ < is_1394_.length; i_1395_++) {
							int i_1396_ = is_1394_[i_1395_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10810[i_1396_])) != 0)) {
								int i_1397_ = ((is_1384_[0] * (((AbstractModel) this).vertexX[i_1396_]) + is_1384_[1] * (((AbstractModel) this).vertexY[i_1396_]) + is_1384_[2] * (((AbstractModel) this).vertexZ[i_1396_]) + 8192) >> 14);
								int i_1398_ = ((is_1384_[3] * (((AbstractModel) this).vertexX[i_1396_]) + is_1384_[4] * (((AbstractModel) this).vertexY[i_1396_]) + is_1384_[5] * (((AbstractModel) this).vertexZ[i_1396_]) + 8192) >> 14);
								int i_1399_ = ((is_1384_[6] * (((AbstractModel) this).vertexX[i_1396_]) + is_1384_[7] * (((AbstractModel) this).vertexY[i_1396_]) + is_1384_[8] * (((AbstractModel) this).vertexZ[i_1396_]) + 8192) >> 14);
								i_1397_ += i_1389_;
								i_1398_ += i_1390_;
								i_1399_ += i_1391_;
								((AbstractModel) this).vertexX[i_1396_] = i_1397_;
								((AbstractModel) this).vertexY[i_1396_] = i_1398_;
								((AbstractModel) this).vertexZ[i_1396_] = i_1399_;
							}
						}
					}
				}
			} else {
				for (int i_1400_ = 0; i_1400_ < i_1267_; i_1400_++) {
					int i_1401_ = is[i_1400_];
					if (i_1401_ < ((AbstractModel) this).anIntArrayArray10792.length) {
						int[] is_1402_ = (((AbstractModel) this).anIntArrayArray10792[i_1401_]);
						for (int i_1403_ = 0; i_1403_ < is_1402_.length; i_1403_++) {
							int i_1404_ = is_1402_[i_1403_];
							if (((AbstractModel) this).aShortArray10810 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10810[i_1404_])) != 0)) {
								((AbstractModel) this).vertexX[i_1404_] -= ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1404_] -= ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1404_] -= ((AbstractModel) this).anInt10794;
								((AbstractModel) this).vertexX[i_1404_] = (((AbstractModel) this).vertexX[i_1404_]) * i_1262_ >> 7;
								((AbstractModel) this).vertexY[i_1404_] = (((AbstractModel) this).vertexY[i_1404_]) * i_1263_ >> 7;
								((AbstractModel) this).vertexZ[i_1404_] = (((AbstractModel) this).vertexZ[i_1404_]) * i_1264_ >> 7;
								((AbstractModel) this).vertexX[i_1404_] += ((AbstractModel) this).anInt10862;
								((AbstractModel) this).vertexY[i_1404_] += ((AbstractModel) this).anInt10863;
								((AbstractModel) this).vertexZ[i_1404_] += ((AbstractModel) this).anInt10794;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1405_ = false;
				for (int i_1406_ = 0; i_1406_ < i_1267_; i_1406_++) {
					int i_1407_ = is[i_1406_];
					if (i_1407_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1408_ = (((AbstractModel) this).anIntArrayArray10820[i_1407_]);
						for (int i_1409_ = 0; i_1409_ < is_1408_.length; i_1409_++) {
							int i_1410_ = is_1408_[i_1409_];
							if (((AbstractModel) this).aShortArray10839 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10839[i_1410_])) != 0)) {
								int i_1411_ = (((((AbstractModel) this).alpha[i_1410_]) & 0xff) + i_1262_ * 8);
								if (i_1411_ < 0)
									i_1411_ = 0;
								else if (i_1411_ > 255)
									i_1411_ = 255;
								((AbstractModel) this).alpha[i_1410_] = (byte) i_1411_;
							}
						}
						bool_1405_ = bool_1405_ | is_1408_.length > 0;
					}
				}
				if (bool_1405_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1412_ = 0; i_1412_ < ((AbstractModel) this).anInt10851; i_1412_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1412_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1412_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
						}
					}
					method10014();
				}
			}
		} else if (i == 7) {
			if (((AbstractModel) this).anIntArrayArray10820 != null) {
				boolean bool_1413_ = false;
				for (int i_1414_ = 0; i_1414_ < i_1267_; i_1414_++) {
					int i_1415_ = is[i_1414_];
					if (i_1415_ < ((AbstractModel) this).anIntArrayArray10820.length) {
						int[] is_1416_ = (((AbstractModel) this).anIntArrayArray10820[i_1415_]);
						for (int i_1417_ = 0; i_1417_ < is_1416_.length; i_1417_++) {
							int i_1418_ = is_1416_[i_1417_];
							if (((AbstractModel) this).aShortArray10839 == null || ((i_1265_ & (((AbstractModel) this).aShortArray10839[i_1418_])) != 0)) {
								int i_1419_ = ((((AbstractModel) this).aShortArray10793[i_1418_]) & 0xffff);
								int i_1420_ = i_1419_ >> 10 & 0x3f;
								int i_1421_ = i_1419_ >> 7 & 0x7;
								int i_1422_ = i_1419_ & 0x7f;
								i_1420_ = i_1420_ + i_1262_ & 0x3f;
								i_1421_ += i_1263_ / 4;
								if (i_1421_ < 0)
									i_1421_ = 0;
								else if (i_1421_ > 7)
									i_1421_ = 7;
								i_1422_ += i_1264_;
								if (i_1422_ < 0)
									i_1422_ = 0;
								else if (i_1422_ > 127)
									i_1422_ = 127;
								((AbstractModel) this).aShortArray10793[i_1418_] = (short) (i_1420_ << 10 | i_1421_ << 7 | i_1422_);
							}
						}
						bool_1413_ = bool_1413_ | is_1416_.length > 0;
					}
				}
				if (bool_1413_) {
					if (((AbstractModel) this).aClass365Array10852 != null) {
						for (int i_1423_ = 0; i_1423_ < ((AbstractModel) this).anInt10851; i_1423_++) {
							Class365 class365 = (((AbstractModel) this).aClass365Array10852[i_1423_]);
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[i_1423_]);
							((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | (Class460.anIntArray5213[((((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff)]) & 0xffffff);
						}
					}
					method10014();
				}
			}
		} else if (i == 8) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1424_ = 0; i_1424_ < i_1267_; i_1424_++) {
					int i_1425_ = is[i_1424_];
					if (i_1425_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1426_ = (((AbstractModel) this).anIntArrayArray10854[i_1425_]);
						for (int i_1427_ = 0; i_1427_ < is_1426_.length; i_1427_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1426_[i_1427_]]);
							((Class355) class355).anInt4408 += i_1262_;
							((Class355) class355).anInt4407 += i_1263_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1428_ = 0; i_1428_ < i_1267_; i_1428_++) {
					int i_1429_ = is[i_1428_];
					if (i_1429_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1430_ = (((AbstractModel) this).anIntArrayArray10854[i_1429_]);
						for (int i_1431_ = 0; i_1431_ < is_1430_.length; i_1431_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1430_[i_1431_]]);
							((Class355) class355).anInt4405 = (((Class355) class355).anInt4405 * i_1262_ >> 7);
							((Class355) class355).anInt4409 = (((Class355) class355).anInt4409 * i_1263_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((AbstractModel) this).anIntArrayArray10854 != null) {
				for (int i_1432_ = 0; i_1432_ < i_1267_; i_1432_++) {
					int i_1433_ = is[i_1432_];
					if (i_1433_ < ((AbstractModel) this).anIntArrayArray10854.length) {
						int[] is_1434_ = (((AbstractModel) this).anIntArrayArray10854[i_1433_]);
						for (int i_1435_ = 0; i_1435_ < is_1434_.length; i_1435_++) {
							Class355 class355 = (((AbstractModel) this).aClass355Array10864[is_1434_[i_1435_]]);
							((Class355) class355).anInt4410 = (((Class355) class355).anInt4410 + i_1262_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method1433(int i, int[] is, int i_1436_, int i_1437_, int i_1438_, boolean bool, int i_1439_, int[] is_1440_) {
	}

	void method1434(int i, int[] is, int i_1610_, int i_1611_, int i_1612_, boolean bool, int i_1613_, int[] is_1614_) {
	}

	void method1437(int i, int[] is, int i_1784_, int i_1785_, int i_1786_, boolean bool, int i_1787_, int[] is_1788_) {
	}

	public void method1359() {
		for (int i = 0; i < ((AbstractModel) this).maxVertexUsed; i++)
			((AbstractModel) this).vertexZ[i] = -((AbstractModel) this).vertexZ[i];
		for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++)
			((AbstractModel) this).aShortArray10809[i] = (short) -((AbstractModel) this).aShortArray10809[i];
		for (int i = 0; i < ((AbstractModel) this).anInt10833; i++) {
			short i_1958_ = ((AbstractModel) this).aShortArray10818[i];
			((AbstractModel) this).aShortArray10818[i] = ((AbstractModel) this).aShortArray10861[i];
			((AbstractModel) this).aShortArray10861[i] = i_1958_;
		}
		method10026();
		method10017();
		method10015();
		((AbstractModel) this).aBool10835 = false;
	}

	void method1377(int i, int[] is, int i_1959_, int i_1960_, int i_1961_, boolean bool, int i_1962_, int[] is_1963_) {
	}

	public void method1438(Class261 class261, int i, boolean bool) {
		if (((AbstractModel) this).aShortArray10810 != null) {
			Class261 class261_2133_ = class261;
			if (bool) {
				class261_2133_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass261_10443);
				class261_2133_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_2134_ = 0; i_2134_ < ((AbstractModel) this).maxVertexUsed; i_2134_++) {
				if ((i & ((AbstractModel) this).aShortArray10810[i_2134_]) != 0) {
					class261_2133_.method3582((float) (((AbstractModel) this).vertexX[i_2134_]), (float) (((AbstractModel) this).vertexY[i_2134_]), (float) (((AbstractModel) this).vertexZ[i_2134_]), fs);
					((AbstractModel) this).vertexX[i_2134_] = (int) fs[0];
					((AbstractModel) this).vertexY[i_2134_] = (int) fs[1];
					((AbstractModel) this).vertexZ[i_2134_] = (int) fs[2];
				}
			}
		}
	}

	public void method1474(byte i, byte[] is) {
		if (is == null) {
			for (int i_2135_ = 0; i_2135_ < ((AbstractModel) this).anInt10833; i_2135_++)
				((AbstractModel) this).alpha[i_2135_] = i;
		} else {
			for (int i_2136_ = 0; i_2136_ < ((AbstractModel) this).anInt10833; i_2136_++) {
				int i_2137_ = 255 - ((255 - (is[i_2136_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((AbstractModel) this).alpha[i_2136_] = (byte) i_2137_;
			}
		}
		method10014();
	}

	public void method1440(Class261 class261, Class90 class90, int i) {
		if (aClass350_10822 != null)
			aClass350_10822.method4371();
		if (class90 != null)
			class90.aBool1232 = false;
		if (((AbstractModel) this).uniqueVertices != 0) {
			Class250 class250 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10409);
			Class250 class250_2138_ = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
			Class250 class250_2139_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400);
			class250_2138_.method3446(class261);
			class250_2139_.method3442(class250_2138_);
			class250_2139_.method3445(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10495);
			if (!((AbstractModel) this).aBool10835)
				method10016();
			float[] fs = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArray10402);
			class250_2138_.method3449(0.0F, (float) ((AbstractModel) this).anInt10816, 0.0F, fs);
			float f = fs[0];
			float f_2140_ = fs[1];
			float f_2141_ = fs[2];
			class250_2138_.method3449(0.0F, (float) ((AbstractModel) this).anInt10837, 0.0F, fs);
			float f_2142_ = fs[0];
			float f_2143_ = fs[1];
			float f_2144_ = fs[2];
			for (int i_2145_ = 0; i_2145_ < 6; i_2145_++) {
				float[] fs_2146_ = (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloatArrayArray10405[i_2145_]);
				float f_2147_ = (fs_2146_[0] * f + fs_2146_[1] * f_2140_ + fs_2146_[2] * f_2141_ + fs_2146_[3] + (float) ((AbstractModel) this).anInt10834);
				float f_2148_ = (fs_2146_[0] * f_2142_ + fs_2146_[1] * f_2143_ + fs_2146_[2] * f_2144_ + fs_2146_[3] + (float) ((AbstractModel) this).anInt10834);
				if (f_2147_ < 0.0F && f_2148_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2149_ = true;
				int i_2150_ = ((((AbstractModel) this).anInt10843 + ((AbstractModel) this).anInt10790) >> 1);
				int i_2151_ = ((((AbstractModel) this).anInt10840 + ((AbstractModel) this).anInt10801) >> 1);
				int i_2152_ = i_2150_;
				int i_2153_ = ((AbstractModel) this).anInt10816;
				int i_2154_ = i_2151_;
				float f_2155_ = (class250_2139_.aFloatArray2728[0] * (float) i_2152_ + class250_2139_.aFloatArray2728[4] * (float) i_2153_ + class250_2139_.aFloatArray2728[8] * (float) i_2154_ + class250_2139_.aFloatArray2728[12]);
				float f_2156_ = (class250_2139_.aFloatArray2728[1] * (float) i_2152_ + class250_2139_.aFloatArray2728[5] * (float) i_2153_ + class250_2139_.aFloatArray2728[9] * (float) i_2154_ + class250_2139_.aFloatArray2728[13]);
				float f_2157_ = (class250_2139_.aFloatArray2728[2] * (float) i_2152_ + class250_2139_.aFloatArray2728[6] * (float) i_2153_ + class250_2139_.aFloatArray2728[10] * (float) i_2154_ + class250_2139_.aFloatArray2728[14]);
				float f_2158_ = (class250_2139_.aFloatArray2728[3] * (float) i_2152_ + class250_2139_.aFloatArray2728[7] * (float) i_2153_ + class250_2139_.aFloatArray2728[11] * (float) i_2154_ + class250_2139_.aFloatArray2728[15]);
				if (f_2157_ >= -f_2158_) {
					class90.anInt1230 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2155_ / f_2158_);
					class90.anInt1231 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2156_ / f_2158_);
				} else
					bool = true;
				i_2152_ = i_2150_;
				i_2153_ = ((AbstractModel) this).anInt10837;
				i_2154_ = i_2151_;
				float f_2159_ = (class250_2139_.aFloatArray2728[0] * (float) i_2152_ + class250_2139_.aFloatArray2728[4] * (float) i_2153_ + class250_2139_.aFloatArray2728[8] * (float) i_2154_ + class250_2139_.aFloatArray2728[12]);
				float f_2160_ = (class250_2139_.aFloatArray2728[1] * (float) i_2152_ + class250_2139_.aFloatArray2728[5] * (float) i_2153_ + class250_2139_.aFloatArray2728[9] * (float) i_2154_ + class250_2139_.aFloatArray2728[13]);
				float f_2161_ = (class250_2139_.aFloatArray2728[2] * (float) i_2152_ + class250_2139_.aFloatArray2728[6] * (float) i_2153_ + class250_2139_.aFloatArray2728[10] * (float) i_2154_ + class250_2139_.aFloatArray2728[14]);
				float f_2162_ = (class250_2139_.aFloatArray2728[3] * (float) i_2152_ + class250_2139_.aFloatArray2728[7] * (float) i_2153_ + class250_2139_.aFloatArray2728[11] * (float) i_2154_ + class250_2139_.aFloatArray2728[15]);
				if (f_2161_ >= -f_2162_) {
					class90.anInt1234 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2159_ / f_2162_);
					class90.anInt1233 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2160_ / f_2162_);
				} else
					bool = true;
				if (bool) {
					if (f_2157_ < -f_2158_ && f_2161_ < -f_2162_)
						bool_2149_ = false;
					else if (f_2157_ < -f_2158_) {
						float f_2163_ = (f_2157_ + f_2158_) / (f_2161_ + f_2162_) - 1.0F;
						float f_2164_ = f_2155_ + f_2163_ * (f_2159_ - f_2155_);
						float f_2165_ = f_2156_ + f_2163_ * (f_2160_ - f_2156_);
						float f_2166_ = f_2158_ + f_2163_ * (f_2162_ - f_2158_);
						class90.anInt1230 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2164_ / f_2166_));
						class90.anInt1231 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2165_ / f_2166_));
					} else if (f_2161_ < -f_2162_) {
						float f_2167_ = (f_2161_ + f_2162_) / (f_2157_ + f_2158_) - 1.0F;
						float f_2168_ = f_2159_ + f_2167_ * (f_2155_ - f_2159_);
						float f_2169_ = f_2160_ + f_2167_ * (f_2156_ - f_2160_);
						float f_2170_ = f_2162_ + f_2167_ * (f_2158_ - f_2162_);
						class90.anInt1234 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2168_ / f_2170_));
						class90.anInt1233 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2169_ / f_2170_));
					}
				}
				if (bool_2149_) {
					if (f_2157_ / f_2158_ > f_2161_ / f_2162_) {
						float f_2171_ = (f_2155_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2172_ = (f_2158_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1230 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2171_ / f_2172_));
					} else {
						float f_2173_ = (f_2159_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2174_ = (f_2162_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1234 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2173_ / f_2174_));
					}
					class90.aBool1232 = true;
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9686(i);
			method10021(class261);
			((AbstractModel) this).aClass106_Sub3_10825.method9686(0);
			class250_2138_.method3446(class261);
			class250_2138_.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
			method10025(class250_2138_);
		}
	}

	public void method1492(Class261 class261, Class90 class90, int i) {
		if (aClass350_10822 != null)
			aClass350_10822.method4371();
		if (class90 != null)
			class90.aBool1232 = false;
		if (((AbstractModel) this).uniqueVertices != 0) {
			Class250 class250 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10409);
			Class250 class250_2175_ = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
			Class250 class250_2176_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400);
			class250_2175_.method3446(class261);
			class250_2176_.method3442(class250_2175_);
			class250_2176_.method3445(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10495);
			if (!((AbstractModel) this).aBool10835)
				method10016();
			float[] fs = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArray10402);
			class250_2175_.method3449(0.0F, (float) ((AbstractModel) this).anInt10816, 0.0F, fs);
			float f = fs[0];
			float f_2177_ = fs[1];
			float f_2178_ = fs[2];
			class250_2175_.method3449(0.0F, (float) ((AbstractModel) this).anInt10837, 0.0F, fs);
			float f_2179_ = fs[0];
			float f_2180_ = fs[1];
			float f_2181_ = fs[2];
			for (int i_2182_ = 0; i_2182_ < 6; i_2182_++) {
				float[] fs_2183_ = (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloatArrayArray10405[i_2182_]);
				float f_2184_ = (fs_2183_[0] * f + fs_2183_[1] * f_2177_ + fs_2183_[2] * f_2178_ + fs_2183_[3] + (float) ((AbstractModel) this).anInt10834);
				float f_2185_ = (fs_2183_[0] * f_2179_ + fs_2183_[1] * f_2180_ + fs_2183_[2] * f_2181_ + fs_2183_[3] + (float) ((AbstractModel) this).anInt10834);
				if (f_2184_ < 0.0F && f_2185_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2186_ = true;
				int i_2187_ = ((((AbstractModel) this).anInt10843 + ((AbstractModel) this).anInt10790) >> 1);
				int i_2188_ = ((((AbstractModel) this).anInt10840 + ((AbstractModel) this).anInt10801) >> 1);
				int i_2189_ = i_2187_;
				int i_2190_ = ((AbstractModel) this).anInt10816;
				int i_2191_ = i_2188_;
				float f_2192_ = (class250_2176_.aFloatArray2728[0] * (float) i_2189_ + class250_2176_.aFloatArray2728[4] * (float) i_2190_ + class250_2176_.aFloatArray2728[8] * (float) i_2191_ + class250_2176_.aFloatArray2728[12]);
				float f_2193_ = (class250_2176_.aFloatArray2728[1] * (float) i_2189_ + class250_2176_.aFloatArray2728[5] * (float) i_2190_ + class250_2176_.aFloatArray2728[9] * (float) i_2191_ + class250_2176_.aFloatArray2728[13]);
				float f_2194_ = (class250_2176_.aFloatArray2728[2] * (float) i_2189_ + class250_2176_.aFloatArray2728[6] * (float) i_2190_ + class250_2176_.aFloatArray2728[10] * (float) i_2191_ + class250_2176_.aFloatArray2728[14]);
				float f_2195_ = (class250_2176_.aFloatArray2728[3] * (float) i_2189_ + class250_2176_.aFloatArray2728[7] * (float) i_2190_ + class250_2176_.aFloatArray2728[11] * (float) i_2191_ + class250_2176_.aFloatArray2728[15]);
				if (f_2194_ >= -f_2195_) {
					class90.anInt1230 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2192_ / f_2195_);
					class90.anInt1231 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2193_ / f_2195_);
				} else
					bool = true;
				i_2189_ = i_2187_;
				i_2190_ = ((AbstractModel) this).anInt10837;
				i_2191_ = i_2188_;
				float f_2196_ = (class250_2176_.aFloatArray2728[0] * (float) i_2189_ + class250_2176_.aFloatArray2728[4] * (float) i_2190_ + class250_2176_.aFloatArray2728[8] * (float) i_2191_ + class250_2176_.aFloatArray2728[12]);
				float f_2197_ = (class250_2176_.aFloatArray2728[1] * (float) i_2189_ + class250_2176_.aFloatArray2728[5] * (float) i_2190_ + class250_2176_.aFloatArray2728[9] * (float) i_2191_ + class250_2176_.aFloatArray2728[13]);
				float f_2198_ = (class250_2176_.aFloatArray2728[2] * (float) i_2189_ + class250_2176_.aFloatArray2728[6] * (float) i_2190_ + class250_2176_.aFloatArray2728[10] * (float) i_2191_ + class250_2176_.aFloatArray2728[14]);
				float f_2199_ = (class250_2176_.aFloatArray2728[3] * (float) i_2189_ + class250_2176_.aFloatArray2728[7] * (float) i_2190_ + class250_2176_.aFloatArray2728[11] * (float) i_2191_ + class250_2176_.aFloatArray2728[15]);
				if (f_2198_ >= -f_2199_) {
					class90.anInt1234 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2196_ / f_2199_);
					class90.anInt1233 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2197_ / f_2199_);
				} else
					bool = true;
				if (bool) {
					if (f_2194_ < -f_2195_ && f_2198_ < -f_2199_)
						bool_2186_ = false;
					else if (f_2194_ < -f_2195_) {
						float f_2200_ = (f_2194_ + f_2195_) / (f_2198_ + f_2199_) - 1.0F;
						float f_2201_ = f_2192_ + f_2200_ * (f_2196_ - f_2192_);
						float f_2202_ = f_2193_ + f_2200_ * (f_2197_ - f_2193_);
						float f_2203_ = f_2195_ + f_2200_ * (f_2199_ - f_2195_);
						class90.anInt1230 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2201_ / f_2203_));
						class90.anInt1231 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2202_ / f_2203_));
					} else if (f_2198_ < -f_2199_) {
						float f_2204_ = (f_2198_ + f_2199_) / (f_2194_ + f_2195_) - 1.0F;
						float f_2205_ = f_2196_ + f_2204_ * (f_2192_ - f_2196_);
						float f_2206_ = f_2197_ + f_2204_ * (f_2193_ - f_2197_);
						float f_2207_ = f_2199_ + f_2204_ * (f_2195_ - f_2199_);
						class90.anInt1234 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2205_ / f_2207_));
						class90.anInt1233 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2206_ / f_2207_));
					}
				}
				if (bool_2186_) {
					if (f_2194_ / f_2195_ > f_2198_ / f_2199_) {
						float f_2208_ = (f_2192_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2209_ = (f_2195_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1230 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2208_ / f_2209_));
					} else {
						float f_2210_ = (f_2196_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2211_ = (f_2199_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1234 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2210_ / f_2211_));
					}
					class90.aBool1232 = true;
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9686(i);
			method10021(class261);
			((AbstractModel) this).aClass106_Sub3_10825.method9686(0);
			class250_2175_.method3446(class261);
			class250_2175_.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
			method10025(class250_2175_);
		}
	}

	public void method1349(Class261 class261, Class90 class90, int i) {
		if (aClass350_10822 != null)
			aClass350_10822.method4371();
		if (class90 != null)
			class90.aBool1232 = false;
		if (((AbstractModel) this).uniqueVertices != 0) {
			Class250 class250 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10409);
			Class250 class250_2212_ = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
			Class250 class250_2213_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400);
			class250_2212_.method3446(class261);
			class250_2213_.method3442(class250_2212_);
			class250_2213_.method3445(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10495);
			if (!((AbstractModel) this).aBool10835)
				method10016();
			float[] fs = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArray10402);
			class250_2212_.method3449(0.0F, (float) ((AbstractModel) this).anInt10816, 0.0F, fs);
			float f = fs[0];
			float f_2214_ = fs[1];
			float f_2215_ = fs[2];
			class250_2212_.method3449(0.0F, (float) ((AbstractModel) this).anInt10837, 0.0F, fs);
			float f_2216_ = fs[0];
			float f_2217_ = fs[1];
			float f_2218_ = fs[2];
			for (int i_2219_ = 0; i_2219_ < 6; i_2219_++) {
				float[] fs_2220_ = (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloatArrayArray10405[i_2219_]);
				float f_2221_ = (fs_2220_[0] * f + fs_2220_[1] * f_2214_ + fs_2220_[2] * f_2215_ + fs_2220_[3] + (float) ((AbstractModel) this).anInt10834);
				float f_2222_ = (fs_2220_[0] * f_2216_ + fs_2220_[1] * f_2217_ + fs_2220_[2] * f_2218_ + fs_2220_[3] + (float) ((AbstractModel) this).anInt10834);
				if (f_2221_ < 0.0F && f_2222_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2223_ = true;
				int i_2224_ = ((((AbstractModel) this).anInt10843 + ((AbstractModel) this).anInt10790) >> 1);
				int i_2225_ = ((((AbstractModel) this).anInt10840 + ((AbstractModel) this).anInt10801) >> 1);
				int i_2226_ = i_2224_;
				int i_2227_ = ((AbstractModel) this).anInt10816;
				int i_2228_ = i_2225_;
				float f_2229_ = (class250_2213_.aFloatArray2728[0] * (float) i_2226_ + class250_2213_.aFloatArray2728[4] * (float) i_2227_ + class250_2213_.aFloatArray2728[8] * (float) i_2228_ + class250_2213_.aFloatArray2728[12]);
				float f_2230_ = (class250_2213_.aFloatArray2728[1] * (float) i_2226_ + class250_2213_.aFloatArray2728[5] * (float) i_2227_ + class250_2213_.aFloatArray2728[9] * (float) i_2228_ + class250_2213_.aFloatArray2728[13]);
				float f_2231_ = (class250_2213_.aFloatArray2728[2] * (float) i_2226_ + class250_2213_.aFloatArray2728[6] * (float) i_2227_ + class250_2213_.aFloatArray2728[10] * (float) i_2228_ + class250_2213_.aFloatArray2728[14]);
				float f_2232_ = (class250_2213_.aFloatArray2728[3] * (float) i_2226_ + class250_2213_.aFloatArray2728[7] * (float) i_2227_ + class250_2213_.aFloatArray2728[11] * (float) i_2228_ + class250_2213_.aFloatArray2728[15]);
				if (f_2231_ >= -f_2232_) {
					class90.anInt1230 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2229_ / f_2232_);
					class90.anInt1231 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2230_ / f_2232_);
				} else
					bool = true;
				i_2226_ = i_2224_;
				i_2227_ = ((AbstractModel) this).anInt10837;
				i_2228_ = i_2225_;
				float f_2233_ = (class250_2213_.aFloatArray2728[0] * (float) i_2226_ + class250_2213_.aFloatArray2728[4] * (float) i_2227_ + class250_2213_.aFloatArray2728[8] * (float) i_2228_ + class250_2213_.aFloatArray2728[12]);
				float f_2234_ = (class250_2213_.aFloatArray2728[1] * (float) i_2226_ + class250_2213_.aFloatArray2728[5] * (float) i_2227_ + class250_2213_.aFloatArray2728[9] * (float) i_2228_ + class250_2213_.aFloatArray2728[13]);
				float f_2235_ = (class250_2213_.aFloatArray2728[2] * (float) i_2226_ + class250_2213_.aFloatArray2728[6] * (float) i_2227_ + class250_2213_.aFloatArray2728[10] * (float) i_2228_ + class250_2213_.aFloatArray2728[14]);
				float f_2236_ = (class250_2213_.aFloatArray2728[3] * (float) i_2226_ + class250_2213_.aFloatArray2728[7] * (float) i_2227_ + class250_2213_.aFloatArray2728[11] * (float) i_2228_ + class250_2213_.aFloatArray2728[15]);
				if (f_2235_ >= -f_2236_) {
					class90.anInt1234 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2233_ / f_2236_);
					class90.anInt1233 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2234_ / f_2236_);
				} else
					bool = true;
				if (bool) {
					if (f_2231_ < -f_2232_ && f_2235_ < -f_2236_)
						bool_2223_ = false;
					else if (f_2231_ < -f_2232_) {
						float f_2237_ = (f_2231_ + f_2232_) / (f_2235_ + f_2236_) - 1.0F;
						float f_2238_ = f_2229_ + f_2237_ * (f_2233_ - f_2229_);
						float f_2239_ = f_2230_ + f_2237_ * (f_2234_ - f_2230_);
						float f_2240_ = f_2232_ + f_2237_ * (f_2236_ - f_2232_);
						class90.anInt1230 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2238_ / f_2240_));
						class90.anInt1231 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2239_ / f_2240_));
					} else if (f_2235_ < -f_2236_) {
						float f_2241_ = (f_2235_ + f_2236_) / (f_2231_ + f_2232_) - 1.0F;
						float f_2242_ = f_2233_ + f_2241_ * (f_2229_ - f_2233_);
						float f_2243_ = f_2234_ + f_2241_ * (f_2230_ - f_2234_);
						float f_2244_ = f_2236_ + f_2241_ * (f_2232_ - f_2236_);
						class90.anInt1234 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2242_ / f_2244_));
						class90.anInt1233 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2243_ / f_2244_));
					}
				}
				if (bool_2223_) {
					if (f_2231_ / f_2232_ > f_2235_ / f_2236_) {
						float f_2245_ = (f_2229_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2246_ = (f_2232_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1230 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2245_ / f_2246_));
					} else {
						float f_2247_ = (f_2233_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2248_ = (f_2236_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1234 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2247_ / f_2248_));
					}
					class90.aBool1232 = true;
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9686(i);
			method10021(class261);
			((AbstractModel) this).aClass106_Sub3_10825.method9686(0);
			class250_2212_.method3446(class261);
			class250_2212_.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
			method10025(class250_2212_);
		}
	}

	public void method1443(Class261 class261, Class90 class90, int i) {
		if (aClass350_10822 != null)
			aClass350_10822.method4371();
		if (class90 != null)
			class90.aBool1232 = false;
		if (((AbstractModel) this).uniqueVertices != 0) {
			Class250 class250 = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10409);
			Class250 class250_2249_ = ((AbstractModel) this).aClass106_Sub3_10825.aClass250_10399;
			Class250 class250_2250_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass250_10400);
			class250_2249_.method3446(class261);
			class250_2250_.method3442(class250_2249_);
			class250_2250_.method3445(((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aClass250_10495);
			if (!((AbstractModel) this).aBool10835)
				method10016();
			float[] fs = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloatArray10402);
			class250_2249_.method3449(0.0F, (float) ((AbstractModel) this).anInt10816, 0.0F, fs);
			float f = fs[0];
			float f_2251_ = fs[1];
			float f_2252_ = fs[2];
			class250_2249_.method3449(0.0F, (float) ((AbstractModel) this).anInt10837, 0.0F, fs);
			float f_2253_ = fs[0];
			float f_2254_ = fs[1];
			float f_2255_ = fs[2];
			for (int i_2256_ = 0; i_2256_ < 6; i_2256_++) {
				float[] fs_2257_ = (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloatArrayArray10405[i_2256_]);
				float f_2258_ = (fs_2257_[0] * f + fs_2257_[1] * f_2251_ + fs_2257_[2] * f_2252_ + fs_2257_[3] + (float) ((AbstractModel) this).anInt10834);
				float f_2259_ = (fs_2257_[0] * f_2253_ + fs_2257_[1] * f_2254_ + fs_2257_[2] * f_2255_ + fs_2257_[3] + (float) ((AbstractModel) this).anInt10834);
				if (f_2258_ < 0.0F && f_2259_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2260_ = true;
				int i_2261_ = ((((AbstractModel) this).anInt10843 + ((AbstractModel) this).anInt10790) >> 1);
				int i_2262_ = ((((AbstractModel) this).anInt10840 + ((AbstractModel) this).anInt10801) >> 1);
				int i_2263_ = i_2261_;
				int i_2264_ = ((AbstractModel) this).anInt10816;
				int i_2265_ = i_2262_;
				float f_2266_ = (class250_2250_.aFloatArray2728[0] * (float) i_2263_ + class250_2250_.aFloatArray2728[4] * (float) i_2264_ + class250_2250_.aFloatArray2728[8] * (float) i_2265_ + class250_2250_.aFloatArray2728[12]);
				float f_2267_ = (class250_2250_.aFloatArray2728[1] * (float) i_2263_ + class250_2250_.aFloatArray2728[5] * (float) i_2264_ + class250_2250_.aFloatArray2728[9] * (float) i_2265_ + class250_2250_.aFloatArray2728[13]);
				float f_2268_ = (class250_2250_.aFloatArray2728[2] * (float) i_2263_ + class250_2250_.aFloatArray2728[6] * (float) i_2264_ + class250_2250_.aFloatArray2728[10] * (float) i_2265_ + class250_2250_.aFloatArray2728[14]);
				float f_2269_ = (class250_2250_.aFloatArray2728[3] * (float) i_2263_ + class250_2250_.aFloatArray2728[7] * (float) i_2264_ + class250_2250_.aFloatArray2728[11] * (float) i_2265_ + class250_2250_.aFloatArray2728[15]);
				if (f_2268_ >= -f_2269_) {
					class90.anInt1230 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2266_ / f_2269_);
					class90.anInt1231 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2267_ / f_2269_);
				} else
					bool = true;
				i_2263_ = i_2261_;
				i_2264_ = ((AbstractModel) this).anInt10837;
				i_2265_ = i_2262_;
				float f_2270_ = (class250_2250_.aFloatArray2728[0] * (float) i_2263_ + class250_2250_.aFloatArray2728[4] * (float) i_2264_ + class250_2250_.aFloatArray2728[8] * (float) i_2265_ + class250_2250_.aFloatArray2728[12]);
				float f_2271_ = (class250_2250_.aFloatArray2728[1] * (float) i_2263_ + class250_2250_.aFloatArray2728[5] * (float) i_2264_ + class250_2250_.aFloatArray2728[9] * (float) i_2265_ + class250_2250_.aFloatArray2728[13]);
				float f_2272_ = (class250_2250_.aFloatArray2728[2] * (float) i_2263_ + class250_2250_.aFloatArray2728[6] * (float) i_2264_ + class250_2250_.aFloatArray2728[10] * (float) i_2265_ + class250_2250_.aFloatArray2728[14]);
				float f_2273_ = (class250_2250_.aFloatArray2728[3] * (float) i_2263_ + class250_2250_.aFloatArray2728[7] * (float) i_2264_ + class250_2250_.aFloatArray2728[11] * (float) i_2265_ + class250_2250_.aFloatArray2728[15]);
				if (f_2272_ >= -f_2273_) {
					class90.anInt1234 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417) * f_2270_ / f_2273_);
					class90.anInt1233 = (int) ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419) * f_2271_ / f_2273_);
				} else
					bool = true;
				if (bool) {
					if (f_2268_ < -f_2269_ && f_2272_ < -f_2273_)
						bool_2260_ = false;
					else if (f_2268_ < -f_2269_) {
						float f_2274_ = (f_2268_ + f_2269_) / (f_2272_ + f_2273_) - 1.0F;
						float f_2275_ = f_2266_ + f_2274_ * (f_2270_ - f_2266_);
						float f_2276_ = f_2267_ + f_2274_ * (f_2271_ - f_2267_);
						float f_2277_ = f_2269_ + f_2274_ * (f_2273_ - f_2269_);
						class90.anInt1230 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2275_ / f_2277_));
						class90.anInt1231 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2276_ / f_2277_));
					} else if (f_2272_ < -f_2273_) {
						float f_2278_ = (f_2272_ + f_2273_) / (f_2268_ + f_2269_) - 1.0F;
						float f_2279_ = f_2270_ + f_2278_ * (f_2266_ - f_2270_);
						float f_2280_ = f_2271_ + f_2278_ * (f_2267_ - f_2271_);
						float f_2281_ = f_2273_ + f_2278_ * (f_2269_ - f_2273_);
						class90.anInt1234 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2279_ / f_2281_));
						class90.anInt1233 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10407) + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10419 * f_2280_ / f_2281_));
					}
				}
				if (bool_2260_) {
					if (f_2268_ / f_2269_ > f_2272_ / f_2273_) {
						float f_2282_ = (f_2266_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2283_ = (f_2269_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1230 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2282_ / f_2283_));
					} else {
						float f_2284_ = (f_2270_ + (class250.aFloatArray2728[0] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[12]);
						float f_2285_ = (f_2273_ + (class250.aFloatArray2728[3] * (float) ((AbstractModel) this).anInt10834) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10416) - (float) class90.anInt1234 + (((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).aFloat10417 * f_2284_ / f_2285_));
					}
					class90.aBool1232 = true;
				}
			}
			((AbstractModel) this).aClass106_Sub3_10825.method9686(i);
			method10021(class261);
			((AbstractModel) this).aClass106_Sub3_10825.method9686(0);
			class250_2249_.method3446(class261);
			class250_2249_.method3445(((AbstractModel) this).aClass106_Sub3_10825.aClass250_10392);
			method10025(class250_2249_);
		}
	}

	public int method1461() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10840;
	}

	AbstractModel(Class106_Sub3 class106_sub3, int i, int i_2286_, boolean bool, boolean bool_2287_) {
		((AbstractModel) this).uniqueVertices = 0;
		((AbstractModel) this).anInt10833 = 0;
		((AbstractModel) this).anInt10815 = 0;
		((AbstractModel) this).aBool10848 = false;
		((AbstractModel) this).aBool10830 = true;
		((AbstractModel) this).aBool10803 = false;
		((AbstractModel) this).aBool10832 = false;
		((AbstractModel) this).aBool10835 = false;
		((AbstractModel) this).aBool10842 = false;
		((AbstractModel) this).aFloatArray10856 = new float[2];
		((AbstractModel) this).shadowX = new int[1];
		((AbstractModel) this).shadowY = new int[1];
		((AbstractModel) this).anIntArray10859 = new int[8];
		((AbstractModel) this).anIntArray10860 = new int[8];
		((AbstractModel) this).anIntArray10798 = new int[8];
		((AbstractModel) this).aClass106_Sub3_10825 = class106_sub3;
		((AbstractModel) this).anInt10829 = i;
		((AbstractModel) this).anInt10836 = i_2286_;
		((AbstractModel) this).aBool10848 = bool_2287_;
		if (bool || Class368.method4570(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).aClass356_10813 = new Class356(Class368.method4513((((AbstractModel) this).anInt10829), (((AbstractModel) this).anInt10836)));
		if (bool || Class368.method4498(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).aClass356_10828 = new Class356(Class368.method4516((((AbstractModel) this).anInt10829), (((AbstractModel) this).anInt10836)));
		if (bool || Class368.method4510(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).aClass356_10826 = new Class356(Class368.method4515((((AbstractModel) this).anInt10829), (((AbstractModel) this).anInt10836)));
		if (bool || Class368.method4509(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).aClass356_10827 = new Class356(Class368.method4514((((AbstractModel) this).anInt10829), (((AbstractModel) this).anInt10836)));
		if (bool || Class368.method4500(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
			((AbstractModel) this).aClass357_10824 = new Class357(Class368.method4517((((AbstractModel) this).anInt10829), (((AbstractModel) this).anInt10836)));
		if (bool && bool_2287_) {
			((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4411 = ((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4412 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4411 = ((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4412 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4411 = ((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4412 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4411 = ((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4412 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
		}
	}

	public Class572_Sub12_Sub18 method1447(Class572_Sub12_Sub18 class572_sub12_sub18) {
		if (((AbstractModel) this).uniqueVertices == 0)
			return null;
		if (!((AbstractModel) this).aBool10835)
			method10016();
		int i;
		int i_2288_;
		if ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionX) > 0) {
			i = ((((AbstractModel) this).anInt10843 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_2288_ = ((((AbstractModel) this).anInt10790 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		} else {
			i = ((((AbstractModel) this).anInt10843 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_2288_ = ((((AbstractModel) this).anInt10790 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionX) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		}
		int i_2289_;
		int i_2290_;
		if ((((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).sunProjectionY) > 0) {
			i_2289_ = ((((AbstractModel) this).anInt10840 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_2290_ = ((((AbstractModel) this).anInt10801 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		} else {
			i_2289_ = ((((AbstractModel) this).anInt10840 - ((((AbstractModel) this).anInt10816 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
			i_2290_ = ((((AbstractModel) this).anInt10801 - ((((AbstractModel) this).anInt10837 * ((Class106_Sub3) (((AbstractModel) this).aClass106_Sub3_10825)).sunProjectionY) >> 8)) >> ((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).shadowScale);
		}
		int i_2291_ = i_2288_ - i + 1;
		int i_2292_ = i_2290_ - i_2289_ + 1;
		NativeShadow class572_sub12_sub18_sub2 = (NativeShadow) class572_sub12_sub18;
		NativeShadow class572_sub12_sub18_sub2_2293_;
		if (class572_sub12_sub18_sub2 != null && class572_sub12_sub18_sub2.method10651(i_2291_, i_2292_)) {
			class572_sub12_sub18_sub2_2293_ = class572_sub12_sub18_sub2;
			class572_sub12_sub18_sub2_2293_.method10652();
		} else
			class572_sub12_sub18_sub2_2293_ = new NativeShadow((((AbstractModel) this).aClass106_Sub3_10825), i_2291_, i_2292_);
		class572_sub12_sub18_sub2_2293_.method10650(i, i_2289_, i_2288_, i_2290_);
		fillShadow(class572_sub12_sub18_sub2_2293_);
		return class572_sub12_sub18_sub2_2293_;
	}

	void method10026() {
		if (((AbstractModel) this).aClass356_10813 != null)
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4413 = false;
	}

	public void method1348() {
		if (!((AbstractModel) this).aBool10842) {
			if (!((AbstractModel) this).aBool10835)
				method10016();
			((AbstractModel) this).anInt10814 = ((AbstractModel) this).anInt10816;
			((AbstractModel) this).aBool10842 = true;
		}
	}

	public int method1435() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10834;
	}

	public int method1344() {
		return ((AbstractModel) this).aShort10796;
	}

	public int method1453() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10802;
	}

	public int method1455() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10790;
	}

	public int method1456() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10816;
	}

	public int method1457() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10816;
	}

	public int method1485() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10837;
	}

	public int method1378() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10834;
	}

	public int method1401() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10801;
	}

	boolean method10027() {
		boolean bool = !((Class356) ((AbstractModel) this).aClass356_10826).aBool4413;
		boolean bool_2294_ = ((((AbstractModel) this).anInt10836 & 0x37) != 0 && !(((Class356) ((AbstractModel) this).aClass356_10827).aBool4413));
		boolean bool_2295_ = !((Class356) ((AbstractModel) this).aClass356_10813).aBool4413;
		boolean bool_2296_ = !((Class356) ((AbstractModel) this).aClass356_10828).aBool4413;
		if (!bool_2295_ && !bool && !bool_2294_ && !bool_2296_)
			return true;
		boolean bool_2297_ = true;
		if (bool_2295_ && ((AbstractModel) this).aShortArray10831 != null) {
			if ((((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4411) == null)
				((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4411 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			Interface44 interface44 = (((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4411);
			interface44.method259(((AbstractModel) this).uniqueVertices * 12, 12);
			Unsafe unsafe = ((AbstractModel) this).aClass106_Sub3_10825.anUnsafe10377;
			if (unsafe != null) {
				int i = ((AbstractModel) this).uniqueVertices * 12;
				long l = interface44.method219(0, i);
				for (int i_2298_ = 0; i_2298_ < ((AbstractModel) this).uniqueVertices; i_2298_++) {
					short i_2299_ = ((AbstractModel) this).aShortArray10831[i_2298_];
					unsafe.putFloat(l, (float) (((AbstractModel) this).vertexX[i_2299_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((AbstractModel) this).vertexY[i_2299_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((AbstractModel) this).vertexZ[i_2299_]));
					l += 4L;
				}
				interface44.method110();
			} else {
				ByteBuffer bytebuffer = (((AbstractModel) this).aClass106_Sub3_10825.aByteBuffer10378);
				bytebuffer.clear();
				for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++) {
					bytebuffer.putFloat((float) ((AbstractModel) this).vertexX[(((AbstractModel) this).aShortArray10831[i])]);
					bytebuffer.putFloat((float) ((AbstractModel) this).vertexY[(((AbstractModel) this).aShortArray10831[i])]);
					bytebuffer.putFloat((float) ((AbstractModel) this).vertexZ[(((AbstractModel) this).aShortArray10831[i])]);
				}
				interface44.method223(0, bytebuffer.position(), (((AbstractModel) this).aClass106_Sub3_10825.aLong10444));
			}
			((Class356) ((AbstractModel) this).aClass356_10813).anInterface44_4412 = interface44;
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4413 = true;
		}
		if (bool) {
			if ((((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4411) == null)
				((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4411 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			Interface44 interface44 = (((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4411);
			interface44.method259(((AbstractModel) this).uniqueVertices * 4, 4);
			Unsafe unsafe = ((AbstractModel) this).aClass106_Sub3_10825.anUnsafe10377;
			if (unsafe != null) {
				int i = ((AbstractModel) this).uniqueVertices * 4;
				long l = interface44.method219(0, i);
				if ((((AbstractModel) this).anInt10836 & 0x37) == 0) {
					short[] is;
					short[] is_2300_;
					short[] is_2301_;
					byte[] is_2302_;
					if (((AbstractModel) this).aClass377_10823 != null) {
						is = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4573;
						is_2300_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4570;
						is_2301_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4572;
						is_2302_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aByteArray4571;
					} else {
						is = ((AbstractModel) this).aShortArray10807;
						is_2300_ = ((AbstractModel) this).aShortArray10805;
						is_2301_ = ((AbstractModel) this).aShortArray10809;
						is_2302_ = ((AbstractModel) this).aByteArray10838;
					}
					float f = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10455) * 768.0F / (float) ((AbstractModel) this).aShort10796);
					float f_2303_ = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10456) * 768.0F / (float) ((AbstractModel) this).aShort10796);
					for (int i_2304_ = 0; i_2304_ < ((AbstractModel) this).uniqueVertices; i_2304_++) {
						short i_2305_ = ((AbstractModel) this).aShortArray10806[i_2304_];
						int i_2306_ = method10022(((((AbstractModel) this).aShortArray10793[i_2305_]) & 0xffff), (((AbstractModel) this).aShortArray10821[i_2305_]), ((AbstractModel) this).aShort10795);
						float f_2307_ = ((float) (i_2306_ >> 16 & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10451));
						float f_2308_ = ((float) (i_2306_ >> 8 & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10439));
						float f_2309_ = ((float) (i_2306_ & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10453));
						byte i_2310_ = is_2302_[i_2304_];
						float f_2311_;
						if (i_2310_ == 0)
							f_2311_ = (((((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[0]) * (float) is[i_2304_] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[1]) * (float) is_2300_[i_2304_] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[2]) * (float) is_2301_[i_2304_]) * 0.0026041667F);
						else
							f_2311_ = (((((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[0]) * (float) is[i_2304_] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[1]) * (float) is_2300_[i_2304_] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[2]) * (float) is_2301_[i_2304_]) / ((float) i_2310_ * 256.0F));
						float f_2312_ = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10458) + f_2311_ * (f_2311_ < 0.0F ? f_2303_ : f));
						int i_2313_ = (int) (f_2307_ * f_2312_);
						if (i_2313_ < 0)
							i_2313_ = 0;
						else if (i_2313_ > 255)
							i_2313_ = 255;
						int i_2314_ = (int) (f_2308_ * f_2312_);
						if (i_2314_ < 0)
							i_2314_ = 0;
						else if (i_2314_ > 255)
							i_2314_ = 255;
						int i_2315_ = (int) (f_2309_ * f_2312_);
						if (i_2315_ < 0)
							i_2315_ = 0;
						else if (i_2315_ > 255)
							i_2315_ = 255;
						unsafe.putInt(l, (255 - (((AbstractModel) this).alpha[i_2305_]) << 24 | i_2313_ << 16 | i_2314_ << 8 | i_2315_));
						l += 4L;
					}
				} else {
					for (int i_2316_ = 0; i_2316_ < ((AbstractModel) this).uniqueVertices; i_2316_++) {
						short i_2317_ = ((AbstractModel) this).aShortArray10806[i_2316_];
						int i_2318_ = (255 - (((AbstractModel) this).alpha[i_2317_]) << 24 | method10022(((((AbstractModel) this).aShortArray10793[i_2317_]) & 0xffff), (((AbstractModel) this).aShortArray10821[i_2317_]), (((AbstractModel) this).aShort10795)));
						unsafe.putInt(l, i_2318_);
						l += 4L;
					}
				}
				interface44.method110();
			} else {
				ByteBuffer bytebuffer = (((AbstractModel) this).aClass106_Sub3_10825.aByteBuffer10378);
				bytebuffer.clear();
				if ((((AbstractModel) this).anInt10836 & 0x37) == 0) {
					short[] is;
					short[] is_2319_;
					short[] is_2320_;
					byte[] is_2321_;
					if (((AbstractModel) this).aClass377_10823 != null) {
						is = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4573;
						is_2319_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4570;
						is_2320_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aShortArray4572;
						is_2321_ = ((Class377) (((AbstractModel) this).aClass377_10823)).aByteArray4571;
					} else {
						is = ((AbstractModel) this).aShortArray10807;
						is_2319_ = ((AbstractModel) this).aShortArray10805;
						is_2320_ = ((AbstractModel) this).aShortArray10809;
						is_2321_ = ((AbstractModel) this).aByteArray10838;
					}
					float f = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10455) * 768.0F / (float) ((AbstractModel) this).aShort10796);
					float f_2322_ = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10456) * 768.0F / (float) ((AbstractModel) this).aShort10796);
					for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++) {
						short i_2323_ = ((AbstractModel) this).aShortArray10806[i];
						int i_2324_ = method10022(((((AbstractModel) this).aShortArray10793[i_2323_]) & 0xffff), (((AbstractModel) this).aShortArray10821[i_2323_]), ((AbstractModel) this).aShort10795);
						float f_2325_ = ((float) (i_2324_ >> 16 & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10451));
						float f_2326_ = ((float) (i_2324_ >> 8 & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10439));
						float f_2327_ = ((float) (i_2324_ & 0xff) * (((AbstractModel) this).aClass106_Sub3_10825.aFloat10453));
						byte i_2328_ = is_2321_[i];
						float f_2329_;
						if (i_2328_ == 0)
							f_2329_ = (((((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[0]) * (float) is[i] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[1]) * (float) is_2319_[i] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[2]) * (float) is_2320_[i]) * 0.0026041667F);
						else
							f_2329_ = (((((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[0]) * (float) is[i] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[1]) * (float) is_2319_[i] + (((AbstractModel) this).aClass106_Sub3_10825.aFloatArray10446[2]) * (float) is_2320_[i]) / ((float) i_2328_ * 256.0F));
						float f_2330_ = ((((AbstractModel) this).aClass106_Sub3_10825.aFloat10458) + f_2329_ * (f_2329_ < 0.0F ? f_2322_ : f));
						int i_2331_ = (int) (f_2325_ * f_2330_);
						if (i_2331_ < 0)
							i_2331_ = 0;
						else if (i_2331_ > 255)
							i_2331_ = 255;
						int i_2332_ = (int) (f_2326_ * f_2330_);
						if (i_2332_ < 0)
							i_2332_ = 0;
						else if (i_2332_ > 255)
							i_2332_ = 255;
						int i_2333_ = (int) (f_2327_ * f_2330_);
						if (i_2333_ < 0)
							i_2333_ = 0;
						else if (i_2333_ > 255)
							i_2333_ = 255;
						bytebuffer.putInt((255 - (((AbstractModel) this).alpha[i_2323_]) << 24) | i_2331_ << 16 | i_2332_ << 8 | i_2333_);
					}
				} else {
					for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++) {
						short i_2334_ = ((AbstractModel) this).aShortArray10806[i];
						int i_2335_ = (255 - (((AbstractModel) this).alpha[i_2334_]) << 24 | method10022(((((AbstractModel) this).aShortArray10793[i_2334_]) & 0xffff), (((AbstractModel) this).aShortArray10821[i_2334_]), (((AbstractModel) this).aShort10795)));
						bytebuffer.putInt(i_2335_);
					}
				}
				interface44.method223(0, bytebuffer.position(), (((AbstractModel) this).aClass106_Sub3_10825.aLong10444));
			}
			((Class356) ((AbstractModel) this).aClass356_10826).anInterface44_4412 = interface44;
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4413 = true;
		}
		if (bool_2294_) {
			if ((((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4411) == null)
				((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4411 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			Interface44 interface44 = (((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4411);
			interface44.method259(((AbstractModel) this).uniqueVertices * 12, 12);
			short[] is;
			short[] is_2336_;
			short[] is_2337_;
			byte[] is_2338_;
			if (((AbstractModel) this).aClass377_10823 != null) {
				is = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
				is_2336_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
				is_2337_ = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
				is_2338_ = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			} else {
				is = ((AbstractModel) this).aShortArray10807;
				is_2336_ = ((AbstractModel) this).aShortArray10805;
				is_2337_ = ((AbstractModel) this).aShortArray10809;
				is_2338_ = ((AbstractModel) this).aByteArray10838;
			}
			Unsafe unsafe = ((AbstractModel) this).aClass106_Sub3_10825.anUnsafe10377;
			if (unsafe != null) {
				int i = ((AbstractModel) this).uniqueVertices * 12;
				long l = interface44.method219(0, i);
				for (int i_2339_ = 0; i_2339_ < ((AbstractModel) this).uniqueVertices; i_2339_++) {
					Class240 class240 = new Class240((float) is[i_2339_], (float) is_2336_[i_2339_], (float) is_2337_[i_2339_]);
					if (class240.method3301() != 0.0F) {
						if (is_2338_[i_2339_] > 1)
							class240.method3286((float) is_2338_[i_2339_]);
						class240.method3273();
					}
					unsafe.putFloat(l, class240.aFloat2653);
					l += 4L;
					unsafe.putFloat(l, class240.aFloat2656);
					l += 4L;
					unsafe.putFloat(l, class240.aFloat2657);
					l += 4L;
				}
				interface44.method110();
			} else {
				ByteBuffer bytebuffer = (((AbstractModel) this).aClass106_Sub3_10825.aByteBuffer10378);
				bytebuffer.clear();
				for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++) {
					Class240 class240 = new Class240((float) is[i], (float) is_2336_[i], (float) is_2337_[i]);
					if (class240.method3301() != 0.0F) {
						if (is_2338_[i] > 1)
							class240.method3286((float) is_2338_[i]);
						class240.method3273();
					}
					bytebuffer.putFloat(class240.aFloat2653);
					bytebuffer.putFloat(class240.aFloat2656);
					bytebuffer.putFloat(class240.aFloat2657);
				}
				interface44.method223(0, bytebuffer.position(), (((AbstractModel) this).aClass106_Sub3_10825.aLong10444));
			}
			((Class356) ((AbstractModel) this).aClass356_10827).anInterface44_4412 = interface44;
			((Class356) ((AbstractModel) this).aClass356_10827).aBool4413 = true;
		}
		if (bool_2296_) {
			if ((((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4411) == null)
				((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4411 = ((AbstractModel) this).aClass106_Sub3_10825.method9723(((AbstractModel) this).aBool10848);
			Interface44 interface44 = (((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4411);
			interface44.method259(((AbstractModel) this).uniqueVertices * 8, 8);
			Unsafe unsafe = ((AbstractModel) this).aClass106_Sub3_10825.anUnsafe10377;
			if (unsafe != null) {
				int i = ((AbstractModel) this).uniqueVertices * 8;
				long l = interface44.method219(0, i);
				for (int i_2340_ = 0; i_2340_ < ((AbstractModel) this).uniqueVertices; i_2340_++) {
					unsafe.putFloat(l, (((AbstractModel) this).aFloatArray10811[i_2340_]));
					l += 4L;
					unsafe.putFloat(l, (((AbstractModel) this).aFloatArray10812[i_2340_]));
					l += 4L;
				}
				interface44.method110();
			} else {
				ByteBuffer bytebuffer = (((AbstractModel) this).aClass106_Sub3_10825.aByteBuffer10378);
				bytebuffer.clear();
				for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++) {
					bytebuffer.putFloat(((AbstractModel) this).aFloatArray10811[i]);
					bytebuffer.putFloat(((AbstractModel) this).aFloatArray10812[i]);
				}
				interface44.method223(0, bytebuffer.position(), (((AbstractModel) this).aClass106_Sub3_10825.aLong10444));
			}
			((Class356) ((AbstractModel) this).aClass356_10828).anInterface44_4412 = interface44;
			((Class356) ((AbstractModel) this).aClass356_10828).aBool4413 = true;
		}
		return bool_2297_;
	}

	public int method1480() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10801;
	}

	public int method1504() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10801;
	}

	public int method1416() {
		if (!((AbstractModel) this).aBool10842)
			method1483();
		return ((AbstractModel) this).anInt10814;
	}

	public void method1465(int i) {
		((AbstractModel) this).aShort10795 = (short) i;
		method10014();
	}

	public int method1391() {
		return ((AbstractModel) this).aShort10796;
	}

	public void method1409(int i) {
		if (((AbstractModel) this).aClass356_10813 != null)
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4414 = Class368.method4513(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10828 != null)
			((Class356) ((AbstractModel) this).aClass356_10828).aBool4414 = Class368.method4516(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10826 != null)
			((Class356) ((AbstractModel) this).aClass356_10826).aBool4414 = Class368.method4515(i, ((AbstractModel) this).anInt10836);
		if (((AbstractModel) this).aClass356_10827 != null)
			((Class356) ((AbstractModel) this).aClass356_10827).aBool4414 = Class368.method4514(i, ((AbstractModel) this).anInt10836);
		((AbstractModel) this).anInt10829 = i;
		if (((AbstractModel) this).aClass377_10823 != null && (((AbstractModel) this).anInt10829 & 0x10000) == 0) {
			((AbstractModel) this).aShortArray10807 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4573);
			((AbstractModel) this).aShortArray10805 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4570);
			((AbstractModel) this).aShortArray10809 = (((Class377) ((AbstractModel) this).aClass377_10823).aShortArray4572);
			((AbstractModel) this).aByteArray10838 = (((Class377) ((AbstractModel) this).aClass377_10823).aByteArray4571);
			((AbstractModel) this).aClass377_10823 = null;
		}
		((AbstractModel) this).aBool10830 = true;
		method10012();
	}

	public int method1468() {
		return ((AbstractModel) this).aShort10796;
	}

	public int method1469() {
		return ((AbstractModel) this).aShort10796;
	}

	public boolean method1445(int i, int i_2341_, Class261 class261, boolean bool, int i_2342_) {
		return method10018(i, i_2341_, 0, 0, class261, bool, i_2342_);
	}

	public byte[] method1392() {
		return ((AbstractModel) this).alpha;
	}

	public void method1448() {
		if (!((AbstractModel) this).aBool10842) {
			if (!((AbstractModel) this).aBool10835)
				method10016();
			((AbstractModel) this).anInt10814 = ((AbstractModel) this).anInt10816;
			((AbstractModel) this).aBool10842 = true;
		}
	}

	public void method1473(byte i, byte[] is) {
		if (is == null) {
			for (int i_2343_ = 0; i_2343_ < ((AbstractModel) this).anInt10833; i_2343_++)
				((AbstractModel) this).alpha[i_2343_] = i;
		} else {
			for (int i_2344_ = 0; i_2344_ < ((AbstractModel) this).anInt10833; i_2344_++) {
				int i_2345_ = 255 - ((255 - (is[i_2344_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((AbstractModel) this).alpha[i_2344_] = (byte) i_2345_;
			}
		}
		method10014();
	}

	public boolean method1444(int i, int i_2346_, Class261 class261, boolean bool, int i_2347_) {
		return method10018(i, i_2346_, 0, 0, class261, bool, i_2347_);
	}

	public void method1475(short i, short i_2348_) {
		MapSize mapSize = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396;
		for (int i_2349_ = 0; i_2349_ < ((AbstractModel) this).anInt10833; i_2349_++) {
			if (((AbstractModel) this).aShortArray10821[i_2349_] == i)
				((AbstractModel) this).aShortArray10821[i_2349_] = i_2348_;
		}
		byte i_2350_ = 0;
		byte i_2351_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, 539710962);
			i_2350_ = class101.aByte1366;
			i_2351_ = class101.aByte1368;
		}
		byte i_2352_ = 0;
		byte i_2353_ = 0;
		if (i_2348_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_2348_ & 0xffff, -82150157);
			i_2352_ = class101.aByte1366;
			i_2353_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((AbstractModel) this).aBool10832 = true;
		}
		if (i_2350_ != i_2352_ | i_2351_ != i_2353_) {
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2354_ = 0; i_2354_ < ((AbstractModel) this).anInt10851; i_2354_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2354_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2354_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		}
	}

	public void method1476(short i, short i_2355_) {
		MapSize mapSize = ((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396;
		for (int i_2356_ = 0; i_2356_ < ((AbstractModel) this).anInt10833; i_2356_++) {
			if (((AbstractModel) this).aShortArray10821[i_2356_] == i)
				((AbstractModel) this).aShortArray10821[i_2356_] = i_2355_;
		}
		byte i_2357_ = 0;
		byte i_2358_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, 1542035149);
			i_2357_ = class101.aByte1366;
			i_2358_ = class101.aByte1368;
		}
		byte i_2359_ = 0;
		byte i_2360_ = 0;
		if (i_2355_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_2355_ & 0xffff, 1611390497);
			i_2359_ = class101.aByte1366;
			i_2360_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((AbstractModel) this).aBool10832 = true;
		}
		if (i_2357_ != i_2359_ | i_2358_ != i_2360_) {
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2361_ = 0; i_2361_ < ((AbstractModel) this).anInt10851; i_2361_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2361_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2361_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		}
	}

	public void method1354(int i, int i_2362_, int i_2363_, int i_2364_) {
		for (int i_2365_ = 0; i_2365_ < ((AbstractModel) this).anInt10833; i_2365_++) {
			int i_2366_ = ((AbstractModel) this).aShortArray10793[i_2365_] & 0xffff;
			int i_2367_ = i_2366_ >> 10 & 0x3f;
			int i_2368_ = i_2366_ >> 7 & 0x7;
			int i_2369_ = i_2366_ & 0x7f;
			if (i != -1)
				i_2367_ += (i - i_2367_) * i_2364_ >> 7;
			if (i_2362_ != -1)
				i_2368_ += (i_2362_ - i_2368_) * i_2364_ >> 7;
			if (i_2363_ != -1)
				i_2369_ += (i_2363_ - i_2369_) * i_2364_ >> 7;
			((AbstractModel) this).aShortArray10793[i_2365_] = (short) (i_2367_ << 10 | i_2368_ << 7 | i_2369_);
		}
		if (((AbstractModel) this).aClass365Array10852 != null) {
			for (int i_2370_ = 0; i_2370_ < ((AbstractModel) this).anInt10851; i_2370_++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2370_];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2370_];
				((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
			}
		}
		method10014();
	}

	public void method1477(int i, int i_2371_, int i_2372_, int i_2373_) {
		for (int i_2374_ = 0; i_2374_ < ((AbstractModel) this).anInt10833; i_2374_++) {
			int i_2375_ = ((AbstractModel) this).aShortArray10793[i_2374_] & 0xffff;
			int i_2376_ = i_2375_ >> 10 & 0x3f;
			int i_2377_ = i_2375_ >> 7 & 0x7;
			int i_2378_ = i_2375_ & 0x7f;
			if (i != -1)
				i_2376_ += (i - i_2376_) * i_2373_ >> 7;
			if (i_2371_ != -1)
				i_2377_ += (i_2371_ - i_2377_) * i_2373_ >> 7;
			if (i_2372_ != -1)
				i_2378_ += (i_2372_ - i_2378_) * i_2373_ >> 7;
			((AbstractModel) this).aShortArray10793[i_2374_] = (short) (i_2376_ << 10 | i_2377_ << 7 | i_2378_);
		}
		if (((AbstractModel) this).aClass365Array10852 != null) {
			for (int i_2379_ = 0; i_2379_ < ((AbstractModel) this).anInt10851; i_2379_++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2379_];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2379_];
				((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
			}
		}
		method10014();
	}

	void method1497(int i, int i_2380_, int i_2381_, int i_2382_) {
		if (i == 0) {
			int i_2383_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_2384_ = 0; i_2384_ < ((AbstractModel) this).maxVertexUsed; i_2384_++) {
				((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_2384_];
				((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_2384_];
				((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_2384_];
				i_2383_++;
			}
			if (i_2383_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_2383_ + i_2380_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_2383_ + i_2381_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_2383_ + i_2382_;
			} else {
				((AbstractModel) this).anInt10862 = i_2380_;
				((AbstractModel) this).anInt10863 = i_2381_;
				((AbstractModel) this).anInt10794 = i_2382_;
			}
		} else if (i == 1) {
			for (int i_2385_ = 0; i_2385_ < ((AbstractModel) this).maxVertexUsed; i_2385_++) {
				((AbstractModel) this).vertexX[i_2385_] += i_2380_;
				((AbstractModel) this).vertexY[i_2385_] += i_2381_;
				((AbstractModel) this).vertexZ[i_2385_] += i_2382_;
			}
		} else if (i == 2) {
			for (int i_2386_ = 0; i_2386_ < ((AbstractModel) this).maxVertexUsed; i_2386_++) {
				((AbstractModel) this).vertexX[i_2386_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2386_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2386_] -= ((AbstractModel) this).anInt10794;
				if (i_2382_ != 0) {
					int i_2387_ = Class325.anIntArray4103[i_2382_];
					int i_2388_ = Class325.anIntArray4105[i_2382_];
					int i_2389_ = (((((AbstractModel) this).vertexY[i_2386_] * i_2387_) + (((AbstractModel) this).vertexX[i_2386_] * i_2388_) + 16383) >> 14);
					((AbstractModel) this).vertexY[i_2386_] = ((((AbstractModel) this).vertexY[i_2386_] * i_2388_) - (((AbstractModel) this).vertexX[i_2386_] * i_2387_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2386_] = i_2389_;
				}
				if (i_2380_ != 0) {
					int i_2390_ = Class325.anIntArray4103[i_2380_];
					int i_2391_ = Class325.anIntArray4105[i_2380_];
					int i_2392_ = (((((AbstractModel) this).vertexY[i_2386_] * i_2391_) - (((AbstractModel) this).vertexZ[i_2386_] * i_2390_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2386_] = ((((AbstractModel) this).vertexY[i_2386_] * i_2390_) + (((AbstractModel) this).vertexZ[i_2386_] * i_2391_) + 16383) >> 14;
					((AbstractModel) this).vertexY[i_2386_] = i_2392_;
				}
				if (i_2381_ != 0) {
					int i_2393_ = Class325.anIntArray4103[i_2381_];
					int i_2394_ = Class325.anIntArray4105[i_2381_];
					int i_2395_ = (((((AbstractModel) this).vertexZ[i_2386_] * i_2393_) + (((AbstractModel) this).vertexX[i_2386_] * i_2394_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2386_] = ((((AbstractModel) this).vertexZ[i_2386_] * i_2394_) - (((AbstractModel) this).vertexX[i_2386_] * i_2393_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2386_] = i_2395_;
				}
				((AbstractModel) this).vertexX[i_2386_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2386_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2386_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 3) {
			for (int i_2396_ = 0; i_2396_ < ((AbstractModel) this).maxVertexUsed; i_2396_++) {
				((AbstractModel) this).vertexX[i_2396_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2396_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2396_] -= ((AbstractModel) this).anInt10794;
				((AbstractModel) this).vertexX[i_2396_] = (((AbstractModel) this).vertexX[i_2396_] * i_2380_ / 128);
				((AbstractModel) this).vertexY[i_2396_] = (((AbstractModel) this).vertexY[i_2396_] * i_2381_ / 128);
				((AbstractModel) this).vertexZ[i_2396_] = (((AbstractModel) this).vertexZ[i_2396_] * i_2382_ / 128);
				((AbstractModel) this).vertexX[i_2396_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2396_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2396_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 5) {
			for (int i_2397_ = 0; i_2397_ < ((AbstractModel) this).anInt10833; i_2397_++) {
				int i_2398_ = ((((AbstractModel) this).alpha[i_2397_] & 0xff) + i_2380_ * 8);
				if (i_2398_ < 0)
					i_2398_ = 0;
				else if (i_2398_ > 255)
					i_2398_ = 255;
				((AbstractModel) this).alpha[i_2397_] = (byte) i_2398_;
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2399_ = 0; i_2399_ < ((AbstractModel) this).anInt10851; i_2399_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2399_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2399_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
				}
			}
			method10014();
		} else if (i == 7) {
			for (int i_2400_ = 0; i_2400_ < ((AbstractModel) this).anInt10833; i_2400_++) {
				int i_2401_ = ((AbstractModel) this).aShortArray10793[i_2400_] & 0xffff;
				int i_2402_ = i_2401_ >> 10 & 0x3f;
				int i_2403_ = i_2401_ >> 7 & 0x7;
				int i_2404_ = i_2401_ & 0x7f;
				i_2402_ = i_2402_ + i_2380_ & 0x3f;
				i_2403_ += i_2381_ / 4;
				if (i_2403_ < 0)
					i_2403_ = 0;
				else if (i_2403_ > 7)
					i_2403_ = 7;
				i_2404_ += i_2382_;
				if (i_2404_ < 0)
					i_2404_ = 0;
				else if (i_2404_ > 127)
					i_2404_ = 127;
				((AbstractModel) this).aShortArray10793[i_2400_] = (short) (i_2402_ << 10 | i_2403_ << 7 | i_2404_);
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2405_ = 0; i_2405_ < ((AbstractModel) this).anInt10851; i_2405_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2405_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2405_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		} else if (i == 8) {
			for (int i_2406_ = 0; i_2406_ < ((AbstractModel) this).anInt10851; i_2406_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2406_];
				((Class355) class355).anInt4408 += i_2380_;
				((Class355) class355).anInt4407 += i_2381_;
			}
		} else if (i == 10) {
			for (int i_2407_ = 0; i_2407_ < ((AbstractModel) this).anInt10851; i_2407_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2407_];
				((Class355) class355).anInt4405 = ((Class355) class355).anInt4405 * i_2380_ >> 7;
				((Class355) class355).anInt4409 = ((Class355) class355).anInt4409 * i_2381_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2408_ = 0; i_2408_ < ((AbstractModel) this).anInt10851; i_2408_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2408_];
				((Class355) class355).anInt4410 = ((Class355) class355).anInt4410 + i_2380_ & 0x3fff;
			}
		}
	}

	public void method1412(int i) {
		int i_2409_ = Class325.anIntArray4103[i];
		int i_2410_ = Class325.anIntArray4105[i];
		for (int i_2411_ = 0; i_2411_ < ((AbstractModel) this).maxVertexUsed; i_2411_++) {
			int i_2412_ = ((((AbstractModel) this).vertexZ[i_2411_] * i_2409_ + ((AbstractModel) this).vertexX[i_2411_] * i_2410_) >> 14);
			((AbstractModel) this).vertexZ[i_2411_] = ((((AbstractModel) this).vertexZ[i_2411_] * i_2410_ - ((AbstractModel) this).vertexX[i_2411_] * i_2409_) >> 14);
			((AbstractModel) this).vertexX[i_2411_] = i_2412_;
		}
		for (int i_2413_ = 0; i_2413_ < ((AbstractModel) this).uniqueVertices; i_2413_++) {
			int i_2414_ = ((((AbstractModel) this).aShortArray10809[i_2413_] * i_2409_ + (((AbstractModel) this).aShortArray10807[i_2413_] * i_2410_)) >> 14);
			((AbstractModel) this).aShortArray10809[i_2413_] = (short) (((((AbstractModel) this).aShortArray10809[i_2413_] * i_2410_) - (((AbstractModel) this).aShortArray10807[i_2413_] * i_2409_)) >> 14);
			((AbstractModel) this).aShortArray10807[i_2413_] = (short) i_2414_;
		}
		method10026();
		method10017();
		((AbstractModel) this).aBool10835 = false;
	}

	public Class84[] method1374() {
		return ((AbstractModel) this).aClass84Array10841;
	}

	public Class84[] method1481() {
		return ((AbstractModel) this).aClass84Array10841;
	}

	public Class175[] method1482() {
		return ((AbstractModel) this).aClass175Array10850;
	}

	public Class175[] method1389() {
		return ((AbstractModel) this).aClass175Array10850;
	}

	public boolean method1484() {
		if (((AbstractModel) this).aShortArray10821 == null)
			return true;
		for (int i = 0; i < ((AbstractModel) this).aShortArray10821.length; i++) {
			if (((AbstractModel) this).aShortArray10821[i] != -1 && !(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4448((((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(((AbstractModel) this).aShortArray10821[i], -461372304)), -1)))
				return false;
		}
		return true;
	}

	void method10028() {
		int i = 32767;
		int i_2415_ = 32767;
		int i_2416_ = 32767;
		int i_2417_ = -32768;
		int i_2418_ = -32768;
		int i_2419_ = -32768;
		int i_2420_ = 0;
		int i_2421_ = 0;
		for (int i_2422_ = 0; i_2422_ < ((AbstractModel) this).maxVertexUsed; i_2422_++) {
			int i_2423_ = ((AbstractModel) this).vertexX[i_2422_];
			int i_2424_ = ((AbstractModel) this).vertexY[i_2422_];
			int i_2425_ = ((AbstractModel) this).vertexZ[i_2422_];
			if (i_2423_ < i)
				i = i_2423_;
			if (i_2423_ > i_2417_)
				i_2417_ = i_2423_;
			if (i_2424_ < i_2415_)
				i_2415_ = i_2424_;
			if (i_2424_ > i_2418_)
				i_2418_ = i_2424_;
			if (i_2425_ < i_2416_)
				i_2416_ = i_2425_;
			if (i_2425_ > i_2419_)
				i_2419_ = i_2425_;
			int i_2426_ = i_2423_ * i_2423_ + i_2425_ * i_2425_;
			if (i_2426_ > i_2420_)
				i_2420_ = i_2426_;
			i_2426_ = i_2423_ * i_2423_ + i_2425_ * i_2425_ + i_2424_ * i_2424_;
			if (i_2426_ > i_2421_)
				i_2421_ = i_2426_;
		}
		((AbstractModel) this).anInt10843 = i;
		((AbstractModel) this).anInt10790 = i_2417_;
		((AbstractModel) this).anInt10816 = i_2415_;
		((AbstractModel) this).anInt10837 = i_2418_;
		((AbstractModel) this).anInt10840 = i_2416_;
		((AbstractModel) this).anInt10801 = i_2419_;
		((AbstractModel) this).anInt10834 = (int) (Math.sqrt((double) i_2420_) + 0.99);
		((AbstractModel) this).anInt10802 = (int) (Math.sqrt((double) i_2421_) + 0.99);
		((AbstractModel) this).aBool10835 = true;
	}

	public int method1390() {
		return ((AbstractModel) this).aShort10795;
	}

	public void method1487(int i) {
		int i_2427_ = Class325.anIntArray4103[i];
		int i_2428_ = Class325.anIntArray4105[i];
		for (int i_2429_ = 0; i_2429_ < ((AbstractModel) this).maxVertexUsed; i_2429_++) {
			int i_2430_ = ((((AbstractModel) this).vertexY[i_2429_] * i_2428_ - ((AbstractModel) this).vertexZ[i_2429_] * i_2427_) >> 14);
			((AbstractModel) this).vertexZ[i_2429_] = ((((AbstractModel) this).vertexY[i_2429_] * i_2427_ + ((AbstractModel) this).vertexZ[i_2429_] * i_2428_) >> 14);
			((AbstractModel) this).vertexY[i_2429_] = i_2430_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	boolean method10029() {
		if (((Class357) ((AbstractModel) this).aClass357_10824).aBool4416)
			return true;
		if ((((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4418) == null)
			((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4418 = ((AbstractModel) this).aClass106_Sub3_10825.method9671(false);
		Interface46 interface46 = (((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4418);
		interface46.method265(((AbstractModel) this).anInt10815 * 6);
		Unsafe unsafe = ((AbstractModel) this).aClass106_Sub3_10825.anUnsafe10377;
		if (unsafe != null) {
			int i = ((AbstractModel) this).anInt10815 * 6;
			long l = interface46.method219(0, i);
			if (l == 0L)
				return false;
			for (int i_2431_ = 0; i_2431_ < ((AbstractModel) this).anInt10815; i_2431_++) {
				unsafe.putShort(l, (((AbstractModel) this).aShortArray10818[i_2431_]));
				l += 2L;
				unsafe.putShort(l, (((AbstractModel) this).aShortArray10819[i_2431_]));
				l += 2L;
				unsafe.putShort(l, (((AbstractModel) this).aShortArray10861[i_2431_]));
				l += 2L;
			}
			interface46.method110();
			((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4415 = interface46;
			((Class357) ((AbstractModel) this).aClass357_10824).aBool4416 = true;
			((AbstractModel) this).aBool10830 = true;
			return true;
		}
		ByteBuffer bytebuffer = ((AbstractModel) this).aClass106_Sub3_10825.aByteBuffer10378;
		bytebuffer.clear();
		for (int i = 0; i < ((AbstractModel) this).anInt10815; i++) {
			bytebuffer.putShort(((AbstractModel) this).aShortArray10818[i]);
			bytebuffer.putShort(((AbstractModel) this).aShortArray10819[i]);
			bytebuffer.putShort(((AbstractModel) this).aShortArray10861[i]);
		}
		if (interface46.method223(0, bytebuffer.position(), (((AbstractModel) this).aClass106_Sub3_10825.aLong10444))) {
			((Class357) ((AbstractModel) this).aClass357_10824).anInterface46_4415 = interface46;
			((Class357) ((AbstractModel) this).aClass357_10824).aBool4416 = true;
			((AbstractModel) this).aBool10830 = true;
			return true;
		}
		return false;
	}

	public void method1442() {
		for (int i = 0; i < ((AbstractModel) this).maxVertexUsed; i++)
			((AbstractModel) this).vertexZ[i] = -((AbstractModel) this).vertexZ[i];
		for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++)
			((AbstractModel) this).aShortArray10809[i] = (short) -((AbstractModel) this).aShortArray10809[i];
		for (int i = 0; i < ((AbstractModel) this).anInt10833; i++) {
			short i_2432_ = ((AbstractModel) this).aShortArray10818[i];
			((AbstractModel) this).aShortArray10818[i] = ((AbstractModel) this).aShortArray10861[i];
			((AbstractModel) this).aShortArray10861[i] = i_2432_;
		}
		method10026();
		method10017();
		method10015();
		((AbstractModel) this).aBool10835 = false;
	}

	public void method1489() {
		for (int i = 0; i < ((AbstractModel) this).maxVertexUsed; i++)
			((AbstractModel) this).vertexZ[i] = -((AbstractModel) this).vertexZ[i];
		for (int i = 0; i < ((AbstractModel) this).uniqueVertices; i++)
			((AbstractModel) this).aShortArray10809[i] = (short) -((AbstractModel) this).aShortArray10809[i];
		for (int i = 0; i < ((AbstractModel) this).anInt10833; i++) {
			short i_2433_ = ((AbstractModel) this).aShortArray10818[i];
			((AbstractModel) this).aShortArray10818[i] = ((AbstractModel) this).aShortArray10861[i];
			((AbstractModel) this).aShortArray10861[i] = i_2433_;
		}
		method10026();
		method10017();
		method10015();
		((AbstractModel) this).aBool10835 = false;
	}

	public int method1490() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10843;
	}

	public int method1491() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10843;
	}

	public int method1372() {
		return ((AbstractModel) this).aShort10795;
	}

	public int method1493() {
		return ((AbstractModel) this).aShort10795;
	}

	void method1431(int i, int[] is, int i_2434_, int i_2435_, int i_2436_, int i_2437_, boolean bool) {
	}

	public int method1495() {
		return ((AbstractModel) this).aShort10795;
	}

	public boolean method1496() {
		return ((AbstractModel) this).aBool10832;
	}

	public int method1379() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10802;
	}

	void method1498(int i, int i_2529_, int i_2530_, int i_2531_) {
		if (i == 0) {
			int i_2532_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_2533_ = 0; i_2533_ < ((AbstractModel) this).maxVertexUsed; i_2533_++) {
				((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_2533_];
				((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_2533_];
				((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_2533_];
				i_2532_++;
			}
			if (i_2532_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_2532_ + i_2529_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_2532_ + i_2530_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_2532_ + i_2531_;
			} else {
				((AbstractModel) this).anInt10862 = i_2529_;
				((AbstractModel) this).anInt10863 = i_2530_;
				((AbstractModel) this).anInt10794 = i_2531_;
			}
		} else if (i == 1) {
			for (int i_2534_ = 0; i_2534_ < ((AbstractModel) this).maxVertexUsed; i_2534_++) {
				((AbstractModel) this).vertexX[i_2534_] += i_2529_;
				((AbstractModel) this).vertexY[i_2534_] += i_2530_;
				((AbstractModel) this).vertexZ[i_2534_] += i_2531_;
			}
		} else if (i == 2) {
			for (int i_2535_ = 0; i_2535_ < ((AbstractModel) this).maxVertexUsed; i_2535_++) {
				((AbstractModel) this).vertexX[i_2535_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2535_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2535_] -= ((AbstractModel) this).anInt10794;
				if (i_2531_ != 0) {
					int i_2536_ = Class325.anIntArray4103[i_2531_];
					int i_2537_ = Class325.anIntArray4105[i_2531_];
					int i_2538_ = (((((AbstractModel) this).vertexY[i_2535_] * i_2536_) + (((AbstractModel) this).vertexX[i_2535_] * i_2537_) + 16383) >> 14);
					((AbstractModel) this).vertexY[i_2535_] = ((((AbstractModel) this).vertexY[i_2535_] * i_2537_) - (((AbstractModel) this).vertexX[i_2535_] * i_2536_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2535_] = i_2538_;
				}
				if (i_2529_ != 0) {
					int i_2539_ = Class325.anIntArray4103[i_2529_];
					int i_2540_ = Class325.anIntArray4105[i_2529_];
					int i_2541_ = (((((AbstractModel) this).vertexY[i_2535_] * i_2540_) - (((AbstractModel) this).vertexZ[i_2535_] * i_2539_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2535_] = ((((AbstractModel) this).vertexY[i_2535_] * i_2539_) + (((AbstractModel) this).vertexZ[i_2535_] * i_2540_) + 16383) >> 14;
					((AbstractModel) this).vertexY[i_2535_] = i_2541_;
				}
				if (i_2530_ != 0) {
					int i_2542_ = Class325.anIntArray4103[i_2530_];
					int i_2543_ = Class325.anIntArray4105[i_2530_];
					int i_2544_ = (((((AbstractModel) this).vertexZ[i_2535_] * i_2542_) + (((AbstractModel) this).vertexX[i_2535_] * i_2543_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2535_] = ((((AbstractModel) this).vertexZ[i_2535_] * i_2543_) - (((AbstractModel) this).vertexX[i_2535_] * i_2542_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2535_] = i_2544_;
				}
				((AbstractModel) this).vertexX[i_2535_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2535_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2535_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 3) {
			for (int i_2545_ = 0; i_2545_ < ((AbstractModel) this).maxVertexUsed; i_2545_++) {
				((AbstractModel) this).vertexX[i_2545_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2545_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2545_] -= ((AbstractModel) this).anInt10794;
				((AbstractModel) this).vertexX[i_2545_] = (((AbstractModel) this).vertexX[i_2545_] * i_2529_ / 128);
				((AbstractModel) this).vertexY[i_2545_] = (((AbstractModel) this).vertexY[i_2545_] * i_2530_ / 128);
				((AbstractModel) this).vertexZ[i_2545_] = (((AbstractModel) this).vertexZ[i_2545_] * i_2531_ / 128);
				((AbstractModel) this).vertexX[i_2545_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2545_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2545_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 5) {
			for (int i_2546_ = 0; i_2546_ < ((AbstractModel) this).anInt10833; i_2546_++) {
				int i_2547_ = ((((AbstractModel) this).alpha[i_2546_] & 0xff) + i_2529_ * 8);
				if (i_2547_ < 0)
					i_2547_ = 0;
				else if (i_2547_ > 255)
					i_2547_ = 255;
				((AbstractModel) this).alpha[i_2546_] = (byte) i_2547_;
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2548_ = 0; i_2548_ < ((AbstractModel) this).anInt10851; i_2548_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2548_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2548_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
				}
			}
			method10014();
		} else if (i == 7) {
			for (int i_2549_ = 0; i_2549_ < ((AbstractModel) this).anInt10833; i_2549_++) {
				int i_2550_ = ((AbstractModel) this).aShortArray10793[i_2549_] & 0xffff;
				int i_2551_ = i_2550_ >> 10 & 0x3f;
				int i_2552_ = i_2550_ >> 7 & 0x7;
				int i_2553_ = i_2550_ & 0x7f;
				i_2551_ = i_2551_ + i_2529_ & 0x3f;
				i_2552_ += i_2530_ / 4;
				if (i_2552_ < 0)
					i_2552_ = 0;
				else if (i_2552_ > 7)
					i_2552_ = 7;
				i_2553_ += i_2531_;
				if (i_2553_ < 0)
					i_2553_ = 0;
				else if (i_2553_ > 127)
					i_2553_ = 127;
				((AbstractModel) this).aShortArray10793[i_2549_] = (short) (i_2551_ << 10 | i_2552_ << 7 | i_2553_);
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2554_ = 0; i_2554_ < ((AbstractModel) this).anInt10851; i_2554_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2554_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2554_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		} else if (i == 8) {
			for (int i_2555_ = 0; i_2555_ < ((AbstractModel) this).anInt10851; i_2555_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2555_];
				((Class355) class355).anInt4408 += i_2529_;
				((Class355) class355).anInt4407 += i_2530_;
			}
		} else if (i == 10) {
			for (int i_2556_ = 0; i_2556_ < ((AbstractModel) this).anInt10851; i_2556_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2556_];
				((Class355) class355).anInt4405 = ((Class355) class355).anInt4405 * i_2529_ >> 7;
				((Class355) class355).anInt4409 = ((Class355) class355).anInt4409 * i_2530_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2557_ = 0; i_2557_ < ((AbstractModel) this).anInt10851; i_2557_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2557_];
				((Class355) class355).anInt4410 = ((Class355) class355).anInt4410 + i_2529_ & 0x3fff;
			}
		}
	}

	void method1441(int i, int i_2558_, int i_2559_, int i_2560_) {
		if (i == 0) {
			int i_2561_ = 0;
			((AbstractModel) this).anInt10862 = 0;
			((AbstractModel) this).anInt10863 = 0;
			((AbstractModel) this).anInt10794 = 0;
			for (int i_2562_ = 0; i_2562_ < ((AbstractModel) this).maxVertexUsed; i_2562_++) {
				((AbstractModel) this).anInt10862 += ((AbstractModel) this).vertexX[i_2562_];
				((AbstractModel) this).anInt10863 += ((AbstractModel) this).vertexY[i_2562_];
				((AbstractModel) this).anInt10794 += ((AbstractModel) this).vertexZ[i_2562_];
				i_2561_++;
			}
			if (i_2561_ > 0) {
				((AbstractModel) this).anInt10862 = ((AbstractModel) this).anInt10862 / i_2561_ + i_2558_;
				((AbstractModel) this).anInt10863 = ((AbstractModel) this).anInt10863 / i_2561_ + i_2559_;
				((AbstractModel) this).anInt10794 = ((AbstractModel) this).anInt10794 / i_2561_ + i_2560_;
			} else {
				((AbstractModel) this).anInt10862 = i_2558_;
				((AbstractModel) this).anInt10863 = i_2559_;
				((AbstractModel) this).anInt10794 = i_2560_;
			}
		} else if (i == 1) {
			for (int i_2563_ = 0; i_2563_ < ((AbstractModel) this).maxVertexUsed; i_2563_++) {
				((AbstractModel) this).vertexX[i_2563_] += i_2558_;
				((AbstractModel) this).vertexY[i_2563_] += i_2559_;
				((AbstractModel) this).vertexZ[i_2563_] += i_2560_;
			}
		} else if (i == 2) {
			for (int i_2564_ = 0; i_2564_ < ((AbstractModel) this).maxVertexUsed; i_2564_++) {
				((AbstractModel) this).vertexX[i_2564_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2564_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2564_] -= ((AbstractModel) this).anInt10794;
				if (i_2560_ != 0) {
					int i_2565_ = Class325.anIntArray4103[i_2560_];
					int i_2566_ = Class325.anIntArray4105[i_2560_];
					int i_2567_ = (((((AbstractModel) this).vertexY[i_2564_] * i_2565_) + (((AbstractModel) this).vertexX[i_2564_] * i_2566_) + 16383) >> 14);
					((AbstractModel) this).vertexY[i_2564_] = ((((AbstractModel) this).vertexY[i_2564_] * i_2566_) - (((AbstractModel) this).vertexX[i_2564_] * i_2565_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2564_] = i_2567_;
				}
				if (i_2558_ != 0) {
					int i_2568_ = Class325.anIntArray4103[i_2558_];
					int i_2569_ = Class325.anIntArray4105[i_2558_];
					int i_2570_ = (((((AbstractModel) this).vertexY[i_2564_] * i_2569_) - (((AbstractModel) this).vertexZ[i_2564_] * i_2568_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2564_] = ((((AbstractModel) this).vertexY[i_2564_] * i_2568_) + (((AbstractModel) this).vertexZ[i_2564_] * i_2569_) + 16383) >> 14;
					((AbstractModel) this).vertexY[i_2564_] = i_2570_;
				}
				if (i_2559_ != 0) {
					int i_2571_ = Class325.anIntArray4103[i_2559_];
					int i_2572_ = Class325.anIntArray4105[i_2559_];
					int i_2573_ = (((((AbstractModel) this).vertexZ[i_2564_] * i_2571_) + (((AbstractModel) this).vertexX[i_2564_] * i_2572_) + 16383) >> 14);
					((AbstractModel) this).vertexZ[i_2564_] = ((((AbstractModel) this).vertexZ[i_2564_] * i_2572_) - (((AbstractModel) this).vertexX[i_2564_] * i_2571_) + 16383) >> 14;
					((AbstractModel) this).vertexX[i_2564_] = i_2573_;
				}
				((AbstractModel) this).vertexX[i_2564_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2564_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2564_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 3) {
			for (int i_2574_ = 0; i_2574_ < ((AbstractModel) this).maxVertexUsed; i_2574_++) {
				((AbstractModel) this).vertexX[i_2574_] -= ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2574_] -= ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2574_] -= ((AbstractModel) this).anInt10794;
				((AbstractModel) this).vertexX[i_2574_] = (((AbstractModel) this).vertexX[i_2574_] * i_2558_ / 128);
				((AbstractModel) this).vertexY[i_2574_] = (((AbstractModel) this).vertexY[i_2574_] * i_2559_ / 128);
				((AbstractModel) this).vertexZ[i_2574_] = (((AbstractModel) this).vertexZ[i_2574_] * i_2560_ / 128);
				((AbstractModel) this).vertexX[i_2574_] += ((AbstractModel) this).anInt10862;
				((AbstractModel) this).vertexY[i_2574_] += ((AbstractModel) this).anInt10863;
				((AbstractModel) this).vertexZ[i_2574_] += ((AbstractModel) this).anInt10794;
			}
		} else if (i == 5) {
			for (int i_2575_ = 0; i_2575_ < ((AbstractModel) this).anInt10833; i_2575_++) {
				int i_2576_ = ((((AbstractModel) this).alpha[i_2575_] & 0xff) + i_2558_ * 8);
				if (i_2576_ < 0)
					i_2576_ = 0;
				else if (i_2576_ > 255)
					i_2576_ = 255;
				((AbstractModel) this).alpha[i_2575_] = (byte) i_2576_;
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2577_ = 0; i_2577_ < ((AbstractModel) this).anInt10851; i_2577_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2577_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2577_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & 0xffffff | 255 - ((((AbstractModel) this).alpha[((Class365) class365).anInt4488]) & 0xff) << 24);
				}
			}
			method10014();
		} else if (i == 7) {
			for (int i_2578_ = 0; i_2578_ < ((AbstractModel) this).anInt10833; i_2578_++) {
				int i_2579_ = ((AbstractModel) this).aShortArray10793[i_2578_] & 0xffff;
				int i_2580_ = i_2579_ >> 10 & 0x3f;
				int i_2581_ = i_2579_ >> 7 & 0x7;
				int i_2582_ = i_2579_ & 0x7f;
				i_2580_ = i_2580_ + i_2558_ & 0x3f;
				i_2581_ += i_2559_ / 4;
				if (i_2581_ < 0)
					i_2581_ = 0;
				else if (i_2581_ > 7)
					i_2581_ = 7;
				i_2582_ += i_2560_;
				if (i_2582_ < 0)
					i_2582_ = 0;
				else if (i_2582_ > 127)
					i_2582_ = 127;
				((AbstractModel) this).aShortArray10793[i_2578_] = (short) (i_2580_ << 10 | i_2581_ << 7 | i_2582_);
			}
			if (((AbstractModel) this).aClass365Array10852 != null) {
				for (int i_2583_ = 0; i_2583_ < ((AbstractModel) this).anInt10851; i_2583_++) {
					Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2583_];
					Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2583_];
					((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
				}
			}
			method10014();
		} else if (i == 8) {
			for (int i_2584_ = 0; i_2584_ < ((AbstractModel) this).anInt10851; i_2584_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2584_];
				((Class355) class355).anInt4408 += i_2558_;
				((Class355) class355).anInt4407 += i_2559_;
			}
		} else if (i == 10) {
			for (int i_2585_ = 0; i_2585_ < ((AbstractModel) this).anInt10851; i_2585_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2585_];
				((Class355) class355).anInt4405 = ((Class355) class355).anInt4405 * i_2558_ >> 7;
				((Class355) class355).anInt4409 = ((Class355) class355).anInt4409 * i_2559_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2586_ = 0; i_2586_ < ((AbstractModel) this).anInt10851; i_2586_++) {
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2586_];
				((Class355) class355).anInt4410 = ((Class355) class355).anInt4410 + i_2558_ & 0x3fff;
			}
		}
	}

	public void method1420(int i, int i_2587_, int i_2588_) {
		for (int i_2589_ = 0; i_2589_ < ((AbstractModel) this).maxVertexUsed; i_2589_++) {
			if (i != 128)
				((AbstractModel) this).vertexX[i_2589_] = ((AbstractModel) this).vertexX[i_2589_] * i >> 7;
			if (i_2587_ != 128)
				((AbstractModel) this).vertexY[i_2589_] = (((AbstractModel) this).vertexY[i_2589_] * i_2587_ >> 7);
			if (i_2588_ != 128)
				((AbstractModel) this).vertexZ[i_2589_] = (((AbstractModel) this).vertexZ[i_2589_] * i_2588_ >> 7);
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public byte[] method1470() {
		return ((AbstractModel) this).alpha;
	}

	public boolean method1376(int i, int i_2590_, Class261 class261, boolean bool, int i_2591_) {
		return method10018(i, i_2590_, 0, 0, class261, bool, i_2591_);
	}

	void method10030() {
		if (((AbstractModel) this).aBool10830) {
			((AbstractModel) this).aBool10830 = false;
			if (((AbstractModel) this).aClass84Array10841 == null && ((AbstractModel) this).aClass175Array10850 == null && ((AbstractModel) this).aClass365Array10852 == null && !Class368.method4535(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				boolean bool = false;
				boolean bool_2592_ = false;
				boolean bool_2593_ = false;
				if (((AbstractModel) this).vertexX != null && !Class368.method4518(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexY != null && !Class368.method4536(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2592_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexZ != null && !Class368.method4520(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2593_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (bool)
					((AbstractModel) this).vertexX = null;
				if (bool_2592_)
					((AbstractModel) this).vertexY = null;
				if (bool_2593_)
					((AbstractModel) this).vertexZ = null;
			}
			if (((AbstractModel) this).aShortArray10853 != null && ((AbstractModel) this).vertexX == null && ((AbstractModel) this).vertexY == null && ((AbstractModel) this).vertexZ == null) {
				((AbstractModel) this).aShortArray10853 = null;
				((AbstractModel) this).sharedFaces = null;
			}
			while_59_: do {
				if (((AbstractModel) this).aByteArray10838 != null && !Class368.method4521(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					do {
						if ((((AbstractModel) this).anInt10836 & 0x37) != 0) {
							if (((AbstractModel) this).aClass356_10827 != null && !((AbstractModel) this).aClass356_10827.method4424())
								break;
						} else if ((((AbstractModel) this).aClass356_10826 != null) && !((AbstractModel) this).aClass356_10826.method4424())
							break;
						((AbstractModel) this).aShortArray10809 = null;
						((AbstractModel) this).aShortArray10805 = null;
						((AbstractModel) this).aShortArray10807 = null;
						((AbstractModel) this).aByteArray10838 = null;
						break while_59_;
					} while (false);
					((AbstractModel) this).aBool10830 = true;
				}
			} while (false);
			if (((AbstractModel) this).aShortArray10793 != null && !Class368.method4579(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10793 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).alpha != null && !Class368.method4523(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).alpha = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aFloatArray10811 != null && !Class368.method4524(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10828 == null || ((AbstractModel) this).aClass356_10828.method4424()) {
					((AbstractModel) this).aFloatArray10812 = null;
					((AbstractModel) this).aFloatArray10811 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10821 != null && !Class368.method4496(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10821 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10818 != null && !Class368.method4528(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if ((((AbstractModel) this).aClass357_10824 == null || ((AbstractModel) this).aClass357_10824.method4431()) && (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())) {
					((AbstractModel) this).aShortArray10861 = null;
					((AbstractModel) this).aShortArray10819 = null;
					((AbstractModel) this).aShortArray10818 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10831 != null) {
				if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424())
					((AbstractModel) this).aShortArray10831 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10806 != null) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10806 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).anIntArrayArray10820 != null && !Class368.method4529(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10820 = null;
				((AbstractModel) this).aShortArray10839 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10792 != null && !Class368.method4526(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10792 = null;
				((AbstractModel) this).aShortArray10810 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10854 != null && !Class368.method4527(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
				((AbstractModel) this).anIntArrayArray10854 = null;
			if (((AbstractModel) this).anIntArray10844 != null && (((AbstractModel) this).anInt10829 & 0x800) == 0 && (((AbstractModel) this).anInt10829 & 0x40000) == 0) {
				((AbstractModel) this).anIntArray10844 = null;
				((AbstractModel) this).anIntArray10846 = null;
				((AbstractModel) this).anIntArray10845 = null;
			}
		}
	}

	void method10031() {
		if (((AbstractModel) this).aBool10830) {
			((AbstractModel) this).aBool10830 = false;
			if (((AbstractModel) this).aClass84Array10841 == null && ((AbstractModel) this).aClass175Array10850 == null && ((AbstractModel) this).aClass365Array10852 == null && !Class368.method4535(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				boolean bool = false;
				boolean bool_2594_ = false;
				boolean bool_2595_ = false;
				if (((AbstractModel) this).vertexX != null && !Class368.method4518(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexY != null && !Class368.method4536(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2594_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexZ != null && !Class368.method4520(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2595_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (bool)
					((AbstractModel) this).vertexX = null;
				if (bool_2594_)
					((AbstractModel) this).vertexY = null;
				if (bool_2595_)
					((AbstractModel) this).vertexZ = null;
			}
			if (((AbstractModel) this).aShortArray10853 != null && ((AbstractModel) this).vertexX == null && ((AbstractModel) this).vertexY == null && ((AbstractModel) this).vertexZ == null) {
				((AbstractModel) this).aShortArray10853 = null;
				((AbstractModel) this).sharedFaces = null;
			}
			while_60_: do {
				if (((AbstractModel) this).aByteArray10838 != null && !Class368.method4521(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					do {
						if ((((AbstractModel) this).anInt10836 & 0x37) != 0) {
							if (((AbstractModel) this).aClass356_10827 != null && !((AbstractModel) this).aClass356_10827.method4424())
								break;
						} else if ((((AbstractModel) this).aClass356_10826 != null) && !((AbstractModel) this).aClass356_10826.method4424())
							break;
						((AbstractModel) this).aShortArray10809 = null;
						((AbstractModel) this).aShortArray10805 = null;
						((AbstractModel) this).aShortArray10807 = null;
						((AbstractModel) this).aByteArray10838 = null;
						break while_60_;
					} while (false);
					((AbstractModel) this).aBool10830 = true;
				}
			} while (false);
			if (((AbstractModel) this).aShortArray10793 != null && !Class368.method4579(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10793 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).alpha != null && !Class368.method4523(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).alpha = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aFloatArray10811 != null && !Class368.method4524(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10828 == null || ((AbstractModel) this).aClass356_10828.method4424()) {
					((AbstractModel) this).aFloatArray10812 = null;
					((AbstractModel) this).aFloatArray10811 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10821 != null && !Class368.method4496(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10821 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10818 != null && !Class368.method4528(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if ((((AbstractModel) this).aClass357_10824 == null || ((AbstractModel) this).aClass357_10824.method4431()) && (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())) {
					((AbstractModel) this).aShortArray10861 = null;
					((AbstractModel) this).aShortArray10819 = null;
					((AbstractModel) this).aShortArray10818 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10831 != null) {
				if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424())
					((AbstractModel) this).aShortArray10831 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10806 != null) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10806 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).anIntArrayArray10820 != null && !Class368.method4529(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10820 = null;
				((AbstractModel) this).aShortArray10839 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10792 != null && !Class368.method4526(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10792 = null;
				((AbstractModel) this).aShortArray10810 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10854 != null && !Class368.method4527(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
				((AbstractModel) this).anIntArrayArray10854 = null;
			if (((AbstractModel) this).anIntArray10844 != null && (((AbstractModel) this).anInt10829 & 0x800) == 0 && (((AbstractModel) this).anInt10829 & 0x40000) == 0) {
				((AbstractModel) this).anIntArray10844 = null;
				((AbstractModel) this).anIntArray10846 = null;
				((AbstractModel) this).anIntArray10845 = null;
			}
		}
	}

	public void method1413() {
		if (((AbstractModel) this).uniqueVertices > 0 && ((AbstractModel) this).anInt10815 > 0) {
			method10027();
			method10029();
			method10012();
		}
	}

	void method10032() {
		if (((AbstractModel) this).aBool10830) {
			((AbstractModel) this).aBool10830 = false;
			if (((AbstractModel) this).aClass84Array10841 == null && ((AbstractModel) this).aClass175Array10850 == null && ((AbstractModel) this).aClass365Array10852 == null && !Class368.method4535(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				boolean bool = false;
				boolean bool_2596_ = false;
				boolean bool_2597_ = false;
				if (((AbstractModel) this).vertexX != null && !Class368.method4518(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexY != null && !Class368.method4536(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2596_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (((AbstractModel) this).vertexZ != null && !Class368.method4520(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424()) {
						if (!((AbstractModel) this).aBool10835)
							method10016();
						bool_2597_ = true;
					} else
						((AbstractModel) this).aBool10830 = true;
				}
				if (bool)
					((AbstractModel) this).vertexX = null;
				if (bool_2596_)
					((AbstractModel) this).vertexY = null;
				if (bool_2597_)
					((AbstractModel) this).vertexZ = null;
			}
			if (((AbstractModel) this).aShortArray10853 != null && ((AbstractModel) this).vertexX == null && ((AbstractModel) this).vertexY == null && ((AbstractModel) this).vertexZ == null) {
				((AbstractModel) this).aShortArray10853 = null;
				((AbstractModel) this).sharedFaces = null;
			}
			while_61_: do {
				if (((AbstractModel) this).aByteArray10838 != null && !Class368.method4521(((AbstractModel) this).anInt10829, (((AbstractModel) this).anInt10836))) {
					do {
						if ((((AbstractModel) this).anInt10836 & 0x37) != 0) {
							if (((AbstractModel) this).aClass356_10827 != null && !((AbstractModel) this).aClass356_10827.method4424())
								break;
						} else if ((((AbstractModel) this).aClass356_10826 != null) && !((AbstractModel) this).aClass356_10826.method4424())
							break;
						((AbstractModel) this).aShortArray10809 = null;
						((AbstractModel) this).aShortArray10805 = null;
						((AbstractModel) this).aShortArray10807 = null;
						((AbstractModel) this).aByteArray10838 = null;
						break while_61_;
					} while (false);
					((AbstractModel) this).aBool10830 = true;
				}
			} while (false);
			if (((AbstractModel) this).aShortArray10793 != null && !Class368.method4579(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10793 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).alpha != null && !Class368.method4523(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).alpha = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aFloatArray10811 != null && !Class368.method4524(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10828 == null || ((AbstractModel) this).aClass356_10828.method4424()) {
					((AbstractModel) this).aFloatArray10812 = null;
					((AbstractModel) this).aFloatArray10811 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10821 != null && !Class368.method4496(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10821 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10818 != null && !Class368.method4528(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				if ((((AbstractModel) this).aClass357_10824 == null || ((AbstractModel) this).aClass357_10824.method4431()) && (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())) {
					((AbstractModel) this).aShortArray10861 = null;
					((AbstractModel) this).aShortArray10819 = null;
					((AbstractModel) this).aShortArray10818 = null;
				} else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10831 != null) {
				if (((AbstractModel) this).aClass356_10813 == null || ((AbstractModel) this).aClass356_10813.method4424())
					((AbstractModel) this).aShortArray10831 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).aShortArray10806 != null) {
				if (((AbstractModel) this).aClass356_10826 == null || ((AbstractModel) this).aClass356_10826.method4424())
					((AbstractModel) this).aShortArray10806 = null;
				else
					((AbstractModel) this).aBool10830 = true;
			}
			if (((AbstractModel) this).anIntArrayArray10820 != null && !Class368.method4529(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10820 = null;
				((AbstractModel) this).aShortArray10839 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10792 != null && !Class368.method4526(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836)) {
				((AbstractModel) this).anIntArrayArray10792 = null;
				((AbstractModel) this).aShortArray10810 = null;
			}
			if (((AbstractModel) this).anIntArrayArray10854 != null && !Class368.method4527(((AbstractModel) this).anInt10829, ((AbstractModel) this).anInt10836))
				((AbstractModel) this).anIntArrayArray10854 = null;
			if (((AbstractModel) this).anIntArray10844 != null && (((AbstractModel) this).anInt10829 & 0x800) == 0 && (((AbstractModel) this).anInt10829 & 0x40000) == 0) {
				((AbstractModel) this).anIntArray10844 = null;
				((AbstractModel) this).anIntArray10846 = null;
				((AbstractModel) this).anIntArray10845 = null;
			}
		}
	}

	void method10033() {
		if (((AbstractModel) this).aClass356_10813 != null)
			((Class356) ((AbstractModel) this).aClass356_10813).aBool4413 = false;
	}

	public void method1396(int i, int i_2598_, int i_2599_, int i_2600_) {
		for (int i_2601_ = 0; i_2601_ < ((AbstractModel) this).anInt10833; i_2601_++) {
			int i_2602_ = ((AbstractModel) this).aShortArray10793[i_2601_] & 0xffff;
			int i_2603_ = i_2602_ >> 10 & 0x3f;
			int i_2604_ = i_2602_ >> 7 & 0x7;
			int i_2605_ = i_2602_ & 0x7f;
			if (i != -1)
				i_2603_ += (i - i_2603_) * i_2600_ >> 7;
			if (i_2598_ != -1)
				i_2604_ += (i_2598_ - i_2604_) * i_2600_ >> 7;
			if (i_2599_ != -1)
				i_2605_ += (i_2599_ - i_2605_) * i_2600_ >> 7;
			((AbstractModel) this).aShortArray10793[i_2601_] = (short) (i_2603_ << 10 | i_2604_ << 7 | i_2605_);
		}
		if (((AbstractModel) this).aClass365Array10852 != null) {
			for (int i_2606_ = 0; i_2606_ < ((AbstractModel) this).anInt10851; i_2606_++) {
				Class365 class365 = ((AbstractModel) this).aClass365Array10852[i_2606_];
				Class355 class355 = ((AbstractModel) this).aClass355Array10864[i_2606_];
				((Class355) class355).anInt4406 = (((Class355) class355).anInt4406 & ~0xffffff | ((Class460.anIntArray5213[(((AbstractModel) this).aShortArray10793[((Class365) class365).anInt4488]) & 0xffff]) & 0xffffff));
			}
		}
		method10014();
	}

	void method10034() {
		int i = 32767;
		int i_2607_ = 32767;
		int i_2608_ = 32767;
		int i_2609_ = -32768;
		int i_2610_ = -32768;
		int i_2611_ = -32768;
		int i_2612_ = 0;
		int i_2613_ = 0;
		for (int i_2614_ = 0; i_2614_ < ((AbstractModel) this).maxVertexUsed; i_2614_++) {
			int i_2615_ = ((AbstractModel) this).vertexX[i_2614_];
			int i_2616_ = ((AbstractModel) this).vertexY[i_2614_];
			int i_2617_ = ((AbstractModel) this).vertexZ[i_2614_];
			if (i_2615_ < i)
				i = i_2615_;
			if (i_2615_ > i_2609_)
				i_2609_ = i_2615_;
			if (i_2616_ < i_2607_)
				i_2607_ = i_2616_;
			if (i_2616_ > i_2610_)
				i_2610_ = i_2616_;
			if (i_2617_ < i_2608_)
				i_2608_ = i_2617_;
			if (i_2617_ > i_2611_)
				i_2611_ = i_2617_;
			int i_2618_ = i_2615_ * i_2615_ + i_2617_ * i_2617_;
			if (i_2618_ > i_2612_)
				i_2612_ = i_2618_;
			i_2618_ = i_2615_ * i_2615_ + i_2617_ * i_2617_ + i_2616_ * i_2616_;
			if (i_2618_ > i_2613_)
				i_2613_ = i_2618_;
		}
		((AbstractModel) this).anInt10843 = i;
		((AbstractModel) this).anInt10790 = i_2609_;
		((AbstractModel) this).anInt10816 = i_2607_;
		((AbstractModel) this).anInt10837 = i_2610_;
		((AbstractModel) this).anInt10840 = i_2608_;
		((AbstractModel) this).anInt10801 = i_2611_;
		((AbstractModel) this).anInt10834 = (int) (Math.sqrt((double) i_2612_) + 0.99);
		((AbstractModel) this).anInt10802 = (int) (Math.sqrt((double) i_2613_) + 0.99);
		((AbstractModel) this).aBool10835 = true;
	}

	public int method1462() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10801;
	}

	public void method1418(int i, int i_2619_, int i_2620_) {
		for (int i_2621_ = 0; i_2621_ < ((AbstractModel) this).maxVertexUsed; i_2621_++) {
			if (i != 0)
				((AbstractModel) this).vertexX[i_2621_] += i;
			if (i_2619_ != 0)
				((AbstractModel) this).vertexY[i_2621_] += i_2619_;
			if (i_2620_ != 0)
				((AbstractModel) this).vertexZ[i_2621_] += i_2620_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}

	public int method1458() {
		if (!((AbstractModel) this).aBool10835)
			method10016();
		return ((AbstractModel) this).anInt10837;
	}

	public void method1439(Class261 class261, int i, boolean bool) {
		if (((AbstractModel) this).aShortArray10810 != null) {
			Class261 class261_2622_ = class261;
			if (bool) {
				class261_2622_ = (((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass261_10443);
				class261_2622_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_2623_ = 0; i_2623_ < ((AbstractModel) this).maxVertexUsed; i_2623_++) {
				if ((i & ((AbstractModel) this).aShortArray10810[i_2623_]) != 0) {
					class261_2622_.method3582((float) (((AbstractModel) this).vertexX[i_2623_]), (float) (((AbstractModel) this).vertexY[i_2623_]), (float) (((AbstractModel) this).vertexZ[i_2623_]), fs);
					((AbstractModel) this).vertexX[i_2623_] = (int) fs[0];
					((AbstractModel) this).vertexY[i_2623_] = (int) fs[1];
					((AbstractModel) this).vertexZ[i_2623_] = (int) fs[2];
				}
			}
		}
	}

	public void method1388(int i) {
		((AbstractModel) this).aShort10796 = (short) i;
		method10026();
		method10017();
	}

	void method10035() {
		if (((AbstractModel) this).aClass356_10813 != null)
			((AbstractModel) this).aClass356_10813.method4425();
		if (((AbstractModel) this).aClass356_10828 != null)
			((AbstractModel) this).aClass356_10828.method4425();
		if (((AbstractModel) this).aClass356_10826 != null)
			((AbstractModel) this).aClass356_10826.method4425();
		if (((AbstractModel) this).aClass356_10827 != null)
			((AbstractModel) this).aClass356_10827.method4425();
		if (((AbstractModel) this).aClass357_10824 != null)
			((AbstractModel) this).aClass357_10824.method4437();
	}

	public boolean method1397() {
		if (((AbstractModel) this).aShortArray10821 == null)
			return true;
		for (int i = 0; i < ((AbstractModel) this).aShortArray10821.length; i++) {
			if (((AbstractModel) this).aShortArray10821[i] != -1 && !(((Class106_Sub3) ((AbstractModel) this).aClass106_Sub3_10825).aClass360_10487.method4448((((AbstractModel) this).aClass106_Sub3_10825.aClass94_1396.getTexture(((AbstractModel) this).aShortArray10821[i], 1743563773)), -1)))
				return false;
		}
		return true;
	}

	int method10036(int i, int i_2624_) {
		i_2624_ = i_2624_ * (i & 0x7f) >> 7;
		if (i_2624_ < 2)
			i_2624_ = 2;
		else if (i_2624_ > 126)
			i_2624_ = 126;
		return (i & 0xff80) + i_2624_;
	}

	public void method1355(int i) {
		int i_2625_ = Class325.anIntArray4103[i];
		int i_2626_ = Class325.anIntArray4105[i];
		for (int i_2627_ = 0; i_2627_ < ((AbstractModel) this).maxVertexUsed; i_2627_++) {
			int i_2628_ = ((((AbstractModel) this).vertexZ[i_2627_] * i_2625_ + ((AbstractModel) this).vertexX[i_2627_] * i_2626_) >> 14);
			((AbstractModel) this).vertexZ[i_2627_] = ((((AbstractModel) this).vertexZ[i_2627_] * i_2626_ - ((AbstractModel) this).vertexX[i_2627_] * i_2625_) >> 14);
			((AbstractModel) this).vertexX[i_2627_] = i_2628_;
		}
		method10026();
		((AbstractModel) this).aBool10835 = false;
	}
}
