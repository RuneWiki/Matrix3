package game;

/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class106 {
	protected int anInt1387;
	public static final int anInt1388 = 1;
	public static final int anInt1389 = 2;
	public static final int anInt1390 = 3;
	static final int anInt1391 = 4;
	protected static final int anInt1392 = 2;
	static boolean[] aBoolArray1393 = new boolean[8];
	public static final int anInt1394 = 5;
	int anInt1395 = 294201609;
	public MapSize aClass94_1396;
	public Interface35 anInterface35_1397;
	public Interface36 anInterface36_1398;
	protected static final int anInt1399 = 8;
	public static final int anInt1400 = 1;
	public static final int anInt1401 = 2;
	public int anInt1402;
	protected static final int anInt1403 = 1;
	protected static final int anInt1404 = 4;
	protected static final int anInt1405 = 32;
	protected static final int anInt1406 = 16;
	public static final int anInt1407 = 0;
	public Interface5 anInterface5_1408;
	Class104_Sub1[] aClass104_Sub1Array1409;
	protected Class104 aClass104_1410;
	protected int anInt1411;
	protected Hashtable aHashtable1412 = new Hashtable();
	public static final int anInt1413 = 0;
	protected int anInt1414;
	protected int anInt1415;
	public int anInt1416;
	public int anInt1417;
	static final int anInt1418 = 8;
	protected Class104_Sub2 aClass104_Sub2_1419;
	public float aFloat1420;

	public void method1660() {
		/* empty */
	}

	public final void method1661(Class104_Sub1 class104_sub1, int i) {
		if (67160775 * ((Class106) this).anInt1395 >= 3)
			throw new RuntimeException();
		if (((Class106) this).anInt1395 * 67160775 >= 0)
			((Class106) this).aClass104_Sub1Array1409[((Class106) this).anInt1395 * 67160775].method1649();
		else
			aClass104_Sub2_1419.method1649();
		aClass104_1410 = ((Class106) this).aClass104_Sub1Array1409[(((Class106) this).anInt1395 += -294201609) * 67160775] = class104_sub1;
		class104_sub1.method126();
	}

	public abstract Class165 method1662();

	public abstract void method1663(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	abstract void method1664(int i, int i_5_) throws Exception_Sub1;

	public abstract void method1665(int i, Class86 class86);

	public void method1666(int i) {
		aBoolArray1393[anInt1416 * 1862175997] = false;
		Enumeration enumeration = aHashtable1412.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
		}
		method1667();
	}

	abstract void method1667();

	public abstract void method1668(int i);

	public abstract int method1669();

	public abstract void method1670(int i, int i_6_, float f, int i_7_, int i_8_, float f_9_, int i_10_, int i_11_, float f_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	public abstract boolean method1671();

	public abstract boolean method1672();

	public abstract boolean method1673();

	public abstract boolean method1674();

	public abstract boolean method1675();

	public abstract boolean method1676();

	public abstract boolean method1677();

	abstract void method1678(int i, int i_17_, int i_18_, int i_19_, int i_20_);

	public abstract boolean method1679();

	public abstract boolean method1680();

	public abstract String method1681();

	public void method1682(int[] is) {
		if (null != aClass104_Sub2_1419) {
			is[0] = aClass104_Sub2_1419.method1648();
			is[1] = aClass104_Sub2_1419.method1646();
		} else {
			int[] is_21_ = is;
			is[1] = 0;
			is_21_[0] = 0;
		}
	}

	public final Class104 method1683(int i) {
		return aClass104_1410;
	}

	public final Class104_Sub2 method1684(int i) {
		return aClass104_Sub2_1419;
	}

	public final void method1685(Canvas canvas, int i, int i_22_, int i_23_) {
		if (!aHashtable1412.containsKey(canvas)) {
			Class213.method3073(canvas, (byte) -16);
			method1841(canvas, method1692(canvas, i, i_22_), -1553537871);
		}
	}

	public abstract void method1686(int i, float f, float f_24_, float f_25_, float f_26_, float f_27_);

	public abstract void method1687(boolean bool);

	public final void method1688(Canvas canvas, byte i) {
		Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
		if (class104_sub2 == null)
			throw new RuntimeException();
		if (67160775 * ((Class106) this).anInt1395 > 0 || aClass104_Sub2_1419 != aClass104_1410)
			throw new RuntimeException();
		if (null != aClass104_1410)
			aClass104_1410.method1649();
		if (67160775 * ((Class106) this).anInt1395 < 0)
			aClass104_1410 = class104_sub2;
		aClass104_Sub2_1419 = class104_sub2;
		class104_sub2.method126();
	}

	public final void method1689(Canvas canvas, int i, int i_28_, int i_29_) {
		Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
		if (null == class104_sub2)
			throw new RuntimeException("");
		class104_sub2.method9925(i, i_28_);
	}

	public abstract void method1690(Class96 class96, float f, Class96 class96_30_, float f_31_, Class96 class96_32_, float f_33_);

	public abstract boolean method1691();

	abstract Class104_Sub2 method1692(Canvas canvas, int i, int i_34_);

	public abstract Class104_Sub1 method1693();

	public abstract Interface11 method1694(int i, int i_35_);

	public abstract Model method1695(Class159 class159, int i, int i_36_, int i_37_, int i_38_);

	public abstract int[] method1696(int i, int i_39_, int i_40_, int i_41_);

	public abstract Class161 method1697(int[] is, int i, int i_42_, int i_43_, int i_44_, boolean bool);

	public abstract boolean method1698();

	public abstract boolean method1699();

	public abstract void method1700(int i, int i_45_);

	public abstract boolean method1701();

	public abstract void method1702(float f, float f_46_, float f_47_, float f_48_, float f_49_);

	public abstract void method1703();

	public abstract void method1704(int i, int i_50_, int i_51_);

	public abstract long method1705(int i, int i_52_);

	public abstract void method1706(long l);

	public abstract void method1707(int i, int i_53_, int[] is, int[] is_54_);

	void method1708(int i, int i_55_, int i_56_) {
		anInt1414 = i * -426793485;
		anInt1415 = i_55_ * 933581925;
		float f = ((float) aClass104_1410.method1648() / (float) aClass104_1410.method1646());
		float f_57_ = ((float) (anInt1414 * -2072806597) / (float) (anInt1415 * -1374470803));
		if (f < f_57_) {
			anInt1411 = -1155122617 * (int) ((float) (-1374470803 * anInt1415) * f);
			anInt1387 = anInt1415 * 498055805;
		} else {
			anInt1411 = 1236568925 * anInt1414;
			anInt1387 = (int) ((float) (anInt1414 * -2072806597) / f) * 1830197073;
		}
		aFloat1420 = ((float) (826888055 * anInt1411) / (float) aClass104_1410.method1648());
		anInt1402 = 335392659 * ((anInt1414 * -2072806597 - 826888055 * anInt1411) / 2);
		anInt1417 = -1651859281 * ((anInt1415 * -1374470803 - anInt1387 * 46469553) / 2);
	}

	public abstract void method1709(float f);

	public abstract void method1710(boolean bool);

	public abstract Class161 method1711(Class87 class87, boolean bool);

	public abstract void method1712(int[] is);

	public abstract void method1713(float f, float f_58_);

	public abstract void method1714();

	public abstract void method1715(int i, int i_59_, int i_60_, int i_61_);

	public abstract void method1716(int i, int i_62_, int i_63_, int i_64_);

	public void method1717(boolean bool) {
		/* empty */
	}

	public abstract void method1718(int[] is);

	public abstract void method1719(int i, int i_65_);

	public final void method1720(int i, int i_66_, int i_67_, int i_68_, int i_69_, byte i_70_) {
		method1725(i, i_66_, i_67_, i_68_, i_69_, 1);
	}

	abstract void method1721(int i, int i_71_, int i_72_, int i_73_, int i_74_);

	public final void method1722(int i, int i_75_, int i_76_, int i_77_, byte i_78_) {
		method1728(i, i_75_, i_76_, i_77_, 1);
	}

	public boolean method1723(int i) {
		return true;
	}

	public abstract void method1724(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_);

	public abstract void method1725(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_);

	public abstract void method1726(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_);

	abstract void method1727(int i, int i_95_, int i_96_, int i_97_, int i_98_);

	abstract void method1728(int i, int i_99_, int i_100_, int i_101_, int i_102_);

	public abstract Class103 method1729(Class103 class103, Class103 class103_103_, float f, Class103 class103_104_);

	public abstract void method1730(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_);

	public abstract void method1731(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, Class167 class167, int i_115_, int i_116_);

	public abstract void method1732(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_);

	abstract void method1733(int i, int i_125_) throws Exception_Sub1;

	public abstract boolean method1734();

	public abstract void method1735(int i, int i_126_, int i_127_, int i_128_);

	public boolean method1736(int i, int i_129_, Class261 class261, Class326 class326, int i_130_) {
		return method1737(i, i_129_, 0, 0, class261, class326);
	}

	abstract boolean method1737(int i, int i_131_, int i_132_, int i_133_, Class261 class261, Class326 class326);

	public abstract void method1738(Class261 class261, Class90 class90, Class326 class326);

	public abstract Class572_Sub35 method1739(int i);

	public abstract void method1740(Class572_Sub35 class572_sub35);

	public abstract void method1741(float f, float f_134_);

	public abstract boolean method1742();

	abstract void method1743(int i, int i_135_) throws Exception_Sub1;

	public Class161 method1744(int[] is, int i, int i_136_, int i_137_, int i_138_, int i_139_) {
		return method1960(is, i, i_136_, i_137_, i_138_, true);
	}

	public abstract void method1745(float f);

	public abstract boolean method1746();

	public void method1747() {
		/* empty */
	}

	public void method1748() {
		/* empty */
	}

	public abstract Class167 method1749(int i, int i_140_, int[] is, int[] is_141_);

	public abstract Interface11 method1750(int i, int i_142_, int i_143_);

	public abstract Class102 method1751(Class284 class284, Class87[] class87s, boolean bool);

	public abstract Class250 method1752();

	public abstract Class261 method1753();

	public abstract void method1754(int i);

	public abstract Model method1755(Class159 class159, int i, int i_144_, int i_145_, int i_146_);

	public abstract int method1756(int i, int i_147_);

	public abstract void method1757(int i, Class86 class86);

	public abstract void method1758(float f);

	public abstract void method1759(Class96 class96, float f, Class96 class96_148_, float f_149_, Class96 class96_150_, float f_151_);

	public abstract void method1760(Class105 class105);

	public abstract void method1761(Class261 class261);

	public abstract Class261 method1762();

	public abstract void method1763(boolean bool);

	public abstract void method1764(Class250 class250);

	public abstract Class250 method1765();

	public abstract void method1766(Class261 class261);

	public abstract void method1767(int i, float f, float f_152_, float f_153_, float f_154_, float f_155_);

	abstract void method1768(int i, int i_156_, int i_157_, int i_158_, int i_159_);

	public abstract boolean method1769();

	public abstract Class261 method1770();

	public abstract void method1771(int i, Class572_Sub36[] class572_sub36s);

	public abstract void method1772(int i, Class572_Sub36[] class572_sub36s);

	public abstract Class103 method1773(int i);

	public abstract void method1774(Class96 class96, float f, Class96 class96_160_, float f_161_, Class96 class96_162_, float f_163_);

	public abstract void method1775(Class103 class103);

	public final void method1776(int i, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		method1730(i, i_164_, i_165_, i_166_, i_167_, 1);
	}

	public abstract void method1777(int i, int i_169_);

	public abstract boolean method1778();

	public abstract boolean method1779();

	public abstract int[] method1780(int i, int i_170_, int i_171_, int i_172_);

	public abstract Interface11 method1781(int i, int i_173_, int i_174_);

	public abstract boolean method1782();

	public abstract void method1783(int i);

	public abstract void method1784(int i, int i_175_, int i_176_, int i_177_);

	public abstract void method1785();

	public abstract boolean method1786();

	public void method1787(float f, float f_178_, float f_179_, int i) {
		method1835(f, f_178_, f_179_, 0.0F, 1.0F, 1.0F);
	}

	public abstract void method1788();

	public abstract void method1789(int i, Class86 class86);

	public abstract void method1790(int i, Class86 class86);

	public abstract void method1791();

	public abstract void method1792(float f, float f_180_, float f_181_, float[] fs);

	public abstract void method1793();

	public int[] method1794(int i, int i_182_, int i_183_, int i_184_, int[] is, int i_185_, int i_186_, int i_187_) {
		int[] is_188_ = new int[i_184_ * i_183_];
		if (i_186_ == 0)
			i_186_ = i;
		for (int i_189_ = 0; i_189_ < i_184_; i_189_++) {
			if (i_189_ < i_182_) {
				int i_190_ = i_186_ * i_189_ + i_185_;
				for (int i_191_ = 0; i_191_ < i; i_191_++)
					is_188_[i_189_ * i_183_ + i_191_] = is[i_191_ + i_190_];
				int i_192_ = is[i - 1 + i_190_];
				for (int i_193_ = i; i_193_ < i_183_; i_193_++)
					is_188_[i_193_ + i_183_ * i_189_] = i_192_;
			} else {
				int i_194_ = i_183_ * (i_182_ - 1);
				for (int i_195_ = 0; i_195_ < i_183_; i_195_++)
					is_188_[i_183_ * i_189_ + i_195_] = is_188_[i_194_ + i_195_];
			}
		}
		return is_188_;
	}

	public float[] method1795(int i, int i_196_, int i_197_, int i_198_, float[] fs, int i_199_, int i_200_, int i_201_, int i_202_) {
		float[] fs_203_ = new float[i_201_ * (i_197_ * i_198_)];
		if (0 == i_200_)
			i_200_ = i_201_ * i;
		for (int i_204_ = 0; i_204_ < i_198_; i_204_++) {
			if (i_204_ < i_196_) {
				int i_205_ = i_199_ + i_200_ * i_204_;
				for (int i_206_ = 0; i_206_ < i; i_206_++) {
					for (int i_207_ = 0; i_207_ < i_201_; i_207_++)
						fs_203_[i_207_ + (i_201_ * i_206_ + i_201_ * (i_204_ * i_197_))] = fs[i_205_ + i_206_ * i_201_ + i_207_];
				}
				float[] fs_208_ = new float[i_201_];
				for (int i_209_ = 0; i_209_ < i_201_; i_209_++)
					fs_208_[i_209_] = fs[(i - 1) * i_201_ + i_205_ + i_209_];
				for (int i_210_ = i; i_210_ < i_197_; i_210_++) {
					for (int i_211_ = 0; i_211_ < i_201_; i_211_++)
						fs_203_[i_211_ + (i_210_ * i_201_ + i_197_ * i_204_ * i_201_)] = fs_208_[i_211_];
				}
			} else {
				int i_212_ = i_201_ * (i_197_ * (i_196_ - 1));
				for (int i_213_ = 0; i_213_ < i_197_; i_213_++) {
					for (int i_214_ = 0; i_214_ < i_201_; i_214_++)
						fs_203_[i_214_ + (i_213_ * i_201_ + i_197_ * i_204_ * i_201_)] = fs_203_[i_212_ + i_201_ * i_213_ + i_214_];
				}
			}
		}
		return fs_203_;
	}

	public byte[] method1796(int i, int i_215_, int i_216_, int i_217_, byte[] is, int i_218_, int i_219_, int i_220_, byte i_221_) {
		byte[] is_222_ = new byte[i_220_ * (i_216_ * i_217_)];
		if (0 == i_219_)
			i_219_ = i * i_220_;
		for (int i_223_ = 0; i_223_ < i_217_; i_223_++) {
			if (i_223_ < i_215_) {
				int i_224_ = i_218_ + i_219_ * i_223_;
				for (int i_225_ = 0; i_225_ < i; i_225_++) {
					for (int i_226_ = 0; i_226_ < i_220_; i_226_++)
						is_222_[i_226_ + (i_220_ * (i_216_ * i_223_) + i_220_ * i_225_)] = is[i_224_ + i_225_ * i_220_ + i_226_];
				}
				byte[] is_227_ = new byte[i_220_];
				for (int i_228_ = 0; i_228_ < i_220_; i_228_++)
					is_227_[i_228_] = is[i_224_ + (i - 1) * i_220_ + i_228_];
				for (int i_229_ = i; i_229_ < i_216_; i_229_++) {
					for (int i_230_ = 0; i_230_ < i_220_; i_230_++)
						is_222_[i_230_ + (i_216_ * i_223_ * i_220_ + i_229_ * i_220_)] = is_227_[i_230_];
				}
			} else {
				int i_231_ = i_216_ * (i_215_ - 1) * i_220_;
				for (int i_232_ = 0; i_232_ < i_216_; i_232_++) {
					for (int i_233_ = 0; i_233_ < i_220_; i_233_++)
						is_222_[(i_220_ * (i_223_ * i_216_) + i_220_ * i_232_ + i_233_)] = is_222_[i_233_ + (i_220_ * i_232_ + i_231_)];
				}
			}
		}
		return is_222_;
	}

	public abstract int method1797(int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_);

	public abstract int method1798(int i, int i_239_);

	public abstract Class250 method1799();

	abstract void method1800(int i, int i_240_, int i_241_, int i_242_, int i_243_);

	public void method1801(boolean bool) {
		/* empty */
	}

	abstract void method1802();

	abstract void method1803();

	public abstract void method1804(int i, Class167 class167, int i_244_, int i_245_);

	public abstract void method1805(int i);

	public abstract void method1806(int i);

	public abstract boolean method1807();

	public abstract int method1808();

	public abstract boolean method1809();

	public abstract Interface11 method1810(int i, int i_246_);

	public abstract boolean method1811();

	public abstract boolean method1812();

	public abstract void method1813(int i, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_);

	public abstract boolean method1814();

	public abstract boolean method1815();

	public abstract boolean method1816();

	public abstract boolean method1817();

	public abstract boolean method1818();

	public abstract boolean method1819();

	public abstract boolean method1820();

	public abstract Class161 method1821(int i, int i_252_, int i_253_, int i_254_, boolean bool);

	public abstract boolean method1822();

	public abstract boolean method1823();

	public void method1824() {
		/* empty */
	}

	public abstract boolean method1825();

	public abstract boolean method1826();

	public abstract void method1827(int i, int i_255_, int i_256_);

	public Class161 method1828(int i, int i_257_, boolean bool, int i_258_) {
		return method1864(i, i_257_, bool, false);
	}

	public abstract String method1829();

	public abstract String method1830();

	public abstract Class261 method1831();

	public abstract void method1832(boolean bool);

	abstract Class104_Sub2 method1833(Canvas canvas, int i, int i_259_);

	public abstract int[] method1834(int i, int i_260_, int i_261_, int i_262_);

	abstract void method1835(float f, float f_263_, float f_264_, float f_265_, float f_266_, float f_267_);

	public abstract int[] method1836(int i, int i_268_, int i_269_, int i_270_);

	public abstract void method1837();

	public void method1838(int[] is) {
		if (null != aClass104_Sub2_1419) {
			is[0] = aClass104_Sub2_1419.method1648();
			is[1] = aClass104_Sub2_1419.method1646();
		} else {
			int[] is_271_ = is;
			is[1] = 0;
			is_271_[0] = 0;
		}
	}

	Class106(MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37) {
		((Class106) this).aClass104_Sub1Array1409 = new Class104_Sub1[4];
		anInt1387 = 0;
		aFloat1420 = 0.0F;
		aClass94_1396 = mapSize;
		anInterface5_1408 = interface5;
		anInterface35_1397 = interface35;
		anInterface36_1398 = interface36;
		int i = -1;
		for (int i_272_ = 0; i_272_ < 8; i_272_++) {
			if (!aBoolArray1393[i_272_]) {
				aBoolArray1393[i_272_] = true;
				i = i_272_;
				break;
			}
		}
		if (-1 == i)
			throw new IllegalStateException("");
		anInt1416 = i * 250015829;
	}

	public abstract boolean method1839();

	public abstract boolean method1840();

	final void method1841(Canvas canvas, Class104_Sub2 class104_sub2, int i) {
		if (null == class104_sub2)
			throw new RuntimeException("");
		aHashtable1412.put(canvas, class104_sub2);
	}

	public abstract Class261 method1842();

	public abstract boolean method1843();

	public abstract boolean method1844();

	public abstract void method1845();

	public abstract boolean method1846();

	public abstract int method1847();

	public abstract int method1848();

	public abstract int method1849();

	public abstract void method1850();

	public abstract void method1851(int i, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, Class167 class167, int i_278_, int i_279_);

	public abstract void method1852();

	public abstract long method1853(int i, int i_280_);

	public abstract long method1854(int i, int i_281_);

	public abstract void method1855(long l);

	public abstract void method1856(long l);

	public abstract void method1857(int i, int i_282_, int[] is, int[] is_283_);

	public abstract void method1858();

	public abstract void method1859();

	public abstract void method1860();

	public static boolean method1861(int i) {
		return i == 1 || 3 == i || 5 == i;
	}

	public abstract Class261 method1862();

	public abstract boolean method1863();

	public abstract Class161 method1864(int i, int i_284_, boolean bool, boolean bool_285_);

	public abstract void method1865();

	public abstract void method1866();

	public abstract void method1867();

	public final void method1868(int i, int i_286_, int i_287_, int i_288_, int i_289_) {
		method1678(i, i_286_, i_287_, i_288_, 1);
	}

	public abstract void method1869(int[] is);

	public abstract void method1870(int i, int i_290_, int i_291_, int i_292_);

	public abstract void method1871(float f, float f_293_);

	public abstract void method1872(boolean bool);

	public abstract void method1873(int i, int i_294_, int i_295_, int i_296_);

	public abstract void method1874(int i, int i_297_);

	public abstract void method1875(int i, int i_298_, int i_299_, int i_300_, int i_301_, int i_302_);

	public abstract void method1876(int i, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_);

	public abstract void method1877(float f, float f_308_, float f_309_, float[] fs);

	public abstract void method1878(int i, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_);

	public abstract void method1879(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_);

	public abstract void method1880();

	abstract void method1881(int i, int i_320_, int i_321_, int i_322_, int i_323_);

	abstract void method1882(int i, int i_324_, int i_325_, int i_326_, int i_327_);

	abstract void method1883(int i, int i_328_, int i_329_, int i_330_, int i_331_);

	public final void method1884(Class104_Sub1 class104_sub1, int i) {
		if (67160775 * ((Class106) this).anInt1395 < 0 || class104_sub1 != (((Class106) this).aClass104_Sub1Array1409[((Class106) this).anInt1395 * 67160775]))
			throw new RuntimeException();
		((Class106) this).aClass104_Sub1Array1409[(((Class106) this).anInt1395 -= -294201609) * 67160775 + 1] = null;
		class104_sub1.method1649();
		if (67160775 * ((Class106) this).anInt1395 >= 0) {
			aClass104_1410 = (((Class106) this).aClass104_Sub1Array1409[67160775 * ((Class106) this).anInt1395]);
			((Class106) this).aClass104_Sub1Array1409[67160775 * ((Class106) this).anInt1395].method126();
		} else {
			aClass104_1410 = aClass104_Sub2_1419;
			aClass104_Sub2_1419.method126();
		}
	}

	public abstract void method1885(int i);

	public abstract void method1886(int i, float f, float f_332_, float f_333_, float f_334_, float f_335_);

	public abstract void method1887(int i, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_);

	static synchronized Class106 method1888(int i, Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, int i_341_, int i_342_, int i_343_, int i_344_) {
		if (i == 0)
			return Entity.method10574(canvas, mapSize, interface5, interface35, interface36, interface37, i_342_, i_343_, (short) -23103);
		if (1 == i)
			return Class172.method2709(canvas, mapSize, interface5, interface35, interface36, interface37, i_341_);
		if (i == 5)
			return Class608.method7256(canvas, mapSize, interface5, interface35, interface36, interface37, class248, i_341_);
		if (i == 3)
			return Class322.method4116(canvas, mapSize, interface5, interface35, interface36, interface37, class248, i_341_);
		throw new IllegalArgumentException("");
	}

	public abstract void method1889(int i, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_, int i_352_);

	public abstract void method1890(int i, int i_353_, int i_354_, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_);

	public abstract void method1891(int i, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_);

	public abstract void method1892(int i, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, int i_376_);

	public abstract void method1893(int i, Class167 class167, int i_377_, int i_378_);

	public abstract void method1894(int i, int i_379_, int i_380_, int i_381_, int i_382_, int i_383_, Class167 class167, int i_384_, int i_385_);

	public abstract void method1895(int i, int i_386_, int i_387_, int i_388_, int i_389_, int i_390_, Class167 class167, int i_391_, int i_392_);

	public abstract void method1896(int i, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_, Class167 class167, int i_398_, int i_399_, int i_400_, int i_401_, int i_402_);

	public abstract void method1897(int i, int i_403_, int i_404_, int i_405_, int i_406_, int i_407_, Class167 class167, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_);

	public abstract void method1898(int i, int i_413_, int i_414_, int i_415_, int i_416_, int i_417_, Class167 class167, int i_418_, int i_419_, int i_420_, int i_421_, int i_422_);

	public abstract void method1899(int i, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_, Class167 class167, int i_428_, int i_429_, int i_430_, int i_431_, int i_432_);

	public abstract Class103 method1900(Class103 class103, Class103 class103_433_, float f, Class103 class103_434_);

	public abstract void method1901(Class103 class103);

	public abstract int method1902(int i, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_);

	public abstract boolean method1903();

	public abstract int method1904(int i, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_);

	abstract boolean method1905(int i, int i_445_, int i_446_, int i_447_, Class261 class261, Class326 class326);

	abstract boolean method1906(int i, int i_448_, int i_449_, int i_450_, Class261 class261, Class326 class326);

	abstract boolean method1907(int i, int i_451_, int i_452_, int i_453_, Class261 class261, Class326 class326);

	public abstract void method1908(int i);

	public abstract Class174 method1909(int i, int i_454_, int[][] is, int[][] is_455_, int i_456_, int i_457_, int i_458_);

	public abstract void method1910(Class105 class105);

	public abstract void method1911(Class572_Sub35 class572_sub35);

	public abstract Class161 method1912(int i, int i_459_, boolean bool, boolean bool_460_);

	public abstract Class161 method1913(int i, int i_461_, boolean bool, boolean bool_462_);

	public abstract Class161 method1914(Class87 class87, boolean bool);

	public abstract Class161 method1915(Class87 class87, boolean bool);

	public abstract Class161 method1916(int i, int i_463_, int i_464_, int i_465_, boolean bool);

	public abstract Class161 method1917(int i, int i_466_, int i_467_, int i_468_, boolean bool);

	public abstract Class167 method1918(int i, int i_469_, int[] is, int[] is_470_);

	public abstract void method1919(int i, int i_471_, int i_472_, int i_473_, int i_474_, int i_475_, int i_476_);

	public abstract void method1920(int i, Class167 class167, int i_477_, int i_478_);

	public abstract boolean method1921();

	public abstract Class102 method1922(Class284 class284, Class87[] class87s, boolean bool);

	public abstract Class102 method1923(Class284 class284, Class87[] class87s, boolean bool);

	public abstract void method1924(boolean bool);

	public abstract Model method1925(Class159 class159, int i, int i_479_, int i_480_, int i_481_);

	public abstract Model method1926(Class159 class159, int i, int i_482_, int i_483_, int i_484_);

	public abstract Class96 method1927(int[] is);

	public abstract int method1928(int i, int i_485_);

	public abstract int method1929(int i, int i_486_);

	public abstract Class174 method1930(int i, int i_487_, int[][] is, int[][] is_488_, int i_489_, int i_490_, int i_491_);

	public abstract Class174 method1931(int i, int i_492_, int[][] is, int[][] is_493_, int i_494_, int i_495_, int i_496_);

	public abstract Class250 method1932();

	public abstract Class250 method1933();

	public abstract Class250 method1934();

	public abstract Class250 method1935();

	public abstract Class261 method1936();

	public abstract Class261 method1937();

	public abstract int method1938();

	public Class572_Sub36 method1939(int i, int i_497_, int i_498_, int i_499_, int i_500_, float f) {
		return new Class572_Sub36(i, i_497_, i_498_, i_499_, i_500_, f);
	}

	public Class572_Sub36 method1940(int i, int i_501_, int i_502_, int i_503_, int i_504_, float f) {
		return new Class572_Sub36(i, i_501_, i_502_, i_503_, i_504_, f);
	}

	public abstract boolean method1941();

	public abstract void method1942(int i, Class572_Sub36[] class572_sub36s);

	public abstract void method1943(int i, int i_505_, int i_506_, int i_507_, int i_508_, int i_509_, Class167 class167, int i_510_, int i_511_, int i_512_, int i_513_, int i_514_);

	public abstract void method1944(Class105 class105);

	public abstract void method1945(Class105 class105);

	public abstract void method1946(int[] is);

	public abstract void method1947(int i);

	public abstract Class261 method1948();

	public abstract Class572_Sub35 method1949(int i);

	public abstract void method1950(int i, int i_515_, int i_516_, int i_517_, int i_518_, int i_519_, int i_520_);

	public abstract Class96 method1951(int[] is);

	public abstract Class572_Sub35 method1952(int i);

	public abstract void method1953(Class250 class250);

	public abstract void method1954(Class250 class250);

	public abstract void method1955(Class250 class250);

	public abstract Class103 method1956(Class103 class103, Class103 class103_521_, float f, Class103 class103_522_);

	public abstract Class161 method1957(int[] is, int i, int i_523_, int i_524_, int i_525_, boolean bool);

	public final void method1958(Canvas canvas, int i) {
		if (aHashtable1412.containsKey(canvas)) {
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
			aHashtable1412.remove(canvas);
		}
	}

	public abstract void method1959(int i, float f, float f_526_, float f_527_, float f_528_, float f_529_);

	public abstract Class161 method1960(int[] is, int i, int i_530_, int i_531_, int i_532_, boolean bool);

	public abstract void method1961(int i, int i_533_, int i_534_);

	public abstract Class103 method1962(int i);

	public abstract Class103 method1963(int i);

	public abstract String method1964();

	public void method1965(int[] is) {
		if (null != aClass104_Sub2_1419) {
			is[0] = aClass104_Sub2_1419.method1648();
			is[1] = aClass104_Sub2_1419.method1646();
		} else {
			int[] is_535_ = is;
			is[1] = 0;
			is_535_[0] = 0;
		}
	}

	public final void method1966(int i) throws Exception_Sub1 {
		method1664(0, 0);
	}

	public final void method1967(int i, int i_536_, int i_537_, int i_538_, int i_539_) {
		method1727(i, i_536_, i_537_, i_538_, 1);
	}

	public abstract void method1968(Class103 class103);

	public abstract void method1969(int i, int i_540_, int i_541_, int i_542_);

	public abstract void method1970(int i, int i_543_);

	public abstract void method1971(int i, int i_544_);

	public abstract boolean method1972();

	public abstract boolean method1973();

	public abstract boolean method1974();

	public abstract void method1975();

	public abstract void method1976(float f, float f_545_, float f_546_, float f_547_, float f_548_);

	public abstract boolean method1977();

	public abstract void method1978(float f, float f_549_, float f_550_, float f_551_, float f_552_);

	public abstract void method1979(int i, int i_553_, int i_554_, int i_555_, int i_556_, int i_557_);

	public abstract boolean method1980();

	public abstract void method1981(float f, float f_558_, float f_559_, float f_560_, float f_561_);

	public final void method1982(int i, int i_562_, int i_563_, int i_564_, int i_565_, byte i_566_) {
		method1724(i, i_562_, i_563_, i_564_, i_565_, 1);
	}

	public abstract void method1983(Class261 class261, Class90 class90, Class326 class326);

	public abstract void method1984();

	public abstract void method1985(boolean bool);

	public abstract boolean method1986();

	public abstract boolean method1987();

	abstract void method1988(float f, float f_567_, float f_568_, float f_569_, float f_570_, float f_571_);

	public abstract void method1989(int i, Class86 class86);

	public abstract boolean method1990();

	public abstract void method1991(int i, int i_572_, int i_573_);

	public abstract void method1992(int i, Class86 class86);

	public abstract boolean method1993();

	public abstract void method1994(int i, int i_574_, float f, int i_575_, int i_576_, float f_577_, int i_578_, int i_579_, float f_580_, int i_581_, int i_582_, int i_583_, int i_584_);

	public abstract void method1995(int i, int i_585_, float f, int i_586_, int i_587_, float f_588_, int i_589_, int i_590_, float f_591_, int i_592_, int i_593_, int i_594_, int i_595_);

	public abstract boolean method1996();

	public abstract void method1997(float f, float f_596_, float f_597_, float[] fs);

	public abstract void method1998(float f, float f_598_, float f_599_, float[] fs);

	public abstract void method1999(float f, float f_600_, float f_601_, float[] fs);

	public abstract Interface6 method2000(int i, int i_602_, Class171 class171, Class88 class88, int i_603_);

	public abstract Interface11 method2001(int i, int i_604_);

	public abstract void method2002(Class261 class261, Class90 class90, Class326 class326);

	public abstract void method2003();

	public abstract void method2004(int i, int i_605_, int i_606_, int i_607_);

	public abstract Class161 method2005(int[] is, int i, int i_608_, int i_609_, int i_610_, boolean bool);

	public abstract boolean method2006();

	public abstract Class250 method2007();

	public void finalize() {
		method1666(-1290965770);
	}

	public abstract void method2008();

	public abstract void method2009(Class261 class261);

	public abstract void method2010();

	public abstract Class165 method2011();

	public abstract void method2012(int i, int i_611_, int i_612_, int i_613_);

	abstract void method2013(int i, int i_614_, int i_615_, int i_616_, int i_617_);

	public abstract void method2014(int i, int i_618_, int i_619_, int i_620_);

	public abstract int method2015();

	public abstract boolean method2016();

	public abstract void method2017();

	public abstract void method2018();

	public abstract void method2019(Class96 class96, float f, Class96 class96_621_, float f_622_, Class96 class96_623_, float f_624_);

	public abstract void method2020();

	public abstract Interface6 method2021(int i, int i_625_, Class171 class171, Class88 class88, int i_626_);

	public abstract boolean method2022();

	void method2023() {
		method1666(-2143926737);
	}

	public abstract void method2024(int i, int i_627_, int i_628_, int i_629_);

	public abstract Class103 method2025(int i);

	public static boolean method2026(int i) {
		return i == 1 || 3 == i || 5 == i;
	}

	public static boolean method2027(int i) {
		return i == 0 || i == 2;
	}

	public static boolean method2028(int i) {
		return i == 0 || i == 2;
	}

	public abstract void method2029(int i, Class167 class167, int i_630_, int i_631_);

	public void method2030() {
		aBoolArray1393[anInt1416 * 1862175997] = false;
		Enumeration enumeration = aHashtable1412.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
		}
		method1667();
	}

	public void method2031() {
		aBoolArray1393[anInt1416 * 1862175997] = false;
		Enumeration enumeration = aHashtable1412.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
		}
		method1667();
	}

	public void method2032() {
		aBoolArray1393[anInt1416 * 1862175997] = false;
		Enumeration enumeration = aHashtable1412.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
		}
		method1667();
	}

	public void method2033() {
		aBoolArray1393[anInt1416 * 1862175997] = false;
		Enumeration enumeration = aHashtable1412.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class104_Sub2 class104_sub2 = (Class104_Sub2) aHashtable1412.get(canvas);
			class104_sub2.method39();
		}
		method1667();
	}

	public Class572_Sub36 method2034(int i, int i_632_, int i_633_, int i_634_, int i_635_, float f) {
		return new Class572_Sub36(i, i_632_, i_633_, i_634_, i_635_, f);
	}

	public abstract void method2035(float f, float f_636_, float f_637_, float[] fs);

	public abstract void method2036();

	public abstract void method2037(boolean bool);

	public abstract Class261 method2038();

	public abstract Interface6 method2039(int i, int i_638_, Class171 class171, Class88 class88, int i_639_);

	public abstract Class104_Sub1 method2040();

	public void method2041(boolean bool) {
		/* empty */
	}

	public abstract boolean method2042();

	public abstract int method2043();

	public abstract void method2044();

	public abstract int method2045();

	public abstract void method2046(float f, float f_640_, float f_641_, float[] fs);

	public abstract boolean method2047();

	public abstract int method2048(int i, int i_642_, int i_643_, int i_644_, int i_645_, int i_646_);

	public void method2049() {
		/* empty */
	}

	public void method2050() {
		/* empty */
	}

	public Class572_Sub36 method2051(int i, int i_647_, int i_648_, int i_649_, int i_650_, float f) {
		return new Class572_Sub36(i, i_647_, i_648_, i_649_, i_650_, f);
	}

	public abstract void method2052(Class261 class261, Class90 class90, Class326 class326);

	public static void method2053(int i, int i_651_) {
		Class88.method1343(i, -1902292676);
	}

	static final void method2054(Cs2Executor class441, int i) {
		int i_652_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_652_, (short) 11118);
		Class83 class83 = Class534.aClass83Array5975[i_652_ >> 16];
		Class217.method3082(class73, class83, class441, -1082187320);
	}

	static final void method2055(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_653_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class240 class240 = Class240.method3316((float) i_653_, (float) i_653_, (float) i_653_);
		Class133_Sub1.aClass411_Sub1_9827.method4979(class240, (byte) 22);
		class240.method3261();
	}

	static boolean method2056(Interface57 interface57, Class572_Sub13 class572_sub13, byte i) {
		return (null != interface57 && interface57.method320(class572_sub13, client.anInterface64Array8610, client.anInt8609 * 2134888631, Class108.aClass549_1426, -1591470196));
	}
}
