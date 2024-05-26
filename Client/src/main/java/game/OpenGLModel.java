package game;

/* Class89_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class OpenGLModel extends Model {
	static final int anInt10269 = 4;
	Class142 aClass142_10270;
	int anInt10271;
	static final int anInt10272 = 2;
	static final int anInt10273 = 1;
	static final int anInt10274 = 8;
	Interface9 anInterface9_10275;
	static final int anInt10276 = 16;
	int anInt10277;
	short aShort10278;
	byte aByte10279;
	short aShort10280;
	short[] aShortArray10281;
	boolean aBool10282 = false;
	boolean aBool10283 = false;
	int anInt10284 = 0;
	int anInt10285 = 0;
	short[] aShortArray10286;
	int[] anIntArray10287;
	short[] aShortArray10288;
	int[][] anIntArrayArray10289;
	short[] aShortArray10290;
	int anInt10291 = 0;
	short[] aShortArray10292;
	short[] aShortArray10293;
	int anInt10294;
	byte[] aByteArray10295;
	Class164 aClass164_10296;
	float[] aFloatArray10297;
	static int[] anIntArray10298;
	int anInt10299 = 0;
	Class84[] aClass84Array10300;
	Class139 aClass139_10301;
	byte[] aByteArray10302;
	short[] aShortArray10303;
	short aShort10304;
	short[] aShortArray10305;
	short[] aShortArray10306;
	int[][] anIntArrayArray10307;
	int anInt10308 = 0;
	Class142 aClass142_10309;
	static int anInt10310;
	static final int anInt10311 = 4;
	Class142 aClass142_10312;
	int anInt10313;
	Interface12 anInterface12_10314;
	Class142 aClass142_10315;
	boolean aBool10316 = true;
	short aShort10317;
	short aShort10318;
	boolean aBool10319 = false;
	static int[] anIntArray10320;
	short aShort10321;
	short aShort10322;
	int[][] anIntArrayArray10323;
	short aShort10324;
	short aShort10325;
	boolean aBool10326 = false;
	short[] aShortArray10327;
	int[] anIntArray10328;
	int[] anIntArray10329;
	short[] aShortArray10330;
	int[] anIntArray10331;
	Class175[] aClass175Array10332;
	int anInt10333;
	Class173[] aClass173Array10334;
	Class150[] aClass150Array10335;
	int[] anIntArray10336;
	static long[] aLongArray10337;
	static float[] aFloatArray10338 = new float[2];
	float[] aFloatArray10339;
	Class106_Sub1 aClass106_Sub1_10340;
	static int[] anIntArray10341;
	static int anInt10342;
	static final int anInt10343 = 7;
	static int anInt10344;
	static boolean aBool10345;

	OpenGLModel(Class106_Sub1 class106_sub1, Class159 class159, int i, int i_0_, int i_1_, int i_2_) {
		((OpenGLModel) this).aClass106_Sub1_10340 = class106_sub1;
		((OpenGLModel) this).anInt10277 = i;
		((OpenGLModel) this).anInt10294 = i_2_;
		if (Class140.method2357(i, i_2_))
			((OpenGLModel) this).aClass142_10309 = new Class142(null, 5126, 3, 0);
		if (Class140.method2363(i, i_2_))
			((OpenGLModel) this).aClass142_10312 = new Class142(null, 5126, 2, 0);
		if (Class140.method2358(i, i_2_))
			((OpenGLModel) this).aClass142_10315 = new Class142(null, 5126, 3, 0);
		if (Class140.method2418(i, i_2_))
			((OpenGLModel) this).aClass142_10270 = new Class142(null, 5121, 4, 0);
		if (Class140.method2361(i, i_2_))
			((OpenGLModel) this).aClass139_10301 = new Class139();
		MapSize mapSize = class106_sub1.aClass94_1396;
		Interface35 interface35 = class106_sub1.anInterface35_1397;
		int[] is = new int[class159.anInt1778];
		((OpenGLModel) this).anIntArray10329 = new int[class159.anInt1775 + 1];
		for (int i_3_ = 0; i_3_ < class159.anInt1778; i_3_++) {
			if (class159.aByteArray1792 == null || class159.aByteArray1792[i_3_] != 2) {
				if (class159.faceTextures != null && class159.faceTextures[i_3_] != -1) {
					MaterialInformation class101 = mapSize.getTexture((class159.faceTextures[i_3_] & 0xffff), 1890251889);
					if (((((OpenGLModel) this).anInt10294 & 0x40) == 0 || !class101.aBool1350) && class101.aBool1363)
						continue;
				}
				is[((OpenGLModel) this).anInt10299++] = i_3_;
				((OpenGLModel) this).anIntArray10329[(class159.aShortArray1786[i_3_])]++;
				((OpenGLModel) this).anIntArray10329[(class159.aShortArray1787[i_3_])]++;
				((OpenGLModel) this).anIntArray10329[(class159.aShortArray1789[i_3_])]++;
			}
		}
		((OpenGLModel) this).anInt10308 = ((OpenGLModel) this).anInt10299;
		long[] ls = new long[((OpenGLModel) this).anInt10299];
		boolean bool = (((OpenGLModel) this).anInt10277 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < ((OpenGLModel) this).anInt10299; i_4_++) {
			int i_5_ = is[i_4_];
			MaterialInformation class101 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (class159.aClass107Array1783 != null) {
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < class159.aClass107Array1783.length; i_11_++) {
					Class107 class107 = class159.aClass107Array1783[i_11_];
					if (i_5_ == class107.anInt1423 * 49736077) {
						Class314 class314 = interface35.method208((class107.anInt1422 * 1294185611), (byte) -106);
						if (class314.aBool3813)
							bool_10_ = true;
						if (class314.anInt3806 * 1060190383 != -1) {
							MaterialInformation class101_12_ = mapSize.getTexture((class314.anInt3806 * 1060190383), 1422887524);
							if (class101_12_.aClass511_1342 == Class511.aClass511_5697)
								((OpenGLModel) this).aBool10282 = true;
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					((OpenGLModel) this).anInt10308--;
					continue;
				}
			}
			if (class159.aClass84Array1816 != null) {
				boolean bool_13_ = false;
				for (int i_14_ = 0; i_14_ < class159.aClass84Array1816.length; i_14_++) {
					Class84 class84 = class159.aClass84Array1816[i_14_];
					if (i_5_ == class84.anInt1084 * 1190917997) {
						Class308 class308 = (((OpenGLModel) this).aClass106_Sub1_10340.anInterface36_1398.method211(class84.anInt1091 * -811893277, (byte) -6));
						if (class308.aBool3604)
							bool_13_ = true;
					}
				}
				if (bool_13_) {
					ls[i_4_] = 9223372036854775807L;
					((OpenGLModel) this).anInt10308--;
					continue;
				}
			}
			int i_15_ = -1;
			if (class159.faceTextures != null) {
				i_15_ = class159.faceTextures[i_5_];
				if (i_15_ != -1) {
					class101 = mapSize.getTexture(i_15_ & 0xffff, 190935612);
					if ((((OpenGLModel) this).anInt10294 & 0x40) == 0 || !class101.aBool1350) {
						i_8_ = class101.effectId;
						i_9_ = class101.effectParam1;
						if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
							((OpenGLModel) this).aBool10283 = true;
					} else {
						i_15_ = -1;
						class101 = null;
					}
				}
			}
			boolean bool_16_ = ((class159.faceAlpha != null && class159.faceAlpha[i_5_] != 0) || (class101 != null && class101.aClass511_1342 != Class511.aClass511_5695));
			if ((bool || bool_16_) && class159.aByteArray1799 != null)
				i_6_ += class159.aByteArray1799[i_5_] << 17;
			if (bool_16_)
				i_6_ += 65536;
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_15_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
			((OpenGLModel) this).aBool10282 |= bool_16_;
			OpenGLModel class89_sub1_17_ = this;
			((OpenGLModel) class89_sub1_17_).aBool10283 = (((OpenGLModel) class89_sub1_17_).aBool10283 | (class101 != null && (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)));
		}
		Class435.method5258(ls, is, (byte) 110);
		((OpenGLModel) this).anInt10284 = class159.anInt1791;
		((OpenGLModel) this).anInt10285 = class159.anInt1775;
		((OpenGLModel) this).anIntArray10336 = class159.anIntArray1782;
		((OpenGLModel) this).anIntArray10287 = class159.anIntArray1777;
		((OpenGLModel) this).anIntArray10331 = class159.anIntArray1797;
		((OpenGLModel) this).aShortArray10290 = class159.aShortArray1781;
		Class144[] class144s = new Class144[((OpenGLModel) this).anInt10285];
		((OpenGLModel) this).aClass84Array10300 = class159.aClass84Array1816;
		((OpenGLModel) this).aClass175Array10332 = class159.aClass175Array1817;
		if (class159.aClass107Array1783 != null) {
			((OpenGLModel) this).anInt10333 = class159.aClass107Array1783.length;
			((OpenGLModel) this).aClass173Array10334 = new Class173[((OpenGLModel) this).anInt10333];
			((OpenGLModel) this).aClass150Array10335 = new Class150[((OpenGLModel) this).anInt10333];
			for (int i_18_ = 0; i_18_ < ((OpenGLModel) this).anInt10333; i_18_++) {
				Class107 class107 = class159.aClass107Array1783[i_18_];
				Class314 class314 = interface35.method208(class107.anInt1422 * 1294185611, (byte) -52);
				int i_19_ = -1;
				for (int i_20_ = 0; i_20_ < ((OpenGLModel) this).anInt10299; i_20_++) {
					if (is[i_20_] == class107.anInt1423 * 49736077) {
						i_19_ = i_20_;
						break;
					}
				}
				if (i_19_ == -1)
					throw new RuntimeException();
				int i_21_ = ((Class460.anIntArray5213[(class159.faceColours[class107.anInt1423 * 49736077]) & 0xffff]) & 0xffffff);
				i_21_ = i_21_ | 255 - (class159.faceAlpha != null ? (class159.faceAlpha[class107.anInt1423 * 49736077]) : 0) << 24;
				((OpenGLModel) this).aClass173Array10334[i_18_] = new Class173(i_19_, (class159.aShortArray1786[class107.anInt1423 * 49736077]), (class159.aShortArray1787[class107.anInt1423 * 49736077]), (class159.aShortArray1789[class107.anInt1423 * 49736077]), class314.anInt3808 * -735149301, class314.anInt3809 * -1899796151, class314.anInt3806 * 1060190383, class314.anInt3807 * -1191268737, class314.anInt3810 * 1499091165, class314.aBool3813, class314.aBool3812, class107.anInt1424 * 736551085);
				((OpenGLModel) this).aClass150Array10335[i_18_] = new Class150(i_21_);
			}
		}
		int i_22_ = ((OpenGLModel) this).anInt10299 * 3;
		((OpenGLModel) this).aShortArray10292 = new short[i_22_];
		((OpenGLModel) this).aShortArray10293 = new short[i_22_];
		((OpenGLModel) this).aShortArray10288 = new short[i_22_];
		((OpenGLModel) this).aByteArray10295 = new byte[i_22_];
		((OpenGLModel) this).aFloatArray10297 = new float[i_22_];
		((OpenGLModel) this).aFloatArray10339 = new float[i_22_];
		((OpenGLModel) this).aShortArray10281 = new short[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aByteArray10302 = new byte[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aShortArray10303 = new short[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aShortArray10327 = new short[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aShortArray10305 = new short[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aShortArray10306 = new short[((OpenGLModel) this).anInt10299];
		if (class159.aShortArray1800 != null)
			((OpenGLModel) this).aShortArray10286 = new short[((OpenGLModel) this).anInt10299];
		((OpenGLModel) this).aShort10280 = (short) i_0_;
		((OpenGLModel) this).aShort10304 = (short) i_1_;
		((OpenGLModel) this).aShortArray10330 = new short[i_22_];
		aLongArray10337 = new long[i_22_];
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < class159.anInt1775; i_24_++) {
			int i_25_ = ((OpenGLModel) this).anIntArray10329[i_24_];
			((OpenGLModel) this).anIntArray10329[i_24_] = i_23_;
			i_23_ += i_25_;
			class144s[i_24_] = new Class144();
		}
		((OpenGLModel) this).anIntArray10329[class159.anInt1775] = i_23_;
		Class95 class95 = method1403(class159, is, ((OpenGLModel) this).anInt10299);
		Class182[] class182s = new Class182[class159.anInt1778];
		for (int i_26_ = 0; i_26_ < class159.anInt1778; i_26_++) {
			short i_27_ = class159.aShortArray1786[i_26_];
			short i_28_ = class159.aShortArray1787[i_26_];
			short i_29_ = class159.aShortArray1789[i_26_];
			int i_30_ = (((OpenGLModel) this).anIntArray10336[i_28_] - ((OpenGLModel) this).anIntArray10336[i_27_]);
			int i_31_ = (((OpenGLModel) this).anIntArray10287[i_28_] - ((OpenGLModel) this).anIntArray10287[i_27_]);
			int i_32_ = (((OpenGLModel) this).anIntArray10331[i_28_] - ((OpenGLModel) this).anIntArray10331[i_27_]);
			int i_33_ = (((OpenGLModel) this).anIntArray10336[i_29_] - ((OpenGLModel) this).anIntArray10336[i_27_]);
			int i_34_ = (((OpenGLModel) this).anIntArray10287[i_29_] - ((OpenGLModel) this).anIntArray10287[i_27_]);
			int i_35_ = (((OpenGLModel) this).anIntArray10331[i_29_] - ((OpenGLModel) this).anIntArray10331[i_27_]);
			int i_36_ = i_31_ * i_35_ - i_34_ * i_32_;
			int i_37_ = i_32_ * i_33_ - i_35_ * i_30_;
			int i_38_;
			for (i_38_ = i_30_ * i_34_ - i_33_ * i_31_; (i_36_ > 8192 || i_37_ > 8192 || i_38_ > 8192 || i_36_ < -8192 || i_37_ < -8192 || i_38_ < -8192); i_38_ >>= 1) {
				i_36_ >>= 1;
				i_37_ >>= 1;
			}
			int i_39_ = (int) Math.sqrt((double) (i_36_ * i_36_ + i_37_ * i_37_ + i_38_ * i_38_));
			if (i_39_ <= 0)
				i_39_ = 1;
			i_36_ = i_36_ * 256 / i_39_;
			i_37_ = i_37_ * 256 / i_39_;
			i_38_ = i_38_ * 256 / i_39_;
			byte i_40_ = (class159.aByteArray1792 == null ? (byte) 0 : class159.aByteArray1792[i_26_]);
			if (i_40_ == 0) {
				Class144 class144 = class144s[i_27_];
				((Class144) class144).anInt1658 += i_36_;
				((Class144) class144).anInt1657 += i_37_;
				((Class144) class144).anInt1659 += i_38_;
				((Class144) class144).anInt1656++;
				class144 = class144s[i_28_];
				((Class144) class144).anInt1658 += i_36_;
				((Class144) class144).anInt1657 += i_37_;
				((Class144) class144).anInt1659 += i_38_;
				((Class144) class144).anInt1656++;
				class144 = class144s[i_29_];
				((Class144) class144).anInt1658 += i_36_;
				((Class144) class144).anInt1657 += i_37_;
				((Class144) class144).anInt1659 += i_38_;
				((Class144) class144).anInt1656++;
			} else if (i_40_ == 1) {
				Class182 class182 = class182s[i_26_] = new Class182();
				((Class182) class182).anInt2141 = i_36_;
				((Class182) class182).anInt2140 = i_37_;
				((Class182) class182).anInt2139 = i_38_;
			}
		}
		for (int i_41_ = 0; i_41_ < ((OpenGLModel) this).anInt10299; i_41_++) {
			int i_42_ = is[i_41_];
			int i_43_ = class159.faceColours[i_42_] & 0xffff;
			int i_44_ = (class159.faceAlpha != null ? class159.faceAlpha[i_42_] & 0xff : 0);
			short i_45_ = (class159.faceTextures == null ? (short) -1 : class159.faceTextures[i_42_]);
			if (i_45_ != -1 && (((OpenGLModel) this).anInt10294 & 0x40) != 0 && mapSize.getTexture(i_45_, 152039449).aBool1350)
				i_45_ = (short) -1;
			float f = 0.0F;
			float f_46_ = 0.0F;
			float f_47_ = 0.0F;
			float f_48_ = 0.0F;
			float f_49_ = 0.0F;
			float f_50_ = 0.0F;
			long l;
			long l_51_;
			long l_52_;
			if (i_45_ != -1) {
				int i_53_ = (class159.faceTextureIndexes != null ? class159.faceTextureIndexes[i_42_] : -1);
				if (i_53_ == 32766) {
					int i_54_ = class159.uvCoordVertexA[i_42_] & 0xff;
					int i_55_ = class159.uvCoordVertexB[i_42_] & 0xff;
					int i_56_ = class159.uvCoordVertexC[i_42_] & 0xff;
					i_54_ += (class159.anIntArray1774[class159.aShortArray1786[i_42_]]);
					l_52_ = (long) i_54_;
					i_55_ += (class159.anIntArray1774[class159.aShortArray1787[i_42_]]);
					l_51_ = (long) i_54_;
					i_56_ += (class159.anIntArray1774[class159.aShortArray1789[i_42_]]);
					l = (long) i_54_;
					f = class159.aFloatArray1771[i_54_];
					f_46_ = class159.aFloatArray1784[i_54_];
					f_47_ = class159.aFloatArray1771[i_55_];
					f_48_ = class159.aFloatArray1784[i_55_];
					f_49_ = class159.aFloatArray1771[i_56_];
					f_50_ = class159.aFloatArray1784[i_56_];
				} else if (i_53_ == -1) {
					f = 0.0F;
					f_46_ = 1.0F;
					l_52_ = 65535L;
					f_47_ = 1.0F;
					f_48_ = 1.0F;
					l_51_ = 131071L;
					f_49_ = 0.0F;
					f_50_ = 0.0F;
					l = 196607L;
				} else {
					i_53_ &= 0xffff;
					int i_57_ = 0;
					int i_58_ = 0;
					int i_59_ = 0;
					byte i_60_ = class159.aByteArray1804[i_53_];
					if (i_60_ == 0) {
						short i_61_ = class159.aShortArray1786[i_42_];
						short i_62_ = class159.aShortArray1787[i_42_];
						short i_63_ = class159.aShortArray1789[i_42_];
						short i_64_ = class159.aShortArray1805[i_53_];
						short i_65_ = class159.aShortArray1806[i_53_];
						short i_66_ = class159.aShortArray1807[i_53_];
						float f_67_ = (float) class159.anIntArray1782[i_64_];
						float f_68_ = (float) class159.anIntArray1777[i_64_];
						float f_69_ = (float) class159.anIntArray1797[i_64_];
						float f_70_ = (float) class159.anIntArray1782[i_65_] - f_67_;
						float f_71_ = (float) class159.anIntArray1777[i_65_] - f_68_;
						float f_72_ = (float) class159.anIntArray1797[i_65_] - f_69_;
						float f_73_ = (float) class159.anIntArray1782[i_66_] - f_67_;
						float f_74_ = (float) class159.anIntArray1777[i_66_] - f_68_;
						float f_75_ = (float) class159.anIntArray1797[i_66_] - f_69_;
						float f_76_ = (float) class159.anIntArray1782[i_61_] - f_67_;
						float f_77_ = (float) class159.anIntArray1777[i_61_] - f_68_;
						float f_78_ = (float) class159.anIntArray1797[i_61_] - f_69_;
						float f_79_ = (float) class159.anIntArray1782[i_62_] - f_67_;
						float f_80_ = (float) class159.anIntArray1777[i_62_] - f_68_;
						float f_81_ = (float) class159.anIntArray1797[i_62_] - f_69_;
						float f_82_ = (float) class159.anIntArray1782[i_63_] - f_67_;
						float f_83_ = (float) class159.anIntArray1777[i_63_] - f_68_;
						float f_84_ = (float) class159.anIntArray1797[i_63_] - f_69_;
						float f_85_ = f_71_ * f_75_ - f_72_ * f_74_;
						float f_86_ = f_72_ * f_73_ - f_70_ * f_75_;
						float f_87_ = f_70_ * f_74_ - f_71_ * f_73_;
						float f_88_ = f_74_ * f_87_ - f_75_ * f_86_;
						float f_89_ = f_75_ * f_85_ - f_73_ * f_87_;
						float f_90_ = f_73_ * f_86_ - f_74_ * f_85_;
						float f_91_ = 1.0F / (f_88_ * f_70_ + f_89_ * f_71_ + f_90_ * f_72_);
						f = ((f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_);
						f_47_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_49_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
						f_88_ = f_71_ * f_87_ - f_72_ * f_86_;
						f_89_ = f_72_ * f_85_ - f_70_ * f_87_;
						f_90_ = f_70_ * f_86_ - f_71_ * f_85_;
						f_91_ = 1.0F / (f_88_ * f_73_ + f_89_ * f_74_ + f_90_ * f_75_);
						f_46_ = (f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_;
						f_48_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_50_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
					} else {
						short i_92_ = class159.aShortArray1786[i_42_];
						short i_93_ = class159.aShortArray1787[i_42_];
						short i_94_ = class159.aShortArray1789[i_42_];
						int i_95_ = class95.anIntArray1253[i_53_];
						int i_96_ = class95.anIntArray1251[i_53_];
						int i_97_ = class95.anIntArray1252[i_53_];
						float[] fs = class95.aFloatArrayArray1250[i_53_];
						byte i_98_ = class159.aByteArray1815[i_53_];
						float f_99_ = (float) class159.anIntArray1793[i_53_] / 256.0F;
						if (i_60_ == 1) {
							float f_100_ = ((float) class159.anIntArray1810[i_53_] / 1024.0F);
							method1346(class159.anIntArray1782[i_92_], class159.anIntArray1777[i_92_], class159.anIntArray1797[i_92_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray10338);
							f = aFloatArray10338[0];
							f_46_ = aFloatArray10338[1];
							method1346(class159.anIntArray1782[i_93_], class159.anIntArray1777[i_93_], class159.anIntArray1797[i_93_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray10338);
							f_47_ = aFloatArray10338[0];
							f_48_ = aFloatArray10338[1];
							method1346(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray10338);
							f_49_ = aFloatArray10338[0];
							f_50_ = aFloatArray10338[1];
							float f_101_ = f_100_ / 2.0F;
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > f_101_) {
									f_47_ -= f_100_;
									i_58_ = 1;
								} else if (f - f_47_ > f_101_) {
									f_47_ += f_100_;
									i_58_ = 2;
								}
								if (f_49_ - f > f_101_) {
									f_49_ -= f_100_;
									i_59_ = 1;
								} else if (f - f_49_ > f_101_) {
									f_49_ += f_100_;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > f_101_) {
									f_48_ -= f_100_;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > f_101_) {
									f_48_ += f_100_;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > f_101_) {
									f_50_ -= f_100_;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > f_101_) {
									f_50_ += f_100_;
									i_59_ = 2;
								}
							}
						} else if (i_60_ == 2) {
							float f_102_ = ((float) class159.anIntArray1812[i_53_] / 256.0F);
							float f_103_ = ((float) class159.anIntArray1808[i_53_] / 256.0F);
							int i_104_ = (class159.anIntArray1782[i_93_] - class159.anIntArray1782[i_92_]);
							int i_105_ = (class159.anIntArray1777[i_93_] - class159.anIntArray1777[i_92_]);
							int i_106_ = (class159.anIntArray1797[i_93_] - class159.anIntArray1797[i_92_]);
							int i_107_ = (class159.anIntArray1782[i_94_] - class159.anIntArray1782[i_92_]);
							int i_108_ = (class159.anIntArray1777[i_94_] - class159.anIntArray1777[i_92_]);
							int i_109_ = (class159.anIntArray1797[i_94_] - class159.anIntArray1797[i_92_]);
							int i_110_ = i_105_ * i_109_ - i_108_ * i_106_;
							int i_111_ = i_106_ * i_107_ - i_109_ * i_104_;
							int i_112_ = i_104_ * i_108_ - i_107_ * i_105_;
							float f_113_ = (64.0F / (float) class159.anIntArray1788[i_53_]);
							float f_114_ = (64.0F / (float) class159.anIntArray1770[i_53_]);
							float f_115_ = (64.0F / (float) class159.anIntArray1810[i_53_]);
							float f_116_ = (((float) i_110_ * fs[0] + (float) i_111_ * fs[1] + (float) i_112_ * fs[2]) / f_113_);
							float f_117_ = (((float) i_110_ * fs[3] + (float) i_111_ * fs[4] + (float) i_112_ * fs[5]) / f_114_);
							float f_118_ = (((float) i_110_ * fs[6] + (float) i_111_ * fs[7] + (float) i_112_ * fs[8]) / f_115_);
							i_57_ = method1347(f_116_, f_117_, f_118_);
							method1361(class159.anIntArray1782[i_92_], class159.anIntArray1777[i_92_], class159.anIntArray1797[i_92_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray10338);
							f = aFloatArray10338[0];
							f_46_ = aFloatArray10338[1];
							method1361(class159.anIntArray1782[i_93_], class159.anIntArray1777[i_93_], class159.anIntArray1797[i_93_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray10338);
							f_47_ = aFloatArray10338[0];
							f_48_ = aFloatArray10338[1];
							method1361(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray10338);
							f_49_ = aFloatArray10338[0];
							f_50_ = aFloatArray10338[1];
						} else if (i_60_ == 3) {
							method1479(class159.anIntArray1782[i_92_], class159.anIntArray1777[i_92_], class159.anIntArray1797[i_92_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray10338);
							f = aFloatArray10338[0];
							f_46_ = aFloatArray10338[1];
							method1479(class159.anIntArray1782[i_93_], class159.anIntArray1777[i_93_], class159.anIntArray1797[i_93_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray10338);
							f_47_ = aFloatArray10338[0];
							f_48_ = aFloatArray10338[1];
							method1479(class159.anIntArray1782[i_94_], class159.anIntArray1777[i_94_], class159.anIntArray1797[i_94_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray10338);
							f_49_ = aFloatArray10338[0];
							f_50_ = aFloatArray10338[1];
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > 0.5F) {
									f_47_--;
									i_58_ = 1;
								} else if (f - f_47_ > 0.5F) {
									f_47_++;
									i_58_ = 2;
								}
								if (f_49_ - f > 0.5F) {
									f_49_--;
									i_59_ = 1;
								} else if (f - f_49_ > 0.5F) {
									f_49_++;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > 0.5F) {
									f_48_--;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > 0.5F) {
									f_48_++;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > 0.5F) {
									f_50_--;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > 0.5F) {
									f_50_++;
									i_59_ = 2;
								}
							}
						}
					}
					l_52_ = (long) (i_57_ << 16 | i_53_);
					l_51_ = (long) (i_58_ << 19) | l_52_;
					l = (long) (i_59_ << 19) | l_52_;
				}
			} else {
				l = 0L;
				l_51_ = 0L;
				l_52_ = 0L;
			}
			byte i_119_ = (class159.aByteArray1792 != null ? class159.aByteArray1792[i_42_] : (byte) 0);
			if (i_119_ == 0) {
				long l_120_ = (long) ((i_43_ << 8) + i_44_);
				short i_121_ = class159.aShortArray1786[i_42_];
				short i_122_ = class159.aShortArray1787[i_42_];
				short i_123_ = class159.aShortArray1789[i_42_];
				Class144 class144 = class144s[i_121_];
				((OpenGLModel) this).aShortArray10303[i_41_] = method9546(class159, i_121_, l_120_ | l_52_ << 24, ((Class144) class144).anInt1658, ((Class144) class144).anInt1657, ((Class144) class144).anInt1659, ((Class144) class144).anInt1656, f, f_46_);
				class144 = class144s[i_122_];
				((OpenGLModel) this).aShortArray10327[i_41_] = method9546(class159, i_122_, l_120_ | l_51_ << 24, ((Class144) class144).anInt1658, ((Class144) class144).anInt1657, ((Class144) class144).anInt1659, ((Class144) class144).anInt1656, f_47_, f_48_);
				class144 = class144s[i_123_];
				((OpenGLModel) this).aShortArray10305[i_41_] = method9546(class159, i_123_, l_120_ | l << 24, ((Class144) class144).anInt1658, ((Class144) class144).anInt1657, ((Class144) class144).anInt1659, ((Class144) class144).anInt1656, f_49_, f_50_);
			} else if (i_119_ == 1) {
				Class182 class182 = class182s[i_42_];
				long l_124_ = (((long) (((Class182) class182).anInt2141 & ~0x7fffffff) << 9) + ((long) (((Class182) class182).anInt2140 + 256) << 32) + ((long) (((Class182) class182).anInt2139 + 256) << 24) + (long) (i_43_ << 8) + (long) i_44_);
				((OpenGLModel) this).aShortArray10303[i_41_] = method9546(class159, class159.aShortArray1786[i_42_], l_124_ | l_52_ << 41, ((Class182) class182).anInt2141, ((Class182) class182).anInt2140, ((Class182) class182).anInt2139, 0, f, f_46_);
				((OpenGLModel) this).aShortArray10327[i_41_] = method9546(class159, class159.aShortArray1787[i_42_], l_124_ | l_52_ << 41, ((Class182) class182).anInt2141, ((Class182) class182).anInt2140, ((Class182) class182).anInt2139, 0, f_47_, f_48_);
				((OpenGLModel) this).aShortArray10305[i_41_] = method9546(class159, class159.aShortArray1789[i_42_], l_124_ | l_52_ << 41, ((Class182) class182).anInt2141, ((Class182) class182).anInt2140, ((Class182) class182).anInt2139, 0, f_49_, f_50_);
			}
			if (class159.faceAlpha != null)
				((OpenGLModel) this).aByteArray10302[i_41_] = class159.faceAlpha[i_42_];
			if (class159.aShortArray1800 != null)
				((OpenGLModel) this).aShortArray10286[i_41_] = class159.aShortArray1800[i_42_];
			((OpenGLModel) this).aShortArray10281[i_41_] = class159.faceColours[i_42_];
			((OpenGLModel) this).aShortArray10306[i_41_] = i_45_;
		}
		int i_125_ = 0;
		short i_126_ = -10000;
		for (int i_127_ = 0; i_127_ < ((OpenGLModel) this).anInt10308; i_127_++) {
			short i_128_ = ((OpenGLModel) this).aShortArray10306[i_127_];
			if (i_128_ != i_126_) {
				i_125_++;
				i_126_ = i_128_;
			}
		}
		((OpenGLModel) this).anIntArray10328 = new int[i_125_ + 1];
		i_125_ = 0;
		i_126_ = (short) -10000;
		for (int i_129_ = 0; i_129_ < ((OpenGLModel) this).anInt10308; i_129_++) {
			short i_130_ = ((OpenGLModel) this).aShortArray10306[i_129_];
			if (i_130_ != i_126_) {
				((OpenGLModel) this).anIntArray10328[i_125_++] = i_129_;
				i_126_ = i_130_;
			}
		}
		((OpenGLModel) this).anIntArray10328[i_125_] = ((OpenGLModel) this).anInt10308;
		aLongArray10337 = null;
		((OpenGLModel) this).aShortArray10292 = method9545(((OpenGLModel) this).aShortArray10292, ((OpenGLModel) this).anInt10291);
		((OpenGLModel) this).aShortArray10293 = method9545(((OpenGLModel) this).aShortArray10293, ((OpenGLModel) this).anInt10291);
		((OpenGLModel) this).aShortArray10288 = method9545(((OpenGLModel) this).aShortArray10288, ((OpenGLModel) this).anInt10291);
		((OpenGLModel) this).aByteArray10295 = method9544(((OpenGLModel) this).aByteArray10295, ((OpenGLModel) this).anInt10291);
		((OpenGLModel) this).aFloatArray10297 = method9557(((OpenGLModel) this).aFloatArray10297, ((OpenGLModel) this).anInt10291);
		((OpenGLModel) this).aFloatArray10339 = method9557(((OpenGLModel) this).aFloatArray10339, ((OpenGLModel) this).anInt10291);
		if (class159.anIntArray1813 != null && Class140.method2380(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) this).anIntArrayArray10289 = class159.method2559(false);
		if (class159.aClass107Array1783 != null && Class140.method2375(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) this).anIntArrayArray10323 = class159.method2561();
		if (class159.anIntArray1780 != null && Class140.method2425(i, ((OpenGLModel) this).anInt10294)) {
			int i_131_ = 0;
			int[] is_132_ = new int[256];
			for (int i_133_ = 0; i_133_ < ((OpenGLModel) this).anInt10299; i_133_++) {
				int i_134_ = class159.anIntArray1780[is[i_133_]];
				if (i_134_ >= 0) {
					is_132_[i_134_]++;
					if (i_134_ > i_131_)
						i_131_ = i_134_;
				}
			}
			((OpenGLModel) this).anIntArrayArray10307 = new int[i_131_ + 1][];
			for (int i_135_ = 0; i_135_ <= i_131_; i_135_++) {
				((OpenGLModel) this).anIntArrayArray10307[i_135_] = new int[is_132_[i_135_]];
				is_132_[i_135_] = 0;
			}
			for (int i_136_ = 0; i_136_ < ((OpenGLModel) this).anInt10299; i_136_++) {
				int i_137_ = class159.anIntArray1780[is[i_136_]];
				if (i_137_ >= 0)
					((OpenGLModel) this).anIntArrayArray10307[i_137_][is_132_[i_137_]++] = i_136_;
			}
		}
	}

	void method9543() {
		if (((OpenGLModel) this).anInt10308 != 0) {
			if (((OpenGLModel) this).aByte10279 != 0)
				method9553(true);
			method9553(false);
			if (((OpenGLModel) this).aClass139_10301 != null) {
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
					method9552((((OpenGLModel) this).aByte10279 & 0x10) != 0);
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) != null) {
					((OpenGLModel) this).aClass106_Sub1_10340.method9429(((OpenGLModel) this).aClass142_10315 != null);
					((OpenGLModel) this).aClass106_Sub1_10340.method9416(((OpenGLModel) this).aClass142_10309, ((OpenGLModel) this).aClass142_10315, ((OpenGLModel) this).aClass142_10270, ((OpenGLModel) this).aClass142_10312);
					int i = ((OpenGLModel) this).anIntArray10328.length - 1;
					for (int i_138_ = 0; i_138_ < i; i_138_++) {
						int i_139_ = ((OpenGLModel) this).anIntArray10328[i_138_];
						int i_140_ = (((OpenGLModel) this).anIntArray10328[i_138_ + 1]);
						int i_141_ = ((((OpenGLModel) this).aShortArray10306[i_139_] == -1) ? -1 : (((OpenGLModel) this).aShortArray10306[i_139_]) & 0xffff);
						((OpenGLModel) this).aClass106_Sub1_10340.method9484(i_141_, ((OpenGLModel) this).aClass142_10315 != null);
						((OpenGLModel) this).aClass106_Sub1_10340.method9411((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611), 4, i_139_ * 3, (i_140_ - i_139_) * 3);
					}
				}
			}
			method9547();
		}
	}

	static byte[] method9544(byte[] is, int i) {
		byte[] is_142_ = new byte[i];
		System.arraycopy(is, 0, is_142_, 0, i);
		return is_142_;
	}

	static short[] method9545(short[] is, int i) {
		short[] is_143_ = new short[i];
		System.arraycopy(is, 0, is_143_, 0, i);
		return is_143_;
	}

	short method9546(Class159 class159, int i, long l, int i_144_, int i_145_, int i_146_, int i_147_, float f, float f_148_) {
		int i_149_ = ((OpenGLModel) this).anIntArray10329[i];
		int i_150_ = ((OpenGLModel) this).anIntArray10329[i + 1];
		int i_151_ = 0;
		for (int i_152_ = i_149_; i_152_ < i_150_; i_152_++) {
			if (((OpenGLModel) this).aShortArray10330[i_152_] == 0) {
				i_151_ = i_152_;
				break;
			}
			int i_153_ = ((((OpenGLModel) this).aShortArray10330[i_152_] & 0xffff) - 1);
			if (aLongArray10337[i_152_] == l)
				return (short) i_153_;
		}
		((OpenGLModel) this).aShortArray10330[i_151_] = (short) (((OpenGLModel) this).anInt10291 + 1);
		aLongArray10337[i_151_] = l;
		((OpenGLModel) this).aShortArray10292[(((OpenGLModel) this).anInt10291)] = (short) i_144_;
		((OpenGLModel) this).aShortArray10293[(((OpenGLModel) this).anInt10291)] = (short) i_145_;
		((OpenGLModel) this).aShortArray10288[(((OpenGLModel) this).anInt10291)] = (short) i_146_;
		((OpenGLModel) this).aByteArray10295[((OpenGLModel) this).anInt10291] = (byte) i_147_;
		((OpenGLModel) this).aFloatArray10297[(((OpenGLModel) this).anInt10291)] = f;
		((OpenGLModel) this).aFloatArray10339[(((OpenGLModel) this).anInt10291)] = f_148_;
		return (short) ((OpenGLModel) this).anInt10291++;
	}

	public int method1353() {
		return ((OpenGLModel) this).anInt10277;
	}

	public void method1450(int i) {
		((OpenGLModel) this).anInt10277 = i;
		if (((OpenGLModel) this).aClass164_10296 != null && (((OpenGLModel) this).anInt10277 & 0x10000) == 0) {
			((OpenGLModel) this).aShortArray10292 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
			((OpenGLModel) this).aShortArray10293 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
			((OpenGLModel) this).aShortArray10288 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
			((OpenGLModel) this).aByteArray10295 = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			((OpenGLModel) this).aClass164_10296 = null;
		}
		((OpenGLModel) this).aBool10316 = true;
		method9547();
	}

	void method1441(int i, int i_154_, int i_155_, int i_156_) {
		if (i == 0) {
			int i_157_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_158_ = 0; i_158_ < ((OpenGLModel) this).anInt10285; i_158_++) {
				anInt10342 += ((OpenGLModel) this).anIntArray10336[i_158_];
				anInt10310 += ((OpenGLModel) this).anIntArray10287[i_158_];
				anInt10344 += ((OpenGLModel) this).anIntArray10331[i_158_];
				i_157_++;
			}
			if (i_157_ > 0) {
				anInt10342 = anInt10342 / i_157_ + i_154_;
				anInt10310 = anInt10310 / i_157_ + i_155_;
				anInt10344 = anInt10344 / i_157_ + i_156_;
			} else {
				anInt10342 = i_154_;
				anInt10310 = i_155_;
				anInt10344 = i_156_;
			}
		} else if (i == 1) {
			for (int i_159_ = 0; i_159_ < ((OpenGLModel) this).anInt10285; i_159_++) {
				((OpenGLModel) this).anIntArray10336[i_159_] += i_154_;
				((OpenGLModel) this).anIntArray10287[i_159_] += i_155_;
				((OpenGLModel) this).anIntArray10331[i_159_] += i_156_;
			}
		} else if (i == 2) {
			for (int i_160_ = 0; i_160_ < ((OpenGLModel) this).anInt10285; i_160_++) {
				((OpenGLModel) this).anIntArray10336[i_160_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_160_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_160_] -= anInt10344;
				if (i_156_ != 0) {
					int i_161_ = Class325.anIntArray4103[i_156_];
					int i_162_ = Class325.anIntArray4105[i_156_];
					int i_163_ = (((((OpenGLModel) this).anIntArray10287[i_160_] * i_161_) + (((OpenGLModel) this).anIntArray10336[i_160_] * i_162_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10287[i_160_] = ((((OpenGLModel) this).anIntArray10287[i_160_] * i_162_) - (((OpenGLModel) this).anIntArray10336[i_160_] * i_161_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_160_] = i_163_;
				}
				if (i_154_ != 0) {
					int i_164_ = Class325.anIntArray4103[i_154_];
					int i_165_ = Class325.anIntArray4105[i_154_];
					int i_166_ = (((((OpenGLModel) this).anIntArray10287[i_160_] * i_165_) - (((OpenGLModel) this).anIntArray10331[i_160_] * i_164_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_160_] = ((((OpenGLModel) this).anIntArray10287[i_160_] * i_164_) + (((OpenGLModel) this).anIntArray10331[i_160_] * i_165_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10287[i_160_] = i_166_;
				}
				if (i_155_ != 0) {
					int i_167_ = Class325.anIntArray4103[i_155_];
					int i_168_ = Class325.anIntArray4105[i_155_];
					int i_169_ = (((((OpenGLModel) this).anIntArray10331[i_160_] * i_167_) + (((OpenGLModel) this).anIntArray10336[i_160_] * i_168_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_160_] = ((((OpenGLModel) this).anIntArray10331[i_160_] * i_168_) - (((OpenGLModel) this).anIntArray10336[i_160_] * i_167_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_160_] = i_169_;
				}
				((OpenGLModel) this).anIntArray10336[i_160_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_160_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_160_] += anInt10344;
			}
		} else if (i == 3) {
			for (int i_170_ = 0; i_170_ < ((OpenGLModel) this).anInt10285; i_170_++) {
				((OpenGLModel) this).anIntArray10336[i_170_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_170_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_170_] -= anInt10344;
				((OpenGLModel) this).anIntArray10336[i_170_] = (((OpenGLModel) this).anIntArray10336[i_170_] * i_154_ / 128);
				((OpenGLModel) this).anIntArray10287[i_170_] = (((OpenGLModel) this).anIntArray10287[i_170_] * i_155_ / 128);
				((OpenGLModel) this).anIntArray10331[i_170_] = (((OpenGLModel) this).anIntArray10331[i_170_] * i_156_ / 128);
				((OpenGLModel) this).anIntArray10336[i_170_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_170_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_170_] += anInt10344;
			}
		} else if (i == 5) {
			for (int i_171_ = 0; i_171_ < ((OpenGLModel) this).anInt10299; i_171_++) {
				int i_172_ = ((((OpenGLModel) this).aByteArray10302[i_171_] & 0xff) + i_154_ * 8);
				if (i_172_ < 0)
					i_172_ = 0;
				else if (i_172_ > 255)
					i_172_ = 255;
				((OpenGLModel) this).aByteArray10302[i_171_] = (byte) i_172_;
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_173_ = 0; i_173_ < ((OpenGLModel) this).anInt10333; i_173_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_173_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_173_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_174_ = 0; i_174_ < ((OpenGLModel) this).anInt10299; i_174_++) {
				int i_175_ = ((OpenGLModel) this).aShortArray10281[i_174_] & 0xffff;
				int i_176_ = i_175_ >> 10 & 0x3f;
				int i_177_ = i_175_ >> 7 & 0x7;
				int i_178_ = i_175_ & 0x7f;
				i_176_ = i_176_ + i_154_ & 0x3f;
				i_177_ += i_155_ / 4;
				if (i_177_ < 0)
					i_177_ = 0;
				else if (i_177_ > 7)
					i_177_ = 7;
				i_178_ += i_156_;
				if (i_178_ < 0)
					i_178_ = 0;
				else if (i_178_ > 127)
					i_178_ = 127;
				((OpenGLModel) this).aShortArray10281[i_174_] = (short) (i_176_ << 10 | i_177_ << 7 | i_178_);
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_179_ = 0; i_179_ < ((OpenGLModel) this).anInt10333; i_179_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_179_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_179_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_180_ = 0; i_180_ < ((OpenGLModel) this).anInt10333; i_180_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_180_];
				((Class150) class150).anInt1698 += i_154_;
				((Class150) class150).anInt1696 += i_155_;
			}
		} else if (i == 10) {
			for (int i_181_ = 0; i_181_ < ((OpenGLModel) this).anInt10333; i_181_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_181_];
				((Class150) class150).anInt1697 = ((Class150) class150).anInt1697 * i_154_ >> 7;
				((Class150) class150).anInt1695 = ((Class150) class150).anInt1695 * i_155_ >> 7;
			}
		} else if (i == 9) {
			for (int i_182_ = 0; i_182_ < ((OpenGLModel) this).anInt10333; i_182_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_182_];
				((Class150) class150).anInt1693 = ((Class150) class150).anInt1693 + i_154_ & 0x3fff;
			}
		}
	}

	public Model method1351(byte i, int i_183_, boolean bool) {
		boolean bool_184_ = false;
		OpenGLModel class89_sub1_185_;
		OpenGLModel class89_sub1_186_;
		if (i > 0 && i <= 8) {
			class89_sub1_186_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass89_Sub1Array10182[i - 1]);
			class89_sub1_185_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass89_Sub1Array10181[i - 1]);
			bool_184_ = true;
		} else
			class89_sub1_185_ = class89_sub1_186_ = new OpenGLModel(((OpenGLModel) this).aClass106_Sub1_10340);
		return method9559(class89_sub1_185_, class89_sub1_186_, i_183_, bool_184_, bool);
	}

	void method1436(int i, int[] is, int i_187_, int i_188_, int i_189_, boolean bool, int i_190_, int[] is_191_) {
		int i_192_ = is.length;
		if (i == 0) {
			i_187_ <<= 4;
			i_188_ <<= 4;
			i_189_ <<= 4;
			int i_193_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_194_ = 0; i_194_ < i_192_; i_194_++) {
				int i_195_ = is[i_194_];
				if (i_195_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_196_ = ((OpenGLModel) this).anIntArrayArray10289[i_195_];
					for (int i_197_ = 0; i_197_ < is_196_.length; i_197_++) {
						int i_198_ = is_196_[i_197_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_190_ & (((OpenGLModel) this).aShortArray10290[i_198_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_198_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_198_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_198_]);
							i_193_++;
						}
					}
				}
			}
			if (i_193_ > 0) {
				anInt10342 = anInt10342 / i_193_ + i_187_;
				anInt10310 = anInt10310 / i_193_ + i_188_;
				anInt10344 = anInt10344 / i_193_ + i_189_;
				aBool10345 = true;
			} else {
				anInt10342 = i_187_;
				anInt10310 = i_188_;
				anInt10344 = i_189_;
			}
		} else if (i == 1) {
			if (is_191_ != null) {
				int i_199_ = ((is_191_[0] * i_187_ + is_191_[1] * i_188_ + is_191_[2] * i_189_ + 8192) >> 14);
				int i_200_ = ((is_191_[3] * i_187_ + is_191_[4] * i_188_ + is_191_[5] * i_189_ + 8192) >> 14);
				int i_201_ = ((is_191_[6] * i_187_ + is_191_[7] * i_188_ + is_191_[8] * i_189_ + 8192) >> 14);
				i_187_ = i_199_;
				i_188_ = i_200_;
				i_189_ = i_201_;
			}
			i_187_ <<= 4;
			i_188_ <<= 4;
			i_189_ <<= 4;
			for (int i_202_ = 0; i_202_ < i_192_; i_202_++) {
				int i_203_ = is[i_202_];
				if (i_203_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_204_ = ((OpenGLModel) this).anIntArrayArray10289[i_203_];
					for (int i_205_ = 0; i_205_ < is_204_.length; i_205_++) {
						int i_206_ = is_204_[i_205_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_190_ & (((OpenGLModel) this).aShortArray10290[i_206_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_206_] += i_187_;
							((OpenGLModel) this).anIntArray10287[i_206_] += i_188_;
							((OpenGLModel) this).anIntArray10331[i_206_] += i_189_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_191_ != null) {
				int i_207_ = is_191_[9] << 4;
				int i_208_ = is_191_[10] << 4;
				int i_209_ = is_191_[11] << 4;
				int i_210_ = is_191_[12] << 4;
				int i_211_ = is_191_[13] << 4;
				int i_212_ = is_191_[14] << 4;
				if (aBool10345) {
					int i_213_ = ((is_191_[0] * anInt10342 + is_191_[3] * anInt10310 + is_191_[6] * anInt10344 + 8192) >> 14);
					int i_214_ = ((is_191_[1] * anInt10342 + is_191_[4] * anInt10310 + is_191_[7] * anInt10344 + 8192) >> 14);
					int i_215_ = ((is_191_[2] * anInt10342 + is_191_[5] * anInt10310 + is_191_[8] * anInt10344 + 8192) >> 14);
					i_213_ += i_210_;
					i_214_ += i_211_;
					i_215_ += i_212_;
					anInt10342 = i_213_;
					anInt10310 = i_214_;
					anInt10344 = i_215_;
					aBool10345 = false;
				}
				int[] is_216_ = new int[9];
				int i_217_ = Class325.anIntArray4105[i_187_];
				int i_218_ = Class325.anIntArray4103[i_187_];
				int i_219_ = Class325.anIntArray4105[i_188_];
				int i_220_ = Class325.anIntArray4103[i_188_];
				int i_221_ = Class325.anIntArray4105[i_189_];
				int i_222_ = Class325.anIntArray4103[i_189_];
				int i_223_ = i_218_ * i_221_ + 8192 >> 14;
				int i_224_ = i_218_ * i_222_ + 8192 >> 14;
				is_216_[0] = i_219_ * i_221_ + i_220_ * i_224_ + 8192 >> 14;
				is_216_[1] = -i_219_ * i_222_ + i_220_ * i_223_ + 8192 >> 14;
				is_216_[2] = i_220_ * i_217_ + 8192 >> 14;
				is_216_[3] = i_217_ * i_222_ + 8192 >> 14;
				is_216_[4] = i_217_ * i_221_ + 8192 >> 14;
				is_216_[5] = -i_218_;
				is_216_[6] = -i_220_ * i_221_ + i_219_ * i_224_ + 8192 >> 14;
				is_216_[7] = i_220_ * i_222_ + i_219_ * i_223_ + 8192 >> 14;
				is_216_[8] = i_219_ * i_217_ + 8192 >> 14;
				int i_225_ = ((is_216_[0] * -anInt10342 + is_216_[1] * -anInt10310 + is_216_[2] * -anInt10344 + 8192) >> 14);
				int i_226_ = ((is_216_[3] * -anInt10342 + is_216_[4] * -anInt10310 + is_216_[5] * -anInt10344 + 8192) >> 14);
				int i_227_ = ((is_216_[6] * -anInt10342 + is_216_[7] * -anInt10310 + is_216_[8] * -anInt10344 + 8192) >> 14);
				int i_228_ = i_225_ + anInt10342;
				int i_229_ = i_226_ + anInt10310;
				int i_230_ = i_227_ + anInt10344;
				int[] is_231_ = new int[9];
				for (int i_232_ = 0; i_232_ < 3; i_232_++) {
					for (int i_233_ = 0; i_233_ < 3; i_233_++) {
						int i_234_ = 0;
						for (int i_235_ = 0; i_235_ < 3; i_235_++)
							i_234_ += (is_216_[i_232_ * 3 + i_235_] * is_191_[i_233_ * 3 + i_235_]);
						is_231_[i_232_ * 3 + i_233_] = i_234_ + 8192 >> 14;
					}
				}
				int i_236_ = ((is_216_[0] * i_210_ + is_216_[1] * i_211_ + is_216_[2] * i_212_ + 8192) >> 14);
				int i_237_ = ((is_216_[3] * i_210_ + is_216_[4] * i_211_ + is_216_[5] * i_212_ + 8192) >> 14);
				int i_238_ = ((is_216_[6] * i_210_ + is_216_[7] * i_211_ + is_216_[8] * i_212_ + 8192) >> 14);
				i_236_ += i_228_;
				i_237_ += i_229_;
				i_238_ += i_230_;
				int[] is_239_ = new int[9];
				for (int i_240_ = 0; i_240_ < 3; i_240_++) {
					for (int i_241_ = 0; i_241_ < 3; i_241_++) {
						int i_242_ = 0;
						for (int i_243_ = 0; i_243_ < 3; i_243_++)
							i_242_ += (is_191_[i_240_ * 3 + i_243_] * is_231_[i_241_ + i_243_ * 3]);
						is_239_[i_240_ * 3 + i_241_] = i_242_ + 8192 >> 14;
					}
				}
				int i_244_ = ((is_191_[0] * i_236_ + is_191_[1] * i_237_ + is_191_[2] * i_238_ + 8192) >> 14);
				int i_245_ = ((is_191_[3] * i_236_ + is_191_[4] * i_237_ + is_191_[5] * i_238_ + 8192) >> 14);
				int i_246_ = ((is_191_[6] * i_236_ + is_191_[7] * i_237_ + is_191_[8] * i_238_ + 8192) >> 14);
				i_244_ += i_207_;
				i_245_ += i_208_;
				i_246_ += i_209_;
				for (int i_247_ = 0; i_247_ < i_192_; i_247_++) {
					int i_248_ = is[i_247_];
					if (i_248_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_249_ = (((OpenGLModel) this).anIntArrayArray10289[i_248_]);
						for (int i_250_ = 0; i_250_ < is_249_.length; i_250_++) {
							int i_251_ = is_249_[i_250_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10290[i_251_])) != 0)) {
								int i_252_ = ((is_239_[0] * (((OpenGLModel) this).anIntArray10336[i_251_]) + is_239_[1] * (((OpenGLModel) this).anIntArray10287[i_251_]) + is_239_[2] * (((OpenGLModel) this).anIntArray10331[i_251_]) + 8192) >> 14);
								int i_253_ = ((is_239_[3] * (((OpenGLModel) this).anIntArray10336[i_251_]) + is_239_[4] * (((OpenGLModel) this).anIntArray10287[i_251_]) + is_239_[5] * (((OpenGLModel) this).anIntArray10331[i_251_]) + 8192) >> 14);
								int i_254_ = ((is_239_[6] * (((OpenGLModel) this).anIntArray10336[i_251_]) + is_239_[7] * (((OpenGLModel) this).anIntArray10287[i_251_]) + is_239_[8] * (((OpenGLModel) this).anIntArray10331[i_251_]) + 8192) >> 14);
								i_252_ += i_244_;
								i_253_ += i_245_;
								i_254_ += i_246_;
								((OpenGLModel) this).anIntArray10336[i_251_] = i_252_;
								((OpenGLModel) this).anIntArray10287[i_251_] = i_253_;
								((OpenGLModel) this).anIntArray10331[i_251_] = i_254_;
							}
						}
					}
				}
			} else {
				for (int i_255_ = 0; i_255_ < i_192_; i_255_++) {
					int i_256_ = is[i_255_];
					if (i_256_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_257_ = (((OpenGLModel) this).anIntArrayArray10289[i_256_]);
						for (int i_258_ = 0; i_258_ < is_257_.length; i_258_++) {
							int i_259_ = is_257_[i_258_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10290[i_259_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_259_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_259_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_259_] -= anInt10344;
								if (i_189_ != 0) {
									int i_260_ = Class325.anIntArray4103[i_189_];
									int i_261_ = Class325.anIntArray4105[i_189_];
									int i_262_ = (((((OpenGLModel) this).anIntArray10287[i_259_]) * i_260_ + ((((OpenGLModel) this).anIntArray10336[i_259_]) * i_261_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_259_] = ((((OpenGLModel) this).anIntArray10287[i_259_]) * i_261_ - ((((OpenGLModel) this).anIntArray10336[i_259_]) * i_260_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_259_] = i_262_;
								}
								if (i_187_ != 0) {
									int i_263_ = Class325.anIntArray4103[i_187_];
									int i_264_ = Class325.anIntArray4105[i_187_];
									int i_265_ = (((((OpenGLModel) this).anIntArray10287[i_259_]) * i_264_ - ((((OpenGLModel) this).anIntArray10331[i_259_]) * i_263_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_259_] = ((((OpenGLModel) this).anIntArray10287[i_259_]) * i_263_ + ((((OpenGLModel) this).anIntArray10331[i_259_]) * i_264_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_259_] = i_265_;
								}
								if (i_188_ != 0) {
									int i_266_ = Class325.anIntArray4103[i_188_];
									int i_267_ = Class325.anIntArray4105[i_188_];
									int i_268_ = (((((OpenGLModel) this).anIntArray10331[i_259_]) * i_266_ + ((((OpenGLModel) this).anIntArray10336[i_259_]) * i_267_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_259_] = ((((OpenGLModel) this).anIntArray10331[i_259_]) * i_267_ - ((((OpenGLModel) this).anIntArray10336[i_259_]) * i_266_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_259_] = i_268_;
								}
								((OpenGLModel) this).anIntArray10336[i_259_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_259_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_259_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_269_ = 0; i_269_ < i_192_; i_269_++) {
						int i_270_ = is[i_269_];
						if (i_270_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_271_ = (((OpenGLModel) this).anIntArrayArray10289[i_270_]);
							for (int i_272_ = 0; i_272_ < is_271_.length; i_272_++) {
								int i_273_ = is_271_[i_272_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || ((i_190_ & (((OpenGLModel) this).aShortArray10290[i_273_])) != 0)) {
									int i_274_ = (((OpenGLModel) this).anIntArray10329[i_273_]);
									int i_275_ = (((OpenGLModel) this).anIntArray10329[i_273_ + 1]);
									for (int i_276_ = i_274_; (i_276_ < i_275_ && (((OpenGLModel) this).aShortArray10330[i_276_]) != 0); i_276_++) {
										int i_277_ = (((((OpenGLModel) this).aShortArray10330[i_276_]) & 0xffff) - 1);
										if (i_189_ != 0) {
											int i_278_ = (Class325.anIntArray4103[i_189_]);
											int i_279_ = (Class325.anIntArray4105[i_189_]);
											int i_280_ = (((((OpenGLModel) this).aShortArray10293[i_277_]) * i_278_ + (((OpenGLModel) this).aShortArray10292[i_277_]) * i_279_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_277_] = (short) (((((OpenGLModel) this).aShortArray10293[i_277_]) * i_279_ - ((((OpenGLModel) this).aShortArray10292[i_277_]) * i_278_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_277_] = (short) i_280_;
										}
										if (i_187_ != 0) {
											int i_281_ = (Class325.anIntArray4103[i_187_]);
											int i_282_ = (Class325.anIntArray4105[i_187_]);
											int i_283_ = (((((OpenGLModel) this).aShortArray10293[i_277_]) * i_282_ - (((OpenGLModel) this).aShortArray10288[i_277_]) * i_281_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_277_] = (short) (((((OpenGLModel) this).aShortArray10293[i_277_]) * i_281_ + ((((OpenGLModel) this).aShortArray10288[i_277_]) * i_282_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_277_] = (short) i_283_;
										}
										if (i_188_ != 0) {
											int i_284_ = (Class325.anIntArray4103[i_188_]);
											int i_285_ = (Class325.anIntArray4105[i_188_]);
											int i_286_ = (((((OpenGLModel) this).aShortArray10288[i_277_]) * i_284_ + (((OpenGLModel) this).aShortArray10292[i_277_]) * i_285_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_277_] = (short) (((((OpenGLModel) this).aShortArray10288[i_277_]) * i_285_ - ((((OpenGLModel) this).aShortArray10292[i_277_]) * i_284_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_277_] = (short) i_286_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_191_ != null) {
				int i_287_ = is_191_[9] << 4;
				int i_288_ = is_191_[10] << 4;
				int i_289_ = is_191_[11] << 4;
				int i_290_ = is_191_[12] << 4;
				int i_291_ = is_191_[13] << 4;
				int i_292_ = is_191_[14] << 4;
				if (aBool10345) {
					int i_293_ = ((is_191_[0] * anInt10342 + is_191_[3] * anInt10310 + is_191_[6] * anInt10344 + 8192) >> 14);
					int i_294_ = ((is_191_[1] * anInt10342 + is_191_[4] * anInt10310 + is_191_[7] * anInt10344 + 8192) >> 14);
					int i_295_ = ((is_191_[2] * anInt10342 + is_191_[5] * anInt10310 + is_191_[8] * anInt10344 + 8192) >> 14);
					i_293_ += i_290_;
					i_294_ += i_291_;
					i_295_ += i_292_;
					anInt10342 = i_293_;
					anInt10310 = i_294_;
					anInt10344 = i_295_;
					aBool10345 = false;
				}
				int i_296_ = i_187_ << 15 >> 7;
				int i_297_ = i_188_ << 15 >> 7;
				int i_298_ = i_189_ << 15 >> 7;
				int i_299_ = i_296_ * -anInt10342 + 8192 >> 14;
				int i_300_ = i_297_ * -anInt10310 + 8192 >> 14;
				int i_301_ = i_298_ * -anInt10344 + 8192 >> 14;
				int i_302_ = i_299_ + anInt10342;
				int i_303_ = i_300_ + anInt10310;
				int i_304_ = i_301_ + anInt10344;
				int[] is_305_ = new int[9];
				is_305_[0] = i_296_ * is_191_[0] + 8192 >> 14;
				is_305_[1] = i_296_ * is_191_[3] + 8192 >> 14;
				is_305_[2] = i_296_ * is_191_[6] + 8192 >> 14;
				is_305_[3] = i_297_ * is_191_[1] + 8192 >> 14;
				is_305_[4] = i_297_ * is_191_[4] + 8192 >> 14;
				is_305_[5] = i_297_ * is_191_[7] + 8192 >> 14;
				is_305_[6] = i_298_ * is_191_[2] + 8192 >> 14;
				is_305_[7] = i_298_ * is_191_[5] + 8192 >> 14;
				is_305_[8] = i_298_ * is_191_[8] + 8192 >> 14;
				int i_306_ = i_296_ * i_290_ + 8192 >> 14;
				int i_307_ = i_297_ * i_291_ + 8192 >> 14;
				int i_308_ = i_298_ * i_292_ + 8192 >> 14;
				i_306_ += i_302_;
				i_307_ += i_303_;
				i_308_ += i_304_;
				int[] is_309_ = new int[9];
				for (int i_310_ = 0; i_310_ < 3; i_310_++) {
					for (int i_311_ = 0; i_311_ < 3; i_311_++) {
						int i_312_ = 0;
						for (int i_313_ = 0; i_313_ < 3; i_313_++)
							i_312_ += (is_191_[i_310_ * 3 + i_313_] * is_305_[i_311_ + i_313_ * 3]);
						is_309_[i_310_ * 3 + i_311_] = i_312_ + 8192 >> 14;
					}
				}
				int i_314_ = ((is_191_[0] * i_306_ + is_191_[1] * i_307_ + is_191_[2] * i_308_ + 8192) >> 14);
				int i_315_ = ((is_191_[3] * i_306_ + is_191_[4] * i_307_ + is_191_[5] * i_308_ + 8192) >> 14);
				int i_316_ = ((is_191_[6] * i_306_ + is_191_[7] * i_307_ + is_191_[8] * i_308_ + 8192) >> 14);
				i_314_ += i_287_;
				i_315_ += i_288_;
				i_316_ += i_289_;
				for (int i_317_ = 0; i_317_ < i_192_; i_317_++) {
					int i_318_ = is[i_317_];
					if (i_318_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_319_ = (((OpenGLModel) this).anIntArrayArray10289[i_318_]);
						for (int i_320_ = 0; i_320_ < is_319_.length; i_320_++) {
							int i_321_ = is_319_[i_320_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10290[i_321_])) != 0)) {
								int i_322_ = ((is_309_[0] * (((OpenGLModel) this).anIntArray10336[i_321_]) + is_309_[1] * (((OpenGLModel) this).anIntArray10287[i_321_]) + is_309_[2] * (((OpenGLModel) this).anIntArray10331[i_321_]) + 8192) >> 14);
								int i_323_ = ((is_309_[3] * (((OpenGLModel) this).anIntArray10336[i_321_]) + is_309_[4] * (((OpenGLModel) this).anIntArray10287[i_321_]) + is_309_[5] * (((OpenGLModel) this).anIntArray10331[i_321_]) + 8192) >> 14);
								int i_324_ = ((is_309_[6] * (((OpenGLModel) this).anIntArray10336[i_321_]) + is_309_[7] * (((OpenGLModel) this).anIntArray10287[i_321_]) + is_309_[8] * (((OpenGLModel) this).anIntArray10331[i_321_]) + 8192) >> 14);
								i_322_ += i_314_;
								i_323_ += i_315_;
								i_324_ += i_316_;
								((OpenGLModel) this).anIntArray10336[i_321_] = i_322_;
								((OpenGLModel) this).anIntArray10287[i_321_] = i_323_;
								((OpenGLModel) this).anIntArray10331[i_321_] = i_324_;
							}
						}
					}
				}
			} else {
				for (int i_325_ = 0; i_325_ < i_192_; i_325_++) {
					int i_326_ = is[i_325_];
					if (i_326_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_327_ = (((OpenGLModel) this).anIntArrayArray10289[i_326_]);
						for (int i_328_ = 0; i_328_ < is_327_.length; i_328_++) {
							int i_329_ = is_327_[i_328_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10290[i_329_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_329_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_329_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_329_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_329_] = (((OpenGLModel) this).anIntArray10336[i_329_]) * i_187_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_329_] = (((OpenGLModel) this).anIntArray10287[i_329_]) * i_188_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_329_] = (((OpenGLModel) this).anIntArray10331[i_329_]) * i_189_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_329_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_329_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_329_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_330_ = 0; i_330_ < i_192_; i_330_++) {
					int i_331_ = is[i_330_];
					if (i_331_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_332_ = (((OpenGLModel) this).anIntArrayArray10307[i_331_]);
						for (int i_333_ = 0; i_333_ < is_332_.length; i_333_++) {
							int i_334_ = is_332_[i_333_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10286[i_334_])) != 0)) {
								int i_335_ = (((((OpenGLModel) this).aByteArray10302[i_334_]) & 0xff) + i_187_ * 8);
								if (i_335_ < 0)
									i_335_ = 0;
								else if (i_335_ > 255)
									i_335_ = 255;
								((OpenGLModel) this).aByteArray10302[i_334_] = (byte) i_335_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_336_ = 0; i_336_ < ((OpenGLModel) this).anInt10333; i_336_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_336_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_336_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_337_ = 0; i_337_ < i_192_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_339_ = (((OpenGLModel) this).anIntArrayArray10307[i_338_]);
						for (int i_340_ = 0; i_340_ < is_339_.length; i_340_++) {
							int i_341_ = is_339_[i_340_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_190_ & (((OpenGLModel) this).aShortArray10286[i_341_])) != 0)) {
								int i_342_ = ((((OpenGLModel) this).aShortArray10281[i_341_]) & 0xffff);
								int i_343_ = i_342_ >> 10 & 0x3f;
								int i_344_ = i_342_ >> 7 & 0x7;
								int i_345_ = i_342_ & 0x7f;
								i_343_ = i_343_ + i_187_ & 0x3f;
								i_344_ += i_188_ / 4;
								if (i_344_ < 0)
									i_344_ = 0;
								else if (i_344_ > 7)
									i_344_ = 7;
								i_345_ += i_189_;
								if (i_345_ < 0)
									i_345_ = 0;
								else if (i_345_ > 127)
									i_345_ = 127;
								((OpenGLModel) this).aShortArray10281[i_341_] = (short) (i_343_ << 10 | i_344_ << 7 | i_345_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_346_ = 0; i_346_ < ((OpenGLModel) this).anInt10333; i_346_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_346_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_346_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_347_ = 0; i_347_ < i_192_; i_347_++) {
					int i_348_ = is[i_347_];
					if (i_348_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_349_ = (((OpenGLModel) this).anIntArrayArray10323[i_348_]);
						for (int i_350_ = 0; i_350_ < is_349_.length; i_350_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_349_[i_350_]]);
							((Class150) class150).anInt1698 += i_187_;
							((Class150) class150).anInt1696 += i_188_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_351_ = 0; i_351_ < i_192_; i_351_++) {
					int i_352_ = is[i_351_];
					if (i_352_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_353_ = (((OpenGLModel) this).anIntArrayArray10323[i_352_]);
						for (int i_354_ = 0; i_354_ < is_353_.length; i_354_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_353_[i_354_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_187_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_188_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_355_ = 0; i_355_ < i_192_; i_355_++) {
					int i_356_ = is[i_355_];
					if (i_356_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_357_ = (((OpenGLModel) this).anIntArrayArray10323[i_356_]);
						for (int i_358_ = 0; i_358_ < is_357_.length; i_358_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_357_[i_358_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_187_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method9547() {
		if (((OpenGLModel) this).aBool10316) {
			((OpenGLModel) this).aBool10316 = false;
			if (((OpenGLModel) this).aClass84Array10300 == null && ((OpenGLModel) this).aClass175Array10332 == null && ((OpenGLModel) this).aClass173Array10334 == null && !Class140.method2349(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				boolean bool = false;
				boolean bool_359_ = false;
				boolean bool_360_ = false;
				if (((OpenGLModel) this).anIntArray10336 != null && !Class140.method2367(((OpenGLModel) this).anInt10277, (((OpenGLModel) this).anInt10294))) {
					if (((OpenGLModel) this).aClass142_10309 == null || (((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615) != null) {
						if (!((OpenGLModel) this).aBool10319)
							method9556();
						bool = true;
					} else
						((OpenGLModel) this).aBool10316 = true;
				}
				if (((OpenGLModel) this).anIntArray10287 != null && !Class140.method2404(((OpenGLModel) this).anInt10277, (((OpenGLModel) this).anInt10294))) {
					if (((OpenGLModel) this).aClass142_10309 == null || (((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615) != null) {
						if (!((OpenGLModel) this).aBool10319)
							method9556();
						bool_359_ = true;
					} else
						((OpenGLModel) this).aBool10316 = true;
				}
				if (((OpenGLModel) this).anIntArray10331 != null && !Class140.method2369(((OpenGLModel) this).anInt10277, (((OpenGLModel) this).anInt10294))) {
					if (((OpenGLModel) this).aClass142_10309 == null || (((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615) != null) {
						if (!((OpenGLModel) this).aBool10319)
							method9556();
						bool_360_ = true;
					} else
						((OpenGLModel) this).aBool10316 = true;
				}
				if (bool)
					((OpenGLModel) this).anIntArray10336 = null;
				if (bool_359_)
					((OpenGLModel) this).anIntArray10287 = null;
				if (bool_360_)
					((OpenGLModel) this).anIntArray10331 = null;
			}
			if (((OpenGLModel) this).aShortArray10330 != null && ((OpenGLModel) this).anIntArray10336 == null && ((OpenGLModel) this).anIntArray10287 == null && ((OpenGLModel) this).anIntArray10331 == null) {
				((OpenGLModel) this).aShortArray10330 = null;
				((OpenGLModel) this).anIntArray10329 = null;
			}
			if (((OpenGLModel) this).aByteArray10295 != null && !Class140.method2405(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if (((OpenGLModel) this).aClass142_10315 != null) {
					if ((((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615) != null) {
						((OpenGLModel) this).aShortArray10288 = null;
						((OpenGLModel) this).aShortArray10293 = null;
						((OpenGLModel) this).aShortArray10292 = null;
						((OpenGLModel) this).aByteArray10295 = null;
					} else
						((OpenGLModel) this).aBool10316 = true;
				} else if (((OpenGLModel) this).aClass142_10270 == null || (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) != null) {
					((OpenGLModel) this).aShortArray10288 = null;
					((OpenGLModel) this).aShortArray10293 = null;
					((OpenGLModel) this).aShortArray10292 = null;
					((OpenGLModel) this).aByteArray10295 = null;
				} else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).aShortArray10281 != null && !Class140.method2371(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if (((OpenGLModel) this).aClass142_10270 == null || (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) != null)
					((OpenGLModel) this).aShortArray10281 = null;
				else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).aByteArray10302 != null && !Class140.method2372(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if (((OpenGLModel) this).aClass142_10270 == null || (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) != null)
					((OpenGLModel) this).aByteArray10302 = null;
				else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).aFloatArray10297 != null && !Class140.method2373(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if (((OpenGLModel) this).aClass142_10312 == null || (((Class142) ((OpenGLModel) this).aClass142_10312).anInterface9_1615) != null) {
					((OpenGLModel) this).aFloatArray10339 = null;
					((OpenGLModel) this).aFloatArray10297 = null;
				} else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).aShortArray10306 != null && !Class140.method2378(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if (((OpenGLModel) this).aClass142_10270 == null || (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) != null)
					((OpenGLModel) this).aShortArray10306 = null;
				else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).aShortArray10303 != null && !Class140.method2377(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				if ((((OpenGLModel) this).aClass139_10301 == null || (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) != null) && (((OpenGLModel) this).aClass142_10270 == null || (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) != null)) {
					((OpenGLModel) this).aShortArray10305 = null;
					((OpenGLModel) this).aShortArray10327 = null;
					((OpenGLModel) this).aShortArray10303 = null;
				} else
					((OpenGLModel) this).aBool10316 = true;
			}
			if (((OpenGLModel) this).anIntArrayArray10307 != null && !Class140.method2425(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				((OpenGLModel) this).anIntArrayArray10307 = null;
				((OpenGLModel) this).aShortArray10286 = null;
			}
			if (((OpenGLModel) this).anIntArrayArray10289 != null && !Class140.method2380(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294)) {
				((OpenGLModel) this).anIntArrayArray10289 = null;
				((OpenGLModel) this).aShortArray10290 = null;
			}
			if (((OpenGLModel) this).anIntArrayArray10323 != null && !Class140.method2375(((OpenGLModel) this).anInt10277, ((OpenGLModel) this).anInt10294))
				((OpenGLModel) this).anIntArrayArray10323 = null;
			if (((OpenGLModel) this).anIntArray10328 != null && (((OpenGLModel) this).anInt10277 & 0x800) == 0 && (((OpenGLModel) this).anInt10277 & 0x40000) == 0)
				((OpenGLModel) this).anIntArray10328 = null;
		}
	}

	public void method1355(int i) {
		int i_361_ = Class325.anIntArray4103[i];
		int i_362_ = Class325.anIntArray4105[i];
		for (int i_363_ = 0; i_363_ < ((OpenGLModel) this).anInt10285; i_363_++) {
			int i_364_ = ((((OpenGLModel) this).anIntArray10331[i_363_] * i_361_ + ((OpenGLModel) this).anIntArray10336[i_363_] * i_362_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_363_] = ((((OpenGLModel) this).anIntArray10331[i_363_] * i_362_ - ((OpenGLModel) this).anIntArray10336[i_363_] * i_361_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_363_] = i_364_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public int method1485() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10321;
	}

	public void method1368(int i) {
		int i_365_ = Class325.anIntArray4103[i];
		int i_366_ = Class325.anIntArray4105[i];
		for (int i_367_ = 0; i_367_ < ((OpenGLModel) this).anInt10285; i_367_++) {
			int i_368_ = ((((OpenGLModel) this).anIntArray10287[i_367_] * i_366_ - ((OpenGLModel) this).anIntArray10331[i_367_] * i_365_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_367_] = ((((OpenGLModel) this).anIntArray10287[i_367_] * i_365_ + ((OpenGLModel) this).anIntArray10331[i_367_] * i_366_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_367_] = i_368_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1500(int i) {
		int i_369_ = Class325.anIntArray4103[i];
		int i_370_ = Class325.anIntArray4105[i];
		for (int i_371_ = 0; i_371_ < ((OpenGLModel) this).anInt10285; i_371_++) {
			int i_372_ = ((((OpenGLModel) this).anIntArray10287[i_371_] * i_369_ + ((OpenGLModel) this).anIntArray10336[i_371_] * i_370_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_371_] = ((((OpenGLModel) this).anIntArray10287[i_371_] * i_370_ - ((OpenGLModel) this).anIntArray10336[i_371_] * i_369_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_371_] = i_372_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public int method1408() {
		return ((OpenGLModel) this).anInt10277;
	}

	public void method1359() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10285; i++)
			((OpenGLModel) this).anIntArray10331[i] = -((OpenGLModel) this).anIntArray10331[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10291; i++)
			((OpenGLModel) this).aShortArray10288[i] = (short) -((OpenGLModel) this).aShortArray10288[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10299; i++) {
			short i_373_ = ((OpenGLModel) this).aShortArray10303[i];
			((OpenGLModel) this).aShortArray10303[i] = ((OpenGLModel) this).aShortArray10305[i];
			((OpenGLModel) this).aShortArray10305[i] = i_373_;
		}
		if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass139_10301 != null)
			((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1464(int i, int i_374_, int i_375_) {
		for (int i_376_ = 0; i_376_ < ((OpenGLModel) this).anInt10285; i_376_++) {
			if (i != 128)
				((OpenGLModel) this).anIntArray10336[i_376_] = ((OpenGLModel) this).anIntArray10336[i_376_] * i >> 7;
			if (i_374_ != 128)
				((OpenGLModel) this).anIntArray10287[i_376_] = (((OpenGLModel) this).anIntArray10287[i_376_] * i_374_ >> 7);
			if (i_375_ != 128)
				((OpenGLModel) this).anIntArray10331[i_376_] = (((OpenGLModel) this).anIntArray10331[i_376_] * i_375_ >> 7);
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1463(int i, int i_377_, Class174 class174, Class174 class174_378_, int i_379_, int i_380_, int i_381_) {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i_382_ = i_379_ + ((OpenGLModel) this).aShort10322;
		int i_383_ = i_379_ + ((OpenGLModel) this).aShort10318;
		int i_384_ = i_381_ + ((OpenGLModel) this).aShort10324;
		int i_385_ = i_381_ + ((OpenGLModel) this).aShort10325;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_382_ >= 0 && ((i_383_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2086 * -1715487093) && i_384_ >= 0 && ((i_385_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2089 * 792439321))) {
			if (i == 4 || i == 5) {
				if (class174_378_ == null || (i_382_ < 0 || ((i_383_ + class174_378_.anInt2087 * 2129890771 >> class174_378_.anInt2088 * 212267571) >= class174_378_.anInt2086 * -1715487093) || i_384_ < 0 || ((i_385_ + class174_378_.anInt2087 * 2129890771 >> class174_378_.anInt2088 * 212267571) >= class174_378_.anInt2089 * 792439321)))
					return;
			} else {
				i_382_ >>= class174.anInt2088 * 212267571;
				i_383_ = (i_383_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				i_384_ >>= class174.anInt2088 * 212267571;
				i_385_ = (i_385_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				if (class174.method2713(i_382_, i_384_, 170540529) == i_380_ && class174.method2713(i_383_, i_384_, 643041050) == i_380_ && (class174.method2713(i_382_, i_385_, -1176360900) == i_380_) && (class174.method2713(i_383_, i_385_, -1052813949) == i_380_))
					return;
			}
			if (i == 1) {
				for (int i_386_ = 0; i_386_ < ((OpenGLModel) this).anInt10285; i_386_++)
					((OpenGLModel) this).anIntArray10287[i_386_] = (((OpenGLModel) this).anIntArray10287[i_386_] + class174.method2718(((((OpenGLModel) this).anIntArray10336[i_386_]) + i_379_), ((((OpenGLModel) this).anIntArray10331[i_386_]) + i_381_), -1882854510) - i_380_);
			} else if (i == 2) {
				int i_387_ = ((OpenGLModel) this).aShort10317;
				if (i_387_ == 0)
					return;
				for (int i_388_ = 0; i_388_ < ((OpenGLModel) this).anInt10285; i_388_++) {
					int i_389_ = (((OpenGLModel) this).anIntArray10287[i_388_] << 16) / i_387_;
					if (i_389_ < i_377_)
						((OpenGLModel) this).anIntArray10287[i_388_] = (((OpenGLModel) this).anIntArray10287[i_388_] + (class174.method2718((((OpenGLModel) this).anIntArray10336[i_388_]) + i_379_, (((OpenGLModel) this).anIntArray10331[i_388_]) + i_381_, -667690037) - i_380_) * (i_377_ - i_389_) / i_377_);
				}
			} else if (i == 3) {
				int i_390_ = (i_377_ & 0xff) * 4;
				int i_391_ = (i_377_ >> 8 & 0xff) * 4;
				int i_392_ = (i_377_ >> 16 & 0xff) << 6;
				int i_393_ = (i_377_ >> 24 & 0xff) << 6;
				if (i_379_ - (i_390_ >> 1) < 0 || ((i_379_ + (i_390_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2086 * -1715487093 << class174.anInt2088 * 212267571)) || i_381_ - (i_391_ >> 1) < 0 || ((i_381_ + (i_391_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2089 * 792439321 << class174.anInt2088 * 212267571)))
					return;
				method1362(class174, i_379_, i_380_, i_381_, i_390_, i_391_, i_392_, i_393_);
			} else if (i == 4) {
				int i_394_ = (((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317);
				for (int i_395_ = 0; i_395_ < ((OpenGLModel) this).anInt10285; i_395_++)
					((OpenGLModel) this).anIntArray10287[i_395_] = (((OpenGLModel) this).anIntArray10287[i_395_] + (class174_378_.method2718((((OpenGLModel) this).anIntArray10336[i_395_]) + i_379_, (((OpenGLModel) this).anIntArray10331[i_395_]) + i_381_, -495975612) - i_380_) + i_394_);
			} else if (i == 5) {
				int i_396_ = (((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317);
				for (int i_397_ = 0; i_397_ < ((OpenGLModel) this).anInt10285; i_397_++) {
					int i_398_ = (((OpenGLModel) this).anIntArray10336[i_397_] + i_379_);
					int i_399_ = (((OpenGLModel) this).anIntArray10331[i_397_] + i_381_);
					int i_400_ = class174.method2718(i_398_, i_399_, -383347744);
					int i_401_ = class174_378_.method2718(i_398_, i_399_, -1048474136);
					int i_402_ = i_400_ - i_401_ - i_377_;
					((OpenGLModel) this).anIntArray10287[i_397_] = ((((OpenGLModel) this).anIntArray10287[i_397_] << 8) / i_396_ * i_402_ >> 8) - (i_380_ - i_400_);
				}
			}
			if (((OpenGLModel) this).aClass142_10309 != null)
				((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
			((OpenGLModel) this).aBool10319 = false;
		}
	}

	public void method1388(int i) {
		((OpenGLModel) this).aShort10304 = (short) i;
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
	}

	public void method1483() {
		if (!((OpenGLModel) this).aBool10326) {
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			((OpenGLModel) this).aShort10278 = ((OpenGLModel) this).aShort10317;
			((OpenGLModel) this).aBool10326 = true;
		}
	}

	public int method1378() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10271;
	}

	public int method1379() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10313;
	}

	public int method1451() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10271;
	}

	public void method1409(int i) {
		((OpenGLModel) this).anInt10277 = i;
		if (((OpenGLModel) this).aClass164_10296 != null && (((OpenGLModel) this).anInt10277 & 0x10000) == 0) {
			((OpenGLModel) this).aShortArray10292 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
			((OpenGLModel) this).aShortArray10293 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
			((OpenGLModel) this).aShortArray10288 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
			((OpenGLModel) this).aByteArray10295 = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			((OpenGLModel) this).aClass164_10296 = null;
		}
		((OpenGLModel) this).aBool10316 = true;
		method9547();
	}

	public int method1461() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10324;
	}

	public int method1356() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10321;
	}

	public int method1384() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10324;
	}

	static final int method9548(int i, int i_403_) {
		i_403_ = i_403_ * (i & 0x7f) >> 7;
		if (i_403_ < 2)
			i_403_ = 2;
		else if (i_403_ > 126)
			i_403_ = 126;
		return (i & 0xff80) + i_403_;
	}

	OpenGLModel(Class106_Sub1 class106_sub1) {
		((OpenGLModel) this).aClass106_Sub1_10340 = class106_sub1;
		((OpenGLModel) this).aClass142_10309 = new Class142(null, 5126, 3, 0);
		((OpenGLModel) this).aClass142_10312 = new Class142(null, 5126, 2, 0);
		((OpenGLModel) this).aClass142_10315 = new Class142(null, 5126, 3, 0);
		((OpenGLModel) this).aClass142_10270 = new Class142(null, 5121, 4, 0);
		((OpenGLModel) this).aClass139_10301 = new Class139();
	}

	public void method1402(Model model, int i, int i_404_, int i_405_, boolean bool) {
		OpenGLModel class89_sub1_406_ = (OpenGLModel) model;
		if (((OpenGLModel) this).anInt10299 != 0 && ((OpenGLModel) class89_sub1_406_).anInt10299 != 0) {
			int i_407_ = ((OpenGLModel) class89_sub1_406_).anInt10285;
			int[] is = ((OpenGLModel) class89_sub1_406_).anIntArray10336;
			int[] is_408_ = ((OpenGLModel) class89_sub1_406_).anIntArray10287;
			int[] is_409_ = ((OpenGLModel) class89_sub1_406_).anIntArray10331;
			short[] is_410_ = ((OpenGLModel) class89_sub1_406_).aShortArray10292;
			short[] is_411_ = ((OpenGLModel) class89_sub1_406_).aShortArray10293;
			short[] is_412_ = ((OpenGLModel) class89_sub1_406_).aShortArray10288;
			byte[] is_413_ = ((OpenGLModel) class89_sub1_406_).aByteArray10295;
			short[] is_414_;
			short[] is_415_;
			short[] is_416_;
			byte[] is_417_;
			if (((OpenGLModel) this).aClass164_10296 != null) {
				is_414_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
				is_415_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
				is_416_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
				is_417_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			} else {
				is_414_ = null;
				is_415_ = null;
				is_416_ = null;
				is_417_ = null;
			}
			short[] is_418_;
			short[] is_419_;
			short[] is_420_;
			byte[] is_421_;
			if (((OpenGLModel) class89_sub1_406_).aClass164_10296 != null) {
				is_418_ = ((Class164) (((OpenGLModel) class89_sub1_406_).aClass164_10296)).aShortArray2036;
				is_419_ = ((Class164) (((OpenGLModel) class89_sub1_406_).aClass164_10296)).aShortArray2033;
				is_420_ = ((Class164) (((OpenGLModel) class89_sub1_406_).aClass164_10296)).aShortArray2035;
				is_421_ = ((Class164) (((OpenGLModel) class89_sub1_406_).aClass164_10296)).aByteArray2034;
			} else {
				is_418_ = null;
				is_419_ = null;
				is_420_ = null;
				is_421_ = null;
			}
			int[] is_422_ = ((OpenGLModel) class89_sub1_406_).anIntArray10329;
			short[] is_423_ = ((OpenGLModel) class89_sub1_406_).aShortArray10330;
			if (!((OpenGLModel) class89_sub1_406_).aBool10319)
				class89_sub1_406_.method9556();
			int i_424_ = ((OpenGLModel) class89_sub1_406_).aShort10317;
			int i_425_ = ((OpenGLModel) class89_sub1_406_).aShort10321;
			int i_426_ = ((OpenGLModel) class89_sub1_406_).aShort10322;
			int i_427_ = ((OpenGLModel) class89_sub1_406_).aShort10318;
			int i_428_ = ((OpenGLModel) class89_sub1_406_).aShort10324;
			int i_429_ = ((OpenGLModel) class89_sub1_406_).aShort10325;
			for (int i_430_ = 0; i_430_ < ((OpenGLModel) this).anInt10285; i_430_++) {
				int i_431_ = ((OpenGLModel) this).anIntArray10287[i_430_] - i_404_;
				if (i_431_ >= i_424_ && i_431_ <= i_425_) {
					int i_432_ = ((OpenGLModel) this).anIntArray10336[i_430_] - i;
					if (i_432_ >= i_426_ && i_432_ <= i_427_) {
						int i_433_ = (((OpenGLModel) this).anIntArray10331[i_430_] - i_405_);
						if (i_433_ >= i_428_ && i_433_ <= i_429_) {
							int i_434_ = -1;
							int i_435_ = (((OpenGLModel) this).anIntArray10329[i_430_]);
							int i_436_ = (((OpenGLModel) this).anIntArray10329[i_430_ + 1]);
							for (int i_437_ = i_435_; (i_437_ < i_436_ && (((OpenGLModel) this).aShortArray10330[i_437_]) != 0); i_437_++) {
								i_434_ = ((((OpenGLModel) this).aShortArray10330[i_437_]) & 0xffff) - 1;
								if ((((OpenGLModel) this).aByteArray10295[i_434_]) != 0)
									break;
							}
							if (i_434_ != -1) {
								for (int i_438_ = 0; i_438_ < i_407_; i_438_++) {
									if (i_432_ == is[i_438_] && i_433_ == is_409_[i_438_] && i_431_ == is_408_[i_438_]) {
										int i_439_ = -1;
										i_435_ = is_422_[i_438_];
										i_436_ = is_422_[i_438_ + 1];
										for (int i_440_ = i_435_; (i_440_ < i_436_ && is_423_[i_440_] != 0); i_440_++) {
											i_439_ = (is_423_[i_440_] & 0xffff) - 1;
											if (is_413_[i_439_] != 0)
												break;
										}
										if (i_439_ != -1) {
											if (is_414_ == null) {
												((OpenGLModel) this).aClass164_10296 = new Class164();
												is_414_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2036 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10292), -1724934247));
												is_415_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2033 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10293), -1694181773));
												is_416_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2035 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10288), -1636746695));
												is_417_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aByteArray2034 = (Class359.method4442((((OpenGLModel) this).aByteArray10295), -2117693535));
											}
											if (is_418_ == null) {
												Class164 class164 = (((OpenGLModel) class89_sub1_406_).aClass164_10296 = new Class164());
												is_418_ = ((Class164) class164).aShortArray2036 = (Class572_Sub3_Sub3.method10283(is_410_, -1170652478));
												is_419_ = ((Class164) class164).aShortArray2033 = (Class572_Sub3_Sub3.method10283(is_411_, -2034455013));
												is_420_ = ((Class164) class164).aShortArray2035 = (Class572_Sub3_Sub3.method10283(is_412_, -1590788317));
												is_421_ = ((Class164) class164).aByteArray2034 = (Class359.method4442(is_413_, -2142721966));
											}
											short i_441_ = (((OpenGLModel) this).aShortArray10292[i_434_]);
											short i_442_ = (((OpenGLModel) this).aShortArray10293[i_434_]);
											short i_443_ = (((OpenGLModel) this).aShortArray10288[i_434_]);
											byte i_444_ = (((OpenGLModel) this).aByteArray10295[i_434_]);
											i_435_ = is_422_[i_438_];
											i_436_ = is_422_[i_438_ + 1];
											for (int i_445_ = i_435_; i_445_ < i_436_; i_445_++) {
												int i_446_ = is_423_[i_445_] - 1;
												if (i_446_ == -1)
													break;
												if (is_421_[i_446_] != 0) {
													is_418_[i_446_] += i_441_;
													is_419_[i_446_] += i_442_;
													is_420_[i_446_] += i_443_;
													is_421_[i_446_] += i_444_;
												}
											}
											i_441_ = is_410_[i_439_];
											i_442_ = is_411_[i_439_];
											i_443_ = is_412_[i_439_];
											i_444_ = is_413_[i_439_];
											i_435_ = (((OpenGLModel) this).anIntArray10329[i_430_]);
											i_436_ = (((OpenGLModel) this).anIntArray10329[i_430_ + 1]);
											for (int i_447_ = i_435_; (i_447_ < i_436_ && (((OpenGLModel) this).aShortArray10330[i_447_]) != 0); i_447_++) {
												int i_448_ = (((((OpenGLModel) this).aShortArray10330[i_447_]) & 0xffff) - 1);
												if (is_417_[i_448_] != 0) {
													is_414_[i_448_] += i_441_;
													is_415_[i_448_] += i_442_;
													is_416_[i_448_] += i_443_;
													is_417_[i_448_] += i_444_;
												}
											}
											if ((((OpenGLModel) this).aClass142_10315) == null && (((OpenGLModel) this).aClass142_10270) != null)
												((Class142) (((OpenGLModel) this).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) this).aClass142_10315) != null)
												((Class142) (((OpenGLModel) this).aClass142_10315)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_406_).aClass142_10315) == null && (((OpenGLModel) class89_sub1_406_).aClass142_10270) != null)
												((Class142) (((OpenGLModel) class89_sub1_406_).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_406_).aClass142_10315) != null)
												((Class142) (((OpenGLModel) class89_sub1_406_).aClass142_10315)).anInterface9_1615 = null;
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
		((OpenGLModel) this).aShort10280 = (short) i;
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public void method1502(int i) {
		((OpenGLModel) this).aShort10304 = (short) i;
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
	}

	public int method1390() {
		return ((OpenGLModel) this).aShort10280;
	}

	public int method1391() {
		return ((OpenGLModel) this).aShort10304;
	}

	public void method1393(short i, short i_449_) {
		for (int i_450_ = 0; i_450_ < ((OpenGLModel) this).anInt10299; i_450_++) {
			if (((OpenGLModel) this).aShortArray10281[i_450_] == i)
				((OpenGLModel) this).aShortArray10281[i_450_] = i_449_;
		}
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			for (int i_451_ = 0; i_451_ < ((OpenGLModel) this).anInt10333; i_451_++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_451_];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_451_];
				((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public void method1467(byte i, byte[] is) {
		if (is == null) {
			for (int i_452_ = 0; i_452_ < ((OpenGLModel) this).anInt10299; i_452_++)
				((OpenGLModel) this).aByteArray10302[i_452_] = i;
		} else {
			for (int i_453_ = 0; i_453_ < ((OpenGLModel) this).anInt10299; i_453_++) {
				int i_454_ = 255 - ((255 - (is[i_453_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((OpenGLModel) this).aByteArray10302[i_453_] = (byte) i_454_;
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public void method1494(short i, short i_455_) {
		MapSize mapSize = ((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396;
		for (int i_456_ = 0; i_456_ < ((OpenGLModel) this).anInt10299; i_456_++) {
			if (((OpenGLModel) this).aShortArray10306[i_456_] == i)
				((OpenGLModel) this).aShortArray10306[i_456_] = i_455_;
		}
		byte i_457_ = 0;
		byte i_458_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, 727735751);
			i_457_ = class101.aByte1366;
			i_458_ = class101.aByte1368;
		}
		byte i_459_ = 0;
		byte i_460_ = 0;
		if (i_455_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_455_ & 0xffff, 1907984653);
			i_459_ = class101.aByte1366;
			i_460_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((OpenGLModel) this).aBool10283 = true;
		}
		if (i_457_ != i_459_ | i_458_ != i_460_) {
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_461_ = 0; i_461_ < ((OpenGLModel) this).anInt10333; i_461_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_461_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_461_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		}
	}

	public void method1396(int i, int i_462_, int i_463_, int i_464_) {
		for (int i_465_ = 0; i_465_ < ((OpenGLModel) this).anInt10299; i_465_++) {
			int i_466_ = ((OpenGLModel) this).aShortArray10281[i_465_] & 0xffff;
			int i_467_ = i_466_ >> 10 & 0x3f;
			int i_468_ = i_466_ >> 7 & 0x7;
			int i_469_ = i_466_ & 0x7f;
			if (i != -1)
				i_467_ += (i - i_467_) * i_464_ >> 7;
			if (i_462_ != -1)
				i_468_ += (i_462_ - i_468_) * i_464_ >> 7;
			if (i_463_ != -1)
				i_469_ += (i_463_ - i_469_) * i_464_ >> 7;
			((OpenGLModel) this).aShortArray10281[i_465_] = (short) (i_467_ << 10 | i_468_ << 7 | i_469_);
		}
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			for (int i_470_ = 0; i_470_ < ((OpenGLModel) this).anInt10333; i_470_++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_470_];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_470_];
				((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public boolean method1397() {
		if (((OpenGLModel) this).aShortArray10306 == null)
			return true;
		for (int i = 0; i < ((OpenGLModel) this).aShortArray10306.length; i++) {
			if (((OpenGLModel) this).aShortArray10306[i] != -1) {
				MaterialInformation class101 = (((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396.getTexture(((OpenGLModel) this).aShortArray10306[i] & 0xffff, 752615515));
				if (class101.textureId * 811137757 != -1 && !((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass168_10036.method2686(class101, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method1400() {
		return ((OpenGLModel) this).aBool10282;
	}

	public int method1480() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10325;
	}

	void method1505() {
		/* empty */
	}

	void method1363() {
		/* empty */
	}

	boolean method1369() {
		if (((OpenGLModel) this).anIntArrayArray10289 == null)
			return false;
		for (int i = 0; i < ((OpenGLModel) this).anInt10284; i++) {
			((OpenGLModel) this).anIntArray10336[i] <<= 4;
			((OpenGLModel) this).anIntArray10287[i] <<= 4;
			((OpenGLModel) this).anIntArray10331[i] <<= 4;
		}
		anInt10342 = 0;
		anInt10310 = 0;
		anInt10344 = 0;
		return true;
	}

	public int method1381() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10318;
	}

	void method1430(int i, int i_471_, int i_472_, int i_473_) {
		if (i == 0) {
			int i_474_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_475_ = 0; i_475_ < ((OpenGLModel) this).anInt10285; i_475_++) {
				anInt10342 += ((OpenGLModel) this).anIntArray10336[i_475_];
				anInt10310 += ((OpenGLModel) this).anIntArray10287[i_475_];
				anInt10344 += ((OpenGLModel) this).anIntArray10331[i_475_];
				i_474_++;
			}
			if (i_474_ > 0) {
				anInt10342 = anInt10342 / i_474_ + i_471_;
				anInt10310 = anInt10310 / i_474_ + i_472_;
				anInt10344 = anInt10344 / i_474_ + i_473_;
			} else {
				anInt10342 = i_471_;
				anInt10310 = i_472_;
				anInt10344 = i_473_;
			}
		} else if (i == 1) {
			for (int i_476_ = 0; i_476_ < ((OpenGLModel) this).anInt10285; i_476_++) {
				((OpenGLModel) this).anIntArray10336[i_476_] += i_471_;
				((OpenGLModel) this).anIntArray10287[i_476_] += i_472_;
				((OpenGLModel) this).anIntArray10331[i_476_] += i_473_;
			}
		} else if (i == 2) {
			for (int i_477_ = 0; i_477_ < ((OpenGLModel) this).anInt10285; i_477_++) {
				((OpenGLModel) this).anIntArray10336[i_477_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_477_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_477_] -= anInt10344;
				if (i_473_ != 0) {
					int i_478_ = Class325.anIntArray4103[i_473_];
					int i_479_ = Class325.anIntArray4105[i_473_];
					int i_480_ = (((((OpenGLModel) this).anIntArray10287[i_477_] * i_478_) + (((OpenGLModel) this).anIntArray10336[i_477_] * i_479_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10287[i_477_] = ((((OpenGLModel) this).anIntArray10287[i_477_] * i_479_) - (((OpenGLModel) this).anIntArray10336[i_477_] * i_478_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_477_] = i_480_;
				}
				if (i_471_ != 0) {
					int i_481_ = Class325.anIntArray4103[i_471_];
					int i_482_ = Class325.anIntArray4105[i_471_];
					int i_483_ = (((((OpenGLModel) this).anIntArray10287[i_477_] * i_482_) - (((OpenGLModel) this).anIntArray10331[i_477_] * i_481_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_477_] = ((((OpenGLModel) this).anIntArray10287[i_477_] * i_481_) + (((OpenGLModel) this).anIntArray10331[i_477_] * i_482_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10287[i_477_] = i_483_;
				}
				if (i_472_ != 0) {
					int i_484_ = Class325.anIntArray4103[i_472_];
					int i_485_ = Class325.anIntArray4105[i_472_];
					int i_486_ = (((((OpenGLModel) this).anIntArray10331[i_477_] * i_484_) + (((OpenGLModel) this).anIntArray10336[i_477_] * i_485_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_477_] = ((((OpenGLModel) this).anIntArray10331[i_477_] * i_485_) - (((OpenGLModel) this).anIntArray10336[i_477_] * i_484_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_477_] = i_486_;
				}
				((OpenGLModel) this).anIntArray10336[i_477_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_477_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_477_] += anInt10344;
			}
		} else if (i == 3) {
			for (int i_487_ = 0; i_487_ < ((OpenGLModel) this).anInt10285; i_487_++) {
				((OpenGLModel) this).anIntArray10336[i_487_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_487_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_487_] -= anInt10344;
				((OpenGLModel) this).anIntArray10336[i_487_] = (((OpenGLModel) this).anIntArray10336[i_487_] * i_471_ / 128);
				((OpenGLModel) this).anIntArray10287[i_487_] = (((OpenGLModel) this).anIntArray10287[i_487_] * i_472_ / 128);
				((OpenGLModel) this).anIntArray10331[i_487_] = (((OpenGLModel) this).anIntArray10331[i_487_] * i_473_ / 128);
				((OpenGLModel) this).anIntArray10336[i_487_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_487_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_487_] += anInt10344;
			}
		} else if (i == 5) {
			for (int i_488_ = 0; i_488_ < ((OpenGLModel) this).anInt10299; i_488_++) {
				int i_489_ = ((((OpenGLModel) this).aByteArray10302[i_488_] & 0xff) + i_471_ * 8);
				if (i_489_ < 0)
					i_489_ = 0;
				else if (i_489_ > 255)
					i_489_ = 255;
				((OpenGLModel) this).aByteArray10302[i_488_] = (byte) i_489_;
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_490_ = 0; i_490_ < ((OpenGLModel) this).anInt10333; i_490_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_490_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_490_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_491_ = 0; i_491_ < ((OpenGLModel) this).anInt10299; i_491_++) {
				int i_492_ = ((OpenGLModel) this).aShortArray10281[i_491_] & 0xffff;
				int i_493_ = i_492_ >> 10 & 0x3f;
				int i_494_ = i_492_ >> 7 & 0x7;
				int i_495_ = i_492_ & 0x7f;
				i_493_ = i_493_ + i_471_ & 0x3f;
				i_494_ += i_472_ / 4;
				if (i_494_ < 0)
					i_494_ = 0;
				else if (i_494_ > 7)
					i_494_ = 7;
				i_495_ += i_473_;
				if (i_495_ < 0)
					i_495_ = 0;
				else if (i_495_ > 127)
					i_495_ = 127;
				((OpenGLModel) this).aShortArray10281[i_491_] = (short) (i_493_ << 10 | i_494_ << 7 | i_495_);
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_496_ = 0; i_496_ < ((OpenGLModel) this).anInt10333; i_496_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_496_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_496_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_497_ = 0; i_497_ < ((OpenGLModel) this).anInt10333; i_497_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_497_];
				((Class150) class150).anInt1698 += i_471_;
				((Class150) class150).anInt1696 += i_472_;
			}
		} else if (i == 10) {
			for (int i_498_ = 0; i_498_ < ((OpenGLModel) this).anInt10333; i_498_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_498_];
				((Class150) class150).anInt1697 = ((Class150) class150).anInt1697 * i_471_ >> 7;
				((Class150) class150).anInt1695 = ((Class150) class150).anInt1695 * i_472_ >> 7;
			}
		} else if (i == 9) {
			for (int i_499_ = 0; i_499_ < ((OpenGLModel) this).anInt10333; i_499_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_499_];
				((Class150) class150).anInt1693 = ((Class150) class150).anInt1693 + i_471_ & 0x3fff;
			}
		}
	}

	void method1370(int i, int[] is, int i_500_, int i_501_, int i_502_, int i_503_, boolean bool) {
		int i_504_ = is.length;
		if (i == 0) {
			i_500_ <<= 4;
			i_501_ <<= 4;
			i_502_ <<= 4;
			int i_505_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_506_ = 0; i_506_ < i_504_; i_506_++) {
				int i_507_ = is[i_506_];
				if (i_507_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_508_ = ((OpenGLModel) this).anIntArrayArray10289[i_507_];
					for (int i_509_ = 0; i_509_ < is_508_.length; i_509_++) {
						int i_510_ = is_508_[i_509_];
						anInt10342 += ((OpenGLModel) this).anIntArray10336[i_510_];
						anInt10310 += ((OpenGLModel) this).anIntArray10287[i_510_];
						anInt10344 += ((OpenGLModel) this).anIntArray10331[i_510_];
						i_505_++;
					}
				}
			}
			if (i_505_ > 0) {
				anInt10342 = anInt10342 / i_505_ + i_500_;
				anInt10310 = anInt10310 / i_505_ + i_501_;
				anInt10344 = anInt10344 / i_505_ + i_502_;
			} else {
				anInt10342 = i_500_;
				anInt10310 = i_501_;
				anInt10344 = i_502_;
			}
		} else if (i == 1) {
			i_500_ <<= 4;
			i_501_ <<= 4;
			i_502_ <<= 4;
			for (int i_511_ = 0; i_511_ < i_504_; i_511_++) {
				int i_512_ = is[i_511_];
				if (i_512_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_513_ = ((OpenGLModel) this).anIntArrayArray10289[i_512_];
					for (int i_514_ = 0; i_514_ < is_513_.length; i_514_++) {
						int i_515_ = is_513_[i_514_];
						((OpenGLModel) this).anIntArray10336[i_515_] += i_500_;
						((OpenGLModel) this).anIntArray10287[i_515_] += i_501_;
						((OpenGLModel) this).anIntArray10331[i_515_] += i_502_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_516_ = 0; i_516_ < i_504_; i_516_++) {
				int i_517_ = is[i_516_];
				if (i_517_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_518_ = ((OpenGLModel) this).anIntArrayArray10289[i_517_];
					if ((i_503_ & 0x1) == 0) {
						for (int i_519_ = 0; i_519_ < is_518_.length; i_519_++) {
							int i_520_ = is_518_[i_519_];
							((OpenGLModel) this).anIntArray10336[i_520_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_520_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_520_] -= anInt10344;
							if (i_502_ != 0) {
								int i_521_ = Class325.anIntArray4103[i_502_];
								int i_522_ = Class325.anIntArray4105[i_502_];
								int i_523_ = (((((OpenGLModel) this).anIntArray10287[i_520_]) * i_521_ + (((OpenGLModel) this).anIntArray10336[i_520_]) * i_522_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_520_] = ((((OpenGLModel) this).anIntArray10287[i_520_]) * i_522_ - (((OpenGLModel) this).anIntArray10336[i_520_]) * i_521_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_520_] = i_523_;
							}
							if (i_500_ != 0) {
								int i_524_ = Class325.anIntArray4103[i_500_];
								int i_525_ = Class325.anIntArray4105[i_500_];
								int i_526_ = (((((OpenGLModel) this).anIntArray10287[i_520_]) * i_525_ - (((OpenGLModel) this).anIntArray10331[i_520_]) * i_524_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_520_] = ((((OpenGLModel) this).anIntArray10287[i_520_]) * i_524_ + (((OpenGLModel) this).anIntArray10331[i_520_]) * i_525_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_520_] = i_526_;
							}
							if (i_501_ != 0) {
								int i_527_ = Class325.anIntArray4103[i_501_];
								int i_528_ = Class325.anIntArray4105[i_501_];
								int i_529_ = (((((OpenGLModel) this).anIntArray10331[i_520_]) * i_527_ + (((OpenGLModel) this).anIntArray10336[i_520_]) * i_528_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_520_] = ((((OpenGLModel) this).anIntArray10331[i_520_]) * i_528_ - (((OpenGLModel) this).anIntArray10336[i_520_]) * i_527_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_520_] = i_529_;
							}
							((OpenGLModel) this).anIntArray10336[i_520_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_520_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_520_] += anInt10344;
						}
					} else {
						for (int i_530_ = 0; i_530_ < is_518_.length; i_530_++) {
							int i_531_ = is_518_[i_530_];
							((OpenGLModel) this).anIntArray10336[i_531_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_531_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_531_] -= anInt10344;
							if (i_500_ != 0) {
								int i_532_ = Class325.anIntArray4103[i_500_];
								int i_533_ = Class325.anIntArray4105[i_500_];
								int i_534_ = (((((OpenGLModel) this).anIntArray10287[i_531_]) * i_533_ - (((OpenGLModel) this).anIntArray10331[i_531_]) * i_532_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_531_] = ((((OpenGLModel) this).anIntArray10287[i_531_]) * i_532_ + (((OpenGLModel) this).anIntArray10331[i_531_]) * i_533_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_531_] = i_534_;
							}
							if (i_502_ != 0) {
								int i_535_ = Class325.anIntArray4103[i_502_];
								int i_536_ = Class325.anIntArray4105[i_502_];
								int i_537_ = (((((OpenGLModel) this).anIntArray10287[i_531_]) * i_535_ + (((OpenGLModel) this).anIntArray10336[i_531_]) * i_536_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_531_] = ((((OpenGLModel) this).anIntArray10287[i_531_]) * i_536_ - (((OpenGLModel) this).anIntArray10336[i_531_]) * i_535_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_531_] = i_537_;
							}
							if (i_501_ != 0) {
								int i_538_ = Class325.anIntArray4103[i_501_];
								int i_539_ = Class325.anIntArray4105[i_501_];
								int i_540_ = (((((OpenGLModel) this).anIntArray10331[i_531_]) * i_538_ + (((OpenGLModel) this).anIntArray10336[i_531_]) * i_539_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_531_] = ((((OpenGLModel) this).anIntArray10331[i_531_]) * i_539_ - (((OpenGLModel) this).anIntArray10336[i_531_]) * i_538_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_531_] = i_540_;
							}
							((OpenGLModel) this).anIntArray10336[i_531_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_531_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_531_] += anInt10344;
						}
					}
				}
			}
			if (bool) {
				for (int i_541_ = 0; i_541_ < i_504_; i_541_++) {
					int i_542_ = is[i_541_];
					if (i_542_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_543_ = (((OpenGLModel) this).anIntArrayArray10289[i_542_]);
						for (int i_544_ = 0; i_544_ < is_543_.length; i_544_++) {
							int i_545_ = is_543_[i_544_];
							int i_546_ = (((OpenGLModel) this).anIntArray10329[i_545_]);
							int i_547_ = (((OpenGLModel) this).anIntArray10329[i_545_ + 1]);
							for (int i_548_ = i_546_; (i_548_ < i_547_ && (((OpenGLModel) this).aShortArray10330[i_548_]) != 0); i_548_++) {
								int i_549_ = (((((OpenGLModel) this).aShortArray10330[i_548_]) & 0xffff) - 1);
								if (i_502_ != 0) {
									int i_550_ = Class325.anIntArray4103[i_502_];
									int i_551_ = Class325.anIntArray4105[i_502_];
									int i_552_ = ((((OpenGLModel) this).aShortArray10293[i_549_]) * i_550_ + ((((OpenGLModel) this).aShortArray10292[i_549_]) * i_551_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10293[i_549_] = (short) (((((OpenGLModel) this).aShortArray10293[i_549_]) * i_551_ - (((OpenGLModel) this).aShortArray10292[i_549_]) * i_550_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_549_] = (short) i_552_;
								}
								if (i_500_ != 0) {
									int i_553_ = Class325.anIntArray4103[i_500_];
									int i_554_ = Class325.anIntArray4105[i_500_];
									int i_555_ = ((((OpenGLModel) this).aShortArray10293[i_549_]) * i_554_ - ((((OpenGLModel) this).aShortArray10288[i_549_]) * i_553_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10288[i_549_] = (short) (((((OpenGLModel) this).aShortArray10293[i_549_]) * i_553_ + (((OpenGLModel) this).aShortArray10288[i_549_]) * i_554_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_549_] = (short) i_555_;
								}
								if (i_501_ != 0) {
									int i_556_ = Class325.anIntArray4103[i_501_];
									int i_557_ = Class325.anIntArray4105[i_501_];
									int i_558_ = ((((OpenGLModel) this).aShortArray10288[i_549_]) * i_556_ + ((((OpenGLModel) this).aShortArray10292[i_549_]) * i_557_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10288[i_549_] = (short) (((((OpenGLModel) this).aShortArray10288[i_549_]) * i_557_ - (((OpenGLModel) this).aShortArray10292[i_549_]) * i_556_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_549_] = (short) i_558_;
								}
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
					((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
				if (((OpenGLModel) this).aClass142_10315 != null)
					((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
			}
		} else if (i == 3) {
			for (int i_559_ = 0; i_559_ < i_504_; i_559_++) {
				int i_560_ = is[i_559_];
				if (i_560_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_561_ = ((OpenGLModel) this).anIntArrayArray10289[i_560_];
					for (int i_562_ = 0; i_562_ < is_561_.length; i_562_++) {
						int i_563_ = is_561_[i_562_];
						((OpenGLModel) this).anIntArray10336[i_563_] -= anInt10342;
						((OpenGLModel) this).anIntArray10287[i_563_] -= anInt10310;
						((OpenGLModel) this).anIntArray10331[i_563_] -= anInt10344;
						((OpenGLModel) this).anIntArray10336[i_563_] = (((OpenGLModel) this).anIntArray10336[i_563_] * i_500_) >> 7;
						((OpenGLModel) this).anIntArray10287[i_563_] = (((OpenGLModel) this).anIntArray10287[i_563_] * i_501_) >> 7;
						((OpenGLModel) this).anIntArray10331[i_563_] = (((OpenGLModel) this).anIntArray10331[i_563_] * i_502_) >> 7;
						((OpenGLModel) this).anIntArray10336[i_563_] += anInt10342;
						((OpenGLModel) this).anIntArray10287[i_563_] += anInt10310;
						((OpenGLModel) this).anIntArray10331[i_563_] += anInt10344;
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_564_ = 0; i_564_ < i_504_; i_564_++) {
					int i_565_ = is[i_564_];
					if (i_565_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_566_ = (((OpenGLModel) this).anIntArrayArray10307[i_565_]);
						for (int i_567_ = 0; i_567_ < is_566_.length; i_567_++) {
							int i_568_ = is_566_[i_567_];
							int i_569_ = (((((OpenGLModel) this).aByteArray10302[i_568_]) & 0xff) + i_500_ * 8);
							if (i_569_ < 0)
								i_569_ = 0;
							else if (i_569_ > 255)
								i_569_ = 255;
							((OpenGLModel) this).aByteArray10302[i_568_] = (byte) i_569_;
						}
						if (is_566_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_570_ = 0; i_570_ < ((OpenGLModel) this).anInt10333; i_570_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_570_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_570_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_571_ = 0; i_571_ < i_504_; i_571_++) {
					int i_572_ = is[i_571_];
					if (i_572_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_573_ = (((OpenGLModel) this).anIntArrayArray10307[i_572_]);
						for (int i_574_ = 0; i_574_ < is_573_.length; i_574_++) {
							int i_575_ = is_573_[i_574_];
							int i_576_ = ((((OpenGLModel) this).aShortArray10281[i_575_]) & 0xffff);
							int i_577_ = i_576_ >> 10 & 0x3f;
							int i_578_ = i_576_ >> 7 & 0x7;
							int i_579_ = i_576_ & 0x7f;
							i_577_ = i_577_ + i_500_ & 0x3f;
							i_578_ += i_501_ / 4;
							if (i_578_ < 0)
								i_578_ = 0;
							else if (i_578_ > 7)
								i_578_ = 7;
							i_579_ += i_502_;
							if (i_579_ < 0)
								i_579_ = 0;
							else if (i_579_ > 127)
								i_579_ = 127;
							((OpenGLModel) this).aShortArray10281[i_575_] = (short) (i_577_ << 10 | i_578_ << 7 | i_579_);
						}
						if (is_573_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_580_ = 0; i_580_ < ((OpenGLModel) this).anInt10333; i_580_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_580_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_580_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_581_ = 0; i_581_ < i_504_; i_581_++) {
					int i_582_ = is[i_581_];
					if (i_582_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_583_ = (((OpenGLModel) this).anIntArrayArray10323[i_582_]);
						for (int i_584_ = 0; i_584_ < is_583_.length; i_584_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_583_[i_584_]]);
							((Class150) class150).anInt1698 += i_500_;
							((Class150) class150).anInt1696 += i_501_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_585_ = 0; i_585_ < i_504_; i_585_++) {
					int i_586_ = is[i_585_];
					if (i_586_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_587_ = (((OpenGLModel) this).anIntArrayArray10323[i_586_]);
						for (int i_588_ = 0; i_588_ < is_587_.length; i_588_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_587_[i_588_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_500_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_501_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_589_ = 0; i_589_ < i_504_; i_589_++) {
					int i_590_ = is[i_589_];
					if (i_590_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_591_ = (((OpenGLModel) this).anIntArrayArray10323[i_590_]);
						for (int i_592_ = 0; i_592_ < is_591_.length; i_592_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_591_[i_592_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_500_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public boolean method1376(int i, int i_593_, Class261 class261, boolean bool, int i_594_) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10183);
		boolean bool_595_ = false;
		int i_596_ = 2147483647;
		int i_597_ = -2147483648;
		int i_598_ = 2147483647;
		int i_599_ = -2147483648;
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i_600_ = ((((OpenGLModel) this).aShort10318 - ((OpenGLModel) this).aShort10322) >> 1);
		int i_601_ = ((((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317) >> 1);
		int i_602_ = ((((OpenGLModel) this).aShort10325 - ((OpenGLModel) this).aShort10324) >> 1);
		int i_603_ = ((OpenGLModel) this).aShort10322 + i_600_;
		int i_604_ = ((OpenGLModel) this).aShort10317 + i_601_;
		int i_605_ = ((OpenGLModel) this).aShort10324 + i_602_;
		int i_606_ = i_603_ - (i_600_ << i_594_);
		int i_607_ = i_604_ - (i_601_ << i_594_);
		int i_608_ = i_605_ - (i_602_ << i_594_);
		int i_609_ = i_603_ + (i_600_ << i_594_);
		int i_610_ = i_604_ + (i_601_ << i_594_);
		int i_611_ = i_605_ + (i_602_ << i_594_);
		anIntArray10320[0] = i_606_;
		anIntArray10298[0] = i_607_;
		anIntArray10341[0] = i_608_;
		anIntArray10320[1] = i_609_;
		anIntArray10298[1] = i_607_;
		anIntArray10341[1] = i_608_;
		anIntArray10320[2] = i_606_;
		anIntArray10298[2] = i_610_;
		anIntArray10341[2] = i_608_;
		anIntArray10320[3] = i_609_;
		anIntArray10298[3] = i_610_;
		anIntArray10341[3] = i_608_;
		anIntArray10320[4] = i_606_;
		anIntArray10298[4] = i_607_;
		anIntArray10341[4] = i_611_;
		anIntArray10320[5] = i_609_;
		anIntArray10298[5] = i_607_;
		anIntArray10341[5] = i_611_;
		anIntArray10320[6] = i_606_;
		anIntArray10298[6] = i_610_;
		anIntArray10341[6] = i_611_;
		anIntArray10320[7] = i_609_;
		anIntArray10298[7] = i_610_;
		anIntArray10341[7] = i_611_;
		for (int i_612_ = 0; i_612_ < 8; i_612_++) {
			int i_613_ = anIntArray10320[i_612_];
			int i_614_ = anIntArray10298[i_612_];
			int i_615_ = anIntArray10341[i_612_];
			float f = (class250.aFloatArray2728[2] * (float) i_613_ + class250.aFloatArray2728[6] * (float) i_614_ + class250.aFloatArray2728[10] * (float) i_615_ + class250.aFloatArray2728[14]);
			float f_616_ = (class250.aFloatArray2728[3] * (float) i_613_ + class250.aFloatArray2728[7] * (float) i_614_ + class250.aFloatArray2728[11] * (float) i_615_ + class250.aFloatArray2728[15]);
			if (f >= -f_616_) {
				float f_617_ = (class250.aFloatArray2728[0] * (float) i_613_ + class250.aFloatArray2728[4] * (float) i_614_ + class250.aFloatArray2728[8] * (float) i_615_ + class250.aFloatArray2728[12]);
				float f_618_ = (class250.aFloatArray2728[1] * (float) i_613_ + class250.aFloatArray2728[5] * (float) i_614_ + class250.aFloatArray2728[9] * (float) i_615_ + class250.aFloatArray2728[13]);
				int i_619_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10085) * f_617_ / f_616_);
				int i_620_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10121) * f_618_ / f_616_);
				if (i_619_ < i_596_)
					i_596_ = i_619_;
				if (i_619_ > i_597_)
					i_597_ = i_619_;
				if (i_620_ < i_598_)
					i_598_ = i_620_;
				if (i_620_ > i_599_)
					i_599_ = i_620_;
				bool_595_ = true;
			}
		}
		if (bool_595_ && i > i_596_ && i < i_597_ && i_593_ > i_598_ && i_593_ < i_599_) {
			if (bool)
				return true;
			if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157).length < ((OpenGLModel) this).anInt10291) {
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157 = new int[((OpenGLModel) this).anInt10291];
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191 = new int[((OpenGLModel) this).anInt10291];
			}
			int[] is = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157);
			int[] is_621_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191);
			for (int i_622_ = 0; i_622_ < ((OpenGLModel) this).anInt10285; i_622_++) {
				int i_623_ = ((OpenGLModel) this).anIntArray10336[i_622_];
				int i_624_ = ((OpenGLModel) this).anIntArray10287[i_622_];
				int i_625_ = ((OpenGLModel) this).anIntArray10331[i_622_];
				float f = (class250.aFloatArray2728[2] * (float) i_623_ + class250.aFloatArray2728[6] * (float) i_624_ + class250.aFloatArray2728[10] * (float) i_625_ + class250.aFloatArray2728[14]);
				float f_626_ = (class250.aFloatArray2728[3] * (float) i_623_ + class250.aFloatArray2728[7] * (float) i_624_ + class250.aFloatArray2728[11] * (float) i_625_ + class250.aFloatArray2728[15]);
				if (f >= -f_626_) {
					float f_627_ = (class250.aFloatArray2728[0] * (float) i_623_ + class250.aFloatArray2728[4] * (float) i_624_ + class250.aFloatArray2728[8] * (float) i_625_ + class250.aFloatArray2728[12]);
					float f_628_ = (class250.aFloatArray2728[1] * (float) i_623_ + class250.aFloatArray2728[5] * (float) i_624_ + class250.aFloatArray2728[9] * (float) i_625_ + class250.aFloatArray2728[13]);
					int i_629_ = ((OpenGLModel) this).anIntArray10329[i_622_];
					int i_630_ = ((OpenGLModel) this).anIntArray10329[i_622_ + 1];
					for (int i_631_ = i_629_; (i_631_ < i_630_ && (((OpenGLModel) this).aShortArray10330[i_631_] != 0)); i_631_++) {
						int i_632_ = ((((OpenGLModel) this).aShortArray10330[i_631_] & 0xffff) - 1);
						is[i_632_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_627_ / f_626_));
						is_621_[i_632_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_628_ / f_626_));
					}
				} else {
					int i_633_ = ((OpenGLModel) this).anIntArray10329[i_622_];
					int i_634_ = ((OpenGLModel) this).anIntArray10329[i_622_ + 1];
					for (int i_635_ = i_633_; (i_635_ < i_634_ && (((OpenGLModel) this).aShortArray10330[i_635_] != 0)); i_635_++) {
						int i_636_ = ((((OpenGLModel) this).aShortArray10330[i_635_] & 0xffff) - 1);
						is[i_636_] = -999999;
					}
				}
			}
			for (int i_637_ = 0; i_637_ < ((OpenGLModel) this).anInt10299; i_637_++) {
				if (is[(((OpenGLModel) this).aShortArray10303[i_637_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10327[i_637_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10305[i_637_] & 0xffff)] != -999999 && method9549(i, i_593_, is_621_[((((OpenGLModel) this).aShortArray10303[i_637_]) & 0xffff)], is_621_[((((OpenGLModel) this).aShortArray10327[i_637_]) & 0xffff)], is_621_[((((OpenGLModel) this).aShortArray10305[i_637_]) & 0xffff)], is[(((OpenGLModel) this).aShortArray10303[i_637_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10327[i_637_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10305[i_637_]) & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public void method1474(byte i, byte[] is) {
		if (is == null) {
			for (int i_638_ = 0; i_638_ < ((OpenGLModel) this).anInt10299; i_638_++)
				((OpenGLModel) this).aByteArray10302[i_638_] = i;
		} else {
			for (int i_639_ = 0; i_639_ < ((OpenGLModel) this).anInt10299; i_639_++) {
				int i_640_ = 255 - ((255 - (is[i_639_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((OpenGLModel) this).aByteArray10302[i_639_] = (byte) i_640_;
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	void method1434(int i, int[] is, int i_641_, int i_642_, int i_643_, boolean bool, int i_644_, int[] is_645_) {
		int i_646_ = is.length;
		if (i == 0) {
			i_641_ <<= 4;
			i_642_ <<= 4;
			i_643_ <<= 4;
			int i_647_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_648_ = 0; i_648_ < i_646_; i_648_++) {
				int i_649_ = is[i_648_];
				if (i_649_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_650_ = ((OpenGLModel) this).anIntArrayArray10289[i_649_];
					for (int i_651_ = 0; i_651_ < is_650_.length; i_651_++) {
						int i_652_ = is_650_[i_651_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_644_ & (((OpenGLModel) this).aShortArray10290[i_652_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_652_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_652_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_652_]);
							i_647_++;
						}
					}
				}
			}
			if (i_647_ > 0) {
				anInt10342 = anInt10342 / i_647_ + i_641_;
				anInt10310 = anInt10310 / i_647_ + i_642_;
				anInt10344 = anInt10344 / i_647_ + i_643_;
				aBool10345 = true;
			} else {
				anInt10342 = i_641_;
				anInt10310 = i_642_;
				anInt10344 = i_643_;
			}
		} else if (i == 1) {
			if (is_645_ != null) {
				int i_653_ = ((is_645_[0] * i_641_ + is_645_[1] * i_642_ + is_645_[2] * i_643_ + 8192) >> 14);
				int i_654_ = ((is_645_[3] * i_641_ + is_645_[4] * i_642_ + is_645_[5] * i_643_ + 8192) >> 14);
				int i_655_ = ((is_645_[6] * i_641_ + is_645_[7] * i_642_ + is_645_[8] * i_643_ + 8192) >> 14);
				i_641_ = i_653_;
				i_642_ = i_654_;
				i_643_ = i_655_;
			}
			i_641_ <<= 4;
			i_642_ <<= 4;
			i_643_ <<= 4;
			for (int i_656_ = 0; i_656_ < i_646_; i_656_++) {
				int i_657_ = is[i_656_];
				if (i_657_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_658_ = ((OpenGLModel) this).anIntArrayArray10289[i_657_];
					for (int i_659_ = 0; i_659_ < is_658_.length; i_659_++) {
						int i_660_ = is_658_[i_659_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_644_ & (((OpenGLModel) this).aShortArray10290[i_660_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_660_] += i_641_;
							((OpenGLModel) this).anIntArray10287[i_660_] += i_642_;
							((OpenGLModel) this).anIntArray10331[i_660_] += i_643_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_645_ != null) {
				int i_661_ = is_645_[9] << 4;
				int i_662_ = is_645_[10] << 4;
				int i_663_ = is_645_[11] << 4;
				int i_664_ = is_645_[12] << 4;
				int i_665_ = is_645_[13] << 4;
				int i_666_ = is_645_[14] << 4;
				if (aBool10345) {
					int i_667_ = ((is_645_[0] * anInt10342 + is_645_[3] * anInt10310 + is_645_[6] * anInt10344 + 8192) >> 14);
					int i_668_ = ((is_645_[1] * anInt10342 + is_645_[4] * anInt10310 + is_645_[7] * anInt10344 + 8192) >> 14);
					int i_669_ = ((is_645_[2] * anInt10342 + is_645_[5] * anInt10310 + is_645_[8] * anInt10344 + 8192) >> 14);
					i_667_ += i_664_;
					i_668_ += i_665_;
					i_669_ += i_666_;
					anInt10342 = i_667_;
					anInt10310 = i_668_;
					anInt10344 = i_669_;
					aBool10345 = false;
				}
				int[] is_670_ = new int[9];
				int i_671_ = Class325.anIntArray4105[i_641_];
				int i_672_ = Class325.anIntArray4103[i_641_];
				int i_673_ = Class325.anIntArray4105[i_642_];
				int i_674_ = Class325.anIntArray4103[i_642_];
				int i_675_ = Class325.anIntArray4105[i_643_];
				int i_676_ = Class325.anIntArray4103[i_643_];
				int i_677_ = i_672_ * i_675_ + 8192 >> 14;
				int i_678_ = i_672_ * i_676_ + 8192 >> 14;
				is_670_[0] = i_673_ * i_675_ + i_674_ * i_678_ + 8192 >> 14;
				is_670_[1] = -i_673_ * i_676_ + i_674_ * i_677_ + 8192 >> 14;
				is_670_[2] = i_674_ * i_671_ + 8192 >> 14;
				is_670_[3] = i_671_ * i_676_ + 8192 >> 14;
				is_670_[4] = i_671_ * i_675_ + 8192 >> 14;
				is_670_[5] = -i_672_;
				is_670_[6] = -i_674_ * i_675_ + i_673_ * i_678_ + 8192 >> 14;
				is_670_[7] = i_674_ * i_676_ + i_673_ * i_677_ + 8192 >> 14;
				is_670_[8] = i_673_ * i_671_ + 8192 >> 14;
				int i_679_ = ((is_670_[0] * -anInt10342 + is_670_[1] * -anInt10310 + is_670_[2] * -anInt10344 + 8192) >> 14);
				int i_680_ = ((is_670_[3] * -anInt10342 + is_670_[4] * -anInt10310 + is_670_[5] * -anInt10344 + 8192) >> 14);
				int i_681_ = ((is_670_[6] * -anInt10342 + is_670_[7] * -anInt10310 + is_670_[8] * -anInt10344 + 8192) >> 14);
				int i_682_ = i_679_ + anInt10342;
				int i_683_ = i_680_ + anInt10310;
				int i_684_ = i_681_ + anInt10344;
				int[] is_685_ = new int[9];
				for (int i_686_ = 0; i_686_ < 3; i_686_++) {
					for (int i_687_ = 0; i_687_ < 3; i_687_++) {
						int i_688_ = 0;
						for (int i_689_ = 0; i_689_ < 3; i_689_++)
							i_688_ += (is_670_[i_686_ * 3 + i_689_] * is_645_[i_687_ * 3 + i_689_]);
						is_685_[i_686_ * 3 + i_687_] = i_688_ + 8192 >> 14;
					}
				}
				int i_690_ = ((is_670_[0] * i_664_ + is_670_[1] * i_665_ + is_670_[2] * i_666_ + 8192) >> 14);
				int i_691_ = ((is_670_[3] * i_664_ + is_670_[4] * i_665_ + is_670_[5] * i_666_ + 8192) >> 14);
				int i_692_ = ((is_670_[6] * i_664_ + is_670_[7] * i_665_ + is_670_[8] * i_666_ + 8192) >> 14);
				i_690_ += i_682_;
				i_691_ += i_683_;
				i_692_ += i_684_;
				int[] is_693_ = new int[9];
				for (int i_694_ = 0; i_694_ < 3; i_694_++) {
					for (int i_695_ = 0; i_695_ < 3; i_695_++) {
						int i_696_ = 0;
						for (int i_697_ = 0; i_697_ < 3; i_697_++)
							i_696_ += (is_645_[i_694_ * 3 + i_697_] * is_685_[i_695_ + i_697_ * 3]);
						is_693_[i_694_ * 3 + i_695_] = i_696_ + 8192 >> 14;
					}
				}
				int i_698_ = ((is_645_[0] * i_690_ + is_645_[1] * i_691_ + is_645_[2] * i_692_ + 8192) >> 14);
				int i_699_ = ((is_645_[3] * i_690_ + is_645_[4] * i_691_ + is_645_[5] * i_692_ + 8192) >> 14);
				int i_700_ = ((is_645_[6] * i_690_ + is_645_[7] * i_691_ + is_645_[8] * i_692_ + 8192) >> 14);
				i_698_ += i_661_;
				i_699_ += i_662_;
				i_700_ += i_663_;
				for (int i_701_ = 0; i_701_ < i_646_; i_701_++) {
					int i_702_ = is[i_701_];
					if (i_702_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_703_ = (((OpenGLModel) this).anIntArrayArray10289[i_702_]);
						for (int i_704_ = 0; i_704_ < is_703_.length; i_704_++) {
							int i_705_ = is_703_[i_704_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10290[i_705_])) != 0)) {
								int i_706_ = ((is_693_[0] * (((OpenGLModel) this).anIntArray10336[i_705_]) + is_693_[1] * (((OpenGLModel) this).anIntArray10287[i_705_]) + is_693_[2] * (((OpenGLModel) this).anIntArray10331[i_705_]) + 8192) >> 14);
								int i_707_ = ((is_693_[3] * (((OpenGLModel) this).anIntArray10336[i_705_]) + is_693_[4] * (((OpenGLModel) this).anIntArray10287[i_705_]) + is_693_[5] * (((OpenGLModel) this).anIntArray10331[i_705_]) + 8192) >> 14);
								int i_708_ = ((is_693_[6] * (((OpenGLModel) this).anIntArray10336[i_705_]) + is_693_[7] * (((OpenGLModel) this).anIntArray10287[i_705_]) + is_693_[8] * (((OpenGLModel) this).anIntArray10331[i_705_]) + 8192) >> 14);
								i_706_ += i_698_;
								i_707_ += i_699_;
								i_708_ += i_700_;
								((OpenGLModel) this).anIntArray10336[i_705_] = i_706_;
								((OpenGLModel) this).anIntArray10287[i_705_] = i_707_;
								((OpenGLModel) this).anIntArray10331[i_705_] = i_708_;
							}
						}
					}
				}
			} else {
				for (int i_709_ = 0; i_709_ < i_646_; i_709_++) {
					int i_710_ = is[i_709_];
					if (i_710_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_711_ = (((OpenGLModel) this).anIntArrayArray10289[i_710_]);
						for (int i_712_ = 0; i_712_ < is_711_.length; i_712_++) {
							int i_713_ = is_711_[i_712_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10290[i_713_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_713_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_713_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_713_] -= anInt10344;
								if (i_643_ != 0) {
									int i_714_ = Class325.anIntArray4103[i_643_];
									int i_715_ = Class325.anIntArray4105[i_643_];
									int i_716_ = (((((OpenGLModel) this).anIntArray10287[i_713_]) * i_714_ + ((((OpenGLModel) this).anIntArray10336[i_713_]) * i_715_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_713_] = ((((OpenGLModel) this).anIntArray10287[i_713_]) * i_715_ - ((((OpenGLModel) this).anIntArray10336[i_713_]) * i_714_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_713_] = i_716_;
								}
								if (i_641_ != 0) {
									int i_717_ = Class325.anIntArray4103[i_641_];
									int i_718_ = Class325.anIntArray4105[i_641_];
									int i_719_ = (((((OpenGLModel) this).anIntArray10287[i_713_]) * i_718_ - ((((OpenGLModel) this).anIntArray10331[i_713_]) * i_717_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_713_] = ((((OpenGLModel) this).anIntArray10287[i_713_]) * i_717_ + ((((OpenGLModel) this).anIntArray10331[i_713_]) * i_718_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_713_] = i_719_;
								}
								if (i_642_ != 0) {
									int i_720_ = Class325.anIntArray4103[i_642_];
									int i_721_ = Class325.anIntArray4105[i_642_];
									int i_722_ = (((((OpenGLModel) this).anIntArray10331[i_713_]) * i_720_ + ((((OpenGLModel) this).anIntArray10336[i_713_]) * i_721_) + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_713_] = ((((OpenGLModel) this).anIntArray10331[i_713_]) * i_721_ - ((((OpenGLModel) this).anIntArray10336[i_713_]) * i_720_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_713_] = i_722_;
								}
								((OpenGLModel) this).anIntArray10336[i_713_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_713_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_713_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_723_ = 0; i_723_ < i_646_; i_723_++) {
						int i_724_ = is[i_723_];
						if (i_724_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_725_ = (((OpenGLModel) this).anIntArrayArray10289[i_724_]);
							for (int i_726_ = 0; i_726_ < is_725_.length; i_726_++) {
								int i_727_ = is_725_[i_726_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || ((i_644_ & (((OpenGLModel) this).aShortArray10290[i_727_])) != 0)) {
									int i_728_ = (((OpenGLModel) this).anIntArray10329[i_727_]);
									int i_729_ = (((OpenGLModel) this).anIntArray10329[i_727_ + 1]);
									for (int i_730_ = i_728_; (i_730_ < i_729_ && (((OpenGLModel) this).aShortArray10330[i_730_]) != 0); i_730_++) {
										int i_731_ = (((((OpenGLModel) this).aShortArray10330[i_730_]) & 0xffff) - 1);
										if (i_643_ != 0) {
											int i_732_ = (Class325.anIntArray4103[i_643_]);
											int i_733_ = (Class325.anIntArray4105[i_643_]);
											int i_734_ = (((((OpenGLModel) this).aShortArray10293[i_731_]) * i_732_ + (((OpenGLModel) this).aShortArray10292[i_731_]) * i_733_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_731_] = (short) (((((OpenGLModel) this).aShortArray10293[i_731_]) * i_733_ - ((((OpenGLModel) this).aShortArray10292[i_731_]) * i_732_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_731_] = (short) i_734_;
										}
										if (i_641_ != 0) {
											int i_735_ = (Class325.anIntArray4103[i_641_]);
											int i_736_ = (Class325.anIntArray4105[i_641_]);
											int i_737_ = (((((OpenGLModel) this).aShortArray10293[i_731_]) * i_736_ - (((OpenGLModel) this).aShortArray10288[i_731_]) * i_735_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_731_] = (short) (((((OpenGLModel) this).aShortArray10293[i_731_]) * i_735_ + ((((OpenGLModel) this).aShortArray10288[i_731_]) * i_736_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_731_] = (short) i_737_;
										}
										if (i_642_ != 0) {
											int i_738_ = (Class325.anIntArray4103[i_642_]);
											int i_739_ = (Class325.anIntArray4105[i_642_]);
											int i_740_ = (((((OpenGLModel) this).aShortArray10288[i_731_]) * i_738_ + (((OpenGLModel) this).aShortArray10292[i_731_]) * i_739_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_731_] = (short) (((((OpenGLModel) this).aShortArray10288[i_731_]) * i_739_ - ((((OpenGLModel) this).aShortArray10292[i_731_]) * i_738_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_731_] = (short) i_740_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_645_ != null) {
				int i_741_ = is_645_[9] << 4;
				int i_742_ = is_645_[10] << 4;
				int i_743_ = is_645_[11] << 4;
				int i_744_ = is_645_[12] << 4;
				int i_745_ = is_645_[13] << 4;
				int i_746_ = is_645_[14] << 4;
				if (aBool10345) {
					int i_747_ = ((is_645_[0] * anInt10342 + is_645_[3] * anInt10310 + is_645_[6] * anInt10344 + 8192) >> 14);
					int i_748_ = ((is_645_[1] * anInt10342 + is_645_[4] * anInt10310 + is_645_[7] * anInt10344 + 8192) >> 14);
					int i_749_ = ((is_645_[2] * anInt10342 + is_645_[5] * anInt10310 + is_645_[8] * anInt10344 + 8192) >> 14);
					i_747_ += i_744_;
					i_748_ += i_745_;
					i_749_ += i_746_;
					anInt10342 = i_747_;
					anInt10310 = i_748_;
					anInt10344 = i_749_;
					aBool10345 = false;
				}
				int i_750_ = i_641_ << 15 >> 7;
				int i_751_ = i_642_ << 15 >> 7;
				int i_752_ = i_643_ << 15 >> 7;
				int i_753_ = i_750_ * -anInt10342 + 8192 >> 14;
				int i_754_ = i_751_ * -anInt10310 + 8192 >> 14;
				int i_755_ = i_752_ * -anInt10344 + 8192 >> 14;
				int i_756_ = i_753_ + anInt10342;
				int i_757_ = i_754_ + anInt10310;
				int i_758_ = i_755_ + anInt10344;
				int[] is_759_ = new int[9];
				is_759_[0] = i_750_ * is_645_[0] + 8192 >> 14;
				is_759_[1] = i_750_ * is_645_[3] + 8192 >> 14;
				is_759_[2] = i_750_ * is_645_[6] + 8192 >> 14;
				is_759_[3] = i_751_ * is_645_[1] + 8192 >> 14;
				is_759_[4] = i_751_ * is_645_[4] + 8192 >> 14;
				is_759_[5] = i_751_ * is_645_[7] + 8192 >> 14;
				is_759_[6] = i_752_ * is_645_[2] + 8192 >> 14;
				is_759_[7] = i_752_ * is_645_[5] + 8192 >> 14;
				is_759_[8] = i_752_ * is_645_[8] + 8192 >> 14;
				int i_760_ = i_750_ * i_744_ + 8192 >> 14;
				int i_761_ = i_751_ * i_745_ + 8192 >> 14;
				int i_762_ = i_752_ * i_746_ + 8192 >> 14;
				i_760_ += i_756_;
				i_761_ += i_757_;
				i_762_ += i_758_;
				int[] is_763_ = new int[9];
				for (int i_764_ = 0; i_764_ < 3; i_764_++) {
					for (int i_765_ = 0; i_765_ < 3; i_765_++) {
						int i_766_ = 0;
						for (int i_767_ = 0; i_767_ < 3; i_767_++)
							i_766_ += (is_645_[i_764_ * 3 + i_767_] * is_759_[i_765_ + i_767_ * 3]);
						is_763_[i_764_ * 3 + i_765_] = i_766_ + 8192 >> 14;
					}
				}
				int i_768_ = ((is_645_[0] * i_760_ + is_645_[1] * i_761_ + is_645_[2] * i_762_ + 8192) >> 14);
				int i_769_ = ((is_645_[3] * i_760_ + is_645_[4] * i_761_ + is_645_[5] * i_762_ + 8192) >> 14);
				int i_770_ = ((is_645_[6] * i_760_ + is_645_[7] * i_761_ + is_645_[8] * i_762_ + 8192) >> 14);
				i_768_ += i_741_;
				i_769_ += i_742_;
				i_770_ += i_743_;
				for (int i_771_ = 0; i_771_ < i_646_; i_771_++) {
					int i_772_ = is[i_771_];
					if (i_772_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_773_ = (((OpenGLModel) this).anIntArrayArray10289[i_772_]);
						for (int i_774_ = 0; i_774_ < is_773_.length; i_774_++) {
							int i_775_ = is_773_[i_774_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10290[i_775_])) != 0)) {
								int i_776_ = ((is_763_[0] * (((OpenGLModel) this).anIntArray10336[i_775_]) + is_763_[1] * (((OpenGLModel) this).anIntArray10287[i_775_]) + is_763_[2] * (((OpenGLModel) this).anIntArray10331[i_775_]) + 8192) >> 14);
								int i_777_ = ((is_763_[3] * (((OpenGLModel) this).anIntArray10336[i_775_]) + is_763_[4] * (((OpenGLModel) this).anIntArray10287[i_775_]) + is_763_[5] * (((OpenGLModel) this).anIntArray10331[i_775_]) + 8192) >> 14);
								int i_778_ = ((is_763_[6] * (((OpenGLModel) this).anIntArray10336[i_775_]) + is_763_[7] * (((OpenGLModel) this).anIntArray10287[i_775_]) + is_763_[8] * (((OpenGLModel) this).anIntArray10331[i_775_]) + 8192) >> 14);
								i_776_ += i_768_;
								i_777_ += i_769_;
								i_778_ += i_770_;
								((OpenGLModel) this).anIntArray10336[i_775_] = i_776_;
								((OpenGLModel) this).anIntArray10287[i_775_] = i_777_;
								((OpenGLModel) this).anIntArray10331[i_775_] = i_778_;
							}
						}
					}
				}
			} else {
				for (int i_779_ = 0; i_779_ < i_646_; i_779_++) {
					int i_780_ = is[i_779_];
					if (i_780_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_781_ = (((OpenGLModel) this).anIntArrayArray10289[i_780_]);
						for (int i_782_ = 0; i_782_ < is_781_.length; i_782_++) {
							int i_783_ = is_781_[i_782_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10290[i_783_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_783_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_783_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_783_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_783_] = (((OpenGLModel) this).anIntArray10336[i_783_]) * i_641_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_783_] = (((OpenGLModel) this).anIntArray10287[i_783_]) * i_642_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_783_] = (((OpenGLModel) this).anIntArray10331[i_783_]) * i_643_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_783_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_783_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_783_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_784_ = 0; i_784_ < i_646_; i_784_++) {
					int i_785_ = is[i_784_];
					if (i_785_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_786_ = (((OpenGLModel) this).anIntArrayArray10307[i_785_]);
						for (int i_787_ = 0; i_787_ < is_786_.length; i_787_++) {
							int i_788_ = is_786_[i_787_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10286[i_788_])) != 0)) {
								int i_789_ = (((((OpenGLModel) this).aByteArray10302[i_788_]) & 0xff) + i_641_ * 8);
								if (i_789_ < 0)
									i_789_ = 0;
								else if (i_789_ > 255)
									i_789_ = 255;
								((OpenGLModel) this).aByteArray10302[i_788_] = (byte) i_789_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_790_ = 0; i_790_ < ((OpenGLModel) this).anInt10333; i_790_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_790_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_790_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_791_ = 0; i_791_ < i_646_; i_791_++) {
					int i_792_ = is[i_791_];
					if (i_792_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_793_ = (((OpenGLModel) this).anIntArrayArray10307[i_792_]);
						for (int i_794_ = 0; i_794_ < is_793_.length; i_794_++) {
							int i_795_ = is_793_[i_794_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_644_ & (((OpenGLModel) this).aShortArray10286[i_795_])) != 0)) {
								int i_796_ = ((((OpenGLModel) this).aShortArray10281[i_795_]) & 0xffff);
								int i_797_ = i_796_ >> 10 & 0x3f;
								int i_798_ = i_796_ >> 7 & 0x7;
								int i_799_ = i_796_ & 0x7f;
								i_797_ = i_797_ + i_641_ & 0x3f;
								i_798_ += i_642_ / 4;
								if (i_798_ < 0)
									i_798_ = 0;
								else if (i_798_ > 7)
									i_798_ = 7;
								i_799_ += i_643_;
								if (i_799_ < 0)
									i_799_ = 0;
								else if (i_799_ > 127)
									i_799_ = 127;
								((OpenGLModel) this).aShortArray10281[i_795_] = (short) (i_797_ << 10 | i_798_ << 7 | i_799_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_800_ = 0; i_800_ < ((OpenGLModel) this).anInt10333; i_800_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_800_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_800_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_801_ = 0; i_801_ < i_646_; i_801_++) {
					int i_802_ = is[i_801_];
					if (i_802_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_803_ = (((OpenGLModel) this).anIntArrayArray10323[i_802_]);
						for (int i_804_ = 0; i_804_ < is_803_.length; i_804_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_803_[i_804_]]);
							((Class150) class150).anInt1698 += i_641_;
							((Class150) class150).anInt1696 += i_642_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_805_ = 0; i_805_ < i_646_; i_805_++) {
					int i_806_ = is[i_805_];
					if (i_806_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_807_ = (((OpenGLModel) this).anIntArrayArray10323[i_806_]);
						for (int i_808_ = 0; i_808_ < is_807_.length; i_808_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_807_[i_808_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_641_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_642_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_809_ = 0; i_809_ < i_646_; i_809_++) {
					int i_810_ = is[i_809_];
					if (i_810_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_811_ = (((OpenGLModel) this).anIntArrayArray10323[i_810_]);
						for (int i_812_ = 0; i_812_ < is_811_.length; i_812_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_811_[i_812_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_641_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method1426(Class261 class261) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		if (((OpenGLModel) this).aClass84Array10300 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass84Array10300.length; i++) {
				Class84 class84 = ((OpenGLModel) this).aClass84Array10300[i];
				Class84 class84_813_ = class84;
				if (class84.aClass84_1092 != null)
					class84_813_ = class84.aClass84_1092;
				class84_813_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_813_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_813_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_813_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_813_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_813_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_813_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_813_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_813_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((OpenGLModel) this).aClass175Array10332 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass175Array10332.length; i++) {
				Class175 class175 = ((OpenGLModel) this).aClass175Array10332[i];
				Class175 class175_814_ = class175;
				if (class175.aClass175_2091 != null)
					class175_814_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_814_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_814_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_814_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	public byte[] method1392() {
		return ((OpenGLModel) this).aByteArray10302;
	}

	boolean method9549(int i, int i_815_, int i_816_, int i_817_, int i_818_, int i_819_, int i_820_, int i_821_) {
		if (i_815_ < i_816_ && i_815_ < i_817_ && i_815_ < i_818_)
			return false;
		if (i_815_ > i_816_ && i_815_ > i_817_ && i_815_ > i_818_)
			return false;
		if (i < i_819_ && i < i_820_ && i < i_821_)
			return false;
		if (i > i_819_ && i > i_820_ && i > i_821_)
			return false;
		return true;
	}

	public Class572_Sub12_Sub18 method1398(Class572_Sub12_Sub18 class572_sub12_sub18) {
		if (((OpenGLModel) this).anInt10291 == 0)
			return null;
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i;
		int i_822_;
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10125) > 0) {
			i = ((((OpenGLModel) this).aShort10322 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_822_ = ((((OpenGLModel) this).aShort10318 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		} else {
			i = ((((OpenGLModel) this).aShort10322 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_822_ = ((((OpenGLModel) this).aShort10318 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		}
		int i_823_;
		int i_824_;
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10053) > 0) {
			i_823_ = ((((OpenGLModel) this).aShort10324 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_824_ = ((((OpenGLModel) this).aShort10325 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		} else {
			i_823_ = ((((OpenGLModel) this).aShort10324 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_824_ = ((((OpenGLModel) this).aShort10325 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		}
		int i_825_ = i_822_ - i + 1;
		int i_826_ = i_824_ - i_823_ + 1;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_827_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_825_, i_826_)) {
			class572_sub12_sub18_sub1_827_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_827_.method10628();
		} else
			class572_sub12_sub18_sub1_827_ = new Class572_Sub12_Sub18_Sub1((((OpenGLModel) this).aClass106_Sub1_10340), i_825_, i_826_);
		class572_sub12_sub18_sub1_827_.method10634(i, i_823_, i_822_, i_824_);
		method9550(class572_sub12_sub18_sub1_827_);
		return class572_sub12_sub18_sub1_827_;
	}

	void method9550(Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1) {
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157).length < ((OpenGLModel) this).anInt10291) {
			((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157 = new int[((OpenGLModel) this).anInt10291];
			((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191 = new int[((OpenGLModel) this).anInt10291];
		}
		int[] is = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157);
		int[] is_828_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191);
		for (int i = 0; i < ((OpenGLModel) this).anInt10285; i++) {
			int i_829_ = (((((OpenGLModel) this).anIntArray10336[i] - ((((OpenGLModel) this).anIntArray10287[i] * (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10125)) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049) - (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11733));
			int i_830_ = (((((OpenGLModel) this).anIntArray10331[i] - ((((OpenGLModel) this).anIntArray10287[i] * (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10053)) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049) - (((Class572_Sub12_Sub18_Sub1) class572_sub12_sub18_sub1).anInt11735));
			int i_831_ = ((OpenGLModel) this).anIntArray10329[i];
			int i_832_ = ((OpenGLModel) this).anIntArray10329[i + 1];
			for (int i_833_ = i_831_; (i_833_ < i_832_ && ((OpenGLModel) this).aShortArray10330[i_833_] != 0); i_833_++) {
				int i_834_ = ((((OpenGLModel) this).aShortArray10330[i_833_] & 0xffff) - 1);
				is[i_834_] = i_829_;
				is_828_[i_834_] = i_830_;
			}
		}
		for (int i = 0; i < ((OpenGLModel) this).anInt10308; i++) {
			if (((OpenGLModel) this).aByteArray10302 == null || ((OpenGLModel) this).aByteArray10302[i] <= 128) {
				int i_835_ = ((OpenGLModel) this).aShortArray10303[i] & 0xffff;
				int i_836_ = ((OpenGLModel) this).aShortArray10327[i] & 0xffff;
				int i_837_ = ((OpenGLModel) this).aShortArray10305[i] & 0xffff;
				int i_838_ = is[i_835_];
				int i_839_ = is[i_836_];
				int i_840_ = is[i_837_];
				int i_841_ = is_828_[i_835_];
				int i_842_ = is_828_[i_836_];
				int i_843_ = is_828_[i_837_];
				if (((i_838_ - i_839_) * (i_842_ - i_843_) - (i_842_ - i_841_) * (i_840_ - i_839_)) > 0)
					class572_sub12_sub18_sub1.method10624(i_841_, i_842_, i_843_, i_838_, i_839_, i_840_);
			}
		}
	}

	void method1405(int i, int[] is, int i_844_, int i_845_, int i_846_, int i_847_, boolean bool) {
		int i_848_ = is.length;
		if (i == 0) {
			i_844_ <<= 4;
			i_845_ <<= 4;
			i_846_ <<= 4;
			int i_849_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_850_ = 0; i_850_ < i_848_; i_850_++) {
				int i_851_ = is[i_850_];
				if (i_851_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_852_ = ((OpenGLModel) this).anIntArrayArray10289[i_851_];
					for (int i_853_ = 0; i_853_ < is_852_.length; i_853_++) {
						int i_854_ = is_852_[i_853_];
						anInt10342 += ((OpenGLModel) this).anIntArray10336[i_854_];
						anInt10310 += ((OpenGLModel) this).anIntArray10287[i_854_];
						anInt10344 += ((OpenGLModel) this).anIntArray10331[i_854_];
						i_849_++;
					}
				}
			}
			if (i_849_ > 0) {
				anInt10342 = anInt10342 / i_849_ + i_844_;
				anInt10310 = anInt10310 / i_849_ + i_845_;
				anInt10344 = anInt10344 / i_849_ + i_846_;
			} else {
				anInt10342 = i_844_;
				anInt10310 = i_845_;
				anInt10344 = i_846_;
			}
		} else if (i == 1) {
			i_844_ <<= 4;
			i_845_ <<= 4;
			i_846_ <<= 4;
			for (int i_855_ = 0; i_855_ < i_848_; i_855_++) {
				int i_856_ = is[i_855_];
				if (i_856_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_857_ = ((OpenGLModel) this).anIntArrayArray10289[i_856_];
					for (int i_858_ = 0; i_858_ < is_857_.length; i_858_++) {
						int i_859_ = is_857_[i_858_];
						((OpenGLModel) this).anIntArray10336[i_859_] += i_844_;
						((OpenGLModel) this).anIntArray10287[i_859_] += i_845_;
						((OpenGLModel) this).anIntArray10331[i_859_] += i_846_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_860_ = 0; i_860_ < i_848_; i_860_++) {
				int i_861_ = is[i_860_];
				if (i_861_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_862_ = ((OpenGLModel) this).anIntArrayArray10289[i_861_];
					if ((i_847_ & 0x1) == 0) {
						for (int i_863_ = 0; i_863_ < is_862_.length; i_863_++) {
							int i_864_ = is_862_[i_863_];
							((OpenGLModel) this).anIntArray10336[i_864_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_864_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_864_] -= anInt10344;
							if (i_846_ != 0) {
								int i_865_ = Class325.anIntArray4103[i_846_];
								int i_866_ = Class325.anIntArray4105[i_846_];
								int i_867_ = (((((OpenGLModel) this).anIntArray10287[i_864_]) * i_865_ + (((OpenGLModel) this).anIntArray10336[i_864_]) * i_866_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_864_] = ((((OpenGLModel) this).anIntArray10287[i_864_]) * i_866_ - (((OpenGLModel) this).anIntArray10336[i_864_]) * i_865_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_864_] = i_867_;
							}
							if (i_844_ != 0) {
								int i_868_ = Class325.anIntArray4103[i_844_];
								int i_869_ = Class325.anIntArray4105[i_844_];
								int i_870_ = (((((OpenGLModel) this).anIntArray10287[i_864_]) * i_869_ - (((OpenGLModel) this).anIntArray10331[i_864_]) * i_868_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_864_] = ((((OpenGLModel) this).anIntArray10287[i_864_]) * i_868_ + (((OpenGLModel) this).anIntArray10331[i_864_]) * i_869_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_864_] = i_870_;
							}
							if (i_845_ != 0) {
								int i_871_ = Class325.anIntArray4103[i_845_];
								int i_872_ = Class325.anIntArray4105[i_845_];
								int i_873_ = (((((OpenGLModel) this).anIntArray10331[i_864_]) * i_871_ + (((OpenGLModel) this).anIntArray10336[i_864_]) * i_872_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_864_] = ((((OpenGLModel) this).anIntArray10331[i_864_]) * i_872_ - (((OpenGLModel) this).anIntArray10336[i_864_]) * i_871_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_864_] = i_873_;
							}
							((OpenGLModel) this).anIntArray10336[i_864_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_864_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_864_] += anInt10344;
						}
					} else {
						for (int i_874_ = 0; i_874_ < is_862_.length; i_874_++) {
							int i_875_ = is_862_[i_874_];
							((OpenGLModel) this).anIntArray10336[i_875_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_875_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_875_] -= anInt10344;
							if (i_844_ != 0) {
								int i_876_ = Class325.anIntArray4103[i_844_];
								int i_877_ = Class325.anIntArray4105[i_844_];
								int i_878_ = (((((OpenGLModel) this).anIntArray10287[i_875_]) * i_877_ - (((OpenGLModel) this).anIntArray10331[i_875_]) * i_876_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_875_] = ((((OpenGLModel) this).anIntArray10287[i_875_]) * i_876_ + (((OpenGLModel) this).anIntArray10331[i_875_]) * i_877_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_875_] = i_878_;
							}
							if (i_846_ != 0) {
								int i_879_ = Class325.anIntArray4103[i_846_];
								int i_880_ = Class325.anIntArray4105[i_846_];
								int i_881_ = (((((OpenGLModel) this).anIntArray10287[i_875_]) * i_879_ + (((OpenGLModel) this).anIntArray10336[i_875_]) * i_880_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_875_] = ((((OpenGLModel) this).anIntArray10287[i_875_]) * i_880_ - (((OpenGLModel) this).anIntArray10336[i_875_]) * i_879_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_875_] = i_881_;
							}
							if (i_845_ != 0) {
								int i_882_ = Class325.anIntArray4103[i_845_];
								int i_883_ = Class325.anIntArray4105[i_845_];
								int i_884_ = (((((OpenGLModel) this).anIntArray10331[i_875_]) * i_882_ + (((OpenGLModel) this).anIntArray10336[i_875_]) * i_883_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_875_] = ((((OpenGLModel) this).anIntArray10331[i_875_]) * i_883_ - (((OpenGLModel) this).anIntArray10336[i_875_]) * i_882_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_875_] = i_884_;
							}
							((OpenGLModel) this).anIntArray10336[i_875_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_875_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_875_] += anInt10344;
						}
					}
				}
			}
			if (bool) {
				for (int i_885_ = 0; i_885_ < i_848_; i_885_++) {
					int i_886_ = is[i_885_];
					if (i_886_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_887_ = (((OpenGLModel) this).anIntArrayArray10289[i_886_]);
						for (int i_888_ = 0; i_888_ < is_887_.length; i_888_++) {
							int i_889_ = is_887_[i_888_];
							int i_890_ = (((OpenGLModel) this).anIntArray10329[i_889_]);
							int i_891_ = (((OpenGLModel) this).anIntArray10329[i_889_ + 1]);
							for (int i_892_ = i_890_; (i_892_ < i_891_ && (((OpenGLModel) this).aShortArray10330[i_892_]) != 0); i_892_++) {
								int i_893_ = (((((OpenGLModel) this).aShortArray10330[i_892_]) & 0xffff) - 1);
								if (i_846_ != 0) {
									int i_894_ = Class325.anIntArray4103[i_846_];
									int i_895_ = Class325.anIntArray4105[i_846_];
									int i_896_ = ((((OpenGLModel) this).aShortArray10293[i_893_]) * i_894_ + ((((OpenGLModel) this).aShortArray10292[i_893_]) * i_895_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10293[i_893_] = (short) (((((OpenGLModel) this).aShortArray10293[i_893_]) * i_895_ - (((OpenGLModel) this).aShortArray10292[i_893_]) * i_894_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_893_] = (short) i_896_;
								}
								if (i_844_ != 0) {
									int i_897_ = Class325.anIntArray4103[i_844_];
									int i_898_ = Class325.anIntArray4105[i_844_];
									int i_899_ = ((((OpenGLModel) this).aShortArray10293[i_893_]) * i_898_ - ((((OpenGLModel) this).aShortArray10288[i_893_]) * i_897_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10288[i_893_] = (short) (((((OpenGLModel) this).aShortArray10293[i_893_]) * i_897_ + (((OpenGLModel) this).aShortArray10288[i_893_]) * i_898_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_893_] = (short) i_899_;
								}
								if (i_845_ != 0) {
									int i_900_ = Class325.anIntArray4103[i_845_];
									int i_901_ = Class325.anIntArray4105[i_845_];
									int i_902_ = ((((OpenGLModel) this).aShortArray10288[i_893_]) * i_900_ + ((((OpenGLModel) this).aShortArray10292[i_893_]) * i_901_) + 16383) >> 14;
									((OpenGLModel) this).aShortArray10288[i_893_] = (short) (((((OpenGLModel) this).aShortArray10288[i_893_]) * i_901_ - (((OpenGLModel) this).aShortArray10292[i_893_]) * i_900_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_893_] = (short) i_902_;
								}
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
					((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
				if (((OpenGLModel) this).aClass142_10315 != null)
					((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
			}
		} else if (i == 3) {
			for (int i_903_ = 0; i_903_ < i_848_; i_903_++) {
				int i_904_ = is[i_903_];
				if (i_904_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_905_ = ((OpenGLModel) this).anIntArrayArray10289[i_904_];
					for (int i_906_ = 0; i_906_ < is_905_.length; i_906_++) {
						int i_907_ = is_905_[i_906_];
						((OpenGLModel) this).anIntArray10336[i_907_] -= anInt10342;
						((OpenGLModel) this).anIntArray10287[i_907_] -= anInt10310;
						((OpenGLModel) this).anIntArray10331[i_907_] -= anInt10344;
						((OpenGLModel) this).anIntArray10336[i_907_] = (((OpenGLModel) this).anIntArray10336[i_907_] * i_844_) >> 7;
						((OpenGLModel) this).anIntArray10287[i_907_] = (((OpenGLModel) this).anIntArray10287[i_907_] * i_845_) >> 7;
						((OpenGLModel) this).anIntArray10331[i_907_] = (((OpenGLModel) this).anIntArray10331[i_907_] * i_846_) >> 7;
						((OpenGLModel) this).anIntArray10336[i_907_] += anInt10342;
						((OpenGLModel) this).anIntArray10287[i_907_] += anInt10310;
						((OpenGLModel) this).anIntArray10331[i_907_] += anInt10344;
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_908_ = 0; i_908_ < i_848_; i_908_++) {
					int i_909_ = is[i_908_];
					if (i_909_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_910_ = (((OpenGLModel) this).anIntArrayArray10307[i_909_]);
						for (int i_911_ = 0; i_911_ < is_910_.length; i_911_++) {
							int i_912_ = is_910_[i_911_];
							int i_913_ = (((((OpenGLModel) this).aByteArray10302[i_912_]) & 0xff) + i_844_ * 8);
							if (i_913_ < 0)
								i_913_ = 0;
							else if (i_913_ > 255)
								i_913_ = 255;
							((OpenGLModel) this).aByteArray10302[i_912_] = (byte) i_913_;
						}
						if (is_910_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_914_ = 0; i_914_ < ((OpenGLModel) this).anInt10333; i_914_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_914_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_914_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_915_ = 0; i_915_ < i_848_; i_915_++) {
					int i_916_ = is[i_915_];
					if (i_916_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_917_ = (((OpenGLModel) this).anIntArrayArray10307[i_916_]);
						for (int i_918_ = 0; i_918_ < is_917_.length; i_918_++) {
							int i_919_ = is_917_[i_918_];
							int i_920_ = ((((OpenGLModel) this).aShortArray10281[i_919_]) & 0xffff);
							int i_921_ = i_920_ >> 10 & 0x3f;
							int i_922_ = i_920_ >> 7 & 0x7;
							int i_923_ = i_920_ & 0x7f;
							i_921_ = i_921_ + i_844_ & 0x3f;
							i_922_ += i_845_ / 4;
							if (i_922_ < 0)
								i_922_ = 0;
							else if (i_922_ > 7)
								i_922_ = 7;
							i_923_ += i_846_;
							if (i_923_ < 0)
								i_923_ = 0;
							else if (i_923_ > 127)
								i_923_ = 127;
							((OpenGLModel) this).aShortArray10281[i_919_] = (short) (i_921_ << 10 | i_922_ << 7 | i_923_);
						}
						if (is_917_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_924_ = 0; i_924_ < ((OpenGLModel) this).anInt10333; i_924_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_924_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_924_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_925_ = 0; i_925_ < i_848_; i_925_++) {
					int i_926_ = is[i_925_];
					if (i_926_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_927_ = (((OpenGLModel) this).anIntArrayArray10323[i_926_]);
						for (int i_928_ = 0; i_928_ < is_927_.length; i_928_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_927_[i_928_]]);
							((Class150) class150).anInt1698 += i_844_;
							((Class150) class150).anInt1696 += i_845_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_929_ = 0; i_929_ < i_848_; i_929_++) {
					int i_930_ = is[i_929_];
					if (i_930_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_931_ = (((OpenGLModel) this).anIntArrayArray10323[i_930_]);
						for (int i_932_ = 0; i_932_ < is_931_.length; i_932_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_931_[i_932_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_844_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_845_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_933_ = 0; i_933_ < i_848_; i_933_++) {
					int i_934_ = is[i_933_];
					if (i_934_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_935_ = (((OpenGLModel) this).anIntArrayArray10323[i_934_]);
						for (int i_936_ = 0; i_936_ < is_935_.length; i_936_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_935_[i_936_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_844_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method9551(Class250 class250) {
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			Class250 class250_937_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10044);
			((OpenGLModel) this).aClass106_Sub1_10340.method9446();
			((OpenGLModel) this).aClass106_Sub1_10340.method1763(!((OpenGLModel) this).aBool10282);
			((OpenGLModel) this).aClass106_Sub1_10340.method9429(false);
			((OpenGLModel) this).aClass106_Sub1_10340.method9416((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass142_10184), null, null, (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass142_10185));
			for (int i = 0; i < ((OpenGLModel) this).anInt10333; i++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i];
				if (!((Class173) class173).aBool2083 || !((OpenGLModel) this).aClass106_Sub1_10340.method1786()) {
					float f = ((float) ((((OpenGLModel) this).anIntArray10336[((Class173) class173).anInt2082]) + (((OpenGLModel) this).anIntArray10336[((Class173) class173).anInt2075]) + (((OpenGLModel) this).anIntArray10336[((Class173) class173).anInt2077])) * 0.3333333F);
					float f_938_ = ((float) ((((OpenGLModel) this).anIntArray10287[((Class173) class173).anInt2082]) + (((OpenGLModel) this).anIntArray10287[((Class173) class173).anInt2075]) + (((OpenGLModel) this).anIntArray10287[((Class173) class173).anInt2077])) * 0.3333333F);
					float f_939_ = ((float) ((((OpenGLModel) this).anIntArray10331[((Class173) class173).anInt2082]) + (((OpenGLModel) this).anIntArray10331[((Class173) class173).anInt2075]) + (((OpenGLModel) this).anIntArray10331[((Class173) class173).anInt2077])) * 0.3333333F);
					float f_940_ = (class250.aFloatArray2728[0] * f + class250.aFloatArray2728[4] * f_938_ + class250.aFloatArray2728[8] * f_939_ + class250.aFloatArray2728[12]);
					float f_941_ = (class250.aFloatArray2728[1] * f + class250.aFloatArray2728[5] * f_938_ + class250.aFloatArray2728[9] * f_939_ + class250.aFloatArray2728[13]);
					float f_942_ = (class250.aFloatArray2728[2] * f + class250.aFloatArray2728[6] * f_938_ + class250.aFloatArray2728[10] * f_939_ + class250.aFloatArray2728[14]);
					float f_943_ = ((float) (1.0 / Math.sqrt((double) (f_940_ * f_940_ + f_941_ * f_941_ + f_942_ * f_942_))) * (float) ((Class173) class173).anInt2084);
					class250_937_.method3472(((Class150) class150).anInt1693, (((Class150) class150).anInt1697 * ((Class173) class173).aShort2079) >> 7, (((Class150) class150).anInt1695 * ((Class173) class173).aShort2080) >> 7, (f_940_ + (float) ((Class150) class150).anInt1698 - f_940_ * f_943_), (f_941_ + (float) ((Class150) class150).anInt1696 - f_941_ * f_943_), f_942_ - f_942_ * f_943_);
					((OpenGLModel) this).aClass106_Sub1_10340.method9397(class250_937_);
					int i_944_ = ((Class150) class150).anInt1694;
					OpenGL.glColor4ub((byte) (i_944_ >> 16), (byte) (i_944_ >> 8), (byte) i_944_, (byte) (i_944_ >> 24));
					((OpenGLModel) this).aClass106_Sub1_10340.method9389(((Class173) class173).aShort2081);
					((OpenGLModel) this).aClass106_Sub1_10340.method9456(((Class173) class173).aByte2076);
					((OpenGLModel) this).aClass106_Sub1_10340.method9417(7, 0, 4);
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method1763(true);
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
		}
	}

	void method9552(boolean bool) {
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158.b).length < ((OpenGLModel) this).anInt10308 * 6)
			((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1((((OpenGLModel) this).anInt10308 + 100) * 6);
		else
			((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158.o = 0;
		Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158);
		if (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aBool10153) {
			for (int i = 0; i < ((OpenGLModel) this).anInt10308; i++) {
				class572_sub15_sub1.writeShort((((OpenGLModel) this).aShortArray10303[i]), -1418239648);
				class572_sub15_sub1.writeShort((((OpenGLModel) this).aShortArray10327[i]), -1463047714);
				class572_sub15_sub1.writeShort((((OpenGLModel) this).aShortArray10305[i]), -1763140559);
			}
		} else {
			for (int i = 0; i < ((OpenGLModel) this).anInt10308; i++) {
				class572_sub15_sub1.method8453((((OpenGLModel) this).aShortArray10303[i]), 1620362524);
				class572_sub15_sub1.method8453((((OpenGLModel) this).aShortArray10327[i]), 1074376751);
				class572_sub15_sub1.method8453((((OpenGLModel) this).aShortArray10305[i]), 1122534365);
			}
		}
		if (class572_sub15_sub1.o * -1585139053 != 0) {
			if (bool) {
				if (((OpenGLModel) this).anInterface12_10314 == null)
					((OpenGLModel) this).anInterface12_10314 = (((OpenGLModel) this).aClass106_Sub1_10340.method9412(5123, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, true));
				else
					((OpenGLModel) this).anInterface12_10314.method69(5123, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053);
				((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611 = ((OpenGLModel) this).anInterface12_10314;
			} else
				((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611 = (((OpenGLModel) this).aClass106_Sub1_10340.method9412(5123, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, false));
			if (!bool)
				((OpenGLModel) this).aBool10316 = true;
		}
	}

	void method9553(boolean bool) {
		boolean bool_945_ = (((OpenGLModel) this).aClass142_10270 != null && (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615) == null);
		boolean bool_946_ = (((OpenGLModel) this).aClass142_10315 != null && (((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615) == null);
		boolean bool_947_ = (((OpenGLModel) this).aClass142_10309 != null && (((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615) == null);
		boolean bool_948_ = (((OpenGLModel) this).aClass142_10312 != null && (((Class142) ((OpenGLModel) this).aClass142_10312).anInterface9_1615) == null);
		if (bool) {
			bool_945_ = bool_945_ & (((OpenGLModel) this).aByte10279 & 0x2) != 0;
			bool_946_ = bool_946_ & (((OpenGLModel) this).aByte10279 & 0x4) != 0;
			bool_947_ = bool_947_ & (((OpenGLModel) this).aByte10279 & 0x1) != 0;
			bool_948_ = bool_948_ & (((OpenGLModel) this).aByte10279 & 0x8) != 0;
		}
		byte i = 0;
		byte i_949_ = 0;
		byte i_950_ = 0;
		byte i_951_ = 0;
		byte i_952_ = 0;
		if (bool_947_) {
			i_949_ = i;
			i += 12;
		}
		if (bool_945_) {
			i_950_ = i;
			i += 4;
		}
		if (bool_946_) {
			i_951_ = i;
			i += 12;
		}
		if (bool_948_) {
			i_952_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158.b).length < ((OpenGLModel) this).anInt10291 * i)
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1((((OpenGLModel) this).anInt10291 + 100) * i);
			else
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158.o = 0;
			Class572_Sub15_Sub1 class572_sub15_sub1 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass572_Sub15_Sub1_10158);
			if (bool_947_) {
				if (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aBool10153) {
					for (int i_953_ = 0; i_953_ < ((OpenGLModel) this).anInt10285; i_953_++) {
						int i_954_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10336[i_953_]);
						int i_955_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10287[i_953_]);
						int i_956_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10331[i_953_]);
						int i_957_ = ((OpenGLModel) this).anIntArray10329[i_953_];
						int i_958_ = (((OpenGLModel) this).anIntArray10329[i_953_ + 1]);
						for (int i_959_ = i_957_; (i_959_ < i_958_ && (((OpenGLModel) this).aShortArray10330[i_959_]) != 0); i_959_++) {
							int i_960_ = (((((OpenGLModel) this).aShortArray10330[i_959_]) & 0xffff) - 1);
							class572_sub15_sub1.o = i_960_ * i * 310393755;
							class572_sub15_sub1.writeInt(i_954_, -1743753997);
							class572_sub15_sub1.writeInt(i_955_, -1743753997);
							class572_sub15_sub1.writeInt(i_956_, -1743753997);
						}
					}
				} else {
					for (int i_961_ = 0; i_961_ < ((OpenGLModel) this).anInt10285; i_961_++) {
						int i_962_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10336[i_961_]);
						int i_963_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10287[i_961_]);
						int i_964_ = Stream.floatToRawIntBits((float) ((OpenGLModel) this).anIntArray10331[i_961_]);
						int i_965_ = ((OpenGLModel) this).anIntArray10329[i_961_];
						int i_966_ = (((OpenGLModel) this).anIntArray10329[i_961_ + 1]);
						for (int i_967_ = i_965_; (i_967_ < i_966_ && (((OpenGLModel) this).aShortArray10330[i_967_]) != 0); i_967_++) {
							int i_968_ = (((((OpenGLModel) this).aShortArray10330[i_967_]) & 0xffff) - 1);
							class572_sub15_sub1.o = i_968_ * i * 310393755;
							class572_sub15_sub1.method8455(i_962_, -1704029337);
							class572_sub15_sub1.method8455(i_963_, -1704029337);
							class572_sub15_sub1.method8455(i_964_, -1704029337);
						}
					}
				}
			}
			if (bool_945_) {
				if (((OpenGLModel) this).aClass142_10315 == null) {
					short[] is;
					short[] is_969_;
					short[] is_970_;
					byte[] is_971_;
					if (((OpenGLModel) this).aClass164_10296 != null) {
						is = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2036;
						is_969_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2033;
						is_970_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2035;
						is_971_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aByteArray2034;
					} else {
						is = ((OpenGLModel) this).aShortArray10292;
						is_969_ = ((OpenGLModel) this).aShortArray10293;
						is_970_ = ((OpenGLModel) this).aShortArray10288;
						is_971_ = ((OpenGLModel) this).aByteArray10295;
					}
					float f = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10113[0]);
					float f_972_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArray10113[1]);
					float f_973_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArray10113[2]);
					float f_974_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10119);
					float f_975_ = ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10120) * 768.0F / (float) ((OpenGLModel) this).aShort10304);
					float f_976_ = ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10126) * 768.0F / (float) ((OpenGLModel) this).aShort10304);
					for (int i_977_ = 0; i_977_ < ((OpenGLModel) this).anInt10299; i_977_++) {
						int i_978_ = method9554((((OpenGLModel) this).aShortArray10281[i_977_]), (((OpenGLModel) this).aShortArray10306[i_977_]), ((OpenGLModel) this).aShort10280, (((OpenGLModel) this).aByteArray10302[i_977_]));
						float f_979_ = ((float) (i_978_ >>> 24) * (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10011));
						float f_980_ = ((float) (i_978_ >> 16 & 0xff) * (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10117));
						float f_981_ = ((float) (i_978_ >> 8 & 0xff) * (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat9992));
						int i_982_ = (((OpenGLModel) this).aShortArray10303[i_977_] & 0xffff);
						short i_983_ = (short) is_971_[i_982_];
						float f_984_;
						if (i_983_ == 0)
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) * 0.0026041667F);
						else
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) / (float) (i_983_ * 256));
						float f_985_ = f_974_ + f_984_ * (f_984_ < 0.0F ? f_976_ : f_975_);
						int i_986_ = (int) (f_979_ * f_985_);
						if (i_986_ < 0)
							i_986_ = 0;
						else if (i_986_ > 255)
							i_986_ = 255;
						int i_987_ = (int) (f_980_ * f_985_);
						if (i_987_ < 0)
							i_987_ = 0;
						else if (i_987_ > 255)
							i_987_ = 255;
						int i_988_ = (int) (f_981_ * f_985_);
						if (i_988_ < 0)
							i_988_ = 0;
						else if (i_988_ > 255)
							i_988_ = 255;
						class572_sub15_sub1.o = (i_950_ + i_982_ * i) * 310393755;
						class572_sub15_sub1.writeByte(i_986_, -1384395473);
						class572_sub15_sub1.writeByte(i_987_, -1384395473);
						class572_sub15_sub1.writeByte(i_988_, -1384395473);
						class572_sub15_sub1.writeByte(255 - ((((OpenGLModel) this).aByteArray10302[i_977_]) & 0xff), -1384395473);
						i_982_ = (((OpenGLModel) this).aShortArray10327[i_977_] & 0xffff);
						i_983_ = (short) is_971_[i_982_];
						if (i_983_ == 0)
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) * 0.0026041667F);
						else
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) / (float) (i_983_ * 256));
						f_985_ = f_974_ + f_984_ * (f_984_ < 0.0F ? f_976_ : f_975_);
						i_986_ = (int) (f_979_ * f_985_);
						if (i_986_ < 0)
							i_986_ = 0;
						else if (i_986_ > 255)
							i_986_ = 255;
						i_987_ = (int) (f_980_ * f_985_);
						if (i_987_ < 0)
							i_987_ = 0;
						else if (i_987_ > 255)
							i_987_ = 255;
						i_988_ = (int) (f_981_ * f_985_);
						if (i_988_ < 0)
							i_988_ = 0;
						else if (i_988_ > 255)
							i_988_ = 255;
						class572_sub15_sub1.o = (i_950_ + i_982_ * i) * 310393755;
						class572_sub15_sub1.writeByte(i_986_, -1384395473);
						class572_sub15_sub1.writeByte(i_987_, -1384395473);
						class572_sub15_sub1.writeByte(i_988_, -1384395473);
						class572_sub15_sub1.writeByte(255 - ((((OpenGLModel) this).aByteArray10302[i_977_]) & 0xff), -1384395473);
						i_982_ = (((OpenGLModel) this).aShortArray10305[i_977_] & 0xffff);
						i_983_ = (short) is_971_[i_982_];
						if (i_983_ == 0)
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) * 0.0026041667F);
						else
							f_984_ = ((f * (float) is[i_982_] + f_972_ * (float) is_969_[i_982_] + f_973_ * (float) is_970_[i_982_]) / (float) (i_983_ * 256));
						f_985_ = f_974_ + f_984_ * (f_984_ < 0.0F ? f_976_ : f_975_);
						i_986_ = (int) (f_979_ * f_985_);
						if (i_986_ < 0)
							i_986_ = 0;
						else if (i_986_ > 255)
							i_986_ = 255;
						i_987_ = (int) (f_980_ * f_985_);
						if (i_987_ < 0)
							i_987_ = 0;
						else if (i_987_ > 255)
							i_987_ = 255;
						i_988_ = (int) (f_981_ * f_985_);
						if (i_988_ < 0)
							i_988_ = 0;
						else if (i_988_ > 255)
							i_988_ = 255;
						class572_sub15_sub1.o = (i_950_ + i_982_ * i) * 310393755;
						class572_sub15_sub1.writeByte(i_986_, -1384395473);
						class572_sub15_sub1.writeByte(i_987_, -1384395473);
						class572_sub15_sub1.writeByte(i_988_, -1384395473);
						class572_sub15_sub1.writeByte(255 - ((((OpenGLModel) this).aByteArray10302[i_977_]) & 0xff), -1384395473);
					}
				} else {
					for (int i_989_ = 0; i_989_ < ((OpenGLModel) this).anInt10299; i_989_++) {
						int i_990_ = method9554((((OpenGLModel) this).aShortArray10281[i_989_]), (((OpenGLModel) this).aShortArray10306[i_989_]), ((OpenGLModel) this).aShort10280, (((OpenGLModel) this).aByteArray10302[i_989_]));
						class572_sub15_sub1.o = (i_950_ + ((((OpenGLModel) this).aShortArray10303[i_989_]) & 0xffff) * i) * 310393755;
						class572_sub15_sub1.writeInt(i_990_, -1743753997);
						class572_sub15_sub1.o = (i_950_ + ((((OpenGLModel) this).aShortArray10327[i_989_]) & 0xffff) * i) * 310393755;
						class572_sub15_sub1.writeInt(i_990_, -1743753997);
						class572_sub15_sub1.o = (i_950_ + ((((OpenGLModel) this).aShortArray10305[i_989_]) & 0xffff) * i) * 310393755;
						class572_sub15_sub1.writeInt(i_990_, -1743753997);
					}
				}
			}
			if (bool_946_) {
				short[] is;
				short[] is_991_;
				short[] is_992_;
				byte[] is_993_;
				if (((OpenGLModel) this).aClass164_10296 != null) {
					is = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
					is_991_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
					is_992_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
					is_993_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
				} else {
					is = ((OpenGLModel) this).aShortArray10292;
					is_991_ = ((OpenGLModel) this).aShortArray10293;
					is_992_ = ((OpenGLModel) this).aShortArray10288;
					is_993_ = ((OpenGLModel) this).aByteArray10295;
				}
				float f = 3.0F / (float) ((OpenGLModel) this).aShort10304;
				float f_994_ = 3.0F / (float) (((OpenGLModel) this).aShort10304 + ((OpenGLModel) this).aShort10304 / 2);
				class572_sub15_sub1.o = i_951_ * 310393755;
				if (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aBool10153) {
					for (int i_995_ = 0; i_995_ < ((OpenGLModel) this).anInt10291; i_995_++) {
						int i_996_ = is_993_[i_995_] & 0xff;
						if (i_996_ == 0) {
							class572_sub15_sub1.method10299((float) is[i_995_] * f_994_);
							class572_sub15_sub1.method10299((float) is_991_[i_995_] * f_994_);
							class572_sub15_sub1.method10299((float) is_992_[i_995_] * f_994_);
						} else {
							float f_997_ = f / (float) i_996_;
							class572_sub15_sub1.method10299((float) is[i_995_] * f_997_);
							class572_sub15_sub1.method10299((float) is_991_[i_995_] * f_997_);
							class572_sub15_sub1.method10299((float) is_992_[i_995_] * f_997_);
						}
						class572_sub15_sub1.o += (i - 12) * 310393755;
					}
				} else {
					for (int i_998_ = 0; i_998_ < ((OpenGLModel) this).anInt10291; i_998_++) {
						int i_999_ = is_993_[i_998_] & 0xff;
						if (i_999_ == 0) {
							class572_sub15_sub1.method10298((float) is[i_998_] * f_994_);
							class572_sub15_sub1.method10298((float) is_991_[i_998_] * f_994_);
							class572_sub15_sub1.method10298((float) is_992_[i_998_] * f_994_);
						} else {
							float f_1000_ = f / (float) i_999_;
							class572_sub15_sub1.method10298((float) is[i_998_] * f_1000_);
							class572_sub15_sub1.method10298((float) (is_991_[i_998_]) * f_1000_);
							class572_sub15_sub1.method10298((float) (is_992_[i_998_]) * f_1000_);
						}
						class572_sub15_sub1.o += (i - 12) * 310393755;
					}
				}
			}
			if (bool_948_) {
				class572_sub15_sub1.o = i_952_ * 310393755;
				if (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aBool10153) {
					for (int i_1001_ = 0; i_1001_ < ((OpenGLModel) this).anInt10291; i_1001_++) {
						class572_sub15_sub1.method10299(((OpenGLModel) this).aFloatArray10297[i_1001_]);
						class572_sub15_sub1.method10299(((OpenGLModel) this).aFloatArray10339[i_1001_]);
						class572_sub15_sub1.o += (i - 8) * 310393755;
					}
				} else {
					for (int i_1002_ = 0; i_1002_ < ((OpenGLModel) this).anInt10291; i_1002_++) {
						class572_sub15_sub1.method10298(((OpenGLModel) this).aFloatArray10297[i_1002_]);
						class572_sub15_sub1.method10298(((OpenGLModel) this).aFloatArray10339[i_1002_]);
						class572_sub15_sub1.o += (i - 8) * 310393755;
					}
				}
			}
			class572_sub15_sub1.o = i * ((OpenGLModel) this).anInt10291 * 310393755;
			Interface9 interface9;
			if (bool) {
				if (((OpenGLModel) this).anInterface9_10275 == null)
					((OpenGLModel) this).anInterface9_10275 = (((OpenGLModel) this).aClass106_Sub1_10340.method9413(i, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, true));
				else
					((OpenGLModel) this).anInterface9_10275.method57(i, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053);
				interface9 = ((OpenGLModel) this).anInterface9_10275;
				((OpenGLModel) this).aByte10279 = (byte) 0;
			} else {
				interface9 = (((OpenGLModel) this).aClass106_Sub1_10340.method9413(i, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, false));
				((OpenGLModel) this).aBool10316 = true;
			}
			if (bool_947_) {
				((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = interface9;
				((Class142) ((OpenGLModel) this).aClass142_10309).aByte1613 = i_949_;
			}
			if (bool_948_) {
				((Class142) ((OpenGLModel) this).aClass142_10312).anInterface9_1615 = interface9;
				((Class142) ((OpenGLModel) this).aClass142_10312).aByte1613 = i_952_;
			}
			if (bool_945_) {
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = interface9;
				((Class142) ((OpenGLModel) this).aClass142_10270).aByte1613 = i_950_;
			}
			if (bool_946_) {
				((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = interface9;
				((Class142) ((OpenGLModel) this).aClass142_10315).aByte1613 = i_951_;
			}
		}
	}

	int method9554(int i, short i_1003_, int i_1004_, byte i_1005_) {
		int i_1006_ = Class460.anIntArray5213[method9548(i, i_1004_)];
		if (i_1003_ != -1) {
			MaterialInformation class101 = ((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396.getTexture(i_1003_ & 0xffff, 2077304017);
			int i_1007_ = class101.aByte1366 & 0xff;
			if (i_1007_ != 0) {
				int i_1008_;
				if (i_1004_ < 0)
					i_1008_ = 0;
				else if (i_1004_ > 127)
					i_1008_ = 16777215;
				else
					i_1008_ = 131586 * i_1004_;
				if (i_1007_ == 256)
					i_1006_ = i_1008_;
				else {
					int i_1009_ = i_1007_;
					int i_1010_ = 256 - i_1007_;
					i_1006_ = ((((i_1008_ & 0xff00ff) * i_1009_ + (i_1006_ & 0xff00ff) * i_1010_) & ~0xff00ff) + (((i_1008_ & 0xff00) * i_1009_ + (i_1006_ & 0xff00) * i_1010_) & 0xff0000)) >> 8;
				}
			}
			int i_1011_ = class101.aByte1368 & 0xff;
			if (i_1011_ != 0) {
				i_1011_ += 256;
				int i_1012_ = ((i_1006_ & 0xff0000) >> 16) * i_1011_;
				if (i_1012_ > 65535)
					i_1012_ = 65535;
				int i_1013_ = ((i_1006_ & 0xff00) >> 8) * i_1011_;
				if (i_1013_ > 65535)
					i_1013_ = 65535;
				int i_1014_ = (i_1006_ & 0xff) * i_1011_;
				if (i_1014_ > 65535)
					i_1014_ = 65535;
				i_1006_ = (i_1012_ << 8 & 0xff0000) + (i_1013_ & 0xff00) + (i_1014_ >> 8);
			}
		}
		return i_1006_ << 8 | 255 - (i_1005_ & 0xff);
	}

	void method9555() {
		int i = 32767;
		int i_1015_ = 32767;
		int i_1016_ = 32767;
		int i_1017_ = -32768;
		int i_1018_ = -32768;
		int i_1019_ = -32768;
		int i_1020_ = 0;
		int i_1021_ = 0;
		for (int i_1022_ = 0; i_1022_ < ((OpenGLModel) this).anInt10285; i_1022_++) {
			int i_1023_ = ((OpenGLModel) this).anIntArray10336[i_1022_];
			int i_1024_ = ((OpenGLModel) this).anIntArray10287[i_1022_];
			int i_1025_ = ((OpenGLModel) this).anIntArray10331[i_1022_];
			if (i_1023_ < i)
				i = i_1023_;
			if (i_1023_ > i_1017_)
				i_1017_ = i_1023_;
			if (i_1024_ < i_1015_)
				i_1015_ = i_1024_;
			if (i_1024_ > i_1018_)
				i_1018_ = i_1024_;
			if (i_1025_ < i_1016_)
				i_1016_ = i_1025_;
			if (i_1025_ > i_1019_)
				i_1019_ = i_1025_;
			int i_1026_ = i_1023_ * i_1023_ + i_1025_ * i_1025_;
			if (i_1026_ > i_1020_)
				i_1020_ = i_1026_;
			i_1026_ = i_1023_ * i_1023_ + i_1025_ * i_1025_ + i_1024_ * i_1024_;
			if (i_1026_ > i_1021_)
				i_1021_ = i_1026_;
		}
		((OpenGLModel) this).aShort10322 = (short) i;
		((OpenGLModel) this).aShort10318 = (short) i_1017_;
		((OpenGLModel) this).aShort10317 = (short) i_1015_;
		((OpenGLModel) this).aShort10321 = (short) i_1018_;
		((OpenGLModel) this).aShort10324 = (short) i_1016_;
		((OpenGLModel) this).aShort10325 = (short) i_1019_;
		((OpenGLModel) this).anInt10271 = (int) (Math.sqrt((double) i_1020_) + 0.99);
		((OpenGLModel) this).anInt10313 = (int) (Math.sqrt((double) i_1021_) + 0.99);
		((OpenGLModel) this).aBool10319 = true;
	}

	static {
		anIntArray10320 = new int[8];
		anIntArray10298 = new int[8];
		anIntArray10341 = new int[8];
	}

	public int method1401() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10325;
	}

	public void method1404(Model model, int i, int i_1027_, int i_1028_, boolean bool) {
		OpenGLModel class89_sub1_1029_ = (OpenGLModel) model;
		if (((OpenGLModel) this).anInt10299 != 0 && ((OpenGLModel) class89_sub1_1029_).anInt10299 != 0) {
			int i_1030_ = ((OpenGLModel) class89_sub1_1029_).anInt10285;
			int[] is = ((OpenGLModel) class89_sub1_1029_).anIntArray10336;
			int[] is_1031_ = ((OpenGLModel) class89_sub1_1029_).anIntArray10287;
			int[] is_1032_ = ((OpenGLModel) class89_sub1_1029_).anIntArray10331;
			short[] is_1033_ = ((OpenGLModel) class89_sub1_1029_).aShortArray10292;
			short[] is_1034_ = ((OpenGLModel) class89_sub1_1029_).aShortArray10293;
			short[] is_1035_ = ((OpenGLModel) class89_sub1_1029_).aShortArray10288;
			byte[] is_1036_ = ((OpenGLModel) class89_sub1_1029_).aByteArray10295;
			short[] is_1037_;
			short[] is_1038_;
			short[] is_1039_;
			byte[] is_1040_;
			if (((OpenGLModel) this).aClass164_10296 != null) {
				is_1037_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
				is_1038_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
				is_1039_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
				is_1040_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			} else {
				is_1037_ = null;
				is_1038_ = null;
				is_1039_ = null;
				is_1040_ = null;
			}
			short[] is_1041_;
			short[] is_1042_;
			short[] is_1043_;
			byte[] is_1044_;
			if (((OpenGLModel) class89_sub1_1029_).aClass164_10296 != null) {
				is_1041_ = ((Class164) (((OpenGLModel) class89_sub1_1029_).aClass164_10296)).aShortArray2036;
				is_1042_ = ((Class164) (((OpenGLModel) class89_sub1_1029_).aClass164_10296)).aShortArray2033;
				is_1043_ = ((Class164) (((OpenGLModel) class89_sub1_1029_).aClass164_10296)).aShortArray2035;
				is_1044_ = ((Class164) (((OpenGLModel) class89_sub1_1029_).aClass164_10296)).aByteArray2034;
			} else {
				is_1041_ = null;
				is_1042_ = null;
				is_1043_ = null;
				is_1044_ = null;
			}
			int[] is_1045_ = ((OpenGLModel) class89_sub1_1029_).anIntArray10329;
			short[] is_1046_ = ((OpenGLModel) class89_sub1_1029_).aShortArray10330;
			if (!((OpenGLModel) class89_sub1_1029_).aBool10319)
				class89_sub1_1029_.method9556();
			int i_1047_ = ((OpenGLModel) class89_sub1_1029_).aShort10317;
			int i_1048_ = ((OpenGLModel) class89_sub1_1029_).aShort10321;
			int i_1049_ = ((OpenGLModel) class89_sub1_1029_).aShort10322;
			int i_1050_ = ((OpenGLModel) class89_sub1_1029_).aShort10318;
			int i_1051_ = ((OpenGLModel) class89_sub1_1029_).aShort10324;
			int i_1052_ = ((OpenGLModel) class89_sub1_1029_).aShort10325;
			for (int i_1053_ = 0; i_1053_ < ((OpenGLModel) this).anInt10285; i_1053_++) {
				int i_1054_ = ((OpenGLModel) this).anIntArray10287[i_1053_] - i_1027_;
				if (i_1054_ >= i_1047_ && i_1054_ <= i_1048_) {
					int i_1055_ = ((OpenGLModel) this).anIntArray10336[i_1053_] - i;
					if (i_1055_ >= i_1049_ && i_1055_ <= i_1050_) {
						int i_1056_ = (((OpenGLModel) this).anIntArray10331[i_1053_] - i_1028_);
						if (i_1056_ >= i_1051_ && i_1056_ <= i_1052_) {
							int i_1057_ = -1;
							int i_1058_ = (((OpenGLModel) this).anIntArray10329[i_1053_]);
							int i_1059_ = (((OpenGLModel) this).anIntArray10329[i_1053_ + 1]);
							for (int i_1060_ = i_1058_; (i_1060_ < i_1059_ && (((OpenGLModel) this).aShortArray10330[i_1060_]) != 0); i_1060_++) {
								i_1057_ = ((((OpenGLModel) this).aShortArray10330[i_1060_]) & 0xffff) - 1;
								if ((((OpenGLModel) this).aByteArray10295[i_1057_]) != 0)
									break;
							}
							if (i_1057_ != -1) {
								for (int i_1061_ = 0; i_1061_ < i_1030_; i_1061_++) {
									if (i_1055_ == is[i_1061_] && i_1056_ == is_1032_[i_1061_] && i_1054_ == is_1031_[i_1061_]) {
										int i_1062_ = -1;
										i_1058_ = is_1045_[i_1061_];
										i_1059_ = is_1045_[i_1061_ + 1];
										for (int i_1063_ = i_1058_; (i_1063_ < i_1059_ && is_1046_[i_1063_] != 0); i_1063_++) {
											i_1062_ = (is_1046_[i_1063_] & 0xffff) - 1;
											if (is_1036_[i_1062_] != 0)
												break;
										}
										if (i_1062_ != -1) {
											if (is_1037_ == null) {
												((OpenGLModel) this).aClass164_10296 = new Class164();
												is_1037_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2036 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10292), -627263417));
												is_1038_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2033 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10293), -661300035));
												is_1039_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2035 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10288), -1835344058));
												is_1040_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aByteArray2034 = (Class359.method4442((((OpenGLModel) this).aByteArray10295), -2137635797));
											}
											if (is_1041_ == null) {
												Class164 class164 = (((OpenGLModel) class89_sub1_1029_).aClass164_10296 = new Class164());
												is_1041_ = ((Class164) class164).aShortArray2036 = (Class572_Sub3_Sub3.method10283(is_1033_, -572168500));
												is_1042_ = ((Class164) class164).aShortArray2033 = (Class572_Sub3_Sub3.method10283(is_1034_, -1464556231));
												is_1043_ = ((Class164) class164).aShortArray2035 = (Class572_Sub3_Sub3.method10283(is_1035_, -799226393));
												is_1044_ = ((Class164) class164).aByteArray2034 = (Class359.method4442(is_1036_, -2128820354));
											}
											short i_1064_ = (((OpenGLModel) this).aShortArray10292[i_1057_]);
											short i_1065_ = (((OpenGLModel) this).aShortArray10293[i_1057_]);
											short i_1066_ = (((OpenGLModel) this).aShortArray10288[i_1057_]);
											byte i_1067_ = (((OpenGLModel) this).aByteArray10295[i_1057_]);
											i_1058_ = is_1045_[i_1061_];
											i_1059_ = is_1045_[i_1061_ + 1];
											for (int i_1068_ = i_1058_; i_1068_ < i_1059_; i_1068_++) {
												int i_1069_ = is_1046_[i_1068_] - 1;
												if (i_1069_ == -1)
													break;
												if (is_1044_[i_1069_] != 0) {
													is_1041_[i_1069_] += i_1064_;
													is_1042_[i_1069_] += i_1065_;
													is_1043_[i_1069_] += i_1066_;
													is_1044_[i_1069_] += i_1067_;
												}
											}
											i_1064_ = is_1033_[i_1062_];
											i_1065_ = is_1034_[i_1062_];
											i_1066_ = is_1035_[i_1062_];
											i_1067_ = is_1036_[i_1062_];
											i_1058_ = (((OpenGLModel) this).anIntArray10329[i_1053_]);
											i_1059_ = (((OpenGLModel) this).anIntArray10329[i_1053_ + 1]);
											for (int i_1070_ = i_1058_; (i_1070_ < i_1059_ && (((OpenGLModel) this).aShortArray10330[i_1070_]) != 0); i_1070_++) {
												int i_1071_ = (((((OpenGLModel) this).aShortArray10330[i_1070_]) & 0xffff) - 1);
												if (is_1040_[i_1071_] != 0) {
													is_1037_[i_1071_] += i_1064_;
													is_1038_[i_1071_] += i_1065_;
													is_1039_[i_1071_] += i_1066_;
													is_1040_[i_1071_] += i_1067_;
												}
											}
											if ((((OpenGLModel) this).aClass142_10315) == null && (((OpenGLModel) this).aClass142_10270) != null)
												((Class142) (((OpenGLModel) this).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) this).aClass142_10315) != null)
												((Class142) (((OpenGLModel) this).aClass142_10315)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_1029_).aClass142_10315) == null && (((OpenGLModel) class89_sub1_1029_).aClass142_10270) != null)
												((Class142) (((OpenGLModel) class89_sub1_1029_).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_1029_).aClass142_10315) != null)
												((Class142) (((OpenGLModel) class89_sub1_1029_).aClass142_10315)).anInterface9_1615 = null;
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

	public Model method1488(byte i, int i_1072_, boolean bool) {
		boolean bool_1073_ = false;
		OpenGLModel class89_sub1_1074_;
		OpenGLModel class89_sub1_1075_;
		if (i > 0 && i <= 8) {
			class89_sub1_1075_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass89_Sub1Array10182[i - 1]);
			class89_sub1_1074_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass89_Sub1Array10181[i - 1]);
			bool_1073_ = true;
		} else
			class89_sub1_1074_ = class89_sub1_1075_ = new OpenGLModel(((OpenGLModel) this).aClass106_Sub1_10340);
		return method9559(class89_sub1_1074_, class89_sub1_1075_, i_1072_, bool_1073_, bool);
	}

	void method9556() {
		int i = 32767;
		int i_1076_ = 32767;
		int i_1077_ = 32767;
		int i_1078_ = -32768;
		int i_1079_ = -32768;
		int i_1080_ = -32768;
		int i_1081_ = 0;
		int i_1082_ = 0;
		for (int i_1083_ = 0; i_1083_ < ((OpenGLModel) this).anInt10285; i_1083_++) {
			int i_1084_ = ((OpenGLModel) this).anIntArray10336[i_1083_];
			int i_1085_ = ((OpenGLModel) this).anIntArray10287[i_1083_];
			int i_1086_ = ((OpenGLModel) this).anIntArray10331[i_1083_];
			if (i_1084_ < i)
				i = i_1084_;
			if (i_1084_ > i_1078_)
				i_1078_ = i_1084_;
			if (i_1085_ < i_1076_)
				i_1076_ = i_1085_;
			if (i_1085_ > i_1079_)
				i_1079_ = i_1085_;
			if (i_1086_ < i_1077_)
				i_1077_ = i_1086_;
			if (i_1086_ > i_1080_)
				i_1080_ = i_1086_;
			int i_1087_ = i_1084_ * i_1084_ + i_1086_ * i_1086_;
			if (i_1087_ > i_1081_)
				i_1081_ = i_1087_;
			i_1087_ = i_1084_ * i_1084_ + i_1086_ * i_1086_ + i_1085_ * i_1085_;
			if (i_1087_ > i_1082_)
				i_1082_ = i_1087_;
		}
		((OpenGLModel) this).aShort10322 = (short) i;
		((OpenGLModel) this).aShort10318 = (short) i_1078_;
		((OpenGLModel) this).aShort10317 = (short) i_1076_;
		((OpenGLModel) this).aShort10321 = (short) i_1079_;
		((OpenGLModel) this).aShort10324 = (short) i_1077_;
		((OpenGLModel) this).aShort10325 = (short) i_1080_;
		((OpenGLModel) this).anInt10271 = (int) (Math.sqrt((double) i_1081_) + 0.99);
		((OpenGLModel) this).anInt10313 = (int) (Math.sqrt((double) i_1082_) + 0.99);
		((OpenGLModel) this).aBool10319 = true;
	}

	public int method1407() {
		return ((OpenGLModel) this).anInt10277;
	}

	public void method1503() {
		if (((OpenGLModel) this).anInt10291 > 0 && ((OpenGLModel) this).anInt10308 > 0) {
			method9553(false);
			if ((((OpenGLModel) this).aByte10279 & 0x10) == 0 && (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
				method9552(false);
			method9547();
		}
	}

	public int method1459() {
		return ((OpenGLModel) this).aShort10280;
	}

	public void method1410(int i) {
		((OpenGLModel) this).anInt10277 = i;
		if (((OpenGLModel) this).aClass164_10296 != null && (((OpenGLModel) this).anInt10277 & 0x10000) == 0) {
			((OpenGLModel) this).aShortArray10292 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
			((OpenGLModel) this).aShortArray10293 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
			((OpenGLModel) this).aShortArray10288 = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
			((OpenGLModel) this).aByteArray10295 = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			((OpenGLModel) this).aClass164_10296 = null;
		}
		((OpenGLModel) this).aBool10316 = true;
		method9547();
	}

	public void method1360(Model model, int i, int i_1088_, int i_1089_, boolean bool) {
		OpenGLModel class89_sub1_1090_ = (OpenGLModel) model;
		if (((OpenGLModel) this).anInt10299 != 0 && ((OpenGLModel) class89_sub1_1090_).anInt10299 != 0) {
			int i_1091_ = ((OpenGLModel) class89_sub1_1090_).anInt10285;
			int[] is = ((OpenGLModel) class89_sub1_1090_).anIntArray10336;
			int[] is_1092_ = ((OpenGLModel) class89_sub1_1090_).anIntArray10287;
			int[] is_1093_ = ((OpenGLModel) class89_sub1_1090_).anIntArray10331;
			short[] is_1094_ = ((OpenGLModel) class89_sub1_1090_).aShortArray10292;
			short[] is_1095_ = ((OpenGLModel) class89_sub1_1090_).aShortArray10293;
			short[] is_1096_ = ((OpenGLModel) class89_sub1_1090_).aShortArray10288;
			byte[] is_1097_ = ((OpenGLModel) class89_sub1_1090_).aByteArray10295;
			short[] is_1098_;
			short[] is_1099_;
			short[] is_1100_;
			byte[] is_1101_;
			if (((OpenGLModel) this).aClass164_10296 != null) {
				is_1098_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036);
				is_1099_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033);
				is_1100_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035);
				is_1101_ = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034);
			} else {
				is_1098_ = null;
				is_1099_ = null;
				is_1100_ = null;
				is_1101_ = null;
			}
			short[] is_1102_;
			short[] is_1103_;
			short[] is_1104_;
			byte[] is_1105_;
			if (((OpenGLModel) class89_sub1_1090_).aClass164_10296 != null) {
				is_1102_ = ((Class164) (((OpenGLModel) class89_sub1_1090_).aClass164_10296)).aShortArray2036;
				is_1103_ = ((Class164) (((OpenGLModel) class89_sub1_1090_).aClass164_10296)).aShortArray2033;
				is_1104_ = ((Class164) (((OpenGLModel) class89_sub1_1090_).aClass164_10296)).aShortArray2035;
				is_1105_ = ((Class164) (((OpenGLModel) class89_sub1_1090_).aClass164_10296)).aByteArray2034;
			} else {
				is_1102_ = null;
				is_1103_ = null;
				is_1104_ = null;
				is_1105_ = null;
			}
			int[] is_1106_ = ((OpenGLModel) class89_sub1_1090_).anIntArray10329;
			short[] is_1107_ = ((OpenGLModel) class89_sub1_1090_).aShortArray10330;
			if (!((OpenGLModel) class89_sub1_1090_).aBool10319)
				class89_sub1_1090_.method9556();
			int i_1108_ = ((OpenGLModel) class89_sub1_1090_).aShort10317;
			int i_1109_ = ((OpenGLModel) class89_sub1_1090_).aShort10321;
			int i_1110_ = ((OpenGLModel) class89_sub1_1090_).aShort10322;
			int i_1111_ = ((OpenGLModel) class89_sub1_1090_).aShort10318;
			int i_1112_ = ((OpenGLModel) class89_sub1_1090_).aShort10324;
			int i_1113_ = ((OpenGLModel) class89_sub1_1090_).aShort10325;
			for (int i_1114_ = 0; i_1114_ < ((OpenGLModel) this).anInt10285; i_1114_++) {
				int i_1115_ = ((OpenGLModel) this).anIntArray10287[i_1114_] - i_1088_;
				if (i_1115_ >= i_1108_ && i_1115_ <= i_1109_) {
					int i_1116_ = ((OpenGLModel) this).anIntArray10336[i_1114_] - i;
					if (i_1116_ >= i_1110_ && i_1116_ <= i_1111_) {
						int i_1117_ = (((OpenGLModel) this).anIntArray10331[i_1114_] - i_1089_);
						if (i_1117_ >= i_1112_ && i_1117_ <= i_1113_) {
							int i_1118_ = -1;
							int i_1119_ = (((OpenGLModel) this).anIntArray10329[i_1114_]);
							int i_1120_ = (((OpenGLModel) this).anIntArray10329[i_1114_ + 1]);
							for (int i_1121_ = i_1119_; (i_1121_ < i_1120_ && (((OpenGLModel) this).aShortArray10330[i_1121_]) != 0); i_1121_++) {
								i_1118_ = ((((OpenGLModel) this).aShortArray10330[i_1121_]) & 0xffff) - 1;
								if ((((OpenGLModel) this).aByteArray10295[i_1118_]) != 0)
									break;
							}
							if (i_1118_ != -1) {
								for (int i_1122_ = 0; i_1122_ < i_1091_; i_1122_++) {
									if (i_1116_ == is[i_1122_] && i_1117_ == is_1093_[i_1122_] && i_1115_ == is_1092_[i_1122_]) {
										int i_1123_ = -1;
										i_1119_ = is_1106_[i_1122_];
										i_1120_ = is_1106_[i_1122_ + 1];
										for (int i_1124_ = i_1119_; (i_1124_ < i_1120_ && is_1107_[i_1124_] != 0); i_1124_++) {
											i_1123_ = (is_1107_[i_1124_] & 0xffff) - 1;
											if (is_1097_[i_1123_] != 0)
												break;
										}
										if (i_1123_ != -1) {
											if (is_1098_ == null) {
												((OpenGLModel) this).aClass164_10296 = new Class164();
												is_1098_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2036 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10292), -1466943095));
												is_1099_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2033 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10293), -360518805));
												is_1100_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aShortArray2035 = (Class572_Sub3_Sub3.method10283((((OpenGLModel) this).aShortArray10288), -1201696982));
												is_1101_ = ((Class164) (((OpenGLModel) this).aClass164_10296)).aByteArray2034 = (Class359.method4442((((OpenGLModel) this).aByteArray10295), -2143835664));
											}
											if (is_1102_ == null) {
												Class164 class164 = (((OpenGLModel) class89_sub1_1090_).aClass164_10296 = new Class164());
												is_1102_ = ((Class164) class164).aShortArray2036 = (Class572_Sub3_Sub3.method10283(is_1094_, -1467468617));
												is_1103_ = ((Class164) class164).aShortArray2033 = (Class572_Sub3_Sub3.method10283(is_1095_, -1908558612));
												is_1104_ = ((Class164) class164).aShortArray2035 = (Class572_Sub3_Sub3.method10283(is_1096_, -750767958));
												is_1105_ = ((Class164) class164).aByteArray2034 = (Class359.method4442(is_1097_, -2138745807));
											}
											short i_1125_ = (((OpenGLModel) this).aShortArray10292[i_1118_]);
											short i_1126_ = (((OpenGLModel) this).aShortArray10293[i_1118_]);
											short i_1127_ = (((OpenGLModel) this).aShortArray10288[i_1118_]);
											byte i_1128_ = (((OpenGLModel) this).aByteArray10295[i_1118_]);
											i_1119_ = is_1106_[i_1122_];
											i_1120_ = is_1106_[i_1122_ + 1];
											for (int i_1129_ = i_1119_; i_1129_ < i_1120_; i_1129_++) {
												int i_1130_ = is_1107_[i_1129_] - 1;
												if (i_1130_ == -1)
													break;
												if (is_1105_[i_1130_] != 0) {
													is_1102_[i_1130_] += i_1125_;
													is_1103_[i_1130_] += i_1126_;
													is_1104_[i_1130_] += i_1127_;
													is_1105_[i_1130_] += i_1128_;
												}
											}
											i_1125_ = is_1094_[i_1123_];
											i_1126_ = is_1095_[i_1123_];
											i_1127_ = is_1096_[i_1123_];
											i_1128_ = is_1097_[i_1123_];
											i_1119_ = (((OpenGLModel) this).anIntArray10329[i_1114_]);
											i_1120_ = (((OpenGLModel) this).anIntArray10329[i_1114_ + 1]);
											for (int i_1131_ = i_1119_; (i_1131_ < i_1120_ && (((OpenGLModel) this).aShortArray10330[i_1131_]) != 0); i_1131_++) {
												int i_1132_ = (((((OpenGLModel) this).aShortArray10330[i_1131_]) & 0xffff) - 1);
												if (is_1101_[i_1132_] != 0) {
													is_1098_[i_1132_] += i_1125_;
													is_1099_[i_1132_] += i_1126_;
													is_1100_[i_1132_] += i_1127_;
													is_1101_[i_1132_] += i_1128_;
												}
											}
											if ((((OpenGLModel) this).aClass142_10315) == null && (((OpenGLModel) this).aClass142_10270) != null)
												((Class142) (((OpenGLModel) this).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) this).aClass142_10315) != null)
												((Class142) (((OpenGLModel) this).aClass142_10315)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_1090_).aClass142_10315) == null && (((OpenGLModel) class89_sub1_1090_).aClass142_10270) != null)
												((Class142) (((OpenGLModel) class89_sub1_1090_).aClass142_10270)).anInterface9_1615 = null;
											if ((((OpenGLModel) class89_sub1_1090_).aClass142_10315) != null)
												((Class142) (((OpenGLModel) class89_sub1_1090_).aClass142_10315)).anInterface9_1615 = null;
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

	public boolean method1399() {
		return ((OpenGLModel) this).aBool10283;
	}

	public void method1415(int i) {
		int i_1133_ = Class325.anIntArray4103[i];
		int i_1134_ = Class325.anIntArray4105[i];
		for (int i_1135_ = 0; i_1135_ < ((OpenGLModel) this).anInt10285; i_1135_++) {
			int i_1136_ = ((((OpenGLModel) this).anIntArray10331[i_1135_] * i_1133_ + ((OpenGLModel) this).anIntArray10336[i_1135_] * i_1134_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_1135_] = ((((OpenGLModel) this).anIntArray10331[i_1135_] * i_1134_ - ((OpenGLModel) this).anIntArray10336[i_1135_] * i_1133_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_1135_] = i_1136_;
		}
		for (int i_1137_ = 0; i_1137_ < ((OpenGLModel) this).anInt10291; i_1137_++) {
			int i_1138_ = ((((OpenGLModel) this).aShortArray10288[i_1137_] * i_1133_ + (((OpenGLModel) this).aShortArray10292[i_1137_] * i_1134_)) >> 14);
			((OpenGLModel) this).aShortArray10288[i_1137_] = (short) (((((OpenGLModel) this).aShortArray10288[i_1137_] * i_1134_) - (((OpenGLModel) this).aShortArray10292[i_1137_] * i_1133_)) >> 14);
			((OpenGLModel) this).aShortArray10292[i_1137_] = (short) i_1138_;
		}
		if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1413() {
		if (((OpenGLModel) this).anInt10291 > 0 && ((OpenGLModel) this).anInt10308 > 0) {
			method9553(false);
			if ((((OpenGLModel) this).aByte10279 & 0x10) == 0 && (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
				method9552(false);
			method9547();
		}
	}

	public void method1489() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10285; i++)
			((OpenGLModel) this).anIntArray10331[i] = -((OpenGLModel) this).anIntArray10331[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10291; i++)
			((OpenGLModel) this).aShortArray10288[i] = (short) -((OpenGLModel) this).aShortArray10288[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10299; i++) {
			short i_1139_ = ((OpenGLModel) this).aShortArray10303[i];
			((OpenGLModel) this).aShortArray10303[i] = ((OpenGLModel) this).aShortArray10305[i];
			((OpenGLModel) this).aShortArray10305[i] = i_1139_;
		}
		if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass139_10301 != null)
			((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1387(int i) {
		int i_1140_ = Class325.anIntArray4103[i];
		int i_1141_ = Class325.anIntArray4105[i];
		for (int i_1142_ = 0; i_1142_ < ((OpenGLModel) this).anInt10285; i_1142_++) {
			int i_1143_ = ((((OpenGLModel) this).anIntArray10287[i_1142_] * i_1140_ + ((OpenGLModel) this).anIntArray10336[i_1142_] * i_1141_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_1142_] = ((((OpenGLModel) this).anIntArray10287[i_1142_] * i_1141_ - ((OpenGLModel) this).anIntArray10336[i_1142_] * i_1140_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_1142_] = i_1143_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1417(int i) {
		int i_1144_ = Class325.anIntArray4103[i];
		int i_1145_ = Class325.anIntArray4105[i];
		for (int i_1146_ = 0; i_1146_ < ((OpenGLModel) this).anInt10285; i_1146_++) {
			int i_1147_ = ((((OpenGLModel) this).anIntArray10287[i_1146_] * i_1144_ + ((OpenGLModel) this).anIntArray10336[i_1146_] * i_1145_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_1146_] = ((((OpenGLModel) this).anIntArray10287[i_1146_] * i_1145_ - ((OpenGLModel) this).anIntArray10336[i_1146_] * i_1144_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_1146_] = i_1147_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1418(int i, int i_1148_, int i_1149_) {
		for (int i_1150_ = 0; i_1150_ < ((OpenGLModel) this).anInt10285; i_1150_++) {
			if (i != 0)
				((OpenGLModel) this).anIntArray10336[i_1150_] += i;
			if (i_1148_ != 0)
				((OpenGLModel) this).anIntArray10287[i_1150_] += i_1148_;
			if (i_1149_ != 0)
				((OpenGLModel) this).anIntArray10331[i_1150_] += i_1149_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public int method1458() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10321;
	}

	public void method1420(int i, int i_1151_, int i_1152_) {
		for (int i_1153_ = 0; i_1153_ < ((OpenGLModel) this).anInt10285; i_1153_++) {
			if (i != 128)
				((OpenGLModel) this).anIntArray10336[i_1153_] = ((OpenGLModel) this).anIntArray10336[i_1153_] * i >> 7;
			if (i_1151_ != 128)
				((OpenGLModel) this).anIntArray10287[i_1153_] = (((OpenGLModel) this).anIntArray10287[i_1153_] * i_1151_ >> 7);
			if (i_1152_ != 128)
				((OpenGLModel) this).anIntArray10331[i_1153_] = (((OpenGLModel) this).anIntArray10331[i_1153_] * i_1152_ >> 7);
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1421(int i, int i_1154_, int i_1155_) {
		for (int i_1156_ = 0; i_1156_ < ((OpenGLModel) this).anInt10285; i_1156_++) {
			if (i != 128)
				((OpenGLModel) this).anIntArray10336[i_1156_] = ((OpenGLModel) this).anIntArray10336[i_1156_] * i >> 7;
			if (i_1154_ != 128)
				((OpenGLModel) this).anIntArray10287[i_1156_] = (((OpenGLModel) this).anIntArray10287[i_1156_] * i_1154_ >> 7);
			if (i_1155_ != 128)
				((OpenGLModel) this).anIntArray10331[i_1156_] = (((OpenGLModel) this).anIntArray10331[i_1156_] * i_1155_ >> 7);
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1383(int i, int i_1157_, Class174 class174, Class174 class174_1158_, int i_1159_, int i_1160_, int i_1161_) {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i_1162_ = i_1159_ + ((OpenGLModel) this).aShort10322;
		int i_1163_ = i_1159_ + ((OpenGLModel) this).aShort10318;
		int i_1164_ = i_1161_ + ((OpenGLModel) this).aShort10324;
		int i_1165_ = i_1161_ + ((OpenGLModel) this).aShort10325;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1162_ >= 0 && ((i_1163_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2086 * -1715487093) && i_1164_ >= 0 && ((i_1165_ + class174.anInt2087 * 2129890771 >> class174.anInt2088 * 212267571) < class174.anInt2089 * 792439321))) {
			if (i == 4 || i == 5) {
				if (class174_1158_ == null || (i_1162_ < 0 || ((i_1163_ + class174_1158_.anInt2087 * 2129890771 >> class174_1158_.anInt2088 * 212267571) >= class174_1158_.anInt2086 * -1715487093) || i_1164_ < 0 || ((i_1165_ + class174_1158_.anInt2087 * 2129890771 >> class174_1158_.anInt2088 * 212267571) >= class174_1158_.anInt2089 * 792439321)))
					return;
			} else {
				i_1162_ >>= class174.anInt2088 * 212267571;
				i_1163_ = (i_1163_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				i_1164_ >>= class174.anInt2088 * 212267571;
				i_1165_ = (i_1165_ + (class174.anInt2087 * 2129890771 - 1) >> class174.anInt2088 * 212267571);
				if ((class174.method2713(i_1162_, i_1164_, -1378361832) == i_1160_) && (class174.method2713(i_1163_, i_1164_, -1563648772) == i_1160_) && (class174.method2713(i_1162_, i_1165_, -487573802) == i_1160_) && (class174.method2713(i_1163_, i_1165_, -926978095) == i_1160_))
					return;
			}
			if (i == 1) {
				for (int i_1166_ = 0; i_1166_ < ((OpenGLModel) this).anInt10285; i_1166_++)
					((OpenGLModel) this).anIntArray10287[i_1166_] = (((OpenGLModel) this).anIntArray10287[i_1166_] + class174.method2718(((((OpenGLModel) this).anIntArray10336[i_1166_]) + i_1159_), ((((OpenGLModel) this).anIntArray10331[i_1166_]) + i_1161_), -973767033) - i_1160_);
			} else if (i == 2) {
				int i_1167_ = ((OpenGLModel) this).aShort10317;
				if (i_1167_ == 0)
					return;
				for (int i_1168_ = 0; i_1168_ < ((OpenGLModel) this).anInt10285; i_1168_++) {
					int i_1169_ = ((((OpenGLModel) this).anIntArray10287[i_1168_] << 16) / i_1167_);
					if (i_1169_ < i_1157_)
						((OpenGLModel) this).anIntArray10287[i_1168_] = (((OpenGLModel) this).anIntArray10287[i_1168_] + (class174.method2718((((OpenGLModel) this).anIntArray10336[i_1168_]) + i_1159_, (((OpenGLModel) this).anIntArray10331[i_1168_]) + i_1161_, -311908891) - i_1160_) * (i_1157_ - i_1169_) / i_1157_);
				}
			} else if (i == 3) {
				int i_1170_ = (i_1157_ & 0xff) * 4;
				int i_1171_ = (i_1157_ >> 8 & 0xff) * 4;
				int i_1172_ = (i_1157_ >> 16 & 0xff) << 6;
				int i_1173_ = (i_1157_ >> 24 & 0xff) << 6;
				if (i_1159_ - (i_1170_ >> 1) < 0 || ((i_1159_ + (i_1170_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2086 * -1715487093 << class174.anInt2088 * 212267571)) || i_1161_ - (i_1171_ >> 1) < 0 || ((i_1161_ + (i_1171_ >> 1) + class174.anInt2087 * 2129890771) >= (class174.anInt2089 * 792439321 << class174.anInt2088 * 212267571)))
					return;
				method1362(class174, i_1159_, i_1160_, i_1161_, i_1170_, i_1171_, i_1172_, i_1173_);
			} else if (i == 4) {
				int i_1174_ = (((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317);
				for (int i_1175_ = 0; i_1175_ < ((OpenGLModel) this).anInt10285; i_1175_++)
					((OpenGLModel) this).anIntArray10287[i_1175_] = (((OpenGLModel) this).anIntArray10287[i_1175_] + (class174_1158_.method2718((((OpenGLModel) this).anIntArray10336[i_1175_]) + i_1159_, (((OpenGLModel) this).anIntArray10331[i_1175_]) + i_1161_, -1309349078) - i_1160_) + i_1174_);
			} else if (i == 5) {
				int i_1176_ = (((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317);
				for (int i_1177_ = 0; i_1177_ < ((OpenGLModel) this).anInt10285; i_1177_++) {
					int i_1178_ = (((OpenGLModel) this).anIntArray10336[i_1177_] + i_1159_);
					int i_1179_ = (((OpenGLModel) this).anIntArray10331[i_1177_] + i_1161_);
					int i_1180_ = class174.method2718(i_1178_, i_1179_, -1174301495);
					int i_1181_ = class174_1158_.method2718(i_1178_, i_1179_, -741978109);
					int i_1182_ = i_1180_ - i_1181_ - i_1157_;
					((OpenGLModel) this).anIntArray10287[i_1177_] = ((((OpenGLModel) this).anIntArray10287[i_1177_] << 8) / i_1176_ * i_1182_ >> 8) - (i_1160_ - i_1180_);
				}
			}
			if (((OpenGLModel) this).aClass142_10309 != null)
				((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
			((OpenGLModel) this).aBool10319 = false;
		}
	}

	void method1423() {
		/* empty */
	}

	void method1395() {
		/* empty */
	}

	public void method1412(int i) {
		int i_1183_ = Class325.anIntArray4103[i];
		int i_1184_ = Class325.anIntArray4105[i];
		for (int i_1185_ = 0; i_1185_ < ((OpenGLModel) this).anInt10285; i_1185_++) {
			int i_1186_ = ((((OpenGLModel) this).anIntArray10331[i_1185_] * i_1183_ + ((OpenGLModel) this).anIntArray10336[i_1185_] * i_1184_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_1185_] = ((((OpenGLModel) this).anIntArray10331[i_1185_] * i_1184_ - ((OpenGLModel) this).anIntArray10336[i_1185_] * i_1183_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_1185_] = i_1186_;
		}
		for (int i_1187_ = 0; i_1187_ < ((OpenGLModel) this).anInt10291; i_1187_++) {
			int i_1188_ = ((((OpenGLModel) this).aShortArray10288[i_1187_] * i_1183_ + (((OpenGLModel) this).aShortArray10292[i_1187_] * i_1184_)) >> 14);
			((OpenGLModel) this).aShortArray10288[i_1187_] = (short) (((((OpenGLModel) this).aShortArray10288[i_1187_] * i_1184_) - (((OpenGLModel) this).aShortArray10292[i_1187_] * i_1183_)) >> 14);
			((OpenGLModel) this).aShortArray10292[i_1187_] = (short) i_1188_;
		}
		if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	boolean method1352() {
		if (((OpenGLModel) this).anIntArrayArray10289 == null)
			return false;
		for (int i = 0; i < ((OpenGLModel) this).anInt10284; i++) {
			((OpenGLModel) this).anIntArray10336[i] <<= 4;
			((OpenGLModel) this).anIntArray10287[i] <<= 4;
			((OpenGLModel) this).anIntArray10331[i] <<= 4;
		}
		anInt10342 = 0;
		anInt10310 = 0;
		anInt10344 = 0;
		return true;
	}

	void method1427() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10284; i++) {
			((OpenGLModel) this).anIntArray10336[i] = ((OpenGLModel) this).anIntArray10336[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10287[i] = ((OpenGLModel) this).anIntArray10287[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10331[i] = ((OpenGLModel) this).anIntArray10331[i] + 7 >> 4;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	void method1428() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10284; i++) {
			((OpenGLModel) this).anIntArray10336[i] = ((OpenGLModel) this).anIntArray10336[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10287[i] = ((OpenGLModel) this).anIntArray10287[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10331[i] = ((OpenGLModel) this).anIntArray10331[i] + 7 >> 4;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public int method1380() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10322;
	}

	void method1432(int i, int[] is, int i_1189_, int i_1190_, int i_1191_, boolean bool, int i_1192_, int[] is_1193_) {
		int i_1194_ = is.length;
		if (i == 0) {
			i_1189_ <<= 4;
			i_1190_ <<= 4;
			i_1191_ <<= 4;
			int i_1195_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_1196_ = 0; i_1196_ < i_1194_; i_1196_++) {
				int i_1197_ = is[i_1196_];
				if (i_1197_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1198_ = ((OpenGLModel) this).anIntArrayArray10289[i_1197_];
					for (int i_1199_ = 0; i_1199_ < is_1198_.length; i_1199_++) {
						int i_1200_ = is_1198_[i_1199_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1200_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_1200_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_1200_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_1200_]);
							i_1195_++;
						}
					}
				}
			}
			if (i_1195_ > 0) {
				anInt10342 = anInt10342 / i_1195_ + i_1189_;
				anInt10310 = anInt10310 / i_1195_ + i_1190_;
				anInt10344 = anInt10344 / i_1195_ + i_1191_;
				aBool10345 = true;
			} else {
				anInt10342 = i_1189_;
				anInt10310 = i_1190_;
				anInt10344 = i_1191_;
			}
		} else if (i == 1) {
			if (is_1193_ != null) {
				int i_1201_ = ((is_1193_[0] * i_1189_ + is_1193_[1] * i_1190_ + is_1193_[2] * i_1191_ + 8192) >> 14);
				int i_1202_ = ((is_1193_[3] * i_1189_ + is_1193_[4] * i_1190_ + is_1193_[5] * i_1191_ + 8192) >> 14);
				int i_1203_ = ((is_1193_[6] * i_1189_ + is_1193_[7] * i_1190_ + is_1193_[8] * i_1191_ + 8192) >> 14);
				i_1189_ = i_1201_;
				i_1190_ = i_1202_;
				i_1191_ = i_1203_;
			}
			i_1189_ <<= 4;
			i_1190_ <<= 4;
			i_1191_ <<= 4;
			for (int i_1204_ = 0; i_1204_ < i_1194_; i_1204_++) {
				int i_1205_ = is[i_1204_];
				if (i_1205_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1206_ = ((OpenGLModel) this).anIntArrayArray10289[i_1205_];
					for (int i_1207_ = 0; i_1207_ < is_1206_.length; i_1207_++) {
						int i_1208_ = is_1206_[i_1207_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1208_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_1208_] += i_1189_;
							((OpenGLModel) this).anIntArray10287[i_1208_] += i_1190_;
							((OpenGLModel) this).anIntArray10331[i_1208_] += i_1191_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1193_ != null) {
				int i_1209_ = is_1193_[9] << 4;
				int i_1210_ = is_1193_[10] << 4;
				int i_1211_ = is_1193_[11] << 4;
				int i_1212_ = is_1193_[12] << 4;
				int i_1213_ = is_1193_[13] << 4;
				int i_1214_ = is_1193_[14] << 4;
				if (aBool10345) {
					int i_1215_ = ((is_1193_[0] * anInt10342 + is_1193_[3] * anInt10310 + is_1193_[6] * anInt10344 + 8192) >> 14);
					int i_1216_ = ((is_1193_[1] * anInt10342 + is_1193_[4] * anInt10310 + is_1193_[7] * anInt10344 + 8192) >> 14);
					int i_1217_ = ((is_1193_[2] * anInt10342 + is_1193_[5] * anInt10310 + is_1193_[8] * anInt10344 + 8192) >> 14);
					i_1215_ += i_1212_;
					i_1216_ += i_1213_;
					i_1217_ += i_1214_;
					anInt10342 = i_1215_;
					anInt10310 = i_1216_;
					anInt10344 = i_1217_;
					aBool10345 = false;
				}
				int[] is_1218_ = new int[9];
				int i_1219_ = Class325.anIntArray4105[i_1189_];
				int i_1220_ = Class325.anIntArray4103[i_1189_];
				int i_1221_ = Class325.anIntArray4105[i_1190_];
				int i_1222_ = Class325.anIntArray4103[i_1190_];
				int i_1223_ = Class325.anIntArray4105[i_1191_];
				int i_1224_ = Class325.anIntArray4103[i_1191_];
				int i_1225_ = i_1220_ * i_1223_ + 8192 >> 14;
				int i_1226_ = i_1220_ * i_1224_ + 8192 >> 14;
				is_1218_[0] = i_1221_ * i_1223_ + i_1222_ * i_1226_ + 8192 >> 14;
				is_1218_[1] = -i_1221_ * i_1224_ + i_1222_ * i_1225_ + 8192 >> 14;
				is_1218_[2] = i_1222_ * i_1219_ + 8192 >> 14;
				is_1218_[3] = i_1219_ * i_1224_ + 8192 >> 14;
				is_1218_[4] = i_1219_ * i_1223_ + 8192 >> 14;
				is_1218_[5] = -i_1220_;
				is_1218_[6] = -i_1222_ * i_1223_ + i_1221_ * i_1226_ + 8192 >> 14;
				is_1218_[7] = i_1222_ * i_1224_ + i_1221_ * i_1225_ + 8192 >> 14;
				is_1218_[8] = i_1221_ * i_1219_ + 8192 >> 14;
				int i_1227_ = ((is_1218_[0] * -anInt10342 + is_1218_[1] * -anInt10310 + is_1218_[2] * -anInt10344 + 8192) >> 14);
				int i_1228_ = ((is_1218_[3] * -anInt10342 + is_1218_[4] * -anInt10310 + is_1218_[5] * -anInt10344 + 8192) >> 14);
				int i_1229_ = ((is_1218_[6] * -anInt10342 + is_1218_[7] * -anInt10310 + is_1218_[8] * -anInt10344 + 8192) >> 14);
				int i_1230_ = i_1227_ + anInt10342;
				int i_1231_ = i_1228_ + anInt10310;
				int i_1232_ = i_1229_ + anInt10344;
				int[] is_1233_ = new int[9];
				for (int i_1234_ = 0; i_1234_ < 3; i_1234_++) {
					for (int i_1235_ = 0; i_1235_ < 3; i_1235_++) {
						int i_1236_ = 0;
						for (int i_1237_ = 0; i_1237_ < 3; i_1237_++)
							i_1236_ += (is_1218_[i_1234_ * 3 + i_1237_] * is_1193_[i_1235_ * 3 + i_1237_]);
						is_1233_[i_1234_ * 3 + i_1235_] = i_1236_ + 8192 >> 14;
					}
				}
				int i_1238_ = ((is_1218_[0] * i_1212_ + is_1218_[1] * i_1213_ + is_1218_[2] * i_1214_ + 8192) >> 14);
				int i_1239_ = ((is_1218_[3] * i_1212_ + is_1218_[4] * i_1213_ + is_1218_[5] * i_1214_ + 8192) >> 14);
				int i_1240_ = ((is_1218_[6] * i_1212_ + is_1218_[7] * i_1213_ + is_1218_[8] * i_1214_ + 8192) >> 14);
				i_1238_ += i_1230_;
				i_1239_ += i_1231_;
				i_1240_ += i_1232_;
				int[] is_1241_ = new int[9];
				for (int i_1242_ = 0; i_1242_ < 3; i_1242_++) {
					for (int i_1243_ = 0; i_1243_ < 3; i_1243_++) {
						int i_1244_ = 0;
						for (int i_1245_ = 0; i_1245_ < 3; i_1245_++)
							i_1244_ += (is_1193_[i_1242_ * 3 + i_1245_] * is_1233_[i_1243_ + i_1245_ * 3]);
						is_1241_[i_1242_ * 3 + i_1243_] = i_1244_ + 8192 >> 14;
					}
				}
				int i_1246_ = ((is_1193_[0] * i_1238_ + is_1193_[1] * i_1239_ + is_1193_[2] * i_1240_ + 8192) >> 14);
				int i_1247_ = ((is_1193_[3] * i_1238_ + is_1193_[4] * i_1239_ + is_1193_[5] * i_1240_ + 8192) >> 14);
				int i_1248_ = ((is_1193_[6] * i_1238_ + is_1193_[7] * i_1239_ + is_1193_[8] * i_1240_ + 8192) >> 14);
				i_1246_ += i_1209_;
				i_1247_ += i_1210_;
				i_1248_ += i_1211_;
				for (int i_1249_ = 0; i_1249_ < i_1194_; i_1249_++) {
					int i_1250_ = is[i_1249_];
					if (i_1250_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1251_ = (((OpenGLModel) this).anIntArrayArray10289[i_1250_]);
						for (int i_1252_ = 0; i_1252_ < is_1251_.length; i_1252_++) {
							int i_1253_ = is_1251_[i_1252_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1253_])) != 0)) {
								int i_1254_ = ((is_1241_[0] * (((OpenGLModel) this).anIntArray10336[i_1253_]) + is_1241_[1] * (((OpenGLModel) this).anIntArray10287[i_1253_]) + is_1241_[2] * (((OpenGLModel) this).anIntArray10331[i_1253_]) + 8192) >> 14);
								int i_1255_ = ((is_1241_[3] * (((OpenGLModel) this).anIntArray10336[i_1253_]) + is_1241_[4] * (((OpenGLModel) this).anIntArray10287[i_1253_]) + is_1241_[5] * (((OpenGLModel) this).anIntArray10331[i_1253_]) + 8192) >> 14);
								int i_1256_ = ((is_1241_[6] * (((OpenGLModel) this).anIntArray10336[i_1253_]) + is_1241_[7] * (((OpenGLModel) this).anIntArray10287[i_1253_]) + is_1241_[8] * (((OpenGLModel) this).anIntArray10331[i_1253_]) + 8192) >> 14);
								i_1254_ += i_1246_;
								i_1255_ += i_1247_;
								i_1256_ += i_1248_;
								((OpenGLModel) this).anIntArray10336[i_1253_] = i_1254_;
								((OpenGLModel) this).anIntArray10287[i_1253_] = i_1255_;
								((OpenGLModel) this).anIntArray10331[i_1253_] = i_1256_;
							}
						}
					}
				}
			} else {
				for (int i_1257_ = 0; i_1257_ < i_1194_; i_1257_++) {
					int i_1258_ = is[i_1257_];
					if (i_1258_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1259_ = (((OpenGLModel) this).anIntArrayArray10289[i_1258_]);
						for (int i_1260_ = 0; i_1260_ < is_1259_.length; i_1260_++) {
							int i_1261_ = is_1259_[i_1260_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1261_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1261_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1261_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1261_] -= anInt10344;
								if (i_1191_ != 0) {
									int i_1262_ = Class325.anIntArray4103[i_1191_];
									int i_1263_ = Class325.anIntArray4105[i_1191_];
									int i_1264_ = (((((OpenGLModel) this).anIntArray10287[i_1261_]) * i_1262_ + (((OpenGLModel) this).anIntArray10336[i_1261_]) * i_1263_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_1261_] = (((((OpenGLModel) this).anIntArray10287[i_1261_]) * i_1263_) - ((((OpenGLModel) this).anIntArray10336[i_1261_]) * i_1262_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1261_] = i_1264_;
								}
								if (i_1189_ != 0) {
									int i_1265_ = Class325.anIntArray4103[i_1189_];
									int i_1266_ = Class325.anIntArray4105[i_1189_];
									int i_1267_ = (((((OpenGLModel) this).anIntArray10287[i_1261_]) * i_1266_ - (((OpenGLModel) this).anIntArray10331[i_1261_]) * i_1265_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1261_] = (((((OpenGLModel) this).anIntArray10287[i_1261_]) * i_1265_) + ((((OpenGLModel) this).anIntArray10331[i_1261_]) * i_1266_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_1261_] = i_1267_;
								}
								if (i_1190_ != 0) {
									int i_1268_ = Class325.anIntArray4103[i_1190_];
									int i_1269_ = Class325.anIntArray4105[i_1190_];
									int i_1270_ = (((((OpenGLModel) this).anIntArray10331[i_1261_]) * i_1268_ + (((OpenGLModel) this).anIntArray10336[i_1261_]) * i_1269_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1261_] = (((((OpenGLModel) this).anIntArray10331[i_1261_]) * i_1269_) - ((((OpenGLModel) this).anIntArray10336[i_1261_]) * i_1268_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1261_] = i_1270_;
								}
								((OpenGLModel) this).anIntArray10336[i_1261_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1261_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1261_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_1271_ = 0; i_1271_ < i_1194_; i_1271_++) {
						int i_1272_ = is[i_1271_];
						if (i_1272_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_1273_ = (((OpenGLModel) this).anIntArrayArray10289[i_1272_]);
							for (int i_1274_ = 0; i_1274_ < is_1273_.length; i_1274_++) {
								int i_1275_ = is_1273_[i_1274_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || (i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1275_])) != 0) {
									int i_1276_ = (((OpenGLModel) this).anIntArray10329[i_1275_]);
									int i_1277_ = (((OpenGLModel) this).anIntArray10329[i_1275_ + 1]);
									for (int i_1278_ = i_1276_; (i_1278_ < i_1277_ && ((((OpenGLModel) this).aShortArray10330[i_1278_]) != 0)); i_1278_++) {
										int i_1279_ = (((((OpenGLModel) this).aShortArray10330[i_1278_]) & 0xffff) - 1);
										if (i_1191_ != 0) {
											int i_1280_ = (Class325.anIntArray4103[i_1191_]);
											int i_1281_ = (Class325.anIntArray4105[i_1191_]);
											int i_1282_ = (((((OpenGLModel) this).aShortArray10293[i_1279_]) * i_1280_ + (((OpenGLModel) this).aShortArray10292[i_1279_]) * i_1281_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1279_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1279_]) * i_1281_) - ((((OpenGLModel) this).aShortArray10292[i_1279_]) * i_1280_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1279_] = (short) i_1282_;
										}
										if (i_1189_ != 0) {
											int i_1283_ = (Class325.anIntArray4103[i_1189_]);
											int i_1284_ = (Class325.anIntArray4105[i_1189_]);
											int i_1285_ = (((((OpenGLModel) this).aShortArray10293[i_1279_]) * i_1284_ - (((OpenGLModel) this).aShortArray10288[i_1279_]) * i_1283_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1279_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1279_]) * i_1283_) + ((((OpenGLModel) this).aShortArray10288[i_1279_]) * i_1284_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1279_] = (short) i_1285_;
										}
										if (i_1190_ != 0) {
											int i_1286_ = (Class325.anIntArray4103[i_1190_]);
											int i_1287_ = (Class325.anIntArray4105[i_1190_]);
											int i_1288_ = (((((OpenGLModel) this).aShortArray10288[i_1279_]) * i_1286_ + (((OpenGLModel) this).aShortArray10292[i_1279_]) * i_1287_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1279_] = (short) ((((((OpenGLModel) this).aShortArray10288[i_1279_]) * i_1287_) - ((((OpenGLModel) this).aShortArray10292[i_1279_]) * i_1286_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1279_] = (short) i_1288_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_1193_ != null) {
				int i_1289_ = is_1193_[9] << 4;
				int i_1290_ = is_1193_[10] << 4;
				int i_1291_ = is_1193_[11] << 4;
				int i_1292_ = is_1193_[12] << 4;
				int i_1293_ = is_1193_[13] << 4;
				int i_1294_ = is_1193_[14] << 4;
				if (aBool10345) {
					int i_1295_ = ((is_1193_[0] * anInt10342 + is_1193_[3] * anInt10310 + is_1193_[6] * anInt10344 + 8192) >> 14);
					int i_1296_ = ((is_1193_[1] * anInt10342 + is_1193_[4] * anInt10310 + is_1193_[7] * anInt10344 + 8192) >> 14);
					int i_1297_ = ((is_1193_[2] * anInt10342 + is_1193_[5] * anInt10310 + is_1193_[8] * anInt10344 + 8192) >> 14);
					i_1295_ += i_1292_;
					i_1296_ += i_1293_;
					i_1297_ += i_1294_;
					anInt10342 = i_1295_;
					anInt10310 = i_1296_;
					anInt10344 = i_1297_;
					aBool10345 = false;
				}
				int i_1298_ = i_1189_ << 15 >> 7;
				int i_1299_ = i_1190_ << 15 >> 7;
				int i_1300_ = i_1191_ << 15 >> 7;
				int i_1301_ = i_1298_ * -anInt10342 + 8192 >> 14;
				int i_1302_ = i_1299_ * -anInt10310 + 8192 >> 14;
				int i_1303_ = i_1300_ * -anInt10344 + 8192 >> 14;
				int i_1304_ = i_1301_ + anInt10342;
				int i_1305_ = i_1302_ + anInt10310;
				int i_1306_ = i_1303_ + anInt10344;
				int[] is_1307_ = new int[9];
				is_1307_[0] = i_1298_ * is_1193_[0] + 8192 >> 14;
				is_1307_[1] = i_1298_ * is_1193_[3] + 8192 >> 14;
				is_1307_[2] = i_1298_ * is_1193_[6] + 8192 >> 14;
				is_1307_[3] = i_1299_ * is_1193_[1] + 8192 >> 14;
				is_1307_[4] = i_1299_ * is_1193_[4] + 8192 >> 14;
				is_1307_[5] = i_1299_ * is_1193_[7] + 8192 >> 14;
				is_1307_[6] = i_1300_ * is_1193_[2] + 8192 >> 14;
				is_1307_[7] = i_1300_ * is_1193_[5] + 8192 >> 14;
				is_1307_[8] = i_1300_ * is_1193_[8] + 8192 >> 14;
				int i_1308_ = i_1298_ * i_1292_ + 8192 >> 14;
				int i_1309_ = i_1299_ * i_1293_ + 8192 >> 14;
				int i_1310_ = i_1300_ * i_1294_ + 8192 >> 14;
				i_1308_ += i_1304_;
				i_1309_ += i_1305_;
				i_1310_ += i_1306_;
				int[] is_1311_ = new int[9];
				for (int i_1312_ = 0; i_1312_ < 3; i_1312_++) {
					for (int i_1313_ = 0; i_1313_ < 3; i_1313_++) {
						int i_1314_ = 0;
						for (int i_1315_ = 0; i_1315_ < 3; i_1315_++)
							i_1314_ += (is_1193_[i_1312_ * 3 + i_1315_] * is_1307_[i_1313_ + i_1315_ * 3]);
						is_1311_[i_1312_ * 3 + i_1313_] = i_1314_ + 8192 >> 14;
					}
				}
				int i_1316_ = ((is_1193_[0] * i_1308_ + is_1193_[1] * i_1309_ + is_1193_[2] * i_1310_ + 8192) >> 14);
				int i_1317_ = ((is_1193_[3] * i_1308_ + is_1193_[4] * i_1309_ + is_1193_[5] * i_1310_ + 8192) >> 14);
				int i_1318_ = ((is_1193_[6] * i_1308_ + is_1193_[7] * i_1309_ + is_1193_[8] * i_1310_ + 8192) >> 14);
				i_1316_ += i_1289_;
				i_1317_ += i_1290_;
				i_1318_ += i_1291_;
				for (int i_1319_ = 0; i_1319_ < i_1194_; i_1319_++) {
					int i_1320_ = is[i_1319_];
					if (i_1320_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1321_ = (((OpenGLModel) this).anIntArrayArray10289[i_1320_]);
						for (int i_1322_ = 0; i_1322_ < is_1321_.length; i_1322_++) {
							int i_1323_ = is_1321_[i_1322_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1323_])) != 0)) {
								int i_1324_ = ((is_1311_[0] * (((OpenGLModel) this).anIntArray10336[i_1323_]) + is_1311_[1] * (((OpenGLModel) this).anIntArray10287[i_1323_]) + is_1311_[2] * (((OpenGLModel) this).anIntArray10331[i_1323_]) + 8192) >> 14);
								int i_1325_ = ((is_1311_[3] * (((OpenGLModel) this).anIntArray10336[i_1323_]) + is_1311_[4] * (((OpenGLModel) this).anIntArray10287[i_1323_]) + is_1311_[5] * (((OpenGLModel) this).anIntArray10331[i_1323_]) + 8192) >> 14);
								int i_1326_ = ((is_1311_[6] * (((OpenGLModel) this).anIntArray10336[i_1323_]) + is_1311_[7] * (((OpenGLModel) this).anIntArray10287[i_1323_]) + is_1311_[8] * (((OpenGLModel) this).anIntArray10331[i_1323_]) + 8192) >> 14);
								i_1324_ += i_1316_;
								i_1325_ += i_1317_;
								i_1326_ += i_1318_;
								((OpenGLModel) this).anIntArray10336[i_1323_] = i_1324_;
								((OpenGLModel) this).anIntArray10287[i_1323_] = i_1325_;
								((OpenGLModel) this).anIntArray10331[i_1323_] = i_1326_;
							}
						}
					}
				}
			} else {
				for (int i_1327_ = 0; i_1327_ < i_1194_; i_1327_++) {
					int i_1328_ = is[i_1327_];
					if (i_1328_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1329_ = (((OpenGLModel) this).anIntArrayArray10289[i_1328_]);
						for (int i_1330_ = 0; i_1330_ < is_1329_.length; i_1330_++) {
							int i_1331_ = is_1329_[i_1330_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10290[i_1331_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1331_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1331_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1331_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_1331_] = (((OpenGLModel) this).anIntArray10336[i_1331_]) * i_1189_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_1331_] = (((OpenGLModel) this).anIntArray10287[i_1331_]) * i_1190_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_1331_] = (((OpenGLModel) this).anIntArray10331[i_1331_]) * i_1191_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_1331_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1331_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1331_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1332_ = 0; i_1332_ < i_1194_; i_1332_++) {
					int i_1333_ = is[i_1332_];
					if (i_1333_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1334_ = (((OpenGLModel) this).anIntArrayArray10307[i_1333_]);
						for (int i_1335_ = 0; i_1335_ < is_1334_.length; i_1335_++) {
							int i_1336_ = is_1334_[i_1335_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10286[i_1336_])) != 0)) {
								int i_1337_ = (((((OpenGLModel) this).aByteArray10302[i_1336_]) & 0xff) + i_1189_ * 8);
								if (i_1337_ < 0)
									i_1337_ = 0;
								else if (i_1337_ > 255)
									i_1337_ = 255;
								((OpenGLModel) this).aByteArray10302[i_1336_] = (byte) i_1337_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1338_ = 0; i_1338_ < ((OpenGLModel) this).anInt10333; i_1338_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1338_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1338_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1339_ = 0; i_1339_ < i_1194_; i_1339_++) {
					int i_1340_ = is[i_1339_];
					if (i_1340_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1341_ = (((OpenGLModel) this).anIntArrayArray10307[i_1340_]);
						for (int i_1342_ = 0; i_1342_ < is_1341_.length; i_1342_++) {
							int i_1343_ = is_1341_[i_1342_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1192_ & (((OpenGLModel) this).aShortArray10286[i_1343_])) != 0)) {
								int i_1344_ = ((((OpenGLModel) this).aShortArray10281[i_1343_]) & 0xffff);
								int i_1345_ = i_1344_ >> 10 & 0x3f;
								int i_1346_ = i_1344_ >> 7 & 0x7;
								int i_1347_ = i_1344_ & 0x7f;
								i_1345_ = i_1345_ + i_1189_ & 0x3f;
								i_1346_ += i_1190_ / 4;
								if (i_1346_ < 0)
									i_1346_ = 0;
								else if (i_1346_ > 7)
									i_1346_ = 7;
								i_1347_ += i_1191_;
								if (i_1347_ < 0)
									i_1347_ = 0;
								else if (i_1347_ > 127)
									i_1347_ = 127;
								((OpenGLModel) this).aShortArray10281[i_1343_] = (short) (i_1345_ << 10 | i_1346_ << 7 | i_1347_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1348_ = 0; i_1348_ < ((OpenGLModel) this).anInt10333; i_1348_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1348_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1348_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1349_ = 0; i_1349_ < i_1194_; i_1349_++) {
					int i_1350_ = is[i_1349_];
					if (i_1350_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1351_ = (((OpenGLModel) this).anIntArrayArray10323[i_1350_]);
						for (int i_1352_ = 0; i_1352_ < is_1351_.length; i_1352_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1351_[i_1352_]]);
							((Class150) class150).anInt1698 += i_1189_;
							((Class150) class150).anInt1696 += i_1190_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1353_ = 0; i_1353_ < i_1194_; i_1353_++) {
					int i_1354_ = is[i_1353_];
					if (i_1354_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1355_ = (((OpenGLModel) this).anIntArrayArray10323[i_1354_]);
						for (int i_1356_ = 0; i_1356_ < is_1355_.length; i_1356_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1355_[i_1356_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_1189_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_1190_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1357_ = 0; i_1357_ < i_1194_; i_1357_++) {
					int i_1358_ = is[i_1357_];
					if (i_1358_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1359_ = (((OpenGLModel) this).anIntArrayArray10323[i_1358_]);
						for (int i_1360_ = 0; i_1360_ < is_1359_.length; i_1360_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1359_[i_1360_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_1189_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public Class84[] method1425() {
		return ((OpenGLModel) this).aClass84Array10300;
	}

	public void method1414(int i) {
		int i_1361_ = Class325.anIntArray4103[i];
		int i_1362_ = Class325.anIntArray4105[i];
		for (int i_1363_ = 0; i_1363_ < ((OpenGLModel) this).anInt10285; i_1363_++) {
			int i_1364_ = ((((OpenGLModel) this).anIntArray10331[i_1363_] * i_1361_ + ((OpenGLModel) this).anIntArray10336[i_1363_] * i_1362_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_1363_] = ((((OpenGLModel) this).anIntArray10331[i_1363_] * i_1362_ - ((OpenGLModel) this).anIntArray10336[i_1363_] * i_1361_) >> 14);
			((OpenGLModel) this).anIntArray10336[i_1363_] = i_1364_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	void method1433(int i, int[] is, int i_1365_, int i_1366_, int i_1367_, boolean bool, int i_1368_, int[] is_1369_) {
		int i_1370_ = is.length;
		if (i == 0) {
			i_1365_ <<= 4;
			i_1366_ <<= 4;
			i_1367_ <<= 4;
			int i_1371_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_1372_ = 0; i_1372_ < i_1370_; i_1372_++) {
				int i_1373_ = is[i_1372_];
				if (i_1373_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1374_ = ((OpenGLModel) this).anIntArrayArray10289[i_1373_];
					for (int i_1375_ = 0; i_1375_ < is_1374_.length; i_1375_++) {
						int i_1376_ = is_1374_[i_1375_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1376_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_1376_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_1376_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_1376_]);
							i_1371_++;
						}
					}
				}
			}
			if (i_1371_ > 0) {
				anInt10342 = anInt10342 / i_1371_ + i_1365_;
				anInt10310 = anInt10310 / i_1371_ + i_1366_;
				anInt10344 = anInt10344 / i_1371_ + i_1367_;
				aBool10345 = true;
			} else {
				anInt10342 = i_1365_;
				anInt10310 = i_1366_;
				anInt10344 = i_1367_;
			}
		} else if (i == 1) {
			if (is_1369_ != null) {
				int i_1377_ = ((is_1369_[0] * i_1365_ + is_1369_[1] * i_1366_ + is_1369_[2] * i_1367_ + 8192) >> 14);
				int i_1378_ = ((is_1369_[3] * i_1365_ + is_1369_[4] * i_1366_ + is_1369_[5] * i_1367_ + 8192) >> 14);
				int i_1379_ = ((is_1369_[6] * i_1365_ + is_1369_[7] * i_1366_ + is_1369_[8] * i_1367_ + 8192) >> 14);
				i_1365_ = i_1377_;
				i_1366_ = i_1378_;
				i_1367_ = i_1379_;
			}
			i_1365_ <<= 4;
			i_1366_ <<= 4;
			i_1367_ <<= 4;
			for (int i_1380_ = 0; i_1380_ < i_1370_; i_1380_++) {
				int i_1381_ = is[i_1380_];
				if (i_1381_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1382_ = ((OpenGLModel) this).anIntArrayArray10289[i_1381_];
					for (int i_1383_ = 0; i_1383_ < is_1382_.length; i_1383_++) {
						int i_1384_ = is_1382_[i_1383_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1384_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_1384_] += i_1365_;
							((OpenGLModel) this).anIntArray10287[i_1384_] += i_1366_;
							((OpenGLModel) this).anIntArray10331[i_1384_] += i_1367_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1369_ != null) {
				int i_1385_ = is_1369_[9] << 4;
				int i_1386_ = is_1369_[10] << 4;
				int i_1387_ = is_1369_[11] << 4;
				int i_1388_ = is_1369_[12] << 4;
				int i_1389_ = is_1369_[13] << 4;
				int i_1390_ = is_1369_[14] << 4;
				if (aBool10345) {
					int i_1391_ = ((is_1369_[0] * anInt10342 + is_1369_[3] * anInt10310 + is_1369_[6] * anInt10344 + 8192) >> 14);
					int i_1392_ = ((is_1369_[1] * anInt10342 + is_1369_[4] * anInt10310 + is_1369_[7] * anInt10344 + 8192) >> 14);
					int i_1393_ = ((is_1369_[2] * anInt10342 + is_1369_[5] * anInt10310 + is_1369_[8] * anInt10344 + 8192) >> 14);
					i_1391_ += i_1388_;
					i_1392_ += i_1389_;
					i_1393_ += i_1390_;
					anInt10342 = i_1391_;
					anInt10310 = i_1392_;
					anInt10344 = i_1393_;
					aBool10345 = false;
				}
				int[] is_1394_ = new int[9];
				int i_1395_ = Class325.anIntArray4105[i_1365_];
				int i_1396_ = Class325.anIntArray4103[i_1365_];
				int i_1397_ = Class325.anIntArray4105[i_1366_];
				int i_1398_ = Class325.anIntArray4103[i_1366_];
				int i_1399_ = Class325.anIntArray4105[i_1367_];
				int i_1400_ = Class325.anIntArray4103[i_1367_];
				int i_1401_ = i_1396_ * i_1399_ + 8192 >> 14;
				int i_1402_ = i_1396_ * i_1400_ + 8192 >> 14;
				is_1394_[0] = i_1397_ * i_1399_ + i_1398_ * i_1402_ + 8192 >> 14;
				is_1394_[1] = -i_1397_ * i_1400_ + i_1398_ * i_1401_ + 8192 >> 14;
				is_1394_[2] = i_1398_ * i_1395_ + 8192 >> 14;
				is_1394_[3] = i_1395_ * i_1400_ + 8192 >> 14;
				is_1394_[4] = i_1395_ * i_1399_ + 8192 >> 14;
				is_1394_[5] = -i_1396_;
				is_1394_[6] = -i_1398_ * i_1399_ + i_1397_ * i_1402_ + 8192 >> 14;
				is_1394_[7] = i_1398_ * i_1400_ + i_1397_ * i_1401_ + 8192 >> 14;
				is_1394_[8] = i_1397_ * i_1395_ + 8192 >> 14;
				int i_1403_ = ((is_1394_[0] * -anInt10342 + is_1394_[1] * -anInt10310 + is_1394_[2] * -anInt10344 + 8192) >> 14);
				int i_1404_ = ((is_1394_[3] * -anInt10342 + is_1394_[4] * -anInt10310 + is_1394_[5] * -anInt10344 + 8192) >> 14);
				int i_1405_ = ((is_1394_[6] * -anInt10342 + is_1394_[7] * -anInt10310 + is_1394_[8] * -anInt10344 + 8192) >> 14);
				int i_1406_ = i_1403_ + anInt10342;
				int i_1407_ = i_1404_ + anInt10310;
				int i_1408_ = i_1405_ + anInt10344;
				int[] is_1409_ = new int[9];
				for (int i_1410_ = 0; i_1410_ < 3; i_1410_++) {
					for (int i_1411_ = 0; i_1411_ < 3; i_1411_++) {
						int i_1412_ = 0;
						for (int i_1413_ = 0; i_1413_ < 3; i_1413_++)
							i_1412_ += (is_1394_[i_1410_ * 3 + i_1413_] * is_1369_[i_1411_ * 3 + i_1413_]);
						is_1409_[i_1410_ * 3 + i_1411_] = i_1412_ + 8192 >> 14;
					}
				}
				int i_1414_ = ((is_1394_[0] * i_1388_ + is_1394_[1] * i_1389_ + is_1394_[2] * i_1390_ + 8192) >> 14);
				int i_1415_ = ((is_1394_[3] * i_1388_ + is_1394_[4] * i_1389_ + is_1394_[5] * i_1390_ + 8192) >> 14);
				int i_1416_ = ((is_1394_[6] * i_1388_ + is_1394_[7] * i_1389_ + is_1394_[8] * i_1390_ + 8192) >> 14);
				i_1414_ += i_1406_;
				i_1415_ += i_1407_;
				i_1416_ += i_1408_;
				int[] is_1417_ = new int[9];
				for (int i_1418_ = 0; i_1418_ < 3; i_1418_++) {
					for (int i_1419_ = 0; i_1419_ < 3; i_1419_++) {
						int i_1420_ = 0;
						for (int i_1421_ = 0; i_1421_ < 3; i_1421_++)
							i_1420_ += (is_1369_[i_1418_ * 3 + i_1421_] * is_1409_[i_1419_ + i_1421_ * 3]);
						is_1417_[i_1418_ * 3 + i_1419_] = i_1420_ + 8192 >> 14;
					}
				}
				int i_1422_ = ((is_1369_[0] * i_1414_ + is_1369_[1] * i_1415_ + is_1369_[2] * i_1416_ + 8192) >> 14);
				int i_1423_ = ((is_1369_[3] * i_1414_ + is_1369_[4] * i_1415_ + is_1369_[5] * i_1416_ + 8192) >> 14);
				int i_1424_ = ((is_1369_[6] * i_1414_ + is_1369_[7] * i_1415_ + is_1369_[8] * i_1416_ + 8192) >> 14);
				i_1422_ += i_1385_;
				i_1423_ += i_1386_;
				i_1424_ += i_1387_;
				for (int i_1425_ = 0; i_1425_ < i_1370_; i_1425_++) {
					int i_1426_ = is[i_1425_];
					if (i_1426_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1427_ = (((OpenGLModel) this).anIntArrayArray10289[i_1426_]);
						for (int i_1428_ = 0; i_1428_ < is_1427_.length; i_1428_++) {
							int i_1429_ = is_1427_[i_1428_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1429_])) != 0)) {
								int i_1430_ = ((is_1417_[0] * (((OpenGLModel) this).anIntArray10336[i_1429_]) + is_1417_[1] * (((OpenGLModel) this).anIntArray10287[i_1429_]) + is_1417_[2] * (((OpenGLModel) this).anIntArray10331[i_1429_]) + 8192) >> 14);
								int i_1431_ = ((is_1417_[3] * (((OpenGLModel) this).anIntArray10336[i_1429_]) + is_1417_[4] * (((OpenGLModel) this).anIntArray10287[i_1429_]) + is_1417_[5] * (((OpenGLModel) this).anIntArray10331[i_1429_]) + 8192) >> 14);
								int i_1432_ = ((is_1417_[6] * (((OpenGLModel) this).anIntArray10336[i_1429_]) + is_1417_[7] * (((OpenGLModel) this).anIntArray10287[i_1429_]) + is_1417_[8] * (((OpenGLModel) this).anIntArray10331[i_1429_]) + 8192) >> 14);
								i_1430_ += i_1422_;
								i_1431_ += i_1423_;
								i_1432_ += i_1424_;
								((OpenGLModel) this).anIntArray10336[i_1429_] = i_1430_;
								((OpenGLModel) this).anIntArray10287[i_1429_] = i_1431_;
								((OpenGLModel) this).anIntArray10331[i_1429_] = i_1432_;
							}
						}
					}
				}
			} else {
				for (int i_1433_ = 0; i_1433_ < i_1370_; i_1433_++) {
					int i_1434_ = is[i_1433_];
					if (i_1434_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1435_ = (((OpenGLModel) this).anIntArrayArray10289[i_1434_]);
						for (int i_1436_ = 0; i_1436_ < is_1435_.length; i_1436_++) {
							int i_1437_ = is_1435_[i_1436_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1437_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1437_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1437_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1437_] -= anInt10344;
								if (i_1367_ != 0) {
									int i_1438_ = Class325.anIntArray4103[i_1367_];
									int i_1439_ = Class325.anIntArray4105[i_1367_];
									int i_1440_ = (((((OpenGLModel) this).anIntArray10287[i_1437_]) * i_1438_ + (((OpenGLModel) this).anIntArray10336[i_1437_]) * i_1439_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_1437_] = (((((OpenGLModel) this).anIntArray10287[i_1437_]) * i_1439_) - ((((OpenGLModel) this).anIntArray10336[i_1437_]) * i_1438_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1437_] = i_1440_;
								}
								if (i_1365_ != 0) {
									int i_1441_ = Class325.anIntArray4103[i_1365_];
									int i_1442_ = Class325.anIntArray4105[i_1365_];
									int i_1443_ = (((((OpenGLModel) this).anIntArray10287[i_1437_]) * i_1442_ - (((OpenGLModel) this).anIntArray10331[i_1437_]) * i_1441_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1437_] = (((((OpenGLModel) this).anIntArray10287[i_1437_]) * i_1441_) + ((((OpenGLModel) this).anIntArray10331[i_1437_]) * i_1442_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_1437_] = i_1443_;
								}
								if (i_1366_ != 0) {
									int i_1444_ = Class325.anIntArray4103[i_1366_];
									int i_1445_ = Class325.anIntArray4105[i_1366_];
									int i_1446_ = (((((OpenGLModel) this).anIntArray10331[i_1437_]) * i_1444_ + (((OpenGLModel) this).anIntArray10336[i_1437_]) * i_1445_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1437_] = (((((OpenGLModel) this).anIntArray10331[i_1437_]) * i_1445_) - ((((OpenGLModel) this).anIntArray10336[i_1437_]) * i_1444_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1437_] = i_1446_;
								}
								((OpenGLModel) this).anIntArray10336[i_1437_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1437_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1437_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_1447_ = 0; i_1447_ < i_1370_; i_1447_++) {
						int i_1448_ = is[i_1447_];
						if (i_1448_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_1449_ = (((OpenGLModel) this).anIntArrayArray10289[i_1448_]);
							for (int i_1450_ = 0; i_1450_ < is_1449_.length; i_1450_++) {
								int i_1451_ = is_1449_[i_1450_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || (i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1451_])) != 0) {
									int i_1452_ = (((OpenGLModel) this).anIntArray10329[i_1451_]);
									int i_1453_ = (((OpenGLModel) this).anIntArray10329[i_1451_ + 1]);
									for (int i_1454_ = i_1452_; (i_1454_ < i_1453_ && ((((OpenGLModel) this).aShortArray10330[i_1454_]) != 0)); i_1454_++) {
										int i_1455_ = (((((OpenGLModel) this).aShortArray10330[i_1454_]) & 0xffff) - 1);
										if (i_1367_ != 0) {
											int i_1456_ = (Class325.anIntArray4103[i_1367_]);
											int i_1457_ = (Class325.anIntArray4105[i_1367_]);
											int i_1458_ = (((((OpenGLModel) this).aShortArray10293[i_1455_]) * i_1456_ + (((OpenGLModel) this).aShortArray10292[i_1455_]) * i_1457_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1455_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1455_]) * i_1457_) - ((((OpenGLModel) this).aShortArray10292[i_1455_]) * i_1456_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1455_] = (short) i_1458_;
										}
										if (i_1365_ != 0) {
											int i_1459_ = (Class325.anIntArray4103[i_1365_]);
											int i_1460_ = (Class325.anIntArray4105[i_1365_]);
											int i_1461_ = (((((OpenGLModel) this).aShortArray10293[i_1455_]) * i_1460_ - (((OpenGLModel) this).aShortArray10288[i_1455_]) * i_1459_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1455_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1455_]) * i_1459_) + ((((OpenGLModel) this).aShortArray10288[i_1455_]) * i_1460_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1455_] = (short) i_1461_;
										}
										if (i_1366_ != 0) {
											int i_1462_ = (Class325.anIntArray4103[i_1366_]);
											int i_1463_ = (Class325.anIntArray4105[i_1366_]);
											int i_1464_ = (((((OpenGLModel) this).aShortArray10288[i_1455_]) * i_1462_ + (((OpenGLModel) this).aShortArray10292[i_1455_]) * i_1463_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1455_] = (short) ((((((OpenGLModel) this).aShortArray10288[i_1455_]) * i_1463_) - ((((OpenGLModel) this).aShortArray10292[i_1455_]) * i_1462_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1455_] = (short) i_1464_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_1369_ != null) {
				int i_1465_ = is_1369_[9] << 4;
				int i_1466_ = is_1369_[10] << 4;
				int i_1467_ = is_1369_[11] << 4;
				int i_1468_ = is_1369_[12] << 4;
				int i_1469_ = is_1369_[13] << 4;
				int i_1470_ = is_1369_[14] << 4;
				if (aBool10345) {
					int i_1471_ = ((is_1369_[0] * anInt10342 + is_1369_[3] * anInt10310 + is_1369_[6] * anInt10344 + 8192) >> 14);
					int i_1472_ = ((is_1369_[1] * anInt10342 + is_1369_[4] * anInt10310 + is_1369_[7] * anInt10344 + 8192) >> 14);
					int i_1473_ = ((is_1369_[2] * anInt10342 + is_1369_[5] * anInt10310 + is_1369_[8] * anInt10344 + 8192) >> 14);
					i_1471_ += i_1468_;
					i_1472_ += i_1469_;
					i_1473_ += i_1470_;
					anInt10342 = i_1471_;
					anInt10310 = i_1472_;
					anInt10344 = i_1473_;
					aBool10345 = false;
				}
				int i_1474_ = i_1365_ << 15 >> 7;
				int i_1475_ = i_1366_ << 15 >> 7;
				int i_1476_ = i_1367_ << 15 >> 7;
				int i_1477_ = i_1474_ * -anInt10342 + 8192 >> 14;
				int i_1478_ = i_1475_ * -anInt10310 + 8192 >> 14;
				int i_1479_ = i_1476_ * -anInt10344 + 8192 >> 14;
				int i_1480_ = i_1477_ + anInt10342;
				int i_1481_ = i_1478_ + anInt10310;
				int i_1482_ = i_1479_ + anInt10344;
				int[] is_1483_ = new int[9];
				is_1483_[0] = i_1474_ * is_1369_[0] + 8192 >> 14;
				is_1483_[1] = i_1474_ * is_1369_[3] + 8192 >> 14;
				is_1483_[2] = i_1474_ * is_1369_[6] + 8192 >> 14;
				is_1483_[3] = i_1475_ * is_1369_[1] + 8192 >> 14;
				is_1483_[4] = i_1475_ * is_1369_[4] + 8192 >> 14;
				is_1483_[5] = i_1475_ * is_1369_[7] + 8192 >> 14;
				is_1483_[6] = i_1476_ * is_1369_[2] + 8192 >> 14;
				is_1483_[7] = i_1476_ * is_1369_[5] + 8192 >> 14;
				is_1483_[8] = i_1476_ * is_1369_[8] + 8192 >> 14;
				int i_1484_ = i_1474_ * i_1468_ + 8192 >> 14;
				int i_1485_ = i_1475_ * i_1469_ + 8192 >> 14;
				int i_1486_ = i_1476_ * i_1470_ + 8192 >> 14;
				i_1484_ += i_1480_;
				i_1485_ += i_1481_;
				i_1486_ += i_1482_;
				int[] is_1487_ = new int[9];
				for (int i_1488_ = 0; i_1488_ < 3; i_1488_++) {
					for (int i_1489_ = 0; i_1489_ < 3; i_1489_++) {
						int i_1490_ = 0;
						for (int i_1491_ = 0; i_1491_ < 3; i_1491_++)
							i_1490_ += (is_1369_[i_1488_ * 3 + i_1491_] * is_1483_[i_1489_ + i_1491_ * 3]);
						is_1487_[i_1488_ * 3 + i_1489_] = i_1490_ + 8192 >> 14;
					}
				}
				int i_1492_ = ((is_1369_[0] * i_1484_ + is_1369_[1] * i_1485_ + is_1369_[2] * i_1486_ + 8192) >> 14);
				int i_1493_ = ((is_1369_[3] * i_1484_ + is_1369_[4] * i_1485_ + is_1369_[5] * i_1486_ + 8192) >> 14);
				int i_1494_ = ((is_1369_[6] * i_1484_ + is_1369_[7] * i_1485_ + is_1369_[8] * i_1486_ + 8192) >> 14);
				i_1492_ += i_1465_;
				i_1493_ += i_1466_;
				i_1494_ += i_1467_;
				for (int i_1495_ = 0; i_1495_ < i_1370_; i_1495_++) {
					int i_1496_ = is[i_1495_];
					if (i_1496_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1497_ = (((OpenGLModel) this).anIntArrayArray10289[i_1496_]);
						for (int i_1498_ = 0; i_1498_ < is_1497_.length; i_1498_++) {
							int i_1499_ = is_1497_[i_1498_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1499_])) != 0)) {
								int i_1500_ = ((is_1487_[0] * (((OpenGLModel) this).anIntArray10336[i_1499_]) + is_1487_[1] * (((OpenGLModel) this).anIntArray10287[i_1499_]) + is_1487_[2] * (((OpenGLModel) this).anIntArray10331[i_1499_]) + 8192) >> 14);
								int i_1501_ = ((is_1487_[3] * (((OpenGLModel) this).anIntArray10336[i_1499_]) + is_1487_[4] * (((OpenGLModel) this).anIntArray10287[i_1499_]) + is_1487_[5] * (((OpenGLModel) this).anIntArray10331[i_1499_]) + 8192) >> 14);
								int i_1502_ = ((is_1487_[6] * (((OpenGLModel) this).anIntArray10336[i_1499_]) + is_1487_[7] * (((OpenGLModel) this).anIntArray10287[i_1499_]) + is_1487_[8] * (((OpenGLModel) this).anIntArray10331[i_1499_]) + 8192) >> 14);
								i_1500_ += i_1492_;
								i_1501_ += i_1493_;
								i_1502_ += i_1494_;
								((OpenGLModel) this).anIntArray10336[i_1499_] = i_1500_;
								((OpenGLModel) this).anIntArray10287[i_1499_] = i_1501_;
								((OpenGLModel) this).anIntArray10331[i_1499_] = i_1502_;
							}
						}
					}
				}
			} else {
				for (int i_1503_ = 0; i_1503_ < i_1370_; i_1503_++) {
					int i_1504_ = is[i_1503_];
					if (i_1504_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1505_ = (((OpenGLModel) this).anIntArrayArray10289[i_1504_]);
						for (int i_1506_ = 0; i_1506_ < is_1505_.length; i_1506_++) {
							int i_1507_ = is_1505_[i_1506_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10290[i_1507_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1507_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1507_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1507_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_1507_] = (((OpenGLModel) this).anIntArray10336[i_1507_]) * i_1365_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_1507_] = (((OpenGLModel) this).anIntArray10287[i_1507_]) * i_1366_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_1507_] = (((OpenGLModel) this).anIntArray10331[i_1507_]) * i_1367_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_1507_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1507_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1507_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1508_ = 0; i_1508_ < i_1370_; i_1508_++) {
					int i_1509_ = is[i_1508_];
					if (i_1509_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1510_ = (((OpenGLModel) this).anIntArrayArray10307[i_1509_]);
						for (int i_1511_ = 0; i_1511_ < is_1510_.length; i_1511_++) {
							int i_1512_ = is_1510_[i_1511_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10286[i_1512_])) != 0)) {
								int i_1513_ = (((((OpenGLModel) this).aByteArray10302[i_1512_]) & 0xff) + i_1365_ * 8);
								if (i_1513_ < 0)
									i_1513_ = 0;
								else if (i_1513_ > 255)
									i_1513_ = 255;
								((OpenGLModel) this).aByteArray10302[i_1512_] = (byte) i_1513_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1514_ = 0; i_1514_ < ((OpenGLModel) this).anInt10333; i_1514_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1514_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1514_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1515_ = 0; i_1515_ < i_1370_; i_1515_++) {
					int i_1516_ = is[i_1515_];
					if (i_1516_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1517_ = (((OpenGLModel) this).anIntArrayArray10307[i_1516_]);
						for (int i_1518_ = 0; i_1518_ < is_1517_.length; i_1518_++) {
							int i_1519_ = is_1517_[i_1518_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1368_ & (((OpenGLModel) this).aShortArray10286[i_1519_])) != 0)) {
								int i_1520_ = ((((OpenGLModel) this).aShortArray10281[i_1519_]) & 0xffff);
								int i_1521_ = i_1520_ >> 10 & 0x3f;
								int i_1522_ = i_1520_ >> 7 & 0x7;
								int i_1523_ = i_1520_ & 0x7f;
								i_1521_ = i_1521_ + i_1365_ & 0x3f;
								i_1522_ += i_1366_ / 4;
								if (i_1522_ < 0)
									i_1522_ = 0;
								else if (i_1522_ > 7)
									i_1522_ = 7;
								i_1523_ += i_1367_;
								if (i_1523_ < 0)
									i_1523_ = 0;
								else if (i_1523_ > 127)
									i_1523_ = 127;
								((OpenGLModel) this).aShortArray10281[i_1519_] = (short) (i_1521_ << 10 | i_1522_ << 7 | i_1523_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1524_ = 0; i_1524_ < ((OpenGLModel) this).anInt10333; i_1524_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1524_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1524_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1525_ = 0; i_1525_ < i_1370_; i_1525_++) {
					int i_1526_ = is[i_1525_];
					if (i_1526_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1527_ = (((OpenGLModel) this).anIntArrayArray10323[i_1526_]);
						for (int i_1528_ = 0; i_1528_ < is_1527_.length; i_1528_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1527_[i_1528_]]);
							((Class150) class150).anInt1698 += i_1365_;
							((Class150) class150).anInt1696 += i_1366_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1529_ = 0; i_1529_ < i_1370_; i_1529_++) {
					int i_1530_ = is[i_1529_];
					if (i_1530_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1531_ = (((OpenGLModel) this).anIntArrayArray10323[i_1530_]);
						for (int i_1532_ = 0; i_1532_ < is_1531_.length; i_1532_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1531_[i_1532_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_1365_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_1366_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1533_ = 0; i_1533_ < i_1370_; i_1533_++) {
					int i_1534_ = is[i_1533_];
					if (i_1534_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1535_ = (((OpenGLModel) this).anIntArrayArray10323[i_1534_]);
						for (int i_1536_ = 0; i_1536_ < is_1535_.length; i_1536_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1535_[i_1536_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_1365_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method1449() {
		/* empty */
	}

	void method1437(int i, int[] is, int i_1537_, int i_1538_, int i_1539_, boolean bool, int i_1540_, int[] is_1541_) {
		int i_1542_ = is.length;
		if (i == 0) {
			i_1537_ <<= 4;
			i_1538_ <<= 4;
			i_1539_ <<= 4;
			int i_1543_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_1544_ = 0; i_1544_ < i_1542_; i_1544_++) {
				int i_1545_ = is[i_1544_];
				if (i_1545_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1546_ = ((OpenGLModel) this).anIntArrayArray10289[i_1545_];
					for (int i_1547_ = 0; i_1547_ < is_1546_.length; i_1547_++) {
						int i_1548_ = is_1546_[i_1547_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1548_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_1548_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_1548_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_1548_]);
							i_1543_++;
						}
					}
				}
			}
			if (i_1543_ > 0) {
				anInt10342 = anInt10342 / i_1543_ + i_1537_;
				anInt10310 = anInt10310 / i_1543_ + i_1538_;
				anInt10344 = anInt10344 / i_1543_ + i_1539_;
				aBool10345 = true;
			} else {
				anInt10342 = i_1537_;
				anInt10310 = i_1538_;
				anInt10344 = i_1539_;
			}
		} else if (i == 1) {
			if (is_1541_ != null) {
				int i_1549_ = ((is_1541_[0] * i_1537_ + is_1541_[1] * i_1538_ + is_1541_[2] * i_1539_ + 8192) >> 14);
				int i_1550_ = ((is_1541_[3] * i_1537_ + is_1541_[4] * i_1538_ + is_1541_[5] * i_1539_ + 8192) >> 14);
				int i_1551_ = ((is_1541_[6] * i_1537_ + is_1541_[7] * i_1538_ + is_1541_[8] * i_1539_ + 8192) >> 14);
				i_1537_ = i_1549_;
				i_1538_ = i_1550_;
				i_1539_ = i_1551_;
			}
			i_1537_ <<= 4;
			i_1538_ <<= 4;
			i_1539_ <<= 4;
			for (int i_1552_ = 0; i_1552_ < i_1542_; i_1552_++) {
				int i_1553_ = is[i_1552_];
				if (i_1553_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1554_ = ((OpenGLModel) this).anIntArrayArray10289[i_1553_];
					for (int i_1555_ = 0; i_1555_ < is_1554_.length; i_1555_++) {
						int i_1556_ = is_1554_[i_1555_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1556_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_1556_] += i_1537_;
							((OpenGLModel) this).anIntArray10287[i_1556_] += i_1538_;
							((OpenGLModel) this).anIntArray10331[i_1556_] += i_1539_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1541_ != null) {
				int i_1557_ = is_1541_[9] << 4;
				int i_1558_ = is_1541_[10] << 4;
				int i_1559_ = is_1541_[11] << 4;
				int i_1560_ = is_1541_[12] << 4;
				int i_1561_ = is_1541_[13] << 4;
				int i_1562_ = is_1541_[14] << 4;
				if (aBool10345) {
					int i_1563_ = ((is_1541_[0] * anInt10342 + is_1541_[3] * anInt10310 + is_1541_[6] * anInt10344 + 8192) >> 14);
					int i_1564_ = ((is_1541_[1] * anInt10342 + is_1541_[4] * anInt10310 + is_1541_[7] * anInt10344 + 8192) >> 14);
					int i_1565_ = ((is_1541_[2] * anInt10342 + is_1541_[5] * anInt10310 + is_1541_[8] * anInt10344 + 8192) >> 14);
					i_1563_ += i_1560_;
					i_1564_ += i_1561_;
					i_1565_ += i_1562_;
					anInt10342 = i_1563_;
					anInt10310 = i_1564_;
					anInt10344 = i_1565_;
					aBool10345 = false;
				}
				int[] is_1566_ = new int[9];
				int i_1567_ = Class325.anIntArray4105[i_1537_];
				int i_1568_ = Class325.anIntArray4103[i_1537_];
				int i_1569_ = Class325.anIntArray4105[i_1538_];
				int i_1570_ = Class325.anIntArray4103[i_1538_];
				int i_1571_ = Class325.anIntArray4105[i_1539_];
				int i_1572_ = Class325.anIntArray4103[i_1539_];
				int i_1573_ = i_1568_ * i_1571_ + 8192 >> 14;
				int i_1574_ = i_1568_ * i_1572_ + 8192 >> 14;
				is_1566_[0] = i_1569_ * i_1571_ + i_1570_ * i_1574_ + 8192 >> 14;
				is_1566_[1] = -i_1569_ * i_1572_ + i_1570_ * i_1573_ + 8192 >> 14;
				is_1566_[2] = i_1570_ * i_1567_ + 8192 >> 14;
				is_1566_[3] = i_1567_ * i_1572_ + 8192 >> 14;
				is_1566_[4] = i_1567_ * i_1571_ + 8192 >> 14;
				is_1566_[5] = -i_1568_;
				is_1566_[6] = -i_1570_ * i_1571_ + i_1569_ * i_1574_ + 8192 >> 14;
				is_1566_[7] = i_1570_ * i_1572_ + i_1569_ * i_1573_ + 8192 >> 14;
				is_1566_[8] = i_1569_ * i_1567_ + 8192 >> 14;
				int i_1575_ = ((is_1566_[0] * -anInt10342 + is_1566_[1] * -anInt10310 + is_1566_[2] * -anInt10344 + 8192) >> 14);
				int i_1576_ = ((is_1566_[3] * -anInt10342 + is_1566_[4] * -anInt10310 + is_1566_[5] * -anInt10344 + 8192) >> 14);
				int i_1577_ = ((is_1566_[6] * -anInt10342 + is_1566_[7] * -anInt10310 + is_1566_[8] * -anInt10344 + 8192) >> 14);
				int i_1578_ = i_1575_ + anInt10342;
				int i_1579_ = i_1576_ + anInt10310;
				int i_1580_ = i_1577_ + anInt10344;
				int[] is_1581_ = new int[9];
				for (int i_1582_ = 0; i_1582_ < 3; i_1582_++) {
					for (int i_1583_ = 0; i_1583_ < 3; i_1583_++) {
						int i_1584_ = 0;
						for (int i_1585_ = 0; i_1585_ < 3; i_1585_++)
							i_1584_ += (is_1566_[i_1582_ * 3 + i_1585_] * is_1541_[i_1583_ * 3 + i_1585_]);
						is_1581_[i_1582_ * 3 + i_1583_] = i_1584_ + 8192 >> 14;
					}
				}
				int i_1586_ = ((is_1566_[0] * i_1560_ + is_1566_[1] * i_1561_ + is_1566_[2] * i_1562_ + 8192) >> 14);
				int i_1587_ = ((is_1566_[3] * i_1560_ + is_1566_[4] * i_1561_ + is_1566_[5] * i_1562_ + 8192) >> 14);
				int i_1588_ = ((is_1566_[6] * i_1560_ + is_1566_[7] * i_1561_ + is_1566_[8] * i_1562_ + 8192) >> 14);
				i_1586_ += i_1578_;
				i_1587_ += i_1579_;
				i_1588_ += i_1580_;
				int[] is_1589_ = new int[9];
				for (int i_1590_ = 0; i_1590_ < 3; i_1590_++) {
					for (int i_1591_ = 0; i_1591_ < 3; i_1591_++) {
						int i_1592_ = 0;
						for (int i_1593_ = 0; i_1593_ < 3; i_1593_++)
							i_1592_ += (is_1541_[i_1590_ * 3 + i_1593_] * is_1581_[i_1591_ + i_1593_ * 3]);
						is_1589_[i_1590_ * 3 + i_1591_] = i_1592_ + 8192 >> 14;
					}
				}
				int i_1594_ = ((is_1541_[0] * i_1586_ + is_1541_[1] * i_1587_ + is_1541_[2] * i_1588_ + 8192) >> 14);
				int i_1595_ = ((is_1541_[3] * i_1586_ + is_1541_[4] * i_1587_ + is_1541_[5] * i_1588_ + 8192) >> 14);
				int i_1596_ = ((is_1541_[6] * i_1586_ + is_1541_[7] * i_1587_ + is_1541_[8] * i_1588_ + 8192) >> 14);
				i_1594_ += i_1557_;
				i_1595_ += i_1558_;
				i_1596_ += i_1559_;
				for (int i_1597_ = 0; i_1597_ < i_1542_; i_1597_++) {
					int i_1598_ = is[i_1597_];
					if (i_1598_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1599_ = (((OpenGLModel) this).anIntArrayArray10289[i_1598_]);
						for (int i_1600_ = 0; i_1600_ < is_1599_.length; i_1600_++) {
							int i_1601_ = is_1599_[i_1600_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1601_])) != 0)) {
								int i_1602_ = ((is_1589_[0] * (((OpenGLModel) this).anIntArray10336[i_1601_]) + is_1589_[1] * (((OpenGLModel) this).anIntArray10287[i_1601_]) + is_1589_[2] * (((OpenGLModel) this).anIntArray10331[i_1601_]) + 8192) >> 14);
								int i_1603_ = ((is_1589_[3] * (((OpenGLModel) this).anIntArray10336[i_1601_]) + is_1589_[4] * (((OpenGLModel) this).anIntArray10287[i_1601_]) + is_1589_[5] * (((OpenGLModel) this).anIntArray10331[i_1601_]) + 8192) >> 14);
								int i_1604_ = ((is_1589_[6] * (((OpenGLModel) this).anIntArray10336[i_1601_]) + is_1589_[7] * (((OpenGLModel) this).anIntArray10287[i_1601_]) + is_1589_[8] * (((OpenGLModel) this).anIntArray10331[i_1601_]) + 8192) >> 14);
								i_1602_ += i_1594_;
								i_1603_ += i_1595_;
								i_1604_ += i_1596_;
								((OpenGLModel) this).anIntArray10336[i_1601_] = i_1602_;
								((OpenGLModel) this).anIntArray10287[i_1601_] = i_1603_;
								((OpenGLModel) this).anIntArray10331[i_1601_] = i_1604_;
							}
						}
					}
				}
			} else {
				for (int i_1605_ = 0; i_1605_ < i_1542_; i_1605_++) {
					int i_1606_ = is[i_1605_];
					if (i_1606_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1607_ = (((OpenGLModel) this).anIntArrayArray10289[i_1606_]);
						for (int i_1608_ = 0; i_1608_ < is_1607_.length; i_1608_++) {
							int i_1609_ = is_1607_[i_1608_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1609_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1609_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1609_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1609_] -= anInt10344;
								if (i_1539_ != 0) {
									int i_1610_ = Class325.anIntArray4103[i_1539_];
									int i_1611_ = Class325.anIntArray4105[i_1539_];
									int i_1612_ = (((((OpenGLModel) this).anIntArray10287[i_1609_]) * i_1610_ + (((OpenGLModel) this).anIntArray10336[i_1609_]) * i_1611_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_1609_] = (((((OpenGLModel) this).anIntArray10287[i_1609_]) * i_1611_) - ((((OpenGLModel) this).anIntArray10336[i_1609_]) * i_1610_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1609_] = i_1612_;
								}
								if (i_1537_ != 0) {
									int i_1613_ = Class325.anIntArray4103[i_1537_];
									int i_1614_ = Class325.anIntArray4105[i_1537_];
									int i_1615_ = (((((OpenGLModel) this).anIntArray10287[i_1609_]) * i_1614_ - (((OpenGLModel) this).anIntArray10331[i_1609_]) * i_1613_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1609_] = (((((OpenGLModel) this).anIntArray10287[i_1609_]) * i_1613_) + ((((OpenGLModel) this).anIntArray10331[i_1609_]) * i_1614_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_1609_] = i_1615_;
								}
								if (i_1538_ != 0) {
									int i_1616_ = Class325.anIntArray4103[i_1538_];
									int i_1617_ = Class325.anIntArray4105[i_1538_];
									int i_1618_ = (((((OpenGLModel) this).anIntArray10331[i_1609_]) * i_1616_ + (((OpenGLModel) this).anIntArray10336[i_1609_]) * i_1617_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1609_] = (((((OpenGLModel) this).anIntArray10331[i_1609_]) * i_1617_) - ((((OpenGLModel) this).anIntArray10336[i_1609_]) * i_1616_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1609_] = i_1618_;
								}
								((OpenGLModel) this).anIntArray10336[i_1609_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1609_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1609_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_1619_ = 0; i_1619_ < i_1542_; i_1619_++) {
						int i_1620_ = is[i_1619_];
						if (i_1620_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_1621_ = (((OpenGLModel) this).anIntArrayArray10289[i_1620_]);
							for (int i_1622_ = 0; i_1622_ < is_1621_.length; i_1622_++) {
								int i_1623_ = is_1621_[i_1622_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || (i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1623_])) != 0) {
									int i_1624_ = (((OpenGLModel) this).anIntArray10329[i_1623_]);
									int i_1625_ = (((OpenGLModel) this).anIntArray10329[i_1623_ + 1]);
									for (int i_1626_ = i_1624_; (i_1626_ < i_1625_ && ((((OpenGLModel) this).aShortArray10330[i_1626_]) != 0)); i_1626_++) {
										int i_1627_ = (((((OpenGLModel) this).aShortArray10330[i_1626_]) & 0xffff) - 1);
										if (i_1539_ != 0) {
											int i_1628_ = (Class325.anIntArray4103[i_1539_]);
											int i_1629_ = (Class325.anIntArray4105[i_1539_]);
											int i_1630_ = (((((OpenGLModel) this).aShortArray10293[i_1627_]) * i_1628_ + (((OpenGLModel) this).aShortArray10292[i_1627_]) * i_1629_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1627_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1627_]) * i_1629_) - ((((OpenGLModel) this).aShortArray10292[i_1627_]) * i_1628_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1627_] = (short) i_1630_;
										}
										if (i_1537_ != 0) {
											int i_1631_ = (Class325.anIntArray4103[i_1537_]);
											int i_1632_ = (Class325.anIntArray4105[i_1537_]);
											int i_1633_ = (((((OpenGLModel) this).aShortArray10293[i_1627_]) * i_1632_ - (((OpenGLModel) this).aShortArray10288[i_1627_]) * i_1631_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1627_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1627_]) * i_1631_) + ((((OpenGLModel) this).aShortArray10288[i_1627_]) * i_1632_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1627_] = (short) i_1633_;
										}
										if (i_1538_ != 0) {
											int i_1634_ = (Class325.anIntArray4103[i_1538_]);
											int i_1635_ = (Class325.anIntArray4105[i_1538_]);
											int i_1636_ = (((((OpenGLModel) this).aShortArray10288[i_1627_]) * i_1634_ + (((OpenGLModel) this).aShortArray10292[i_1627_]) * i_1635_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1627_] = (short) ((((((OpenGLModel) this).aShortArray10288[i_1627_]) * i_1635_) - ((((OpenGLModel) this).aShortArray10292[i_1627_]) * i_1634_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1627_] = (short) i_1636_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_1541_ != null) {
				int i_1637_ = is_1541_[9] << 4;
				int i_1638_ = is_1541_[10] << 4;
				int i_1639_ = is_1541_[11] << 4;
				int i_1640_ = is_1541_[12] << 4;
				int i_1641_ = is_1541_[13] << 4;
				int i_1642_ = is_1541_[14] << 4;
				if (aBool10345) {
					int i_1643_ = ((is_1541_[0] * anInt10342 + is_1541_[3] * anInt10310 + is_1541_[6] * anInt10344 + 8192) >> 14);
					int i_1644_ = ((is_1541_[1] * anInt10342 + is_1541_[4] * anInt10310 + is_1541_[7] * anInt10344 + 8192) >> 14);
					int i_1645_ = ((is_1541_[2] * anInt10342 + is_1541_[5] * anInt10310 + is_1541_[8] * anInt10344 + 8192) >> 14);
					i_1643_ += i_1640_;
					i_1644_ += i_1641_;
					i_1645_ += i_1642_;
					anInt10342 = i_1643_;
					anInt10310 = i_1644_;
					anInt10344 = i_1645_;
					aBool10345 = false;
				}
				int i_1646_ = i_1537_ << 15 >> 7;
				int i_1647_ = i_1538_ << 15 >> 7;
				int i_1648_ = i_1539_ << 15 >> 7;
				int i_1649_ = i_1646_ * -anInt10342 + 8192 >> 14;
				int i_1650_ = i_1647_ * -anInt10310 + 8192 >> 14;
				int i_1651_ = i_1648_ * -anInt10344 + 8192 >> 14;
				int i_1652_ = i_1649_ + anInt10342;
				int i_1653_ = i_1650_ + anInt10310;
				int i_1654_ = i_1651_ + anInt10344;
				int[] is_1655_ = new int[9];
				is_1655_[0] = i_1646_ * is_1541_[0] + 8192 >> 14;
				is_1655_[1] = i_1646_ * is_1541_[3] + 8192 >> 14;
				is_1655_[2] = i_1646_ * is_1541_[6] + 8192 >> 14;
				is_1655_[3] = i_1647_ * is_1541_[1] + 8192 >> 14;
				is_1655_[4] = i_1647_ * is_1541_[4] + 8192 >> 14;
				is_1655_[5] = i_1647_ * is_1541_[7] + 8192 >> 14;
				is_1655_[6] = i_1648_ * is_1541_[2] + 8192 >> 14;
				is_1655_[7] = i_1648_ * is_1541_[5] + 8192 >> 14;
				is_1655_[8] = i_1648_ * is_1541_[8] + 8192 >> 14;
				int i_1656_ = i_1646_ * i_1640_ + 8192 >> 14;
				int i_1657_ = i_1647_ * i_1641_ + 8192 >> 14;
				int i_1658_ = i_1648_ * i_1642_ + 8192 >> 14;
				i_1656_ += i_1652_;
				i_1657_ += i_1653_;
				i_1658_ += i_1654_;
				int[] is_1659_ = new int[9];
				for (int i_1660_ = 0; i_1660_ < 3; i_1660_++) {
					for (int i_1661_ = 0; i_1661_ < 3; i_1661_++) {
						int i_1662_ = 0;
						for (int i_1663_ = 0; i_1663_ < 3; i_1663_++)
							i_1662_ += (is_1541_[i_1660_ * 3 + i_1663_] * is_1655_[i_1661_ + i_1663_ * 3]);
						is_1659_[i_1660_ * 3 + i_1661_] = i_1662_ + 8192 >> 14;
					}
				}
				int i_1664_ = ((is_1541_[0] * i_1656_ + is_1541_[1] * i_1657_ + is_1541_[2] * i_1658_ + 8192) >> 14);
				int i_1665_ = ((is_1541_[3] * i_1656_ + is_1541_[4] * i_1657_ + is_1541_[5] * i_1658_ + 8192) >> 14);
				int i_1666_ = ((is_1541_[6] * i_1656_ + is_1541_[7] * i_1657_ + is_1541_[8] * i_1658_ + 8192) >> 14);
				i_1664_ += i_1637_;
				i_1665_ += i_1638_;
				i_1666_ += i_1639_;
				for (int i_1667_ = 0; i_1667_ < i_1542_; i_1667_++) {
					int i_1668_ = is[i_1667_];
					if (i_1668_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1669_ = (((OpenGLModel) this).anIntArrayArray10289[i_1668_]);
						for (int i_1670_ = 0; i_1670_ < is_1669_.length; i_1670_++) {
							int i_1671_ = is_1669_[i_1670_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1671_])) != 0)) {
								int i_1672_ = ((is_1659_[0] * (((OpenGLModel) this).anIntArray10336[i_1671_]) + is_1659_[1] * (((OpenGLModel) this).anIntArray10287[i_1671_]) + is_1659_[2] * (((OpenGLModel) this).anIntArray10331[i_1671_]) + 8192) >> 14);
								int i_1673_ = ((is_1659_[3] * (((OpenGLModel) this).anIntArray10336[i_1671_]) + is_1659_[4] * (((OpenGLModel) this).anIntArray10287[i_1671_]) + is_1659_[5] * (((OpenGLModel) this).anIntArray10331[i_1671_]) + 8192) >> 14);
								int i_1674_ = ((is_1659_[6] * (((OpenGLModel) this).anIntArray10336[i_1671_]) + is_1659_[7] * (((OpenGLModel) this).anIntArray10287[i_1671_]) + is_1659_[8] * (((OpenGLModel) this).anIntArray10331[i_1671_]) + 8192) >> 14);
								i_1672_ += i_1664_;
								i_1673_ += i_1665_;
								i_1674_ += i_1666_;
								((OpenGLModel) this).anIntArray10336[i_1671_] = i_1672_;
								((OpenGLModel) this).anIntArray10287[i_1671_] = i_1673_;
								((OpenGLModel) this).anIntArray10331[i_1671_] = i_1674_;
							}
						}
					}
				}
			} else {
				for (int i_1675_ = 0; i_1675_ < i_1542_; i_1675_++) {
					int i_1676_ = is[i_1675_];
					if (i_1676_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1677_ = (((OpenGLModel) this).anIntArrayArray10289[i_1676_]);
						for (int i_1678_ = 0; i_1678_ < is_1677_.length; i_1678_++) {
							int i_1679_ = is_1677_[i_1678_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10290[i_1679_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1679_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1679_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1679_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_1679_] = (((OpenGLModel) this).anIntArray10336[i_1679_]) * i_1537_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_1679_] = (((OpenGLModel) this).anIntArray10287[i_1679_]) * i_1538_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_1679_] = (((OpenGLModel) this).anIntArray10331[i_1679_]) * i_1539_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_1679_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1679_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1679_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1680_ = 0; i_1680_ < i_1542_; i_1680_++) {
					int i_1681_ = is[i_1680_];
					if (i_1681_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1682_ = (((OpenGLModel) this).anIntArrayArray10307[i_1681_]);
						for (int i_1683_ = 0; i_1683_ < is_1682_.length; i_1683_++) {
							int i_1684_ = is_1682_[i_1683_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10286[i_1684_])) != 0)) {
								int i_1685_ = (((((OpenGLModel) this).aByteArray10302[i_1684_]) & 0xff) + i_1537_ * 8);
								if (i_1685_ < 0)
									i_1685_ = 0;
								else if (i_1685_ > 255)
									i_1685_ = 255;
								((OpenGLModel) this).aByteArray10302[i_1684_] = (byte) i_1685_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1686_ = 0; i_1686_ < ((OpenGLModel) this).anInt10333; i_1686_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1686_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1686_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1687_ = 0; i_1687_ < i_1542_; i_1687_++) {
					int i_1688_ = is[i_1687_];
					if (i_1688_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1689_ = (((OpenGLModel) this).anIntArrayArray10307[i_1688_]);
						for (int i_1690_ = 0; i_1690_ < is_1689_.length; i_1690_++) {
							int i_1691_ = is_1689_[i_1690_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1540_ & (((OpenGLModel) this).aShortArray10286[i_1691_])) != 0)) {
								int i_1692_ = ((((OpenGLModel) this).aShortArray10281[i_1691_]) & 0xffff);
								int i_1693_ = i_1692_ >> 10 & 0x3f;
								int i_1694_ = i_1692_ >> 7 & 0x7;
								int i_1695_ = i_1692_ & 0x7f;
								i_1693_ = i_1693_ + i_1537_ & 0x3f;
								i_1694_ += i_1538_ / 4;
								if (i_1694_ < 0)
									i_1694_ = 0;
								else if (i_1694_ > 7)
									i_1694_ = 7;
								i_1695_ += i_1539_;
								if (i_1695_ < 0)
									i_1695_ = 0;
								else if (i_1695_ > 127)
									i_1695_ = 127;
								((OpenGLModel) this).aShortArray10281[i_1691_] = (short) (i_1693_ << 10 | i_1694_ << 7 | i_1695_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1696_ = 0; i_1696_ < ((OpenGLModel) this).anInt10333; i_1696_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1696_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1696_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1697_ = 0; i_1697_ < i_1542_; i_1697_++) {
					int i_1698_ = is[i_1697_];
					if (i_1698_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1699_ = (((OpenGLModel) this).anIntArrayArray10323[i_1698_]);
						for (int i_1700_ = 0; i_1700_ < is_1699_.length; i_1700_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1699_[i_1700_]]);
							((Class150) class150).anInt1698 += i_1537_;
							((Class150) class150).anInt1696 += i_1538_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1701_ = 0; i_1701_ < i_1542_; i_1701_++) {
					int i_1702_ = is[i_1701_];
					if (i_1702_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1703_ = (((OpenGLModel) this).anIntArrayArray10323[i_1702_]);
						for (int i_1704_ = 0; i_1704_ < is_1703_.length; i_1704_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1703_[i_1704_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_1537_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_1538_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1705_ = 0; i_1705_ < i_1542_; i_1705_++) {
					int i_1706_ = is[i_1705_];
					if (i_1706_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1707_ = (((OpenGLModel) this).anIntArrayArray10323[i_1706_]);
						for (int i_1708_ = 0; i_1708_ < is_1707_.length; i_1708_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1707_[i_1708_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_1537_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method1506() {
		if (((OpenGLModel) this).anInt10291 > 0 && ((OpenGLModel) this).anInt10308 > 0) {
			method9553(false);
			if ((((OpenGLModel) this).aByte10279 & 0x10) == 0 && (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
				method9552(false);
			method9547();
		}
	}

	void method1377(int i, int[] is, int i_1709_, int i_1710_, int i_1711_, boolean bool, int i_1712_, int[] is_1713_) {
		int i_1714_ = is.length;
		if (i == 0) {
			i_1709_ <<= 4;
			i_1710_ <<= 4;
			i_1711_ <<= 4;
			int i_1715_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_1716_ = 0; i_1716_ < i_1714_; i_1716_++) {
				int i_1717_ = is[i_1716_];
				if (i_1717_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1718_ = ((OpenGLModel) this).anIntArrayArray10289[i_1717_];
					for (int i_1719_ = 0; i_1719_ < is_1718_.length; i_1719_++) {
						int i_1720_ = is_1718_[i_1719_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1720_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_1720_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_1720_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_1720_]);
							i_1715_++;
						}
					}
				}
			}
			if (i_1715_ > 0) {
				anInt10342 = anInt10342 / i_1715_ + i_1709_;
				anInt10310 = anInt10310 / i_1715_ + i_1710_;
				anInt10344 = anInt10344 / i_1715_ + i_1711_;
				aBool10345 = true;
			} else {
				anInt10342 = i_1709_;
				anInt10310 = i_1710_;
				anInt10344 = i_1711_;
			}
		} else if (i == 1) {
			if (is_1713_ != null) {
				int i_1721_ = ((is_1713_[0] * i_1709_ + is_1713_[1] * i_1710_ + is_1713_[2] * i_1711_ + 8192) >> 14);
				int i_1722_ = ((is_1713_[3] * i_1709_ + is_1713_[4] * i_1710_ + is_1713_[5] * i_1711_ + 8192) >> 14);
				int i_1723_ = ((is_1713_[6] * i_1709_ + is_1713_[7] * i_1710_ + is_1713_[8] * i_1711_ + 8192) >> 14);
				i_1709_ = i_1721_;
				i_1710_ = i_1722_;
				i_1711_ = i_1723_;
			}
			i_1709_ <<= 4;
			i_1710_ <<= 4;
			i_1711_ <<= 4;
			for (int i_1724_ = 0; i_1724_ < i_1714_; i_1724_++) {
				int i_1725_ = is[i_1724_];
				if (i_1725_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_1726_ = ((OpenGLModel) this).anIntArrayArray10289[i_1725_];
					for (int i_1727_ = 0; i_1727_ < is_1726_.length; i_1727_++) {
						int i_1728_ = is_1726_[i_1727_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1728_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_1728_] += i_1709_;
							((OpenGLModel) this).anIntArray10287[i_1728_] += i_1710_;
							((OpenGLModel) this).anIntArray10331[i_1728_] += i_1711_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1713_ != null) {
				int i_1729_ = is_1713_[9] << 4;
				int i_1730_ = is_1713_[10] << 4;
				int i_1731_ = is_1713_[11] << 4;
				int i_1732_ = is_1713_[12] << 4;
				int i_1733_ = is_1713_[13] << 4;
				int i_1734_ = is_1713_[14] << 4;
				if (aBool10345) {
					int i_1735_ = ((is_1713_[0] * anInt10342 + is_1713_[3] * anInt10310 + is_1713_[6] * anInt10344 + 8192) >> 14);
					int i_1736_ = ((is_1713_[1] * anInt10342 + is_1713_[4] * anInt10310 + is_1713_[7] * anInt10344 + 8192) >> 14);
					int i_1737_ = ((is_1713_[2] * anInt10342 + is_1713_[5] * anInt10310 + is_1713_[8] * anInt10344 + 8192) >> 14);
					i_1735_ += i_1732_;
					i_1736_ += i_1733_;
					i_1737_ += i_1734_;
					anInt10342 = i_1735_;
					anInt10310 = i_1736_;
					anInt10344 = i_1737_;
					aBool10345 = false;
				}
				int[] is_1738_ = new int[9];
				int i_1739_ = Class325.anIntArray4105[i_1709_];
				int i_1740_ = Class325.anIntArray4103[i_1709_];
				int i_1741_ = Class325.anIntArray4105[i_1710_];
				int i_1742_ = Class325.anIntArray4103[i_1710_];
				int i_1743_ = Class325.anIntArray4105[i_1711_];
				int i_1744_ = Class325.anIntArray4103[i_1711_];
				int i_1745_ = i_1740_ * i_1743_ + 8192 >> 14;
				int i_1746_ = i_1740_ * i_1744_ + 8192 >> 14;
				is_1738_[0] = i_1741_ * i_1743_ + i_1742_ * i_1746_ + 8192 >> 14;
				is_1738_[1] = -i_1741_ * i_1744_ + i_1742_ * i_1745_ + 8192 >> 14;
				is_1738_[2] = i_1742_ * i_1739_ + 8192 >> 14;
				is_1738_[3] = i_1739_ * i_1744_ + 8192 >> 14;
				is_1738_[4] = i_1739_ * i_1743_ + 8192 >> 14;
				is_1738_[5] = -i_1740_;
				is_1738_[6] = -i_1742_ * i_1743_ + i_1741_ * i_1746_ + 8192 >> 14;
				is_1738_[7] = i_1742_ * i_1744_ + i_1741_ * i_1745_ + 8192 >> 14;
				is_1738_[8] = i_1741_ * i_1739_ + 8192 >> 14;
				int i_1747_ = ((is_1738_[0] * -anInt10342 + is_1738_[1] * -anInt10310 + is_1738_[2] * -anInt10344 + 8192) >> 14);
				int i_1748_ = ((is_1738_[3] * -anInt10342 + is_1738_[4] * -anInt10310 + is_1738_[5] * -anInt10344 + 8192) >> 14);
				int i_1749_ = ((is_1738_[6] * -anInt10342 + is_1738_[7] * -anInt10310 + is_1738_[8] * -anInt10344 + 8192) >> 14);
				int i_1750_ = i_1747_ + anInt10342;
				int i_1751_ = i_1748_ + anInt10310;
				int i_1752_ = i_1749_ + anInt10344;
				int[] is_1753_ = new int[9];
				for (int i_1754_ = 0; i_1754_ < 3; i_1754_++) {
					for (int i_1755_ = 0; i_1755_ < 3; i_1755_++) {
						int i_1756_ = 0;
						for (int i_1757_ = 0; i_1757_ < 3; i_1757_++)
							i_1756_ += (is_1738_[i_1754_ * 3 + i_1757_] * is_1713_[i_1755_ * 3 + i_1757_]);
						is_1753_[i_1754_ * 3 + i_1755_] = i_1756_ + 8192 >> 14;
					}
				}
				int i_1758_ = ((is_1738_[0] * i_1732_ + is_1738_[1] * i_1733_ + is_1738_[2] * i_1734_ + 8192) >> 14);
				int i_1759_ = ((is_1738_[3] * i_1732_ + is_1738_[4] * i_1733_ + is_1738_[5] * i_1734_ + 8192) >> 14);
				int i_1760_ = ((is_1738_[6] * i_1732_ + is_1738_[7] * i_1733_ + is_1738_[8] * i_1734_ + 8192) >> 14);
				i_1758_ += i_1750_;
				i_1759_ += i_1751_;
				i_1760_ += i_1752_;
				int[] is_1761_ = new int[9];
				for (int i_1762_ = 0; i_1762_ < 3; i_1762_++) {
					for (int i_1763_ = 0; i_1763_ < 3; i_1763_++) {
						int i_1764_ = 0;
						for (int i_1765_ = 0; i_1765_ < 3; i_1765_++)
							i_1764_ += (is_1713_[i_1762_ * 3 + i_1765_] * is_1753_[i_1763_ + i_1765_ * 3]);
						is_1761_[i_1762_ * 3 + i_1763_] = i_1764_ + 8192 >> 14;
					}
				}
				int i_1766_ = ((is_1713_[0] * i_1758_ + is_1713_[1] * i_1759_ + is_1713_[2] * i_1760_ + 8192) >> 14);
				int i_1767_ = ((is_1713_[3] * i_1758_ + is_1713_[4] * i_1759_ + is_1713_[5] * i_1760_ + 8192) >> 14);
				int i_1768_ = ((is_1713_[6] * i_1758_ + is_1713_[7] * i_1759_ + is_1713_[8] * i_1760_ + 8192) >> 14);
				i_1766_ += i_1729_;
				i_1767_ += i_1730_;
				i_1768_ += i_1731_;
				for (int i_1769_ = 0; i_1769_ < i_1714_; i_1769_++) {
					int i_1770_ = is[i_1769_];
					if (i_1770_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1771_ = (((OpenGLModel) this).anIntArrayArray10289[i_1770_]);
						for (int i_1772_ = 0; i_1772_ < is_1771_.length; i_1772_++) {
							int i_1773_ = is_1771_[i_1772_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1773_])) != 0)) {
								int i_1774_ = ((is_1761_[0] * (((OpenGLModel) this).anIntArray10336[i_1773_]) + is_1761_[1] * (((OpenGLModel) this).anIntArray10287[i_1773_]) + is_1761_[2] * (((OpenGLModel) this).anIntArray10331[i_1773_]) + 8192) >> 14);
								int i_1775_ = ((is_1761_[3] * (((OpenGLModel) this).anIntArray10336[i_1773_]) + is_1761_[4] * (((OpenGLModel) this).anIntArray10287[i_1773_]) + is_1761_[5] * (((OpenGLModel) this).anIntArray10331[i_1773_]) + 8192) >> 14);
								int i_1776_ = ((is_1761_[6] * (((OpenGLModel) this).anIntArray10336[i_1773_]) + is_1761_[7] * (((OpenGLModel) this).anIntArray10287[i_1773_]) + is_1761_[8] * (((OpenGLModel) this).anIntArray10331[i_1773_]) + 8192) >> 14);
								i_1774_ += i_1766_;
								i_1775_ += i_1767_;
								i_1776_ += i_1768_;
								((OpenGLModel) this).anIntArray10336[i_1773_] = i_1774_;
								((OpenGLModel) this).anIntArray10287[i_1773_] = i_1775_;
								((OpenGLModel) this).anIntArray10331[i_1773_] = i_1776_;
							}
						}
					}
				}
			} else {
				for (int i_1777_ = 0; i_1777_ < i_1714_; i_1777_++) {
					int i_1778_ = is[i_1777_];
					if (i_1778_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1779_ = (((OpenGLModel) this).anIntArrayArray10289[i_1778_]);
						for (int i_1780_ = 0; i_1780_ < is_1779_.length; i_1780_++) {
							int i_1781_ = is_1779_[i_1780_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1781_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1781_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1781_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1781_] -= anInt10344;
								if (i_1711_ != 0) {
									int i_1782_ = Class325.anIntArray4103[i_1711_];
									int i_1783_ = Class325.anIntArray4105[i_1711_];
									int i_1784_ = (((((OpenGLModel) this).anIntArray10287[i_1781_]) * i_1782_ + (((OpenGLModel) this).anIntArray10336[i_1781_]) * i_1783_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_1781_] = (((((OpenGLModel) this).anIntArray10287[i_1781_]) * i_1783_) - ((((OpenGLModel) this).anIntArray10336[i_1781_]) * i_1782_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1781_] = i_1784_;
								}
								if (i_1709_ != 0) {
									int i_1785_ = Class325.anIntArray4103[i_1709_];
									int i_1786_ = Class325.anIntArray4105[i_1709_];
									int i_1787_ = (((((OpenGLModel) this).anIntArray10287[i_1781_]) * i_1786_ - (((OpenGLModel) this).anIntArray10331[i_1781_]) * i_1785_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1781_] = (((((OpenGLModel) this).anIntArray10287[i_1781_]) * i_1785_) + ((((OpenGLModel) this).anIntArray10331[i_1781_]) * i_1786_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_1781_] = i_1787_;
								}
								if (i_1710_ != 0) {
									int i_1788_ = Class325.anIntArray4103[i_1710_];
									int i_1789_ = Class325.anIntArray4105[i_1710_];
									int i_1790_ = (((((OpenGLModel) this).anIntArray10331[i_1781_]) * i_1788_ + (((OpenGLModel) this).anIntArray10336[i_1781_]) * i_1789_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_1781_] = (((((OpenGLModel) this).anIntArray10331[i_1781_]) * i_1789_) - ((((OpenGLModel) this).anIntArray10336[i_1781_]) * i_1788_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_1781_] = i_1790_;
								}
								((OpenGLModel) this).anIntArray10336[i_1781_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1781_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1781_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_1791_ = 0; i_1791_ < i_1714_; i_1791_++) {
						int i_1792_ = is[i_1791_];
						if (i_1792_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_1793_ = (((OpenGLModel) this).anIntArrayArray10289[i_1792_]);
							for (int i_1794_ = 0; i_1794_ < is_1793_.length; i_1794_++) {
								int i_1795_ = is_1793_[i_1794_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || (i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1795_])) != 0) {
									int i_1796_ = (((OpenGLModel) this).anIntArray10329[i_1795_]);
									int i_1797_ = (((OpenGLModel) this).anIntArray10329[i_1795_ + 1]);
									for (int i_1798_ = i_1796_; (i_1798_ < i_1797_ && ((((OpenGLModel) this).aShortArray10330[i_1798_]) != 0)); i_1798_++) {
										int i_1799_ = (((((OpenGLModel) this).aShortArray10330[i_1798_]) & 0xffff) - 1);
										if (i_1711_ != 0) {
											int i_1800_ = (Class325.anIntArray4103[i_1711_]);
											int i_1801_ = (Class325.anIntArray4105[i_1711_]);
											int i_1802_ = (((((OpenGLModel) this).aShortArray10293[i_1799_]) * i_1800_ + (((OpenGLModel) this).aShortArray10292[i_1799_]) * i_1801_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1799_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1799_]) * i_1801_) - ((((OpenGLModel) this).aShortArray10292[i_1799_]) * i_1800_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1799_] = (short) i_1802_;
										}
										if (i_1709_ != 0) {
											int i_1803_ = (Class325.anIntArray4103[i_1709_]);
											int i_1804_ = (Class325.anIntArray4105[i_1709_]);
											int i_1805_ = (((((OpenGLModel) this).aShortArray10293[i_1799_]) * i_1804_ - (((OpenGLModel) this).aShortArray10288[i_1799_]) * i_1803_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1799_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_1799_]) * i_1803_) + ((((OpenGLModel) this).aShortArray10288[i_1799_]) * i_1804_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_1799_] = (short) i_1805_;
										}
										if (i_1710_ != 0) {
											int i_1806_ = (Class325.anIntArray4103[i_1710_]);
											int i_1807_ = (Class325.anIntArray4105[i_1710_]);
											int i_1808_ = (((((OpenGLModel) this).aShortArray10288[i_1799_]) * i_1806_ + (((OpenGLModel) this).aShortArray10292[i_1799_]) * i_1807_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_1799_] = (short) ((((((OpenGLModel) this).aShortArray10288[i_1799_]) * i_1807_) - ((((OpenGLModel) this).aShortArray10292[i_1799_]) * i_1806_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_1799_] = (short) i_1808_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_1713_ != null) {
				int i_1809_ = is_1713_[9] << 4;
				int i_1810_ = is_1713_[10] << 4;
				int i_1811_ = is_1713_[11] << 4;
				int i_1812_ = is_1713_[12] << 4;
				int i_1813_ = is_1713_[13] << 4;
				int i_1814_ = is_1713_[14] << 4;
				if (aBool10345) {
					int i_1815_ = ((is_1713_[0] * anInt10342 + is_1713_[3] * anInt10310 + is_1713_[6] * anInt10344 + 8192) >> 14);
					int i_1816_ = ((is_1713_[1] * anInt10342 + is_1713_[4] * anInt10310 + is_1713_[7] * anInt10344 + 8192) >> 14);
					int i_1817_ = ((is_1713_[2] * anInt10342 + is_1713_[5] * anInt10310 + is_1713_[8] * anInt10344 + 8192) >> 14);
					i_1815_ += i_1812_;
					i_1816_ += i_1813_;
					i_1817_ += i_1814_;
					anInt10342 = i_1815_;
					anInt10310 = i_1816_;
					anInt10344 = i_1817_;
					aBool10345 = false;
				}
				int i_1818_ = i_1709_ << 15 >> 7;
				int i_1819_ = i_1710_ << 15 >> 7;
				int i_1820_ = i_1711_ << 15 >> 7;
				int i_1821_ = i_1818_ * -anInt10342 + 8192 >> 14;
				int i_1822_ = i_1819_ * -anInt10310 + 8192 >> 14;
				int i_1823_ = i_1820_ * -anInt10344 + 8192 >> 14;
				int i_1824_ = i_1821_ + anInt10342;
				int i_1825_ = i_1822_ + anInt10310;
				int i_1826_ = i_1823_ + anInt10344;
				int[] is_1827_ = new int[9];
				is_1827_[0] = i_1818_ * is_1713_[0] + 8192 >> 14;
				is_1827_[1] = i_1818_ * is_1713_[3] + 8192 >> 14;
				is_1827_[2] = i_1818_ * is_1713_[6] + 8192 >> 14;
				is_1827_[3] = i_1819_ * is_1713_[1] + 8192 >> 14;
				is_1827_[4] = i_1819_ * is_1713_[4] + 8192 >> 14;
				is_1827_[5] = i_1819_ * is_1713_[7] + 8192 >> 14;
				is_1827_[6] = i_1820_ * is_1713_[2] + 8192 >> 14;
				is_1827_[7] = i_1820_ * is_1713_[5] + 8192 >> 14;
				is_1827_[8] = i_1820_ * is_1713_[8] + 8192 >> 14;
				int i_1828_ = i_1818_ * i_1812_ + 8192 >> 14;
				int i_1829_ = i_1819_ * i_1813_ + 8192 >> 14;
				int i_1830_ = i_1820_ * i_1814_ + 8192 >> 14;
				i_1828_ += i_1824_;
				i_1829_ += i_1825_;
				i_1830_ += i_1826_;
				int[] is_1831_ = new int[9];
				for (int i_1832_ = 0; i_1832_ < 3; i_1832_++) {
					for (int i_1833_ = 0; i_1833_ < 3; i_1833_++) {
						int i_1834_ = 0;
						for (int i_1835_ = 0; i_1835_ < 3; i_1835_++)
							i_1834_ += (is_1713_[i_1832_ * 3 + i_1835_] * is_1827_[i_1833_ + i_1835_ * 3]);
						is_1831_[i_1832_ * 3 + i_1833_] = i_1834_ + 8192 >> 14;
					}
				}
				int i_1836_ = ((is_1713_[0] * i_1828_ + is_1713_[1] * i_1829_ + is_1713_[2] * i_1830_ + 8192) >> 14);
				int i_1837_ = ((is_1713_[3] * i_1828_ + is_1713_[4] * i_1829_ + is_1713_[5] * i_1830_ + 8192) >> 14);
				int i_1838_ = ((is_1713_[6] * i_1828_ + is_1713_[7] * i_1829_ + is_1713_[8] * i_1830_ + 8192) >> 14);
				i_1836_ += i_1809_;
				i_1837_ += i_1810_;
				i_1838_ += i_1811_;
				for (int i_1839_ = 0; i_1839_ < i_1714_; i_1839_++) {
					int i_1840_ = is[i_1839_];
					if (i_1840_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1841_ = (((OpenGLModel) this).anIntArrayArray10289[i_1840_]);
						for (int i_1842_ = 0; i_1842_ < is_1841_.length; i_1842_++) {
							int i_1843_ = is_1841_[i_1842_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1843_])) != 0)) {
								int i_1844_ = ((is_1831_[0] * (((OpenGLModel) this).anIntArray10336[i_1843_]) + is_1831_[1] * (((OpenGLModel) this).anIntArray10287[i_1843_]) + is_1831_[2] * (((OpenGLModel) this).anIntArray10331[i_1843_]) + 8192) >> 14);
								int i_1845_ = ((is_1831_[3] * (((OpenGLModel) this).anIntArray10336[i_1843_]) + is_1831_[4] * (((OpenGLModel) this).anIntArray10287[i_1843_]) + is_1831_[5] * (((OpenGLModel) this).anIntArray10331[i_1843_]) + 8192) >> 14);
								int i_1846_ = ((is_1831_[6] * (((OpenGLModel) this).anIntArray10336[i_1843_]) + is_1831_[7] * (((OpenGLModel) this).anIntArray10287[i_1843_]) + is_1831_[8] * (((OpenGLModel) this).anIntArray10331[i_1843_]) + 8192) >> 14);
								i_1844_ += i_1836_;
								i_1845_ += i_1837_;
								i_1846_ += i_1838_;
								((OpenGLModel) this).anIntArray10336[i_1843_] = i_1844_;
								((OpenGLModel) this).anIntArray10287[i_1843_] = i_1845_;
								((OpenGLModel) this).anIntArray10331[i_1843_] = i_1846_;
							}
						}
					}
				}
			} else {
				for (int i_1847_ = 0; i_1847_ < i_1714_; i_1847_++) {
					int i_1848_ = is[i_1847_];
					if (i_1848_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_1849_ = (((OpenGLModel) this).anIntArrayArray10289[i_1848_]);
						for (int i_1850_ = 0; i_1850_ < is_1849_.length; i_1850_++) {
							int i_1851_ = is_1849_[i_1850_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10290[i_1851_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_1851_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1851_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1851_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_1851_] = (((OpenGLModel) this).anIntArray10336[i_1851_]) * i_1709_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_1851_] = (((OpenGLModel) this).anIntArray10287[i_1851_]) * i_1710_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_1851_] = (((OpenGLModel) this).anIntArray10331[i_1851_]) * i_1711_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_1851_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_1851_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_1851_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1852_ = 0; i_1852_ < i_1714_; i_1852_++) {
					int i_1853_ = is[i_1852_];
					if (i_1853_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1854_ = (((OpenGLModel) this).anIntArrayArray10307[i_1853_]);
						for (int i_1855_ = 0; i_1855_ < is_1854_.length; i_1855_++) {
							int i_1856_ = is_1854_[i_1855_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10286[i_1856_])) != 0)) {
								int i_1857_ = (((((OpenGLModel) this).aByteArray10302[i_1856_]) & 0xff) + i_1709_ * 8);
								if (i_1857_ < 0)
									i_1857_ = 0;
								else if (i_1857_ > 255)
									i_1857_ = 255;
								((OpenGLModel) this).aByteArray10302[i_1856_] = (byte) i_1857_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1858_ = 0; i_1858_ < ((OpenGLModel) this).anInt10333; i_1858_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1858_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1858_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_1859_ = 0; i_1859_ < i_1714_; i_1859_++) {
					int i_1860_ = is[i_1859_];
					if (i_1860_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_1861_ = (((OpenGLModel) this).anIntArrayArray10307[i_1860_]);
						for (int i_1862_ = 0; i_1862_ < is_1861_.length; i_1862_++) {
							int i_1863_ = is_1861_[i_1862_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_1712_ & (((OpenGLModel) this).aShortArray10286[i_1863_])) != 0)) {
								int i_1864_ = ((((OpenGLModel) this).aShortArray10281[i_1863_]) & 0xffff);
								int i_1865_ = i_1864_ >> 10 & 0x3f;
								int i_1866_ = i_1864_ >> 7 & 0x7;
								int i_1867_ = i_1864_ & 0x7f;
								i_1865_ = i_1865_ + i_1709_ & 0x3f;
								i_1866_ += i_1710_ / 4;
								if (i_1866_ < 0)
									i_1866_ = 0;
								else if (i_1866_ > 7)
									i_1866_ = 7;
								i_1867_ += i_1711_;
								if (i_1867_ < 0)
									i_1867_ = 0;
								else if (i_1867_ > 127)
									i_1867_ = 127;
								((OpenGLModel) this).aShortArray10281[i_1863_] = (short) (i_1865_ << 10 | i_1866_ << 7 | i_1867_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_1868_ = 0; i_1868_ < ((OpenGLModel) this).anInt10333; i_1868_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_1868_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_1868_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1869_ = 0; i_1869_ < i_1714_; i_1869_++) {
					int i_1870_ = is[i_1869_];
					if (i_1870_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1871_ = (((OpenGLModel) this).anIntArrayArray10323[i_1870_]);
						for (int i_1872_ = 0; i_1872_ < is_1871_.length; i_1872_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1871_[i_1872_]]);
							((Class150) class150).anInt1698 += i_1709_;
							((Class150) class150).anInt1696 += i_1710_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1873_ = 0; i_1873_ < i_1714_; i_1873_++) {
					int i_1874_ = is[i_1873_];
					if (i_1874_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1875_ = (((OpenGLModel) this).anIntArrayArray10323[i_1874_]);
						for (int i_1876_ = 0; i_1876_ < is_1875_.length; i_1876_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1875_[i_1876_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_1709_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_1710_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_1877_ = 0; i_1877_ < i_1714_; i_1877_++) {
					int i_1878_ = is[i_1877_];
					if (i_1878_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_1879_ = (((OpenGLModel) this).anIntArrayArray10323[i_1878_]);
						for (int i_1880_ = 0; i_1880_ < is_1879_.length; i_1880_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_1879_[i_1880_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_1709_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method1438(Class261 class261, int i, boolean bool) {
		if (((OpenGLModel) this).aShortArray10290 != null) {
			Class261 class261_1881_ = class261;
			if (bool) {
				class261_1881_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass261_10092);
				class261_1881_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_1882_ = 0; i_1882_ < ((OpenGLModel) this).anInt10285; i_1882_++) {
				if ((i & ((OpenGLModel) this).aShortArray10290[i_1882_]) != 0) {
					class261_1881_.method3582((float) (((OpenGLModel) this).anIntArray10336[i_1882_]), (float) (((OpenGLModel) this).anIntArray10287[i_1882_]), (float) (((OpenGLModel) this).anIntArray10331[i_1882_]), fs);
					((OpenGLModel) this).anIntArray10336[i_1882_] = (int) fs[0];
					((OpenGLModel) this).anIntArray10287[i_1882_] = (int) fs[1];
					((OpenGLModel) this).anIntArray10331[i_1882_] = (int) fs[2];
				}
			}
		}
	}

	public void method1439(Class261 class261, int i, boolean bool) {
		if (((OpenGLModel) this).aShortArray10290 != null) {
			Class261 class261_1883_ = class261;
			if (bool) {
				class261_1883_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass261_10092);
				class261_1883_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_1884_ = 0; i_1884_ < ((OpenGLModel) this).anInt10285; i_1884_++) {
				if ((i & ((OpenGLModel) this).aShortArray10290[i_1884_]) != 0) {
					class261_1883_.method3582((float) (((OpenGLModel) this).anIntArray10336[i_1884_]), (float) (((OpenGLModel) this).anIntArray10287[i_1884_]), (float) (((OpenGLModel) this).anIntArray10331[i_1884_]), fs);
					((OpenGLModel) this).anIntArray10336[i_1884_] = (int) fs[0];
					((OpenGLModel) this).anIntArray10287[i_1884_] = (int) fs[1];
					((OpenGLModel) this).anIntArray10331[i_1884_] = (int) fs[2];
				}
			}
		}
	}

	public void method1440(Class261 class261, Class90 class90, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((OpenGLModel) this).anInt10291 != 0) {
			Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10079);
			Class250 class250_1885_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
			Class250 class250_1886_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10094);
			class250_1885_.method3446(class261);
			class250_1886_.method3442(class250_1885_);
			class250_1886_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10183);
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			float[] fs = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10156);
			class250_1885_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10317), 0.0F, fs);
			float f = fs[0];
			float f_1887_ = fs[1];
			float f_1888_ = fs[2];
			class250_1885_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10321), 0.0F, fs);
			float f_1889_ = fs[0];
			float f_1890_ = fs[1];
			float f_1891_ = fs[2];
			for (int i_1892_ = 0; i_1892_ < 6; i_1892_++) {
				float[] fs_1893_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArrayArray10082[i_1892_]);
				float f_1894_ = (fs_1893_[0] * f + fs_1893_[1] * f_1887_ + fs_1893_[2] * f_1888_ + fs_1893_[3] + (float) ((OpenGLModel) this).anInt10271);
				float f_1895_ = (fs_1893_[0] * f_1889_ + fs_1893_[1] * f_1890_ + fs_1893_[2] * f_1891_ + fs_1893_[3] + (float) ((OpenGLModel) this).anInt10271);
				if (f_1894_ < 0.0F && f_1895_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_1896_ = true;
				int i_1897_ = ((((OpenGLModel) this).aShort10322 + ((OpenGLModel) this).aShort10318) >> 1);
				int i_1898_ = ((((OpenGLModel) this).aShort10324 + ((OpenGLModel) this).aShort10325) >> 1);
				int i_1899_ = i_1897_;
				short i_1900_ = ((OpenGLModel) this).aShort10317;
				int i_1901_ = i_1898_;
				float f_1902_ = (class250_1886_.aFloatArray2728[0] * (float) i_1899_ + class250_1886_.aFloatArray2728[4] * (float) i_1900_ + class250_1886_.aFloatArray2728[8] * (float) i_1901_ + class250_1886_.aFloatArray2728[12]);
				float f_1903_ = (class250_1886_.aFloatArray2728[1] * (float) i_1899_ + class250_1886_.aFloatArray2728[5] * (float) i_1900_ + class250_1886_.aFloatArray2728[9] * (float) i_1901_ + class250_1886_.aFloatArray2728[13]);
				float f_1904_ = (class250_1886_.aFloatArray2728[2] * (float) i_1899_ + class250_1886_.aFloatArray2728[6] * (float) i_1900_ + class250_1886_.aFloatArray2728[10] * (float) i_1901_ + class250_1886_.aFloatArray2728[14]);
				float f_1905_ = (class250_1886_.aFloatArray2728[3] * (float) i_1899_ + class250_1886_.aFloatArray2728[7] * (float) i_1900_ + class250_1886_.aFloatArray2728[11] * (float) i_1901_ + class250_1886_.aFloatArray2728[15]);
				if (f_1904_ >= -f_1905_) {
					class90.anInt1230 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_1902_ / f_1905_);
					class90.anInt1231 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_1903_ / f_1905_);
				} else
					bool = true;
				i_1899_ = i_1897_;
				i_1900_ = ((OpenGLModel) this).aShort10321;
				i_1901_ = i_1898_;
				float f_1906_ = (class250_1886_.aFloatArray2728[0] * (float) i_1899_ + class250_1886_.aFloatArray2728[4] * (float) i_1900_ + class250_1886_.aFloatArray2728[8] * (float) i_1901_ + class250_1886_.aFloatArray2728[12]);
				float f_1907_ = (class250_1886_.aFloatArray2728[1] * (float) i_1899_ + class250_1886_.aFloatArray2728[5] * (float) i_1900_ + class250_1886_.aFloatArray2728[9] * (float) i_1901_ + class250_1886_.aFloatArray2728[13]);
				float f_1908_ = (class250_1886_.aFloatArray2728[2] * (float) i_1899_ + class250_1886_.aFloatArray2728[6] * (float) i_1900_ + class250_1886_.aFloatArray2728[10] * (float) i_1901_ + class250_1886_.aFloatArray2728[14]);
				float f_1909_ = (class250_1886_.aFloatArray2728[3] * (float) i_1899_ + class250_1886_.aFloatArray2728[7] * (float) i_1900_ + class250_1886_.aFloatArray2728[11] * (float) i_1901_ + class250_1886_.aFloatArray2728[15]);
				if (f_1908_ >= -f_1909_) {
					class90.anInt1234 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_1906_ / f_1909_);
					class90.anInt1233 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_1907_ / f_1909_);
				} else
					bool = true;
				if (bool) {
					if (f_1904_ < -f_1905_ && f_1908_ < -f_1909_)
						bool_1896_ = false;
					else if (f_1904_ < -f_1905_) {
						float f_1910_ = (f_1904_ + f_1905_) / (f_1908_ + f_1909_) - 1.0F;
						float f_1911_ = f_1902_ + f_1910_ * (f_1906_ - f_1902_);
						float f_1912_ = f_1903_ + f_1910_ * (f_1907_ - f_1903_);
						float f_1913_ = f_1905_ + f_1910_ * (f_1909_ - f_1905_);
						class90.anInt1230 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1911_ / f_1913_));
						class90.anInt1231 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_1912_ / f_1913_));
					} else if (f_1908_ < -f_1909_) {
						float f_1914_ = (f_1908_ + f_1909_) / (f_1904_ + f_1905_) - 1.0F;
						float f_1915_ = f_1906_ + f_1914_ * (f_1902_ - f_1906_);
						float f_1916_ = f_1907_ + f_1914_ * (f_1903_ - f_1907_);
						float f_1917_ = f_1909_ + f_1914_ * (f_1905_ - f_1909_);
						class90.anInt1234 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1915_ / f_1917_));
						class90.anInt1233 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_1916_ / f_1917_));
					}
				}
				if (bool_1896_) {
					if (f_1904_ / f_1905_ > f_1908_ / f_1909_) {
						float f_1918_ = (f_1902_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_1919_ = (f_1905_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1230 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1918_ / f_1919_));
					} else {
						float f_1920_ = (f_1906_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_1921_ = (f_1909_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1234 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1920_ / f_1921_));
					}
					class90.aBool1232 = true;
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method9396();
			((OpenGLModel) this).aClass106_Sub1_10340.method9481(class250_1885_);
			method9543();
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
			class250_1885_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10197);
			method9551(class250_1885_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public int method1406() {
		return ((OpenGLModel) this).anInt10277;
	}

	public void method1424() {
		if (((OpenGLModel) this).anInt10291 > 0 && ((OpenGLModel) this).anInt10308 > 0) {
			method9553(false);
			if ((((OpenGLModel) this).aByte10279 & 0x10) == 0 && (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
				method9552(false);
			method9547();
		}
	}

	public void method1443(Class261 class261, Class90 class90, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((OpenGLModel) this).anInt10291 != 0) {
			Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10079);
			Class250 class250_1922_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
			Class250 class250_1923_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10094);
			class250_1922_.method3446(class261);
			class250_1923_.method3442(class250_1922_);
			class250_1923_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10183);
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			float[] fs = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10156);
			class250_1922_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10317), 0.0F, fs);
			float f = fs[0];
			float f_1924_ = fs[1];
			float f_1925_ = fs[2];
			class250_1922_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10321), 0.0F, fs);
			float f_1926_ = fs[0];
			float f_1927_ = fs[1];
			float f_1928_ = fs[2];
			for (int i_1929_ = 0; i_1929_ < 6; i_1929_++) {
				float[] fs_1930_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArrayArray10082[i_1929_]);
				float f_1931_ = (fs_1930_[0] * f + fs_1930_[1] * f_1924_ + fs_1930_[2] * f_1925_ + fs_1930_[3] + (float) ((OpenGLModel) this).anInt10271);
				float f_1932_ = (fs_1930_[0] * f_1926_ + fs_1930_[1] * f_1927_ + fs_1930_[2] * f_1928_ + fs_1930_[3] + (float) ((OpenGLModel) this).anInt10271);
				if (f_1931_ < 0.0F && f_1932_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_1933_ = true;
				int i_1934_ = ((((OpenGLModel) this).aShort10322 + ((OpenGLModel) this).aShort10318) >> 1);
				int i_1935_ = ((((OpenGLModel) this).aShort10324 + ((OpenGLModel) this).aShort10325) >> 1);
				int i_1936_ = i_1934_;
				short i_1937_ = ((OpenGLModel) this).aShort10317;
				int i_1938_ = i_1935_;
				float f_1939_ = (class250_1923_.aFloatArray2728[0] * (float) i_1936_ + class250_1923_.aFloatArray2728[4] * (float) i_1937_ + class250_1923_.aFloatArray2728[8] * (float) i_1938_ + class250_1923_.aFloatArray2728[12]);
				float f_1940_ = (class250_1923_.aFloatArray2728[1] * (float) i_1936_ + class250_1923_.aFloatArray2728[5] * (float) i_1937_ + class250_1923_.aFloatArray2728[9] * (float) i_1938_ + class250_1923_.aFloatArray2728[13]);
				float f_1941_ = (class250_1923_.aFloatArray2728[2] * (float) i_1936_ + class250_1923_.aFloatArray2728[6] * (float) i_1937_ + class250_1923_.aFloatArray2728[10] * (float) i_1938_ + class250_1923_.aFloatArray2728[14]);
				float f_1942_ = (class250_1923_.aFloatArray2728[3] * (float) i_1936_ + class250_1923_.aFloatArray2728[7] * (float) i_1937_ + class250_1923_.aFloatArray2728[11] * (float) i_1938_ + class250_1923_.aFloatArray2728[15]);
				if (f_1941_ >= -f_1942_) {
					class90.anInt1230 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_1939_ / f_1942_);
					class90.anInt1231 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_1940_ / f_1942_);
				} else
					bool = true;
				i_1936_ = i_1934_;
				i_1937_ = ((OpenGLModel) this).aShort10321;
				i_1938_ = i_1935_;
				float f_1943_ = (class250_1923_.aFloatArray2728[0] * (float) i_1936_ + class250_1923_.aFloatArray2728[4] * (float) i_1937_ + class250_1923_.aFloatArray2728[8] * (float) i_1938_ + class250_1923_.aFloatArray2728[12]);
				float f_1944_ = (class250_1923_.aFloatArray2728[1] * (float) i_1936_ + class250_1923_.aFloatArray2728[5] * (float) i_1937_ + class250_1923_.aFloatArray2728[9] * (float) i_1938_ + class250_1923_.aFloatArray2728[13]);
				float f_1945_ = (class250_1923_.aFloatArray2728[2] * (float) i_1936_ + class250_1923_.aFloatArray2728[6] * (float) i_1937_ + class250_1923_.aFloatArray2728[10] * (float) i_1938_ + class250_1923_.aFloatArray2728[14]);
				float f_1946_ = (class250_1923_.aFloatArray2728[3] * (float) i_1936_ + class250_1923_.aFloatArray2728[7] * (float) i_1937_ + class250_1923_.aFloatArray2728[11] * (float) i_1938_ + class250_1923_.aFloatArray2728[15]);
				if (f_1945_ >= -f_1946_) {
					class90.anInt1234 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_1943_ / f_1946_);
					class90.anInt1233 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_1944_ / f_1946_);
				} else
					bool = true;
				if (bool) {
					if (f_1941_ < -f_1942_ && f_1945_ < -f_1946_)
						bool_1933_ = false;
					else if (f_1941_ < -f_1942_) {
						float f_1947_ = (f_1941_ + f_1942_) / (f_1945_ + f_1946_) - 1.0F;
						float f_1948_ = f_1939_ + f_1947_ * (f_1943_ - f_1939_);
						float f_1949_ = f_1940_ + f_1947_ * (f_1944_ - f_1940_);
						float f_1950_ = f_1942_ + f_1947_ * (f_1946_ - f_1942_);
						class90.anInt1230 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1948_ / f_1950_));
						class90.anInt1231 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_1949_ / f_1950_));
					} else if (f_1945_ < -f_1946_) {
						float f_1951_ = (f_1945_ + f_1946_) / (f_1941_ + f_1942_) - 1.0F;
						float f_1952_ = f_1943_ + f_1951_ * (f_1939_ - f_1943_);
						float f_1953_ = f_1944_ + f_1951_ * (f_1940_ - f_1944_);
						float f_1954_ = f_1946_ + f_1951_ * (f_1942_ - f_1946_);
						class90.anInt1234 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1952_ / f_1954_));
						class90.anInt1233 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_1953_ / f_1954_));
					}
				}
				if (bool_1933_) {
					if (f_1941_ / f_1942_ > f_1945_ / f_1946_) {
						float f_1955_ = (f_1939_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_1956_ = (f_1942_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1230 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1955_ / f_1956_));
					} else {
						float f_1957_ = (f_1943_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_1958_ = (f_1946_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1234 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1957_ / f_1958_));
					}
					class90.aBool1232 = true;
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method9396();
			((OpenGLModel) this).aClass106_Sub1_10340.method9481(class250_1922_);
			method9543();
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
			class250_1922_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10197);
			method9551(class250_1922_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void method1411() {
		if (((OpenGLModel) this).anInt10291 > 0 && ((OpenGLModel) this).anInt10308 > 0) {
			method9553(false);
			if ((((OpenGLModel) this).aByte10279 & 0x10) == 0 && (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
				method9552(false);
			method9547();
		}
	}

	public boolean method1445(int i, int i_1959_, Class261 class261, boolean bool, int i_1960_) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10183);
		boolean bool_1961_ = false;
		int i_1962_ = 2147483647;
		int i_1963_ = -2147483648;
		int i_1964_ = 2147483647;
		int i_1965_ = -2147483648;
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i_1966_ = ((((OpenGLModel) this).aShort10318 - ((OpenGLModel) this).aShort10322) >> 1);
		int i_1967_ = ((((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317) >> 1);
		int i_1968_ = ((((OpenGLModel) this).aShort10325 - ((OpenGLModel) this).aShort10324) >> 1);
		int i_1969_ = ((OpenGLModel) this).aShort10322 + i_1966_;
		int i_1970_ = ((OpenGLModel) this).aShort10317 + i_1967_;
		int i_1971_ = ((OpenGLModel) this).aShort10324 + i_1968_;
		int i_1972_ = i_1969_ - (i_1966_ << i_1960_);
		int i_1973_ = i_1970_ - (i_1967_ << i_1960_);
		int i_1974_ = i_1971_ - (i_1968_ << i_1960_);
		int i_1975_ = i_1969_ + (i_1966_ << i_1960_);
		int i_1976_ = i_1970_ + (i_1967_ << i_1960_);
		int i_1977_ = i_1971_ + (i_1968_ << i_1960_);
		anIntArray10320[0] = i_1972_;
		anIntArray10298[0] = i_1973_;
		anIntArray10341[0] = i_1974_;
		anIntArray10320[1] = i_1975_;
		anIntArray10298[1] = i_1973_;
		anIntArray10341[1] = i_1974_;
		anIntArray10320[2] = i_1972_;
		anIntArray10298[2] = i_1976_;
		anIntArray10341[2] = i_1974_;
		anIntArray10320[3] = i_1975_;
		anIntArray10298[3] = i_1976_;
		anIntArray10341[3] = i_1974_;
		anIntArray10320[4] = i_1972_;
		anIntArray10298[4] = i_1973_;
		anIntArray10341[4] = i_1977_;
		anIntArray10320[5] = i_1975_;
		anIntArray10298[5] = i_1973_;
		anIntArray10341[5] = i_1977_;
		anIntArray10320[6] = i_1972_;
		anIntArray10298[6] = i_1976_;
		anIntArray10341[6] = i_1977_;
		anIntArray10320[7] = i_1975_;
		anIntArray10298[7] = i_1976_;
		anIntArray10341[7] = i_1977_;
		for (int i_1978_ = 0; i_1978_ < 8; i_1978_++) {
			int i_1979_ = anIntArray10320[i_1978_];
			int i_1980_ = anIntArray10298[i_1978_];
			int i_1981_ = anIntArray10341[i_1978_];
			float f = (class250.aFloatArray2728[2] * (float) i_1979_ + class250.aFloatArray2728[6] * (float) i_1980_ + class250.aFloatArray2728[10] * (float) i_1981_ + class250.aFloatArray2728[14]);
			float f_1982_ = (class250.aFloatArray2728[3] * (float) i_1979_ + class250.aFloatArray2728[7] * (float) i_1980_ + class250.aFloatArray2728[11] * (float) i_1981_ + class250.aFloatArray2728[15]);
			if (f >= -f_1982_) {
				float f_1983_ = (class250.aFloatArray2728[0] * (float) i_1979_ + class250.aFloatArray2728[4] * (float) i_1980_ + class250.aFloatArray2728[8] * (float) i_1981_ + class250.aFloatArray2728[12]);
				float f_1984_ = (class250.aFloatArray2728[1] * (float) i_1979_ + class250.aFloatArray2728[5] * (float) i_1980_ + class250.aFloatArray2728[9] * (float) i_1981_ + class250.aFloatArray2728[13]);
				int i_1985_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10085) * f_1983_ / f_1982_);
				int i_1986_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10121) * f_1984_ / f_1982_);
				if (i_1985_ < i_1962_)
					i_1962_ = i_1985_;
				if (i_1985_ > i_1963_)
					i_1963_ = i_1985_;
				if (i_1986_ < i_1964_)
					i_1964_ = i_1986_;
				if (i_1986_ > i_1965_)
					i_1965_ = i_1986_;
				bool_1961_ = true;
			}
		}
		if (bool_1961_ && i > i_1962_ && i < i_1963_ && i_1959_ > i_1964_ && i_1959_ < i_1965_) {
			if (bool)
				return true;
			if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157).length < ((OpenGLModel) this).anInt10291) {
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157 = new int[((OpenGLModel) this).anInt10291];
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191 = new int[((OpenGLModel) this).anInt10291];
			}
			int[] is = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157);
			int[] is_1987_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191);
			for (int i_1988_ = 0; i_1988_ < ((OpenGLModel) this).anInt10285; i_1988_++) {
				int i_1989_ = ((OpenGLModel) this).anIntArray10336[i_1988_];
				int i_1990_ = ((OpenGLModel) this).anIntArray10287[i_1988_];
				int i_1991_ = ((OpenGLModel) this).anIntArray10331[i_1988_];
				float f = (class250.aFloatArray2728[2] * (float) i_1989_ + class250.aFloatArray2728[6] * (float) i_1990_ + class250.aFloatArray2728[10] * (float) i_1991_ + class250.aFloatArray2728[14]);
				float f_1992_ = (class250.aFloatArray2728[3] * (float) i_1989_ + class250.aFloatArray2728[7] * (float) i_1990_ + class250.aFloatArray2728[11] * (float) i_1991_ + class250.aFloatArray2728[15]);
				if (f >= -f_1992_) {
					float f_1993_ = (class250.aFloatArray2728[0] * (float) i_1989_ + class250.aFloatArray2728[4] * (float) i_1990_ + class250.aFloatArray2728[8] * (float) i_1991_ + class250.aFloatArray2728[12]);
					float f_1994_ = (class250.aFloatArray2728[1] * (float) i_1989_ + class250.aFloatArray2728[5] * (float) i_1990_ + class250.aFloatArray2728[9] * (float) i_1991_ + class250.aFloatArray2728[13]);
					int i_1995_ = ((OpenGLModel) this).anIntArray10329[i_1988_];
					int i_1996_ = ((OpenGLModel) this).anIntArray10329[i_1988_ + 1];
					for (int i_1997_ = i_1995_; (i_1997_ < i_1996_ && (((OpenGLModel) this).aShortArray10330[i_1997_] != 0)); i_1997_++) {
						int i_1998_ = ((((OpenGLModel) this).aShortArray10330[i_1997_] & 0xffff) - 1);
						is[i_1998_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_1993_ / f_1992_));
						is_1987_[i_1998_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_1994_ / f_1992_));
					}
				} else {
					int i_1999_ = ((OpenGLModel) this).anIntArray10329[i_1988_];
					int i_2000_ = ((OpenGLModel) this).anIntArray10329[i_1988_ + 1];
					for (int i_2001_ = i_1999_; (i_2001_ < i_2000_ && (((OpenGLModel) this).aShortArray10330[i_2001_] != 0)); i_2001_++) {
						int i_2002_ = ((((OpenGLModel) this).aShortArray10330[i_2001_] & 0xffff) - 1);
						is[i_2002_] = -999999;
					}
				}
			}
			for (int i_2003_ = 0; i_2003_ < ((OpenGLModel) this).anInt10299; i_2003_++) {
				if (is[(((OpenGLModel) this).aShortArray10303[i_2003_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10327[i_2003_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10305[i_2003_] & 0xffff)] != -999999 && method9549(i, i_1959_, is_1987_[((((OpenGLModel) this).aShortArray10303[i_2003_]) & 0xffff)], is_1987_[((((OpenGLModel) this).aShortArray10327[i_2003_]) & 0xffff)], is_1987_[((((OpenGLModel) this).aShortArray10305[i_2003_]) & 0xffff)], is[(((OpenGLModel) this).aShortArray10303[i_2003_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10327[i_2003_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10305[i_2003_]) & 0xffff]))
					return true;
			}
		}
		return false;
	}

	static float[] method9557(float[] fs, int i) {
		float[] fs_2004_ = new float[i];
		System.arraycopy(fs, 0, fs_2004_, 0, i);
		return fs_2004_;
	}

	public void method1446(Class261 class261) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		if (((OpenGLModel) this).aClass84Array10300 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass84Array10300.length; i++) {
				Class84 class84 = ((OpenGLModel) this).aClass84Array10300[i];
				Class84 class84_2005_ = class84;
				if (class84.aClass84_1092 != null)
					class84_2005_ = class84.aClass84_1092;
				class84_2005_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_2005_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_2005_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_2005_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_2005_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_2005_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_2005_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_2005_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_2005_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((OpenGLModel) this).aClass175Array10332 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass175Array10332.length; i++) {
				Class175 class175 = ((OpenGLModel) this).aClass175Array10332[i];
				Class175 class175_2006_ = class175;
				if (class175.aClass175_2091 != null)
					class175_2006_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_2006_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_2006_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_2006_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	public Class572_Sub12_Sub18 method1447(Class572_Sub12_Sub18 class572_sub12_sub18) {
		if (((OpenGLModel) this).anInt10291 == 0)
			return null;
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i;
		int i_2007_;
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10125) > 0) {
			i = ((((OpenGLModel) this).aShort10322 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_2007_ = ((((OpenGLModel) this).aShort10318 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		} else {
			i = ((((OpenGLModel) this).aShort10322 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_2007_ = ((((OpenGLModel) this).aShort10318 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10125) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		}
		int i_2008_;
		int i_2009_;
		if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10053) > 0) {
			i_2008_ = ((((OpenGLModel) this).aShort10324 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_2009_ = ((((OpenGLModel) this).aShort10325 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		} else {
			i_2008_ = ((((OpenGLModel) this).aShort10324 - ((((OpenGLModel) this).aShort10317 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
			i_2009_ = ((((OpenGLModel) this).aShort10325 - ((((OpenGLModel) this).aShort10321 * ((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).anInt10053) >> 8)) >> ((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anInt10049);
		}
		int i_2010_ = i_2007_ - i + 1;
		int i_2011_ = i_2009_ - i_2008_ + 1;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1 = (Class572_Sub12_Sub18_Sub1) class572_sub12_sub18;
		Class572_Sub12_Sub18_Sub1 class572_sub12_sub18_sub1_2012_;
		if (class572_sub12_sub18_sub1 != null && class572_sub12_sub18_sub1.method10633(i_2010_, i_2011_)) {
			class572_sub12_sub18_sub1_2012_ = class572_sub12_sub18_sub1;
			class572_sub12_sub18_sub1_2012_.method10628();
		} else
			class572_sub12_sub18_sub1_2012_ = new Class572_Sub12_Sub18_Sub1((((OpenGLModel) this).aClass106_Sub1_10340), i_2010_, i_2011_);
		class572_sub12_sub18_sub1_2012_.method10634(i, i_2008_, i_2007_, i_2009_);
		method9550(class572_sub12_sub18_sub1_2012_);
		return class572_sub12_sub18_sub1_2012_;
	}

	public void method1448() {
		if (!((OpenGLModel) this).aBool10326) {
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			((OpenGLModel) this).aShort10278 = ((OpenGLModel) this).aShort10317;
			((OpenGLModel) this).aBool10326 = true;
		}
	}

	public void method1375(Class261 class261, Class90 class90, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((OpenGLModel) this).anInt10291 != 0) {
			Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10079);
			Class250 class250_2013_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
			Class250 class250_2014_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10094);
			class250_2013_.method3446(class261);
			class250_2014_.method3442(class250_2013_);
			class250_2014_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10183);
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			float[] fs = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10156);
			class250_2013_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10317), 0.0F, fs);
			float f = fs[0];
			float f_2015_ = fs[1];
			float f_2016_ = fs[2];
			class250_2013_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10321), 0.0F, fs);
			float f_2017_ = fs[0];
			float f_2018_ = fs[1];
			float f_2019_ = fs[2];
			for (int i_2020_ = 0; i_2020_ < 6; i_2020_++) {
				float[] fs_2021_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArrayArray10082[i_2020_]);
				float f_2022_ = (fs_2021_[0] * f + fs_2021_[1] * f_2015_ + fs_2021_[2] * f_2016_ + fs_2021_[3] + (float) ((OpenGLModel) this).anInt10271);
				float f_2023_ = (fs_2021_[0] * f_2017_ + fs_2021_[1] * f_2018_ + fs_2021_[2] * f_2019_ + fs_2021_[3] + (float) ((OpenGLModel) this).anInt10271);
				if (f_2022_ < 0.0F && f_2023_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2024_ = true;
				int i_2025_ = ((((OpenGLModel) this).aShort10322 + ((OpenGLModel) this).aShort10318) >> 1);
				int i_2026_ = ((((OpenGLModel) this).aShort10324 + ((OpenGLModel) this).aShort10325) >> 1);
				int i_2027_ = i_2025_;
				short i_2028_ = ((OpenGLModel) this).aShort10317;
				int i_2029_ = i_2026_;
				float f_2030_ = (class250_2014_.aFloatArray2728[0] * (float) i_2027_ + class250_2014_.aFloatArray2728[4] * (float) i_2028_ + class250_2014_.aFloatArray2728[8] * (float) i_2029_ + class250_2014_.aFloatArray2728[12]);
				float f_2031_ = (class250_2014_.aFloatArray2728[1] * (float) i_2027_ + class250_2014_.aFloatArray2728[5] * (float) i_2028_ + class250_2014_.aFloatArray2728[9] * (float) i_2029_ + class250_2014_.aFloatArray2728[13]);
				float f_2032_ = (class250_2014_.aFloatArray2728[2] * (float) i_2027_ + class250_2014_.aFloatArray2728[6] * (float) i_2028_ + class250_2014_.aFloatArray2728[10] * (float) i_2029_ + class250_2014_.aFloatArray2728[14]);
				float f_2033_ = (class250_2014_.aFloatArray2728[3] * (float) i_2027_ + class250_2014_.aFloatArray2728[7] * (float) i_2028_ + class250_2014_.aFloatArray2728[11] * (float) i_2029_ + class250_2014_.aFloatArray2728[15]);
				if (f_2032_ >= -f_2033_) {
					class90.anInt1230 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2030_ / f_2033_);
					class90.anInt1231 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2031_ / f_2033_);
				} else
					bool = true;
				i_2027_ = i_2025_;
				i_2028_ = ((OpenGLModel) this).aShort10321;
				i_2029_ = i_2026_;
				float f_2034_ = (class250_2014_.aFloatArray2728[0] * (float) i_2027_ + class250_2014_.aFloatArray2728[4] * (float) i_2028_ + class250_2014_.aFloatArray2728[8] * (float) i_2029_ + class250_2014_.aFloatArray2728[12]);
				float f_2035_ = (class250_2014_.aFloatArray2728[1] * (float) i_2027_ + class250_2014_.aFloatArray2728[5] * (float) i_2028_ + class250_2014_.aFloatArray2728[9] * (float) i_2029_ + class250_2014_.aFloatArray2728[13]);
				float f_2036_ = (class250_2014_.aFloatArray2728[2] * (float) i_2027_ + class250_2014_.aFloatArray2728[6] * (float) i_2028_ + class250_2014_.aFloatArray2728[10] * (float) i_2029_ + class250_2014_.aFloatArray2728[14]);
				float f_2037_ = (class250_2014_.aFloatArray2728[3] * (float) i_2027_ + class250_2014_.aFloatArray2728[7] * (float) i_2028_ + class250_2014_.aFloatArray2728[11] * (float) i_2029_ + class250_2014_.aFloatArray2728[15]);
				if (f_2036_ >= -f_2037_) {
					class90.anInt1234 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2034_ / f_2037_);
					class90.anInt1233 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2035_ / f_2037_);
				} else
					bool = true;
				if (bool) {
					if (f_2032_ < -f_2033_ && f_2036_ < -f_2037_)
						bool_2024_ = false;
					else if (f_2032_ < -f_2033_) {
						float f_2038_ = (f_2032_ + f_2033_) / (f_2036_ + f_2037_) - 1.0F;
						float f_2039_ = f_2030_ + f_2038_ * (f_2034_ - f_2030_);
						float f_2040_ = f_2031_ + f_2038_ * (f_2035_ - f_2031_);
						float f_2041_ = f_2033_ + f_2038_ * (f_2037_ - f_2033_);
						class90.anInt1230 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2039_ / f_2041_));
						class90.anInt1231 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2040_ / f_2041_));
					} else if (f_2036_ < -f_2037_) {
						float f_2042_ = (f_2036_ + f_2037_) / (f_2032_ + f_2033_) - 1.0F;
						float f_2043_ = f_2034_ + f_2042_ * (f_2030_ - f_2034_);
						float f_2044_ = f_2035_ + f_2042_ * (f_2031_ - f_2035_);
						float f_2045_ = f_2037_ + f_2042_ * (f_2033_ - f_2037_);
						class90.anInt1234 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2043_ / f_2045_));
						class90.anInt1233 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2044_ / f_2045_));
					}
				}
				if (bool_2024_) {
					if (f_2032_ / f_2033_ > f_2036_ / f_2037_) {
						float f_2046_ = (f_2030_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2047_ = (f_2033_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1230 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2046_ / f_2047_));
					} else {
						float f_2048_ = (f_2034_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2049_ = (f_2037_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1234 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2048_ / f_2049_));
					}
					class90.aBool1232 = true;
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method9396();
			((OpenGLModel) this).aClass106_Sub1_10340.method9481(class250_2013_);
			method9543();
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
			class250_2013_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10197);
			method9551(class250_2013_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public int method1435() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10271;
	}

	public void method1345(Class261 class261, int i, boolean bool) {
		if (((OpenGLModel) this).aShortArray10290 != null) {
			Class261 class261_2050_ = class261;
			if (bool) {
				class261_2050_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass261_10092);
				class261_2050_.method3573(class261);
			}
			float[] fs = new float[3];
			for (int i_2051_ = 0; i_2051_ < ((OpenGLModel) this).anInt10285; i_2051_++) {
				if ((i & ((OpenGLModel) this).aShortArray10290[i_2051_]) != 0) {
					class261_2050_.method3582((float) (((OpenGLModel) this).anIntArray10336[i_2051_]), (float) (((OpenGLModel) this).anIntArray10287[i_2051_]), (float) (((OpenGLModel) this).anIntArray10331[i_2051_]), fs);
					((OpenGLModel) this).anIntArray10336[i_2051_] = (int) fs[0];
					((OpenGLModel) this).anIntArray10287[i_2051_] = (int) fs[1];
					((OpenGLModel) this).anIntArray10331[i_2051_] = (int) fs[2];
				}
			}
		}
	}

	public int method1452() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10271;
	}

	public int method1453() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10313;
	}

	public int method1454() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).anInt10313;
	}

	public int method1455() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10318;
	}

	void method1429(int i, int[] is, int i_2052_, int i_2053_, int i_2054_, int i_2055_, boolean bool) {
		int i_2056_ = is.length;
		if (i == 0) {
			i_2052_ <<= 4;
			i_2053_ <<= 4;
			i_2054_ <<= 4;
			int i_2057_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_2058_ = 0; i_2058_ < i_2056_; i_2058_++) {
				int i_2059_ = is[i_2058_];
				if (i_2059_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2060_ = ((OpenGLModel) this).anIntArrayArray10289[i_2059_];
					for (int i_2061_ = 0; i_2061_ < is_2060_.length; i_2061_++) {
						int i_2062_ = is_2060_[i_2061_];
						anInt10342 += ((OpenGLModel) this).anIntArray10336[i_2062_];
						anInt10310 += ((OpenGLModel) this).anIntArray10287[i_2062_];
						anInt10344 += ((OpenGLModel) this).anIntArray10331[i_2062_];
						i_2057_++;
					}
				}
			}
			if (i_2057_ > 0) {
				anInt10342 = anInt10342 / i_2057_ + i_2052_;
				anInt10310 = anInt10310 / i_2057_ + i_2053_;
				anInt10344 = anInt10344 / i_2057_ + i_2054_;
			} else {
				anInt10342 = i_2052_;
				anInt10310 = i_2053_;
				anInt10344 = i_2054_;
			}
		} else if (i == 1) {
			i_2052_ <<= 4;
			i_2053_ <<= 4;
			i_2054_ <<= 4;
			for (int i_2063_ = 0; i_2063_ < i_2056_; i_2063_++) {
				int i_2064_ = is[i_2063_];
				if (i_2064_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2065_ = ((OpenGLModel) this).anIntArrayArray10289[i_2064_];
					for (int i_2066_ = 0; i_2066_ < is_2065_.length; i_2066_++) {
						int i_2067_ = is_2065_[i_2066_];
						((OpenGLModel) this).anIntArray10336[i_2067_] += i_2052_;
						((OpenGLModel) this).anIntArray10287[i_2067_] += i_2053_;
						((OpenGLModel) this).anIntArray10331[i_2067_] += i_2054_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_2068_ = 0; i_2068_ < i_2056_; i_2068_++) {
				int i_2069_ = is[i_2068_];
				if (i_2069_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2070_ = ((OpenGLModel) this).anIntArrayArray10289[i_2069_];
					if ((i_2055_ & 0x1) == 0) {
						for (int i_2071_ = 0; i_2071_ < is_2070_.length; i_2071_++) {
							int i_2072_ = is_2070_[i_2071_];
							((OpenGLModel) this).anIntArray10336[i_2072_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2072_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2072_] -= anInt10344;
							if (i_2054_ != 0) {
								int i_2073_ = Class325.anIntArray4103[i_2054_];
								int i_2074_ = Class325.anIntArray4105[i_2054_];
								int i_2075_ = (((((OpenGLModel) this).anIntArray10287[i_2072_]) * i_2073_ + (((OpenGLModel) this).anIntArray10336[i_2072_]) * i_2074_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_2072_] = ((((OpenGLModel) this).anIntArray10287[i_2072_]) * i_2074_ - (((OpenGLModel) this).anIntArray10336[i_2072_]) * i_2073_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2072_] = i_2075_;
							}
							if (i_2052_ != 0) {
								int i_2076_ = Class325.anIntArray4103[i_2052_];
								int i_2077_ = Class325.anIntArray4105[i_2052_];
								int i_2078_ = (((((OpenGLModel) this).anIntArray10287[i_2072_]) * i_2077_ - (((OpenGLModel) this).anIntArray10331[i_2072_]) * i_2076_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2072_] = ((((OpenGLModel) this).anIntArray10287[i_2072_]) * i_2076_ + (((OpenGLModel) this).anIntArray10331[i_2072_]) * i_2077_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_2072_] = i_2078_;
							}
							if (i_2053_ != 0) {
								int i_2079_ = Class325.anIntArray4103[i_2053_];
								int i_2080_ = Class325.anIntArray4105[i_2053_];
								int i_2081_ = (((((OpenGLModel) this).anIntArray10331[i_2072_]) * i_2079_ + (((OpenGLModel) this).anIntArray10336[i_2072_]) * i_2080_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2072_] = ((((OpenGLModel) this).anIntArray10331[i_2072_]) * i_2080_ - (((OpenGLModel) this).anIntArray10336[i_2072_]) * i_2079_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2072_] = i_2081_;
							}
							((OpenGLModel) this).anIntArray10336[i_2072_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2072_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2072_] += anInt10344;
						}
					} else {
						for (int i_2082_ = 0; i_2082_ < is_2070_.length; i_2082_++) {
							int i_2083_ = is_2070_[i_2082_];
							((OpenGLModel) this).anIntArray10336[i_2083_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2083_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2083_] -= anInt10344;
							if (i_2052_ != 0) {
								int i_2084_ = Class325.anIntArray4103[i_2052_];
								int i_2085_ = Class325.anIntArray4105[i_2052_];
								int i_2086_ = (((((OpenGLModel) this).anIntArray10287[i_2083_]) * i_2085_ - (((OpenGLModel) this).anIntArray10331[i_2083_]) * i_2084_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2083_] = ((((OpenGLModel) this).anIntArray10287[i_2083_]) * i_2084_ + (((OpenGLModel) this).anIntArray10331[i_2083_]) * i_2085_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_2083_] = i_2086_;
							}
							if (i_2054_ != 0) {
								int i_2087_ = Class325.anIntArray4103[i_2054_];
								int i_2088_ = Class325.anIntArray4105[i_2054_];
								int i_2089_ = (((((OpenGLModel) this).anIntArray10287[i_2083_]) * i_2087_ + (((OpenGLModel) this).anIntArray10336[i_2083_]) * i_2088_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_2083_] = ((((OpenGLModel) this).anIntArray10287[i_2083_]) * i_2088_ - (((OpenGLModel) this).anIntArray10336[i_2083_]) * i_2087_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2083_] = i_2089_;
							}
							if (i_2053_ != 0) {
								int i_2090_ = Class325.anIntArray4103[i_2053_];
								int i_2091_ = Class325.anIntArray4105[i_2053_];
								int i_2092_ = (((((OpenGLModel) this).anIntArray10331[i_2083_]) * i_2090_ + (((OpenGLModel) this).anIntArray10336[i_2083_]) * i_2091_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2083_] = ((((OpenGLModel) this).anIntArray10331[i_2083_]) * i_2091_ - (((OpenGLModel) this).anIntArray10336[i_2083_]) * i_2090_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2083_] = i_2092_;
							}
							((OpenGLModel) this).anIntArray10336[i_2083_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2083_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2083_] += anInt10344;
						}
					}
				}
			}
			if (bool) {
				for (int i_2093_ = 0; i_2093_ < i_2056_; i_2093_++) {
					int i_2094_ = is[i_2093_];
					if (i_2094_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2095_ = (((OpenGLModel) this).anIntArrayArray10289[i_2094_]);
						for (int i_2096_ = 0; i_2096_ < is_2095_.length; i_2096_++) {
							int i_2097_ = is_2095_[i_2096_];
							int i_2098_ = (((OpenGLModel) this).anIntArray10329[i_2097_]);
							int i_2099_ = (((OpenGLModel) this).anIntArray10329[i_2097_ + 1]);
							for (int i_2100_ = i_2098_; (i_2100_ < i_2099_ && (((OpenGLModel) this).aShortArray10330[i_2100_]) != 0); i_2100_++) {
								int i_2101_ = (((((OpenGLModel) this).aShortArray10330[i_2100_]) & 0xffff) - 1);
								if (i_2054_ != 0) {
									int i_2102_ = Class325.anIntArray4103[i_2054_];
									int i_2103_ = Class325.anIntArray4105[i_2054_];
									int i_2104_ = (((((OpenGLModel) this).aShortArray10293[i_2101_]) * i_2102_ + (((OpenGLModel) this).aShortArray10292[i_2101_]) * i_2103_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_2101_] = (short) (((((OpenGLModel) this).aShortArray10293[i_2101_]) * i_2103_ - (((OpenGLModel) this).aShortArray10292[i_2101_]) * i_2102_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_2101_] = (short) i_2104_;
								}
								if (i_2052_ != 0) {
									int i_2105_ = Class325.anIntArray4103[i_2052_];
									int i_2106_ = Class325.anIntArray4105[i_2052_];
									int i_2107_ = (((((OpenGLModel) this).aShortArray10293[i_2101_]) * i_2106_ - (((OpenGLModel) this).aShortArray10288[i_2101_]) * i_2105_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10288[i_2101_] = (short) (((((OpenGLModel) this).aShortArray10293[i_2101_]) * i_2105_ + (((OpenGLModel) this).aShortArray10288[i_2101_]) * i_2106_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_2101_] = (short) i_2107_;
								}
								if (i_2053_ != 0) {
									int i_2108_ = Class325.anIntArray4103[i_2053_];
									int i_2109_ = Class325.anIntArray4105[i_2053_];
									int i_2110_ = (((((OpenGLModel) this).aShortArray10288[i_2101_]) * i_2108_ + (((OpenGLModel) this).aShortArray10292[i_2101_]) * i_2109_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10288[i_2101_] = (short) (((((OpenGLModel) this).aShortArray10288[i_2101_]) * i_2109_ - (((OpenGLModel) this).aShortArray10292[i_2101_]) * i_2108_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_2101_] = (short) i_2110_;
								}
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
					((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
				if (((OpenGLModel) this).aClass142_10315 != null)
					((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
			}
		} else if (i == 3) {
			for (int i_2111_ = 0; i_2111_ < i_2056_; i_2111_++) {
				int i_2112_ = is[i_2111_];
				if (i_2112_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2113_ = ((OpenGLModel) this).anIntArrayArray10289[i_2112_];
					for (int i_2114_ = 0; i_2114_ < is_2113_.length; i_2114_++) {
						int i_2115_ = is_2113_[i_2114_];
						((OpenGLModel) this).anIntArray10336[i_2115_] -= anInt10342;
						((OpenGLModel) this).anIntArray10287[i_2115_] -= anInt10310;
						((OpenGLModel) this).anIntArray10331[i_2115_] -= anInt10344;
						((OpenGLModel) this).anIntArray10336[i_2115_] = (((OpenGLModel) this).anIntArray10336[i_2115_] * i_2052_) >> 7;
						((OpenGLModel) this).anIntArray10287[i_2115_] = (((OpenGLModel) this).anIntArray10287[i_2115_] * i_2053_) >> 7;
						((OpenGLModel) this).anIntArray10331[i_2115_] = (((OpenGLModel) this).anIntArray10331[i_2115_] * i_2054_) >> 7;
						((OpenGLModel) this).anIntArray10336[i_2115_] += anInt10342;
						((OpenGLModel) this).anIntArray10287[i_2115_] += anInt10310;
						((OpenGLModel) this).anIntArray10331[i_2115_] += anInt10344;
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2116_ = 0; i_2116_ < i_2056_; i_2116_++) {
					int i_2117_ = is[i_2116_];
					if (i_2117_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2118_ = (((OpenGLModel) this).anIntArrayArray10307[i_2117_]);
						for (int i_2119_ = 0; i_2119_ < is_2118_.length; i_2119_++) {
							int i_2120_ = is_2118_[i_2119_];
							int i_2121_ = (((((OpenGLModel) this).aByteArray10302[i_2120_]) & 0xff) + i_2052_ * 8);
							if (i_2121_ < 0)
								i_2121_ = 0;
							else if (i_2121_ > 255)
								i_2121_ = 255;
							((OpenGLModel) this).aByteArray10302[i_2120_] = (byte) i_2121_;
						}
						if (is_2118_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2122_ = 0; i_2122_ < ((OpenGLModel) this).anInt10333; i_2122_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2122_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2122_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2123_ = 0; i_2123_ < i_2056_; i_2123_++) {
					int i_2124_ = is[i_2123_];
					if (i_2124_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2125_ = (((OpenGLModel) this).anIntArrayArray10307[i_2124_]);
						for (int i_2126_ = 0; i_2126_ < is_2125_.length; i_2126_++) {
							int i_2127_ = is_2125_[i_2126_];
							int i_2128_ = ((((OpenGLModel) this).aShortArray10281[i_2127_]) & 0xffff);
							int i_2129_ = i_2128_ >> 10 & 0x3f;
							int i_2130_ = i_2128_ >> 7 & 0x7;
							int i_2131_ = i_2128_ & 0x7f;
							i_2129_ = i_2129_ + i_2052_ & 0x3f;
							i_2130_ += i_2053_ / 4;
							if (i_2130_ < 0)
								i_2130_ = 0;
							else if (i_2130_ > 7)
								i_2130_ = 7;
							i_2131_ += i_2054_;
							if (i_2131_ < 0)
								i_2131_ = 0;
							else if (i_2131_ > 127)
								i_2131_ = 127;
							((OpenGLModel) this).aShortArray10281[i_2127_] = (short) (i_2129_ << 10 | i_2130_ << 7 | i_2131_);
						}
						if (is_2125_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2132_ = 0; i_2132_ < ((OpenGLModel) this).anInt10333; i_2132_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2132_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2132_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2133_ = 0; i_2133_ < i_2056_; i_2133_++) {
					int i_2134_ = is[i_2133_];
					if (i_2134_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2135_ = (((OpenGLModel) this).anIntArrayArray10323[i_2134_]);
						for (int i_2136_ = 0; i_2136_ < is_2135_.length; i_2136_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2135_[i_2136_]]);
							((Class150) class150).anInt1698 += i_2052_;
							((Class150) class150).anInt1696 += i_2053_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2137_ = 0; i_2137_ < i_2056_; i_2137_++) {
					int i_2138_ = is[i_2137_];
					if (i_2138_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2139_ = (((OpenGLModel) this).anIntArrayArray10323[i_2138_]);
						for (int i_2140_ = 0; i_2140_ < is_2139_.length; i_2140_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2139_[i_2140_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_2052_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_2053_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2141_ = 0; i_2141_ < i_2056_; i_2141_++) {
					int i_2142_ = is[i_2141_];
					if (i_2142_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2143_ = (((OpenGLModel) this).anIntArrayArray10323[i_2142_]);
						for (int i_2144_ = 0; i_2144_ < is_2143_.length; i_2144_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2143_[i_2144_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_2052_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public int method1457() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10317;
	}

	static final int method9558(int i, int i_2145_) {
		i_2145_ = i_2145_ * (i & 0x7f) >> 7;
		if (i_2145_ < 2)
			i_2145_ = 2;
		else if (i_2145_ > 126)
			i_2145_ = 126;
		return (i & 0xff80) + i_2145_;
	}

	public void method1349(Class261 class261, Class90 class90, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((OpenGLModel) this).anInt10291 != 0) {
			Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10079);
			Class250 class250_2146_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
			Class250 class250_2147_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10094);
			class250_2146_.method3446(class261);
			class250_2147_.method3442(class250_2146_);
			class250_2147_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10183);
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			float[] fs = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10156);
			class250_2146_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10317), 0.0F, fs);
			float f = fs[0];
			float f_2148_ = fs[1];
			float f_2149_ = fs[2];
			class250_2146_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10321), 0.0F, fs);
			float f_2150_ = fs[0];
			float f_2151_ = fs[1];
			float f_2152_ = fs[2];
			for (int i_2153_ = 0; i_2153_ < 6; i_2153_++) {
				float[] fs_2154_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArrayArray10082[i_2153_]);
				float f_2155_ = (fs_2154_[0] * f + fs_2154_[1] * f_2148_ + fs_2154_[2] * f_2149_ + fs_2154_[3] + (float) ((OpenGLModel) this).anInt10271);
				float f_2156_ = (fs_2154_[0] * f_2150_ + fs_2154_[1] * f_2151_ + fs_2154_[2] * f_2152_ + fs_2154_[3] + (float) ((OpenGLModel) this).anInt10271);
				if (f_2155_ < 0.0F && f_2156_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2157_ = true;
				int i_2158_ = ((((OpenGLModel) this).aShort10322 + ((OpenGLModel) this).aShort10318) >> 1);
				int i_2159_ = ((((OpenGLModel) this).aShort10324 + ((OpenGLModel) this).aShort10325) >> 1);
				int i_2160_ = i_2158_;
				short i_2161_ = ((OpenGLModel) this).aShort10317;
				int i_2162_ = i_2159_;
				float f_2163_ = (class250_2147_.aFloatArray2728[0] * (float) i_2160_ + class250_2147_.aFloatArray2728[4] * (float) i_2161_ + class250_2147_.aFloatArray2728[8] * (float) i_2162_ + class250_2147_.aFloatArray2728[12]);
				float f_2164_ = (class250_2147_.aFloatArray2728[1] * (float) i_2160_ + class250_2147_.aFloatArray2728[5] * (float) i_2161_ + class250_2147_.aFloatArray2728[9] * (float) i_2162_ + class250_2147_.aFloatArray2728[13]);
				float f_2165_ = (class250_2147_.aFloatArray2728[2] * (float) i_2160_ + class250_2147_.aFloatArray2728[6] * (float) i_2161_ + class250_2147_.aFloatArray2728[10] * (float) i_2162_ + class250_2147_.aFloatArray2728[14]);
				float f_2166_ = (class250_2147_.aFloatArray2728[3] * (float) i_2160_ + class250_2147_.aFloatArray2728[7] * (float) i_2161_ + class250_2147_.aFloatArray2728[11] * (float) i_2162_ + class250_2147_.aFloatArray2728[15]);
				if (f_2165_ >= -f_2166_) {
					class90.anInt1230 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2163_ / f_2166_);
					class90.anInt1231 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2164_ / f_2166_);
				} else
					bool = true;
				i_2160_ = i_2158_;
				i_2161_ = ((OpenGLModel) this).aShort10321;
				i_2162_ = i_2159_;
				float f_2167_ = (class250_2147_.aFloatArray2728[0] * (float) i_2160_ + class250_2147_.aFloatArray2728[4] * (float) i_2161_ + class250_2147_.aFloatArray2728[8] * (float) i_2162_ + class250_2147_.aFloatArray2728[12]);
				float f_2168_ = (class250_2147_.aFloatArray2728[1] * (float) i_2160_ + class250_2147_.aFloatArray2728[5] * (float) i_2161_ + class250_2147_.aFloatArray2728[9] * (float) i_2162_ + class250_2147_.aFloatArray2728[13]);
				float f_2169_ = (class250_2147_.aFloatArray2728[2] * (float) i_2160_ + class250_2147_.aFloatArray2728[6] * (float) i_2161_ + class250_2147_.aFloatArray2728[10] * (float) i_2162_ + class250_2147_.aFloatArray2728[14]);
				float f_2170_ = (class250_2147_.aFloatArray2728[3] * (float) i_2160_ + class250_2147_.aFloatArray2728[7] * (float) i_2161_ + class250_2147_.aFloatArray2728[11] * (float) i_2162_ + class250_2147_.aFloatArray2728[15]);
				if (f_2169_ >= -f_2170_) {
					class90.anInt1234 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2167_ / f_2170_);
					class90.anInt1233 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2168_ / f_2170_);
				} else
					bool = true;
				if (bool) {
					if (f_2165_ < -f_2166_ && f_2169_ < -f_2170_)
						bool_2157_ = false;
					else if (f_2165_ < -f_2166_) {
						float f_2171_ = (f_2165_ + f_2166_) / (f_2169_ + f_2170_) - 1.0F;
						float f_2172_ = f_2163_ + f_2171_ * (f_2167_ - f_2163_);
						float f_2173_ = f_2164_ + f_2171_ * (f_2168_ - f_2164_);
						float f_2174_ = f_2166_ + f_2171_ * (f_2170_ - f_2166_);
						class90.anInt1230 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2172_ / f_2174_));
						class90.anInt1231 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2173_ / f_2174_));
					} else if (f_2169_ < -f_2170_) {
						float f_2175_ = (f_2169_ + f_2170_) / (f_2165_ + f_2166_) - 1.0F;
						float f_2176_ = f_2167_ + f_2175_ * (f_2163_ - f_2167_);
						float f_2177_ = f_2168_ + f_2175_ * (f_2164_ - f_2168_);
						float f_2178_ = f_2170_ + f_2175_ * (f_2166_ - f_2170_);
						class90.anInt1234 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2176_ / f_2178_));
						class90.anInt1233 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2177_ / f_2178_));
					}
				}
				if (bool_2157_) {
					if (f_2165_ / f_2166_ > f_2169_ / f_2170_) {
						float f_2179_ = (f_2163_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2180_ = (f_2166_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1230 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2179_ / f_2180_));
					} else {
						float f_2181_ = (f_2167_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2182_ = (f_2170_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1234 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2181_ / f_2182_));
					}
					class90.aBool1232 = true;
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method9396();
			((OpenGLModel) this).aClass106_Sub1_10340.method9481(class250_2146_);
			method9543();
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
			class250_2146_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10197);
			method9551(class250_2146_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public int method1460() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10324;
	}

	public void method1354(int i, int i_2183_, int i_2184_, int i_2185_) {
		for (int i_2186_ = 0; i_2186_ < ((OpenGLModel) this).anInt10299; i_2186_++) {
			int i_2187_ = ((OpenGLModel) this).aShortArray10281[i_2186_] & 0xffff;
			int i_2188_ = i_2187_ >> 10 & 0x3f;
			int i_2189_ = i_2187_ >> 7 & 0x7;
			int i_2190_ = i_2187_ & 0x7f;
			if (i != -1)
				i_2188_ += (i - i_2188_) * i_2185_ >> 7;
			if (i_2183_ != -1)
				i_2189_ += (i_2183_ - i_2189_) * i_2185_ >> 7;
			if (i_2184_ != -1)
				i_2190_ += (i_2184_ - i_2190_) * i_2185_ >> 7;
			((OpenGLModel) this).aShortArray10281[i_2186_] = (short) (i_2188_ << 10 | i_2189_ << 7 | i_2190_);
		}
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			for (int i_2191_ = 0; i_2191_ < ((OpenGLModel) this).anInt10333; i_2191_++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2191_];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2191_];
				((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public int method1462() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10325;
	}

	public int method1504() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10325;
	}

	public int method1416() {
		if (!((OpenGLModel) this).aBool10326)
			method1483();
		return ((OpenGLModel) this).aShort10278;
	}

	public void method1465(int i) {
		((OpenGLModel) this).aShort10280 = (short) i;
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public void method1348() {
		if (!((OpenGLModel) this).aBool10326) {
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			((OpenGLModel) this).aShort10278 = ((OpenGLModel) this).aShort10317;
			((OpenGLModel) this).aBool10326 = true;
		}
	}

	public int method1344() {
		return ((OpenGLModel) this).aShort10304;
	}

	public boolean method1486() {
		return ((OpenGLModel) this).aBool10282;
	}

	public int method1469() {
		return ((OpenGLModel) this).aShort10304;
	}

	public byte[] method1470() {
		return ((OpenGLModel) this).aByteArray10302;
	}

	public byte[] method1471() {
		return ((OpenGLModel) this).aByteArray10302;
	}

	public void method1472(short i, short i_2192_) {
		for (int i_2193_ = 0; i_2193_ < ((OpenGLModel) this).anInt10299; i_2193_++) {
			if (((OpenGLModel) this).aShortArray10281[i_2193_] == i)
				((OpenGLModel) this).aShortArray10281[i_2193_] = i_2192_;
		}
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			for (int i_2194_ = 0; i_2194_ < ((OpenGLModel) this).anInt10333; i_2194_++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2194_];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2194_];
				((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	void method1498(int i, int i_2195_, int i_2196_, int i_2197_) {
		if (i == 0) {
			int i_2198_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_2199_ = 0; i_2199_ < ((OpenGLModel) this).anInt10285; i_2199_++) {
				anInt10342 += ((OpenGLModel) this).anIntArray10336[i_2199_];
				anInt10310 += ((OpenGLModel) this).anIntArray10287[i_2199_];
				anInt10344 += ((OpenGLModel) this).anIntArray10331[i_2199_];
				i_2198_++;
			}
			if (i_2198_ > 0) {
				anInt10342 = anInt10342 / i_2198_ + i_2195_;
				anInt10310 = anInt10310 / i_2198_ + i_2196_;
				anInt10344 = anInt10344 / i_2198_ + i_2197_;
			} else {
				anInt10342 = i_2195_;
				anInt10310 = i_2196_;
				anInt10344 = i_2197_;
			}
		} else if (i == 1) {
			for (int i_2200_ = 0; i_2200_ < ((OpenGLModel) this).anInt10285; i_2200_++) {
				((OpenGLModel) this).anIntArray10336[i_2200_] += i_2195_;
				((OpenGLModel) this).anIntArray10287[i_2200_] += i_2196_;
				((OpenGLModel) this).anIntArray10331[i_2200_] += i_2197_;
			}
		} else if (i == 2) {
			for (int i_2201_ = 0; i_2201_ < ((OpenGLModel) this).anInt10285; i_2201_++) {
				((OpenGLModel) this).anIntArray10336[i_2201_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2201_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2201_] -= anInt10344;
				if (i_2197_ != 0) {
					int i_2202_ = Class325.anIntArray4103[i_2197_];
					int i_2203_ = Class325.anIntArray4105[i_2197_];
					int i_2204_ = (((((OpenGLModel) this).anIntArray10287[i_2201_] * i_2202_) + (((OpenGLModel) this).anIntArray10336[i_2201_] * i_2203_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10287[i_2201_] = ((((OpenGLModel) this).anIntArray10287[i_2201_] * i_2203_) - (((OpenGLModel) this).anIntArray10336[i_2201_] * i_2202_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_2201_] = i_2204_;
				}
				if (i_2195_ != 0) {
					int i_2205_ = Class325.anIntArray4103[i_2195_];
					int i_2206_ = Class325.anIntArray4105[i_2195_];
					int i_2207_ = (((((OpenGLModel) this).anIntArray10287[i_2201_] * i_2206_) - (((OpenGLModel) this).anIntArray10331[i_2201_] * i_2205_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_2201_] = ((((OpenGLModel) this).anIntArray10287[i_2201_] * i_2205_) + (((OpenGLModel) this).anIntArray10331[i_2201_] * i_2206_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10287[i_2201_] = i_2207_;
				}
				if (i_2196_ != 0) {
					int i_2208_ = Class325.anIntArray4103[i_2196_];
					int i_2209_ = Class325.anIntArray4105[i_2196_];
					int i_2210_ = (((((OpenGLModel) this).anIntArray10331[i_2201_] * i_2208_) + (((OpenGLModel) this).anIntArray10336[i_2201_] * i_2209_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_2201_] = ((((OpenGLModel) this).anIntArray10331[i_2201_] * i_2209_) - (((OpenGLModel) this).anIntArray10336[i_2201_] * i_2208_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_2201_] = i_2210_;
				}
				((OpenGLModel) this).anIntArray10336[i_2201_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2201_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2201_] += anInt10344;
			}
		} else if (i == 3) {
			for (int i_2211_ = 0; i_2211_ < ((OpenGLModel) this).anInt10285; i_2211_++) {
				((OpenGLModel) this).anIntArray10336[i_2211_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2211_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2211_] -= anInt10344;
				((OpenGLModel) this).anIntArray10336[i_2211_] = (((OpenGLModel) this).anIntArray10336[i_2211_] * i_2195_ / 128);
				((OpenGLModel) this).anIntArray10287[i_2211_] = (((OpenGLModel) this).anIntArray10287[i_2211_] * i_2196_ / 128);
				((OpenGLModel) this).anIntArray10331[i_2211_] = (((OpenGLModel) this).anIntArray10331[i_2211_] * i_2197_ / 128);
				((OpenGLModel) this).anIntArray10336[i_2211_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2211_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2211_] += anInt10344;
			}
		} else if (i == 5) {
			for (int i_2212_ = 0; i_2212_ < ((OpenGLModel) this).anInt10299; i_2212_++) {
				int i_2213_ = ((((OpenGLModel) this).aByteArray10302[i_2212_] & 0xff) + i_2195_ * 8);
				if (i_2213_ < 0)
					i_2213_ = 0;
				else if (i_2213_ > 255)
					i_2213_ = 255;
				((OpenGLModel) this).aByteArray10302[i_2212_] = (byte) i_2213_;
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2214_ = 0; i_2214_ < ((OpenGLModel) this).anInt10333; i_2214_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2214_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2214_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_2215_ = 0; i_2215_ < ((OpenGLModel) this).anInt10299; i_2215_++) {
				int i_2216_ = ((OpenGLModel) this).aShortArray10281[i_2215_] & 0xffff;
				int i_2217_ = i_2216_ >> 10 & 0x3f;
				int i_2218_ = i_2216_ >> 7 & 0x7;
				int i_2219_ = i_2216_ & 0x7f;
				i_2217_ = i_2217_ + i_2195_ & 0x3f;
				i_2218_ += i_2196_ / 4;
				if (i_2218_ < 0)
					i_2218_ = 0;
				else if (i_2218_ > 7)
					i_2218_ = 7;
				i_2219_ += i_2197_;
				if (i_2219_ < 0)
					i_2219_ = 0;
				else if (i_2219_ > 127)
					i_2219_ = 127;
				((OpenGLModel) this).aShortArray10281[i_2215_] = (short) (i_2217_ << 10 | i_2218_ << 7 | i_2219_);
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2220_ = 0; i_2220_ < ((OpenGLModel) this).anInt10333; i_2220_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2220_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2220_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_2221_ = 0; i_2221_ < ((OpenGLModel) this).anInt10333; i_2221_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2221_];
				((Class150) class150).anInt1698 += i_2195_;
				((Class150) class150).anInt1696 += i_2196_;
			}
		} else if (i == 10) {
			for (int i_2222_ = 0; i_2222_ < ((OpenGLModel) this).anInt10333; i_2222_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2222_];
				((Class150) class150).anInt1697 = ((Class150) class150).anInt1697 * i_2195_ >> 7;
				((Class150) class150).anInt1695 = ((Class150) class150).anInt1695 * i_2196_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2223_ = 0; i_2223_ < ((OpenGLModel) this).anInt10333; i_2223_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2223_];
				((Class150) class150).anInt1693 = ((Class150) class150).anInt1693 + i_2195_ & 0x3fff;
			}
		}
	}

	public Class175[] method1507() {
		return ((OpenGLModel) this).aClass175Array10332;
	}

	public void method1475(short i, short i_2224_) {
		MapSize mapSize = ((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396;
		for (int i_2225_ = 0; i_2225_ < ((OpenGLModel) this).anInt10299; i_2225_++) {
			if (((OpenGLModel) this).aShortArray10306[i_2225_] == i)
				((OpenGLModel) this).aShortArray10306[i_2225_] = i_2224_;
		}
		byte i_2226_ = 0;
		byte i_2227_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, 1042773159);
			i_2226_ = class101.aByte1366;
			i_2227_ = class101.aByte1368;
		}
		byte i_2228_ = 0;
		byte i_2229_ = 0;
		if (i_2224_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_2224_ & 0xffff, -104031015);
			i_2228_ = class101.aByte1366;
			i_2229_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((OpenGLModel) this).aBool10283 = true;
		}
		if (i_2226_ != i_2228_ | i_2227_ != i_2229_) {
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2230_ = 0; i_2230_ < ((OpenGLModel) this).anInt10333; i_2230_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2230_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2230_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		}
	}

	public void method1476(short i, short i_2231_) {
		MapSize mapSize = ((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396;
		for (int i_2232_ = 0; i_2232_ < ((OpenGLModel) this).anInt10299; i_2232_++) {
			if (((OpenGLModel) this).aShortArray10306[i_2232_] == i)
				((OpenGLModel) this).aShortArray10306[i_2232_] = i_2231_;
		}
		byte i_2233_ = 0;
		byte i_2234_ = 0;
		if (i != -1) {
			MaterialInformation class101 = mapSize.getTexture(i & 0xffff, 494903442);
			i_2233_ = class101.aByte1366;
			i_2234_ = class101.aByte1368;
		}
		byte i_2235_ = 0;
		byte i_2236_ = 0;
		if (i_2231_ != -1) {
			MaterialInformation class101 = mapSize.getTexture(i_2231_ & 0xffff, 392811896);
			i_2235_ = class101.aByte1366;
			i_2236_ = class101.aByte1368;
			if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
				((OpenGLModel) this).aBool10283 = true;
		}
		if (i_2233_ != i_2235_ | i_2234_ != i_2236_) {
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2237_ = 0; i_2237_ < ((OpenGLModel) this).anInt10333; i_2237_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2237_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2237_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		}
	}

	public void method1358(int i, int i_2238_, int i_2239_) {
		for (int i_2240_ = 0; i_2240_ < ((OpenGLModel) this).anInt10285; i_2240_++) {
			if (i != 0)
				((OpenGLModel) this).anIntArray10336[i_2240_] += i;
			if (i_2238_ != 0)
				((OpenGLModel) this).anIntArray10287[i_2240_] += i_2238_;
			if (i_2239_ != 0)
				((OpenGLModel) this).anIntArray10331[i_2240_] += i_2239_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1477(int i, int i_2241_, int i_2242_, int i_2243_) {
		for (int i_2244_ = 0; i_2244_ < ((OpenGLModel) this).anInt10299; i_2244_++) {
			int i_2245_ = ((OpenGLModel) this).aShortArray10281[i_2244_] & 0xffff;
			int i_2246_ = i_2245_ >> 10 & 0x3f;
			int i_2247_ = i_2245_ >> 7 & 0x7;
			int i_2248_ = i_2245_ & 0x7f;
			if (i != -1)
				i_2246_ += (i - i_2246_) * i_2243_ >> 7;
			if (i_2241_ != -1)
				i_2247_ += (i_2241_ - i_2247_) * i_2243_ >> 7;
			if (i_2242_ != -1)
				i_2248_ += (i_2242_ - i_2248_) * i_2243_ >> 7;
			((OpenGLModel) this).aShortArray10281[i_2244_] = (short) (i_2246_ << 10 | i_2247_ << 7 | i_2248_);
		}
		if (((OpenGLModel) this).aClass173Array10334 != null) {
			for (int i_2249_ = 0; i_2249_ < ((OpenGLModel) this).anInt10333; i_2249_++) {
				Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2249_];
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2249_];
				((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public void method1473(byte i, byte[] is) {
		if (is == null) {
			for (int i_2250_ = 0; i_2250_ < ((OpenGLModel) this).anInt10299; i_2250_++)
				((OpenGLModel) this).aByteArray10302[i_2250_] = i;
		} else {
			for (int i_2251_ = 0; i_2251_ < ((OpenGLModel) this).anInt10299; i_2251_++) {
				int i_2252_ = 255 - ((255 - (is[i_2251_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((OpenGLModel) this).aByteArray10302[i_2251_] = (byte) i_2252_;
			}
		}
		if (((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
	}

	public Class84[] method1466() {
		return ((OpenGLModel) this).aClass84Array10300;
	}

	public Class84[] method1374() {
		return ((OpenGLModel) this).aClass84Array10300;
	}

	public Class84[] method1481() {
		return ((OpenGLModel) this).aClass84Array10300;
	}

	public Class175[] method1482() {
		return ((OpenGLModel) this).aClass175Array10332;
	}

	public int method1386() {
		if (!((OpenGLModel) this).aBool10326)
			method1483();
		return ((OpenGLModel) this).aShort10278;
	}

	public boolean method1484() {
		if (((OpenGLModel) this).aShortArray10306 == null)
			return true;
		for (int i = 0; i < ((OpenGLModel) this).aShortArray10306.length; i++) {
			if (((OpenGLModel) this).aShortArray10306[i] != -1) {
				MaterialInformation class101 = (((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396.getTexture(((OpenGLModel) this).aShortArray10306[i] & 0xffff, 1790985177));
				if (class101.textureId * 811137757 != -1 && !((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass168_10036.method2686(class101, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method1478() {
		if (((OpenGLModel) this).aShortArray10306 == null)
			return true;
		for (int i = 0; i < ((OpenGLModel) this).aShortArray10306.length; i++) {
			if (((OpenGLModel) this).aShortArray10306[i] != -1) {
				MaterialInformation class101 = (((OpenGLModel) this).aClass106_Sub1_10340.aClass94_1396.getTexture(((OpenGLModel) this).aShortArray10306[i] & 0xffff, 2085376703));
				if (class101.textureId * 811137757 != -1 && !((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass168_10036.method2686(class101, -1))
					return false;
			}
		}
		return true;
	}

	public int method1508() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10325;
	}

	public boolean method1444(int i, int i_2253_, Class261 class261, boolean bool, int i_2254_) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10183);
		boolean bool_2255_ = false;
		int i_2256_ = 2147483647;
		int i_2257_ = -2147483648;
		int i_2258_ = 2147483647;
		int i_2259_ = -2147483648;
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		int i_2260_ = ((((OpenGLModel) this).aShort10318 - ((OpenGLModel) this).aShort10322) >> 1);
		int i_2261_ = ((((OpenGLModel) this).aShort10321 - ((OpenGLModel) this).aShort10317) >> 1);
		int i_2262_ = ((((OpenGLModel) this).aShort10325 - ((OpenGLModel) this).aShort10324) >> 1);
		int i_2263_ = ((OpenGLModel) this).aShort10322 + i_2260_;
		int i_2264_ = ((OpenGLModel) this).aShort10317 + i_2261_;
		int i_2265_ = ((OpenGLModel) this).aShort10324 + i_2262_;
		int i_2266_ = i_2263_ - (i_2260_ << i_2254_);
		int i_2267_ = i_2264_ - (i_2261_ << i_2254_);
		int i_2268_ = i_2265_ - (i_2262_ << i_2254_);
		int i_2269_ = i_2263_ + (i_2260_ << i_2254_);
		int i_2270_ = i_2264_ + (i_2261_ << i_2254_);
		int i_2271_ = i_2265_ + (i_2262_ << i_2254_);
		anIntArray10320[0] = i_2266_;
		anIntArray10298[0] = i_2267_;
		anIntArray10341[0] = i_2268_;
		anIntArray10320[1] = i_2269_;
		anIntArray10298[1] = i_2267_;
		anIntArray10341[1] = i_2268_;
		anIntArray10320[2] = i_2266_;
		anIntArray10298[2] = i_2270_;
		anIntArray10341[2] = i_2268_;
		anIntArray10320[3] = i_2269_;
		anIntArray10298[3] = i_2270_;
		anIntArray10341[3] = i_2268_;
		anIntArray10320[4] = i_2266_;
		anIntArray10298[4] = i_2267_;
		anIntArray10341[4] = i_2271_;
		anIntArray10320[5] = i_2269_;
		anIntArray10298[5] = i_2267_;
		anIntArray10341[5] = i_2271_;
		anIntArray10320[6] = i_2266_;
		anIntArray10298[6] = i_2270_;
		anIntArray10341[6] = i_2271_;
		anIntArray10320[7] = i_2269_;
		anIntArray10298[7] = i_2270_;
		anIntArray10341[7] = i_2271_;
		for (int i_2272_ = 0; i_2272_ < 8; i_2272_++) {
			int i_2273_ = anIntArray10320[i_2272_];
			int i_2274_ = anIntArray10298[i_2272_];
			int i_2275_ = anIntArray10341[i_2272_];
			float f = (class250.aFloatArray2728[2] * (float) i_2273_ + class250.aFloatArray2728[6] * (float) i_2274_ + class250.aFloatArray2728[10] * (float) i_2275_ + class250.aFloatArray2728[14]);
			float f_2276_ = (class250.aFloatArray2728[3] * (float) i_2273_ + class250.aFloatArray2728[7] * (float) i_2274_ + class250.aFloatArray2728[11] * (float) i_2275_ + class250.aFloatArray2728[15]);
			if (f >= -f_2276_) {
				float f_2277_ = (class250.aFloatArray2728[0] * (float) i_2273_ + class250.aFloatArray2728[4] * (float) i_2274_ + class250.aFloatArray2728[8] * (float) i_2275_ + class250.aFloatArray2728[12]);
				float f_2278_ = (class250.aFloatArray2728[1] * (float) i_2273_ + class250.aFloatArray2728[5] * (float) i_2274_ + class250.aFloatArray2728[9] * (float) i_2275_ + class250.aFloatArray2728[13]);
				int i_2279_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10085) * f_2277_ / f_2276_);
				int i_2280_ = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10121) * f_2278_ / f_2276_);
				if (i_2279_ < i_2256_)
					i_2256_ = i_2279_;
				if (i_2279_ > i_2257_)
					i_2257_ = i_2279_;
				if (i_2280_ < i_2258_)
					i_2258_ = i_2280_;
				if (i_2280_ > i_2259_)
					i_2259_ = i_2280_;
				bool_2255_ = true;
			}
		}
		if (bool_2255_ && i > i_2256_ && i < i_2257_ && i_2253_ > i_2258_ && i_2253_ < i_2259_) {
			if (bool)
				return true;
			if ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157).length < ((OpenGLModel) this).anInt10291) {
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157 = new int[((OpenGLModel) this).anInt10291];
				((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191 = new int[((OpenGLModel) this).anInt10291];
			}
			int[] is = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10157);
			int[] is_2281_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).anIntArray10191);
			for (int i_2282_ = 0; i_2282_ < ((OpenGLModel) this).anInt10285; i_2282_++) {
				int i_2283_ = ((OpenGLModel) this).anIntArray10336[i_2282_];
				int i_2284_ = ((OpenGLModel) this).anIntArray10287[i_2282_];
				int i_2285_ = ((OpenGLModel) this).anIntArray10331[i_2282_];
				float f = (class250.aFloatArray2728[2] * (float) i_2283_ + class250.aFloatArray2728[6] * (float) i_2284_ + class250.aFloatArray2728[10] * (float) i_2285_ + class250.aFloatArray2728[14]);
				float f_2286_ = (class250.aFloatArray2728[3] * (float) i_2283_ + class250.aFloatArray2728[7] * (float) i_2284_ + class250.aFloatArray2728[11] * (float) i_2285_ + class250.aFloatArray2728[15]);
				if (f >= -f_2286_) {
					float f_2287_ = (class250.aFloatArray2728[0] * (float) i_2283_ + class250.aFloatArray2728[4] * (float) i_2284_ + class250.aFloatArray2728[8] * (float) i_2285_ + class250.aFloatArray2728[12]);
					float f_2288_ = (class250.aFloatArray2728[1] * (float) i_2283_ + class250.aFloatArray2728[5] * (float) i_2284_ + class250.aFloatArray2728[9] * (float) i_2285_ + class250.aFloatArray2728[13]);
					int i_2289_ = ((OpenGLModel) this).anIntArray10329[i_2282_];
					int i_2290_ = ((OpenGLModel) this).anIntArray10329[i_2282_ + 1];
					for (int i_2291_ = i_2289_; (i_2291_ < i_2290_ && (((OpenGLModel) this).aShortArray10330[i_2291_] != 0)); i_2291_++) {
						int i_2292_ = ((((OpenGLModel) this).aShortArray10330[i_2291_] & 0xffff) - 1);
						is[i_2292_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2287_ / f_2286_));
						is_2281_[i_2292_] = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2288_ / f_2286_));
					}
				} else {
					int i_2293_ = ((OpenGLModel) this).anIntArray10329[i_2282_];
					int i_2294_ = ((OpenGLModel) this).anIntArray10329[i_2282_ + 1];
					for (int i_2295_ = i_2293_; (i_2295_ < i_2294_ && (((OpenGLModel) this).aShortArray10330[i_2295_] != 0)); i_2295_++) {
						int i_2296_ = ((((OpenGLModel) this).aShortArray10330[i_2295_] & 0xffff) - 1);
						is[i_2296_] = -999999;
					}
				}
			}
			for (int i_2297_ = 0; i_2297_ < ((OpenGLModel) this).anInt10299; i_2297_++) {
				if (is[(((OpenGLModel) this).aShortArray10303[i_2297_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10327[i_2297_] & 0xffff)] != -999999 && is[(((OpenGLModel) this).aShortArray10305[i_2297_] & 0xffff)] != -999999 && method9549(i, i_2253_, is_2281_[((((OpenGLModel) this).aShortArray10303[i_2297_]) & 0xffff)], is_2281_[((((OpenGLModel) this).aShortArray10327[i_2297_]) & 0xffff)], is_2281_[((((OpenGLModel) this).aShortArray10305[i_2297_]) & 0xffff)], is[(((OpenGLModel) this).aShortArray10303[i_2297_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10327[i_2297_]) & 0xffff], is[(((OpenGLModel) this).aShortArray10305[i_2297_]) & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public int method1456() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10317;
	}

	void method1431(int i, int[] is, int i_2298_, int i_2299_, int i_2300_, int i_2301_, boolean bool) {
		int i_2302_ = is.length;
		if (i == 0) {
			i_2298_ <<= 4;
			i_2299_ <<= 4;
			i_2300_ <<= 4;
			int i_2303_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_2304_ = 0; i_2304_ < i_2302_; i_2304_++) {
				int i_2305_ = is[i_2304_];
				if (i_2305_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2306_ = ((OpenGLModel) this).anIntArrayArray10289[i_2305_];
					for (int i_2307_ = 0; i_2307_ < is_2306_.length; i_2307_++) {
						int i_2308_ = is_2306_[i_2307_];
						anInt10342 += ((OpenGLModel) this).anIntArray10336[i_2308_];
						anInt10310 += ((OpenGLModel) this).anIntArray10287[i_2308_];
						anInt10344 += ((OpenGLModel) this).anIntArray10331[i_2308_];
						i_2303_++;
					}
				}
			}
			if (i_2303_ > 0) {
				anInt10342 = anInt10342 / i_2303_ + i_2298_;
				anInt10310 = anInt10310 / i_2303_ + i_2299_;
				anInt10344 = anInt10344 / i_2303_ + i_2300_;
			} else {
				anInt10342 = i_2298_;
				anInt10310 = i_2299_;
				anInt10344 = i_2300_;
			}
		} else if (i == 1) {
			i_2298_ <<= 4;
			i_2299_ <<= 4;
			i_2300_ <<= 4;
			for (int i_2309_ = 0; i_2309_ < i_2302_; i_2309_++) {
				int i_2310_ = is[i_2309_];
				if (i_2310_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2311_ = ((OpenGLModel) this).anIntArrayArray10289[i_2310_];
					for (int i_2312_ = 0; i_2312_ < is_2311_.length; i_2312_++) {
						int i_2313_ = is_2311_[i_2312_];
						((OpenGLModel) this).anIntArray10336[i_2313_] += i_2298_;
						((OpenGLModel) this).anIntArray10287[i_2313_] += i_2299_;
						((OpenGLModel) this).anIntArray10331[i_2313_] += i_2300_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_2314_ = 0; i_2314_ < i_2302_; i_2314_++) {
				int i_2315_ = is[i_2314_];
				if (i_2315_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2316_ = ((OpenGLModel) this).anIntArrayArray10289[i_2315_];
					if ((i_2301_ & 0x1) == 0) {
						for (int i_2317_ = 0; i_2317_ < is_2316_.length; i_2317_++) {
							int i_2318_ = is_2316_[i_2317_];
							((OpenGLModel) this).anIntArray10336[i_2318_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2318_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2318_] -= anInt10344;
							if (i_2300_ != 0) {
								int i_2319_ = Class325.anIntArray4103[i_2300_];
								int i_2320_ = Class325.anIntArray4105[i_2300_];
								int i_2321_ = (((((OpenGLModel) this).anIntArray10287[i_2318_]) * i_2319_ + (((OpenGLModel) this).anIntArray10336[i_2318_]) * i_2320_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_2318_] = ((((OpenGLModel) this).anIntArray10287[i_2318_]) * i_2320_ - (((OpenGLModel) this).anIntArray10336[i_2318_]) * i_2319_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2318_] = i_2321_;
							}
							if (i_2298_ != 0) {
								int i_2322_ = Class325.anIntArray4103[i_2298_];
								int i_2323_ = Class325.anIntArray4105[i_2298_];
								int i_2324_ = (((((OpenGLModel) this).anIntArray10287[i_2318_]) * i_2323_ - (((OpenGLModel) this).anIntArray10331[i_2318_]) * i_2322_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2318_] = ((((OpenGLModel) this).anIntArray10287[i_2318_]) * i_2322_ + (((OpenGLModel) this).anIntArray10331[i_2318_]) * i_2323_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_2318_] = i_2324_;
							}
							if (i_2299_ != 0) {
								int i_2325_ = Class325.anIntArray4103[i_2299_];
								int i_2326_ = Class325.anIntArray4105[i_2299_];
								int i_2327_ = (((((OpenGLModel) this).anIntArray10331[i_2318_]) * i_2325_ + (((OpenGLModel) this).anIntArray10336[i_2318_]) * i_2326_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2318_] = ((((OpenGLModel) this).anIntArray10331[i_2318_]) * i_2326_ - (((OpenGLModel) this).anIntArray10336[i_2318_]) * i_2325_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2318_] = i_2327_;
							}
							((OpenGLModel) this).anIntArray10336[i_2318_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2318_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2318_] += anInt10344;
						}
					} else {
						for (int i_2328_ = 0; i_2328_ < is_2316_.length; i_2328_++) {
							int i_2329_ = is_2316_[i_2328_];
							((OpenGLModel) this).anIntArray10336[i_2329_] -= anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2329_] -= anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2329_] -= anInt10344;
							if (i_2298_ != 0) {
								int i_2330_ = Class325.anIntArray4103[i_2298_];
								int i_2331_ = Class325.anIntArray4105[i_2298_];
								int i_2332_ = (((((OpenGLModel) this).anIntArray10287[i_2329_]) * i_2331_ - (((OpenGLModel) this).anIntArray10331[i_2329_]) * i_2330_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2329_] = ((((OpenGLModel) this).anIntArray10287[i_2329_]) * i_2330_ + (((OpenGLModel) this).anIntArray10331[i_2329_]) * i_2331_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10287[i_2329_] = i_2332_;
							}
							if (i_2300_ != 0) {
								int i_2333_ = Class325.anIntArray4103[i_2300_];
								int i_2334_ = Class325.anIntArray4105[i_2300_];
								int i_2335_ = (((((OpenGLModel) this).anIntArray10287[i_2329_]) * i_2333_ + (((OpenGLModel) this).anIntArray10336[i_2329_]) * i_2334_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10287[i_2329_] = ((((OpenGLModel) this).anIntArray10287[i_2329_]) * i_2334_ - (((OpenGLModel) this).anIntArray10336[i_2329_]) * i_2333_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2329_] = i_2335_;
							}
							if (i_2299_ != 0) {
								int i_2336_ = Class325.anIntArray4103[i_2299_];
								int i_2337_ = Class325.anIntArray4105[i_2299_];
								int i_2338_ = (((((OpenGLModel) this).anIntArray10331[i_2329_]) * i_2336_ + (((OpenGLModel) this).anIntArray10336[i_2329_]) * i_2337_ + 16383) >> 14);
								((OpenGLModel) this).anIntArray10331[i_2329_] = ((((OpenGLModel) this).anIntArray10331[i_2329_]) * i_2337_ - (((OpenGLModel) this).anIntArray10336[i_2329_]) * i_2336_ + 16383) >> 14;
								((OpenGLModel) this).anIntArray10336[i_2329_] = i_2338_;
							}
							((OpenGLModel) this).anIntArray10336[i_2329_] += anInt10342;
							((OpenGLModel) this).anIntArray10287[i_2329_] += anInt10310;
							((OpenGLModel) this).anIntArray10331[i_2329_] += anInt10344;
						}
					}
				}
			}
			if (bool) {
				for (int i_2339_ = 0; i_2339_ < i_2302_; i_2339_++) {
					int i_2340_ = is[i_2339_];
					if (i_2340_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2341_ = (((OpenGLModel) this).anIntArrayArray10289[i_2340_]);
						for (int i_2342_ = 0; i_2342_ < is_2341_.length; i_2342_++) {
							int i_2343_ = is_2341_[i_2342_];
							int i_2344_ = (((OpenGLModel) this).anIntArray10329[i_2343_]);
							int i_2345_ = (((OpenGLModel) this).anIntArray10329[i_2343_ + 1]);
							for (int i_2346_ = i_2344_; (i_2346_ < i_2345_ && (((OpenGLModel) this).aShortArray10330[i_2346_]) != 0); i_2346_++) {
								int i_2347_ = (((((OpenGLModel) this).aShortArray10330[i_2346_]) & 0xffff) - 1);
								if (i_2300_ != 0) {
									int i_2348_ = Class325.anIntArray4103[i_2300_];
									int i_2349_ = Class325.anIntArray4105[i_2300_];
									int i_2350_ = (((((OpenGLModel) this).aShortArray10293[i_2347_]) * i_2348_ + (((OpenGLModel) this).aShortArray10292[i_2347_]) * i_2349_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_2347_] = (short) (((((OpenGLModel) this).aShortArray10293[i_2347_]) * i_2349_ - (((OpenGLModel) this).aShortArray10292[i_2347_]) * i_2348_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_2347_] = (short) i_2350_;
								}
								if (i_2298_ != 0) {
									int i_2351_ = Class325.anIntArray4103[i_2298_];
									int i_2352_ = Class325.anIntArray4105[i_2298_];
									int i_2353_ = (((((OpenGLModel) this).aShortArray10293[i_2347_]) * i_2352_ - (((OpenGLModel) this).aShortArray10288[i_2347_]) * i_2351_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10288[i_2347_] = (short) (((((OpenGLModel) this).aShortArray10293[i_2347_]) * i_2351_ + (((OpenGLModel) this).aShortArray10288[i_2347_]) * i_2352_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10293[i_2347_] = (short) i_2353_;
								}
								if (i_2299_ != 0) {
									int i_2354_ = Class325.anIntArray4103[i_2299_];
									int i_2355_ = Class325.anIntArray4105[i_2299_];
									int i_2356_ = (((((OpenGLModel) this).aShortArray10288[i_2347_]) * i_2354_ + (((OpenGLModel) this).aShortArray10292[i_2347_]) * i_2355_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10288[i_2347_] = (short) (((((OpenGLModel) this).aShortArray10288[i_2347_]) * i_2355_ - (((OpenGLModel) this).aShortArray10292[i_2347_]) * i_2354_ + 16383) >> 14);
									((OpenGLModel) this).aShortArray10292[i_2347_] = (short) i_2356_;
								}
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
					((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
				if (((OpenGLModel) this).aClass142_10315 != null)
					((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
			}
		} else if (i == 3) {
			for (int i_2357_ = 0; i_2357_ < i_2302_; i_2357_++) {
				int i_2358_ = is[i_2357_];
				if (i_2358_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2359_ = ((OpenGLModel) this).anIntArrayArray10289[i_2358_];
					for (int i_2360_ = 0; i_2360_ < is_2359_.length; i_2360_++) {
						int i_2361_ = is_2359_[i_2360_];
						((OpenGLModel) this).anIntArray10336[i_2361_] -= anInt10342;
						((OpenGLModel) this).anIntArray10287[i_2361_] -= anInt10310;
						((OpenGLModel) this).anIntArray10331[i_2361_] -= anInt10344;
						((OpenGLModel) this).anIntArray10336[i_2361_] = (((OpenGLModel) this).anIntArray10336[i_2361_] * i_2298_) >> 7;
						((OpenGLModel) this).anIntArray10287[i_2361_] = (((OpenGLModel) this).anIntArray10287[i_2361_] * i_2299_) >> 7;
						((OpenGLModel) this).anIntArray10331[i_2361_] = (((OpenGLModel) this).anIntArray10331[i_2361_] * i_2300_) >> 7;
						((OpenGLModel) this).anIntArray10336[i_2361_] += anInt10342;
						((OpenGLModel) this).anIntArray10287[i_2361_] += anInt10310;
						((OpenGLModel) this).anIntArray10331[i_2361_] += anInt10344;
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2362_ = 0; i_2362_ < i_2302_; i_2362_++) {
					int i_2363_ = is[i_2362_];
					if (i_2363_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2364_ = (((OpenGLModel) this).anIntArrayArray10307[i_2363_]);
						for (int i_2365_ = 0; i_2365_ < is_2364_.length; i_2365_++) {
							int i_2366_ = is_2364_[i_2365_];
							int i_2367_ = (((((OpenGLModel) this).aByteArray10302[i_2366_]) & 0xff) + i_2298_ * 8);
							if (i_2367_ < 0)
								i_2367_ = 0;
							else if (i_2367_ > 255)
								i_2367_ = 255;
							((OpenGLModel) this).aByteArray10302[i_2366_] = (byte) i_2367_;
						}
						if (is_2364_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2368_ = 0; i_2368_ < ((OpenGLModel) this).anInt10333; i_2368_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2368_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2368_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2369_ = 0; i_2369_ < i_2302_; i_2369_++) {
					int i_2370_ = is[i_2369_];
					if (i_2370_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2371_ = (((OpenGLModel) this).anIntArrayArray10307[i_2370_]);
						for (int i_2372_ = 0; i_2372_ < is_2371_.length; i_2372_++) {
							int i_2373_ = is_2371_[i_2372_];
							int i_2374_ = ((((OpenGLModel) this).aShortArray10281[i_2373_]) & 0xffff);
							int i_2375_ = i_2374_ >> 10 & 0x3f;
							int i_2376_ = i_2374_ >> 7 & 0x7;
							int i_2377_ = i_2374_ & 0x7f;
							i_2375_ = i_2375_ + i_2298_ & 0x3f;
							i_2376_ += i_2299_ / 4;
							if (i_2376_ < 0)
								i_2376_ = 0;
							else if (i_2376_ > 7)
								i_2376_ = 7;
							i_2377_ += i_2300_;
							if (i_2377_ < 0)
								i_2377_ = 0;
							else if (i_2377_ > 127)
								i_2377_ = 127;
							((OpenGLModel) this).aShortArray10281[i_2373_] = (short) (i_2375_ << 10 | i_2376_ << 7 | i_2377_);
						}
						if (is_2371_.length > 0 && ((OpenGLModel) this).aClass142_10270 != null)
							((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2378_ = 0; i_2378_ < ((OpenGLModel) this).anInt10333; i_2378_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2378_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2378_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2379_ = 0; i_2379_ < i_2302_; i_2379_++) {
					int i_2380_ = is[i_2379_];
					if (i_2380_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2381_ = (((OpenGLModel) this).anIntArrayArray10323[i_2380_]);
						for (int i_2382_ = 0; i_2382_ < is_2381_.length; i_2382_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2381_[i_2382_]]);
							((Class150) class150).anInt1698 += i_2298_;
							((Class150) class150).anInt1696 += i_2299_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2383_ = 0; i_2383_ < i_2302_; i_2383_++) {
					int i_2384_ = is[i_2383_];
					if (i_2384_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2385_ = (((OpenGLModel) this).anIntArrayArray10323[i_2384_]);
						for (int i_2386_ = 0; i_2386_ < is_2385_.length; i_2386_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2385_[i_2386_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_2298_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_2299_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2387_ = 0; i_2387_ < i_2302_; i_2387_++) {
					int i_2388_ = is[i_2387_];
					if (i_2388_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2389_ = (((OpenGLModel) this).anIntArrayArray10323[i_2388_]);
						for (int i_2390_ = 0; i_2390_ < is_2389_.length; i_2390_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2389_[i_2390_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_2298_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method1487(int i) {
		int i_2391_ = Class325.anIntArray4103[i];
		int i_2392_ = Class325.anIntArray4105[i];
		for (int i_2393_ = 0; i_2393_ < ((OpenGLModel) this).anInt10285; i_2393_++) {
			int i_2394_ = ((((OpenGLModel) this).anIntArray10287[i_2393_] * i_2392_ - ((OpenGLModel) this).anIntArray10331[i_2393_] * i_2391_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_2393_] = ((((OpenGLModel) this).anIntArray10287[i_2393_] * i_2391_ + ((OpenGLModel) this).anIntArray10331[i_2393_] * i_2392_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_2393_] = i_2394_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1357(int i) {
		int i_2395_ = Class325.anIntArray4103[i];
		int i_2396_ = Class325.anIntArray4105[i];
		for (int i_2397_ = 0; i_2397_ < ((OpenGLModel) this).anInt10285; i_2397_++) {
			int i_2398_ = ((((OpenGLModel) this).anIntArray10287[i_2397_] * i_2396_ - ((OpenGLModel) this).anIntArray10331[i_2397_] * i_2395_) >> 14);
			((OpenGLModel) this).anIntArray10331[i_2397_] = ((((OpenGLModel) this).anIntArray10287[i_2397_] * i_2395_ + ((OpenGLModel) this).anIntArray10331[i_2397_] * i_2396_) >> 14);
			((OpenGLModel) this).anIntArray10287[i_2397_] = i_2398_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1442() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10285; i++)
			((OpenGLModel) this).anIntArray10331[i] = -((OpenGLModel) this).anIntArray10331[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10291; i++)
			((OpenGLModel) this).aShortArray10288[i] = (short) -((OpenGLModel) this).aShortArray10288[i];
		for (int i = 0; i < ((OpenGLModel) this).anInt10299; i++) {
			short i_2399_ = ((OpenGLModel) this).aShortArray10303[i];
			((OpenGLModel) this).aShortArray10303[i] = ((OpenGLModel) this).aShortArray10305[i];
			((OpenGLModel) this).aShortArray10305[i] = i_2399_;
		}
		if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
			((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10315 != null)
			((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		if (((OpenGLModel) this).aClass139_10301 != null)
			((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public int method1382() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10317;
	}

	public void method1501(Class261 class261) {
		Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
		class250.method3446(class261);
		if (((OpenGLModel) this).aClass84Array10300 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass84Array10300.length; i++) {
				Class84 class84 = ((OpenGLModel) this).aClass84Array10300[i];
				Class84 class84_2400_ = class84;
				if (class84.aClass84_1092 != null)
					class84_2400_ = class84.aClass84_1092;
				class84_2400_.anInt1082 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -155884809);
				class84_2400_.anInt1090 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -431224967);
				class84_2400_.anInt1087 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1085 * 1899228195])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1085 * 1899228195)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1085 * 1899228195)])))) * -842554047);
				class84_2400_.anInt1097 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 177609361;
				class84_2400_.anInt1089 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * 1715975083);
				class84_2400_.anInt1094 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1083 * 2051859203])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1083 * 2051859203)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1083 * 2051859203)])))) * -1068692591);
				class84_2400_.anInt1086 = (int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * 375154663;
				class84_2400_.anInt1096 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1095331293);
				class84_2400_.anInt1093 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[class84.anInt1095 * -791263011])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class84.anInt1095 * -791263011)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class84.anInt1095 * -791263011)])))) * -1386464549);
			}
		}
		if (((OpenGLModel) this).aClass175Array10332 != null) {
			for (int i = 0; i < ((OpenGLModel) this).aClass175Array10332.length; i++) {
				Class175 class175 = ((OpenGLModel) this).aClass175Array10332[i];
				Class175 class175_2401_ = class175;
				if (class175.aClass175_2091 != null)
					class175_2401_ = class175.aClass175_2091;
				if (class175.aClass250_2096 != null)
					class175.aClass250_2096.method3442(class250);
				else
					class175.aClass250_2096 = new Class250(class250);
				class175_2401_.anInt2090 = ((int) (class250.aFloatArray2728[12] + ((class250.aFloatArray2728[0] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[4] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[8] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 2135482433);
				class175_2401_.anInt2093 = ((int) (class250.aFloatArray2728[13] + ((class250.aFloatArray2728[1] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[5] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[9] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * -1126324523);
				class175_2401_.anInt2095 = ((int) (class250.aFloatArray2728[14] + ((class250.aFloatArray2728[2] * (float) (((OpenGLModel) this).anIntArray10336[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[6] * (float) (((OpenGLModel) this).anIntArray10287[(class175.anInt2092 * -219631249)])) + (class250.aFloatArray2728[10] * (float) (((OpenGLModel) this).anIntArray10331[(class175.anInt2092 * -219631249)])))) * 1229093937);
			}
		}
	}

	public int method1490() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10322;
	}

	public int method1491() {
		if (!((OpenGLModel) this).aBool10319)
			method9556();
		return ((OpenGLModel) this).aShort10322;
	}

	public int method1372() {
		return ((OpenGLModel) this).aShort10280;
	}

	public int method1493() {
		return ((OpenGLModel) this).aShort10280;
	}

	public int method1468() {
		return ((OpenGLModel) this).aShort10304;
	}

	public void method1492(Class261 class261, Class90 class90, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((OpenGLModel) this).anInt10291 != 0) {
			Class250 class250 = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10079);
			Class250 class250_2402_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10093);
			Class250 class250_2403_ = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aClass250_10094);
			class250_2402_.method3446(class261);
			class250_2403_.method3442(class250_2402_);
			class250_2403_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10183);
			if (!((OpenGLModel) this).aBool10319)
				method9556();
			float[] fs = (((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloatArray10156);
			class250_2402_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10317), 0.0F, fs);
			float f = fs[0];
			float f_2404_ = fs[1];
			float f_2405_ = fs[2];
			class250_2402_.method3449(0.0F, (float) (((OpenGLModel) this).aShort10321), 0.0F, fs);
			float f_2406_ = fs[0];
			float f_2407_ = fs[1];
			float f_2408_ = fs[2];
			for (int i_2409_ = 0; i_2409_ < 6; i_2409_++) {
				float[] fs_2410_ = (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloatArrayArray10082[i_2409_]);
				float f_2411_ = (fs_2410_[0] * f + fs_2410_[1] * f_2404_ + fs_2410_[2] * f_2405_ + fs_2410_[3] + (float) ((OpenGLModel) this).anInt10271);
				float f_2412_ = (fs_2410_[0] * f_2406_ + fs_2410_[1] * f_2407_ + fs_2410_[2] * f_2408_ + fs_2410_[3] + (float) ((OpenGLModel) this).anInt10271);
				if (f_2411_ < 0.0F && f_2412_ < 0.0F)
					return;
			}
			if (class90 != null) {
				boolean bool = false;
				boolean bool_2413_ = true;
				int i_2414_ = ((((OpenGLModel) this).aShort10322 + ((OpenGLModel) this).aShort10318) >> 1);
				int i_2415_ = ((((OpenGLModel) this).aShort10324 + ((OpenGLModel) this).aShort10325) >> 1);
				int i_2416_ = i_2414_;
				short i_2417_ = ((OpenGLModel) this).aShort10317;
				int i_2418_ = i_2415_;
				float f_2419_ = (class250_2403_.aFloatArray2728[0] * (float) i_2416_ + class250_2403_.aFloatArray2728[4] * (float) i_2417_ + class250_2403_.aFloatArray2728[8] * (float) i_2418_ + class250_2403_.aFloatArray2728[12]);
				float f_2420_ = (class250_2403_.aFloatArray2728[1] * (float) i_2416_ + class250_2403_.aFloatArray2728[5] * (float) i_2417_ + class250_2403_.aFloatArray2728[9] * (float) i_2418_ + class250_2403_.aFloatArray2728[13]);
				float f_2421_ = (class250_2403_.aFloatArray2728[2] * (float) i_2416_ + class250_2403_.aFloatArray2728[6] * (float) i_2417_ + class250_2403_.aFloatArray2728[10] * (float) i_2418_ + class250_2403_.aFloatArray2728[14]);
				float f_2422_ = (class250_2403_.aFloatArray2728[3] * (float) i_2416_ + class250_2403_.aFloatArray2728[7] * (float) i_2417_ + class250_2403_.aFloatArray2728[11] * (float) i_2418_ + class250_2403_.aFloatArray2728[15]);
				if (f_2421_ >= -f_2422_) {
					class90.anInt1230 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2419_ / f_2422_);
					class90.anInt1231 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2420_ / f_2422_);
				} else
					bool = true;
				i_2416_ = i_2414_;
				i_2417_ = ((OpenGLModel) this).aShort10321;
				i_2418_ = i_2415_;
				float f_2423_ = (class250_2403_.aFloatArray2728[0] * (float) i_2416_ + class250_2403_.aFloatArray2728[4] * (float) i_2417_ + class250_2403_.aFloatArray2728[8] * (float) i_2418_ + class250_2403_.aFloatArray2728[12]);
				float f_2424_ = (class250_2403_.aFloatArray2728[1] * (float) i_2416_ + class250_2403_.aFloatArray2728[5] * (float) i_2417_ + class250_2403_.aFloatArray2728[9] * (float) i_2418_ + class250_2403_.aFloatArray2728[13]);
				float f_2425_ = (class250_2403_.aFloatArray2728[2] * (float) i_2416_ + class250_2403_.aFloatArray2728[6] * (float) i_2417_ + class250_2403_.aFloatArray2728[10] * (float) i_2418_ + class250_2403_.aFloatArray2728[14]);
				float f_2426_ = (class250_2403_.aFloatArray2728[3] * (float) i_2416_ + class250_2403_.aFloatArray2728[7] * (float) i_2417_ + class250_2403_.aFloatArray2728[11] * (float) i_2418_ + class250_2403_.aFloatArray2728[15]);
				if (f_2425_ >= -f_2426_) {
					class90.anInt1234 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085) * f_2423_ / f_2426_);
					class90.anInt1233 = (int) ((((Class106_Sub1) ((OpenGLModel) this).aClass106_Sub1_10340).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121) * f_2424_ / f_2426_);
				} else
					bool = true;
				if (bool) {
					if (f_2421_ < -f_2422_ && f_2425_ < -f_2426_)
						bool_2413_ = false;
					else if (f_2421_ < -f_2422_) {
						float f_2427_ = (f_2421_ + f_2422_) / (f_2425_ + f_2426_) - 1.0F;
						float f_2428_ = f_2419_ + f_2427_ * (f_2423_ - f_2419_);
						float f_2429_ = f_2420_ + f_2427_ * (f_2424_ - f_2420_);
						float f_2430_ = f_2422_ + f_2427_ * (f_2426_ - f_2422_);
						class90.anInt1230 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2428_ / f_2430_));
						class90.anInt1231 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2429_ / f_2430_));
					} else if (f_2425_ < -f_2426_) {
						float f_2431_ = (f_2425_ + f_2426_) / (f_2421_ + f_2422_) - 1.0F;
						float f_2432_ = f_2423_ + f_2431_ * (f_2419_ - f_2423_);
						float f_2433_ = f_2424_ + f_2431_ * (f_2420_ - f_2424_);
						float f_2434_ = f_2426_ + f_2431_ * (f_2422_ - f_2426_);
						class90.anInt1234 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2432_ / f_2434_));
						class90.anInt1233 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10075) + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10121 * f_2433_ / f_2434_));
					}
				}
				if (bool_2413_) {
					if (f_2421_ / f_2422_ > f_2425_ / f_2426_) {
						float f_2435_ = (f_2419_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2436_ = (f_2422_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1230 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2435_ / f_2436_));
					} else {
						float f_2437_ = (f_2423_ + (class250.aFloatArray2728[0] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[12]);
						float f_2438_ = (f_2426_ + (class250.aFloatArray2728[3] * (float) ((OpenGLModel) this).anInt10271) + class250.aFloatArray2728[15]);
						class90.anInt1229 = (int) ((((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10084) - (float) class90.anInt1234 + (((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aFloat10085 * f_2437_ / f_2438_));
					}
					class90.aBool1232 = true;
				}
			}
			((OpenGLModel) this).aClass106_Sub1_10340.method9396();
			((OpenGLModel) this).aClass106_Sub1_10340.method9481(class250_2402_);
			method9543();
			((OpenGLModel) this).aClass106_Sub1_10340.method9495();
			class250_2402_.method3445(((Class106_Sub1) (((OpenGLModel) this).aClass106_Sub1_10340)).aClass250_10197);
			method9551(class250_2402_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public boolean method1496() {
		return ((OpenGLModel) this).aBool10283;
	}

	Model method9559(OpenGLModel class89_sub1_2439_, OpenGLModel class89_sub1_2440_, int i, boolean bool, boolean bool_2441_) {
		((OpenGLModel) class89_sub1_2439_).aByte10279 = (byte) 0;
		((OpenGLModel) class89_sub1_2439_).anInt10277 = i;
		((OpenGLModel) class89_sub1_2439_).anInt10294 = ((OpenGLModel) this).anInt10294;
		((OpenGLModel) class89_sub1_2439_).aShort10280 = ((OpenGLModel) this).aShort10280;
		((OpenGLModel) class89_sub1_2439_).aShort10304 = ((OpenGLModel) this).aShort10304;
		((OpenGLModel) class89_sub1_2439_).anInt10284 = ((OpenGLModel) this).anInt10284;
		((OpenGLModel) class89_sub1_2439_).anInt10285 = ((OpenGLModel) this).anInt10285;
		((OpenGLModel) class89_sub1_2439_).anInt10291 = ((OpenGLModel) this).anInt10291;
		((OpenGLModel) class89_sub1_2439_).anInt10299 = ((OpenGLModel) this).anInt10299;
		((OpenGLModel) class89_sub1_2439_).anInt10308 = ((OpenGLModel) this).anInt10308;
		((OpenGLModel) class89_sub1_2439_).anInt10333 = ((OpenGLModel) this).anInt10333;
		if ((i & 0x100) != 0)
			((OpenGLModel) class89_sub1_2439_).aBool10282 = true;
		else
			((OpenGLModel) class89_sub1_2439_).aBool10282 = ((OpenGLModel) this).aBool10282;
		((OpenGLModel) class89_sub1_2439_).aBool10283 = ((OpenGLModel) this).aBool10283;
		boolean bool_2442_ = Class140.method2346(i, ((OpenGLModel) this).anInt10294);
		boolean bool_2443_ = Class140.method2347(i, ((OpenGLModel) this).anInt10294);
		boolean bool_2444_ = Class140.method2348(i, ((OpenGLModel) this).anInt10294);
		boolean bool_2445_ = bool_2442_ | bool_2443_ | bool_2444_;
		if (bool_2445_) {
			if (bool_2442_) {
				if (((OpenGLModel) class89_sub1_2440_).anIntArray10336 == null || ((((OpenGLModel) class89_sub1_2440_).anIntArray10336).length < ((OpenGLModel) this).anInt10284))
					((OpenGLModel) class89_sub1_2439_).anIntArray10336 = ((OpenGLModel) class89_sub1_2440_).anIntArray10336 = new int[((OpenGLModel) this).anInt10284];
				else
					((OpenGLModel) class89_sub1_2439_).anIntArray10336 = ((OpenGLModel) class89_sub1_2440_).anIntArray10336;
			} else
				((OpenGLModel) class89_sub1_2439_).anIntArray10336 = ((OpenGLModel) this).anIntArray10336;
			if (bool_2443_) {
				if (((OpenGLModel) class89_sub1_2440_).anIntArray10287 == null || ((((OpenGLModel) class89_sub1_2440_).anIntArray10287).length < ((OpenGLModel) this).anInt10284))
					((OpenGLModel) class89_sub1_2439_).anIntArray10287 = ((OpenGLModel) class89_sub1_2440_).anIntArray10287 = new int[((OpenGLModel) this).anInt10284];
				else
					((OpenGLModel) class89_sub1_2439_).anIntArray10287 = ((OpenGLModel) class89_sub1_2440_).anIntArray10287;
			} else
				((OpenGLModel) class89_sub1_2439_).anIntArray10287 = ((OpenGLModel) this).anIntArray10287;
			if (bool_2444_) {
				if (((OpenGLModel) class89_sub1_2440_).anIntArray10331 == null || ((((OpenGLModel) class89_sub1_2440_).anIntArray10331).length < ((OpenGLModel) this).anInt10284))
					((OpenGLModel) class89_sub1_2439_).anIntArray10331 = ((OpenGLModel) class89_sub1_2440_).anIntArray10331 = new int[((OpenGLModel) this).anInt10284];
				else
					((OpenGLModel) class89_sub1_2439_).anIntArray10331 = ((OpenGLModel) class89_sub1_2440_).anIntArray10331;
			} else
				((OpenGLModel) class89_sub1_2439_).anIntArray10331 = ((OpenGLModel) this).anIntArray10331;
			for (int i_2446_ = 0; i_2446_ < ((OpenGLModel) this).anInt10284; i_2446_++) {
				if (bool_2442_)
					((OpenGLModel) class89_sub1_2439_).anIntArray10336[i_2446_] = ((OpenGLModel) this).anIntArray10336[i_2446_];
				if (bool_2443_)
					((OpenGLModel) class89_sub1_2439_).anIntArray10287[i_2446_] = ((OpenGLModel) this).anIntArray10287[i_2446_];
				if (bool_2444_)
					((OpenGLModel) class89_sub1_2439_).anIntArray10331[i_2446_] = ((OpenGLModel) this).anIntArray10331[i_2446_];
			}
		} else {
			((OpenGLModel) class89_sub1_2439_).anIntArray10336 = ((OpenGLModel) this).anIntArray10336;
			((OpenGLModel) class89_sub1_2439_).anIntArray10287 = ((OpenGLModel) this).anIntArray10287;
			((OpenGLModel) class89_sub1_2439_).anIntArray10331 = ((OpenGLModel) this).anIntArray10331;
		}
		if (Class140.method2431(i, ((OpenGLModel) this).anInt10294)) {
			if (bool)
				((OpenGLModel) class89_sub1_2439_).aByte10279 |= 0x1;
			((OpenGLModel) class89_sub1_2439_).aClass142_10309 = ((OpenGLModel) class89_sub1_2440_).aClass142_10309;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10309).aByte1613 = ((Class142) ((OpenGLModel) this).aClass142_10309).aByte1613;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10309).anInterface9_1615 = (((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615);
		} else if (Class140.method2357(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) class89_sub1_2439_).aClass142_10309 = ((OpenGLModel) this).aClass142_10309;
		else
			((OpenGLModel) class89_sub1_2439_).aClass142_10309 = null;
		if (Class140.method2376(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aShortArray10281 == null || (((OpenGLModel) class89_sub1_2440_).aShortArray10281.length < ((OpenGLModel) this).anInt10299))
				((OpenGLModel) class89_sub1_2439_).aShortArray10281 = ((OpenGLModel) class89_sub1_2440_).aShortArray10281 = new short[((OpenGLModel) this).anInt10299];
			else
				((OpenGLModel) class89_sub1_2439_).aShortArray10281 = ((OpenGLModel) class89_sub1_2440_).aShortArray10281;
			for (int i_2447_ = 0; i_2447_ < ((OpenGLModel) this).anInt10299; i_2447_++)
				((OpenGLModel) class89_sub1_2439_).aShortArray10281[i_2447_] = ((OpenGLModel) this).aShortArray10281[i_2447_];
		} else
			((OpenGLModel) class89_sub1_2439_).aShortArray10281 = ((OpenGLModel) this).aShortArray10281;
		if (Class140.method2352(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aByteArray10302 == null || (((OpenGLModel) class89_sub1_2440_).aByteArray10302.length < ((OpenGLModel) this).anInt10299))
				((OpenGLModel) class89_sub1_2439_).aByteArray10302 = ((OpenGLModel) class89_sub1_2440_).aByteArray10302 = new byte[((OpenGLModel) this).anInt10299];
			else
				((OpenGLModel) class89_sub1_2439_).aByteArray10302 = ((OpenGLModel) class89_sub1_2440_).aByteArray10302;
			for (int i_2448_ = 0; i_2448_ < ((OpenGLModel) this).anInt10299; i_2448_++)
				((OpenGLModel) class89_sub1_2439_).aByteArray10302[i_2448_] = ((OpenGLModel) this).aByteArray10302[i_2448_];
		} else
			((OpenGLModel) class89_sub1_2439_).aByteArray10302 = ((OpenGLModel) this).aByteArray10302;
		if (Class140.method2364(i, ((OpenGLModel) this).anInt10294)) {
			if (bool)
				((OpenGLModel) class89_sub1_2439_).aByte10279 |= 0x2;
			((OpenGLModel) class89_sub1_2439_).aClass142_10270 = ((OpenGLModel) class89_sub1_2440_).aClass142_10270;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10270).aByte1613 = ((Class142) ((OpenGLModel) this).aClass142_10270).aByte1613;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10270).anInterface9_1615 = (((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615);
		} else if (Class140.method2418(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) class89_sub1_2439_).aClass142_10270 = ((OpenGLModel) this).aClass142_10270;
		else
			((OpenGLModel) class89_sub1_2439_).aClass142_10270 = null;
		if (Class140.method2350(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aShortArray10292 == null || (((OpenGLModel) class89_sub1_2440_).aShortArray10292.length < ((OpenGLModel) this).anInt10291)) {
				int i_2449_ = ((OpenGLModel) this).anInt10291;
				((OpenGLModel) class89_sub1_2439_).aShortArray10292 = ((OpenGLModel) class89_sub1_2440_).aShortArray10292 = new short[i_2449_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10293 = ((OpenGLModel) class89_sub1_2440_).aShortArray10293 = new short[i_2449_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10288 = ((OpenGLModel) class89_sub1_2440_).aShortArray10288 = new short[i_2449_];
			} else {
				((OpenGLModel) class89_sub1_2439_).aShortArray10292 = ((OpenGLModel) class89_sub1_2440_).aShortArray10292;
				((OpenGLModel) class89_sub1_2439_).aShortArray10293 = ((OpenGLModel) class89_sub1_2440_).aShortArray10293;
				((OpenGLModel) class89_sub1_2439_).aShortArray10288 = ((OpenGLModel) class89_sub1_2440_).aShortArray10288;
			}
			if (((OpenGLModel) this).aClass164_10296 != null) {
				if (((OpenGLModel) class89_sub1_2440_).aClass164_10296 == null)
					((OpenGLModel) class89_sub1_2440_).aClass164_10296 = new Class164();
				Class164 class164 = (((OpenGLModel) class89_sub1_2439_).aClass164_10296 = ((OpenGLModel) class89_sub1_2440_).aClass164_10296);
				if (((Class164) class164).aShortArray2036 == null || (((Class164) class164).aShortArray2036.length < ((OpenGLModel) this).anInt10291)) {
					int i_2450_ = ((OpenGLModel) this).anInt10291;
					((Class164) class164).aShortArray2036 = new short[i_2450_];
					((Class164) class164).aShortArray2033 = new short[i_2450_];
					((Class164) class164).aShortArray2035 = new short[i_2450_];
					((Class164) class164).aByteArray2034 = new byte[i_2450_];
				}
				for (int i_2451_ = 0; i_2451_ < ((OpenGLModel) this).anInt10291; i_2451_++) {
					((OpenGLModel) class89_sub1_2439_).aShortArray10292[i_2451_] = ((OpenGLModel) this).aShortArray10292[i_2451_];
					((OpenGLModel) class89_sub1_2439_).aShortArray10293[i_2451_] = ((OpenGLModel) this).aShortArray10293[i_2451_];
					((OpenGLModel) class89_sub1_2439_).aShortArray10288[i_2451_] = ((OpenGLModel) this).aShortArray10288[i_2451_];
					((Class164) class164).aShortArray2036[i_2451_] = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2036[i_2451_]);
					((Class164) class164).aShortArray2033[i_2451_] = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2033[i_2451_]);
					((Class164) class164).aShortArray2035[i_2451_] = (((Class164) ((OpenGLModel) this).aClass164_10296).aShortArray2035[i_2451_]);
					((Class164) class164).aByteArray2034[i_2451_] = (((Class164) ((OpenGLModel) this).aClass164_10296).aByteArray2034[i_2451_]);
				}
			} else {
				for (int i_2452_ = 0; i_2452_ < ((OpenGLModel) this).anInt10291; i_2452_++) {
					((OpenGLModel) class89_sub1_2439_).aShortArray10292[i_2452_] = ((OpenGLModel) this).aShortArray10292[i_2452_];
					((OpenGLModel) class89_sub1_2439_).aShortArray10293[i_2452_] = ((OpenGLModel) this).aShortArray10293[i_2452_];
					((OpenGLModel) class89_sub1_2439_).aShortArray10288[i_2452_] = ((OpenGLModel) this).aShortArray10288[i_2452_];
				}
			}
			((OpenGLModel) class89_sub1_2439_).aByteArray10295 = ((OpenGLModel) this).aByteArray10295;
		} else {
			((OpenGLModel) class89_sub1_2439_).aClass164_10296 = ((OpenGLModel) this).aClass164_10296;
			((OpenGLModel) class89_sub1_2439_).aShortArray10292 = ((OpenGLModel) this).aShortArray10292;
			((OpenGLModel) class89_sub1_2439_).aShortArray10293 = ((OpenGLModel) this).aShortArray10293;
			((OpenGLModel) class89_sub1_2439_).aShortArray10288 = ((OpenGLModel) this).aShortArray10288;
			((OpenGLModel) class89_sub1_2439_).aByteArray10295 = ((OpenGLModel) this).aByteArray10295;
		}
		if (Class140.method2366(i, ((OpenGLModel) this).anInt10294)) {
			if (bool)
				((OpenGLModel) class89_sub1_2439_).aByte10279 |= 0x4;
			((OpenGLModel) class89_sub1_2439_).aClass142_10315 = ((OpenGLModel) class89_sub1_2440_).aClass142_10315;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10315).aByte1613 = ((Class142) ((OpenGLModel) this).aClass142_10315).aByte1613;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10315).anInterface9_1615 = (((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615);
		} else if (Class140.method2358(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) class89_sub1_2439_).aClass142_10315 = ((OpenGLModel) this).aClass142_10315;
		else
			((OpenGLModel) class89_sub1_2439_).aClass142_10315 = null;
		if (Class140.method2353(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aFloatArray10297 == null || (((OpenGLModel) class89_sub1_2440_).aFloatArray10297.length < ((OpenGLModel) this).anInt10299)) {
				int i_2453_ = ((OpenGLModel) this).anInt10291;
				((OpenGLModel) class89_sub1_2439_).aFloatArray10297 = ((OpenGLModel) class89_sub1_2440_).aFloatArray10297 = new float[i_2453_];
				((OpenGLModel) class89_sub1_2439_).aFloatArray10339 = ((OpenGLModel) class89_sub1_2440_).aFloatArray10339 = new float[i_2453_];
			} else {
				((OpenGLModel) class89_sub1_2439_).aFloatArray10297 = ((OpenGLModel) class89_sub1_2440_).aFloatArray10297;
				((OpenGLModel) class89_sub1_2439_).aFloatArray10339 = ((OpenGLModel) class89_sub1_2440_).aFloatArray10339;
			}
			for (int i_2454_ = 0; i_2454_ < ((OpenGLModel) this).anInt10291; i_2454_++) {
				((OpenGLModel) class89_sub1_2439_).aFloatArray10297[i_2454_] = ((OpenGLModel) this).aFloatArray10297[i_2454_];
				((OpenGLModel) class89_sub1_2439_).aFloatArray10339[i_2454_] = ((OpenGLModel) this).aFloatArray10339[i_2454_];
			}
		} else {
			((OpenGLModel) class89_sub1_2439_).aFloatArray10297 = ((OpenGLModel) this).aFloatArray10297;
			((OpenGLModel) class89_sub1_2439_).aFloatArray10339 = ((OpenGLModel) this).aFloatArray10339;
		}
		if (Class140.method2365(i, ((OpenGLModel) this).anInt10294)) {
			if (bool)
				((OpenGLModel) class89_sub1_2439_).aByte10279 |= 0x8;
			((OpenGLModel) class89_sub1_2439_).aClass142_10312 = ((OpenGLModel) class89_sub1_2440_).aClass142_10312;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10312).aByte1613 = ((Class142) ((OpenGLModel) this).aClass142_10312).aByte1613;
			((Class142) ((OpenGLModel) class89_sub1_2439_).aClass142_10312).anInterface9_1615 = (((Class142) ((OpenGLModel) this).aClass142_10312).anInterface9_1615);
		} else if (Class140.method2363(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) class89_sub1_2439_).aClass142_10312 = ((OpenGLModel) this).aClass142_10312;
		else
			((OpenGLModel) class89_sub1_2439_).aClass142_10312 = null;
		if (Class140.method2354(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aShortArray10303 == null || (((OpenGLModel) class89_sub1_2440_).aShortArray10303.length < ((OpenGLModel) this).anInt10299)) {
				int i_2455_ = ((OpenGLModel) this).anInt10299;
				((OpenGLModel) class89_sub1_2439_).aShortArray10303 = ((OpenGLModel) class89_sub1_2440_).aShortArray10303 = new short[i_2455_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10327 = ((OpenGLModel) class89_sub1_2440_).aShortArray10327 = new short[i_2455_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10305 = ((OpenGLModel) class89_sub1_2440_).aShortArray10305 = new short[i_2455_];
			} else {
				((OpenGLModel) class89_sub1_2439_).aShortArray10303 = ((OpenGLModel) class89_sub1_2440_).aShortArray10303;
				((OpenGLModel) class89_sub1_2439_).aShortArray10327 = ((OpenGLModel) class89_sub1_2440_).aShortArray10327;
				((OpenGLModel) class89_sub1_2439_).aShortArray10305 = ((OpenGLModel) class89_sub1_2440_).aShortArray10305;
			}
			for (int i_2456_ = 0; i_2456_ < ((OpenGLModel) this).anInt10299; i_2456_++) {
				((OpenGLModel) class89_sub1_2439_).aShortArray10303[i_2456_] = ((OpenGLModel) this).aShortArray10303[i_2456_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10327[i_2456_] = ((OpenGLModel) this).aShortArray10327[i_2456_];
				((OpenGLModel) class89_sub1_2439_).aShortArray10305[i_2456_] = ((OpenGLModel) this).aShortArray10305[i_2456_];
			}
		} else {
			((OpenGLModel) class89_sub1_2439_).aShortArray10303 = ((OpenGLModel) this).aShortArray10303;
			((OpenGLModel) class89_sub1_2439_).aShortArray10327 = ((OpenGLModel) this).aShortArray10327;
			((OpenGLModel) class89_sub1_2439_).aShortArray10305 = ((OpenGLModel) this).aShortArray10305;
		}
		if (Class140.method2422(i, ((OpenGLModel) this).anInt10294)) {
			if (bool)
				((OpenGLModel) class89_sub1_2439_).aByte10279 |= 0x10;
			((OpenGLModel) class89_sub1_2439_).aClass139_10301 = ((OpenGLModel) class89_sub1_2440_).aClass139_10301;
			((Class139) ((OpenGLModel) class89_sub1_2439_).aClass139_10301).anInterface12_1611 = (((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611);
		} else if (Class140.method2361(i, ((OpenGLModel) this).anInt10294))
			((OpenGLModel) class89_sub1_2439_).aClass139_10301 = ((OpenGLModel) this).aClass139_10301;
		else
			((OpenGLModel) class89_sub1_2439_).aClass139_10301 = null;
		if (Class140.method2374(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aShortArray10306 == null || (((OpenGLModel) class89_sub1_2440_).aShortArray10306.length < ((OpenGLModel) this).anInt10299)) {
				int i_2457_ = ((OpenGLModel) this).anInt10299;
				((OpenGLModel) class89_sub1_2439_).aShortArray10306 = ((OpenGLModel) class89_sub1_2440_).aShortArray10306 = new short[i_2457_];
			} else
				((OpenGLModel) class89_sub1_2439_).aShortArray10306 = ((OpenGLModel) class89_sub1_2440_).aShortArray10306;
			for (int i_2458_ = 0; i_2458_ < ((OpenGLModel) this).anInt10299; i_2458_++)
				((OpenGLModel) class89_sub1_2439_).aShortArray10306[i_2458_] = ((OpenGLModel) this).aShortArray10306[i_2458_];
		} else
			((OpenGLModel) class89_sub1_2439_).aShortArray10306 = ((OpenGLModel) this).aShortArray10306;
		if (Class140.method2355(i, ((OpenGLModel) this).anInt10294)) {
			if (((OpenGLModel) class89_sub1_2440_).aClass150Array10335 == null || ((((OpenGLModel) class89_sub1_2440_).aClass150Array10335).length < ((OpenGLModel) this).anInt10333)) {
				int i_2459_ = ((OpenGLModel) this).anInt10333;
				((OpenGLModel) class89_sub1_2439_).aClass150Array10335 = ((OpenGLModel) class89_sub1_2440_).aClass150Array10335 = new Class150[i_2459_];
				for (int i_2460_ = 0; i_2460_ < ((OpenGLModel) this).anInt10333; i_2460_++)
					((OpenGLModel) class89_sub1_2439_).aClass150Array10335[i_2460_] = ((OpenGLModel) this).aClass150Array10335[i_2460_].method2499();
			} else {
				((OpenGLModel) class89_sub1_2439_).aClass150Array10335 = ((OpenGLModel) class89_sub1_2440_).aClass150Array10335;
				for (int i_2461_ = 0; i_2461_ < ((OpenGLModel) this).anInt10333; i_2461_++)
					((OpenGLModel) class89_sub1_2439_).aClass150Array10335[i_2461_].method2498(((OpenGLModel) this).aClass150Array10335[i_2461_]);
			}
		} else
			((OpenGLModel) class89_sub1_2439_).aClass150Array10335 = ((OpenGLModel) this).aClass150Array10335;
		((OpenGLModel) class89_sub1_2439_).aClass173Array10334 = ((OpenGLModel) this).aClass173Array10334;
		if (((OpenGLModel) this).aBool10319) {
			((OpenGLModel) class89_sub1_2439_).anInt10313 = ((OpenGLModel) this).anInt10313;
			((OpenGLModel) class89_sub1_2439_).anInt10271 = ((OpenGLModel) this).anInt10271;
			((OpenGLModel) class89_sub1_2439_).aShort10322 = ((OpenGLModel) this).aShort10322;
			((OpenGLModel) class89_sub1_2439_).aShort10318 = ((OpenGLModel) this).aShort10318;
			((OpenGLModel) class89_sub1_2439_).aShort10317 = ((OpenGLModel) this).aShort10317;
			((OpenGLModel) class89_sub1_2439_).aShort10321 = ((OpenGLModel) this).aShort10321;
			((OpenGLModel) class89_sub1_2439_).aShort10324 = ((OpenGLModel) this).aShort10324;
			((OpenGLModel) class89_sub1_2439_).aShort10325 = ((OpenGLModel) this).aShort10325;
			((OpenGLModel) class89_sub1_2439_).aBool10319 = true;
		} else
			((OpenGLModel) class89_sub1_2439_).aBool10319 = false;
		if (((OpenGLModel) this).aBool10326) {
			((OpenGLModel) class89_sub1_2439_).aShort10278 = ((OpenGLModel) this).aShort10278;
			((OpenGLModel) class89_sub1_2439_).aBool10326 = true;
		} else
			((OpenGLModel) class89_sub1_2439_).aBool10326 = false;
		((OpenGLModel) class89_sub1_2439_).anIntArrayArray10289 = ((OpenGLModel) this).anIntArrayArray10289;
		((OpenGLModel) class89_sub1_2439_).anIntArrayArray10307 = ((OpenGLModel) this).anIntArrayArray10307;
		((OpenGLModel) class89_sub1_2439_).anIntArrayArray10323 = ((OpenGLModel) this).anIntArrayArray10323;
		((OpenGLModel) class89_sub1_2439_).aShortArray10330 = ((OpenGLModel) this).aShortArray10330;
		((OpenGLModel) class89_sub1_2439_).anIntArray10329 = ((OpenGLModel) this).anIntArray10329;
		((OpenGLModel) class89_sub1_2439_).aShortArray10290 = ((OpenGLModel) this).aShortArray10290;
		((OpenGLModel) class89_sub1_2439_).aShortArray10286 = ((OpenGLModel) this).aShortArray10286;
		((OpenGLModel) class89_sub1_2439_).anIntArray10328 = ((OpenGLModel) this).anIntArray10328;
		((OpenGLModel) class89_sub1_2439_).aClass84Array10300 = ((OpenGLModel) this).aClass84Array10300;
		((OpenGLModel) class89_sub1_2439_).aClass175Array10332 = ((OpenGLModel) this).aClass175Array10332;
		return class89_sub1_2439_;
	}

	public int method1495() {
		return ((OpenGLModel) this).aShort10280;
	}

	public Class175[] method1389() {
		return ((OpenGLModel) this).aClass175Array10332;
	}

	void method9560() {
		if (((OpenGLModel) this).anInt10308 != 0) {
			if (((OpenGLModel) this).aByte10279 != 0)
				method9553(true);
			method9553(false);
			if (((OpenGLModel) this).aClass139_10301 != null) {
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
					method9552((((OpenGLModel) this).aByte10279 & 0x10) != 0);
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) != null) {
					((OpenGLModel) this).aClass106_Sub1_10340.method9429(((OpenGLModel) this).aClass142_10315 != null);
					((OpenGLModel) this).aClass106_Sub1_10340.method9416(((OpenGLModel) this).aClass142_10309, ((OpenGLModel) this).aClass142_10315, ((OpenGLModel) this).aClass142_10270, ((OpenGLModel) this).aClass142_10312);
					int i = ((OpenGLModel) this).anIntArray10328.length - 1;
					for (int i_2462_ = 0; i_2462_ < i; i_2462_++) {
						int i_2463_ = ((OpenGLModel) this).anIntArray10328[i_2462_];
						int i_2464_ = (((OpenGLModel) this).anIntArray10328[i_2462_ + 1]);
						int i_2465_ = ((((OpenGLModel) this).aShortArray10306[i_2463_] == -1) ? -1 : (((OpenGLModel) this).aShortArray10306[i_2463_]) & 0xffff);
						((OpenGLModel) this).aClass106_Sub1_10340.method9484(i_2465_, ((OpenGLModel) this).aClass142_10315 != null);
						((OpenGLModel) this).aClass106_Sub1_10340.method9411((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611), 4, i_2463_ * 3, (i_2464_ - i_2463_) * 3);
					}
				}
			}
			method9547();
		}
	}

	void method9561() {
		if (((OpenGLModel) this).anInt10308 != 0) {
			if (((OpenGLModel) this).aByte10279 != 0)
				method9553(true);
			method9553(false);
			if (((OpenGLModel) this).aClass139_10301 != null) {
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) == null)
					method9552((((OpenGLModel) this).aByte10279 & 0x10) != 0);
				if ((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611) != null) {
					((OpenGLModel) this).aClass106_Sub1_10340.method9429(((OpenGLModel) this).aClass142_10315 != null);
					((OpenGLModel) this).aClass106_Sub1_10340.method9416(((OpenGLModel) this).aClass142_10309, ((OpenGLModel) this).aClass142_10315, ((OpenGLModel) this).aClass142_10270, ((OpenGLModel) this).aClass142_10312);
					int i = ((OpenGLModel) this).anIntArray10328.length - 1;
					for (int i_2466_ = 0; i_2466_ < i; i_2466_++) {
						int i_2467_ = ((OpenGLModel) this).anIntArray10328[i_2466_];
						int i_2468_ = (((OpenGLModel) this).anIntArray10328[i_2466_ + 1]);
						int i_2469_ = ((((OpenGLModel) this).aShortArray10306[i_2467_] == -1) ? -1 : (((OpenGLModel) this).aShortArray10306[i_2467_]) & 0xffff);
						((OpenGLModel) this).aClass106_Sub1_10340.method9484(i_2469_, ((OpenGLModel) this).aClass142_10315 != null);
						((OpenGLModel) this).aClass106_Sub1_10340.method9411((((Class139) ((OpenGLModel) this).aClass139_10301).anInterface12_1611), 4, i_2467_ * 3, (i_2468_ - i_2467_) * 3);
					}
				}
			}
			method9547();
		}
	}

	void method1497(int i, int i_2470_, int i_2471_, int i_2472_) {
		if (i == 0) {
			int i_2473_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_2474_ = 0; i_2474_ < ((OpenGLModel) this).anInt10285; i_2474_++) {
				anInt10342 += ((OpenGLModel) this).anIntArray10336[i_2474_];
				anInt10310 += ((OpenGLModel) this).anIntArray10287[i_2474_];
				anInt10344 += ((OpenGLModel) this).anIntArray10331[i_2474_];
				i_2473_++;
			}
			if (i_2473_ > 0) {
				anInt10342 = anInt10342 / i_2473_ + i_2470_;
				anInt10310 = anInt10310 / i_2473_ + i_2471_;
				anInt10344 = anInt10344 / i_2473_ + i_2472_;
			} else {
				anInt10342 = i_2470_;
				anInt10310 = i_2471_;
				anInt10344 = i_2472_;
			}
		} else if (i == 1) {
			for (int i_2475_ = 0; i_2475_ < ((OpenGLModel) this).anInt10285; i_2475_++) {
				((OpenGLModel) this).anIntArray10336[i_2475_] += i_2470_;
				((OpenGLModel) this).anIntArray10287[i_2475_] += i_2471_;
				((OpenGLModel) this).anIntArray10331[i_2475_] += i_2472_;
			}
		} else if (i == 2) {
			for (int i_2476_ = 0; i_2476_ < ((OpenGLModel) this).anInt10285; i_2476_++) {
				((OpenGLModel) this).anIntArray10336[i_2476_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2476_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2476_] -= anInt10344;
				if (i_2472_ != 0) {
					int i_2477_ = Class325.anIntArray4103[i_2472_];
					int i_2478_ = Class325.anIntArray4105[i_2472_];
					int i_2479_ = (((((OpenGLModel) this).anIntArray10287[i_2476_] * i_2477_) + (((OpenGLModel) this).anIntArray10336[i_2476_] * i_2478_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10287[i_2476_] = ((((OpenGLModel) this).anIntArray10287[i_2476_] * i_2478_) - (((OpenGLModel) this).anIntArray10336[i_2476_] * i_2477_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_2476_] = i_2479_;
				}
				if (i_2470_ != 0) {
					int i_2480_ = Class325.anIntArray4103[i_2470_];
					int i_2481_ = Class325.anIntArray4105[i_2470_];
					int i_2482_ = (((((OpenGLModel) this).anIntArray10287[i_2476_] * i_2481_) - (((OpenGLModel) this).anIntArray10331[i_2476_] * i_2480_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_2476_] = ((((OpenGLModel) this).anIntArray10287[i_2476_] * i_2480_) + (((OpenGLModel) this).anIntArray10331[i_2476_] * i_2481_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10287[i_2476_] = i_2482_;
				}
				if (i_2471_ != 0) {
					int i_2483_ = Class325.anIntArray4103[i_2471_];
					int i_2484_ = Class325.anIntArray4105[i_2471_];
					int i_2485_ = (((((OpenGLModel) this).anIntArray10331[i_2476_] * i_2483_) + (((OpenGLModel) this).anIntArray10336[i_2476_] * i_2484_) + 16383) >> 14);
					((OpenGLModel) this).anIntArray10331[i_2476_] = ((((OpenGLModel) this).anIntArray10331[i_2476_] * i_2484_) - (((OpenGLModel) this).anIntArray10336[i_2476_] * i_2483_) + 16383) >> 14;
					((OpenGLModel) this).anIntArray10336[i_2476_] = i_2485_;
				}
				((OpenGLModel) this).anIntArray10336[i_2476_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2476_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2476_] += anInt10344;
			}
		} else if (i == 3) {
			for (int i_2486_ = 0; i_2486_ < ((OpenGLModel) this).anInt10285; i_2486_++) {
				((OpenGLModel) this).anIntArray10336[i_2486_] -= anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2486_] -= anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2486_] -= anInt10344;
				((OpenGLModel) this).anIntArray10336[i_2486_] = (((OpenGLModel) this).anIntArray10336[i_2486_] * i_2470_ / 128);
				((OpenGLModel) this).anIntArray10287[i_2486_] = (((OpenGLModel) this).anIntArray10287[i_2486_] * i_2471_ / 128);
				((OpenGLModel) this).anIntArray10331[i_2486_] = (((OpenGLModel) this).anIntArray10331[i_2486_] * i_2472_ / 128);
				((OpenGLModel) this).anIntArray10336[i_2486_] += anInt10342;
				((OpenGLModel) this).anIntArray10287[i_2486_] += anInt10310;
				((OpenGLModel) this).anIntArray10331[i_2486_] += anInt10344;
			}
		} else if (i == 5) {
			for (int i_2487_ = 0; i_2487_ < ((OpenGLModel) this).anInt10299; i_2487_++) {
				int i_2488_ = ((((OpenGLModel) this).aByteArray10302[i_2487_] & 0xff) + i_2470_ * 8);
				if (i_2488_ < 0)
					i_2488_ = 0;
				else if (i_2488_ > 255)
					i_2488_ = 255;
				((OpenGLModel) this).aByteArray10302[i_2487_] = (byte) i_2488_;
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2489_ = 0; i_2489_ < ((OpenGLModel) this).anInt10333; i_2489_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2489_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2489_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_2490_ = 0; i_2490_ < ((OpenGLModel) this).anInt10299; i_2490_++) {
				int i_2491_ = ((OpenGLModel) this).aShortArray10281[i_2490_] & 0xffff;
				int i_2492_ = i_2491_ >> 10 & 0x3f;
				int i_2493_ = i_2491_ >> 7 & 0x7;
				int i_2494_ = i_2491_ & 0x7f;
				i_2492_ = i_2492_ + i_2470_ & 0x3f;
				i_2493_ += i_2471_ / 4;
				if (i_2493_ < 0)
					i_2493_ = 0;
				else if (i_2493_ > 7)
					i_2493_ = 7;
				i_2494_ += i_2472_;
				if (i_2494_ < 0)
					i_2494_ = 0;
				else if (i_2494_ > 127)
					i_2494_ = 127;
				((OpenGLModel) this).aShortArray10281[i_2490_] = (short) (i_2492_ << 10 | i_2493_ << 7 | i_2494_);
			}
			if (((OpenGLModel) this).aClass142_10270 != null)
				((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
			if (((OpenGLModel) this).aClass173Array10334 != null) {
				for (int i_2495_ = 0; i_2495_ < ((OpenGLModel) this).anInt10333; i_2495_++) {
					Class173 class173 = ((OpenGLModel) this).aClass173Array10334[i_2495_];
					Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2495_];
					((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | ((Class460.anIntArray5213[(((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_2496_ = 0; i_2496_ < ((OpenGLModel) this).anInt10333; i_2496_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2496_];
				((Class150) class150).anInt1698 += i_2470_;
				((Class150) class150).anInt1696 += i_2471_;
			}
		} else if (i == 10) {
			for (int i_2497_ = 0; i_2497_ < ((OpenGLModel) this).anInt10333; i_2497_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2497_];
				((Class150) class150).anInt1697 = ((Class150) class150).anInt1697 * i_2470_ >> 7;
				((Class150) class150).anInt1695 = ((Class150) class150).anInt1695 * i_2471_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2498_ = 0; i_2498_ < ((OpenGLModel) this).anInt10333; i_2498_++) {
				Class150 class150 = ((OpenGLModel) this).aClass150Array10335[i_2498_];
				((Class150) class150).anInt1693 = ((Class150) class150).anInt1693 + i_2470_ & 0x3fff;
			}
		}
	}

	public Class84[] method1394() {
		return ((OpenGLModel) this).aClass84Array10300;
	}

	void method1373() {
		for (int i = 0; i < ((OpenGLModel) this).anInt10284; i++) {
			((OpenGLModel) this).anIntArray10336[i] = ((OpenGLModel) this).anIntArray10336[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10287[i] = ((OpenGLModel) this).anIntArray10287[i] + 7 >> 4;
			((OpenGLModel) this).anIntArray10331[i] = ((OpenGLModel) this).anIntArray10331[i] + 7 >> 4;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	public void method1419(int i, int i_2499_, int i_2500_) {
		for (int i_2501_ = 0; i_2501_ < ((OpenGLModel) this).anInt10285; i_2501_++) {
			if (i != 0)
				((OpenGLModel) this).anIntArray10336[i_2501_] += i;
			if (i_2499_ != 0)
				((OpenGLModel) this).anIntArray10287[i_2501_] += i_2499_;
			if (i_2500_ != 0)
				((OpenGLModel) this).anIntArray10331[i_2501_] += i_2500_;
		}
		if (((OpenGLModel) this).aClass142_10309 != null)
			((Class142) ((OpenGLModel) this).aClass142_10309).anInterface9_1615 = null;
		((OpenGLModel) this).aBool10319 = false;
	}

	void method1371(int i, int[] is, int i_2502_, int i_2503_, int i_2504_, boolean bool, int i_2505_, int[] is_2506_) {
		int i_2507_ = is.length;
		if (i == 0) {
			i_2502_ <<= 4;
			i_2503_ <<= 4;
			i_2504_ <<= 4;
			int i_2508_ = 0;
			anInt10342 = 0;
			anInt10310 = 0;
			anInt10344 = 0;
			for (int i_2509_ = 0; i_2509_ < i_2507_; i_2509_++) {
				int i_2510_ = is[i_2509_];
				if (i_2510_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2511_ = ((OpenGLModel) this).anIntArrayArray10289[i_2510_];
					for (int i_2512_ = 0; i_2512_ < is_2511_.length; i_2512_++) {
						int i_2513_ = is_2511_[i_2512_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2513_])) != 0) {
							anInt10342 += (((OpenGLModel) this).anIntArray10336[i_2513_]);
							anInt10310 += (((OpenGLModel) this).anIntArray10287[i_2513_]);
							anInt10344 += (((OpenGLModel) this).anIntArray10331[i_2513_]);
							i_2508_++;
						}
					}
				}
			}
			if (i_2508_ > 0) {
				anInt10342 = anInt10342 / i_2508_ + i_2502_;
				anInt10310 = anInt10310 / i_2508_ + i_2503_;
				anInt10344 = anInt10344 / i_2508_ + i_2504_;
				aBool10345 = true;
			} else {
				anInt10342 = i_2502_;
				anInt10310 = i_2503_;
				anInt10344 = i_2504_;
			}
		} else if (i == 1) {
			if (is_2506_ != null) {
				int i_2514_ = ((is_2506_[0] * i_2502_ + is_2506_[1] * i_2503_ + is_2506_[2] * i_2504_ + 8192) >> 14);
				int i_2515_ = ((is_2506_[3] * i_2502_ + is_2506_[4] * i_2503_ + is_2506_[5] * i_2504_ + 8192) >> 14);
				int i_2516_ = ((is_2506_[6] * i_2502_ + is_2506_[7] * i_2503_ + is_2506_[8] * i_2504_ + 8192) >> 14);
				i_2502_ = i_2514_;
				i_2503_ = i_2515_;
				i_2504_ = i_2516_;
			}
			i_2502_ <<= 4;
			i_2503_ <<= 4;
			i_2504_ <<= 4;
			for (int i_2517_ = 0; i_2517_ < i_2507_; i_2517_++) {
				int i_2518_ = is[i_2517_];
				if (i_2518_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
					int[] is_2519_ = ((OpenGLModel) this).anIntArrayArray10289[i_2518_];
					for (int i_2520_ = 0; i_2520_ < is_2519_.length; i_2520_++) {
						int i_2521_ = is_2519_[i_2520_];
						if (((OpenGLModel) this).aShortArray10290 == null || (i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2521_])) != 0) {
							((OpenGLModel) this).anIntArray10336[i_2521_] += i_2502_;
							((OpenGLModel) this).anIntArray10287[i_2521_] += i_2503_;
							((OpenGLModel) this).anIntArray10331[i_2521_] += i_2504_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_2506_ != null) {
				int i_2522_ = is_2506_[9] << 4;
				int i_2523_ = is_2506_[10] << 4;
				int i_2524_ = is_2506_[11] << 4;
				int i_2525_ = is_2506_[12] << 4;
				int i_2526_ = is_2506_[13] << 4;
				int i_2527_ = is_2506_[14] << 4;
				if (aBool10345) {
					int i_2528_ = ((is_2506_[0] * anInt10342 + is_2506_[3] * anInt10310 + is_2506_[6] * anInt10344 + 8192) >> 14);
					int i_2529_ = ((is_2506_[1] * anInt10342 + is_2506_[4] * anInt10310 + is_2506_[7] * anInt10344 + 8192) >> 14);
					int i_2530_ = ((is_2506_[2] * anInt10342 + is_2506_[5] * anInt10310 + is_2506_[8] * anInt10344 + 8192) >> 14);
					i_2528_ += i_2525_;
					i_2529_ += i_2526_;
					i_2530_ += i_2527_;
					anInt10342 = i_2528_;
					anInt10310 = i_2529_;
					anInt10344 = i_2530_;
					aBool10345 = false;
				}
				int[] is_2531_ = new int[9];
				int i_2532_ = Class325.anIntArray4105[i_2502_];
				int i_2533_ = Class325.anIntArray4103[i_2502_];
				int i_2534_ = Class325.anIntArray4105[i_2503_];
				int i_2535_ = Class325.anIntArray4103[i_2503_];
				int i_2536_ = Class325.anIntArray4105[i_2504_];
				int i_2537_ = Class325.anIntArray4103[i_2504_];
				int i_2538_ = i_2533_ * i_2536_ + 8192 >> 14;
				int i_2539_ = i_2533_ * i_2537_ + 8192 >> 14;
				is_2531_[0] = i_2534_ * i_2536_ + i_2535_ * i_2539_ + 8192 >> 14;
				is_2531_[1] = -i_2534_ * i_2537_ + i_2535_ * i_2538_ + 8192 >> 14;
				is_2531_[2] = i_2535_ * i_2532_ + 8192 >> 14;
				is_2531_[3] = i_2532_ * i_2537_ + 8192 >> 14;
				is_2531_[4] = i_2532_ * i_2536_ + 8192 >> 14;
				is_2531_[5] = -i_2533_;
				is_2531_[6] = -i_2535_ * i_2536_ + i_2534_ * i_2539_ + 8192 >> 14;
				is_2531_[7] = i_2535_ * i_2537_ + i_2534_ * i_2538_ + 8192 >> 14;
				is_2531_[8] = i_2534_ * i_2532_ + 8192 >> 14;
				int i_2540_ = ((is_2531_[0] * -anInt10342 + is_2531_[1] * -anInt10310 + is_2531_[2] * -anInt10344 + 8192) >> 14);
				int i_2541_ = ((is_2531_[3] * -anInt10342 + is_2531_[4] * -anInt10310 + is_2531_[5] * -anInt10344 + 8192) >> 14);
				int i_2542_ = ((is_2531_[6] * -anInt10342 + is_2531_[7] * -anInt10310 + is_2531_[8] * -anInt10344 + 8192) >> 14);
				int i_2543_ = i_2540_ + anInt10342;
				int i_2544_ = i_2541_ + anInt10310;
				int i_2545_ = i_2542_ + anInt10344;
				int[] is_2546_ = new int[9];
				for (int i_2547_ = 0; i_2547_ < 3; i_2547_++) {
					for (int i_2548_ = 0; i_2548_ < 3; i_2548_++) {
						int i_2549_ = 0;
						for (int i_2550_ = 0; i_2550_ < 3; i_2550_++)
							i_2549_ += (is_2531_[i_2547_ * 3 + i_2550_] * is_2506_[i_2548_ * 3 + i_2550_]);
						is_2546_[i_2547_ * 3 + i_2548_] = i_2549_ + 8192 >> 14;
					}
				}
				int i_2551_ = ((is_2531_[0] * i_2525_ + is_2531_[1] * i_2526_ + is_2531_[2] * i_2527_ + 8192) >> 14);
				int i_2552_ = ((is_2531_[3] * i_2525_ + is_2531_[4] * i_2526_ + is_2531_[5] * i_2527_ + 8192) >> 14);
				int i_2553_ = ((is_2531_[6] * i_2525_ + is_2531_[7] * i_2526_ + is_2531_[8] * i_2527_ + 8192) >> 14);
				i_2551_ += i_2543_;
				i_2552_ += i_2544_;
				i_2553_ += i_2545_;
				int[] is_2554_ = new int[9];
				for (int i_2555_ = 0; i_2555_ < 3; i_2555_++) {
					for (int i_2556_ = 0; i_2556_ < 3; i_2556_++) {
						int i_2557_ = 0;
						for (int i_2558_ = 0; i_2558_ < 3; i_2558_++)
							i_2557_ += (is_2506_[i_2555_ * 3 + i_2558_] * is_2546_[i_2556_ + i_2558_ * 3]);
						is_2554_[i_2555_ * 3 + i_2556_] = i_2557_ + 8192 >> 14;
					}
				}
				int i_2559_ = ((is_2506_[0] * i_2551_ + is_2506_[1] * i_2552_ + is_2506_[2] * i_2553_ + 8192) >> 14);
				int i_2560_ = ((is_2506_[3] * i_2551_ + is_2506_[4] * i_2552_ + is_2506_[5] * i_2553_ + 8192) >> 14);
				int i_2561_ = ((is_2506_[6] * i_2551_ + is_2506_[7] * i_2552_ + is_2506_[8] * i_2553_ + 8192) >> 14);
				i_2559_ += i_2522_;
				i_2560_ += i_2523_;
				i_2561_ += i_2524_;
				for (int i_2562_ = 0; i_2562_ < i_2507_; i_2562_++) {
					int i_2563_ = is[i_2562_];
					if (i_2563_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2564_ = (((OpenGLModel) this).anIntArrayArray10289[i_2563_]);
						for (int i_2565_ = 0; i_2565_ < is_2564_.length; i_2565_++) {
							int i_2566_ = is_2564_[i_2565_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2566_])) != 0)) {
								int i_2567_ = ((is_2554_[0] * (((OpenGLModel) this).anIntArray10336[i_2566_]) + is_2554_[1] * (((OpenGLModel) this).anIntArray10287[i_2566_]) + is_2554_[2] * (((OpenGLModel) this).anIntArray10331[i_2566_]) + 8192) >> 14);
								int i_2568_ = ((is_2554_[3] * (((OpenGLModel) this).anIntArray10336[i_2566_]) + is_2554_[4] * (((OpenGLModel) this).anIntArray10287[i_2566_]) + is_2554_[5] * (((OpenGLModel) this).anIntArray10331[i_2566_]) + 8192) >> 14);
								int i_2569_ = ((is_2554_[6] * (((OpenGLModel) this).anIntArray10336[i_2566_]) + is_2554_[7] * (((OpenGLModel) this).anIntArray10287[i_2566_]) + is_2554_[8] * (((OpenGLModel) this).anIntArray10331[i_2566_]) + 8192) >> 14);
								i_2567_ += i_2559_;
								i_2568_ += i_2560_;
								i_2569_ += i_2561_;
								((OpenGLModel) this).anIntArray10336[i_2566_] = i_2567_;
								((OpenGLModel) this).anIntArray10287[i_2566_] = i_2568_;
								((OpenGLModel) this).anIntArray10331[i_2566_] = i_2569_;
							}
						}
					}
				}
			} else {
				for (int i_2570_ = 0; i_2570_ < i_2507_; i_2570_++) {
					int i_2571_ = is[i_2570_];
					if (i_2571_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2572_ = (((OpenGLModel) this).anIntArrayArray10289[i_2571_]);
						for (int i_2573_ = 0; i_2573_ < is_2572_.length; i_2573_++) {
							int i_2574_ = is_2572_[i_2573_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2574_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_2574_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_2574_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_2574_] -= anInt10344;
								if (i_2504_ != 0) {
									int i_2575_ = Class325.anIntArray4103[i_2504_];
									int i_2576_ = Class325.anIntArray4105[i_2504_];
									int i_2577_ = (((((OpenGLModel) this).anIntArray10287[i_2574_]) * i_2575_ + (((OpenGLModel) this).anIntArray10336[i_2574_]) * i_2576_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10287[i_2574_] = (((((OpenGLModel) this).anIntArray10287[i_2574_]) * i_2576_) - ((((OpenGLModel) this).anIntArray10336[i_2574_]) * i_2575_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_2574_] = i_2577_;
								}
								if (i_2502_ != 0) {
									int i_2578_ = Class325.anIntArray4103[i_2502_];
									int i_2579_ = Class325.anIntArray4105[i_2502_];
									int i_2580_ = (((((OpenGLModel) this).anIntArray10287[i_2574_]) * i_2579_ - (((OpenGLModel) this).anIntArray10331[i_2574_]) * i_2578_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_2574_] = (((((OpenGLModel) this).anIntArray10287[i_2574_]) * i_2578_) + ((((OpenGLModel) this).anIntArray10331[i_2574_]) * i_2579_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10287[i_2574_] = i_2580_;
								}
								if (i_2503_ != 0) {
									int i_2581_ = Class325.anIntArray4103[i_2503_];
									int i_2582_ = Class325.anIntArray4105[i_2503_];
									int i_2583_ = (((((OpenGLModel) this).anIntArray10331[i_2574_]) * i_2581_ + (((OpenGLModel) this).anIntArray10336[i_2574_]) * i_2582_ + 16383) >> 14);
									((OpenGLModel) this).anIntArray10331[i_2574_] = (((((OpenGLModel) this).anIntArray10331[i_2574_]) * i_2582_) - ((((OpenGLModel) this).anIntArray10336[i_2574_]) * i_2581_) + 16383) >> 14;
									((OpenGLModel) this).anIntArray10336[i_2574_] = i_2583_;
								}
								((OpenGLModel) this).anIntArray10336[i_2574_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_2574_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_2574_] += anInt10344;
							}
						}
					}
				}
				if (bool) {
					for (int i_2584_ = 0; i_2584_ < i_2507_; i_2584_++) {
						int i_2585_ = is[i_2584_];
						if (i_2585_ < (((OpenGLModel) this).anIntArrayArray10289).length) {
							int[] is_2586_ = (((OpenGLModel) this).anIntArrayArray10289[i_2585_]);
							for (int i_2587_ = 0; i_2587_ < is_2586_.length; i_2587_++) {
								int i_2588_ = is_2586_[i_2587_];
								if ((((OpenGLModel) this).aShortArray10290 == null) || (i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2588_])) != 0) {
									int i_2589_ = (((OpenGLModel) this).anIntArray10329[i_2588_]);
									int i_2590_ = (((OpenGLModel) this).anIntArray10329[i_2588_ + 1]);
									for (int i_2591_ = i_2589_; (i_2591_ < i_2590_ && ((((OpenGLModel) this).aShortArray10330[i_2591_]) != 0)); i_2591_++) {
										int i_2592_ = (((((OpenGLModel) this).aShortArray10330[i_2591_]) & 0xffff) - 1);
										if (i_2504_ != 0) {
											int i_2593_ = (Class325.anIntArray4103[i_2504_]);
											int i_2594_ = (Class325.anIntArray4105[i_2504_]);
											int i_2595_ = (((((OpenGLModel) this).aShortArray10293[i_2592_]) * i_2593_ + (((OpenGLModel) this).aShortArray10292[i_2592_]) * i_2594_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_2592_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_2592_]) * i_2594_) - ((((OpenGLModel) this).aShortArray10292[i_2592_]) * i_2593_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_2592_] = (short) i_2595_;
										}
										if (i_2502_ != 0) {
											int i_2596_ = (Class325.anIntArray4103[i_2502_]);
											int i_2597_ = (Class325.anIntArray4105[i_2502_]);
											int i_2598_ = (((((OpenGLModel) this).aShortArray10293[i_2592_]) * i_2597_ - (((OpenGLModel) this).aShortArray10288[i_2592_]) * i_2596_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_2592_] = (short) ((((((OpenGLModel) this).aShortArray10293[i_2592_]) * i_2596_) + ((((OpenGLModel) this).aShortArray10288[i_2592_]) * i_2597_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10293[i_2592_] = (short) i_2598_;
										}
										if (i_2503_ != 0) {
											int i_2599_ = (Class325.anIntArray4103[i_2503_]);
											int i_2600_ = (Class325.anIntArray4105[i_2503_]);
											int i_2601_ = (((((OpenGLModel) this).aShortArray10288[i_2592_]) * i_2599_ + (((OpenGLModel) this).aShortArray10292[i_2592_]) * i_2600_ + 16383) >> 14);
											((OpenGLModel) this).aShortArray10288[i_2592_] = (short) ((((((OpenGLModel) this).aShortArray10288[i_2592_]) * i_2600_) - ((((OpenGLModel) this).aShortArray10292[i_2592_]) * i_2599_) + 16383) >> 14);
											((OpenGLModel) this).aShortArray10292[i_2592_] = (short) i_2601_;
										}
									}
								}
							}
						}
					}
					if (((OpenGLModel) this).aClass142_10315 == null && ((OpenGLModel) this).aClass142_10270 != null)
						((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
					if (((OpenGLModel) this).aClass142_10315 != null)
						((Class142) ((OpenGLModel) this).aClass142_10315).anInterface9_1615 = null;
				}
			}
		} else if (i == 3) {
			if (is_2506_ != null) {
				int i_2602_ = is_2506_[9] << 4;
				int i_2603_ = is_2506_[10] << 4;
				int i_2604_ = is_2506_[11] << 4;
				int i_2605_ = is_2506_[12] << 4;
				int i_2606_ = is_2506_[13] << 4;
				int i_2607_ = is_2506_[14] << 4;
				if (aBool10345) {
					int i_2608_ = ((is_2506_[0] * anInt10342 + is_2506_[3] * anInt10310 + is_2506_[6] * anInt10344 + 8192) >> 14);
					int i_2609_ = ((is_2506_[1] * anInt10342 + is_2506_[4] * anInt10310 + is_2506_[7] * anInt10344 + 8192) >> 14);
					int i_2610_ = ((is_2506_[2] * anInt10342 + is_2506_[5] * anInt10310 + is_2506_[8] * anInt10344 + 8192) >> 14);
					i_2608_ += i_2605_;
					i_2609_ += i_2606_;
					i_2610_ += i_2607_;
					anInt10342 = i_2608_;
					anInt10310 = i_2609_;
					anInt10344 = i_2610_;
					aBool10345 = false;
				}
				int i_2611_ = i_2502_ << 15 >> 7;
				int i_2612_ = i_2503_ << 15 >> 7;
				int i_2613_ = i_2504_ << 15 >> 7;
				int i_2614_ = i_2611_ * -anInt10342 + 8192 >> 14;
				int i_2615_ = i_2612_ * -anInt10310 + 8192 >> 14;
				int i_2616_ = i_2613_ * -anInt10344 + 8192 >> 14;
				int i_2617_ = i_2614_ + anInt10342;
				int i_2618_ = i_2615_ + anInt10310;
				int i_2619_ = i_2616_ + anInt10344;
				int[] is_2620_ = new int[9];
				is_2620_[0] = i_2611_ * is_2506_[0] + 8192 >> 14;
				is_2620_[1] = i_2611_ * is_2506_[3] + 8192 >> 14;
				is_2620_[2] = i_2611_ * is_2506_[6] + 8192 >> 14;
				is_2620_[3] = i_2612_ * is_2506_[1] + 8192 >> 14;
				is_2620_[4] = i_2612_ * is_2506_[4] + 8192 >> 14;
				is_2620_[5] = i_2612_ * is_2506_[7] + 8192 >> 14;
				is_2620_[6] = i_2613_ * is_2506_[2] + 8192 >> 14;
				is_2620_[7] = i_2613_ * is_2506_[5] + 8192 >> 14;
				is_2620_[8] = i_2613_ * is_2506_[8] + 8192 >> 14;
				int i_2621_ = i_2611_ * i_2605_ + 8192 >> 14;
				int i_2622_ = i_2612_ * i_2606_ + 8192 >> 14;
				int i_2623_ = i_2613_ * i_2607_ + 8192 >> 14;
				i_2621_ += i_2617_;
				i_2622_ += i_2618_;
				i_2623_ += i_2619_;
				int[] is_2624_ = new int[9];
				for (int i_2625_ = 0; i_2625_ < 3; i_2625_++) {
					for (int i_2626_ = 0; i_2626_ < 3; i_2626_++) {
						int i_2627_ = 0;
						for (int i_2628_ = 0; i_2628_ < 3; i_2628_++)
							i_2627_ += (is_2506_[i_2625_ * 3 + i_2628_] * is_2620_[i_2626_ + i_2628_ * 3]);
						is_2624_[i_2625_ * 3 + i_2626_] = i_2627_ + 8192 >> 14;
					}
				}
				int i_2629_ = ((is_2506_[0] * i_2621_ + is_2506_[1] * i_2622_ + is_2506_[2] * i_2623_ + 8192) >> 14);
				int i_2630_ = ((is_2506_[3] * i_2621_ + is_2506_[4] * i_2622_ + is_2506_[5] * i_2623_ + 8192) >> 14);
				int i_2631_ = ((is_2506_[6] * i_2621_ + is_2506_[7] * i_2622_ + is_2506_[8] * i_2623_ + 8192) >> 14);
				i_2629_ += i_2602_;
				i_2630_ += i_2603_;
				i_2631_ += i_2604_;
				for (int i_2632_ = 0; i_2632_ < i_2507_; i_2632_++) {
					int i_2633_ = is[i_2632_];
					if (i_2633_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2634_ = (((OpenGLModel) this).anIntArrayArray10289[i_2633_]);
						for (int i_2635_ = 0; i_2635_ < is_2634_.length; i_2635_++) {
							int i_2636_ = is_2634_[i_2635_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2636_])) != 0)) {
								int i_2637_ = ((is_2624_[0] * (((OpenGLModel) this).anIntArray10336[i_2636_]) + is_2624_[1] * (((OpenGLModel) this).anIntArray10287[i_2636_]) + is_2624_[2] * (((OpenGLModel) this).anIntArray10331[i_2636_]) + 8192) >> 14);
								int i_2638_ = ((is_2624_[3] * (((OpenGLModel) this).anIntArray10336[i_2636_]) + is_2624_[4] * (((OpenGLModel) this).anIntArray10287[i_2636_]) + is_2624_[5] * (((OpenGLModel) this).anIntArray10331[i_2636_]) + 8192) >> 14);
								int i_2639_ = ((is_2624_[6] * (((OpenGLModel) this).anIntArray10336[i_2636_]) + is_2624_[7] * (((OpenGLModel) this).anIntArray10287[i_2636_]) + is_2624_[8] * (((OpenGLModel) this).anIntArray10331[i_2636_]) + 8192) >> 14);
								i_2637_ += i_2629_;
								i_2638_ += i_2630_;
								i_2639_ += i_2631_;
								((OpenGLModel) this).anIntArray10336[i_2636_] = i_2637_;
								((OpenGLModel) this).anIntArray10287[i_2636_] = i_2638_;
								((OpenGLModel) this).anIntArray10331[i_2636_] = i_2639_;
							}
						}
					}
				}
			} else {
				for (int i_2640_ = 0; i_2640_ < i_2507_; i_2640_++) {
					int i_2641_ = is[i_2640_];
					if (i_2641_ < ((OpenGLModel) this).anIntArrayArray10289.length) {
						int[] is_2642_ = (((OpenGLModel) this).anIntArrayArray10289[i_2641_]);
						for (int i_2643_ = 0; i_2643_ < is_2642_.length; i_2643_++) {
							int i_2644_ = is_2642_[i_2643_];
							if (((OpenGLModel) this).aShortArray10290 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10290[i_2644_])) != 0)) {
								((OpenGLModel) this).anIntArray10336[i_2644_] -= anInt10342;
								((OpenGLModel) this).anIntArray10287[i_2644_] -= anInt10310;
								((OpenGLModel) this).anIntArray10331[i_2644_] -= anInt10344;
								((OpenGLModel) this).anIntArray10336[i_2644_] = (((OpenGLModel) this).anIntArray10336[i_2644_]) * i_2502_ >> 7;
								((OpenGLModel) this).anIntArray10287[i_2644_] = (((OpenGLModel) this).anIntArray10287[i_2644_]) * i_2503_ >> 7;
								((OpenGLModel) this).anIntArray10331[i_2644_] = (((OpenGLModel) this).anIntArray10331[i_2644_]) * i_2504_ >> 7;
								((OpenGLModel) this).anIntArray10336[i_2644_] += anInt10342;
								((OpenGLModel) this).anIntArray10287[i_2644_] += anInt10310;
								((OpenGLModel) this).anIntArray10331[i_2644_] += anInt10344;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2645_ = 0; i_2645_ < i_2507_; i_2645_++) {
					int i_2646_ = is[i_2645_];
					if (i_2646_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2647_ = (((OpenGLModel) this).anIntArrayArray10307[i_2646_]);
						for (int i_2648_ = 0; i_2648_ < is_2647_.length; i_2648_++) {
							int i_2649_ = is_2647_[i_2648_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10286[i_2649_])) != 0)) {
								int i_2650_ = (((((OpenGLModel) this).aByteArray10302[i_2649_]) & 0xff) + i_2502_ * 8);
								if (i_2650_ < 0)
									i_2650_ = 0;
								else if (i_2650_ > 255)
									i_2650_ = 255;
								((OpenGLModel) this).aByteArray10302[i_2649_] = (byte) i_2650_;
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2651_ = 0; i_2651_ < ((OpenGLModel) this).anInt10333; i_2651_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2651_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2651_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & 0xffffff | 255 - ((((OpenGLModel) this).aByteArray10302[((Class173) class173).anInt2078]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((OpenGLModel) this).anIntArrayArray10307 != null) {
				for (int i_2652_ = 0; i_2652_ < i_2507_; i_2652_++) {
					int i_2653_ = is[i_2652_];
					if (i_2653_ < ((OpenGLModel) this).anIntArrayArray10307.length) {
						int[] is_2654_ = (((OpenGLModel) this).anIntArrayArray10307[i_2653_]);
						for (int i_2655_ = 0; i_2655_ < is_2654_.length; i_2655_++) {
							int i_2656_ = is_2654_[i_2655_];
							if (((OpenGLModel) this).aShortArray10286 == null || ((i_2505_ & (((OpenGLModel) this).aShortArray10286[i_2656_])) != 0)) {
								int i_2657_ = ((((OpenGLModel) this).aShortArray10281[i_2656_]) & 0xffff);
								int i_2658_ = i_2657_ >> 10 & 0x3f;
								int i_2659_ = i_2657_ >> 7 & 0x7;
								int i_2660_ = i_2657_ & 0x7f;
								i_2658_ = i_2658_ + i_2502_ & 0x3f;
								i_2659_ += i_2503_ / 4;
								if (i_2659_ < 0)
									i_2659_ = 0;
								else if (i_2659_ > 7)
									i_2659_ = 7;
								i_2660_ += i_2504_;
								if (i_2660_ < 0)
									i_2660_ = 0;
								else if (i_2660_ > 127)
									i_2660_ = 127;
								((OpenGLModel) this).aShortArray10281[i_2656_] = (short) (i_2658_ << 10 | i_2659_ << 7 | i_2660_);
								if (((OpenGLModel) this).aClass142_10270 != null)
									((Class142) ((OpenGLModel) this).aClass142_10270).anInterface9_1615 = null;
							}
						}
					}
				}
				if (((OpenGLModel) this).aClass173Array10334 != null) {
					for (int i_2661_ = 0; i_2661_ < ((OpenGLModel) this).anInt10333; i_2661_++) {
						Class173 class173 = (((OpenGLModel) this).aClass173Array10334[i_2661_]);
						Class150 class150 = (((OpenGLModel) this).aClass150Array10335[i_2661_]);
						((Class150) class150).anInt1694 = (((Class150) class150).anInt1694 & ~0xffffff | (Class460.anIntArray5213[((((OpenGLModel) this).aShortArray10281[((Class173) class173).anInt2078]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2662_ = 0; i_2662_ < i_2507_; i_2662_++) {
					int i_2663_ = is[i_2662_];
					if (i_2663_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2664_ = (((OpenGLModel) this).anIntArrayArray10323[i_2663_]);
						for (int i_2665_ = 0; i_2665_ < is_2664_.length; i_2665_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2664_[i_2665_]]);
							((Class150) class150).anInt1698 += i_2502_;
							((Class150) class150).anInt1696 += i_2503_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2666_ = 0; i_2666_ < i_2507_; i_2666_++) {
					int i_2667_ = is[i_2666_];
					if (i_2667_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2668_ = (((OpenGLModel) this).anIntArrayArray10323[i_2667_]);
						for (int i_2669_ = 0; i_2669_ < is_2668_.length; i_2669_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2668_[i_2669_]]);
							((Class150) class150).anInt1697 = (((Class150) class150).anInt1697 * i_2502_ >> 7);
							((Class150) class150).anInt1695 = (((Class150) class150).anInt1695 * i_2503_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((OpenGLModel) this).anIntArrayArray10323 != null) {
				for (int i_2670_ = 0; i_2670_ < i_2507_; i_2670_++) {
					int i_2671_ = is[i_2670_];
					if (i_2671_ < ((OpenGLModel) this).anIntArrayArray10323.length) {
						int[] is_2672_ = (((OpenGLModel) this).anIntArrayArray10323[i_2671_]);
						for (int i_2673_ = 0; i_2673_ < is_2672_.length; i_2673_++) {
							Class150 class150 = (((OpenGLModel) this).aClass150Array10335[is_2672_[i_2673_]]);
							((Class150) class150).anInt1693 = (((Class150) class150).anInt1693 + i_2502_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	static final int method9562(int i, int i_2674_) {
		i_2674_ = i_2674_ * (i & 0x7f) >> 7;
		if (i_2674_ < 2)
			i_2674_ = 2;
		else if (i_2674_ > 126)
			i_2674_ = 126;
		return (i & 0xff80) + i_2674_;
	}

	static final int method9563(int i, int i_2675_) {
		i_2675_ = i_2675_ * (i & 0x7f) >> 7;
		if (i_2675_ < 2)
			i_2675_ = 2;
		else if (i_2675_ > 126)
			i_2675_ = 126;
		return (i & 0xff80) + i_2675_;
	}
}
